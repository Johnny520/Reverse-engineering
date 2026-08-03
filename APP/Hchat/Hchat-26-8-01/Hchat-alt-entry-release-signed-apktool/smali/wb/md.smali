.class public final synthetic Lwb/md;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 26
    iput p10, p0, Lwb/md;->g:I

    iput-object p1, p0, Lwb/md;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/md;->i:Li0/a1;

    iput-object p3, p0, Lwb/md;->j:Li0/a1;

    iput-object p4, p0, Lwb/md;->k:Li0/a1;

    iput-object p5, p0, Lwb/md;->l:Li0/a1;

    iput-object p6, p0, Lwb/md;->m:Li0/a1;

    iput-object p7, p0, Lwb/md;->n:Li0/a1;

    iput-object p8, p0, Lwb/md;->o:Li0/a1;

    iput-object p9, p0, Lwb/md;->p:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lwb/md;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/md;->i:Li0/a1;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/md;->j:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/md;->k:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/md;->l:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/md;->m:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/md;->n:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/md;->o:Li0/a1;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/md;->h:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    iput-object p9, p0, Lwb/md;->p:Li0/a1;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/md;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v6, p1

    .line 9
    .line 10
    check-cast v6, Li0/h0;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v2, v1, 0x3

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    const/4 v10, 0x1

    .line 24
    const/4 v11, 0x0

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    move v2, v10

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v11

    .line 30
    :goto_0
    and-int/2addr v1, v10

    .line 31
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_14

    .line 36
    .line 37
    iget-object v1, v0, Lwb/md;->i:Li0/a1;

    .line 38
    .line 39
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-ne v2, v10, :cond_1

    .line 50
    .line 51
    const-string v2, "\u5728\u8303\u56f4\u5185\u968f\u673a\u7b49\u5f85"

    .line 52
    .line 53
    :goto_1
    move-object v3, v2

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    const-string v2, "\u6bcf\u6761\u7b49\u5f85\u56fa\u5b9a\u65f6\u95f4"

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :goto_2
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v4, Lsf/e;

    .line 63
    .line 64
    const-string v5, "\u56fa\u5b9a\u5ef6\u8fdf"

    .line 65
    .line 66
    invoke-direct {v4, v5, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v5, Lsf/e;

    .line 74
    .line 75
    const-string v7, "\u968f\u673a\u5ef6\u8fdf"

    .line 76
    .line 77
    invoke-direct {v5, v7, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    filled-new-array {v4, v5}, [Lsf/e;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v2}, Lwb/ho;->w6([Lsf/e;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    iget-object v12, v0, Lwb/md;->h:Landroid/content/SharedPreferences;

    .line 99
    .line 100
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    sget-object v13, Li0/l;->a:Li0/e;

    .line 109
    .line 110
    if-nez v2, :cond_2

    .line 111
    .line 112
    if-ne v7, v13, :cond_3

    .line 113
    .line 114
    :cond_2
    new-instance v7, Lwb/di;

    .line 115
    .line 116
    const/16 v2, 0x14

    .line 117
    .line 118
    invoke-direct {v7, v12, v1, v2}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    check-cast v7, Lfg/l;

    .line 125
    .line 126
    move-object v8, v6

    .line 127
    move-object v6, v7

    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v9, 0x6

    .line 130
    const-string v2, "\u8bc4\u8bba\u5ef6\u8fdf"

    .line 131
    .line 132
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 133
    .line 134
    .line 135
    move-object v6, v8

    .line 136
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    const/4 v14, 0x0

    .line 147
    if-nez v1, :cond_6

    .line 148
    .line 149
    const v1, -0x6bff19c8

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 153
    .line 154
    .line 155
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, Lwb/md;->j:Li0/a1;

    .line 159
    .line 160
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    move-object v4, v2

    .line 165
    check-cast v4, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    if-nez v2, :cond_4

    .line 176
    .line 177
    if-ne v3, v13, :cond_5

    .line 178
    .line 179
    :cond_4
    new-instance v3, Lwb/di;

    .line 180
    .line 181
    const/16 v2, 0x15

    .line 182
    .line 183
    invoke-direct {v3, v1, v12, v2}, Lwb/di;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :cond_5
    move-object v5, v3

    .line 190
    check-cast v5, Lfg/l;

    .line 191
    .line 192
    const/16 v7, 0x36

    .line 193
    .line 194
    const-string v2, "\u7b49\u5f85\u65f6\u95f4"

    .line 195
    .line 196
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u6700\u5c11 0 \u79d2"

    .line 197
    .line 198
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_6
    const v1, -0x6bf7cc18

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 209
    .line 210
    .line 211
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v0, Lwb/md;->k:Li0/a1;

    .line 215
    .line 216
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    move-object v4, v2

    .line 221
    check-cast v4, Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    if-nez v2, :cond_7

    .line 232
    .line 233
    if-ne v3, v13, :cond_8

    .line 234
    .line 235
    :cond_7
    new-instance v3, Lwb/di;

    .line 236
    .line 237
    const/16 v2, 0x16

    .line 238
    .line 239
    invoke-direct {v3, v1, v12, v2}, Lwb/di;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_8
    move-object v5, v3

    .line 246
    check-cast v5, Lfg/l;

    .line 247
    .line 248
    const/16 v7, 0x36

    .line 249
    .line 250
    const-string v2, "\u6700\u77ed\u7b49\u5f85"

    .line 251
    .line 252
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u6700\u5c11 0 \u79d2"

    .line 253
    .line 254
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 255
    .line 256
    .line 257
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 258
    .line 259
    .line 260
    iget-object v1, v0, Lwb/md;->l:Li0/a1;

    .line 261
    .line 262
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    move-object v4, v2

    .line 267
    check-cast v4, Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    if-nez v2, :cond_9

    .line 278
    .line 279
    if-ne v3, v13, :cond_a

    .line 280
    .line 281
    :cond_9
    new-instance v3, Lwb/di;

    .line 282
    .line 283
    const/16 v2, 0x17

    .line 284
    .line 285
    invoke-direct {v3, v1, v12, v2}, Lwb/di;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_a
    move-object v5, v3

    .line 292
    check-cast v5, Lfg/l;

    .line 293
    .line 294
    const/16 v7, 0x36

    .line 295
    .line 296
    const-string v2, "\u6700\u957f\u7b49\u5f85"

    .line 297
    .line 298
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u4e0d\u80fd\u5c0f\u4e8e\u6700\u77ed\u7b49\u5f85"

    .line 299
    .line 300
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 304
    .line 305
    .line 306
    :goto_3
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 307
    .line 308
    .line 309
    iget-object v1, v0, Lwb/md;->m:Li0/a1;

    .line 310
    .line 311
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    check-cast v2, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    if-nez v3, :cond_b

    .line 330
    .line 331
    if-ne v4, v13, :cond_c

    .line 332
    .line 333
    :cond_b
    new-instance v4, Lwb/di;

    .line 334
    .line 335
    const/16 v3, 0x18

    .line 336
    .line 337
    invoke-direct {v4, v12, v1, v3}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    :cond_c
    check-cast v4, Lfg/l;

    .line 344
    .line 345
    const/16 v8, 0x1b0

    .line 346
    .line 347
    const/16 v9, 0x8

    .line 348
    .line 349
    const-string v3, "\u9650\u5236\u8fd0\u884c\u65f6\u6bb5"

    .line 350
    .line 351
    move-object v5, v6

    .line 352
    move-object v6, v4

    .line 353
    const-string v4, "\u652f\u6301\u8de8\u96f6\u70b9\u65f6\u6bb5"

    .line 354
    .line 355
    move-object v7, v5

    .line 356
    const/4 v5, 0x0

    .line 357
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 358
    .line 359
    .line 360
    move-object v6, v7

    .line 361
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    check-cast v1, Ljava/lang/Boolean;

    .line 366
    .line 367
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-eqz v1, :cond_11

    .line 372
    .line 373
    const v1, -0x6be55fbc

    .line 374
    .line 375
    .line 376
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 377
    .line 378
    .line 379
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 380
    .line 381
    .line 382
    iget-object v1, v0, Lwb/md;->n:Li0/a1;

    .line 383
    .line 384
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    move-object v7, v2

    .line 389
    check-cast v7, Ljava/lang/String;

    .line 390
    .line 391
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    if-nez v2, :cond_d

    .line 400
    .line 401
    if-ne v3, v13, :cond_e

    .line 402
    .line 403
    :cond_d
    new-instance v3, Lwb/di;

    .line 404
    .line 405
    const/16 v2, 0x19

    .line 406
    .line 407
    invoke-direct {v3, v12, v1, v2}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    :cond_e
    move-object v4, v3

    .line 414
    check-cast v4, Lfg/l;

    .line 415
    .line 416
    const/4 v2, 0x6

    .line 417
    const/4 v3, 0x4

    .line 418
    move-object v5, v6

    .line 419
    const-string v6, "\u5f00\u59cb\u65f6\u95f4"

    .line 420
    .line 421
    const/4 v8, 0x0

    .line 422
    invoke-static/range {v2 .. v8}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 423
    .line 424
    .line 425
    move-object v6, v5

    .line 426
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 427
    .line 428
    .line 429
    iget-object v1, v0, Lwb/md;->o:Li0/a1;

    .line 430
    .line 431
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    move-object v7, v2

    .line 436
    check-cast v7, Ljava/lang/String;

    .line 437
    .line 438
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    if-nez v2, :cond_f

    .line 447
    .line 448
    if-ne v3, v13, :cond_10

    .line 449
    .line 450
    :cond_f
    new-instance v3, Lwb/di;

    .line 451
    .line 452
    const/16 v2, 0x1a

    .line 453
    .line 454
    invoke-direct {v3, v12, v1, v2}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    :cond_10
    move-object v4, v3

    .line 461
    check-cast v4, Lfg/l;

    .line 462
    .line 463
    const/4 v2, 0x6

    .line 464
    const/4 v3, 0x4

    .line 465
    move-object v5, v6

    .line 466
    const-string v6, "\u7ed3\u675f\u65f6\u95f4"

    .line 467
    .line 468
    const/4 v8, 0x0

    .line 469
    invoke-static/range {v2 .. v8}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 470
    .line 471
    .line 472
    move-object v6, v5

    .line 473
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 474
    .line 475
    .line 476
    goto :goto_4

    .line 477
    :cond_11
    const v1, -0x6bdc6a19

    .line 478
    .line 479
    .line 480
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 484
    .line 485
    .line 486
    :goto_4
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 487
    .line 488
    .line 489
    iget-object v1, v0, Lwb/md;->p:Li0/a1;

    .line 490
    .line 491
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    move-object v4, v2

    .line 496
    check-cast v4, Ljava/lang/String;

    .line 497
    .line 498
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    if-nez v2, :cond_12

    .line 507
    .line 508
    if-ne v3, v13, :cond_13

    .line 509
    .line 510
    :cond_12
    new-instance v3, Lwb/di;

    .line 511
    .line 512
    const/16 v2, 0x1b

    .line 513
    .line 514
    invoke-direct {v3, v1, v12, v2}, Lwb/di;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    :cond_13
    move-object v5, v3

    .line 521
    check-cast v5, Lfg/l;

    .line 522
    .line 523
    const/16 v7, 0x36

    .line 524
    .line 525
    const-string v2, "\u53d1\u5e03\u65f6\u95f4\u9650\u5236"

    .line 526
    .line 527
    const-string v3, "\u4ec5\u8bc4\u8bba\u53d1\u5e03\u540e\u6307\u5b9a\u5c0f\u65f6\u5185\u7684\u670b\u53cb\u5708\uff0c\u6700\u5c11 1 \u5c0f\u65f6"

    .line 528
    .line 529
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 530
    .line 531
    .line 532
    goto :goto_5

    .line 533
    :cond_14
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 534
    .line 535
    .line 536
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 537
    .line 538
    return-object v1

    .line 539
    :pswitch_0
    move-object/from16 v7, p1

    .line 540
    .line 541
    check-cast v7, Li0/h0;

    .line 542
    .line 543
    move-object/from16 v1, p2

    .line 544
    .line 545
    check-cast v1, Ljava/lang/Integer;

    .line 546
    .line 547
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    and-int/lit8 v2, v1, 0x3

    .line 552
    .line 553
    const/4 v3, 0x2

    .line 554
    const/4 v10, 0x0

    .line 555
    const/4 v11, 0x1

    .line 556
    if-eq v2, v3, :cond_15

    .line 557
    .line 558
    move v2, v11

    .line 559
    goto :goto_6

    .line 560
    :cond_15
    move v2, v10

    .line 561
    :goto_6
    and-int/2addr v1, v11

    .line 562
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eqz v1, :cond_24

    .line 567
    .line 568
    iget-object v1, v0, Lwb/md;->p:Li0/a1;

    .line 569
    .line 570
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    move-object v3, v1

    .line 575
    check-cast v3, Ljava/lang/String;

    .line 576
    .line 577
    const/4 v6, 0x6

    .line 578
    move-object v5, v7

    .line 579
    const/4 v7, 0x4

    .line 580
    const-string v2, "\u5f53\u524d\u542f\u7528"

    .line 581
    .line 582
    const/4 v4, 0x0

    .line 583
    invoke-static/range {v2 .. v7}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 584
    .line 585
    .line 586
    move-object v7, v5

    .line 587
    const/4 v1, 0x0

    .line 588
    invoke-static {v1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 589
    .line 590
    .line 591
    iget-object v2, v0, Lwb/md;->i:Li0/a1;

    .line 592
    .line 593
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    move-object v4, v3

    .line 598
    check-cast v4, Ljava/lang/String;

    .line 599
    .line 600
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    sget-object v12, Li0/l;->a:Li0/e;

    .line 609
    .line 610
    if-nez v3, :cond_16

    .line 611
    .line 612
    if-ne v5, v12, :cond_17

    .line 613
    .line 614
    :cond_16
    new-instance v5, Lwb/ni;

    .line 615
    .line 616
    const/16 v3, 0xb

    .line 617
    .line 618
    invoke-direct {v5, v2, v3}, Lwb/ni;-><init>(Li0/a1;I)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    :cond_17
    move-object v6, v5

    .line 625
    check-cast v6, Lfg/l;

    .line 626
    .line 627
    const/16 v8, 0x36

    .line 628
    .line 629
    const/16 v9, 0x8

    .line 630
    .line 631
    const-string v2, "\u914d\u7f6e\u540d\u79f0"

    .line 632
    .line 633
    const-string v3, "\u4f8b\u5982 DeepSeek \u4e3b\u8d26\u53f7"

    .line 634
    .line 635
    const/4 v5, 0x0

    .line 636
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 637
    .line 638
    .line 639
    invoke-static {v1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 640
    .line 641
    .line 642
    iget-object v2, v0, Lwb/md;->j:Li0/a1;

    .line 643
    .line 644
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    move-object v4, v3

    .line 649
    check-cast v4, Ljava/lang/String;

    .line 650
    .line 651
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v3

    .line 655
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v5

    .line 659
    if-nez v3, :cond_18

    .line 660
    .line 661
    if-ne v5, v12, :cond_19

    .line 662
    .line 663
    :cond_18
    new-instance v5, Lwb/ni;

    .line 664
    .line 665
    const/16 v3, 0xc

    .line 666
    .line 667
    invoke-direct {v5, v2, v3}, Lwb/ni;-><init>(Li0/a1;I)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    :cond_19
    move-object v6, v5

    .line 674
    check-cast v6, Lfg/l;

    .line 675
    .line 676
    const/16 v8, 0x36

    .line 677
    .line 678
    const/16 v9, 0x8

    .line 679
    .line 680
    const-string v2, "API Key"

    .line 681
    .line 682
    const-string v3, "OpenAI \u517c\u5bb9\u63a5\u53e3\u5bc6\u94a5"

    .line 683
    .line 684
    const/4 v5, 0x0

    .line 685
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 686
    .line 687
    .line 688
    invoke-static {v1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 689
    .line 690
    .line 691
    iget-object v2, v0, Lwb/md;->k:Li0/a1;

    .line 692
    .line 693
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    move-object v4, v3

    .line 698
    check-cast v4, Ljava/lang/String;

    .line 699
    .line 700
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v5

    .line 708
    if-nez v3, :cond_1a

    .line 709
    .line 710
    if-ne v5, v12, :cond_1b

    .line 711
    .line 712
    :cond_1a
    new-instance v5, Lwb/ni;

    .line 713
    .line 714
    const/16 v3, 0xd

    .line 715
    .line 716
    invoke-direct {v5, v2, v3}, Lwb/ni;-><init>(Li0/a1;I)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    :cond_1b
    move-object v6, v5

    .line 723
    check-cast v6, Lfg/l;

    .line 724
    .line 725
    const/16 v8, 0x36

    .line 726
    .line 727
    const/16 v9, 0x8

    .line 728
    .line 729
    const-string v2, "API \u5730\u5740"

    .line 730
    .line 731
    const-string v3, "\u4f8b\u5982 https://api.xxx.com/v1"

    .line 732
    .line 733
    const/4 v5, 0x0

    .line 734
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 735
    .line 736
    .line 737
    invoke-static {v1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 738
    .line 739
    .line 740
    iget-object v2, v0, Lwb/md;->l:Li0/a1;

    .line 741
    .line 742
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    move-object v4, v3

    .line 747
    check-cast v4, Ljava/lang/String;

    .line 748
    .line 749
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v3

    .line 753
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    if-nez v3, :cond_1c

    .line 758
    .line 759
    if-ne v5, v12, :cond_1d

    .line 760
    .line 761
    :cond_1c
    new-instance v5, Lwb/ni;

    .line 762
    .line 763
    const/16 v3, 0xe

    .line 764
    .line 765
    invoke-direct {v5, v2, v3}, Lwb/ni;-><init>(Li0/a1;I)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    :cond_1d
    move-object v6, v5

    .line 772
    check-cast v6, Lfg/l;

    .line 773
    .line 774
    const/16 v8, 0x36

    .line 775
    .line 776
    const/16 v9, 0x8

    .line 777
    .line 778
    const-string v2, "API \u8def\u5f84"

    .line 779
    .line 780
    const-string v3, "\u9ed8\u8ba4 /chat/completions"

    .line 781
    .line 782
    const/4 v5, 0x0

    .line 783
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 784
    .line 785
    .line 786
    invoke-static {v1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 787
    .line 788
    .line 789
    iget-object v2, v0, Lwb/md;->m:Li0/a1;

    .line 790
    .line 791
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v3

    .line 795
    move-object v4, v3

    .line 796
    check-cast v4, Ljava/lang/String;

    .line 797
    .line 798
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v3

    .line 802
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    if-nez v3, :cond_1e

    .line 807
    .line 808
    if-ne v5, v12, :cond_1f

    .line 809
    .line 810
    :cond_1e
    new-instance v5, Lwb/ni;

    .line 811
    .line 812
    const/16 v3, 0xf

    .line 813
    .line 814
    invoke-direct {v5, v2, v3}, Lwb/ni;-><init>(Li0/a1;I)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 818
    .line 819
    .line 820
    :cond_1f
    move-object v6, v5

    .line 821
    check-cast v6, Lfg/l;

    .line 822
    .line 823
    const/16 v8, 0x36

    .line 824
    .line 825
    const/16 v9, 0x8

    .line 826
    .line 827
    const-string v2, "\u6a21\u578b"

    .line 828
    .line 829
    const-string v3, "\u4f8b\u5982 deepseek-ai/DeepSeek-V3"

    .line 830
    .line 831
    const/4 v5, 0x0

    .line 832
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 833
    .line 834
    .line 835
    invoke-static {v1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 836
    .line 837
    .line 838
    iget-object v2, v0, Lwb/md;->n:Li0/a1;

    .line 839
    .line 840
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    move-object v4, v3

    .line 845
    check-cast v4, Ljava/lang/String;

    .line 846
    .line 847
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v3

    .line 851
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    if-nez v3, :cond_20

    .line 856
    .line 857
    if-ne v5, v12, :cond_21

    .line 858
    .line 859
    :cond_20
    new-instance v5, Lwb/ni;

    .line 860
    .line 861
    const/16 v3, 0x10

    .line 862
    .line 863
    invoke-direct {v5, v2, v3}, Lwb/ni;-><init>(Li0/a1;I)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    :cond_21
    move-object v6, v5

    .line 870
    check-cast v6, Lfg/l;

    .line 871
    .line 872
    const/16 v8, 0xc36

    .line 873
    .line 874
    const/4 v9, 0x0

    .line 875
    const-string v2, "\u7cfb\u7edf\u6307\u4ee4"

    .line 876
    .line 877
    const-string v3, "AI \u89d2\u8272\u8bbe\u5b9a\u548c\u56de\u590d\u8981\u6c42"

    .line 878
    .line 879
    const/4 v5, 0x4

    .line 880
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 881
    .line 882
    .line 883
    invoke-static {v1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 884
    .line 885
    .line 886
    iget-object v2, v0, Lwb/md;->o:Li0/a1;

    .line 887
    .line 888
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    move-object v4, v3

    .line 893
    check-cast v4, Ljava/lang/String;

    .line 894
    .line 895
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v5

    .line 903
    if-nez v3, :cond_22

    .line 904
    .line 905
    if-ne v5, v12, :cond_23

    .line 906
    .line 907
    :cond_22
    new-instance v5, Lwb/ni;

    .line 908
    .line 909
    const/16 v3, 0x11

    .line 910
    .line 911
    invoke-direct {v5, v2, v3}, Lwb/ni;-><init>(Li0/a1;I)V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    :cond_23
    check-cast v5, Lfg/l;

    .line 918
    .line 919
    move-object v6, v7

    .line 920
    const/16 v7, 0x36

    .line 921
    .line 922
    const-string v2, "\u4e0a\u4e0b\u6587\u8f6e\u6570"

    .line 923
    .line 924
    const-string v3, "0 \u8868\u793a\u4e0d\u4fdd\u7559\u4e0a\u4e0b\u6587"

    .line 925
    .line 926
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 927
    .line 928
    .line 929
    move-object v7, v6

    .line 930
    invoke-static {v1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 931
    .line 932
    .line 933
    const/4 v6, 0x0

    .line 934
    const/16 v8, 0x6db0

    .line 935
    .line 936
    iget-object v2, v0, Lwb/md;->h:Landroid/content/SharedPreferences;

    .line 937
    .line 938
    const-string v3, "ai_stream"

    .line 939
    .line 940
    const-string v4, "\u6d41\u5f0f\u8bf7\u6c42"

    .line 941
    .line 942
    const-string v5, "\u5931\u8d25\u65f6\u4f1a\u81ea\u52a8\u5c1d\u8bd5\u975e\u6d41\u5f0f"

    .line 943
    .line 944
    invoke-static/range {v2 .. v8}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 945
    .line 946
    .line 947
    invoke-static {v1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 948
    .line 949
    .line 950
    const/4 v6, 0x1

    .line 951
    const-string v3, "ai_clear_context_on_save"

    .line 952
    .line 953
    const-string v4, "\u4fdd\u5b58\u540e\u6e05\u7a7a\u4e0a\u4e0b\u6587"

    .line 954
    .line 955
    const-string v5, "\u4fee\u6539\u4eba\u8bbe\u6216\u6a21\u578b\u540e\u907f\u514d\u7ee7\u7eed\u6cbf\u7528\u65e7\u5bf9\u8bdd"

    .line 956
    .line 957
    invoke-static/range {v2 .. v8}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 958
    .line 959
    .line 960
    goto :goto_7

    .line 961
    :cond_24
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 962
    .line 963
    .line 964
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 965
    .line 966
    return-object v1

    .line 967
    :pswitch_1
    move-object/from16 v6, p1

    .line 968
    .line 969
    check-cast v6, Li0/h0;

    .line 970
    .line 971
    move-object/from16 v1, p2

    .line 972
    .line 973
    check-cast v1, Ljava/lang/Integer;

    .line 974
    .line 975
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 976
    .line 977
    .line 978
    move-result v1

    .line 979
    and-int/lit8 v2, v1, 0x3

    .line 980
    .line 981
    const/4 v3, 0x2

    .line 982
    const/4 v10, 0x1

    .line 983
    const/4 v11, 0x0

    .line 984
    if-eq v2, v3, :cond_25

    .line 985
    .line 986
    move v2, v10

    .line 987
    goto :goto_8

    .line 988
    :cond_25
    move v2, v11

    .line 989
    :goto_8
    and-int/2addr v1, v10

    .line 990
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 991
    .line 992
    .line 993
    move-result v1

    .line 994
    if-eqz v1, :cond_39

    .line 995
    .line 996
    iget-object v1, v0, Lwb/md;->i:Li0/a1;

    .line 997
    .line 998
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v2

    .line 1002
    check-cast v2, Ljava/lang/Number;

    .line 1003
    .line 1004
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1005
    .line 1006
    .line 1007
    move-result v2

    .line 1008
    if-ne v2, v10, :cond_26

    .line 1009
    .line 1010
    const-string v2, "\u5728\u8303\u56f4\u5185\u968f\u673a\u7b49\u5f85"

    .line 1011
    .line 1012
    :goto_9
    move-object v3, v2

    .line 1013
    goto :goto_a

    .line 1014
    :cond_26
    const-string v2, "\u6bcf\u6761\u7b49\u5f85\u56fa\u5b9a\u65f6\u95f4"

    .line 1015
    .line 1016
    goto :goto_9

    .line 1017
    :goto_a
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    new-instance v4, Lsf/e;

    .line 1022
    .line 1023
    const-string v5, "\u56fa\u5b9a\u5ef6\u8fdf"

    .line 1024
    .line 1025
    invoke-direct {v4, v5, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1026
    .line 1027
    .line 1028
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v2

    .line 1032
    new-instance v5, Lsf/e;

    .line 1033
    .line 1034
    const-string v7, "\u968f\u673a\u5ef6\u8fdf"

    .line 1035
    .line 1036
    invoke-direct {v5, v7, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1037
    .line 1038
    .line 1039
    filled-new-array {v4, v5}, [Lsf/e;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v2

    .line 1043
    invoke-static {v2}, Lwb/ho;->w6([Lsf/e;)Ljava/util/ArrayList;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v4

    .line 1047
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v2

    .line 1051
    check-cast v2, Ljava/lang/Number;

    .line 1052
    .line 1053
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1054
    .line 1055
    .line 1056
    move-result v5

    .line 1057
    iget-object v12, v0, Lwb/md;->h:Landroid/content/SharedPreferences;

    .line 1058
    .line 1059
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v2

    .line 1063
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v7

    .line 1067
    sget-object v13, Li0/l;->a:Li0/e;

    .line 1068
    .line 1069
    if-nez v2, :cond_27

    .line 1070
    .line 1071
    if-ne v7, v13, :cond_28

    .line 1072
    .line 1073
    :cond_27
    new-instance v7, Lwb/wh;

    .line 1074
    .line 1075
    const/16 v2, 0xf

    .line 1076
    .line 1077
    invoke-direct {v7, v12, v1, v2}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v6, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1081
    .line 1082
    .line 1083
    :cond_28
    check-cast v7, Lfg/l;

    .line 1084
    .line 1085
    move-object v8, v6

    .line 1086
    move-object v6, v7

    .line 1087
    const/4 v7, 0x0

    .line 1088
    const/4 v9, 0x6

    .line 1089
    const-string v2, "\u70b9\u8d5e\u5ef6\u8fdf"

    .line 1090
    .line 1091
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 1092
    .line 1093
    .line 1094
    move-object v6, v8

    .line 1095
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v1

    .line 1099
    check-cast v1, Ljava/lang/Number;

    .line 1100
    .line 1101
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1102
    .line 1103
    .line 1104
    move-result v1

    .line 1105
    const/4 v14, 0x0

    .line 1106
    if-nez v1, :cond_2b

    .line 1107
    .line 1108
    const v1, 0x3dc22b20

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 1112
    .line 1113
    .line 1114
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1115
    .line 1116
    .line 1117
    iget-object v1, v0, Lwb/md;->j:Li0/a1;

    .line 1118
    .line 1119
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    move-object v4, v2

    .line 1124
    check-cast v4, Ljava/lang/String;

    .line 1125
    .line 1126
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v2

    .line 1130
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v3

    .line 1134
    if-nez v2, :cond_29

    .line 1135
    .line 1136
    if-ne v3, v13, :cond_2a

    .line 1137
    .line 1138
    :cond_29
    new-instance v3, Lwb/wh;

    .line 1139
    .line 1140
    const/16 v2, 0x10

    .line 1141
    .line 1142
    invoke-direct {v3, v1, v12, v2}, Lwb/wh;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1146
    .line 1147
    .line 1148
    :cond_2a
    move-object v5, v3

    .line 1149
    check-cast v5, Lfg/l;

    .line 1150
    .line 1151
    const/16 v7, 0x36

    .line 1152
    .line 1153
    const-string v2, "\u7b49\u5f85\u65f6\u95f4"

    .line 1154
    .line 1155
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u6700\u5c11 0 \u79d2"

    .line 1156
    .line 1157
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 1161
    .line 1162
    .line 1163
    goto :goto_b

    .line 1164
    :cond_2b
    const v1, 0x3dc96cd3

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 1168
    .line 1169
    .line 1170
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1171
    .line 1172
    .line 1173
    iget-object v1, v0, Lwb/md;->k:Li0/a1;

    .line 1174
    .line 1175
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v2

    .line 1179
    move-object v4, v2

    .line 1180
    check-cast v4, Ljava/lang/String;

    .line 1181
    .line 1182
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v2

    .line 1186
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v3

    .line 1190
    if-nez v2, :cond_2c

    .line 1191
    .line 1192
    if-ne v3, v13, :cond_2d

    .line 1193
    .line 1194
    :cond_2c
    new-instance v3, Lwb/wh;

    .line 1195
    .line 1196
    const/16 v2, 0x11

    .line 1197
    .line 1198
    invoke-direct {v3, v1, v12, v2}, Lwb/wh;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1202
    .line 1203
    .line 1204
    :cond_2d
    move-object v5, v3

    .line 1205
    check-cast v5, Lfg/l;

    .line 1206
    .line 1207
    const/16 v7, 0x36

    .line 1208
    .line 1209
    const-string v2, "\u6700\u77ed\u7b49\u5f85"

    .line 1210
    .line 1211
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u6700\u5c11 0 \u79d2"

    .line 1212
    .line 1213
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1214
    .line 1215
    .line 1216
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1217
    .line 1218
    .line 1219
    iget-object v1, v0, Lwb/md;->l:Li0/a1;

    .line 1220
    .line 1221
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v2

    .line 1225
    move-object v4, v2

    .line 1226
    check-cast v4, Ljava/lang/String;

    .line 1227
    .line 1228
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1229
    .line 1230
    .line 1231
    move-result v2

    .line 1232
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v3

    .line 1236
    if-nez v2, :cond_2e

    .line 1237
    .line 1238
    if-ne v3, v13, :cond_2f

    .line 1239
    .line 1240
    :cond_2e
    new-instance v3, Lwb/wh;

    .line 1241
    .line 1242
    const/16 v2, 0x12

    .line 1243
    .line 1244
    invoke-direct {v3, v1, v12, v2}, Lwb/wh;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1248
    .line 1249
    .line 1250
    :cond_2f
    move-object v5, v3

    .line 1251
    check-cast v5, Lfg/l;

    .line 1252
    .line 1253
    const/16 v7, 0x36

    .line 1254
    .line 1255
    const-string v2, "\u6700\u957f\u7b49\u5f85"

    .line 1256
    .line 1257
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u4e0d\u80fd\u5c0f\u4e8e\u6700\u77ed\u7b49\u5f85"

    .line 1258
    .line 1259
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 1263
    .line 1264
    .line 1265
    :goto_b
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1266
    .line 1267
    .line 1268
    iget-object v1, v0, Lwb/md;->m:Li0/a1;

    .line 1269
    .line 1270
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v2

    .line 1274
    check-cast v2, Ljava/lang/Boolean;

    .line 1275
    .line 1276
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1277
    .line 1278
    .line 1279
    move-result v2

    .line 1280
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1281
    .line 1282
    .line 1283
    move-result v3

    .line 1284
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v4

    .line 1288
    if-nez v3, :cond_30

    .line 1289
    .line 1290
    if-ne v4, v13, :cond_31

    .line 1291
    .line 1292
    :cond_30
    new-instance v4, Lwb/wh;

    .line 1293
    .line 1294
    const/16 v3, 0x13

    .line 1295
    .line 1296
    invoke-direct {v4, v12, v1, v3}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1300
    .line 1301
    .line 1302
    :cond_31
    check-cast v4, Lfg/l;

    .line 1303
    .line 1304
    const/16 v8, 0x1b0

    .line 1305
    .line 1306
    const/16 v9, 0x8

    .line 1307
    .line 1308
    const-string v3, "\u9650\u5236\u8fd0\u884c\u65f6\u6bb5"

    .line 1309
    .line 1310
    move-object v5, v6

    .line 1311
    move-object v6, v4

    .line 1312
    const-string v4, "\u652f\u6301\u8de8\u96f6\u70b9\u65f6\u6bb5"

    .line 1313
    .line 1314
    move-object v7, v5

    .line 1315
    const/4 v5, 0x0

    .line 1316
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1317
    .line 1318
    .line 1319
    move-object v6, v7

    .line 1320
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v1

    .line 1324
    check-cast v1, Ljava/lang/Boolean;

    .line 1325
    .line 1326
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1327
    .line 1328
    .line 1329
    move-result v1

    .line 1330
    if-eqz v1, :cond_36

    .line 1331
    .line 1332
    const v1, 0x3ddbb64f

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 1336
    .line 1337
    .line 1338
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1339
    .line 1340
    .line 1341
    iget-object v1, v0, Lwb/md;->n:Li0/a1;

    .line 1342
    .line 1343
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    move-object v7, v2

    .line 1348
    check-cast v7, Ljava/lang/String;

    .line 1349
    .line 1350
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1351
    .line 1352
    .line 1353
    move-result v2

    .line 1354
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v3

    .line 1358
    if-nez v2, :cond_32

    .line 1359
    .line 1360
    if-ne v3, v13, :cond_33

    .line 1361
    .line 1362
    :cond_32
    new-instance v3, Lwb/wh;

    .line 1363
    .line 1364
    const/16 v2, 0x14

    .line 1365
    .line 1366
    invoke-direct {v3, v12, v1, v2}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1370
    .line 1371
    .line 1372
    :cond_33
    move-object v4, v3

    .line 1373
    check-cast v4, Lfg/l;

    .line 1374
    .line 1375
    const/4 v2, 0x6

    .line 1376
    const/4 v3, 0x4

    .line 1377
    move-object v5, v6

    .line 1378
    const-string v6, "\u5f00\u59cb\u65f6\u95f4"

    .line 1379
    .line 1380
    const/4 v8, 0x0

    .line 1381
    invoke-static/range {v2 .. v8}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1382
    .line 1383
    .line 1384
    move-object v6, v5

    .line 1385
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1386
    .line 1387
    .line 1388
    iget-object v1, v0, Lwb/md;->o:Li0/a1;

    .line 1389
    .line 1390
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v2

    .line 1394
    move-object v7, v2

    .line 1395
    check-cast v7, Ljava/lang/String;

    .line 1396
    .line 1397
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1398
    .line 1399
    .line 1400
    move-result v2

    .line 1401
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v3

    .line 1405
    if-nez v2, :cond_34

    .line 1406
    .line 1407
    if-ne v3, v13, :cond_35

    .line 1408
    .line 1409
    :cond_34
    new-instance v3, Lwb/wh;

    .line 1410
    .line 1411
    const/16 v2, 0x15

    .line 1412
    .line 1413
    invoke-direct {v3, v12, v1, v2}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1417
    .line 1418
    .line 1419
    :cond_35
    move-object v4, v3

    .line 1420
    check-cast v4, Lfg/l;

    .line 1421
    .line 1422
    const/4 v2, 0x6

    .line 1423
    const/4 v3, 0x4

    .line 1424
    move-object v5, v6

    .line 1425
    const-string v6, "\u7ed3\u675f\u65f6\u95f4"

    .line 1426
    .line 1427
    const/4 v8, 0x0

    .line 1428
    invoke-static/range {v2 .. v8}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1429
    .line 1430
    .line 1431
    move-object v6, v5

    .line 1432
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 1433
    .line 1434
    .line 1435
    goto :goto_c

    .line 1436
    :cond_36
    const v1, 0x3de4956c

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 1440
    .line 1441
    .line 1442
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 1443
    .line 1444
    .line 1445
    :goto_c
    invoke-static {v14, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1446
    .line 1447
    .line 1448
    iget-object v1, v0, Lwb/md;->p:Li0/a1;

    .line 1449
    .line 1450
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v2

    .line 1454
    move-object v4, v2

    .line 1455
    check-cast v4, Ljava/lang/String;

    .line 1456
    .line 1457
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1458
    .line 1459
    .line 1460
    move-result v2

    .line 1461
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v3

    .line 1465
    if-nez v2, :cond_37

    .line 1466
    .line 1467
    if-ne v3, v13, :cond_38

    .line 1468
    .line 1469
    :cond_37
    new-instance v3, Lwb/wh;

    .line 1470
    .line 1471
    const/16 v2, 0x16

    .line 1472
    .line 1473
    invoke-direct {v3, v1, v12, v2}, Lwb/wh;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 1474
    .line 1475
    .line 1476
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1477
    .line 1478
    .line 1479
    :cond_38
    move-object v5, v3

    .line 1480
    check-cast v5, Lfg/l;

    .line 1481
    .line 1482
    const/16 v7, 0x36

    .line 1483
    .line 1484
    const-string v2, "\u53d1\u5e03\u65f6\u95f4\u9650\u5236"

    .line 1485
    .line 1486
    const-string v3, "\u4ec5\u70b9\u8d5e\u53d1\u5e03\u540e\u6307\u5b9a\u5c0f\u65f6\u5185\u7684\u670b\u53cb\u5708\uff0c\u6700\u5c11 1 \u5c0f\u65f6"

    .line 1487
    .line 1488
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1489
    .line 1490
    .line 1491
    goto :goto_d

    .line 1492
    :cond_39
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1493
    .line 1494
    .line 1495
    :goto_d
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1496
    .line 1497
    return-object v1

    .line 1498
    :pswitch_2
    move-object/from16 v8, p1

    .line 1499
    .line 1500
    check-cast v8, Li0/h0;

    .line 1501
    .line 1502
    move-object/from16 v1, p2

    .line 1503
    .line 1504
    check-cast v1, Ljava/lang/Integer;

    .line 1505
    .line 1506
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1507
    .line 1508
    .line 1509
    move-result v1

    .line 1510
    and-int/lit8 v2, v1, 0x3

    .line 1511
    .line 1512
    const/4 v3, 0x2

    .line 1513
    const/4 v11, 0x1

    .line 1514
    const/4 v12, 0x0

    .line 1515
    if-eq v2, v3, :cond_3a

    .line 1516
    .line 1517
    move v2, v11

    .line 1518
    goto :goto_e

    .line 1519
    :cond_3a
    move v2, v12

    .line 1520
    :goto_e
    and-int/2addr v1, v11

    .line 1521
    invoke-virtual {v8, v1, v2}, Li0/h0;->S(IZ)Z

    .line 1522
    .line 1523
    .line 1524
    move-result v1

    .line 1525
    if-eqz v1, :cond_4b

    .line 1526
    .line 1527
    iget-object v1, v0, Lwb/md;->i:Li0/a1;

    .line 1528
    .line 1529
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v2

    .line 1533
    check-cast v2, Ljava/lang/Boolean;

    .line 1534
    .line 1535
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1536
    .line 1537
    .line 1538
    move-result v2

    .line 1539
    iget-object v13, v0, Lwb/md;->h:Landroid/content/SharedPreferences;

    .line 1540
    .line 1541
    invoke-virtual {v8, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1542
    .line 1543
    .line 1544
    move-result v3

    .line 1545
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v4

    .line 1549
    sget-object v14, Li0/l;->a:Li0/e;

    .line 1550
    .line 1551
    if-nez v3, :cond_3b

    .line 1552
    .line 1553
    if-ne v4, v14, :cond_3c

    .line 1554
    .line 1555
    :cond_3b
    new-instance v4, Lwb/me;

    .line 1556
    .line 1557
    const/16 v3, 0xd

    .line 1558
    .line 1559
    invoke-direct {v4, v13, v1, v3}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1560
    .line 1561
    .line 1562
    invoke-virtual {v8, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1563
    .line 1564
    .line 1565
    :cond_3c
    move-object v6, v4

    .line 1566
    check-cast v6, Lfg/l;

    .line 1567
    .line 1568
    move-object v7, v8

    .line 1569
    const/16 v8, 0x1b0

    .line 1570
    .line 1571
    const/16 v9, 0x8

    .line 1572
    .line 1573
    const-string v3, "\u9000\u7fa4\u7cfb\u7edf\u6d88\u606f"

    .line 1574
    .line 1575
    const-string v4, "\u4fdd\u7559\u73b0\u6709\u9000\u7fa4\u76d1\u63a7\u903b\u8f91\uff0c\u68c0\u6d4b\u5230\u6210\u5458\u9000\u51fa\u540e\u63d2\u5165\u53ef\u70b9\u51fb\u8d44\u6599\u9875\u7684\u7cfb\u7edf\u6d88\u606f"

    .line 1576
    .line 1577
    const/4 v5, 0x0

    .line 1578
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1579
    .line 1580
    .line 1581
    move-object v8, v7

    .line 1582
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v2

    .line 1586
    check-cast v2, Ljava/lang/Boolean;

    .line 1587
    .line 1588
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1589
    .line 1590
    .line 1591
    move-result v2

    .line 1592
    const/4 v15, 0x0

    .line 1593
    if-eqz v2, :cond_3e

    .line 1594
    .line 1595
    const v2, -0x2f5cbf27

    .line 1596
    .line 1597
    .line 1598
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 1599
    .line 1600
    .line 1601
    invoke-static {v15, v8, v12, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1602
    .line 1603
    .line 1604
    iget-object v2, v0, Lwb/md;->j:Li0/a1;

    .line 1605
    .line 1606
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v3

    .line 1610
    move-object v4, v3

    .line 1611
    check-cast v4, Ljava/lang/String;

    .line 1612
    .line 1613
    sget-object v5, Lwb/ho;->q:Ljava/util/List;

    .line 1614
    .line 1615
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v3

    .line 1619
    if-ne v3, v14, :cond_3d

    .line 1620
    .line 1621
    new-instance v3, Lwb/mf;

    .line 1622
    .line 1623
    const/4 v6, 0x4

    .line 1624
    invoke-direct {v3, v2, v6}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1628
    .line 1629
    .line 1630
    :cond_3d
    move-object v7, v3

    .line 1631
    check-cast v7, Lfg/l;

    .line 1632
    .line 1633
    const v9, 0x36036

    .line 1634
    .line 1635
    .line 1636
    const/4 v10, 0x0

    .line 1637
    const-string v2, "\u9000\u7fa4\u7cfb\u7edf\u6d88\u606f\u6a21\u677f"

    .line 1638
    .line 1639
    const-string v3, "wxid\u53d8\u91cf\u4f1a\u751f\u6210\u53ef\u70b9\u51fb\u8d44\u6599\u94fe\u63a5"

    .line 1640
    .line 1641
    const/4 v6, 0x3

    .line 1642
    invoke-static/range {v2 .. v10}, Lwb/ho;->i4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;Li0/h0;II)V

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1646
    .line 1647
    .line 1648
    goto :goto_f

    .line 1649
    :cond_3e
    const v2, -0x2f571da7

    .line 1650
    .line 1651
    .line 1652
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1656
    .line 1657
    .line 1658
    :goto_f
    invoke-static {v15, v8, v12, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1659
    .line 1660
    .line 1661
    iget-object v10, v0, Lwb/md;->k:Li0/a1;

    .line 1662
    .line 1663
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v2

    .line 1667
    check-cast v2, Ljava/lang/Boolean;

    .line 1668
    .line 1669
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1670
    .line 1671
    .line 1672
    move-result v2

    .line 1673
    invoke-virtual {v8, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1674
    .line 1675
    .line 1676
    move-result v3

    .line 1677
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v4

    .line 1681
    if-nez v3, :cond_3f

    .line 1682
    .line 1683
    if-ne v4, v14, :cond_40

    .line 1684
    .line 1685
    :cond_3f
    new-instance v4, Lwb/me;

    .line 1686
    .line 1687
    const/16 v3, 0xe

    .line 1688
    .line 1689
    invoke-direct {v4, v13, v10, v3}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v8, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1693
    .line 1694
    .line 1695
    :cond_40
    move-object v6, v4

    .line 1696
    check-cast v6, Lfg/l;

    .line 1697
    .line 1698
    move-object v7, v8

    .line 1699
    const/16 v8, 0x1b0

    .line 1700
    .line 1701
    const/16 v9, 0x8

    .line 1702
    .line 1703
    const-string v3, "\u9080\u8bf7\u8be6\u60c5"

    .line 1704
    .line 1705
    const-string v4, "\u68c0\u6d4b\u5230\u9080\u8bf7\u8fdb\u7fa4\u540e\u63d2\u5165\u9080\u8bf7\u8005\u3001\u88ab\u9080\u8bf7\u8005\u548c\u7d2f\u8ba1\u9080\u8bf7\u6b21\u6570"

    .line 1706
    .line 1707
    const/4 v5, 0x0

    .line 1708
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1709
    .line 1710
    .line 1711
    move-object v8, v7

    .line 1712
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v2

    .line 1716
    check-cast v2, Ljava/lang/Boolean;

    .line 1717
    .line 1718
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1719
    .line 1720
    .line 1721
    move-result v2

    .line 1722
    if-eqz v2, :cond_42

    .line 1723
    .line 1724
    const v2, -0x2f4f5c52

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 1728
    .line 1729
    .line 1730
    invoke-static {v15, v8, v12, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1731
    .line 1732
    .line 1733
    iget-object v2, v0, Lwb/md;->l:Li0/a1;

    .line 1734
    .line 1735
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v3

    .line 1739
    move-object v4, v3

    .line 1740
    check-cast v4, Ljava/lang/String;

    .line 1741
    .line 1742
    sget-object v5, Lwb/ho;->r:Ljava/util/List;

    .line 1743
    .line 1744
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v3

    .line 1748
    if-ne v3, v14, :cond_41

    .line 1749
    .line 1750
    new-instance v3, Lwb/mf;

    .line 1751
    .line 1752
    const/4 v6, 0x5

    .line 1753
    invoke-direct {v3, v2, v6}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1757
    .line 1758
    .line 1759
    :cond_41
    move-object v7, v3

    .line 1760
    check-cast v7, Lfg/l;

    .line 1761
    .line 1762
    const v9, 0x36036

    .line 1763
    .line 1764
    .line 1765
    move-object v2, v10

    .line 1766
    const/4 v10, 0x0

    .line 1767
    move-object v3, v2

    .line 1768
    const-string v2, "\u9080\u8bf7\u8be6\u60c5\u7cfb\u7edf\u6d88\u606f\u6a21\u677f"

    .line 1769
    .line 1770
    move-object v6, v3

    .line 1771
    const-string v3, "\u9080\u8bf7\u8005\u548c\u88ab\u9080\u8bf7\u8005wxid\u4f1a\u751f\u6210\u53ef\u70b9\u51fb\u8d44\u6599\u94fe\u63a5"

    .line 1772
    .line 1773
    move-object v13, v6

    .line 1774
    const/4 v6, 0x4

    .line 1775
    invoke-static/range {v2 .. v10}, Lwb/ho;->i4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;Li0/h0;II)V

    .line 1776
    .line 1777
    .line 1778
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1779
    .line 1780
    .line 1781
    goto :goto_10

    .line 1782
    :cond_42
    move-object v13, v10

    .line 1783
    const v2, -0x2f499187

    .line 1784
    .line 1785
    .line 1786
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 1787
    .line 1788
    .line 1789
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1790
    .line 1791
    .line 1792
    :goto_10
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    check-cast v1, Ljava/lang/Boolean;

    .line 1797
    .line 1798
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1799
    .line 1800
    .line 1801
    move-result v1

    .line 1802
    if-nez v1, :cond_44

    .line 1803
    .line 1804
    invoke-interface {v13}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v1

    .line 1808
    check-cast v1, Ljava/lang/Boolean;

    .line 1809
    .line 1810
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1811
    .line 1812
    .line 1813
    move-result v1

    .line 1814
    if-eqz v1, :cond_43

    .line 1815
    .line 1816
    goto :goto_11

    .line 1817
    :cond_43
    const v1, -0x2f33d127

    .line 1818
    .line 1819
    .line 1820
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 1821
    .line 1822
    .line 1823
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1824
    .line 1825
    .line 1826
    goto/16 :goto_14

    .line 1827
    .line 1828
    :cond_44
    :goto_11
    const v1, -0x2f47e440

    .line 1829
    .line 1830
    .line 1831
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 1832
    .line 1833
    .line 1834
    invoke-static {v15, v8, v12, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1835
    .line 1836
    .line 1837
    iget-object v1, v0, Lwb/md;->m:Li0/a1;

    .line 1838
    .line 1839
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v2

    .line 1843
    check-cast v2, Ljava/lang/String;

    .line 1844
    .line 1845
    const-string v13, "specific"

    .line 1846
    .line 1847
    invoke-static {v2, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1848
    .line 1849
    .line 1850
    move-result v2

    .line 1851
    const-string v3, "\u5168\u90e8\u7fa4\u804a"

    .line 1852
    .line 1853
    const-string v4, "\u6307\u5b9a\u7fa4\u804a"

    .line 1854
    .line 1855
    if-eqz v2, :cond_45

    .line 1856
    .line 1857
    move-object v2, v4

    .line 1858
    goto :goto_12

    .line 1859
    :cond_45
    move-object v2, v3

    .line 1860
    :goto_12
    new-instance v5, Lwb/dq;

    .line 1861
    .line 1862
    const-string v6, "all"

    .line 1863
    .line 1864
    invoke-direct {v5, v6, v3}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1865
    .line 1866
    .line 1867
    new-instance v3, Lwb/dq;

    .line 1868
    .line 1869
    invoke-direct {v3, v13, v4}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1870
    .line 1871
    .line 1872
    filled-new-array {v5, v3}, [Lwb/dq;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v3

    .line 1876
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v4

    .line 1880
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v3

    .line 1884
    move-object v5, v3

    .line 1885
    check-cast v5, Ljava/lang/String;

    .line 1886
    .line 1887
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v3

    .line 1891
    if-ne v3, v14, :cond_46

    .line 1892
    .line 1893
    new-instance v3, Lwb/mf;

    .line 1894
    .line 1895
    const/4 v6, 0x6

    .line 1896
    invoke-direct {v3, v1, v6}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 1897
    .line 1898
    .line 1899
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1900
    .line 1901
    .line 1902
    :cond_46
    move-object v6, v3

    .line 1903
    check-cast v6, Lfg/l;

    .line 1904
    .line 1905
    const/16 v9, 0x6006

    .line 1906
    .line 1907
    const/16 v10, 0x20

    .line 1908
    .line 1909
    move-object v3, v2

    .line 1910
    const-string v2, "\u9002\u7528\u7fa4\u804a"

    .line 1911
    .line 1912
    const/4 v7, 0x0

    .line 1913
    invoke-static/range {v2 .. v10}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 1914
    .line 1915
    .line 1916
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v1

    .line 1920
    check-cast v1, Ljava/lang/String;

    .line 1921
    .line 1922
    invoke-static {v1, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1923
    .line 1924
    .line 1925
    move-result v1

    .line 1926
    if-eqz v1, :cond_48

    .line 1927
    .line 1928
    const v1, -0x2f3d0d06

    .line 1929
    .line 1930
    .line 1931
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 1932
    .line 1933
    .line 1934
    invoke-static {v15, v8, v12, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1935
    .line 1936
    .line 1937
    iget-object v1, v0, Lwb/md;->n:Li0/a1;

    .line 1938
    .line 1939
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v2

    .line 1943
    check-cast v2, Ljava/lang/String;

    .line 1944
    .line 1945
    invoke-static {v2}, Lwb/ho;->i7(Ljava/lang/String;)Ljava/lang/String;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v2

    .line 1949
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v3

    .line 1953
    if-ne v3, v14, :cond_47

    .line 1954
    .line 1955
    new-instance v3, Lc9/x0;

    .line 1956
    .line 1957
    const/16 v4, 0x18

    .line 1958
    .line 1959
    iget-object v5, v0, Lwb/md;->o:Li0/a1;

    .line 1960
    .line 1961
    invoke-direct {v3, v4, v1, v5}, Lc9/x0;-><init>(ILi0/a1;Li0/a1;)V

    .line 1962
    .line 1963
    .line 1964
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1965
    .line 1966
    .line 1967
    :cond_47
    check-cast v3, Lfg/a;

    .line 1968
    .line 1969
    const/16 v1, 0x186

    .line 1970
    .line 1971
    const-string v4, "\u9009\u62e9\u6307\u5b9a\u7fa4\u804a"

    .line 1972
    .line 1973
    invoke-static {v4, v2, v3, v8, v1}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1974
    .line 1975
    .line 1976
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1977
    .line 1978
    .line 1979
    goto :goto_13

    .line 1980
    :cond_48
    const v1, -0x2f342667

    .line 1981
    .line 1982
    .line 1983
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1987
    .line 1988
    .line 1989
    :goto_13
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1990
    .line 1991
    .line 1992
    :goto_14
    invoke-static {v15, v8, v12, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1993
    .line 1994
    .line 1995
    iget-object v1, v0, Lwb/md;->p:Li0/a1;

    .line 1996
    .line 1997
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v2

    .line 2001
    move-object v4, v2

    .line 2002
    check-cast v4, Ljava/lang/String;

    .line 2003
    .line 2004
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v2

    .line 2008
    if-ne v2, v14, :cond_49

    .line 2009
    .line 2010
    new-instance v2, Lwb/bf;

    .line 2011
    .line 2012
    const/4 v3, 0x3

    .line 2013
    invoke-direct {v2, v1, v3}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 2014
    .line 2015
    .line 2016
    invoke-virtual {v8, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2017
    .line 2018
    .line 2019
    :cond_49
    move-object v6, v2

    .line 2020
    check-cast v6, Lfg/a;

    .line 2021
    .line 2022
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v2

    .line 2026
    if-ne v2, v14, :cond_4a

    .line 2027
    .line 2028
    new-instance v2, Lwb/mf;

    .line 2029
    .line 2030
    const/4 v3, 0x7

    .line 2031
    invoke-direct {v2, v1, v3}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 2032
    .line 2033
    .line 2034
    invoke-virtual {v8, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2035
    .line 2036
    .line 2037
    :cond_4a
    move-object v7, v2

    .line 2038
    check-cast v7, Lfg/l;

    .line 2039
    .line 2040
    const v9, 0x36c36

    .line 2041
    .line 2042
    .line 2043
    const/4 v10, 0x0

    .line 2044
    const-string v2, "wxid\u989c\u8272"

    .line 2045
    .line 2046
    const-string v3, "\u9000\u7fa4\u548c\u9080\u8bf7\u8be6\u60c5\u91cc\u7684 wxid \u94fe\u63a5\u989c\u8272"

    .line 2047
    .line 2048
    const/4 v5, 0x0

    .line 2049
    invoke-static/range {v2 .. v10}, Lwb/ho;->S(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/l;Li0/h0;II)V

    .line 2050
    .line 2051
    .line 2052
    goto :goto_15

    .line 2053
    :cond_4b
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 2054
    .line 2055
    .line 2056
    :goto_15
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2057
    .line 2058
    return-object v1

    .line 2059
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
