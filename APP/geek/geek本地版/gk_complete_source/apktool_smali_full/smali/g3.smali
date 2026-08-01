.class public final Lg3;
.super Ljava/lang/Object;

# interfaces
.implements Lqw;
.implements Lyc;
.implements Lcv;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr3;


# direct methods
.method public synthetic constructor <init>(Lr3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lg3;->b:Lr3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lku;Z)V
    .locals 9

    .line 1
    iget v0, p0, Lg3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lku;->k()Lku;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, p1, :cond_0

    .line 13
    .line 14
    move v3, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v1

    .line 17
    :goto_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_1
    iget-object v4, p0, Lg3;->b:Lr3;

    .line 21
    .line 22
    iget-object v5, v4, Lr3;->L:[Lq3;

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    array-length v6, v5

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move v6, v1

    .line 29
    :goto_1
    if-ge v1, v6, :cond_4

    .line 30
    .line 31
    aget-object v7, v5, v1

    .line 32
    .line 33
    if-eqz v7, :cond_3

    .line 34
    .line 35
    iget-object v8, v7, Lq3;->h:Lku;

    .line 36
    .line 37
    if-ne v8, p1, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    const/4 v7, 0x0

    .line 44
    :goto_2
    if-eqz v7, :cond_6

    .line 45
    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    iget p1, v7, Lq3;->a:I

    .line 49
    .line 50
    invoke-virtual {v4, p1, v7, v0}, Lr3;->q(ILq3;Lku;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v7, v2}, Lr3;->s(Lq3;Z)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_5
    invoke-virtual {v4, v7, p2}, Lr3;->s(Lq3;Z)V

    .line 58
    .line 59
    .line 60
    :cond_6
    :goto_3
    return-void

    .line 61
    :pswitch_0
    iget-object p2, p0, Lg3;->b:Lr3;

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Lr3;->r(Lku;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public d(Landroid/view/View;Lwc0;)Lwc0;
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    invoke-virtual {v2}, Lwc0;->d()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    move-object/from16 v4, p0

    .line 10
    .line 11
    iget-object v5, v4, Lg3;->b:Lr3;

    .line 12
    .line 13
    iget-object v6, v5, Lr3;->k:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v2}, Lwc0;->d()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v0, v5, Lr3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 20
    .line 21
    const/16 v8, 0x8

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    if-eqz v0, :cond_f

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 31
    .line 32
    if-eqz v0, :cond_f

    .line 33
    .line 34
    iget-object v0, v5, Lr3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v10, v0

    .line 41
    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 42
    .line 43
    iget-object v0, v5, Lr3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_c

    .line 50
    .line 51
    iget-object v0, v5, Lr3;->c0:Landroid/graphics/Rect;

    .line 52
    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    new-instance v0, Landroid/graphics/Rect;

    .line 56
    .line 57
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, v5, Lr3;->c0:Landroid/graphics/Rect;

    .line 61
    .line 62
    new-instance v0, Landroid/graphics/Rect;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v0, v5, Lr3;->d0:Landroid/graphics/Rect;

    .line 68
    .line 69
    :cond_0
    iget-object v12, v5, Lr3;->c0:Landroid/graphics/Rect;

    .line 70
    .line 71
    iget-object v0, v5, Lr3;->d0:Landroid/graphics/Rect;

    .line 72
    .line 73
    invoke-virtual {v2}, Lwc0;->b()I

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    invoke-virtual {v2}, Lwc0;->d()I

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    invoke-virtual {v2}, Lwc0;->c()I

    .line 82
    .line 83
    .line 84
    move-result v15

    .line 85
    invoke-virtual {v2}, Lwc0;->a()I

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    invoke-virtual {v12, v13, v14, v15, v11}, Landroid/graphics/Rect;->set(IIII)V

    .line 90
    .line 91
    .line 92
    iget-object v11, v5, Lr3;->A:Landroid/view/ViewGroup;

    .line 93
    .line 94
    sget-object v13, Lcb0;->a:Ljava/lang/reflect/Method;

    .line 95
    .line 96
    if-eqz v13, :cond_1

    .line 97
    .line 98
    :try_start_0
    filled-new-array {v12, v0}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v13, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catch_0
    move-exception v0

    .line 107
    const-string v11, "ViewUtils"

    .line 108
    .line 109
    const-string v13, "Could not invoke computeFitSystemWindows"

    .line 110
    .line 111
    invoke-static {v11, v13, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 112
    .line 113
    .line 114
    :cond_1
    :goto_0
    iget v0, v12, Landroid/graphics/Rect;->top:I

    .line 115
    .line 116
    iget v11, v12, Landroid/graphics/Rect;->left:I

    .line 117
    .line 118
    iget v12, v12, Landroid/graphics/Rect;->right:I

    .line 119
    .line 120
    iget-object v13, v5, Lr3;->A:Landroid/view/ViewGroup;

    .line 121
    .line 122
    sget-object v14, Lja0;->a:Ljava/util/WeakHashMap;

    .line 123
    .line 124
    invoke-static {v13}, Lz90;->a(Landroid/view/View;)Lwc0;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    if-nez v13, :cond_2

    .line 129
    .line 130
    move v14, v9

    .line 131
    goto :goto_1

    .line 132
    :cond_2
    invoke-virtual {v13}, Lwc0;->b()I

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    :goto_1
    if-nez v13, :cond_3

    .line 137
    .line 138
    move v13, v9

    .line 139
    goto :goto_2

    .line 140
    :cond_3
    invoke-virtual {v13}, Lwc0;->c()I

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    :goto_2
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 145
    .line 146
    if-ne v15, v0, :cond_5

    .line 147
    .line 148
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 149
    .line 150
    if-ne v15, v11, :cond_5

    .line 151
    .line 152
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 153
    .line 154
    if-eq v15, v12, :cond_4

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_4
    move v11, v9

    .line 158
    goto :goto_4

    .line 159
    :cond_5
    :goto_3
    iput v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 160
    .line 161
    iput v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 162
    .line 163
    iput v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 164
    .line 165
    const/4 v11, 0x1

    .line 166
    :goto_4
    if-lez v0, :cond_6

    .line 167
    .line 168
    iget-object v0, v5, Lr3;->C:Landroid/view/View;

    .line 169
    .line 170
    if-nez v0, :cond_6

    .line 171
    .line 172
    new-instance v0, Landroid/view/View;

    .line 173
    .line 174
    invoke-direct {v0, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 175
    .line 176
    .line 177
    iput-object v0, v5, Lr3;->C:Landroid/view/View;

    .line 178
    .line 179
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 180
    .line 181
    .line 182
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 183
    .line 184
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 185
    .line 186
    const/16 v15, 0x33

    .line 187
    .line 188
    const/4 v8, -0x1

    .line 189
    invoke-direct {v0, v8, v12, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 190
    .line 191
    .line 192
    iput v14, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 193
    .line 194
    iput v13, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 195
    .line 196
    iget-object v12, v5, Lr3;->A:Landroid/view/ViewGroup;

    .line 197
    .line 198
    iget-object v13, v5, Lr3;->C:Landroid/view/View;

    .line 199
    .line 200
    invoke-virtual {v12, v13, v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_6
    iget-object v0, v5, Lr3;->C:Landroid/view/View;

    .line 205
    .line 206
    if-eqz v0, :cond_8

    .line 207
    .line 208
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 213
    .line 214
    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 215
    .line 216
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 217
    .line 218
    if-ne v8, v12, :cond_7

    .line 219
    .line 220
    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 221
    .line 222
    if-ne v8, v14, :cond_7

    .line 223
    .line 224
    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 225
    .line 226
    if-eq v8, v13, :cond_8

    .line 227
    .line 228
    :cond_7
    iput v12, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 229
    .line 230
    iput v14, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 231
    .line 232
    iput v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 233
    .line 234
    iget-object v8, v5, Lr3;->C:Landroid/view/View;

    .line 235
    .line 236
    invoke-virtual {v8, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 237
    .line 238
    .line 239
    :cond_8
    :goto_5
    iget-object v0, v5, Lr3;->C:Landroid/view/View;

    .line 240
    .line 241
    if-eqz v0, :cond_9

    .line 242
    .line 243
    const/16 v16, 0x1

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_9
    move/from16 v16, v9

    .line 247
    .line 248
    :goto_6
    if-eqz v16, :cond_b

    .line 249
    .line 250
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_b

    .line 255
    .line 256
    iget-object v0, v5, Lr3;->C:Landroid/view/View;

    .line 257
    .line 258
    invoke-static {v0}, Ls90;->g(Landroid/view/View;)I

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    and-int/lit16 v8, v8, 0x2000

    .line 263
    .line 264
    if-eqz v8, :cond_a

    .line 265
    .line 266
    const v8, 0x7f060006

    .line 267
    .line 268
    .line 269
    invoke-static {v6, v8}, Lhd;->a(Landroid/content/Context;I)I

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    goto :goto_7

    .line 274
    :cond_a
    const v8, 0x7f060005

    .line 275
    .line 276
    .line 277
    invoke-static {v6, v8}, Lhd;->a(Landroid/content/Context;I)I

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    :goto_7
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 282
    .line 283
    .line 284
    :cond_b
    iget-boolean v0, v5, Lr3;->H:Z

    .line 285
    .line 286
    if-nez v0, :cond_e

    .line 287
    .line 288
    if-eqz v16, :cond_e

    .line 289
    .line 290
    move v7, v9

    .line 291
    goto :goto_8

    .line 292
    :cond_c
    iget v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 293
    .line 294
    if-eqz v0, :cond_d

    .line 295
    .line 296
    iput v9, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 297
    .line 298
    move/from16 v16, v9

    .line 299
    .line 300
    const/4 v11, 0x1

    .line 301
    goto :goto_8

    .line 302
    :cond_d
    move v11, v9

    .line 303
    move/from16 v16, v11

    .line 304
    .line 305
    :cond_e
    :goto_8
    if-eqz v11, :cond_10

    .line 306
    .line 307
    iget-object v0, v5, Lr3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 308
    .line 309
    invoke-virtual {v0, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 310
    .line 311
    .line 312
    goto :goto_9

    .line 313
    :cond_f
    move/from16 v16, v9

    .line 314
    .line 315
    :cond_10
    :goto_9
    iget-object v0, v5, Lr3;->C:Landroid/view/View;

    .line 316
    .line 317
    if-eqz v0, :cond_12

    .line 318
    .line 319
    if-eqz v16, :cond_11

    .line 320
    .line 321
    move v8, v9

    .line 322
    goto :goto_a

    .line 323
    :cond_11
    const/16 v8, 0x8

    .line 324
    .line 325
    :goto_a
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 326
    .line 327
    .line 328
    :cond_12
    if-eq v3, v7, :cond_15

    .line 329
    .line 330
    invoke-virtual {v2}, Lwc0;->b()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-virtual {v2}, Lwc0;->c()I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    invoke-virtual {v2}, Lwc0;->a()I

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 343
    .line 344
    const/16 v8, 0x1e

    .line 345
    .line 346
    if-lt v6, v8, :cond_13

    .line 347
    .line 348
    new-instance v6, Llc0;

    .line 349
    .line 350
    invoke-direct {v6, v2}, Llc0;-><init>(Lwc0;)V

    .line 351
    .line 352
    .line 353
    goto :goto_b

    .line 354
    :cond_13
    const/16 v8, 0x1d

    .line 355
    .line 356
    if-lt v6, v8, :cond_14

    .line 357
    .line 358
    new-instance v6, Lkc0;

    .line 359
    .line 360
    invoke-direct {v6, v2}, Lkc0;-><init>(Lwc0;)V

    .line 361
    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_14
    new-instance v6, Lic0;

    .line 365
    .line 366
    invoke-direct {v6, v2}, Lic0;-><init>(Lwc0;)V

    .line 367
    .line 368
    .line 369
    :goto_b
    invoke-static {v0, v7, v3, v5}, Lep;->b(IIII)Lep;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v6, v0}, Lmc0;->g(Lep;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v6}, Lmc0;->b()Lwc0;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    goto :goto_c

    .line 381
    :cond_15
    move-object v0, v2

    .line 382
    :goto_c
    sget-object v2, Lja0;->a:Ljava/util/WeakHashMap;

    .line 383
    .line 384
    invoke-virtual {v0}, Lwc0;->f()Landroid/view/WindowInsets;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    if-eqz v2, :cond_16

    .line 389
    .line 390
    invoke-static {v1, v2}, Lw90;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-virtual {v3, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    if-nez v2, :cond_16

    .line 399
    .line 400
    invoke-static {v1, v3}, Lwc0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lwc0;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    :cond_16
    return-object v0
.end method

.method public q(Lku;)Z
    .locals 2

    .line 1
    iget v0, p0, Lg3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lku;->k()Lku;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lg3;->b:Lr3;

    .line 13
    .line 14
    iget-boolean v1, v0, Lr3;->F:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Lr3;->l:Landroid/view/Window;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-boolean v0, v0, Lr3;->Q:Z

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    const/16 v0, 0x6c

    .line 31
    .line 32
    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :pswitch_0
    iget-object v0, p0, Lg3;->b:Lr3;

    .line 38
    .line 39
    iget-object v0, v0, Lr3;->l:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    const/16 v1, 0x6c

    .line 48
    .line 49
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
