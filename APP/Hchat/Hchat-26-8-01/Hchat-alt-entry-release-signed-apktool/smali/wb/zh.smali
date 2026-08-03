.class public final synthetic Lwb/zh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 16
    iput p1, p0, Lwb/zh;->g:I

    iput-object p2, p0, Lwb/zh;->h:Ljava/lang/Object;

    iput-object p3, p0, Lwb/zh;->i:Ljava/lang/Object;

    iput-object p4, p0, Lwb/zh;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Lwb/zh;->g:I

    iput-object p1, p0, Lwb/zh;->i:Ljava/lang/Object;

    iput-object p2, p0, Lwb/zh;->h:Ljava/lang/Object;

    iput-object p3, p0, Lwb/zh;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lxa/m;Lxa/i;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    iput v0, p0, Lwb/zh;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lwb/zh;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lwb/zh;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lwb/zh;->i:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lwb/zh;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "setCurrentState"

    .line 9
    .line 10
    iget-object v2, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ly9/e;

    .line 13
    .line 14
    iget-object v3, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, La9/c;

    .line 17
    .line 18
    iget-object v4, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ly9/d;

    .line 21
    .line 22
    iget-object v5, v4, Ly9/d;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v6, v4, Ly9/d;->a:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, v3, La9/c;->a:Landroid/widget/TextView;

    .line 27
    .line 28
    iget-object v7, v2, Ly9/e;->b:Lib/b;

    .line 29
    .line 30
    iget-object v7, v7, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    const-string v8, ""

    .line 33
    .line 34
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    const/4 v10, 0x1

    .line 39
    const/4 v11, 0x0

    .line 40
    if-eqz v9, :cond_2

    .line 41
    .line 42
    invoke-virtual {v9, v6, v5}, Lg8/d;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    const/4 v12, 0x2

    .line 47
    if-ne v9, v12, :cond_0

    .line 48
    .line 49
    const-string v9, "\u7fa4\u4e3b"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    if-ne v9, v10, :cond_1

    .line 53
    .line 54
    const-string v9, "\u7ba1\u7406\u5458"

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const-string v9, "\u7fa4\u5458"

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v9, v11

    .line 61
    :goto_0
    if-nez v9, :cond_3

    .line 62
    .line 63
    move-object v9, v8

    .line 64
    :cond_3
    invoke-static {v6, v5}, Lib/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    const-string v13, "custom_title_"

    .line 69
    .line 70
    invoke-virtual {v13, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-interface {v7, v12, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    if-eqz v12, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move-object v12, v8

    .line 82
    :goto_1
    invoke-static {v12}, La7/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v16

    .line 86
    invoke-static {v6, v5}, Lib/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    const-string v13, "custom_color_"

    .line 91
    .line 92
    invoke-virtual {v13, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    invoke-interface {v7, v12, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    if-eqz v12, :cond_5

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    move-object v12, v8

    .line 104
    :goto_2
    invoke-static {v12}, La7/a;->G(Ljava/lang/String;)Ly9/f;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    if-eqz v12, :cond_6

    .line 109
    .line 110
    invoke-virtual {v12}, Ly9/f;->a()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    move-object v12, v11

    .line 116
    :goto_3
    if-nez v12, :cond_7

    .line 117
    .line 118
    move-object/from16 v17, v8

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    move-object/from16 v17, v12

    .line 122
    .line 123
    :goto_4
    invoke-static {v6, v5}, Lib/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    const-string v12, "custom_text_color_"

    .line 128
    .line 129
    invoke-virtual {v12, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-interface {v7, v6, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    if-eqz v6, :cond_8

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_8
    move-object v6, v8

    .line 141
    :goto_5
    invoke-static {v6}, La7/a;->G(Ljava/lang/String;)Ly9/f;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    if-eqz v6, :cond_9

    .line 146
    .line 147
    invoke-virtual {v6}, Ly9/f;->a()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    goto :goto_6

    .line 152
    :cond_9
    move-object v6, v11

    .line 153
    :goto_6
    if-nez v6, :cond_a

    .line 154
    .line 155
    move-object/from16 v18, v8

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_a
    move-object/from16 v18, v6

    .line 159
    .line 160
    :goto_7
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-lez v6, :cond_b

    .line 165
    .line 166
    const-string v6, " \u00b7 "

    .line 167
    .line 168
    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    :cond_b
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v19

    .line 176
    new-instance v5, Ldb/f;

    .line 177
    .line 178
    const/16 v6, 0x16

    .line 179
    .line 180
    invoke-direct {v5, v2, v6, v4}, Ldb/f;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    new-instance v6, Lwb/xi;

    .line 184
    .line 185
    const/16 v7, 0x1c

    .line 186
    .line 187
    invoke-direct {v6, v2, v7, v4}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    :goto_8
    instance-of v3, v2, Landroid/content/ContextWrapper;

    .line 195
    .line 196
    if-eqz v3, :cond_d

    .line 197
    .line 198
    instance-of v3, v2, Landroid/app/Activity;

    .line 199
    .line 200
    if-eqz v3, :cond_c

    .line 201
    .line 202
    check-cast v2, Landroid/app/Activity;

    .line 203
    .line 204
    :goto_9
    move-object v15, v2

    .line 205
    goto :goto_a

    .line 206
    :cond_c
    check-cast v2, Landroid/content/ContextWrapper;

    .line 207
    .line 208
    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    goto :goto_8

    .line 213
    :cond_d
    instance-of v3, v2, Landroid/app/Activity;

    .line 214
    .line 215
    if-eqz v3, :cond_e

    .line 216
    .line 217
    check-cast v2, Landroid/app/Activity;

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_e
    move-object v15, v11

    .line 221
    :goto_a
    if-eqz v15, :cond_12

    .line 222
    .line 223
    invoke-virtual {v15}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    if-eqz v2, :cond_f

    .line 228
    .line 229
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    goto :goto_b

    .line 234
    :cond_f
    move-object v2, v11

    .line 235
    :goto_b
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 236
    .line 237
    if-eqz v3, :cond_10

    .line 238
    .line 239
    move-object v11, v2

    .line 240
    check-cast v11, Landroid/view/ViewGroup;

    .line 241
    .line 242
    :cond_10
    if-eqz v11, :cond_12

    .line 243
    .line 244
    new-instance v14, Lc9/a1;

    .line 245
    .line 246
    const/4 v2, 0x3

    .line 247
    invoke-direct {v14, v2}, Lc9/a1;-><init>(I)V

    .line 248
    .line 249
    .line 250
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 251
    .line 252
    const/4 v3, 0x0

    .line 253
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 254
    .line 255
    .line 256
    new-instance v4, Landroid/widget/FrameLayout;

    .line 257
    .line 258
    invoke-direct {v4, v15}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v10}, Landroid/view/View;->setClickable(Z)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4, v10}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 271
    .line 272
    .line 273
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 274
    .line 275
    const/4 v7, -0x1

    .line 276
    invoke-direct {v3, v7, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v11, v14, v14, v14, v14}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v4, v14, v14, v14, v14}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 286
    .line 287
    .line 288
    iget-object v3, v14, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 289
    .line 290
    iget-boolean v8, v14, Lc9/a1;->l:Z

    .line 291
    .line 292
    if-nez v8, :cond_11

    .line 293
    .line 294
    iget-object v8, v14, Lc9/a1;->i:Lp4/t;

    .line 295
    .line 296
    sget-object v9, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 297
    .line 298
    invoke-virtual {v8, v9}, Lp4/t;->F(Landroid/os/Bundle;)V

    .line 299
    .line 300
    .line 301
    iput-boolean v10, v14, Lc9/a1;->l:Z

    .line 302
    .line 303
    :cond_11
    sget-object v8, Landroidx/lifecycle/l;->i:Landroidx/lifecycle/l;

    .line 304
    .line 305
    invoke-virtual {v3, v0}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3, v8}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 309
    .line 310
    .line 311
    sget-object v8, Landroidx/lifecycle/l;->j:Landroidx/lifecycle/l;

    .line 312
    .line 313
    invoke-virtual {v3, v0}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3, v8}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 317
    .line 318
    .line 319
    sget-object v8, Landroidx/lifecycle/l;->k:Landroidx/lifecycle/l;

    .line 320
    .line 321
    invoke-virtual {v3, v0}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3, v8}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 325
    .line 326
    .line 327
    new-instance v25, Lgg/u;

    .line 328
    .line 329
    invoke-direct/range {v25 .. v25}, Ljava/lang/Object;-><init>()V

    .line 330
    .line 331
    .line 332
    new-instance v20, Lc9/r0;

    .line 333
    .line 334
    const/16 v26, 0x7

    .line 335
    .line 336
    move-object/from16 v21, v2

    .line 337
    .line 338
    move-object/from16 v22, v4

    .line 339
    .line 340
    move-object/from16 v23, v11

    .line 341
    .line 342
    move-object/from16 v24, v14

    .line 343
    .line 344
    invoke-direct/range {v20 .. v26}, Lc9/r0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 345
    .line 346
    .line 347
    move-object/from16 v0, v22

    .line 348
    .line 349
    move-object/from16 v2, v25

    .line 350
    .line 351
    new-instance v3, Ly1/c1;

    .line 352
    .line 353
    invoke-direct {v3, v15}, Ly1/c1;-><init>(Landroid/app/Activity;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v3, v14, v14, v14, v14}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 357
    .line 358
    .line 359
    sget-object v4, Ly1/r1;->h:Ly1/r1;

    .line 360
    .line 361
    invoke-virtual {v3, v4}, Ly1/a;->setViewCompositionStrategy(Ly1/k2;)V

    .line 362
    .line 363
    .line 364
    new-instance v13, Lwb/c5;

    .line 365
    .line 366
    const/16 v23, 0x0

    .line 367
    .line 368
    move-object/from16 v21, v5

    .line 369
    .line 370
    move-object/from16 v22, v6

    .line 371
    .line 372
    invoke-direct/range {v13 .. v23}, Lwb/c5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 373
    .line 374
    .line 375
    new-instance v4, Ls0/d;

    .line 376
    .line 377
    const v5, -0x3c4bedb

    .line 378
    .line 379
    .line 380
    invoke-direct {v4, v5, v13, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v3, v4}, Ly1/c1;->setContent(Lfg/p;)V

    .line 384
    .line 385
    .line 386
    iput-object v3, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 387
    .line 388
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 389
    .line 390
    invoke-direct {v2, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 400
    .line 401
    .line 402
    :cond_12
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_0
    iget-object v0, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, Lxa/m;

    .line 408
    .line 409
    iget-object v2, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v2, Lxa/i;

    .line 412
    .line 413
    iget-object v3, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v3, Ljava/lang/String;

    .line 416
    .line 417
    iget-object v2, v2, Lxa/i;->b:Ljava/lang/String;

    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 423
    .line 424
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    const/4 v6, 0x0

    .line 429
    if-eqz v5, :cond_22

    .line 430
    .line 431
    :try_start_0
    invoke-virtual {v5}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 432
    .line 433
    .line 434
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 435
    goto :goto_c

    .line 436
    :catchall_0
    move-exception v0

    .line 437
    new-instance v7, Lsf/f;

    .line 438
    .line 439
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 440
    .line 441
    .line 442
    move-object v0, v7

    .line 443
    :goto_c
    nop

    .line 444
    instance-of v7, v0, Lsf/f;

    .line 445
    .line 446
    if-eqz v7, :cond_13

    .line 447
    .line 448
    move-object v0, v4

    .line 449
    :cond_13
    check-cast v0, Ljava/util/List;

    .line 450
    .line 451
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 452
    .line 453
    .line 454
    move-result v7

    .line 455
    if-eqz v7, :cond_14

    .line 456
    .line 457
    goto :goto_d

    .line 458
    :cond_14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v7

    .line 462
    :cond_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v8

    .line 466
    if-eqz v8, :cond_16

    .line 467
    .line 468
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v8

    .line 472
    check-cast v8, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 473
    .line 474
    iget-object v8, v8, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 475
    .line 476
    invoke-static {v8, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v8

    .line 480
    if-eqz v8, :cond_15

    .line 481
    .line 482
    goto :goto_11

    .line 483
    :cond_16
    :goto_d
    invoke-virtual {v5, v3}, Lg8/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v7

    .line 487
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 491
    .line 492
    .line 493
    move-result v7

    .line 494
    if-eqz v7, :cond_17

    .line 495
    .line 496
    new-instance v0, Lxa/j;

    .line 497
    .line 498
    const-string v2, "\u521b\u5efa\u597d\u53cb\u6807\u7b7e\u5931\u8d25"

    .line 499
    .line 500
    invoke-direct {v0, v6, v2}, Lxa/j;-><init>(ZLjava/lang/String;)V

    .line 501
    .line 502
    .line 503
    goto/16 :goto_15

    .line 504
    .line 505
    :cond_17
    move v7, v6

    .line 506
    :goto_e
    const/16 v8, 0xf

    .line 507
    .line 508
    if-ge v7, v8, :cond_1c

    .line 509
    .line 510
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 511
    .line 512
    .line 513
    move-result v8

    .line 514
    if-eqz v8, :cond_18

    .line 515
    .line 516
    goto :goto_f

    .line 517
    :cond_18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    :cond_19
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    if-eqz v9, :cond_1a

    .line 526
    .line 527
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v9

    .line 531
    check-cast v9, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 532
    .line 533
    iget-object v9, v9, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 534
    .line 535
    invoke-static {v9, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v9

    .line 539
    if-eqz v9, :cond_19

    .line 540
    .line 541
    goto :goto_11

    .line 542
    :cond_1a
    :goto_f
    add-int/lit8 v7, v7, 0x1

    .line 543
    .line 544
    const-wide/16 v8, 0x3e8

    .line 545
    .line 546
    :try_start_1
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 547
    .line 548
    .line 549
    :catchall_1
    :try_start_2
    invoke-virtual {v5}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 550
    .line 551
    .line 552
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 553
    goto :goto_10

    .line 554
    :catchall_2
    move-exception v0

    .line 555
    new-instance v8, Lsf/f;

    .line 556
    .line 557
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 558
    .line 559
    .line 560
    move-object v0, v8

    .line 561
    :goto_10
    nop

    .line 562
    instance-of v8, v0, Lsf/f;

    .line 563
    .line 564
    if-eqz v8, :cond_1b

    .line 565
    .line 566
    move-object v0, v4

    .line 567
    :cond_1b
    check-cast v0, Ljava/util/List;

    .line 568
    .line 569
    goto :goto_e

    .line 570
    :cond_1c
    :goto_11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    if-eqz v4, :cond_1d

    .line 575
    .line 576
    goto :goto_14

    .line 577
    :cond_1d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    if-eqz v4, :cond_21

    .line 586
    .line 587
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    check-cast v4, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 592
    .line 593
    iget-object v4, v4, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 594
    .line 595
    invoke-static {v4, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    if-eqz v4, :cond_1e

    .line 600
    .line 601
    :try_start_3
    invoke-virtual {v5, v2, v3}, Lg8/i;->O(Ljava/lang/String;Ljava/lang/String;)Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 606
    .line 607
    .line 608
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 609
    goto :goto_12

    .line 610
    :catchall_3
    move-exception v0

    .line 611
    new-instance v2, Lsf/f;

    .line 612
    .line 613
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 614
    .line 615
    .line 616
    move-object v0, v2

    .line 617
    :goto_12
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 618
    .line 619
    instance-of v3, v0, Lsf/f;

    .line 620
    .line 621
    if-eqz v3, :cond_1f

    .line 622
    .line 623
    move-object v0, v2

    .line 624
    :cond_1f
    check-cast v0, Ljava/lang/Boolean;

    .line 625
    .line 626
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    new-instance v2, Lxa/j;

    .line 631
    .line 632
    if-eqz v0, :cond_20

    .line 633
    .line 634
    const-string v3, "\u6807\u7b7e\u5df2\u521b\u5efa\u5e76\u6dfb\u52a0"

    .line 635
    .line 636
    goto :goto_13

    .line 637
    :cond_20
    const-string v3, "\u6dfb\u52a0\u597d\u53cb\u6807\u7b7e\u5931\u8d25"

    .line 638
    .line 639
    :goto_13
    invoke-direct {v2, v0, v3}, Lxa/j;-><init>(ZLjava/lang/String;)V

    .line 640
    .line 641
    .line 642
    move-object v0, v2

    .line 643
    goto :goto_15

    .line 644
    :cond_21
    :goto_14
    new-instance v0, Lxa/j;

    .line 645
    .line 646
    const-string v2, "\u6807\u7b7e\u5c1a\u672a\u540c\u6b65\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 647
    .line 648
    invoke-direct {v0, v6, v2}, Lxa/j;-><init>(ZLjava/lang/String;)V

    .line 649
    .line 650
    .line 651
    goto :goto_15

    .line 652
    :cond_22
    new-instance v0, Lxa/j;

    .line 653
    .line 654
    const-string v2, "\u8054\u7cfb\u4eba\u6807\u7b7e\u4e0d\u53ef\u7528"

    .line 655
    .line 656
    invoke-direct {v0, v6, v2}, Lxa/j;-><init>(ZLjava/lang/String;)V

    .line 657
    .line 658
    .line 659
    :goto_15
    return-object v0

    .line 660
    :pswitch_1
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast v0, Lxa/m;

    .line 663
    .line 664
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v2, Landroid/app/Activity;

    .line 667
    .line 668
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast v3, Lxa/j;

    .line 671
    .line 672
    iget-object v3, v3, Lxa/j;->b:Ljava/lang/String;

    .line 673
    .line 674
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    invoke-static {v2}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    if-nez v0, :cond_23

    .line 682
    .line 683
    goto :goto_16

    .line 684
    :cond_23
    const/4 v0, 0x0

    .line 685
    invoke-static {v2, v3, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 690
    .line 691
    .line 692
    :goto_16
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 693
    .line 694
    return-object v0

    .line 695
    :pswitch_2
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 698
    .line 699
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v2, Lfg/l;

    .line 702
    .line 703
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v3, Lfg/a;

    .line 706
    .line 707
    const/4 v4, 0x0

    .line 708
    const/4 v5, 0x1

    .line 709
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    if-eqz v0, :cond_24

    .line 714
    .line 715
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 716
    .line 717
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    :cond_24
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    :goto_17
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 724
    .line 725
    return-object v0

    .line 726
    :pswitch_3
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v0, Lfg/l;

    .line 729
    .line 730
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v2, Lfb/d1;

    .line 733
    .line 734
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v3, Li0/a1;

    .line 737
    .line 738
    const/4 v4, 0x0

    .line 739
    invoke-interface {v3, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 740
    .line 741
    .line 742
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    goto :goto_17

    .line 746
    :pswitch_4
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v0, Lwb/au;

    .line 749
    .line 750
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v2, Li0/j1;

    .line 753
    .line 754
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v3, Li0/j1;

    .line 757
    .line 758
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 759
    .line 760
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 761
    .line 762
    .line 763
    const/4 v2, 0x0

    .line 764
    invoke-virtual {v3, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    sget-object v2, Lfb/u2;->g:Lfb/u2;

    .line 768
    .line 769
    invoke-virtual {v0, v2}, Lwb/au;->a(Lfb/u2;)V

    .line 770
    .line 771
    .line 772
    goto :goto_17

    .line 773
    :pswitch_5
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 774
    .line 775
    check-cast v0, Lfg/l;

    .line 776
    .line 777
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v2, Ljava/util/List;

    .line 780
    .line 781
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v3, Lfb/r0;

    .line 784
    .line 785
    new-instance v4, Ljava/util/ArrayList;

    .line 786
    .line 787
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 788
    .line 789
    .line 790
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    :cond_25
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 795
    .line 796
    .line 797
    move-result v5

    .line 798
    if-eqz v5, :cond_26

    .line 799
    .line 800
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v5

    .line 804
    move-object v6, v5

    .line 805
    check-cast v6, Lfb/r0;

    .line 806
    .line 807
    iget-object v6, v6, Lfb/r0;->a:Ljava/lang/String;

    .line 808
    .line 809
    iget-object v7, v3, Lfb/r0;->a:Ljava/lang/String;

    .line 810
    .line 811
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result v6

    .line 815
    if-nez v6, :cond_25

    .line 816
    .line 817
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    goto :goto_18

    .line 821
    :cond_26
    invoke-interface {v0, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    goto :goto_17

    .line 825
    :pswitch_6
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v0, Lfb/d1;

    .line 828
    .line 829
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 830
    .line 831
    check-cast v2, Landroid/content/Context;

    .line 832
    .line 833
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 834
    .line 835
    check-cast v3, Li0/a1;

    .line 836
    .line 837
    iget-boolean v4, v0, Lfb/d1;->m:Z

    .line 838
    .line 839
    if-eqz v4, :cond_27

    .line 840
    .line 841
    const-string v0, "\u8bf7\u5148\u89e3\u9501\u8be5\u5bf9\u8bdd"

    .line 842
    .line 843
    const/4 v3, 0x0

    .line 844
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 849
    .line 850
    .line 851
    goto :goto_19

    .line 852
    :cond_27
    iget-object v0, v0, Lfb/d1;->a:Ljava/lang/String;

    .line 853
    .line 854
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    :goto_19
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 858
    .line 859
    return-object v0

    .line 860
    :pswitch_7
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 861
    .line 862
    check-cast v0, Lab/e;

    .line 863
    .line 864
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v2, Landroid/view/ViewGroup;

    .line 867
    .line 868
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast v3, Lgg/u;

    .line 871
    .line 872
    sget-object v4, Lwb/fr;->c:Ljava/util/WeakHashMap;

    .line 873
    .line 874
    monitor-enter v4

    .line 875
    :try_start_4
    invoke-virtual {v4, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v5

    .line 879
    iget-object v3, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 880
    .line 881
    if-eqz v3, :cond_29

    .line 882
    .line 883
    check-cast v3, Lwb/dr;

    .line 884
    .line 885
    if-ne v5, v3, :cond_28

    .line 886
    .line 887
    invoke-virtual {v4, v2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 888
    .line 889
    .line 890
    goto :goto_1a

    .line 891
    :catchall_4
    move-exception v0

    .line 892
    goto :goto_1b

    .line 893
    :cond_28
    :goto_1a
    monitor-exit v4

    .line 894
    invoke-virtual {v0}, Lab/e;->invoke()Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    goto/16 :goto_17

    .line 898
    .line 899
    :cond_29
    :try_start_5
    const-string v0, "handle"

    .line 900
    .line 901
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    const/4 v0, 0x0

    .line 905
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 906
    :goto_1b
    monitor-exit v4

    .line 907
    throw v0

    .line 908
    :pswitch_8
    iget-object v0, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v0, Landroid/content/Context;

    .line 911
    .line 912
    iget-object v2, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 913
    .line 914
    check-cast v2, Leb/c0;

    .line 915
    .line 916
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 917
    .line 918
    check-cast v3, Li0/a1;

    .line 919
    .line 920
    move-object v4, v0

    .line 921
    :goto_1c
    instance-of v5, v4, Landroid/content/ContextWrapper;

    .line 922
    .line 923
    if-eqz v5, :cond_2b

    .line 924
    .line 925
    instance-of v5, v4, Landroid/app/Activity;

    .line 926
    .line 927
    if-eqz v5, :cond_2a

    .line 928
    .line 929
    check-cast v4, Landroid/app/Activity;

    .line 930
    .line 931
    goto :goto_1d

    .line 932
    :cond_2a
    check-cast v4, Landroid/content/ContextWrapper;

    .line 933
    .line 934
    invoke-virtual {v4}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 935
    .line 936
    .line 937
    move-result-object v4

    .line 938
    goto :goto_1c

    .line 939
    :cond_2b
    instance-of v5, v4, Landroid/app/Activity;

    .line 940
    .line 941
    if-eqz v5, :cond_2c

    .line 942
    .line 943
    check-cast v4, Landroid/app/Activity;

    .line 944
    .line 945
    goto :goto_1d

    .line 946
    :cond_2c
    const/4 v4, 0x0

    .line 947
    :goto_1d
    if-eqz v4, :cond_2d

    .line 948
    .line 949
    sget-object v5, Lwb/ep;->a:Lwb/ep;

    .line 950
    .line 951
    new-instance v0, Lwb/kp;

    .line 952
    .line 953
    const/4 v6, 0x3

    .line 954
    invoke-direct {v0, v2, v3, v6}, Lwb/kp;-><init>(Leb/c0;Li0/a1;I)V

    .line 955
    .line 956
    .line 957
    monitor-enter v5

    .line 958
    :try_start_6
    new-instance v2, Lwb/dp;

    .line 959
    .line 960
    invoke-direct {v2, v4, v0}, Lwb/dp;-><init>(Landroid/app/Activity;Lwb/kp;)V

    .line 961
    .line 962
    .line 963
    sput-object v2, Lwb/ep;->c:Lwb/dp;

    .line 964
    .line 965
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v5, v0}, Lwb/ep;->a(Ljava/lang/Class;)V

    .line 970
    .line 971
    .line 972
    const-class v0, Landroid/app/Activity;

    .line 973
    .line 974
    invoke-virtual {v5, v0}, Lwb/ep;->a(Ljava/lang/Class;)V

    .line 975
    .line 976
    .line 977
    new-instance v0, Landroid/content/Intent;

    .line 978
    .line 979
    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    .line 980
    .line 981
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    const-string v2, "android.intent.category.OPENABLE"

    .line 985
    .line 986
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 987
    .line 988
    .line 989
    const-string v2, "*/*"

    .line 990
    .line 991
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 992
    .line 993
    .line 994
    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    .line 995
    .line 996
    const/4 v3, 0x1

    .line 997
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1001
    .line 1002
    .line 1003
    const/16 v2, 0x40

    .line 1004
    .line 1005
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1006
    .line 1007
    .line 1008
    invoke-static {v4, v0}, Lwb/ho;->B4(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1009
    .line 1010
    .line 1011
    const v2, 0x4843525f    # 200009.48f

    .line 1012
    .line 1013
    .line 1014
    :try_start_7
    invoke-virtual {v4, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 1015
    .line 1016
    .line 1017
    goto :goto_1e

    .line 1018
    :catchall_5
    :try_start_8
    new-instance v0, Landroid/content/Intent;

    .line 1019
    .line 1020
    const-string v6, "android.intent.action.GET_CONTENT"

    .line 1021
    .line 1022
    invoke-direct {v0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    const-string v6, "android.intent.category.OPENABLE"

    .line 1026
    .line 1027
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1028
    .line 1029
    .line 1030
    const-string v6, "*/*"

    .line 1031
    .line 1032
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1033
    .line 1034
    .line 1035
    const-string v6, "android.intent.extra.ALLOW_MULTIPLE"

    .line 1036
    .line 1037
    invoke-virtual {v0, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1041
    .line 1042
    .line 1043
    const-string v3, "\u9009\u62e9\u63d2\u4ef6\u9644\u52a0\u6587\u4ef6"

    .line 1044
    .line 1045
    invoke-static {v0, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    invoke-virtual {v4, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 1050
    .line 1051
    .line 1052
    :goto_1e
    monitor-exit v5

    .line 1053
    goto :goto_1f

    .line 1054
    :catchall_6
    move-exception v0

    .line 1055
    :try_start_9
    monitor-exit v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 1056
    throw v0

    .line 1057
    :cond_2d
    const-string v2, "\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 1058
    .line 1059
    const/4 v3, 0x0

    .line 1060
    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1065
    .line 1066
    .line 1067
    :goto_1f
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1068
    .line 1069
    return-object v0

    .line 1070
    :pswitch_9
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v0, Lfg/l;

    .line 1073
    .line 1074
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 1075
    .line 1076
    check-cast v2, Lgb/c;

    .line 1077
    .line 1078
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v3, Li0/a1;

    .line 1081
    .line 1082
    const/4 v4, 0x0

    .line 1083
    invoke-interface {v3, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    goto/16 :goto_17

    .line 1090
    .line 1091
    :pswitch_a
    iget-object v0, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 1092
    .line 1093
    check-cast v0, Landroid/content/Context;

    .line 1094
    .line 1095
    iget-object v2, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 1096
    .line 1097
    check-cast v2, Lx9/e;

    .line 1098
    .line 1099
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 1100
    .line 1101
    check-cast v3, Li0/a1;

    .line 1102
    .line 1103
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 1104
    .line 1105
    invoke-static {v2, v3, v4}, Lwb/ho;->K1(Lx9/e;Li0/a1;Ljava/util/List;)V

    .line 1106
    .line 1107
    .line 1108
    const-string v2, "\u5df2\u6e05\u7a7a\u5173\u952e\u8bcd"

    .line 1109
    .line 1110
    const/4 v3, 0x0

    .line 1111
    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1116
    .line 1117
    .line 1118
    goto/16 :goto_17

    .line 1119
    .line 1120
    :pswitch_b
    iget-object v0, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v0, Landroid/content/Context;

    .line 1123
    .line 1124
    iget-object v2, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v2, Lx8/s;

    .line 1127
    .line 1128
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 1129
    .line 1130
    check-cast v3, Lfg/l;

    .line 1131
    .line 1132
    instance-of v4, v0, Landroid/app/Activity;

    .line 1133
    .line 1134
    if-eqz v4, :cond_2e

    .line 1135
    .line 1136
    move-object v4, v0

    .line 1137
    check-cast v4, Landroid/app/Activity;

    .line 1138
    .line 1139
    goto :goto_20

    .line 1140
    :cond_2e
    const/4 v4, 0x0

    .line 1141
    :goto_20
    if-nez v4, :cond_2f

    .line 1142
    .line 1143
    const-string v2, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 1144
    .line 1145
    const/4 v3, 0x0

    .line 1146
    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1151
    .line 1152
    .line 1153
    goto :goto_22

    .line 1154
    :cond_2f
    sget-object v5, Lwb/p;->a:Lwb/p;

    .line 1155
    .line 1156
    iget v6, v2, Lx8/s;->b:I

    .line 1157
    .line 1158
    new-instance v7, Lwb/dj;

    .line 1159
    .line 1160
    invoke-direct {v7, v2, v3, v0}, Lwb/dj;-><init>(Lx8/s;Lfg/l;Landroid/content/Context;)V

    .line 1161
    .line 1162
    .line 1163
    monitor-enter v5

    .line 1164
    :try_start_a
    sput-object v7, Lwb/p;->c:Lwb/dj;

    .line 1165
    .line 1166
    sput-object v4, Lwb/p;->d:Landroid/app/Activity;

    .line 1167
    .line 1168
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    invoke-virtual {v5, v0}, Lwb/p;->a(Ljava/lang/Class;)V

    .line 1173
    .line 1174
    .line 1175
    const-class v0, Landroid/app/Activity;

    .line 1176
    .line 1177
    invoke-virtual {v5, v0}, Lwb/p;->a(Ljava/lang/Class;)V

    .line 1178
    .line 1179
    .line 1180
    new-instance v0, Landroid/content/Intent;

    .line 1181
    .line 1182
    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    .line 1183
    .line 1184
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    const-string v2, "android.intent.category.OPENABLE"

    .line 1188
    .line 1189
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1190
    .line 1191
    .line 1192
    const-string v2, "*/*"

    .line 1193
    .line 1194
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1195
    .line 1196
    .line 1197
    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    .line 1198
    .line 1199
    const/4 v3, 0x1

    .line 1200
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1204
    .line 1205
    .line 1206
    const/16 v2, 0x40

    .line 1207
    .line 1208
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1209
    .line 1210
    .line 1211
    invoke-static {v4, v0}, Lwb/ho;->B4(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1212
    .line 1213
    .line 1214
    const v2, 0x48435257    # 200009.36f

    .line 1215
    .line 1216
    .line 1217
    :try_start_b
    invoke-virtual {v4, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 1218
    .line 1219
    .line 1220
    goto :goto_21

    .line 1221
    :catchall_7
    :try_start_c
    new-instance v0, Landroid/content/Intent;

    .line 1222
    .line 1223
    const-string v7, "android.intent.action.GET_CONTENT"

    .line 1224
    .line 1225
    invoke-direct {v0, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    const-string v7, "android.intent.category.OPENABLE"

    .line 1229
    .line 1230
    invoke-virtual {v0, v7}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1231
    .line 1232
    .line 1233
    const-string v7, "*/*"

    .line 1234
    .line 1235
    invoke-virtual {v0, v7}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1236
    .line 1237
    .line 1238
    const-string v7, "android.intent.extra.ALLOW_MULTIPLE"

    .line 1239
    .line 1240
    invoke-virtual {v0, v7, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1244
    .line 1245
    .line 1246
    invoke-static {v6}, Lwb/ho;->N4(I)Ljava/lang/String;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v3

    .line 1250
    invoke-static {v0, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    invoke-virtual {v4, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 1255
    .line 1256
    .line 1257
    :goto_21
    monitor-exit v5

    .line 1258
    :goto_22
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1259
    .line 1260
    return-object v0

    .line 1261
    :catchall_8
    move-exception v0

    .line 1262
    :try_start_d
    monitor-exit v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 1263
    throw v0

    .line 1264
    :pswitch_c
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 1265
    .line 1266
    check-cast v0, Lfg/l;

    .line 1267
    .line 1268
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v2, Lx8/s;

    .line 1271
    .line 1272
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 1273
    .line 1274
    check-cast v3, Lfg/l;

    .line 1275
    .line 1276
    new-instance v4, Lwb/b3;

    .line 1277
    .line 1278
    iget v5, v2, Lx8/s;->b:I

    .line 1279
    .line 1280
    invoke-static {v5}, Lwb/ho;->N4(I)Ljava/lang/String;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v5

    .line 1284
    iget-object v6, v2, Lx8/s;->c:Ljava/lang/String;

    .line 1285
    .line 1286
    new-instance v7, Lwb/kj;

    .line 1287
    .line 1288
    const/4 v8, 0x3

    .line 1289
    invoke-direct {v7, v3, v2, v8}, Lwb/kj;-><init>(Lfg/l;Lx8/s;I)V

    .line 1290
    .line 1291
    .line 1292
    const/4 v8, 0x1

    .line 1293
    const-string v9, ";;;"

    .line 1294
    .line 1295
    invoke-direct/range {v4 .. v9}, Lwb/b3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfg/l;ZLjava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    invoke-interface {v0, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    goto/16 :goto_17

    .line 1302
    .line 1303
    :pswitch_d
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 1304
    .line 1305
    check-cast v0, Lx8/u;

    .line 1306
    .line 1307
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 1308
    .line 1309
    check-cast v2, Landroid/content/Context;

    .line 1310
    .line 1311
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 1312
    .line 1313
    check-cast v3, Li0/a1;

    .line 1314
    .line 1315
    iget-object v4, v0, Lx8/u;->a:Ljava/lang/String;

    .line 1316
    .line 1317
    invoke-interface {v3, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1318
    .line 1319
    .line 1320
    iget-object v0, v0, Lx8/u;->a:Ljava/lang/String;

    .line 1321
    .line 1322
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1323
    .line 1324
    const-string v4, "\u5df2\u9009\u62e9 "

    .line 1325
    .line 1326
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    const/4 v3, 0x0

    .line 1337
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1342
    .line 1343
    .line 1344
    goto/16 :goto_17

    .line 1345
    .line 1346
    :pswitch_e
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 1347
    .line 1348
    check-cast v0, Lv8/a;

    .line 1349
    .line 1350
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 1351
    .line 1352
    check-cast v2, Landroid/content/Context;

    .line 1353
    .line 1354
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 1355
    .line 1356
    check-cast v3, Lfg/l;

    .line 1357
    .line 1358
    iget-object v4, v0, Lv8/a;->e:Ljava/util/Set;

    .line 1359
    .line 1360
    check-cast v4, Ljava/lang/Iterable;

    .line 1361
    .line 1362
    instance-of v5, v4, Ljava/util/Collection;

    .line 1363
    .line 1364
    const/4 v6, 0x0

    .line 1365
    if-eqz v5, :cond_30

    .line 1366
    .line 1367
    move-object v5, v4

    .line 1368
    check-cast v5, Ljava/util/Collection;

    .line 1369
    .line 1370
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 1371
    .line 1372
    .line 1373
    move-result v5

    .line 1374
    if-eqz v5, :cond_30

    .line 1375
    .line 1376
    goto :goto_23

    .line 1377
    :cond_30
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v4

    .line 1381
    :cond_31
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1382
    .line 1383
    .line 1384
    move-result v5

    .line 1385
    if-eqz v5, :cond_33

    .line 1386
    .line 1387
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v5

    .line 1391
    check-cast v5, Ljava/lang/String;

    .line 1392
    .line 1393
    const-string v7, "@chatroom"

    .line 1394
    .line 1395
    invoke-static {v5, v7, v6}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1396
    .line 1397
    .line 1398
    move-result v7

    .line 1399
    if-nez v7, :cond_32

    .line 1400
    .line 1401
    const-string v7, "@im.chatroom"

    .line 1402
    .line 1403
    invoke-static {v5, v7, v6}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1404
    .line 1405
    .line 1406
    move-result v5

    .line 1407
    if-eqz v5, :cond_31

    .line 1408
    .line 1409
    :cond_32
    invoke-interface {v3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1410
    .line 1411
    .line 1412
    goto :goto_24

    .line 1413
    :cond_33
    :goto_23
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u76d1\u542c\u7fa4\u804a"

    .line 1414
    .line 1415
    invoke-static {v2, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v0

    .line 1419
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1420
    .line 1421
    .line 1422
    :goto_24
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1423
    .line 1424
    return-object v0

    .line 1425
    :pswitch_f
    iget-object v0, v1, Lwb/zh;->i:Ljava/lang/Object;

    .line 1426
    .line 1427
    check-cast v0, Ljava/lang/String;

    .line 1428
    .line 1429
    iget-object v2, v1, Lwb/zh;->h:Ljava/lang/Object;

    .line 1430
    .line 1431
    check-cast v2, Landroid/content/Context;

    .line 1432
    .line 1433
    iget-object v3, v1, Lwb/zh;->j:Ljava/lang/Object;

    .line 1434
    .line 1435
    check-cast v3, Li0/a1;

    .line 1436
    .line 1437
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1438
    .line 1439
    .line 1440
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1441
    .line 1442
    const-string v4, "\u5df2\u9009\u62e9 "

    .line 1443
    .line 1444
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    const/4 v3, 0x0

    .line 1455
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1460
    .line 1461
    .line 1462
    goto/16 :goto_17

    .line 1463
    .line 1464
    nop

    .line 1465
    :pswitch_data_0
    .packed-switch 0x0
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
