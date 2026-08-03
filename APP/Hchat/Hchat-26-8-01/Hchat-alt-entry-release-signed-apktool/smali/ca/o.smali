.class public final synthetic Lca/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Lca/e0;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lca/e0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lca/o;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lca/o;->h:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lca/o;->i:Lca/e0;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lca/e0;Landroid/app/Activity;I)V
    .locals 0

    .line 12
    iput p3, p0, Lca/o;->g:I

    iput-object p1, p0, Lca/o;->i:Lca/e0;

    iput-object p2, p0, Lca/o;->h:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lca/o;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp8/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lca/o;->i:Lca/e0;

    .line 12
    .line 13
    iget-object v1, v0, Lca/e0;->o:Landroidx/lifecycle/x;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lca/o;->h:Landroid/app/Activity;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v3, p1, Lp8/c;->a:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v4, p1, Lp8/c;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    new-instance p1, Ljava/io/File;

    .line 34
    .line 35
    invoke-direct {p1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    const-string p1, "\u670b\u53cb\u5708\u89c6\u9891\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_0
    invoke-static {p1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v4, "video/*"

    .line 52
    .line 53
    invoke-virtual {v1, v2, p1, v4, v3}, Landroidx/lifecycle/x;->Y(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    invoke-virtual {p1}, Lp8/c;->b()Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_6

    .line 67
    .line 68
    invoke-virtual {p1}, Lp8/c;->b()Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v4, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_2

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Ljava/lang/String;

    .line 96
    .line 97
    new-instance v6, Ljava/io/File;

    .line 98
    .line 99
    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_3

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_5

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, Ljava/io/File;

    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-nez v5, :cond_4

    .line 134
    .line 135
    const-string p1, "\u90e8\u5206\u670b\u53cb\u5708\u56fe\u7247\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    :goto_1
    const-string p1, "image/*"

    .line 139
    .line 140
    invoke-virtual {v1, v2, v4, p1, v3}, Landroidx/lifecycle/x;->Y(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    goto :goto_2

    .line 145
    :cond_6
    const-string p1, "\u670b\u53cb\u5708\u5185\u5bb9\u4e3a\u7a7a"

    .line 146
    .line 147
    invoke-static {v2, v3, p1}, Landroidx/lifecycle/x;->a0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    :goto_2
    if-eqz p1, :cond_7

    .line 152
    .line 153
    invoke-virtual {v0, v2, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 157
    .line 158
    return-object p1

    .line 159
    :pswitch_0
    check-cast p1, Lp8/c;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lca/o;->i:Lca/e0;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v1, Landroid/content/Intent;

    .line 170
    .line 171
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 172
    .line 173
    .line 174
    iget-object v2, p0, Lca/o;->h:Landroid/app/Activity;

    .line 175
    .line 176
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    const-string v4, "com.tencent.mm.plugin.sns.ui.SnsUploadUI"

    .line 181
    .line 182
    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-object v3, p1, Lp8/c;->c:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v4, p1, Lp8/c;->a:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    const-string v6, "Ksnsupload_type"

    .line 198
    .line 199
    const-string v7, "Kdescription"

    .line 200
    .line 201
    if-nez v5, :cond_8

    .line 202
    .line 203
    const/16 v5, 0xe

    .line 204
    .line 205
    invoke-virtual {v1, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 206
    .line 207
    .line 208
    const-string v5, "KSightPath"

    .line 209
    .line 210
    invoke-virtual {v1, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 211
    .line 212
    .line 213
    const-string v3, "KSightThumbPath"

    .line 214
    .line 215
    iget-object p1, p1, Lp8/c;->d:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v7, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_8
    invoke-virtual {p1}, Lp8/c;->b()Ljava/util/ArrayList;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-nez v3, :cond_a

    .line 233
    .line 234
    iget-object v3, p1, Lp8/c;->b:Ljava/util/List;

    .line 235
    .line 236
    invoke-virtual {v0, v1, v3}, Lca/e0;->l(Landroid/content/Intent;Ljava/util/List;)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-nez v3, :cond_9

    .line 241
    .line 242
    invoke-virtual {p1}, Lp8/c;->b()Ljava/util/ArrayList;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    new-instance v3, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-static {p1, v3}, Ltf/m;->N1(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 252
    .line 253
    .line 254
    const-string p1, "sns_kemdia_path_list"

    .line 255
    .line 256
    invoke-virtual {v1, p1, v3}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 257
    .line 258
    .line 259
    :cond_9
    invoke-virtual {v1, v7, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_a
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    if-nez p1, :cond_b

    .line 268
    .line 269
    const/16 p1, 0x9

    .line 270
    .line 271
    invoke-virtual {v1, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v7, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 275
    .line 276
    .line 277
    :goto_3
    invoke-virtual {v0, v2, v1}, Lca/e0;->q(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_b
    const-string p1, "\u670b\u53cb\u5708\u5185\u5bb9\u4e3a\u7a7a"

    .line 282
    .line 283
    invoke-virtual {v0, v2, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 287
    .line 288
    return-object p1

    .line 289
    :pswitch_1
    check-cast p1, Lca/z;

    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object v0, p1, Lca/z;->c:Ljava/lang/String;

    .line 295
    .line 296
    iget v1, p1, Lca/z;->a:I

    .line 297
    .line 298
    const/4 v2, 0x1

    .line 299
    iget-object v3, p0, Lca/o;->h:Landroid/app/Activity;

    .line 300
    .line 301
    const-string v4, "Ksnsupload_type"

    .line 302
    .line 303
    const/4 v5, 0x4

    .line 304
    const/4 v6, 0x2

    .line 305
    const-string v7, "com.tencent.mm.plugin.sns.ui.SnsUploadUI"

    .line 306
    .line 307
    if-eq v1, v2, :cond_e

    .line 308
    .line 309
    const/4 p1, 0x0

    .line 310
    if-eq v1, v6, :cond_d

    .line 311
    .line 312
    if-eq v1, v5, :cond_c

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_c
    if-eqz v0, :cond_f

    .line 316
    .line 317
    new-instance p1, Landroid/content/Intent;

    .line 318
    .line 319
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {p1, v2, v7}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    const/16 v2, 0xe

    .line 331
    .line 332
    invoke-virtual {p1, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 333
    .line 334
    .line 335
    const-string v2, "KSightPath"

    .line 336
    .line 337
    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 338
    .line 339
    .line 340
    const-string v2, "KSightThumbPath"

    .line 341
    .line 342
    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_d
    if-eqz v0, :cond_f

    .line 347
    .line 348
    new-instance p1, Landroid/content/Intent;

    .line 349
    .line 350
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {p1, v2, v7}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    filled-new-array {v0}, [Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v0}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    const-string v2, "sns_kemdia_path_list"

    .line 370
    .line 371
    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 372
    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_e
    new-instance v0, Landroid/content/Intent;

    .line 376
    .line 377
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v0, v2, v7}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    const/16 v2, 0x9

    .line 389
    .line 390
    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 391
    .line 392
    .line 393
    const-string v2, "Kdescription"

    .line 394
    .line 395
    iget-object p1, p1, Lca/z;->b:Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 398
    .line 399
    .line 400
    move-object p1, v0

    .line 401
    :cond_f
    :goto_5
    iget-object v0, p0, Lca/o;->i:Lca/e0;

    .line 402
    .line 403
    if-nez p1, :cond_12

    .line 404
    .line 405
    if-eq v1, v6, :cond_11

    .line 406
    .line 407
    if-ne v1, v5, :cond_10

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_10
    const-string p1, "\u8be5\u6536\u85cf\u7c7b\u578b\u6682\u4e0d\u652f\u6301\u8f6c\u53d1\u5230\u670b\u53cb\u5708"

    .line 411
    .line 412
    goto :goto_7

    .line 413
    :cond_11
    :goto_6
    const-string p1, "\u6536\u85cf\u5a92\u4f53\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 414
    .line 415
    :goto_7
    invoke-virtual {v0, v3, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    goto :goto_8

    .line 419
    :cond_12
    invoke-virtual {v0, v3, p1}, Lca/e0;->q(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 420
    .line 421
    .line 422
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 423
    .line 424
    return-object p1

    .line 425
    :pswitch_2
    check-cast p1, Lca/z;

    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    iget-object v0, p0, Lca/o;->i:Lca/e0;

    .line 431
    .line 432
    iget-object v1, v0, Lca/e0;->o:Landroidx/lifecycle/x;

    .line 433
    .line 434
    iget v2, p1, Lca/z;->a:I

    .line 435
    .line 436
    iget-object v3, p1, Lca/z;->b:Ljava/lang/String;

    .line 437
    .line 438
    iget-object p1, p1, Lca/z;->c:Ljava/lang/String;

    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    const/4 v4, 0x1

    .line 447
    iget-object v5, p0, Lca/o;->h:Landroid/app/Activity;

    .line 448
    .line 449
    if-ne v2, v4, :cond_13

    .line 450
    .line 451
    const-string p1, "\u6536\u85cf\u5185\u5bb9\u4e3a\u7a7a"

    .line 452
    .line 453
    invoke-static {v5, v3, p1}, Landroidx/lifecycle/x;->a0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    goto :goto_b

    .line 458
    :cond_13
    const/4 v3, 0x2

    .line 459
    if-eq v2, v3, :cond_14

    .line 460
    .line 461
    const/4 v4, 0x4

    .line 462
    if-eq v2, v4, :cond_14

    .line 463
    .line 464
    const-string p1, "\u8be5\u6536\u85cf\u7c7b\u578b\u6682\u4e0d\u652f\u6301\u7cfb\u7edf\u5206\u4eab"

    .line 465
    .line 466
    goto :goto_b

    .line 467
    :cond_14
    const-string v4, "\u6536\u85cf\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 468
    .line 469
    if-eqz p1, :cond_16

    .line 470
    .line 471
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 472
    .line 473
    .line 474
    move-result v6

    .line 475
    if-nez v6, :cond_15

    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_15
    const/4 p1, 0x0

    .line 479
    :goto_9
    if-eqz p1, :cond_16

    .line 480
    .line 481
    new-instance v6, Ljava/io/File;

    .line 482
    .line 483
    invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    .line 487
    .line 488
    .line 489
    move-result p1

    .line 490
    if-nez p1, :cond_17

    .line 491
    .line 492
    :cond_16
    move-object p1, v4

    .line 493
    goto :goto_b

    .line 494
    :cond_17
    if-ne v2, v3, :cond_18

    .line 495
    .line 496
    const-string p1, "image/*"

    .line 497
    .line 498
    goto :goto_a

    .line 499
    :cond_18
    const-string p1, "video/*"

    .line 500
    .line 501
    :goto_a
    invoke-static {v6}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    const-string v3, ""

    .line 506
    .line 507
    invoke-virtual {v1, v5, v2, p1, v3}, Landroidx/lifecycle/x;->Y(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    :goto_b
    if-eqz p1, :cond_19

    .line 512
    .line 513
    invoke-virtual {v0, v5, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    :cond_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 517
    .line 518
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
