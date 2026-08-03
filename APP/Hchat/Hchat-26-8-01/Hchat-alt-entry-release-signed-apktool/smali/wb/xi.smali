.class public final synthetic Lwb/xi;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/xi;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lfg/l;I)V
    .locals 0

    .line 11
    iput p3, p0, Lwb/xi;->g:I

    iput-object p1, p0, Lwb/xi;->i:Ljava/lang/Object;

    iput-object p2, p0, Lwb/xi;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/xi;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly9/e;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ly9/d;

    .line 13
    .line 14
    iget-object v2, v0, Ly9/e;->b:Lib/b;

    .line 15
    .line 16
    iget-object v3, v1, Ly9/d;->a:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, v1, Ly9/d;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v3, v4}, Lib/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v2, v2, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 32
    .line 33
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v4, "custom_title_"

    .line 38
    .line 39
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-string v4, "custom_color_"

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v4, "custom_text_color_"

    .line 58
    .line 59
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    new-instance v3, Lrb/g;

    .line 77
    .line 78
    const/16 v4, 0x16

    .line 79
    .line 80
    invoke-direct {v3, v0, v4, v1}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Lo8/j;->e(Ljava/lang/Runnable;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_0
    iget-object v0, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lqg/t;

    .line 92
    .line 93
    iget-object v1, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Lfg/l;

    .line 96
    .line 97
    new-instance v2, Lci/c;

    .line 98
    .line 99
    const/16 v3, 0xd

    .line 100
    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-direct {v2, v1, v4, v3}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 103
    .line 104
    .line 105
    const/4 v1, 0x3

    .line 106
    invoke-static {v0, v4, v2, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 107
    .line 108
    .line 109
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_1
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Lxa/i;

    .line 115
    .line 116
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const/4 v3, 0x0

    .line 125
    if-eqz v2, :cond_2

    .line 126
    .line 127
    iget-object v0, v0, Lxa/i;->b:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v2, v0, v1}, Lg8/i;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    const/4 v1, 0x1

    .line 134
    if-ne v0, v1, :cond_2

    .line 135
    .line 136
    move v3, v1

    .line 137
    :cond_2
    new-instance v0, Lxa/j;

    .line 138
    .line 139
    if-eqz v3, :cond_3

    .line 140
    .line 141
    const-string v1, "\u597d\u53cb\u5907\u6ce8\u5df2\u66f4\u65b0"

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    const-string v1, "\u4fee\u6539\u597d\u53cb\u5907\u6ce8\u5931\u8d25"

    .line 145
    .line 146
    :goto_2
    invoke-direct {v0, v3, v1}, Lxa/j;-><init>(ZLjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_2
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Lxa/i;

    .line 153
    .line 154
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    const/4 v3, 0x0

    .line 163
    if-eqz v2, :cond_7

    .line 164
    .line 165
    iget-object v0, v0, Lxa/i;->b:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-nez v4, :cond_4

    .line 172
    .line 173
    const-string v4, "rcontact"

    .line 174
    .line 175
    sget-object v5, Lg8/i;->n:[Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v2, v4, v5}, Lg8/i;->l(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-eqz v5, :cond_5

    .line 186
    .line 187
    :cond_4
    :goto_3
    move v0, v3

    .line 188
    goto :goto_4

    .line 189
    :cond_5
    const-string v5, ""

    .line 190
    .line 191
    invoke-virtual {v2, v5, v1}, Lg8/i;->c(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    if-nez v1, :cond_6

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_6
    invoke-virtual {v2, v0, v4, v1}, Lg8/i;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    :goto_4
    const/4 v1, 0x1

    .line 203
    if-ne v0, v1, :cond_7

    .line 204
    .line 205
    move v3, v1

    .line 206
    :cond_7
    new-instance v0, Lxa/j;

    .line 207
    .line 208
    if-eqz v3, :cond_8

    .line 209
    .line 210
    const-string v1, "\u597d\u53cb\u6807\u7b7e\u5df2\u66f4\u65b0"

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_8
    const-string v1, "\u66f4\u65b0\u597d\u53cb\u6807\u7b7e\u5931\u8d25"

    .line 214
    .line 215
    :goto_5
    invoke-direct {v0, v3, v1}, Lxa/j;-><init>(ZLjava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_3
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Lx0/d;

    .line 222
    .line 223
    iget-object v0, v0, Lx0/d;->g:Li0/h0;

    .line 224
    .line 225
    iget-object v1, v0, Li0/h0;->c:Ll0/h;

    .line 226
    .line 227
    invoke-virtual {v1}, Ll0/h;->d()Ll0/g;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    const/4 v3, 0x0

    .line 232
    move v4, v3

    .line 233
    :goto_6
    :try_start_0
    iget v5, v1, Ll0/h;->h:I

    .line 234
    .line 235
    const/4 v6, 0x0

    .line 236
    if-ge v4, v5, :cond_12

    .line 237
    .line 238
    invoke-virtual {v2, v4}, Ll0/g;->l(I)Z

    .line 239
    .line 240
    .line 241
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    iget-object v7, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 243
    .line 244
    if-eqz v5, :cond_c

    .line 245
    .line 246
    :try_start_1
    invoke-virtual {v2, v4}, Ll0/g;->n(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    if-eq v5, v7, :cond_b

    .line 251
    .line 252
    instance-of v8, v5, Li0/k0;

    .line 253
    .line 254
    if-eqz v8, :cond_9

    .line 255
    .line 256
    check-cast v5, Li0/k0;

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_9
    move-object v5, v6

    .line 260
    :goto_7
    if-eqz v5, :cond_a

    .line 261
    .line 262
    iget-object v5, v5, Li0/k0;->a:Li0/a2;

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_a
    move-object v5, v6

    .line 266
    :goto_8
    if-ne v5, v7, :cond_c

    .line 267
    .line 268
    :cond_b
    new-instance v3, Lx0/i;

    .line 269
    .line 270
    invoke-direct {v3, v6, v4}, Lx0/i;-><init>(Ljava/lang/Integer;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ll0/g;->c()V

    .line 274
    .line 275
    .line 276
    move-object v6, v3

    .line 277
    goto :goto_e

    .line 278
    :catchall_0
    move-exception v0

    .line 279
    goto/16 :goto_10

    .line 280
    .line 281
    :cond_c
    :try_start_2
    iget-object v5, v2, Ll0/g;->b:[I

    .line 282
    .line 283
    invoke-static {v5, v4}, Ll0/j;->b([II)I

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    add-int/lit8 v9, v4, 0x1

    .line 288
    .line 289
    iget v10, v2, Ll0/g;->c:I

    .line 290
    .line 291
    if-ge v9, v10, :cond_d

    .line 292
    .line 293
    mul-int/lit8 v10, v9, 0x5

    .line 294
    .line 295
    add-int/lit8 v10, v10, 0x4

    .line 296
    .line 297
    aget v5, v5, v10

    .line 298
    .line 299
    goto :goto_9

    .line 300
    :cond_d
    iget v5, v2, Ll0/g;->e:I

    .line 301
    .line 302
    :goto_9
    sub-int/2addr v5, v8

    .line 303
    move v8, v3

    .line 304
    :goto_a
    if-ge v8, v5, :cond_13

    .line 305
    .line 306
    invoke-virtual {v2, v4, v8}, Ll0/g;->h(II)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    if-eq v10, v7, :cond_11

    .line 311
    .line 312
    instance-of v11, v10, Li0/k0;

    .line 313
    .line 314
    if-eqz v11, :cond_e

    .line 315
    .line 316
    check-cast v10, Li0/k0;

    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_e
    move-object v10, v6

    .line 320
    :goto_b
    if-eqz v10, :cond_f

    .line 321
    .line 322
    iget-object v10, v10, Li0/k0;->a:Li0/a2;

    .line 323
    .line 324
    goto :goto_c

    .line 325
    :cond_f
    move-object v10, v6

    .line 326
    :goto_c
    if-ne v10, v7, :cond_10

    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_10
    add-int/lit8 v8, v8, 0x1

    .line 330
    .line 331
    goto :goto_a

    .line 332
    :cond_11
    :goto_d
    new-instance v6, Lx0/i;

    .line 333
    .line 334
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-direct {v6, v3, v4}, Lx0/i;-><init>(Ljava/lang/Integer;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 339
    .line 340
    .line 341
    :cond_12
    invoke-virtual {v2}, Ll0/g;->c()V

    .line 342
    .line 343
    .line 344
    goto :goto_e

    .line 345
    :cond_13
    move v4, v9

    .line 346
    goto :goto_6

    .line 347
    :goto_e
    if-eqz v6, :cond_14

    .line 348
    .line 349
    iget v2, v6, Lx0/i;->a:I

    .line 350
    .line 351
    iget-object v3, v6, Lx0/i;->b:Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v1}, Ll0/h;->d()Ll0/g;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    :try_start_3
    invoke-static {v1, v2, v3}, Lg4/a;->M(Ll0/g;ILjava/lang/Integer;)Ljava/util/ArrayList;

    .line 358
    .line 359
    .line 360
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 361
    invoke-virtual {v1}, Ll0/g;->c()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0}, Li0/h0;->I()Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-static {v2, v1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    goto :goto_f

    .line 373
    :catchall_1
    move-exception v0

    .line 374
    invoke-virtual {v1}, Ll0/g;->c()V

    .line 375
    .line 376
    .line 377
    throw v0

    .line 378
    :cond_14
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 379
    .line 380
    :goto_f
    new-instance v2, Lx0/a;

    .line 381
    .line 382
    iget-boolean v0, v0, Li0/h0;->C:Z

    .line 383
    .line 384
    invoke-direct {v2, v1, v0}, Lx0/a;-><init>(Ljava/util/List;Z)V

    .line 385
    .line 386
    .line 387
    return-object v2

    .line 388
    :goto_10
    invoke-virtual {v2}, Ll0/g;->c()V

    .line 389
    .line 390
    .line 391
    throw v0

    .line 392
    :pswitch_4
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v0, Lfg/l;

    .line 395
    .line 396
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v1, Lwb/iv;

    .line 399
    .line 400
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    goto/16 :goto_1

    .line 404
    .line 405
    :pswitch_5
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, Lfg/a;

    .line 408
    .line 409
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v1, Lc9/n0;

    .line 412
    .line 413
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1}, Lc9/n0;->invoke()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    goto/16 :goto_1

    .line 420
    .line 421
    :pswitch_6
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, Lfg/l;

    .line 424
    .line 425
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v1, Ljava/util/Set;

    .line 428
    .line 429
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    goto/16 :goto_1

    .line 433
    .line 434
    :pswitch_7
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 435
    .line 436
    move-object v1, v0

    .line 437
    check-cast v1, Landroid/app/Activity;

    .line 438
    .line 439
    const-string v0, "\u68c0\u6d4b\u5230\u5fae\u4fe1\u5f02\u5e38"

    .line 440
    .line 441
    iget-object v2, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v2, Ljava/lang/String;

    .line 444
    .line 445
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 446
    .line 447
    :try_start_4
    const-string v4, "clipboard"

    .line 448
    .line 449
    invoke-virtual {v1, v4}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    instance-of v5, v4, Landroid/content/ClipboardManager;

    .line 454
    .line 455
    if-eqz v5, :cond_15

    .line 456
    .line 457
    check-cast v4, Landroid/content/ClipboardManager;

    .line 458
    .line 459
    goto :goto_11

    .line 460
    :catchall_2
    move-exception v0

    .line 461
    goto :goto_12

    .line 462
    :cond_15
    const/4 v4, 0x0

    .line 463
    :goto_11
    if-eqz v4, :cond_16

    .line 464
    .line 465
    invoke-static {v0, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v4, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 470
    .line 471
    .line 472
    move-object v2, v3

    .line 473
    goto :goto_13

    .line 474
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 475
    .line 476
    const-string v2, "\u526a\u8d34\u677f\u670d\u52a1\u4e0d\u53ef\u7528"

    .line 477
    .line 478
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 482
    :goto_12
    new-instance v2, Lsf/f;

    .line 483
    .line 484
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 485
    .line 486
    .line 487
    :goto_13
    instance-of v0, v2, Lsf/f;

    .line 488
    .line 489
    if-nez v0, :cond_17

    .line 490
    .line 491
    const-string v0, "\u5f02\u5e38\u65e5\u5fd7\u5df2\u590d\u5236"

    .line 492
    .line 493
    goto :goto_14

    .line 494
    :cond_17
    const-string v0, "\u590d\u5236\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 495
    .line 496
    :goto_14
    const/4 v2, 0x0

    .line 497
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 502
    .line 503
    .line 504
    return-object v3

    .line 505
    :pswitch_8
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, Lfg/l;

    .line 508
    .line 509
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v1, Lfb/q1;

    .line 512
    .line 513
    iget-object v1, v1, Lfb/q1;->e:Ljava/lang/String;

    .line 514
    .line 515
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    goto/16 :goto_1

    .line 519
    .line 520
    :pswitch_9
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v0, Lfb/q1;

    .line 523
    .line 524
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v1, Li0/a1;

    .line 527
    .line 528
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    goto/16 :goto_1

    .line 532
    .line 533
    :pswitch_a
    iget-object v0, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Ljava/util/List;

    .line 536
    .line 537
    iget-object v1, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v1, Lfg/l;

    .line 540
    .line 541
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    add-int/lit8 v2, v2, 0x1

    .line 546
    .line 547
    new-instance v3, Lfb/r0;

    .line 548
    .line 549
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    const-string v5, ""

    .line 561
    .line 562
    const/4 v6, 0x0

    .line 563
    const-string v7, "-"

    .line 564
    .line 565
    invoke-static {v4, v7, v5, v6}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    const-string v5, "MCP "

    .line 570
    .line 571
    invoke-static {v2, v5}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    const-string v6, ""

    .line 576
    .line 577
    const/4 v8, 0x1

    .line 578
    move-object v7, v6

    .line 579
    invoke-direct/range {v3 .. v8}, Lfb/r0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 580
    .line 581
    .line 582
    invoke-static {v0, v3}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    goto/16 :goto_1

    .line 590
    .line 591
    :pswitch_b
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v0, Lfb/c;

    .line 594
    .line 595
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v1, Li0/a1;

    .line 598
    .line 599
    iget-object v0, v0, Lfb/c;->c:Ljava/lang/String;

    .line 600
    .line 601
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    goto/16 :goto_1

    .line 605
    .line 606
    :pswitch_c
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v0, Lfg/l;

    .line 609
    .line 610
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v1, Lfb/t0;

    .line 613
    .line 614
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    goto/16 :goto_1

    .line 618
    .line 619
    :pswitch_d
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast v0, Lfb/d1;

    .line 622
    .line 623
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v1, Li0/a1;

    .line 626
    .line 627
    iget-object v0, v0, Lfb/d1;->a:Ljava/lang/String;

    .line 628
    .line 629
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    goto/16 :goto_1

    .line 633
    .line 634
    :pswitch_e
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, Lfg/l;

    .line 637
    .line 638
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v1, Lfb/d1;

    .line 641
    .line 642
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    goto/16 :goto_1

    .line 646
    .line 647
    :pswitch_f
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v0, Lfg/l;

    .line 650
    .line 651
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v1, Lfb/a;

    .line 654
    .line 655
    iget-object v1, v1, Lfb/a;->b:Ljava/lang/String;

    .line 656
    .line 657
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    goto/16 :goto_1

    .line 661
    .line 662
    :pswitch_10
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v0, Lgb/o;

    .line 665
    .line 666
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v1, Li0/a1;

    .line 669
    .line 670
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    goto/16 :goto_1

    .line 674
    .line 675
    :pswitch_11
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v0, Leb/c0;

    .line 678
    .line 679
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v1, Li0/a1;

    .line 682
    .line 683
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    check-cast v2, Ljava/util/Map;

    .line 688
    .line 689
    iget-object v0, v0, Leb/c0;->a:Ljava/lang/String;

    .line 690
    .line 691
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 695
    .line 696
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 697
    .line 698
    .line 699
    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    if-eqz v0, :cond_19

    .line 707
    .line 708
    const/4 v2, 0x1

    .line 709
    if-eq v0, v2, :cond_18

    .line 710
    .line 711
    goto :goto_15

    .line 712
    :cond_18
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    check-cast v0, Ljava/util/Map$Entry;

    .line 725
    .line 726
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 735
    .line 736
    .line 737
    move-result-object v3

    .line 738
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    goto :goto_15

    .line 742
    :cond_19
    sget-object v3, Ltf/u;->g:Ltf/u;

    .line 743
    .line 744
    :goto_15
    invoke-interface {v1, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_1

    .line 748
    .line 749
    :pswitch_12
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v0, Lfg/l;

    .line 752
    .line 753
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v1, Lgb/c;

    .line 756
    .line 757
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    goto/16 :goto_1

    .line 761
    .line 762
    :pswitch_13
    iget-object v0, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v0, Lgb/o;

    .line 765
    .line 766
    iget-object v1, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v1, Lfg/l;

    .line 769
    .line 770
    if-eqz v0, :cond_1a

    .line 771
    .line 772
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    :cond_1a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 776
    .line 777
    return-object v0

    .line 778
    :pswitch_14
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v0, Lfg/l;

    .line 781
    .line 782
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v1, Lgb/h;

    .line 785
    .line 786
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    goto/16 :goto_1

    .line 790
    .line 791
    :pswitch_15
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast v0, Lsf/e;

    .line 794
    .line 795
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v1, Lfg/p;

    .line 798
    .line 799
    if-eqz v0, :cond_1b

    .line 800
    .line 801
    iget-object v2, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 802
    .line 803
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 804
    .line 805
    invoke-interface {v1, v2, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    :cond_1b
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 809
    .line 810
    return-object v0

    .line 811
    :pswitch_16
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v0, Lwb/v3;

    .line 814
    .line 815
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v1, Li0/a1;

    .line 818
    .line 819
    new-instance v2, Lwb/s3;

    .line 820
    .line 821
    check-cast v0, Lwb/t3;

    .line 822
    .line 823
    iget-object v3, v0, Lwb/t3;->a:Ln9/a;

    .line 824
    .line 825
    iget-boolean v0, v0, Lwb/t3;->b:Z

    .line 826
    .line 827
    invoke-direct {v2, v3, v0}, Lwb/s3;-><init>(Ln9/a;Z)V

    .line 828
    .line 829
    .line 830
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    goto/16 :goto_1

    .line 834
    .line 835
    :pswitch_17
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 836
    .line 837
    check-cast v0, Lfg/l;

    .line 838
    .line 839
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v1, Lwb/s4;

    .line 842
    .line 843
    iget-object v1, v1, Lwb/s4;->a:Lwb/t4;

    .line 844
    .line 845
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    goto/16 :goto_1

    .line 849
    .line 850
    :pswitch_18
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v0, Lwb/r2;

    .line 853
    .line 854
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v1, Li0/a1;

    .line 857
    .line 858
    new-instance v2, Lwb/q2;

    .line 859
    .line 860
    check-cast v0, Lwb/p2;

    .line 861
    .line 862
    iget-object v0, v0, Lwb/p2;->a:Ljava/lang/String;

    .line 863
    .line 864
    invoke-direct {v2, v0}, Lwb/q2;-><init>(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    goto/16 :goto_1

    .line 871
    .line 872
    :pswitch_19
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v0, Lfg/l;

    .line 875
    .line 876
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 877
    .line 878
    check-cast v1, Lwb/k5;

    .line 879
    .line 880
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    goto/16 :goto_1

    .line 884
    .line 885
    :pswitch_1a
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 886
    .line 887
    check-cast v0, Lfg/l;

    .line 888
    .line 889
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v1, Lwb/a3;

    .line 892
    .line 893
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    goto/16 :goto_1

    .line 897
    .line 898
    :pswitch_1b
    iget-object v0, p0, Lwb/xi;->h:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v0, Lfg/l;

    .line 901
    .line 902
    iget-object v1, p0, Lwb/xi;->i:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v1, Lwb/i2;

    .line 905
    .line 906
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    goto/16 :goto_1

    .line 910
    .line 911
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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
