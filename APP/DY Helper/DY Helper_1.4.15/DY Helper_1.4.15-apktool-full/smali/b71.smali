.class public final synthetic Lb71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Landroid/widget/TextView;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Landroid/widget/TextView;

.field public final synthetic ι:Lum1;

.field public final synthetic κ:Lum1;

.field public final synthetic λ:Landroid/widget/LinearLayout;

.field public final synthetic μ:Landroid/widget/LinearLayout;

.field public final synthetic ν:Landroid/view/View;

.field public final synthetic ξ:Landroid/widget/ScrollView;

.field public final synthetic ο:La71;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/TextView;Lum1;Landroid/widget/TextView;Lum1;Lum1;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Landroid/widget/ScrollView;La71;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb71;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lb71;->ζ:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p3, p0, Lb71;->η:Lum1;

    .line 9
    .line 10
    iput-object p4, p0, Lb71;->θ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p5, p0, Lb71;->ι:Lum1;

    .line 13
    .line 14
    iput-object p6, p0, Lb71;->κ:Lum1;

    .line 15
    .line 16
    iput-object p7, p0, Lb71;->λ:Landroid/widget/LinearLayout;

    .line 17
    .line 18
    iput-object p8, p0, Lb71;->μ:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    iput-object p9, p0, Lb71;->ν:Landroid/view/View;

    .line 21
    .line 22
    iput-object p10, p0, Lb71;->ξ:Landroid/widget/ScrollView;

    .line 23
    .line 24
    iput-object p11, p0, Lb71;->ο:La71;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sget-object v2, Lq71;->α:Lq71;

    .line 12
    .line 13
    iget-object v3, v0, Lb71;->η:Lum1;

    .line 14
    .line 15
    iget-object v4, v3, Lum1;->ε:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    sget-object v7, Lk71;->ε:Lk71;

    .line 19
    .line 20
    if-ne v4, v7, :cond_0

    .line 21
    .line 22
    move v4, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v4, 0x0

    .line 25
    :goto_0
    iget-object v9, v0, Lb71;->ε:Landroid/app/Activity;

    .line 26
    .line 27
    iget-object v8, v0, Lb71;->ζ:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-static {v9, v8, v4}, Lq71;->Ξ(Landroid/app/Activity;Landroid/widget/TextView;Z)V

    .line 30
    .line 31
    .line 32
    iget-object v4, v3, Lum1;->ε:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v8, Lk71;->ζ:Lk71;

    .line 35
    .line 36
    if-ne v4, v8, :cond_1

    .line 37
    .line 38
    move v4, v5

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v4, 0x0

    .line 41
    :goto_1
    iget-object v8, v0, Lb71;->θ:Landroid/widget/TextView;

    .line 42
    .line 43
    invoke-static {v9, v8, v4}, Lq71;->Ξ(Landroid/app/Activity;Landroid/widget/TextView;Z)V

    .line 44
    .line 45
    .line 46
    iget-object v4, v0, Lb71;->ι:Lum1;

    .line 47
    .line 48
    iget-object v4, v4, Lum1;->ε:Ljava/lang/Object;

    .line 49
    .line 50
    if-eqz v4, :cond_3a

    .line 51
    .line 52
    check-cast v4, Ld81;

    .line 53
    .line 54
    iget-object v15, v0, Lb71;->κ:Lum1;

    .line 55
    .line 56
    iget-object v8, v15, Lum1;->ε:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v8, Ljava/lang/Iterable;

    .line 59
    .line 60
    new-instance v10, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    :cond_2
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-eqz v11, :cond_3

    .line 74
    .line 75
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    move-object v12, v11

    .line 80
    check-cast v12, Lj71;

    .line 81
    .line 82
    iget-boolean v12, v12, Lj71;->λ:Z

    .line 83
    .line 84
    if-eqz v12, :cond_2

    .line 85
    .line 86
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    new-instance v8, Ljava/util/ArrayList;

    .line 91
    .line 92
    const/16 v11, 0xa

    .line 93
    .line 94
    invoke-static {v10, v11}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    iget-object v12, v0, Lb71;->ο:La71;

    .line 110
    .line 111
    if-eqz v11, :cond_4

    .line 112
    .line 113
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    check-cast v11, Lj71;

    .line 118
    .line 119
    new-instance v16, Ls71;

    .line 120
    .line 121
    sget-object v13, Lw71;->α:Ljava/util/List;

    .line 122
    .line 123
    iget-object v13, v11, Lj71;->α:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v13}, Lw71;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v17

    .line 129
    iget-object v13, v11, Lj71;->α:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v13}, Lw71;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v18

    .line 135
    iget v13, v11, Lj71;->δ:I

    .line 136
    .line 137
    const/16 p1, 0x0

    .line 138
    .line 139
    iget-object v14, v11, Lj71;->ε:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v6, v11, Lj71;->ζ:Ljava/lang/String;

    .line 142
    .line 143
    move/from16 v24, v1

    .line 144
    .line 145
    iget-boolean v1, v11, Lj71;->η:Z

    .line 146
    .line 147
    move/from16 v22, v1

    .line 148
    .line 149
    new-instance v1, Ls61;

    .line 150
    .line 151
    invoke-direct {v1, v12, v11, v5}, Ls61;-><init>(La71;Lj71;I)V

    .line 152
    .line 153
    .line 154
    move-object/from16 v23, v1

    .line 155
    .line 156
    move-object/from16 v21, v6

    .line 157
    .line 158
    move/from16 v19, v13

    .line 159
    .line 160
    move-object/from16 v20, v14

    .line 161
    .line 162
    invoke-direct/range {v16 .. v23}, Ls71;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLs61;)V

    .line 163
    .line 164
    .line 165
    move-object/from16 v1, v16

    .line 166
    .line 167
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move/from16 v1, v24

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_4
    move/from16 v24, v1

    .line 174
    .line 175
    const/16 p1, 0x0

    .line 176
    .line 177
    new-instance v1, Ljava/util/HashSet;

    .line 178
    .line 179
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 180
    .line 181
    .line 182
    new-instance v6, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    :cond_5
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-eqz v10, :cond_6

    .line 196
    .line 197
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    move-object v11, v10

    .line 202
    check-cast v11, Ls71;

    .line 203
    .line 204
    iget-object v11, v11, Ls71;->α:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v1, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    if-eqz v11, :cond_5

    .line 211
    .line 212
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_6
    iput-object v6, v4, Ld81;->ι:Ljava/lang/Object;

    .line 217
    .line 218
    invoke-virtual {v4}, Ld81;->γ()V

    .line 219
    .line 220
    .line 221
    iget-object v1, v3, Lum1;->ε:Ljava/lang/Object;

    .line 222
    .line 223
    sget-object v3, Li71;->ι:Li71;

    .line 224
    .line 225
    sget-object v4, Li71;->θ:Li71;

    .line 226
    .line 227
    sget-object v6, Li71;->η:Li71;

    .line 228
    .line 229
    sget-object v8, Li71;->ζ:Li71;

    .line 230
    .line 231
    sget-object v10, Li71;->ε:Li71;

    .line 232
    .line 233
    if-ne v1, v7, :cond_7

    .line 234
    .line 235
    filled-new-array {v10, v8, v6}, [Li71;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-static {v1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    goto :goto_5

    .line 244
    :cond_7
    filled-new-array {v4, v3}, [Li71;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    :goto_5
    iget-object v7, v0, Lb71;->λ:Landroid/widget/LinearLayout;

    .line 253
    .line 254
    invoke-virtual {v7}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 255
    .line 256
    .line 257
    iget-object v11, v15, Lum1;->ε:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v11, Ljava/util/List;

    .line 260
    .line 261
    new-instance v16, Lh71;

    .line 262
    .line 263
    sget-object v13, Lq71;->γ:Lxx;

    .line 264
    .line 265
    const-string v14, "theme"

    .line 266
    .line 267
    if-eqz v13, :cond_39

    .line 268
    .line 269
    iget-object v5, v13, Lxx;->κ:Ljava/lang/String;

    .line 270
    .line 271
    iget-object v13, v13, Lxx;->ι:Ljava/lang/String;

    .line 272
    .line 273
    move-object/from16 v25, v3

    .line 274
    .line 275
    new-instance v3, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v17

    .line 284
    :goto_6
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v18

    .line 288
    if-eqz v18, :cond_b

    .line 289
    .line 290
    move-object/from16 v26, v4

    .line 291
    .line 292
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    move-object/from16 v20, v5

    .line 297
    .line 298
    move-object v5, v4

    .line 299
    check-cast v5, Lj71;

    .line 300
    .line 301
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    iget-object v5, v5, Lj71;->α:Ljava/lang/String;

    .line 305
    .line 306
    move-object/from16 v27, v6

    .line 307
    .line 308
    const-string v6, "\u4e0b\u8f7d"

    .line 309
    .line 310
    move-object/from16 v28, v8

    .line 311
    .line 312
    const/4 v8, 0x0

    .line 313
    invoke-static {v5, v6, v8}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-nez v6, :cond_9

    .line 318
    .line 319
    const-string v6, "\u9009\u62e9\u4e0b\u8f7d"

    .line 320
    .line 321
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    if-nez v6, :cond_9

    .line 326
    .line 327
    const-string v6, "\u590d\u5236\u4e0b\u8f7d\u76f4\u94fe"

    .line 328
    .line 329
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    if-nez v6, :cond_9

    .line 334
    .line 335
    const-string v6, "\u9884\u89c8\u5e76\u4fdd\u5b58\u56fe\u7247"

    .line 336
    .line 337
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    if-nez v6, :cond_9

    .line 342
    .line 343
    const-string v6, "\u6279\u91cf\u4e0b\u8f7d\u4f5c\u8005\u4e3b\u9875\u4f5c\u54c1"

    .line 344
    .line 345
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    if-nez v6, :cond_9

    .line 350
    .line 351
    const-string v6, "\u5168\u5c40\u89c6\u9891\u500d\u901f"

    .line 352
    .line 353
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    if-eqz v5, :cond_8

    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_8
    const/4 v5, 0x0

    .line 361
    goto :goto_8

    .line 362
    :cond_9
    :goto_7
    const/4 v5, 0x1

    .line 363
    :goto_8
    if-eqz v5, :cond_a

    .line 364
    .line 365
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    :cond_a
    move-object/from16 v5, v20

    .line 369
    .line 370
    move-object/from16 v4, v26

    .line 371
    .line 372
    move-object/from16 v6, v27

    .line 373
    .line 374
    move-object/from16 v8, v28

    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_b
    move-object/from16 v26, v4

    .line 378
    .line 379
    move-object/from16 v20, v5

    .line 380
    .line 381
    move-object/from16 v27, v6

    .line 382
    .line 383
    move-object/from16 v28, v8

    .line 384
    .line 385
    const-string v18, "\u5185\u5bb9\u4e0e\u4e0b\u8f7d"

    .line 386
    .line 387
    const v19, 0x7f080099

    .line 388
    .line 389
    .line 390
    move-object/from16 v22, v3

    .line 391
    .line 392
    move-object/from16 v17, v10

    .line 393
    .line 394
    move-object/from16 v21, v13

    .line 395
    .line 396
    invoke-direct/range {v16 .. v22}, Lh71;-><init>(Li71;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 397
    .line 398
    .line 399
    move-object/from16 v3, v16

    .line 400
    .line 401
    new-instance v16, Lh71;

    .line 402
    .line 403
    sget-object v4, Lq71;->γ:Lxx;

    .line 404
    .line 405
    if-eqz v4, :cond_38

    .line 406
    .line 407
    iget-object v5, v4, Lxx;->μ:Ljava/lang/String;

    .line 408
    .line 409
    iget-object v4, v4, Lxx;->λ:Ljava/lang/String;

    .line 410
    .line 411
    const-string v6, "\u590d\u5236\u4e3b\u9875ID"

    .line 412
    .line 413
    const-string v8, "\u590d\u5236\u6587\u6848"

    .line 414
    .line 415
    const-string v10, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 416
    .line 417
    filled-new-array {v10, v6, v8}, [Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    invoke-static {v11, v6}, Lq71;->β(Ljava/util/List;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 422
    .line 423
    .line 424
    move-result-object v22

    .line 425
    const-string v18, "\u4f5c\u8005\u4e0e\u5206\u4eab"

    .line 426
    .line 427
    const v19, 0x7f0800a1

    .line 428
    .line 429
    .line 430
    move-object/from16 v21, v4

    .line 431
    .line 432
    move-object/from16 v20, v5

    .line 433
    .line 434
    move-object/from16 v17, v28

    .line 435
    .line 436
    invoke-direct/range {v16 .. v22}, Lh71;-><init>(Li71;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 437
    .line 438
    .line 439
    move-object/from16 v4, v16

    .line 440
    .line 441
    new-instance v16, Lh71;

    .line 442
    .line 443
    sget-object v5, Lq71;->γ:Lxx;

    .line 444
    .line 445
    if-eqz v5, :cond_37

    .line 446
    .line 447
    iget-object v6, v5, Lxx;->υ:Ljava/lang/String;

    .line 448
    .line 449
    iget-object v5, v5, Lxx;->τ:Ljava/lang/String;

    .line 450
    .line 451
    new-instance v8, Ljava/util/ArrayList;

    .line 452
    .line 453
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v10

    .line 460
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v13

    .line 464
    if-eqz v13, :cond_d

    .line 465
    .line 466
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v13

    .line 470
    move-object/from16 v28, v3

    .line 471
    .line 472
    move-object v3, v13

    .line 473
    check-cast v3, Lj71;

    .line 474
    .line 475
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    iget-object v3, v3, Lj71;->α:Ljava/lang/String;

    .line 479
    .line 480
    move-object/from16 v29, v4

    .line 481
    .line 482
    const-string v4, "\u4e66\u7b7e"

    .line 483
    .line 484
    move-object/from16 v21, v5

    .line 485
    .line 486
    const/4 v5, 0x0

    .line 487
    invoke-static {v3, v4, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    if-eqz v3, :cond_c

    .line 492
    .line 493
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    :cond_c
    move-object/from16 v5, v21

    .line 497
    .line 498
    move-object/from16 v3, v28

    .line 499
    .line 500
    move-object/from16 v4, v29

    .line 501
    .line 502
    goto :goto_9

    .line 503
    :cond_d
    move-object/from16 v28, v3

    .line 504
    .line 505
    move-object/from16 v29, v4

    .line 506
    .line 507
    move-object/from16 v21, v5

    .line 508
    .line 509
    const-string v18, "\u6536\u85cf\u4e0e\u4e66\u7b7e"

    .line 510
    .line 511
    const v19, 0x7f080093

    .line 512
    .line 513
    .line 514
    move-object/from16 v20, v6

    .line 515
    .line 516
    move-object/from16 v22, v8

    .line 517
    .line 518
    move-object/from16 v17, v27

    .line 519
    .line 520
    invoke-direct/range {v16 .. v22}, Lh71;-><init>(Li71;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 521
    .line 522
    .line 523
    move-object/from16 v3, v16

    .line 524
    .line 525
    new-instance v16, Lh71;

    .line 526
    .line 527
    sget-object v4, Lq71;->γ:Lxx;

    .line 528
    .line 529
    if-eqz v4, :cond_36

    .line 530
    .line 531
    iget-object v5, v4, Lxx;->π:Ljava/lang/String;

    .line 532
    .line 533
    iget-object v4, v4, Lxx;->ο:Ljava/lang/String;

    .line 534
    .line 535
    const-string v21, "\u4e34\u65f6\u663e\u793a\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 536
    .line 537
    const-string v22, "\u6062\u590d\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 538
    .line 539
    const-string v17, "\u7fa4\u7ba1\u7406"

    .line 540
    .line 541
    const-string v18, "\u6279\u91cf\u5220\u9664\u4f1a\u8bdd"

    .line 542
    .line 543
    const-string v19, "\u4e00\u952e\u5df2\u8bfb"

    .line 544
    .line 545
    const-string v20, "\u804a\u5929\u8bb0\u5f55\u5bfc\u51fa"

    .line 546
    .line 547
    filled-new-array/range {v17 .. v22}, [Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v6

    .line 551
    invoke-static {v11, v6}, Lq71;->β(Ljava/util/List;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 552
    .line 553
    .line 554
    move-result-object v22

    .line 555
    const-string v18, "\u6d88\u606f\u5de5\u5177"

    .line 556
    .line 557
    const v19, 0x7f08009f

    .line 558
    .line 559
    .line 560
    move-object/from16 v21, v4

    .line 561
    .line 562
    move-object/from16 v20, v5

    .line 563
    .line 564
    move-object/from16 v17, v26

    .line 565
    .line 566
    invoke-direct/range {v16 .. v22}, Lh71;-><init>(Li71;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 567
    .line 568
    .line 569
    move-object/from16 v4, v16

    .line 570
    .line 571
    new-instance v16, Lh71;

    .line 572
    .line 573
    sget-object v5, Lq71;->γ:Lxx;

    .line 574
    .line 575
    if-eqz v5, :cond_35

    .line 576
    .line 577
    iget-object v6, v5, Lxx;->ξ:Ljava/lang/String;

    .line 578
    .line 579
    iget-object v5, v5, Lxx;->ν:Ljava/lang/String;

    .line 580
    .line 581
    const-string v41, "\u9ab0\u5b50\u63a7\u5236"

    .line 582
    .line 583
    const-string v42, "\u83b7\u53d6\u5185\u6d4b\u7533\u8bf7\u7801"

    .line 584
    .line 585
    const-string v30, "\u706b\u661f\u706b\u82b1\u7ba1\u7406"

    .line 586
    .line 587
    const-string v31, "\u706b\u661f\u4efb\u52a1\u8c03\u8bd5"

    .line 588
    .line 589
    const-string v32, "\u8425\u5730\u7ba1\u7406"

    .line 590
    .line 591
    const-string v33, "\u98df\u7269\u5217\u8868\u8c03\u8bd5"

    .line 592
    .line 593
    const-string v34, "\u6295\u5582\u98df\u7269"

    .line 594
    .line 595
    const-string v35, "\u4eb2\u5bc6\u5ea6\u8c03\u8bd5"

    .line 596
    .line 597
    const-string v36, "\u9886\u53d6\u706b\u661f"

    .line 598
    .line 599
    const-string v37, "\u9886\u53d6\u4eb2\u5bc6\u5ea6"

    .line 600
    .line 601
    const-string v38, "\u5b8c\u6210\u4e92\u53d1\u6d88\u606f\u4efb\u52a1"

    .line 602
    .line 603
    const-string v39, "\u706b\u661f\u53d1\u9001\u6d4b\u8bd5"

    .line 604
    .line 605
    const-string v40, "\u798f\u888b\u8c03\u8bd5"

    .line 606
    .line 607
    filled-new-array/range {v30 .. v42}, [Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v8

    .line 611
    invoke-static {v11, v8}, Lq71;->β(Ljava/util/List;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 612
    .line 613
    .line 614
    move-result-object v22

    .line 615
    const-string v18, "\u706b\u661f\u4e0e\u5185\u6d4b"

    .line 616
    .line 617
    const v19, 0x7f0800a4

    .line 618
    .line 619
    .line 620
    move-object/from16 v21, v5

    .line 621
    .line 622
    move-object/from16 v20, v6

    .line 623
    .line 624
    move-object/from16 v17, v25

    .line 625
    .line 626
    invoke-direct/range {v16 .. v22}, Lh71;-><init>(Li71;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 627
    .line 628
    .line 629
    new-instance v30, Lh71;

    .line 630
    .line 631
    sget-object v5, Lq71;->γ:Lxx;

    .line 632
    .line 633
    if-eqz v5, :cond_34

    .line 634
    .line 635
    iget-object v6, v5, Lxx;->κ:Ljava/lang/String;

    .line 636
    .line 637
    iget-object v5, v5, Lxx;->ι:Ljava/lang/String;

    .line 638
    .line 639
    const-string v8, "\u6a21\u5757\u8bbe\u7f6e"

    .line 640
    .line 641
    filled-new-array {v8}, [Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v10

    .line 645
    invoke-static {v11, v10}, Lq71;->β(Ljava/util/List;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 646
    .line 647
    .line 648
    move-result-object v36

    .line 649
    sget-object v31, Li71;->κ:Li71;

    .line 650
    .line 651
    const-string v32, "\u8bbe\u7f6e"

    .line 652
    .line 653
    const v33, 0x7f0800a3

    .line 654
    .line 655
    .line 656
    move-object/from16 v35, v5

    .line 657
    .line 658
    move-object/from16 v34, v6

    .line 659
    .line 660
    invoke-direct/range {v30 .. v36}, Lh71;-><init>(Li71;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 661
    .line 662
    .line 663
    move-object/from16 v18, v3

    .line 664
    .line 665
    move-object/from16 v19, v4

    .line 666
    .line 667
    move-object/from16 v20, v16

    .line 668
    .line 669
    move-object/from16 v16, v28

    .line 670
    .line 671
    move-object/from16 v17, v29

    .line 672
    .line 673
    move-object/from16 v21, v30

    .line 674
    .line 675
    filled-new-array/range {v16 .. v21}, [Lh71;

    .line 676
    .line 677
    .line 678
    move-result-object v3

    .line 679
    invoke-static {v3}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    new-instance v4, Ljava/util/ArrayList;

    .line 684
    .line 685
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 686
    .line 687
    .line 688
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    :cond_e
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    if-eqz v5, :cond_f

    .line 697
    .line 698
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v5

    .line 702
    move-object v6, v5

    .line 703
    check-cast v6, Lh71;

    .line 704
    .line 705
    iget-object v6, v6, Lh71;->ζ:Ljava/util/ArrayList;

    .line 706
    .line 707
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 708
    .line 709
    .line 710
    move-result v6

    .line 711
    if-nez v6, :cond_e

    .line 712
    .line 713
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    goto :goto_a

    .line 717
    :cond_f
    new-instance v3, Ljava/util/ArrayList;

    .line 718
    .line 719
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    :cond_10
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 727
    .line 728
    .line 729
    move-result v5

    .line 730
    if-eqz v5, :cond_11

    .line 731
    .line 732
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v5

    .line 736
    move-object v6, v5

    .line 737
    check-cast v6, Lh71;

    .line 738
    .line 739
    iget-object v6, v6, Lh71;->α:Li71;

    .line 740
    .line 741
    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v6

    .line 745
    if-eqz v6, :cond_10

    .line 746
    .line 747
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    goto :goto_b

    .line 751
    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    const/high16 v5, 0x41500000    # 13.0f

    .line 756
    .line 757
    const/16 v6, 0x10

    .line 758
    .line 759
    if-eqz v1, :cond_13

    .line 760
    .line 761
    new-instance v1, Landroid/widget/TextView;

    .line 762
    .line 763
    invoke-direct {v1, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 764
    .line 765
    .line 766
    const-string v3, "\u5f53\u524d\u573a\u666f\u6682\u65e0\u53ef\u7528\u64cd\u4f5c"

    .line 767
    .line 768
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 772
    .line 773
    .line 774
    const/16 v3, 0x11

    .line 775
    .line 776
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 777
    .line 778
    .line 779
    sget-object v3, Lq71;->γ:Lxx;

    .line 780
    .line 781
    if-eqz v3, :cond_12

    .line 782
    .line 783
    iget-object v3, v3, Lxx;->θ:Ljava/lang/String;

    .line 784
    .line 785
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 790
    .line 791
    .line 792
    invoke-static {v9, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    const/16 v5, 0x24

    .line 797
    .line 798
    invoke-static {v9, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 799
    .line 800
    .line 801
    move-result v10

    .line 802
    invoke-static {v9, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 803
    .line 804
    .line 805
    move-result v6

    .line 806
    invoke-static {v9, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 807
    .line 808
    .line 809
    move-result v5

    .line 810
    invoke-virtual {v1, v3, v10, v6, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 814
    .line 815
    .line 816
    move-object v4, v8

    .line 817
    move-object v3, v12

    .line 818
    move-object v0, v15

    .line 819
    const/16 v6, 0x8

    .line 820
    .line 821
    const/4 v8, 0x0

    .line 822
    goto/16 :goto_18

    .line 823
    .line 824
    :cond_12
    invoke-static {v14}, Lln0;->и(Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    throw p1

    .line 828
    :cond_13
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    const/4 v3, 0x0

    .line 833
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 834
    .line 835
    .line 836
    move-result v10

    .line 837
    if-eqz v10, :cond_2e

    .line 838
    .line 839
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v10

    .line 843
    add-int/lit8 v16, v3, 0x1

    .line 844
    .line 845
    if-ltz v3, :cond_2d

    .line 846
    .line 847
    check-cast v10, Lh71;

    .line 848
    .line 849
    if-lez v3, :cond_14

    .line 850
    .line 851
    const/16 v3, 0xc

    .line 852
    .line 853
    invoke-static {v9, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 854
    .line 855
    .line 856
    move-result v3

    .line 857
    invoke-static {v9, v3}, Lq71;->Μ(Landroid/app/Activity;I)Landroid/view/View;

    .line 858
    .line 859
    .line 860
    move-result-object v3

    .line 861
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 862
    .line 863
    .line 864
    :cond_14
    sget-object v3, Lx01;->α:Lx01;

    .line 865
    .line 866
    invoke-virtual {v3, v9}, Lx01;->α(Landroid/content/Context;)Lw01;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    new-instance v11, Landroid/widget/LinearLayout;

    .line 871
    .line 872
    invoke-direct {v11, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 873
    .line 874
    .line 875
    const/4 v13, 0x1

    .line 876
    invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 877
    .line 878
    .line 879
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 880
    .line 881
    const/4 v4, -0x1

    .line 882
    const/4 v5, -0x2

    .line 883
    invoke-direct {v13, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v11, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 887
    .line 888
    .line 889
    new-instance v13, Landroid/widget/LinearLayout;

    .line 890
    .line 891
    invoke-direct {v13, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 892
    .line 893
    .line 894
    const/4 v4, 0x0

    .line 895
    invoke-virtual {v13, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v13, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 899
    .line 900
    .line 901
    const/4 v6, 0x4

    .line 902
    invoke-static {v9, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 903
    .line 904
    .line 905
    move-result v5

    .line 906
    invoke-static {v9, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 907
    .line 908
    .line 909
    move-result v6

    .line 910
    move-object/from16 v22, v1

    .line 911
    .line 912
    const/4 v1, 0x7

    .line 913
    move-object/from16 v25, v8

    .line 914
    .line 915
    invoke-static {v9, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 916
    .line 917
    .line 918
    move-result v8

    .line 919
    invoke-virtual {v13, v5, v4, v6, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 920
    .line 921
    .line 922
    new-instance v4, Landroid/widget/ImageView;

    .line 923
    .line 924
    invoke-direct {v4, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 925
    .line 926
    .line 927
    iget v5, v10, Lh71;->γ:I

    .line 928
    .line 929
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 930
    .line 931
    .line 932
    iget-object v5, v10, Lh71;->ε:Ljava/lang/String;

    .line 933
    .line 934
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 935
    .line 936
    .line 937
    move-result v5

    .line 938
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 939
    .line 940
    .line 941
    move-result-object v5

    .line 942
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 943
    .line 944
    .line 945
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 946
    .line 947
    const/16 v6, 0x12

    .line 948
    .line 949
    invoke-static {v9, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 950
    .line 951
    .line 952
    move-result v8

    .line 953
    invoke-static {v9, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 954
    .line 955
    .line 956
    move-result v6

    .line 957
    invoke-direct {v5, v8, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v13, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 964
    .line 965
    .line 966
    new-instance v4, Landroid/widget/TextView;

    .line 967
    .line 968
    invoke-direct {v4, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 969
    .line 970
    .line 971
    iget-object v5, v10, Lh71;->β:Ljava/lang/String;

    .line 972
    .line 973
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 974
    .line 975
    .line 976
    const/high16 v5, 0x41500000    # 13.0f

    .line 977
    .line 978
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 979
    .line 980
    .line 981
    move-object/from16 v8, p1

    .line 982
    .line 983
    const/4 v6, 0x1

    .line 984
    invoke-virtual {v4, v8, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 985
    .line 986
    .line 987
    sget-object v6, Lq71;->γ:Lxx;

    .line 988
    .line 989
    if-eqz v6, :cond_2c

    .line 990
    .line 991
    iget-object v6, v6, Lxx;->η:Ljava/lang/String;

    .line 992
    .line 993
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 994
    .line 995
    .line 996
    move-result v6

    .line 997
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 998
    .line 999
    .line 1000
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1001
    .line 1002
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1003
    .line 1004
    move-object/from16 v21, v14

    .line 1005
    .line 1006
    const/4 v5, 0x0

    .line 1007
    const/4 v14, -0x2

    .line 1008
    invoke-direct {v6, v5, v14, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1009
    .line 1010
    .line 1011
    invoke-static {v9, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1012
    .line 1013
    .line 1014
    move-result v1

    .line 1015
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v13, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v11, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1025
    .line 1026
    .line 1027
    new-instance v1, Landroid/widget/LinearLayout;

    .line 1028
    .line 1029
    invoke-direct {v1, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1030
    .line 1031
    .line 1032
    const/4 v6, 0x1

    .line 1033
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1034
    .line 1035
    .line 1036
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 1037
    .line 1038
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1039
    .line 1040
    .line 1041
    sget-object v5, Lq71;->γ:Lxx;

    .line 1042
    .line 1043
    if-eqz v5, :cond_2b

    .line 1044
    .line 1045
    iget-object v5, v5, Lxx;->γ:Ljava/lang/String;

    .line 1046
    .line 1047
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1048
    .line 1049
    .line 1050
    move-result v5

    .line 1051
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1052
    .line 1053
    .line 1054
    const/16 v5, 0x8

    .line 1055
    .line 1056
    invoke-static {v9, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1057
    .line 1058
    .line 1059
    move-result v6

    .line 1060
    int-to-float v5, v6

    .line 1061
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1065
    .line 1066
    .line 1067
    iget-object v4, v10, Lh71;->ζ:Ljava/util/ArrayList;

    .line 1068
    .line 1069
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v4

    .line 1073
    const/4 v5, 0x0

    .line 1074
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1075
    .line 1076
    .line 1077
    move-result v6

    .line 1078
    if-eqz v6, :cond_2a

    .line 1079
    .line 1080
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v6

    .line 1084
    add-int/lit8 v14, v5, 0x1

    .line 1085
    .line 1086
    if-ltz v5, :cond_29

    .line 1087
    .line 1088
    check-cast v6, Lj71;

    .line 1089
    .line 1090
    const/16 v8, 0x3c

    .line 1091
    .line 1092
    if-lez v5, :cond_16

    .line 1093
    .line 1094
    new-instance v5, Landroid/view/View;

    .line 1095
    .line 1096
    invoke-direct {v5, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1097
    .line 1098
    .line 1099
    sget-object v10, Lq71;->γ:Lxx;

    .line 1100
    .line 1101
    if-eqz v10, :cond_15

    .line 1102
    .line 1103
    iget-object v10, v10, Lxx;->ε:Ljava/lang/String;

    .line 1104
    .line 1105
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1106
    .line 1107
    .line 1108
    move-result v10

    .line 1109
    invoke-virtual {v5, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1110
    .line 1111
    .line 1112
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 1113
    .line 1114
    move-object/from16 v26, v3

    .line 1115
    .line 1116
    const/4 v13, 0x1

    .line 1117
    invoke-static {v9, v13}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1118
    .line 1119
    .line 1120
    move-result v3

    .line 1121
    const/4 v13, -0x1

    .line 1122
    invoke-direct {v10, v13, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1123
    .line 1124
    .line 1125
    invoke-static {v9, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1126
    .line 1127
    .line 1128
    move-result v3

    .line 1129
    invoke-virtual {v10, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v5, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1136
    .line 1137
    .line 1138
    :goto_e
    const/4 v3, 0x0

    .line 1139
    goto :goto_f

    .line 1140
    :cond_15
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    const/4 v3, 0x0

    .line 1144
    throw v3

    .line 1145
    :cond_16
    move-object/from16 v26, v3

    .line 1146
    .line 1147
    const/4 v13, -0x1

    .line 1148
    goto :goto_e

    .line 1149
    :goto_f
    sget-object v5, Lx01;->α:Lx01;

    .line 1150
    .line 1151
    invoke-virtual {v5, v9}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v5

    .line 1155
    const v10, 0x7f0c0055

    .line 1156
    .line 1157
    .line 1158
    const/4 v13, 0x0

    .line 1159
    invoke-virtual {v5, v10, v3, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v5

    .line 1163
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1164
    .line 1165
    .line 1166
    check-cast v5, Landroid/widget/LinearLayout;

    .line 1167
    .line 1168
    const v3, 0x7f09022b

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v3

    .line 1175
    check-cast v3, Landroid/widget/FrameLayout;

    .line 1176
    .line 1177
    const v10, 0x7f09022e

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v5, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v10

    .line 1184
    check-cast v10, Landroid/widget/ImageView;

    .line 1185
    .line 1186
    const v13, 0x7f090248

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v5, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v13

    .line 1193
    check-cast v13, Landroid/widget/TextView;

    .line 1194
    .line 1195
    const v8, 0x7f090247

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v8

    .line 1202
    check-cast v8, Landroid/widget/TextView;

    .line 1203
    .line 1204
    move-object/from16 v28, v4

    .line 1205
    .line 1206
    const v4, 0x7f090246

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v4

    .line 1213
    check-cast v4, Landroid/widget/TextView;

    .line 1214
    .line 1215
    move-object/from16 v29, v11

    .line 1216
    .line 1217
    const v11, 0x7f09022f

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v5, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v11

    .line 1224
    check-cast v11, Landroid/widget/ImageView;

    .line 1225
    .line 1226
    move/from16 v30, v14

    .line 1227
    .line 1228
    const v14, 0x7f09022c

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v5, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v14

    .line 1235
    check-cast v14, Landroid/widget/ImageView;

    .line 1236
    .line 1237
    sget-object v0, Lq71;->γ:Lxx;

    .line 1238
    .line 1239
    if-eqz v0, :cond_28

    .line 1240
    .line 1241
    iget-object v0, v0, Lxx;->Α:Ljava/lang/String;

    .line 1242
    .line 1243
    invoke-static {v0}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    invoke-virtual {v5, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1248
    .line 1249
    .line 1250
    const/16 v0, 0x3c

    .line 1251
    .line 1252
    invoke-static {v9, v0}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1253
    .line 1254
    .line 1255
    move-result v0

    .line 1256
    invoke-virtual {v5, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1257
    .line 1258
    .line 1259
    new-instance v0, Ls61;

    .line 1260
    .line 1261
    move-object/from16 v27, v15

    .line 1262
    .line 1263
    const/4 v15, 0x0

    .line 1264
    invoke-direct {v0, v12, v6, v15}, Ls61;-><init>(La71;Lj71;I)V

    .line 1265
    .line 1266
    .line 1267
    invoke-static {v2, v5, v0}, Lq71;->Η(Lq71;Landroid/view/View;Lp70;)V

    .line 1268
    .line 1269
    .line 1270
    iget-boolean v0, v6, Lj71;->η:Z

    .line 1271
    .line 1272
    iget-object v15, v6, Lj71;->α:Ljava/lang/String;

    .line 1273
    .line 1274
    move/from16 v31, v0

    .line 1275
    .line 1276
    iget-object v0, v6, Lj71;->β:Ljava/lang/String;

    .line 1277
    .line 1278
    if-eqz v31, :cond_18

    .line 1279
    .line 1280
    move-object/from16 v32, v12

    .line 1281
    .line 1282
    sget-object v12, Lq71;->γ:Lxx;

    .line 1283
    .line 1284
    if-eqz v12, :cond_17

    .line 1285
    .line 1286
    iget-object v12, v12, Lxx;->χ:Ljava/lang/String;

    .line 1287
    .line 1288
    const/16 p1, 0x0

    .line 1289
    .line 1290
    goto :goto_10

    .line 1291
    :cond_17
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    const/4 v12, 0x0

    .line 1295
    throw v12

    .line 1296
    :cond_18
    move-object/from16 v32, v12

    .line 1297
    .line 1298
    const/16 p1, 0x0

    .line 1299
    .line 1300
    iget-object v12, v6, Lj71;->ε:Ljava/lang/String;

    .line 1301
    .line 1302
    :goto_10
    if-eqz v31, :cond_1a

    .line 1303
    .line 1304
    move-object/from16 v33, v7

    .line 1305
    .line 1306
    sget-object v7, Lq71;->γ:Lxx;

    .line 1307
    .line 1308
    if-eqz v7, :cond_19

    .line 1309
    .line 1310
    iget-object v7, v7, Lxx;->φ:Ljava/lang/String;

    .line 1311
    .line 1312
    :goto_11
    move-object/from16 v34, v7

    .line 1313
    .line 1314
    const/16 v7, 0x8

    .line 1315
    .line 1316
    goto :goto_12

    .line 1317
    :cond_19
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1318
    .line 1319
    .line 1320
    throw p1

    .line 1321
    :cond_1a
    move-object/from16 v33, v7

    .line 1322
    .line 1323
    iget-object v7, v6, Lj71;->ζ:Ljava/lang/String;

    .line 1324
    .line 1325
    goto :goto_11

    .line 1326
    :goto_12
    invoke-static {v7, v9, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v12

    .line 1330
    invoke-virtual {v3, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1331
    .line 1332
    .line 1333
    iget v3, v6, Lj71;->δ:I

    .line 1334
    .line 1335
    invoke-virtual {v10, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1336
    .line 1337
    .line 1338
    invoke-static/range {v34 .. v34}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1339
    .line 1340
    .line 1341
    move-result v3

    .line 1342
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v3

    .line 1346
    invoke-virtual {v10, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1350
    .line 1351
    .line 1352
    if-eqz v31, :cond_1c

    .line 1353
    .line 1354
    sget-object v3, Lq71;->γ:Lxx;

    .line 1355
    .line 1356
    if-eqz v3, :cond_1b

    .line 1357
    .line 1358
    iget-object v3, v3, Lxx;->θ:Ljava/lang/String;

    .line 1359
    .line 1360
    move-object v7, v3

    .line 1361
    const/4 v3, 0x0

    .line 1362
    goto :goto_13

    .line 1363
    :cond_1b
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1364
    .line 1365
    .line 1366
    const/4 v3, 0x0

    .line 1367
    throw v3

    .line 1368
    :cond_1c
    const/4 v3, 0x0

    .line 1369
    sget-object v7, Lq71;->γ:Lxx;

    .line 1370
    .line 1371
    if-eqz v7, :cond_27

    .line 1372
    .line 1373
    iget-object v7, v7, Lxx;->ζ:Ljava/lang/String;

    .line 1374
    .line 1375
    :goto_13
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1376
    .line 1377
    .line 1378
    move-result v7

    .line 1379
    invoke-virtual {v13, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1380
    .line 1381
    .line 1382
    const/4 v7, 0x1

    .line 1383
    invoke-virtual {v13, v3, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1384
    .line 1385
    .line 1386
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1387
    .line 1388
    .line 1389
    move-result v3

    .line 1390
    if-eqz v3, :cond_1d

    .line 1391
    .line 1392
    const/16 v3, 0x8

    .line 1393
    .line 1394
    goto :goto_14

    .line 1395
    :cond_1d
    const/4 v3, 0x0

    .line 1396
    :goto_14
    invoke-virtual {v8, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1400
    .line 1401
    .line 1402
    sget-object v3, Lq71;->γ:Lxx;

    .line 1403
    .line 1404
    if-eqz v3, :cond_26

    .line 1405
    .line 1406
    iget-object v3, v3, Lxx;->θ:Ljava/lang/String;

    .line 1407
    .line 1408
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1409
    .line 1410
    .line 1411
    move-result v3

    .line 1412
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1413
    .line 1414
    .line 1415
    if-eqz v31, :cond_1e

    .line 1416
    .line 1417
    const/4 v3, 0x0

    .line 1418
    goto :goto_15

    .line 1419
    :cond_1e
    const/16 v3, 0x8

    .line 1420
    .line 1421
    :goto_15
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1422
    .line 1423
    .line 1424
    const-string v3, "\u4fe1\u606f\u4e0d\u8db3"

    .line 1425
    .line 1426
    const/4 v8, 0x0

    .line 1427
    invoke-static {v0, v3, v8}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1428
    .line 1429
    .line 1430
    move-result v0

    .line 1431
    const/4 v7, 0x1

    .line 1432
    if-ne v0, v7, :cond_1f

    .line 1433
    .line 1434
    const-string v0, "\u4e0d\u53ef\u7528"

    .line 1435
    .line 1436
    goto :goto_16

    .line 1437
    :cond_1f
    const-string v0, "\u5185\u6d4b"

    .line 1438
    .line 1439
    :goto_16
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1440
    .line 1441
    .line 1442
    sget-object v0, Lq71;->γ:Lxx;

    .line 1443
    .line 1444
    if-eqz v0, :cond_25

    .line 1445
    .line 1446
    iget-object v0, v0, Lxx;->η:Ljava/lang/String;

    .line 1447
    .line 1448
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1449
    .line 1450
    .line 1451
    move-result v0

    .line 1452
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1453
    .line 1454
    .line 1455
    sget-object v0, Lq71;->γ:Lxx;

    .line 1456
    .line 1457
    if-eqz v0, :cond_24

    .line 1458
    .line 1459
    iget-object v0, v0, Lxx;->χ:Ljava/lang/String;

    .line 1460
    .line 1461
    const/4 v3, 0x6

    .line 1462
    invoke-static {v3, v9, v0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v0

    .line 1466
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1467
    .line 1468
    .line 1469
    const v0, 0x7f080096

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1473
    .line 1474
    .line 1475
    sget-object v0, Lq71;->γ:Lxx;

    .line 1476
    .line 1477
    if-eqz v0, :cond_23

    .line 1478
    .line 1479
    iget-object v0, v0, Lxx;->θ:Ljava/lang/String;

    .line 1480
    .line 1481
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1482
    .line 1483
    .line 1484
    move-result v0

    .line 1485
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v0

    .line 1489
    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 1490
    .line 1491
    .line 1492
    iget-object v12, v6, Lj71;->ι:Lp70;

    .line 1493
    .line 1494
    if-eqz v12, :cond_22

    .line 1495
    .line 1496
    const/4 v8, 0x0

    .line 1497
    invoke-virtual {v11, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1498
    .line 1499
    .line 1500
    const/16 v0, 0x8

    .line 1501
    .line 1502
    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1503
    .line 1504
    .line 1505
    const v0, 0x7f0800a0

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1509
    .line 1510
    .line 1511
    sget-object v0, Lq71;->γ:Lxx;

    .line 1512
    .line 1513
    if-eqz v0, :cond_21

    .line 1514
    .line 1515
    iget-object v0, v0, Lxx;->η:Ljava/lang/String;

    .line 1516
    .line 1517
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1518
    .line 1519
    .line 1520
    move-result v0

    .line 1521
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 1526
    .line 1527
    .line 1528
    const-string v0, "\u66f4\u591a\uff1a"

    .line 1529
    .line 1530
    invoke-virtual {v0, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    invoke-virtual {v11, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1535
    .line 1536
    .line 1537
    sget-object v0, Lq71;->γ:Lxx;

    .line 1538
    .line 1539
    if-eqz v0, :cond_20

    .line 1540
    .line 1541
    iget-object v0, v0, Lxx;->Α:Ljava/lang/String;

    .line 1542
    .line 1543
    const-string v3, "#00000000"

    .line 1544
    .line 1545
    const/16 v4, 0x8

    .line 1546
    .line 1547
    invoke-static {v4, v9, v0, v3}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v0

    .line 1551
    invoke-virtual {v11, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1552
    .line 1553
    .line 1554
    new-instance v8, Lxb0;

    .line 1555
    .line 1556
    const/4 v13, 0x2

    .line 1557
    move-object v10, v11

    .line 1558
    move-object/from16 v4, v25

    .line 1559
    .line 1560
    move-object/from16 v0, v29

    .line 1561
    .line 1562
    move-object/from16 v3, v32

    .line 1563
    .line 1564
    const/16 v19, -0x1

    .line 1565
    .line 1566
    move-object v11, v6

    .line 1567
    invoke-direct/range {v8 .. v13}, Lxb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1568
    .line 1569
    .line 1570
    invoke-static {v2, v10, v8}, Lq71;->Η(Lq71;Landroid/view/View;Lp70;)V

    .line 1571
    .line 1572
    .line 1573
    new-instance v6, Lt61;

    .line 1574
    .line 1575
    const/4 v8, 0x0

    .line 1576
    invoke-direct {v6, v8, v12}, Lt61;-><init>(ILjava/lang/Object;)V

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1580
    .line 1581
    .line 1582
    const/16 v6, 0x8

    .line 1583
    .line 1584
    const/4 v12, 0x0

    .line 1585
    goto :goto_17

    .line 1586
    :cond_20
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1587
    .line 1588
    .line 1589
    const/4 v12, 0x0

    .line 1590
    throw v12

    .line 1591
    :cond_21
    const/4 v12, 0x0

    .line 1592
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1593
    .line 1594
    .line 1595
    throw v12

    .line 1596
    :cond_22
    move-object v10, v11

    .line 1597
    move-object/from16 v4, v25

    .line 1598
    .line 1599
    move-object/from16 v0, v29

    .line 1600
    .line 1601
    move-object/from16 v3, v32

    .line 1602
    .line 1603
    const/16 v6, 0x8

    .line 1604
    .line 1605
    const/4 v8, 0x0

    .line 1606
    const/4 v12, 0x0

    .line 1607
    const/16 v19, -0x1

    .line 1608
    .line 1609
    invoke-virtual {v10, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1610
    .line 1611
    .line 1612
    invoke-virtual {v14, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1613
    .line 1614
    .line 1615
    :goto_17
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1616
    .line 1617
    .line 1618
    move-object v11, v0

    .line 1619
    move-object v12, v3

    .line 1620
    move-object/from16 v25, v4

    .line 1621
    .line 1622
    move-object/from16 v3, v26

    .line 1623
    .line 1624
    move-object/from16 v15, v27

    .line 1625
    .line 1626
    move-object/from16 v4, v28

    .line 1627
    .line 1628
    move/from16 v5, v30

    .line 1629
    .line 1630
    move-object/from16 v7, v33

    .line 1631
    .line 1632
    move-object/from16 v0, p0

    .line 1633
    .line 1634
    goto/16 :goto_d

    .line 1635
    .line 1636
    :cond_23
    const/4 v12, 0x0

    .line 1637
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1638
    .line 1639
    .line 1640
    throw v12

    .line 1641
    :cond_24
    const/4 v12, 0x0

    .line 1642
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1643
    .line 1644
    .line 1645
    throw v12

    .line 1646
    :cond_25
    const/4 v12, 0x0

    .line 1647
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1648
    .line 1649
    .line 1650
    throw v12

    .line 1651
    :cond_26
    const/4 v12, 0x0

    .line 1652
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1653
    .line 1654
    .line 1655
    throw v12

    .line 1656
    :cond_27
    move-object v12, v3

    .line 1657
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1658
    .line 1659
    .line 1660
    throw v12

    .line 1661
    :cond_28
    const/4 v12, 0x0

    .line 1662
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1663
    .line 1664
    .line 1665
    throw v12

    .line 1666
    :cond_29
    const/4 v12, 0x0

    .line 1667
    invoke-static {}, Lyh;->х()V

    .line 1668
    .line 1669
    .line 1670
    throw v12

    .line 1671
    :cond_2a
    move-object/from16 v33, v7

    .line 1672
    .line 1673
    move-object v0, v11

    .line 1674
    move-object v3, v12

    .line 1675
    move-object/from16 v27, v15

    .line 1676
    .line 1677
    move-object/from16 v4, v25

    .line 1678
    .line 1679
    const/16 v6, 0x8

    .line 1680
    .line 1681
    const/4 v7, 0x1

    .line 1682
    const/4 v8, 0x0

    .line 1683
    const/4 v12, 0x0

    .line 1684
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1685
    .line 1686
    .line 1687
    move-object/from16 v1, v33

    .line 1688
    .line 1689
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1690
    .line 1691
    .line 1692
    move-object/from16 v0, p0

    .line 1693
    .line 1694
    move-object v7, v1

    .line 1695
    move-object v8, v4

    .line 1696
    move-object/from16 p1, v12

    .line 1697
    .line 1698
    move-object/from16 v14, v21

    .line 1699
    .line 1700
    move-object/from16 v1, v22

    .line 1701
    .line 1702
    const/high16 v5, 0x41500000    # 13.0f

    .line 1703
    .line 1704
    const/16 v6, 0x10

    .line 1705
    .line 1706
    move-object v12, v3

    .line 1707
    move/from16 v3, v16

    .line 1708
    .line 1709
    goto/16 :goto_c

    .line 1710
    .line 1711
    :cond_2b
    const/4 v12, 0x0

    .line 1712
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1713
    .line 1714
    .line 1715
    throw v12

    .line 1716
    :cond_2c
    move-object/from16 v21, v14

    .line 1717
    .line 1718
    const/4 v12, 0x0

    .line 1719
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1720
    .line 1721
    .line 1722
    throw v12

    .line 1723
    :cond_2d
    move-object/from16 v12, p1

    .line 1724
    .line 1725
    invoke-static {}, Lyh;->х()V

    .line 1726
    .line 1727
    .line 1728
    throw v12

    .line 1729
    :cond_2e
    move-object v4, v8

    .line 1730
    move-object v3, v12

    .line 1731
    const/16 v6, 0x8

    .line 1732
    .line 1733
    const/4 v8, 0x0

    .line 1734
    move-object v0, v15

    .line 1735
    :goto_18
    iget-object v0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 1736
    .line 1737
    check-cast v0, Ljava/lang/Iterable;

    .line 1738
    .line 1739
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v0

    .line 1743
    :cond_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1744
    .line 1745
    .line 1746
    move-result v1

    .line 1747
    if-eqz v1, :cond_30

    .line 1748
    .line 1749
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v1

    .line 1753
    move-object v5, v1

    .line 1754
    check-cast v5, Lj71;

    .line 1755
    .line 1756
    iget-object v5, v5, Lj71;->α:Ljava/lang/String;

    .line 1757
    .line 1758
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1759
    .line 1760
    .line 1761
    move-result v5

    .line 1762
    if-eqz v5, :cond_2f

    .line 1763
    .line 1764
    move-object v14, v1

    .line 1765
    goto :goto_19

    .line 1766
    :cond_30
    const/4 v14, 0x0

    .line 1767
    :goto_19
    check-cast v14, Lj71;

    .line 1768
    .line 1769
    if-nez v14, :cond_31

    .line 1770
    .line 1771
    :goto_1a
    move-object/from16 v0, p0

    .line 1772
    .line 1773
    goto :goto_1b

    .line 1774
    :cond_31
    move v6, v8

    .line 1775
    goto :goto_1a

    .line 1776
    :goto_1b
    iget-object v1, v0, Lb71;->μ:Landroid/widget/LinearLayout;

    .line 1777
    .line 1778
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 1782
    .line 1783
    .line 1784
    move-result v4

    .line 1785
    iget-object v5, v0, Lb71;->ν:Landroid/view/View;

    .line 1786
    .line 1787
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1788
    .line 1789
    .line 1790
    if-eqz v14, :cond_32

    .line 1791
    .line 1792
    new-instance v4, Ls61;

    .line 1793
    .line 1794
    const/4 v5, 0x2

    .line 1795
    invoke-direct {v4, v3, v14, v5}, Ls61;-><init>(La71;Lj71;I)V

    .line 1796
    .line 1797
    .line 1798
    invoke-static {v2, v1, v4}, Lq71;->Η(Lq71;Landroid/view/View;Lp70;)V

    .line 1799
    .line 1800
    .line 1801
    :cond_32
    if-eqz v24, :cond_33

    .line 1802
    .line 1803
    new-instance v1, Lν;

    .line 1804
    .line 1805
    const/16 v2, 0x16

    .line 1806
    .line 1807
    iget-object v0, v0, Lb71;->ξ:Landroid/widget/ScrollView;

    .line 1808
    .line 1809
    invoke-direct {v1, v2, v0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1813
    .line 1814
    .line 1815
    :cond_33
    sget-object v0, Ls62;->α:Ls62;

    .line 1816
    .line 1817
    return-object v0

    .line 1818
    :cond_34
    move-object/from16 v21, v14

    .line 1819
    .line 1820
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1821
    .line 1822
    .line 1823
    const/4 v3, 0x0

    .line 1824
    throw v3

    .line 1825
    :cond_35
    move-object/from16 v3, p1

    .line 1826
    .line 1827
    move-object/from16 v21, v14

    .line 1828
    .line 1829
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1830
    .line 1831
    .line 1832
    throw v3

    .line 1833
    :cond_36
    move-object/from16 v3, p1

    .line 1834
    .line 1835
    move-object/from16 v21, v14

    .line 1836
    .line 1837
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1838
    .line 1839
    .line 1840
    throw v3

    .line 1841
    :cond_37
    move-object/from16 v3, p1

    .line 1842
    .line 1843
    move-object/from16 v21, v14

    .line 1844
    .line 1845
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1846
    .line 1847
    .line 1848
    throw v3

    .line 1849
    :cond_38
    move-object/from16 v3, p1

    .line 1850
    .line 1851
    move-object/from16 v21, v14

    .line 1852
    .line 1853
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1854
    .line 1855
    .line 1856
    throw v3

    .line 1857
    :cond_39
    move-object/from16 v3, p1

    .line 1858
    .line 1859
    move-object/from16 v21, v14

    .line 1860
    .line 1861
    invoke-static/range {v21 .. v21}, Lln0;->и(Ljava/lang/String;)V

    .line 1862
    .line 1863
    .line 1864
    throw v3

    .line 1865
    :cond_3a
    const/4 v3, 0x0

    .line 1866
    const-string v0, "quickPager"

    .line 1867
    .line 1868
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1869
    .line 1870
    .line 1871
    throw v3
.end method
