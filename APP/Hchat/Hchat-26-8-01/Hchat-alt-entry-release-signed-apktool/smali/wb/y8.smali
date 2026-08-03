.class public final synthetic Lwb/y8;
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


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/y8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/y8;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/y8;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/y8;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/y8;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/y8;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v4, p1

    .line 7
    check-cast v4, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    move p2, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v10

    .line 25
    :goto_0
    and-int/2addr p1, v9

    .line 26
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_8

    .line 31
    .line 32
    iget-object p1, p0, Lwb/y8;->i:Li0/a1;

    .line 33
    .line 34
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object p2, p0, Lwb/y8;->h:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    invoke-virtual {v4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v11, Li0/l;->a:Li0/e;

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    if-ne v2, v11, :cond_2

    .line 59
    .line 60
    :cond_1
    new-instance v2, Lwb/wh;

    .line 61
    .line 62
    const/4 v0, 0x3

    .line 63
    invoke-direct {v2, p2, p1, v0}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    move-object v5, v2

    .line 70
    check-cast v5, Lfg/l;

    .line 71
    .line 72
    const/16 v7, 0x1b0

    .line 73
    .line 74
    const/16 v8, 0x8

    .line 75
    .line 76
    const-string v2, "\u542f\u7528\u514d\u6253\u6270"

    .line 77
    .line 78
    const-string v3, "\u6307\u5b9a\u65f6\u95f4\u5185\u4e0d\u63d0\u9192"

    .line 79
    .line 80
    move-object v6, v4

    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 83
    .line 84
    .line 85
    move-object v4, v6

    .line 86
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_7

    .line 97
    .line 98
    const p1, -0x2ecf9d13

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    invoke-static {p1, v4, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lwb/y8;->j:Li0/a1;

    .line 109
    .line 110
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    move-object v6, v1

    .line 115
    check-cast v6, Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-nez v1, :cond_3

    .line 126
    .line 127
    if-ne v2, v11, :cond_4

    .line 128
    .line 129
    :cond_3
    new-instance v2, Lwb/wh;

    .line 130
    .line 131
    const/4 v1, 0x4

    .line 132
    invoke-direct {v2, p2, v0, v1}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    move-object v3, v2

    .line 139
    check-cast v3, Lfg/l;

    .line 140
    .line 141
    const/4 v1, 0x6

    .line 142
    const/4 v2, 0x4

    .line 143
    const-string v5, "\u5f00\u59cb\u65f6\u95f4"

    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    invoke-static/range {v1 .. v7}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    invoke-static {p1, v4, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lwb/y8;->k:Li0/a1;

    .line 153
    .line 154
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    move-object v6, v0

    .line 159
    check-cast v6, Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    if-nez v0, :cond_5

    .line 170
    .line 171
    if-ne v1, v11, :cond_6

    .line 172
    .line 173
    :cond_5
    new-instance v1, Lwb/wh;

    .line 174
    .line 175
    const/4 v0, 0x5

    .line 176
    invoke-direct {v1, p2, p1, v0}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_6
    move-object v3, v1

    .line 183
    check-cast v3, Lfg/l;

    .line 184
    .line 185
    const/4 v1, 0x6

    .line 186
    const/4 v2, 0x4

    .line 187
    const-string v5, "\u7ed3\u675f\u65f6\u95f4"

    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    invoke-static/range {v1 .. v7}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v10}, Li0/h0;->p(Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_7
    const p1, -0x2ec6fa06

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4, v10}, Li0/h0;->p(Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_8
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 208
    .line 209
    .line 210
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 211
    .line 212
    return-object p1

    .line 213
    :pswitch_0
    move-object v5, p1

    .line 214
    check-cast v5, Li0/h0;

    .line 215
    .line 216
    check-cast p2, Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    and-int/lit8 p2, p1, 0x3

    .line 223
    .line 224
    const/4 v0, 0x2

    .line 225
    const/4 v8, 0x1

    .line 226
    const/4 v9, 0x0

    .line 227
    if-eq p2, v0, :cond_9

    .line 228
    .line 229
    move p2, v8

    .line 230
    goto :goto_2

    .line 231
    :cond_9
    move p2, v9

    .line 232
    :goto_2
    and-int/2addr p1, v8

    .line 233
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-eqz p1, :cond_11

    .line 238
    .line 239
    const/4 v4, 0x0

    .line 240
    const/16 v6, 0x6db0

    .line 241
    .line 242
    iget-object v0, p0, Lwb/y8;->h:Landroid/content/SharedPreferences;

    .line 243
    .line 244
    const-string v1, "qq_music_order_replace_cover_with_avatar"

    .line 245
    .line 246
    const-string v2, "\u5c01\u9762\u4f7f\u7528\u70b9\u6b4c\u4eba\u5934\u50cf"

    .line 247
    .line 248
    const-string v3, "\u5934\u50cf\u4e0d\u53ef\u7528\u65f6\u4fdd\u7559\u6b4c\u66f2\u5c01\u9762"

    .line 249
    .line 250
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 251
    .line 252
    .line 253
    const/4 p1, 0x0

    .line 254
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 255
    .line 256
    .line 257
    const-string v1, "qq_music_order_replace_singer_with_nickname"

    .line 258
    .line 259
    const-string v2, "\u6b4c\u624b\u4f7f\u7528\u70b9\u6b4c\u4eba\u6635\u79f0"

    .line 260
    .line 261
    const-string v3, "\u6635\u79f0\u4e0d\u53ef\u7528\u65f6\u4fdd\u7559\u539f\u6b4c\u624b"

    .line 262
    .line 263
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 264
    .line 265
    .line 266
    move-object p2, v0

    .line 267
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 268
    .line 269
    .line 270
    iget-object v10, p0, Lwb/y8;->i:Li0/a1;

    .line 271
    .line 272
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, Ljava/lang/Boolean;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    sget-object v11, Li0/l;->a:Li0/e;

    .line 291
    .line 292
    if-nez v1, :cond_a

    .line 293
    .line 294
    if-ne v2, v11, :cond_b

    .line 295
    .line 296
    :cond_a
    new-instance v2, Lwb/di;

    .line 297
    .line 298
    const/4 v1, 0x2

    .line 299
    invoke-direct {v2, p2, v10, v1}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    :cond_b
    move-object v4, v2

    .line 306
    check-cast v4, Lfg/l;

    .line 307
    .line 308
    const/16 v6, 0x1b0

    .line 309
    .line 310
    const/16 v7, 0x8

    .line 311
    .line 312
    const-string v1, "\u81ea\u5b9a\u4e49 singer"

    .line 313
    .line 314
    const-string v2, "\u5141\u8bb8\u901a\u8fc7 & \u6307\u5b9a\u6b4c\u624b\u663e\u793a\u540d\u79f0"

    .line 315
    .line 316
    const/4 v3, 0x0

    .line 317
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, Ljava/lang/Boolean;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_e

    .line 331
    .line 332
    const v0, -0x28c081cc

    .line 333
    .line 334
    .line 335
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 336
    .line 337
    .line 338
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 339
    .line 340
    .line 341
    iget-object v0, p0, Lwb/y8;->j:Li0/a1;

    .line 342
    .line 343
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    move-object v2, v1

    .line 348
    check-cast v2, Ljava/lang/String;

    .line 349
    .line 350
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    if-nez v1, :cond_c

    .line 359
    .line 360
    if-ne v3, v11, :cond_d

    .line 361
    .line 362
    :cond_c
    new-instance v3, Lwb/di;

    .line 363
    .line 364
    const/4 v1, 0x3

    .line 365
    invoke-direct {v3, p2, v0, v1}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_d
    move-object v4, v3

    .line 372
    check-cast v4, Lfg/l;

    .line 373
    .line 374
    const/16 v6, 0x36

    .line 375
    .line 376
    const/16 v7, 0x8

    .line 377
    .line 378
    const-string v0, "\u9ed8\u8ba4 singer"

    .line 379
    .line 380
    const-string v1, "\u7559\u7a7a\u65f6\u4f7f\u7528\u539f\u6b4c\u624b\u6216\u70b9\u6b4c\u4eba\u6635\u79f0"

    .line 381
    .line 382
    const/4 v3, 0x0

    .line 383
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 387
    .line 388
    .line 389
    goto :goto_3

    .line 390
    :cond_e
    const v0, -0x28bbd80e

    .line 391
    .line 392
    .line 393
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 397
    .line 398
    .line 399
    :goto_3
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 400
    .line 401
    .line 402
    iget-object p1, p0, Lwb/y8;->k:Li0/a1;

    .line 403
    .line 404
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    move-object v2, v0

    .line 409
    check-cast v2, Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    if-nez v0, :cond_f

    .line 420
    .line 421
    if-ne v1, v11, :cond_10

    .line 422
    .line 423
    :cond_f
    new-instance v1, Lwb/di;

    .line 424
    .line 425
    const/4 v0, 0x4

    .line 426
    invoke-direct {v1, p2, p1, v0}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    :cond_10
    move-object v4, v1

    .line 433
    check-cast v4, Lfg/l;

    .line 434
    .line 435
    const/16 v6, 0x36

    .line 436
    .line 437
    const/16 v7, 0x8

    .line 438
    .line 439
    const-string v0, "AppID"

    .line 440
    .line 441
    const-string v1, "\u7559\u7a7a\u65f6\u4f7f\u7528 QQ \u97f3\u4e50\u9ed8\u8ba4 AppID"

    .line 442
    .line 443
    const/4 v3, 0x0

    .line 444
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 445
    .line 446
    .line 447
    goto :goto_4

    .line 448
    :cond_11
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 449
    .line 450
    .line 451
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 452
    .line 453
    return-object p1

    .line 454
    :pswitch_1
    move-object v6, p1

    .line 455
    check-cast v6, Li0/h0;

    .line 456
    .line 457
    check-cast p2, Ljava/lang/Integer;

    .line 458
    .line 459
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 460
    .line 461
    .line 462
    move-result p1

    .line 463
    and-int/lit8 p2, p1, 0x3

    .line 464
    .line 465
    const/4 v0, 0x2

    .line 466
    const/4 v9, 0x0

    .line 467
    const/4 v10, 0x1

    .line 468
    if-eq p2, v0, :cond_12

    .line 469
    .line 470
    move p2, v10

    .line 471
    goto :goto_5

    .line 472
    :cond_12
    move p2, v9

    .line 473
    :goto_5
    and-int/2addr p1, v10

    .line 474
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 475
    .line 476
    .line 477
    move-result p1

    .line 478
    if-eqz p1, :cond_1b

    .line 479
    .line 480
    iget-object p1, p0, Lwb/y8;->i:Li0/a1;

    .line 481
    .line 482
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p2

    .line 486
    check-cast p2, Ljava/lang/String;

    .line 487
    .line 488
    const-string v0, "all"

    .line 489
    .line 490
    invoke-static {p2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result p2

    .line 494
    const-string v1, "\u4ec5\u5fae\u4fe1\u4e3b\u9875"

    .line 495
    .line 496
    if-eqz p2, :cond_13

    .line 497
    .line 498
    const-string p2, "\u5fae\u4fe1\u6240\u6709\u9875\u9762"

    .line 499
    .line 500
    goto :goto_6

    .line 501
    :cond_13
    move-object p2, v1

    .line 502
    :goto_6
    new-instance v2, Lwb/dq;

    .line 503
    .line 504
    const-string v3, "home"

    .line 505
    .line 506
    invoke-direct {v2, v3, v1}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    new-instance v1, Lwb/dq;

    .line 510
    .line 511
    const-string v3, "\u6240\u6709\u5fae\u4fe1\u9875\u9762"

    .line 512
    .line 513
    invoke-direct {v1, v0, v3}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    filled-new-array {v2, v1}, [Lwb/dq;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    move-object v3, v0

    .line 529
    check-cast v3, Ljava/lang/String;

    .line 530
    .line 531
    iget-object v11, p0, Lwb/y8;->h:Landroid/content/SharedPreferences;

    .line 532
    .line 533
    invoke-virtual {v6, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    sget-object v12, Li0/l;->a:Li0/e;

    .line 542
    .line 543
    if-nez v0, :cond_14

    .line 544
    .line 545
    if-ne v1, v12, :cond_15

    .line 546
    .line 547
    :cond_14
    new-instance v1, Lwb/me;

    .line 548
    .line 549
    const/16 v0, 0x18

    .line 550
    .line 551
    invoke-direct {v1, v11, p1, v0}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v6, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    :cond_15
    move-object v4, v1

    .line 558
    check-cast v4, Lfg/l;

    .line 559
    .line 560
    const/4 v7, 0x6

    .line 561
    const/16 v8, 0x20

    .line 562
    .line 563
    const-string v0, "\u663e\u793a\u8303\u56f4"

    .line 564
    .line 565
    const/4 v5, 0x0

    .line 566
    move-object v1, p2

    .line 567
    invoke-static/range {v0 .. v8}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 568
    .line 569
    .line 570
    const/4 p1, 0x0

    .line 571
    invoke-static {p1, v6, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 572
    .line 573
    .line 574
    iget-object p2, p0, Lwb/y8;->j:Li0/a1;

    .line 575
    .line 576
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    check-cast v0, Ljava/lang/String;

    .line 581
    .line 582
    const-string v1, "text"

    .line 583
    .line 584
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    const-string v3, "\u4ec5\u56fe\u6807"

    .line 589
    .line 590
    const-string v4, "\u56fe\u6807\u548c\u6587\u5b57"

    .line 591
    .line 592
    const-string v5, "both"

    .line 593
    .line 594
    const-string v7, "\u4ec5\u6587\u5b57"

    .line 595
    .line 596
    if-eqz v2, :cond_16

    .line 597
    .line 598
    move-object v0, v1

    .line 599
    move-object v1, v7

    .line 600
    goto :goto_7

    .line 601
    :cond_16
    invoke-static {v0, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-eqz v0, :cond_17

    .line 606
    .line 607
    move-object v0, v1

    .line 608
    move-object v1, v4

    .line 609
    goto :goto_7

    .line 610
    :cond_17
    move-object v0, v1

    .line 611
    move-object v1, v3

    .line 612
    :goto_7
    new-instance v2, Lwb/dq;

    .line 613
    .line 614
    const-string v8, "icon"

    .line 615
    .line 616
    invoke-direct {v2, v8, v3}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    new-instance v3, Lwb/dq;

    .line 620
    .line 621
    invoke-direct {v3, v0, v7}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    new-instance v0, Lwb/dq;

    .line 625
    .line 626
    invoke-direct {v0, v5, v4}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    filled-new-array {v2, v3, v0}, [Lwb/dq;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    move-object v3, v0

    .line 642
    check-cast v3, Ljava/lang/String;

    .line 643
    .line 644
    invoke-virtual {v6, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    if-nez v0, :cond_18

    .line 653
    .line 654
    if-ne v4, v12, :cond_19

    .line 655
    .line 656
    :cond_18
    new-instance v4, Lwb/me;

    .line 657
    .line 658
    const/16 v0, 0x19

    .line 659
    .line 660
    invoke-direct {v4, v11, p2, v0}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    :cond_19
    check-cast v4, Lfg/l;

    .line 667
    .line 668
    const/4 v7, 0x6

    .line 669
    const/16 v8, 0x20

    .line 670
    .line 671
    const-string v0, "\u5feb\u6377\u9879\u6837\u5f0f"

    .line 672
    .line 673
    const/4 v5, 0x0

    .line 674
    invoke-static/range {v0 .. v8}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 675
    .line 676
    .line 677
    invoke-static {p1, v6, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object p1

    .line 684
    if-ne p1, v12, :cond_1a

    .line 685
    .line 686
    new-instance p1, Lwb/bf;

    .line 687
    .line 688
    const/16 p2, 0x8

    .line 689
    .line 690
    iget-object v0, p0, Lwb/y8;->k:Li0/a1;

    .line 691
    .line 692
    invoke-direct {p1, v0, p2}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v6, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    :cond_1a
    check-cast p1, Lfg/a;

    .line 699
    .line 700
    const/16 p2, 0x1b6

    .line 701
    .line 702
    const-string v0, "\u6309\u94ae\u5916\u89c2"

    .line 703
    .line 704
    const-string v1, "\u8bbe\u7f6e\u6309\u94ae\u6e10\u53d8\u3001\u5927\u5c0f\u548c\u83dc\u5355\u540d\u79f0\u6837\u5f0f"

    .line 705
    .line 706
    invoke-static {v0, v1, p1, v6, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 707
    .line 708
    .line 709
    goto :goto_8

    .line 710
    :cond_1b
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 711
    .line 712
    .line 713
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 714
    .line 715
    return-object p1

    .line 716
    :pswitch_2
    move-object v5, p1

    .line 717
    check-cast v5, Li0/h0;

    .line 718
    .line 719
    check-cast p2, Ljava/lang/Integer;

    .line 720
    .line 721
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 722
    .line 723
    .line 724
    move-result p1

    .line 725
    and-int/lit8 p2, p1, 0x3

    .line 726
    .line 727
    const/4 v0, 0x2

    .line 728
    const/4 v8, 0x0

    .line 729
    const/4 v9, 0x1

    .line 730
    if-eq p2, v0, :cond_1c

    .line 731
    .line 732
    move p2, v9

    .line 733
    goto :goto_9

    .line 734
    :cond_1c
    move p2, v8

    .line 735
    :goto_9
    and-int/2addr p1, v9

    .line 736
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 737
    .line 738
    .line 739
    move-result p1

    .line 740
    if-eqz p1, :cond_23

    .line 741
    .line 742
    iget-object p1, p0, Lwb/y8;->i:Li0/a1;

    .line 743
    .line 744
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object p2

    .line 748
    check-cast p2, Ljava/lang/Boolean;

    .line 749
    .line 750
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    iget-object p2, p0, Lwb/y8;->h:Landroid/content/SharedPreferences;

    .line 755
    .line 756
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 757
    .line 758
    .line 759
    move-result v1

    .line 760
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    sget-object v10, Li0/l;->a:Li0/e;

    .line 765
    .line 766
    if-nez v1, :cond_1d

    .line 767
    .line 768
    if-ne v2, v10, :cond_1e

    .line 769
    .line 770
    :cond_1d
    new-instance v2, Lwb/wb;

    .line 771
    .line 772
    const/16 v1, 0xa

    .line 773
    .line 774
    invoke-direct {v2, p2, p1, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    :cond_1e
    move-object v4, v2

    .line 781
    check-cast v4, Lfg/l;

    .line 782
    .line 783
    const/16 v6, 0x1b0

    .line 784
    .line 785
    const/16 v7, 0x8

    .line 786
    .line 787
    const-string v1, "\u4f59\u989d"

    .line 788
    .line 789
    const-string v2, "\u56fa\u5b9a\u663e\u793a\u6216\u6309\u771f\u5b9e\u91d1\u989d\u52a8\u6001\u589e\u51cf"

    .line 790
    .line 791
    const/4 v3, 0x0

    .line 792
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 793
    .line 794
    .line 795
    const/4 p1, 0x0

    .line 796
    invoke-static {p1, v5, v8, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 797
    .line 798
    .line 799
    iget-object v0, p0, Lwb/y8;->j:Li0/a1;

    .line 800
    .line 801
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v1

    .line 805
    check-cast v1, Ljava/lang/Boolean;

    .line 806
    .line 807
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 808
    .line 809
    .line 810
    move-result v1

    .line 811
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    if-nez v2, :cond_1f

    .line 820
    .line 821
    if-ne v3, v10, :cond_20

    .line 822
    .line 823
    :cond_1f
    new-instance v3, Lwb/wb;

    .line 824
    .line 825
    const/16 v2, 0xb

    .line 826
    .line 827
    invoke-direct {v3, p2, v0, v2}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    :cond_20
    move-object v4, v3

    .line 834
    check-cast v4, Lfg/l;

    .line 835
    .line 836
    const/16 v6, 0x1b0

    .line 837
    .line 838
    const/16 v7, 0x8

    .line 839
    .line 840
    move v0, v1

    .line 841
    const-string v1, "\u96f6\u94b1\u901a"

    .line 842
    .line 843
    const-string v2, "\u56fa\u5b9a\u663e\u793a\u6216\u6309\u771f\u5b9e\u91d1\u989d\u52a8\u6001\u589e\u51cf"

    .line 844
    .line 845
    const/4 v3, 0x0

    .line 846
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 847
    .line 848
    .line 849
    invoke-static {p1, v5, v8, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 850
    .line 851
    .line 852
    iget-object p1, p0, Lwb/y8;->k:Li0/a1;

    .line 853
    .line 854
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    check-cast v0, Ljava/lang/Boolean;

    .line 859
    .line 860
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 865
    .line 866
    .line 867
    move-result v1

    .line 868
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    if-nez v1, :cond_21

    .line 873
    .line 874
    if-ne v2, v10, :cond_22

    .line 875
    .line 876
    :cond_21
    new-instance v2, Lwb/wb;

    .line 877
    .line 878
    const/16 v1, 0xc

    .line 879
    .line 880
    invoke-direct {v2, p2, p1, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    :cond_22
    move-object v4, v2

    .line 887
    check-cast v4, Lfg/l;

    .line 888
    .line 889
    const/16 v6, 0x1b0

    .line 890
    .line 891
    const/16 v7, 0x8

    .line 892
    .line 893
    const-string v1, "\u7ecf\u8425\u8d26\u6237"

    .line 894
    .line 895
    const-string v2, "\u56fa\u5b9a\u663e\u793a\u6216\u6309\u771f\u5b9e\u91d1\u989d\u52a8\u6001\u589e\u51cf"

    .line 896
    .line 897
    const/4 v3, 0x0

    .line 898
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 899
    .line 900
    .line 901
    goto :goto_a

    .line 902
    :cond_23
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 903
    .line 904
    .line 905
    :goto_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 906
    .line 907
    return-object p1

    .line 908
    :pswitch_3
    move-object v5, p1

    .line 909
    check-cast v5, Li0/h0;

    .line 910
    .line 911
    check-cast p2, Ljava/lang/Integer;

    .line 912
    .line 913
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 914
    .line 915
    .line 916
    move-result p1

    .line 917
    and-int/lit8 p2, p1, 0x3

    .line 918
    .line 919
    const/4 v0, 0x2

    .line 920
    const/4 v9, 0x1

    .line 921
    const/4 v10, 0x0

    .line 922
    if-eq p2, v0, :cond_24

    .line 923
    .line 924
    move p2, v9

    .line 925
    goto :goto_b

    .line 926
    :cond_24
    move p2, v10

    .line 927
    :goto_b
    and-int/2addr p1, v9

    .line 928
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 929
    .line 930
    .line 931
    move-result p1

    .line 932
    if-eqz p1, :cond_2b

    .line 933
    .line 934
    iget-object p1, p0, Lwb/y8;->i:Li0/a1;

    .line 935
    .line 936
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object p2

    .line 940
    check-cast p2, Ljava/lang/Boolean;

    .line 941
    .line 942
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 943
    .line 944
    .line 945
    move-result v0

    .line 946
    iget-object p2, p0, Lwb/y8;->h:Landroid/content/SharedPreferences;

    .line 947
    .line 948
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v1

    .line 952
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v2

    .line 956
    sget-object v11, Li0/l;->a:Li0/e;

    .line 957
    .line 958
    if-nez v1, :cond_25

    .line 959
    .line 960
    if-ne v2, v11, :cond_26

    .line 961
    .line 962
    :cond_25
    new-instance v2, Lwb/wb;

    .line 963
    .line 964
    const/4 v1, 0x5

    .line 965
    invoke-direct {v2, p2, p1, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 969
    .line 970
    .line 971
    :cond_26
    move-object v4, v2

    .line 972
    check-cast v4, Lfg/l;

    .line 973
    .line 974
    const/16 v6, 0x1b0

    .line 975
    .line 976
    const/16 v7, 0x8

    .line 977
    .line 978
    const-string v1, "\u7fa4\u6635\u79f0\u81ea\u5b9a\u4e49\u989c\u8272"

    .line 979
    .line 980
    const-string v2, "\u4fee\u6539\u7fa4\u804a\u6210\u5458\u6635\u79f0\u7684\u989c\u8272\u548c\u7c97\u7ec6"

    .line 981
    .line 982
    const/4 v3, 0x0

    .line 983
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 984
    .line 985
    .line 986
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object p1

    .line 990
    check-cast p1, Ljava/lang/Boolean;

    .line 991
    .line 992
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 993
    .line 994
    .line 995
    move-result p1

    .line 996
    if-eqz p1, :cond_2a

    .line 997
    .line 998
    const p1, -0x293a7136

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1002
    .line 1003
    .line 1004
    const/4 p1, 0x0

    .line 1005
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1006
    .line 1007
    .line 1008
    iget-object p2, p0, Lwb/y8;->j:Li0/a1;

    .line 1009
    .line 1010
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    move-object v2, v0

    .line 1015
    check-cast v2, Ljava/lang/String;

    .line 1016
    .line 1017
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    if-ne v0, v11, :cond_27

    .line 1022
    .line 1023
    new-instance v0, Lwb/l9;

    .line 1024
    .line 1025
    const/16 v1, 0xc

    .line 1026
    .line 1027
    invoke-direct {v0, p2, v1}, Lwb/l9;-><init>(Li0/a1;I)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1031
    .line 1032
    .line 1033
    :cond_27
    move-object v4, v0

    .line 1034
    check-cast v4, Lfg/a;

    .line 1035
    .line 1036
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    if-ne v0, v11, :cond_28

    .line 1041
    .line 1042
    new-instance v0, Lwb/ab;

    .line 1043
    .line 1044
    const/16 v1, 0x8

    .line 1045
    .line 1046
    invoke-direct {v0, p2, v1}, Lwb/ab;-><init>(Li0/a1;I)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1050
    .line 1051
    .line 1052
    :cond_28
    check-cast v0, Lfg/l;

    .line 1053
    .line 1054
    const v7, 0x36036

    .line 1055
    .line 1056
    .line 1057
    const/16 v8, 0x8

    .line 1058
    .line 1059
    move-object v6, v5

    .line 1060
    move-object v5, v0

    .line 1061
    const-string v0, "\u6635\u79f0\u989c\u8272"

    .line 1062
    .line 1063
    const-string v1, "\u7559\u7a7a\u8ddf\u968f\u5fae\u4fe1\uff0c\u6e10\u53d8\u7528 #F59E0B,#22C55E"

    .line 1064
    .line 1065
    const/4 v3, 0x0

    .line 1066
    invoke-static/range {v0 .. v8}, Lwb/ho;->S(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/l;Li0/h0;II)V

    .line 1067
    .line 1068
    .line 1069
    move-object v5, v6

    .line 1070
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1071
    .line 1072
    .line 1073
    iget-object p1, p0, Lwb/y8;->k:Li0/a1;

    .line 1074
    .line 1075
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object p2

    .line 1079
    check-cast p2, Ljava/lang/String;

    .line 1080
    .line 1081
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    if-ne v0, v11, :cond_29

    .line 1086
    .line 1087
    new-instance v0, Lwb/ab;

    .line 1088
    .line 1089
    const/16 v1, 0x9

    .line 1090
    .line 1091
    invoke-direct {v0, p1, v1}, Lwb/ab;-><init>(Li0/a1;I)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1095
    .line 1096
    .line 1097
    :cond_29
    check-cast v0, Lfg/l;

    .line 1098
    .line 1099
    const/16 p1, 0x186

    .line 1100
    .line 1101
    const-string v1, "\u6635\u79f0\u7c97\u7ec6"

    .line 1102
    .line 1103
    invoke-static {v1, p2, v0, v5, p1}, Lwb/ho;->n4(Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 1107
    .line 1108
    .line 1109
    goto :goto_c

    .line 1110
    :cond_2a
    const p1, -0x29335fd4

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 1117
    .line 1118
    .line 1119
    goto :goto_c

    .line 1120
    :cond_2b
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1121
    .line 1122
    .line 1123
    :goto_c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1124
    .line 1125
    return-object p1

    .line 1126
    :pswitch_4
    move-object v5, p1

    .line 1127
    check-cast v5, Li0/h0;

    .line 1128
    .line 1129
    check-cast p2, Ljava/lang/Integer;

    .line 1130
    .line 1131
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1132
    .line 1133
    .line 1134
    move-result p1

    .line 1135
    and-int/lit8 p2, p1, 0x3

    .line 1136
    .line 1137
    const/4 v0, 0x2

    .line 1138
    const/4 v8, 0x1

    .line 1139
    const/4 v9, 0x0

    .line 1140
    if-eq p2, v0, :cond_2c

    .line 1141
    .line 1142
    move p2, v8

    .line 1143
    goto :goto_d

    .line 1144
    :cond_2c
    move p2, v9

    .line 1145
    :goto_d
    and-int/2addr p1, v8

    .line 1146
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1147
    .line 1148
    .line 1149
    move-result p1

    .line 1150
    if-eqz p1, :cond_34

    .line 1151
    .line 1152
    iget-object p1, p0, Lwb/y8;->i:Li0/a1;

    .line 1153
    .line 1154
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object p2

    .line 1158
    check-cast p2, Ljava/lang/Boolean;

    .line 1159
    .line 1160
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1161
    .line 1162
    .line 1163
    move-result v0

    .line 1164
    iget-object p2, p0, Lwb/y8;->h:Landroid/content/SharedPreferences;

    .line 1165
    .line 1166
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v1

    .line 1170
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v2

    .line 1174
    sget-object v10, Li0/l;->a:Li0/e;

    .line 1175
    .line 1176
    if-nez v1, :cond_2d

    .line 1177
    .line 1178
    if-ne v2, v10, :cond_2e

    .line 1179
    .line 1180
    :cond_2d
    new-instance v2, Lwb/wb;

    .line 1181
    .line 1182
    const/16 v1, 0x1c

    .line 1183
    .line 1184
    invoke-direct {v2, p2, p1, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1188
    .line 1189
    .line 1190
    :cond_2e
    move-object v4, v2

    .line 1191
    check-cast v4, Lfg/l;

    .line 1192
    .line 1193
    const/16 v6, 0x1b0

    .line 1194
    .line 1195
    const/16 v7, 0x8

    .line 1196
    .line 1197
    const-string v1, "\u670b\u53cb\u5708\u4e0a\u4f20\u5c3e\u5df4"

    .line 1198
    .line 1199
    const-string v2, "\u53d1\u5e03\u65f6\u9644\u5e26\u6307\u5b9a\u7684 SDK \u6765\u6e90"

    .line 1200
    .line 1201
    const/4 v3, 0x0

    .line 1202
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1203
    .line 1204
    .line 1205
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object p1

    .line 1209
    check-cast p1, Ljava/lang/Boolean;

    .line 1210
    .line 1211
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1212
    .line 1213
    .line 1214
    move-result p1

    .line 1215
    if-eqz p1, :cond_33

    .line 1216
    .line 1217
    const p1, 0x6554d0d5

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1221
    .line 1222
    .line 1223
    const/4 p1, 0x0

    .line 1224
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1225
    .line 1226
    .line 1227
    iget-object v0, p0, Lwb/y8;->j:Li0/a1;

    .line 1228
    .line 1229
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v1

    .line 1233
    move-object v2, v1

    .line 1234
    check-cast v2, Ljava/lang/String;

    .line 1235
    .line 1236
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v1

    .line 1240
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v3

    .line 1244
    if-nez v1, :cond_2f

    .line 1245
    .line 1246
    if-ne v3, v10, :cond_30

    .line 1247
    .line 1248
    :cond_2f
    new-instance v3, Lwb/wb;

    .line 1249
    .line 1250
    const/16 v1, 0x1d

    .line 1251
    .line 1252
    invoke-direct {v3, p2, v0, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1256
    .line 1257
    .line 1258
    :cond_30
    move-object v4, v3

    .line 1259
    check-cast v4, Lfg/l;

    .line 1260
    .line 1261
    const/16 v6, 0x36

    .line 1262
    .line 1263
    const/16 v7, 0x8

    .line 1264
    .line 1265
    const-string v0, "SDK ID"

    .line 1266
    .line 1267
    const-string v1, "\u8f93\u5165\u7b2c\u4e09\u65b9 SDK \u6807\u8bc6"

    .line 1268
    .line 1269
    const/4 v3, 0x0

    .line 1270
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 1271
    .line 1272
    .line 1273
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1274
    .line 1275
    .line 1276
    iget-object p1, p0, Lwb/y8;->k:Li0/a1;

    .line 1277
    .line 1278
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v0

    .line 1282
    move-object v2, v0

    .line 1283
    check-cast v2, Ljava/lang/String;

    .line 1284
    .line 1285
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1286
    .line 1287
    .line 1288
    move-result v0

    .line 1289
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v1

    .line 1293
    if-nez v0, :cond_31

    .line 1294
    .line 1295
    if-ne v1, v10, :cond_32

    .line 1296
    .line 1297
    :cond_31
    new-instance v1, Lwb/me;

    .line 1298
    .line 1299
    const/4 v0, 0x0

    .line 1300
    invoke-direct {v1, p2, p1, v0}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1304
    .line 1305
    .line 1306
    :cond_32
    move-object v4, v1

    .line 1307
    check-cast v4, Lfg/l;

    .line 1308
    .line 1309
    const/16 v6, 0x36

    .line 1310
    .line 1311
    const/16 v7, 0x8

    .line 1312
    .line 1313
    const-string v0, "SDK \u540d\u79f0"

    .line 1314
    .line 1315
    const-string v1, "\u8f93\u5165\u663e\u793a\u7684 SDK \u540d\u79f0"

    .line 1316
    .line 1317
    const/4 v3, 0x0

    .line 1318
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1322
    .line 1323
    .line 1324
    goto :goto_e

    .line 1325
    :cond_33
    const p1, 0x655e461a

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1332
    .line 1333
    .line 1334
    goto :goto_e

    .line 1335
    :cond_34
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1336
    .line 1337
    .line 1338
    :goto_e
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1339
    .line 1340
    return-object p1

    .line 1341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
