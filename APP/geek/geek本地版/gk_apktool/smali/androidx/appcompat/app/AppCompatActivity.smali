.class public Landroidx/appcompat/app/AppCompatActivity;
.super Landroidx/fragment/app/FragmentActivity;

# interfaces
.implements Lx2;


# instance fields
.field public x:Lr3;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lgm;

    .line 5
    .line 6
    iget-object v0, v0, Lgm;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La3;

    .line 9
    .line 10
    new-instance v1, Ls2;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, Ls2;-><init>(Landroidx/fragment/app/FragmentActivity;I)V

    .line 14
    .line 15
    .line 16
    const-string v2, "androidx:appcompat"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, La3;->e(Ljava/lang/String;Lt10;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lt2;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, v1}, Lt2;-><init>(Landroidx/fragment/app/FragmentActivity;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->h(Lyw;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->m()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lr3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr3;->w()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lr3;->A:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v2, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Lr3;->m:Ll3;

    .line 28
    .line 29
    iget-object p2, v0, Lr3;->l:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Ll3;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lr3;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lr3;->O:Z

    .line 9
    .line 10
    iget v2, v0, Lr3;->S:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Le3;->b:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Lr3;->C(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Le3;->c(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_7

    .line 29
    .line 30
    invoke-static {p1}, Le3;->c(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    invoke-static {}, Lip;->A()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    sget-boolean v2, Le3;->f:Z

    .line 44
    .line 45
    if-nez v2, :cond_7

    .line 46
    .line 47
    sget-object v2, Le3;->a:Lu5;

    .line 48
    .line 49
    new-instance v4, Lb3;

    .line 50
    .line 51
    invoke-direct {v4, p1, v3}, Lb3;-><init>(Landroid/content/Context;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Lu5;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_2
    sget-object v2, Le3;->i:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v4, Le3;->c:Lsr;

    .line 62
    .line 63
    if-nez v4, :cond_5

    .line 64
    .line 65
    sget-object v4, Le3;->d:Lsr;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Lip;->L(Landroid/content/Context;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, Lsr;->a(Ljava/lang/String;)Lsr;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sput-object v4, Le3;->d:Lsr;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_1
    sget-object v4, Le3;->d:Lsr;

    .line 83
    .line 84
    iget-object v4, v4, Lsr;->a:Ltr;

    .line 85
    .line 86
    iget-object v4, v4, Ltr;->a:Landroid/os/LocaleList;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/os/LocaleList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    monitor-exit v2

    .line 95
    goto :goto_4

    .line 96
    :cond_4
    sget-object v4, Le3;->d:Lsr;

    .line 97
    .line 98
    sput-object v4, Le3;->c:Lsr;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    sget-object v5, Le3;->d:Lsr;

    .line 102
    .line 103
    invoke-virtual {v4, v5}, Lsr;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_6

    .line 108
    .line 109
    sget-object v4, Le3;->c:Lsr;

    .line 110
    .line 111
    sput-object v4, Le3;->d:Lsr;

    .line 112
    .line 113
    iget-object v4, v4, Lsr;->a:Ltr;

    .line 114
    .line 115
    iget-object v4, v4, Ltr;->a:Landroid/os/LocaleList;

    .line 116
    .line 117
    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-static {p1, v4}, Lip;->J(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_2
    monitor-exit v2

    .line 125
    goto :goto_4

    .line 126
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    throw p1

    .line 128
    :cond_7
    :goto_4
    invoke-static {p1}, Lr3;->p(Landroid/content/Context;)Lsr;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    sget-boolean v4, Lr3;->k0:Z

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    if-eqz v4, :cond_8

    .line 136
    .line 137
    instance-of v4, p1, Landroid/view/ContextThemeWrapper;

    .line 138
    .line 139
    if-eqz v4, :cond_8

    .line 140
    .line 141
    invoke-static {p1, v0, v2, v5, v3}, Lr3;->t(Landroid/content/Context;ILsr;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    :try_start_1
    move-object v6, p1

    .line 146
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 147
    .line 148
    invoke-virtual {v6, v4}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 149
    .line 150
    .line 151
    goto/16 :goto_b

    .line 152
    .line 153
    :catch_0
    :cond_8
    instance-of v4, p1, Lkd;

    .line 154
    .line 155
    if-eqz v4, :cond_9

    .line 156
    .line 157
    invoke-static {p1, v0, v2, v5, v3}, Lr3;->t(Landroid/content/Context;ILsr;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    :try_start_2
    move-object v4, p1

    .line 162
    check-cast v4, Lkd;

    .line 163
    .line 164
    invoke-virtual {v4, v3}, Lkd;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 165
    .line 166
    .line 167
    goto/16 :goto_b

    .line 168
    .line 169
    :catch_1
    :cond_9
    sget-boolean v3, Lr3;->j0:Z

    .line 170
    .line 171
    if-nez v3, :cond_a

    .line 172
    .line 173
    goto/16 :goto_b

    .line 174
    .line 175
    :cond_a
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 176
    .line 177
    new-instance v4, Landroid/content/res/Configuration;

    .line 178
    .line 179
    invoke-direct {v4}, Landroid/content/res/Configuration;-><init>()V

    .line 180
    .line 181
    .line 182
    const/4 v6, -0x1

    .line 183
    iput v6, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    iput v6, v4, Landroid/content/res/Configuration;->fontScale:F

    .line 187
    .line 188
    invoke-virtual {p1, v4}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    iget v8, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 209
    .line 210
    iput v8, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 211
    .line 212
    invoke-virtual {v4, v7}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-nez v8, :cond_20

    .line 217
    .line 218
    new-instance v8, Landroid/content/res/Configuration;

    .line 219
    .line 220
    invoke-direct {v8}, Landroid/content/res/Configuration;-><init>()V

    .line 221
    .line 222
    .line 223
    iput v6, v8, Landroid/content/res/Configuration;->fontScale:F

    .line 224
    .line 225
    invoke-virtual {v4, v7}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    if-nez v6, :cond_b

    .line 230
    .line 231
    goto/16 :goto_5

    .line 232
    .line 233
    :cond_b
    iget v6, v4, Landroid/content/res/Configuration;->fontScale:F

    .line 234
    .line 235
    iget v9, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 236
    .line 237
    cmpl-float v6, v6, v9

    .line 238
    .line 239
    if-eqz v6, :cond_c

    .line 240
    .line 241
    iput v9, v8, Landroid/content/res/Configuration;->fontScale:F

    .line 242
    .line 243
    :cond_c
    iget v6, v4, Landroid/content/res/Configuration;->mcc:I

    .line 244
    .line 245
    iget v9, v7, Landroid/content/res/Configuration;->mcc:I

    .line 246
    .line 247
    if-eq v6, v9, :cond_d

    .line 248
    .line 249
    iput v9, v8, Landroid/content/res/Configuration;->mcc:I

    .line 250
    .line 251
    :cond_d
    iget v6, v4, Landroid/content/res/Configuration;->mnc:I

    .line 252
    .line 253
    iget v9, v7, Landroid/content/res/Configuration;->mnc:I

    .line 254
    .line 255
    if-eq v6, v9, :cond_e

    .line 256
    .line 257
    iput v9, v8, Landroid/content/res/Configuration;->mnc:I

    .line 258
    .line 259
    :cond_e
    invoke-static {v4, v7, v8}, Li3;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 260
    .line 261
    .line 262
    iget v6, v4, Landroid/content/res/Configuration;->touchscreen:I

    .line 263
    .line 264
    iget v9, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 265
    .line 266
    if-eq v6, v9, :cond_f

    .line 267
    .line 268
    iput v9, v8, Landroid/content/res/Configuration;->touchscreen:I

    .line 269
    .line 270
    :cond_f
    iget v6, v4, Landroid/content/res/Configuration;->keyboard:I

    .line 271
    .line 272
    iget v9, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 273
    .line 274
    if-eq v6, v9, :cond_10

    .line 275
    .line 276
    iput v9, v8, Landroid/content/res/Configuration;->keyboard:I

    .line 277
    .line 278
    :cond_10
    iget v6, v4, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 279
    .line 280
    iget v9, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 281
    .line 282
    if-eq v6, v9, :cond_11

    .line 283
    .line 284
    iput v9, v8, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 285
    .line 286
    :cond_11
    iget v6, v4, Landroid/content/res/Configuration;->navigation:I

    .line 287
    .line 288
    iget v9, v7, Landroid/content/res/Configuration;->navigation:I

    .line 289
    .line 290
    if-eq v6, v9, :cond_12

    .line 291
    .line 292
    iput v9, v8, Landroid/content/res/Configuration;->navigation:I

    .line 293
    .line 294
    :cond_12
    iget v6, v4, Landroid/content/res/Configuration;->navigationHidden:I

    .line 295
    .line 296
    iget v9, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 297
    .line 298
    if-eq v6, v9, :cond_13

    .line 299
    .line 300
    iput v9, v8, Landroid/content/res/Configuration;->navigationHidden:I

    .line 301
    .line 302
    :cond_13
    iget v6, v4, Landroid/content/res/Configuration;->orientation:I

    .line 303
    .line 304
    iget v9, v7, Landroid/content/res/Configuration;->orientation:I

    .line 305
    .line 306
    if-eq v6, v9, :cond_14

    .line 307
    .line 308
    iput v9, v8, Landroid/content/res/Configuration;->orientation:I

    .line 309
    .line 310
    :cond_14
    iget v6, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 311
    .line 312
    and-int/lit8 v6, v6, 0xf

    .line 313
    .line 314
    iget v9, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 315
    .line 316
    and-int/lit8 v9, v9, 0xf

    .line 317
    .line 318
    if-eq v6, v9, :cond_15

    .line 319
    .line 320
    iget v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 321
    .line 322
    or-int/2addr v6, v9

    .line 323
    iput v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 324
    .line 325
    :cond_15
    iget v6, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 326
    .line 327
    and-int/lit16 v6, v6, 0xc0

    .line 328
    .line 329
    iget v9, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 330
    .line 331
    and-int/lit16 v9, v9, 0xc0

    .line 332
    .line 333
    if-eq v6, v9, :cond_16

    .line 334
    .line 335
    iget v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 336
    .line 337
    or-int/2addr v6, v9

    .line 338
    iput v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 339
    .line 340
    :cond_16
    iget v6, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 341
    .line 342
    and-int/lit8 v6, v6, 0x30

    .line 343
    .line 344
    iget v9, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 345
    .line 346
    and-int/lit8 v9, v9, 0x30

    .line 347
    .line 348
    if-eq v6, v9, :cond_17

    .line 349
    .line 350
    iget v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 351
    .line 352
    or-int/2addr v6, v9

    .line 353
    iput v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 354
    .line 355
    :cond_17
    iget v6, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 356
    .line 357
    and-int/lit16 v6, v6, 0x300

    .line 358
    .line 359
    iget v9, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 360
    .line 361
    and-int/lit16 v9, v9, 0x300

    .line 362
    .line 363
    if-eq v6, v9, :cond_18

    .line 364
    .line 365
    iget v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 366
    .line 367
    or-int/2addr v6, v9

    .line 368
    iput v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 369
    .line 370
    :cond_18
    iget v6, v4, Landroid/content/res/Configuration;->colorMode:I

    .line 371
    .line 372
    and-int/lit8 v6, v6, 0x3

    .line 373
    .line 374
    iget v9, v7, Landroid/content/res/Configuration;->colorMode:I

    .line 375
    .line 376
    and-int/lit8 v9, v9, 0x3

    .line 377
    .line 378
    if-eq v6, v9, :cond_19

    .line 379
    .line 380
    iget v6, v8, Landroid/content/res/Configuration;->colorMode:I

    .line 381
    .line 382
    or-int/2addr v6, v9

    .line 383
    iput v6, v8, Landroid/content/res/Configuration;->colorMode:I

    .line 384
    .line 385
    :cond_19
    iget v6, v4, Landroid/content/res/Configuration;->colorMode:I

    .line 386
    .line 387
    and-int/lit8 v6, v6, 0xc

    .line 388
    .line 389
    iget v9, v7, Landroid/content/res/Configuration;->colorMode:I

    .line 390
    .line 391
    and-int/lit8 v9, v9, 0xc

    .line 392
    .line 393
    if-eq v6, v9, :cond_1a

    .line 394
    .line 395
    iget v6, v8, Landroid/content/res/Configuration;->colorMode:I

    .line 396
    .line 397
    or-int/2addr v6, v9

    .line 398
    iput v6, v8, Landroid/content/res/Configuration;->colorMode:I

    .line 399
    .line 400
    :cond_1a
    iget v6, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 401
    .line 402
    and-int/lit8 v6, v6, 0xf

    .line 403
    .line 404
    iget v9, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 405
    .line 406
    and-int/lit8 v9, v9, 0xf

    .line 407
    .line 408
    if-eq v6, v9, :cond_1b

    .line 409
    .line 410
    iget v6, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 411
    .line 412
    or-int/2addr v6, v9

    .line 413
    iput v6, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 414
    .line 415
    :cond_1b
    iget v6, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 416
    .line 417
    and-int/lit8 v6, v6, 0x30

    .line 418
    .line 419
    iget v9, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 420
    .line 421
    and-int/lit8 v9, v9, 0x30

    .line 422
    .line 423
    if-eq v6, v9, :cond_1c

    .line 424
    .line 425
    iget v6, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 426
    .line 427
    or-int/2addr v6, v9

    .line 428
    iput v6, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 429
    .line 430
    :cond_1c
    iget v6, v4, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 431
    .line 432
    iget v9, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 433
    .line 434
    if-eq v6, v9, :cond_1d

    .line 435
    .line 436
    iput v9, v8, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 437
    .line 438
    :cond_1d
    iget v6, v4, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 439
    .line 440
    iget v9, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 441
    .line 442
    if-eq v6, v9, :cond_1e

    .line 443
    .line 444
    iput v9, v8, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 445
    .line 446
    :cond_1e
    iget v6, v4, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 447
    .line 448
    iget v9, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 449
    .line 450
    if-eq v6, v9, :cond_1f

    .line 451
    .line 452
    iput v9, v8, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 453
    .line 454
    :cond_1f
    iget v4, v4, Landroid/content/res/Configuration;->densityDpi:I

    .line 455
    .line 456
    iget v6, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 457
    .line 458
    if-eq v4, v6, :cond_21

    .line 459
    .line 460
    iput v6, v8, Landroid/content/res/Configuration;->densityDpi:I

    .line 461
    .line 462
    goto :goto_5

    .line 463
    :cond_20
    move-object v8, v5

    .line 464
    :cond_21
    :goto_5
    invoke-static {p1, v0, v2, v8, v1}, Lr3;->t(Landroid/content/Context;ILsr;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    new-instance v2, Lkd;

    .line 469
    .line 470
    const v4, 0x7f110218

    .line 471
    .line 472
    .line 473
    invoke-direct {v2, p1, v4}, Lkd;-><init>(Landroid/content/Context;I)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2, v0}, Lkd;->a(Landroid/content/res/Configuration;)V

    .line 477
    .line 478
    .line 479
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 480
    .line 481
    .line 482
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_5

    .line 483
    if-eqz p1, :cond_25

    .line 484
    .line 485
    invoke-virtual {v2}, Lkd;->getTheme()Landroid/content/res/Resources$Theme;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    const/16 v0, 0x1d

    .line 490
    .line 491
    if-lt v3, v0, :cond_22

    .line 492
    .line 493
    invoke-static {p1}, Lb10;->a(Landroid/content/res/Resources$Theme;)V

    .line 494
    .line 495
    .line 496
    goto :goto_a

    .line 497
    :cond_22
    sget-object v0, Lff;->u:Ljava/lang/Object;

    .line 498
    .line 499
    monitor-enter v0

    .line 500
    :try_start_4
    sget-boolean v3, Lff;->w:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 501
    .line 502
    if-nez v3, :cond_23

    .line 503
    .line 504
    :try_start_5
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 505
    .line 506
    const-string v4, "rebase"

    .line 507
    .line 508
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    sput-object v3, Lff;->v:Ljava/lang/reflect/Method;

    .line 513
    .line 514
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 515
    .line 516
    .line 517
    goto :goto_6

    .line 518
    :catchall_1
    move-exception p1

    .line 519
    goto :goto_9

    .line 520
    :catch_2
    move-exception v3

    .line 521
    :try_start_6
    const-string v4, "ResourcesCompat"

    .line 522
    .line 523
    const-string v6, "Failed to retrieve rebase() method"

    .line 524
    .line 525
    invoke-static {v4, v6, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 526
    .line 527
    .line 528
    :goto_6
    sput-boolean v1, Lff;->w:Z

    .line 529
    .line 530
    :cond_23
    sget-object v1, Lff;->v:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 531
    .line 532
    if-eqz v1, :cond_24

    .line 533
    .line 534
    :try_start_7
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 535
    .line 536
    .line 537
    goto :goto_8

    .line 538
    :catch_3
    move-exception p1

    .line 539
    goto :goto_7

    .line 540
    :catch_4
    move-exception p1

    .line 541
    :goto_7
    :try_start_8
    const-string v1, "ResourcesCompat"

    .line 542
    .line 543
    const-string v3, "Failed to invoke rebase() method via reflection"

    .line 544
    .line 545
    invoke-static {v1, v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 546
    .line 547
    .line 548
    sput-object v5, Lff;->v:Ljava/lang/reflect/Method;

    .line 549
    .line 550
    :cond_24
    :goto_8
    monitor-exit v0

    .line 551
    goto :goto_a

    .line 552
    :goto_9
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 553
    throw p1

    .line 554
    :catch_5
    :cond_25
    :goto_a
    move-object p1, v2

    .line 555
    :goto_b
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 556
    .line 557
    .line 558
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lr3;

    .line 6
    .line 7
    invoke-virtual {v0}, Lr3;->A()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lr3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr3;->A()V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final f()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Le3;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lr3;

    .line 6
    .line 7
    invoke-virtual {v0}, Lr3;->w()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lr3;->l:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lr3;

    .line 6
    .line 7
    iget-object v1, v0, Lr3;->p:Lk50;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lr3;->A()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lk50;

    .line 15
    .line 16
    iget-object v2, v0, Lr3;->o:Lyb0;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lyb0;->L()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lr3;->k:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v1, v2}, Lk50;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lr3;->p:Lk50;

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Lr3;->p:Lk50;

    .line 33
    .line 34
    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget v0, Lf90;->a:I

    .line 2
    .line 3
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Le3;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final l()Le3;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->x:Lr3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Le3;->a:Lu5;

    .line 6
    .line 7
    new-instance v0, Lr3;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Lr3;-><init>(Landroid/content/Context;Landroid/view/Window;Lx2;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->x:Lr3;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->x:Lr3;

    .line 16
    .line 17
    return-object v0
.end method

.method public final m()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "<this>"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const v2, 0x7f0901b7

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const v2, 0x7f0901ba

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const v2, 0x7f0901b9

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const v1, 0x7f0901b8

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lr3;

    .line 9
    .line 10
    iget-boolean v0, p1, Lr3;->F:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p1, Lr3;->z:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lr3;->A()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lr3;->o:Lyb0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lyb0;->w:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/high16 v2, 0x7f050000

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lyb0;->O(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {}, Lu3;->a()Lu3;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p1, Lr3;->k:Landroid/content/Context;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v2, v0, Lu3;->a:Lw00;

    .line 48
    .line 49
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    :try_start_1
    iget-object v3, v2, Lw00;->b:Ljava/util/WeakHashMap;

    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lbs;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1}, Lbs;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    monitor-exit v0

    .line 68
    new-instance v0, Landroid/content/res/Configuration;

    .line 69
    .line 70
    iget-object v1, p1, Lr3;->k:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p1, Lr3;->R:Landroid/content/res/Configuration;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p1, v0, v0}, Lr3;->m(ZZ)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    :try_start_4
    throw p1

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 94
    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Le3;->e()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/FragmentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lr3;

    .line 15
    .line 16
    invoke-virtual {p1}, Lr3;->A()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Lr3;->o:Lyb0;

    .line 20
    .line 21
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    const v1, 0x102002c

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-ne p2, v1, :cond_7

    .line 30
    .line 31
    if-eqz p1, :cond_7

    .line 32
    .line 33
    iget-object p1, p1, Lyb0;->A:Lhf;

    .line 34
    .line 35
    check-cast p1, Lk70;

    .line 36
    .line 37
    iget p1, p1, Lk70;->b:I

    .line 38
    .line 39
    and-int/lit8 p1, p1, 0x4

    .line 40
    .line 41
    if-eqz p1, :cond_7

    .line 42
    .line 43
    invoke-static {p0}, Lzt;->r(Landroidx/appcompat/app/AppCompatActivity;)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_7

    .line 48
    .line 49
    invoke-static {p0, p1}, Lew;->c(Landroid/app/Activity;Landroid/content/Intent;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_6

    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Lzt;->r(Landroidx/appcompat/app/AppCompatActivity;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-nez p2, :cond_1

    .line 65
    .line 66
    invoke-static {p0}, Lzt;->r(Landroidx/appcompat/app/AppCompatActivity;)Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    :cond_1
    if-eqz p2, :cond_4

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    :try_start_0
    invoke-static {p0, v1}, Lzt;->s(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_0
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p1, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {p0, v1}, Lzt;->s(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 108
    :catch_0
    move-exception p1

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :goto_1
    const-string p2, "TaskStackBuilder"

    .line 115
    .line 116
    const-string v0, "Bad ComponentName while traversing activity parent metadata"

    .line 117
    .line 118
    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    throw p2

    .line 127
    :cond_4
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-nez p2, :cond_5

    .line 132
    .line 133
    new-array p2, v2, [Landroid/content/Intent;

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, [Landroid/content/Intent;

    .line 140
    .line 141
    new-instance p2, Landroid/content/Intent;

    .line 142
    .line 143
    aget-object v1, p1, v2

    .line 144
    .line 145
    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 146
    .line 147
    .line 148
    const v1, 0x1000c000

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    aput-object p2, p1, v2

    .line 156
    .line 157
    const/4 p2, 0x0

    .line 158
    invoke-static {p0, p1, p2}, Led;->a(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 159
    .line 160
    .line 161
    :try_start_1
    invoke-static {p0}, Lq1;->a(Landroid/app/Activity;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 166
    .line 167
    .line 168
    :goto_3
    return v0

    .line 169
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 170
    .line 171
    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 172
    .line 173
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p1

    .line 177
    :cond_6
    invoke-static {p0, p1}, Lew;->b(Landroid/app/Activity;Landroid/content/Intent;)Z

    .line 178
    .line 179
    .line 180
    return v0

    .line 181
    :cond_7
    return v2
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lr3;

    .line 9
    .line 10
    invoke-virtual {p1}, Lr3;->w()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lr3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr3;->A()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lr3;->o:Lyb0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, v0, Lyb0;->P:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lr3;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Lr3;->m(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lr3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr3;->A()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lr3;->o:Lyb0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lyb0;->P:Z

    .line 19
    .line 20
    iget-object v0, v0, Lyb0;->O:Lxa0;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lxa0;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Le3;->l(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lr3;

    .line 6
    .line 7
    invoke-virtual {v0}, Lr3;->A()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->m()V

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    move-result-object v0

    invoke-virtual {v0, p1}, Le3;->h(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->m()V

    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    move-result-object v0

    invoke-virtual {v0, p1}, Le3;->i(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->m()V

    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le3;->j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lr3;

    .line 9
    .line 10
    iput p1, v0, Lr3;->T:I

    .line 11
    .line 12
    return-void
.end method
