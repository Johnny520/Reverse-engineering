.class public final synthetic Lab/e;
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
.method public synthetic constructor <init>(Li0/h0;Lm0/a;Ll0/g;Li0/v0;)V
    .locals 0

    .line 1
    const/16 p4, 0x8

    .line 2
    .line 3
    iput p4, p0, Lab/e;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lab/e;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lab/e;->i:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lab/e;->j:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Lab/e;->g:I

    iput-object p1, p0, Lab/e;->h:Ljava/lang/Object;

    iput-object p2, p0, Lab/e;->i:Ljava/lang/Object;

    iput-object p3, p0, Lab/e;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lab/e;->g:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lfg/a;

    .line 17
    .line 18
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Li0/a1;

    .line 21
    .line 22
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lrb/m;

    .line 27
    .line 28
    iget-boolean v4, v4, Lrb/m;->b:Z

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lrb/m;

    .line 37
    .line 38
    iget-boolean v2, v2, Lrb/m;->i:Z

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    const-string v1, "\u8bf7\u5148\u505c\u6b62\u5f53\u524d\u4efb\u52a1"

    .line 48
    .line 49
    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 54
    .line 55
    .line 56
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lwb/bp;

    .line 62
    .line 63
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lfg/l;

    .line 66
    .line 67
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Li0/a1;

    .line 70
    .line 71
    iget v3, v0, Lwb/bp;->b:I

    .line 72
    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v2, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_1
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lfg/l;

    .line 89
    .line 90
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Ldb/c;

    .line 93
    .line 94
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 103
    .line 104
    invoke-static {v1, v2, v3}, Lwb/ho;->o7(Ldb/c;ILjava/util/List;)Ldb/c;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_2
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Lwb/t5;

    .line 117
    .line 118
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Li0/a1;

    .line 121
    .line 122
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, Li0/a1;

    .line 125
    .line 126
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    const-string v0, ""

    .line 130
    .line 131
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 135
    .line 136
    return-object v0

    .line 137
    :pswitch_3
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Landroid/content/Context;

    .line 140
    .line 141
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lk9/j;

    .line 144
    .line 145
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Li0/a1;

    .line 148
    .line 149
    iget-object v3, v1, Lk9/j;->e:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v0, v3}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    iget-object v3, v1, Lk9/j;->f:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v0, v3}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Ljava/util/List;

    .line 164
    .line 165
    new-instance v4, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-eqz v5, :cond_3

    .line 179
    .line 180
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    move-object v6, v5

    .line 185
    check-cast v6, Lk9/j;

    .line 186
    .line 187
    iget-object v6, v6, Lk9/j;->a:Ljava/lang/String;

    .line 188
    .line 189
    iget-object v7, v1, Lk9/j;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-nez v6, :cond_2

    .line 196
    .line 197
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_3
    invoke-static {v0, v2, v4}, Lwb/ho;->V0(Landroid/content/Context;Li0/a1;Ljava/util/ArrayList;)V

    .line 202
    .line 203
    .line 204
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_4
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, Lwb/b3;

    .line 210
    .line 211
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v1, Ljava/lang/String;

    .line 214
    .line 215
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v2, Li0/a1;

    .line 218
    .line 219
    iget-boolean v0, v0, Lwb/b3;->d:Z

    .line 220
    .line 221
    if-eqz v0, :cond_5

    .line 222
    .line 223
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Ljava/util/Set;

    .line 228
    .line 229
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_4

    .line 234
    .line 235
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, Ljava/util/Set;

    .line 240
    .line 241
    invoke-static {v0, v1}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    goto :goto_3

    .line 246
    :cond_4
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Ljava/util/Set;

    .line 251
    .line 252
    invoke-static {v0, v1}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    goto :goto_3

    .line 257
    :cond_5
    invoke-static {v1}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    :goto_3
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_5
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, Landroid/content/Context;

    .line 270
    .line 271
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v1, Ljava/lang/String;

    .line 274
    .line 275
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v2, Lfg/a;

    .line 278
    .line 279
    const-string v5, "clipboard"

    .line 280
    .line 281
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    instance-of v6, v5, Landroid/content/ClipboardManager;

    .line 286
    .line 287
    if-eqz v6, :cond_6

    .line 288
    .line 289
    move-object v4, v5

    .line 290
    check-cast v4, Landroid/content/ClipboardManager;

    .line 291
    .line 292
    :cond_6
    if-eqz v4, :cond_7

    .line 293
    .line 294
    const-string v5, "HchatScriptDir"

    .line 295
    .line 296
    invoke-static {v5, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v4, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 301
    .line 302
    .line 303
    :cond_7
    const-string v1, "\u5df2\u590d\u5236"

    .line 304
    .line 305
    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 310
    .line 311
    .line 312
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 316
    .line 317
    return-object v0

    .line 318
    :pswitch_6
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Landroid/content/Context;

    .line 321
    .line 322
    iget-object v5, p0, Lab/e;->i:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v5, Lwb/s0;

    .line 325
    .line 326
    iget-object v6, p0, Lab/e;->j:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v6, Li0/a1;

    .line 329
    .line 330
    instance-of v7, v0, Landroid/app/Activity;

    .line 331
    .line 332
    if-eqz v7, :cond_8

    .line 333
    .line 334
    move-object v4, v0

    .line 335
    check-cast v4, Landroid/app/Activity;

    .line 336
    .line 337
    :cond_8
    if-nez v4, :cond_9

    .line 338
    .line 339
    const-string v1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u56fe\u7247\u9009\u62e9\u5668"

    .line 340
    .line 341
    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_9
    iget-object v3, v5, Lwb/s0;->a:Ljava/lang/String;

    .line 350
    .line 351
    new-instance v5, Lwb/q1;

    .line 352
    .line 353
    invoke-direct {v5, v0, v6, v1}, Lwb/q1;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 354
    .line 355
    .line 356
    sget-object v0, Ld9/f;->a:Ld9/f;

    .line 357
    .line 358
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    sget-object v0, Ld9/f;->a:Ld9/f;

    .line 362
    .line 363
    invoke-virtual {v0, v4, v5, v3, v2}, Ld9/f;->b(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Z)V

    .line 364
    .line 365
    .line 366
    :goto_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_7
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, Lwb/v0;

    .line 372
    .line 373
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v1, Lwb/s0;

    .line 376
    .line 377
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v2, Li0/a1;

    .line 380
    .line 381
    iget-boolean v0, v0, Lwb/v0;->c:Z

    .line 382
    .line 383
    if-eqz v0, :cond_b

    .line 384
    .line 385
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    check-cast v0, Ljava/util/Set;

    .line 390
    .line 391
    iget-object v1, v1, Lwb/s0;->a:Ljava/lang/String;

    .line 392
    .line 393
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-eqz v0, :cond_a

    .line 398
    .line 399
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    check-cast v0, Ljava/util/Set;

    .line 404
    .line 405
    invoke-static {v0, v1}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    goto :goto_5

    .line 410
    :cond_a
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    check-cast v0, Ljava/util/Set;

    .line 415
    .line 416
    invoke-static {v0, v1}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    goto :goto_5

    .line 421
    :cond_b
    iget-object v0, v1, Lwb/s0;->a:Ljava/lang/String;

    .line 422
    .line 423
    invoke-static {v0}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    :goto_5
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 431
    .line 432
    return-object v0

    .line 433
    :pswitch_8
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v0, Landroid/content/SharedPreferences;

    .line 436
    .line 437
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v1, Ljava/lang/String;

    .line 440
    .line 441
    iget-object v3, p0, Lab/e;->j:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v3, Li0/a1;

    .line 444
    .line 445
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    check-cast v4, Ljava/lang/Boolean;

    .line 450
    .line 451
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    xor-int/2addr v2, v4

    .line 456
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    check-cast v2, Ljava/lang/Boolean;

    .line 472
    .line 473
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 482
    .line 483
    .line 484
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 485
    .line 486
    return-object v0

    .line 487
    :pswitch_9
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v0, Landroid/app/Activity;

    .line 490
    .line 491
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v1, Landroid/content/Context;

    .line 494
    .line 495
    iget-object v4, p0, Lab/e;->j:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v4, Lfg/a;

    .line 498
    .line 499
    if-nez v0, :cond_c

    .line 500
    .line 501
    const-string v0, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u7ba1\u7406\u5668"

    .line 502
    .line 503
    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 508
    .line 509
    .line 510
    goto :goto_7

    .line 511
    :cond_c
    sget-object v1, Lwb/r0;->a:Lwb/r0;

    .line 512
    .line 513
    monitor-enter v1

    .line 514
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    sput-object v4, Lwb/r0;->c:Lfg/a;

    .line 518
    .line 519
    sput-object v0, Lwb/r0;->d:Landroid/app/Activity;

    .line 520
    .line 521
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-virtual {v1, v3}, Lwb/r0;->a(Ljava/lang/Class;)V

    .line 526
    .line 527
    .line 528
    const-class v3, Landroid/app/Activity;

    .line 529
    .line 530
    invoke-virtual {v1, v3}, Lwb/r0;->a(Ljava/lang/Class;)V

    .line 531
    .line 532
    .line 533
    new-instance v3, Landroid/content/Intent;

    .line 534
    .line 535
    const-string v4, "android.intent.action.OPEN_DOCUMENT"

    .line 536
    .line 537
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    const-string v4, "android.intent.category.OPENABLE"

    .line 541
    .line 542
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 543
    .line 544
    .line 545
    const-string v4, "*/*"

    .line 546
    .line 547
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 551
    .line 552
    .line 553
    invoke-static {v0, v3}, Lwb/ho;->B4(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 554
    .line 555
    .line 556
    const v4, 0x48435259    # 200009.39f

    .line 557
    .line 558
    .line 559
    :try_start_1
    invoke-virtual {v0, v3, v4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 560
    .line 561
    .line 562
    goto :goto_6

    .line 563
    :catchall_0
    :try_start_2
    new-instance v3, Landroid/content/Intent;

    .line 564
    .line 565
    const-string v5, "android.intent.action.GET_CONTENT"

    .line 566
    .line 567
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    const-string v5, "android.intent.category.OPENABLE"

    .line 571
    .line 572
    invoke-virtual {v3, v5}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 573
    .line 574
    .line 575
    const-string v5, "*/*"

    .line 576
    .line 577
    invoke-virtual {v3, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 581
    .line 582
    .line 583
    const-string v2, "\u9009\u62e9 Hchat \u914d\u7f6e\u6587\u4ef6"

    .line 584
    .line 585
    invoke-static {v3, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    invoke-virtual {v0, v2, v4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 590
    .line 591
    .line 592
    :goto_6
    monitor-exit v1

    .line 593
    :goto_7
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 594
    .line 595
    return-object v0

    .line 596
    :catchall_1
    move-exception v0

    .line 597
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 598
    throw v0

    .line 599
    :pswitch_a
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v0, Ln9/a;

    .line 602
    .line 603
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v1, Landroid/content/Context;

    .line 606
    .line 607
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v2, Lfg/l;

    .line 610
    .line 611
    iget-object v4, v0, Ln9/a;->b:Ljava/lang/String;

    .line 612
    .line 613
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    if-eqz v4, :cond_d

    .line 618
    .line 619
    const-string v0, "\u8bf7\u8f93\u5165\u6807\u7b7e\u540d\u79f0"

    .line 620
    .line 621
    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 626
    .line 627
    .line 628
    goto :goto_8

    .line 629
    :cond_d
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    :goto_8
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_b
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v0, Lfg/a;

    .line 638
    .line 639
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v1, Li0/a1;

    .line 642
    .line 643
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v2, Li0/a1;

    .line 646
    .line 647
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    check-cast v3, Lwb/s0;

    .line 652
    .line 653
    if-nez v3, :cond_e

    .line 654
    .line 655
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    goto :goto_9

    .line 659
    :cond_e
    invoke-interface {v1, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    const-string v0, ""

    .line 663
    .line 664
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    :goto_9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 668
    .line 669
    return-object v0

    .line 670
    :pswitch_c
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v0, Ljava/util/ArrayList;

    .line 673
    .line 674
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v1, Lfg/l;

    .line 677
    .line 678
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v2, Li0/a1;

    .line 681
    .line 682
    new-instance v3, Ljava/util/ArrayList;

    .line 683
    .line 684
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    :cond_f
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-eqz v4, :cond_10

    .line 696
    .line 697
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v4

    .line 701
    move-object v5, v4

    .line 702
    check-cast v5, Lwb/m5;

    .line 703
    .line 704
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v6

    .line 708
    check-cast v6, Ljava/util/Set;

    .line 709
    .line 710
    iget-object v5, v5, Lwb/m5;->a:Lwb/s0;

    .line 711
    .line 712
    iget-object v5, v5, Lwb/s0;->a:Ljava/lang/String;

    .line 713
    .line 714
    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    if-eqz v5, :cond_f

    .line 719
    .line 720
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    goto :goto_a

    .line 724
    :cond_10
    invoke-interface {v1, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 728
    .line 729
    return-object v0

    .line 730
    :pswitch_d
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v0, Lc9/a;

    .line 733
    .line 734
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v1, Landroid/content/Context;

    .line 737
    .line 738
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v2, Lfg/l;

    .line 741
    .line 742
    iget-object v4, v0, Lc9/a;->b:Ljava/lang/String;

    .line 743
    .line 744
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 745
    .line 746
    .line 747
    move-result v4

    .line 748
    if-eqz v4, :cond_11

    .line 749
    .line 750
    const-string v0, "\u8bf7\u8f93\u5165\u5206\u7ec4\u540d\u79f0"

    .line 751
    .line 752
    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 757
    .line 758
    .line 759
    goto :goto_b

    .line 760
    :cond_11
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    :goto_b
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 764
    .line 765
    return-object v0

    .line 766
    :pswitch_e
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v0, Lv8/h;

    .line 769
    .line 770
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v1, Ljava/lang/String;

    .line 773
    .line 774
    iget-object v4, p0, Lab/e;->j:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v4, Lv8/q;

    .line 777
    .line 778
    iput-boolean v3, v0, Lv8/h;->q:Z

    .line 779
    .line 780
    iput-boolean v2, v0, Lv8/h;->r:Z

    .line 781
    .line 782
    iput-object v1, v0, Lv8/h;->s:Ljava/lang/String;

    .line 783
    .line 784
    invoke-virtual {v4, v0}, Lv8/q;->k(Lv8/h;)V

    .line 785
    .line 786
    .line 787
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 788
    .line 789
    return-object v0

    .line 790
    :pswitch_f
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v0, Lt/h;

    .line 793
    .line 794
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v1, Lx1/i1;

    .line 797
    .line 798
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v2, Lc1/b;

    .line 801
    .line 802
    invoke-static {v0, v1, v2}, Lt/h;->k1(Lt/h;Lx1/i1;Lc1/b;)Le1/c;

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    if-eqz v6, :cond_13

    .line 807
    .line 808
    iget-object v5, v0, Lt/h;->u:Lm/k;

    .line 809
    .line 810
    iget-wide v0, v5, Lm/k;->A:J

    .line 811
    .line 812
    sget-wide v2, Lm/l;->a:J

    .line 813
    .line 814
    invoke-static {v0, v1, v2, v3}, Lu2/l;->a(JJ)Z

    .line 815
    .line 816
    .line 817
    move-result v0

    .line 818
    if-eqz v0, :cond_12

    .line 819
    .line 820
    const-string v0, "Expected BringIntoViewRequester to not be used before parents are placed."

    .line 821
    .line 822
    invoke-static {v0}, Lo/b;->c(Ljava/lang/String;)V

    .line 823
    .line 824
    .line 825
    :cond_12
    invoke-virtual {v5}, Lm/k;->l1()J

    .line 826
    .line 827
    .line 828
    move-result-wide v7

    .line 829
    const-wide/16 v9, 0x0

    .line 830
    .line 831
    invoke-virtual/range {v5 .. v10}, Lm/k;->o1(Le1/c;JJ)J

    .line 832
    .line 833
    .line 834
    move-result-wide v0

    .line 835
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    xor-long/2addr v0, v2

    .line 841
    invoke-virtual {v6, v0, v1}, Le1/c;->i(J)Le1/c;

    .line 842
    .line 843
    .line 844
    move-result-object v4

    .line 845
    :cond_13
    return-object v4

    .line 846
    :pswitch_10
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v0, Ls0/b;

    .line 849
    .line 850
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v1, Lbe/k;

    .line 853
    .line 854
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v2, Lgg/s;

    .line 857
    .line 858
    invoke-virtual {v0}, Ls0/b;->a()V

    .line 859
    .line 860
    .line 861
    iget-object v0, v1, Lbe/k;->c:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v0, Ls0/a;

    .line 864
    .line 865
    iget v1, v2, Lgg/s;->g:I

    .line 866
    .line 867
    :cond_14
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 868
    .line 869
    .line 870
    move-result v2

    .line 871
    ushr-int/lit8 v3, v2, 0x1b

    .line 872
    .line 873
    and-int/lit8 v3, v3, 0xf

    .line 874
    .line 875
    if-ne v3, v1, :cond_15

    .line 876
    .line 877
    add-int/lit8 v3, v2, -0x1

    .line 878
    .line 879
    goto :goto_c

    .line 880
    :cond_15
    move v3, v2

    .line 881
    :goto_c
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 882
    .line 883
    .line 884
    move-result v2

    .line 885
    if-eqz v2, :cond_14

    .line 886
    .line 887
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 888
    .line 889
    return-object v0

    .line 890
    :pswitch_11
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v0, Li0/x;

    .line 893
    .line 894
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v1, Lr/z;

    .line 897
    .line 898
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v2, Lr/d;

    .line 901
    .line 902
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    check-cast v0, Lr/h;

    .line 907
    .line 908
    new-instance v3, Lac/k;

    .line 909
    .line 910
    iget-object v4, v1, Lr/z;->e:Lb/f;

    .line 911
    .line 912
    iget-object v4, v4, Lb/f;->e:Ljava/lang/Object;

    .line 913
    .line 914
    check-cast v4, Ls/g0;

    .line 915
    .line 916
    invoke-virtual {v4}, Ls/g0;->getValue()Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v4

    .line 920
    check-cast v4, Llg/d;

    .line 921
    .line 922
    invoke-direct {v3, v4, v0}, Lac/k;-><init>(Llg/d;Lr/h;)V

    .line 923
    .line 924
    .line 925
    new-instance v4, Lr/k;

    .line 926
    .line 927
    invoke-direct {v4, v1, v0, v2, v3}, Lr/k;-><init>(Lr/z;Lr/h;Lr/d;Lac/k;)V

    .line 928
    .line 929
    .line 930
    return-object v4

    .line 931
    :pswitch_12
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v0, Ll0/b;

    .line 934
    .line 935
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v1, Ll0/k;

    .line 938
    .line 939
    iget-object v3, p0, Lab/e;->j:Ljava/lang/Object;

    .line 940
    .line 941
    check-cast v3, Lm0/k0;

    .line 942
    .line 943
    if-eqz v0, :cond_16

    .line 944
    .line 945
    invoke-virtual {v1, v0}, Ll0/k;->c(Ll0/b;)I

    .line 946
    .line 947
    .line 948
    move-result v0

    .line 949
    iget v5, v1, Ll0/k;->t:I

    .line 950
    .line 951
    sub-int/2addr v0, v5

    .line 952
    invoke-virtual {v1, v0}, Ll0/k;->a(I)V

    .line 953
    .line 954
    .line 955
    :cond_16
    iget v0, v1, Ll0/k;->t:I

    .line 956
    .line 957
    invoke-static {v1, v4, v0, v4}, Lg4/a;->h(Ll0/k;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    invoke-static {v0}, Ltf/m;->C1(Ljava/util/List;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    check-cast v1, Lx0/b;

    .line 966
    .line 967
    if-eqz v1, :cond_17

    .line 968
    .line 969
    iget-object v1, v1, Lx0/b;->b:Ljava/lang/Integer;

    .line 970
    .line 971
    goto :goto_d

    .line 972
    :cond_17
    move-object v1, v4

    .line 973
    :goto_d
    invoke-interface {v3, v1}, Lm0/k0;->f(Ljava/lang/Integer;)Ljava/util/List;

    .line 974
    .line 975
    .line 976
    move-result-object v5

    .line 977
    if-eqz v1, :cond_19

    .line 978
    .line 979
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 980
    .line 981
    .line 982
    move-result v6

    .line 983
    if-eqz v6, :cond_18

    .line 984
    .line 985
    goto :goto_e

    .line 986
    :cond_18
    invoke-static {v5}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v6

    .line 990
    check-cast v6, Lx0/b;

    .line 991
    .line 992
    invoke-static {v2, v5}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 993
    .line 994
    .line 995
    move-result-object v2

    .line 996
    iget v5, v6, Lx0/b;->a:I

    .line 997
    .line 998
    new-instance v6, Lx0/b;

    .line 999
    .line 1000
    invoke-direct {v6, v5, v4, v1}, Lx0/b;-><init>(ILoh/h;Ljava/lang/Integer;)V

    .line 1001
    .line 1002
    .line 1003
    invoke-static {v6}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    invoke-static {v1, v2}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v5

    .line 1011
    :cond_19
    :goto_e
    new-instance v1, Lx0/a;

    .line 1012
    .line 1013
    invoke-static {v0, v5}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    invoke-interface {v3}, Lm0/k0;->j()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v2

    .line 1021
    invoke-direct {v1, v0, v2}, Lx0/a;-><init>(Ljava/util/List;Z)V

    .line 1022
    .line 1023
    .line 1024
    return-object v1

    .line 1025
    :pswitch_13
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1026
    .line 1027
    move-object v5, v0

    .line 1028
    check-cast v5, Lm/k;

    .line 1029
    .line 1030
    iget-object v0, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v0, Lm/g3;

    .line 1033
    .line 1034
    iget-object v1, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1035
    .line 1036
    check-cast v1, Lm/f;

    .line 1037
    .line 1038
    sget-object v12, Lsf/n;->a:Lsf/n;

    .line 1039
    .line 1040
    iget-object v13, v5, Lm/k;->y:Lm/c;

    .line 1041
    .line 1042
    :goto_f
    iget-object v6, v13, Lm/c;->a:Lj0/b;

    .line 1043
    .line 1044
    iget v7, v6, Lj0/b;->i:I

    .line 1045
    .line 1046
    if-eqz v7, :cond_1c

    .line 1047
    .line 1048
    if-eqz v7, :cond_1b

    .line 1049
    .line 1050
    add-int/lit8 v7, v7, -0x1

    .line 1051
    .line 1052
    iget-object v6, v6, Lj0/b;->g:[Ljava/lang/Object;

    .line 1053
    .line 1054
    aget-object v6, v6, v7

    .line 1055
    .line 1056
    check-cast v6, Lm/i;

    .line 1057
    .line 1058
    iget-object v6, v6, Lm/i;->a:Lt/f;

    .line 1059
    .line 1060
    invoke-virtual {v6}, Lt/f;->invoke()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v6

    .line 1064
    check-cast v6, Le1/c;

    .line 1065
    .line 1066
    if-nez v6, :cond_1a

    .line 1067
    .line 1068
    move v6, v2

    .line 1069
    goto :goto_10

    .line 1070
    :cond_1a
    const-wide/16 v9, 0x0

    .line 1071
    .line 1072
    const/4 v11, 0x3

    .line 1073
    const-wide/16 v7, 0x0

    .line 1074
    .line 1075
    invoke-static/range {v5 .. v11}, Lm/k;->m1(Lm/k;Le1/c;JJI)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v6

    .line 1079
    :goto_10
    if-eqz v6, :cond_1c

    .line 1080
    .line 1081
    iget-object v6, v13, Lm/c;->a:Lj0/b;

    .line 1082
    .line 1083
    iget v7, v6, Lj0/b;->i:I

    .line 1084
    .line 1085
    sub-int/2addr v7, v2

    .line 1086
    invoke-virtual {v6, v7}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v6

    .line 1090
    check-cast v6, Lm/i;

    .line 1091
    .line 1092
    iget-object v6, v6, Lm/i;->b:Lqg/g;

    .line 1093
    .line 1094
    invoke-virtual {v6, v12}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 1095
    .line 1096
    .line 1097
    goto :goto_f

    .line 1098
    :cond_1b
    const-string v0, "MutableVector is empty."

    .line 1099
    .line 1100
    invoke-static {v0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 1101
    .line 1102
    .line 1103
    goto :goto_12

    .line 1104
    :cond_1c
    iget-boolean v4, v5, Lm/k;->z:Z

    .line 1105
    .line 1106
    if-eqz v4, :cond_1e

    .line 1107
    .line 1108
    iget-object v4, v5, Lm/k;->x:Lm/c2;

    .line 1109
    .line 1110
    invoke-virtual {v4}, Lm/c2;->invoke()Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v4

    .line 1114
    move-object v6, v4

    .line 1115
    check-cast v6, Le1/c;

    .line 1116
    .line 1117
    if-eqz v6, :cond_1d

    .line 1118
    .line 1119
    const-wide/16 v9, 0x0

    .line 1120
    .line 1121
    const/4 v11, 0x3

    .line 1122
    const-wide/16 v7, 0x0

    .line 1123
    .line 1124
    invoke-static/range {v5 .. v11}, Lm/k;->m1(Lm/k;Le1/c;JJI)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v4

    .line 1128
    if-ne v4, v2, :cond_1d

    .line 1129
    .line 1130
    goto :goto_11

    .line 1131
    :cond_1d
    move v2, v3

    .line 1132
    :goto_11
    if-eqz v2, :cond_1e

    .line 1133
    .line 1134
    iput-boolean v3, v5, Lm/k;->z:Z

    .line 1135
    .line 1136
    :cond_1e
    const-wide/16 v2, 0x0

    .line 1137
    .line 1138
    invoke-static {v5, v1, v2, v3}, Lm/k;->k1(Lm/k;Lm/f;J)F

    .line 1139
    .line 1140
    .line 1141
    move-result v1

    .line 1142
    iput v1, v0, Lm/g3;->e:F

    .line 1143
    .line 1144
    move-object v4, v12

    .line 1145
    :goto_12
    return-object v4

    .line 1146
    :pswitch_14
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1147
    .line 1148
    move-object v1, v0

    .line 1149
    check-cast v1, Li0/h0;

    .line 1150
    .line 1151
    iget-object v0, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1152
    .line 1153
    check-cast v0, Lm0/a;

    .line 1154
    .line 1155
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1156
    .line 1157
    check-cast v2, Ll0/g;

    .line 1158
    .line 1159
    iget-object v5, v1, Li0/h0;->M:Lm0/b;

    .line 1160
    .line 1161
    iget-object v6, v5, Lm0/b;->b:Lm0/a;

    .line 1162
    .line 1163
    :try_start_4
    iput-object v0, v5, Lm0/b;->b:Lm0/a;

    .line 1164
    .line 1165
    iget-object v7, v1, Li0/h0;->G:Ll0/g;

    .line 1166
    .line 1167
    iget-object v8, v1, Li0/h0;->o:[I

    .line 1168
    .line 1169
    iget-object v9, v1, Li0/h0;->v:Lf/w;

    .line 1170
    .line 1171
    iput-object v4, v1, Li0/h0;->o:[I

    .line 1172
    .line 1173
    iput-object v4, v1, Li0/h0;->v:Lf/w;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1174
    .line 1175
    :try_start_5
    iput-object v2, v1, Li0/h0;->G:Ll0/g;

    .line 1176
    .line 1177
    iget-boolean v2, v5, Lm0/b;->e:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1178
    .line 1179
    :try_start_6
    iput-boolean v3, v5, Lm0/b;->e:Z

    .line 1180
    .line 1181
    throw v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1182
    :catchall_2
    move-exception v0

    .line 1183
    :try_start_7
    iput-boolean v2, v5, Lm0/b;->e:Z

    .line 1184
    .line 1185
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1186
    :catchall_3
    move-exception v0

    .line 1187
    :try_start_8
    iput-object v7, v1, Li0/h0;->G:Ll0/g;

    .line 1188
    .line 1189
    iput-object v8, v1, Li0/h0;->o:[I

    .line 1190
    .line 1191
    iput-object v9, v1, Li0/h0;->v:Lf/w;

    .line 1192
    .line 1193
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1194
    :catchall_4
    move-exception v0

    .line 1195
    iput-object v6, v5, Lm0/b;->b:Lm0/a;

    .line 1196
    .line 1197
    throw v0

    .line 1198
    :pswitch_15
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1199
    .line 1200
    check-cast v0, Ljava/util/function/Consumer;

    .line 1201
    .line 1202
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v1, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 1205
    .line 1206
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1207
    .line 1208
    check-cast v2, Ljava/lang/String;

    .line 1209
    .line 1210
    invoke-static {v0, v1, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->q(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;)Lsf/n;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    return-object v0

    .line 1215
    :pswitch_16
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v0, Ljava/util/function/Consumer;

    .line 1218
    .line 1219
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1220
    .line 1221
    check-cast v1, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 1222
    .line 1223
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1224
    .line 1225
    check-cast v2, Ljava/util/List;

    .line 1226
    .line 1227
    invoke-static {v0, v1, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->L(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/List;)Lsf/n;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0

    .line 1231
    return-object v0

    .line 1232
    :pswitch_17
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1233
    .line 1234
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1235
    .line 1236
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast v1, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 1239
    .line 1240
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v2, Ljava/lang/String;

    .line 1243
    .line 1244
    invoke-static {v0, v1, v2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->q(Ljava/util/concurrent/atomic/AtomicReference;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/lang/String;)Lsf/n;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    return-object v0

    .line 1249
    :pswitch_18
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1250
    .line 1251
    check-cast v0, Landroid/app/Activity;

    .line 1252
    .line 1253
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1254
    .line 1255
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1256
    .line 1257
    check-cast v2, Landroid/content/Context;

    .line 1258
    .line 1259
    invoke-static {v0}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 1260
    .line 1261
    .line 1262
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 1263
    .line 1264
    invoke-static {v1, v2}, Lc9/d2;->w(Ljava/lang/Object;Landroid/content/Context;)V

    .line 1265
    .line 1266
    .line 1267
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1268
    .line 1269
    return-object v0

    .line 1270
    :pswitch_19
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1271
    .line 1272
    move-object v6, v0

    .line 1273
    check-cast v6, Landroid/app/Activity;

    .line 1274
    .line 1275
    iget-object v0, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1276
    .line 1277
    move-object v3, v0

    .line 1278
    check-cast v3, Lfg/a;

    .line 1279
    .line 1280
    iget-object v0, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1281
    .line 1282
    move-object v5, v0

    .line 1283
    check-cast v5, Lfg/a;

    .line 1284
    .line 1285
    const-string v7, "[Hchat:ConversationGroup] \u5bfc\u51fa\u5f53\u524d\u8d26\u53f7\u7684\u804a\u5929\u5206\u7ec4\u5931\u8d25: "

    .line 1286
    .line 1287
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1288
    .line 1289
    .line 1290
    sget-object v8, Lc9/o2;->a:Ljava/lang/Object;

    .line 1291
    .line 1292
    monitor-enter v8

    .line 1293
    :try_start_9
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1298
    .line 1299
    .line 1300
    move-result v9
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 1301
    if-eqz v9, :cond_1f

    .line 1302
    .line 1303
    goto :goto_15

    .line 1304
    :cond_1f
    :try_start_a
    new-instance v9, Lorg/json/JSONObject;

    .line 1305
    .line 1306
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 1307
    .line 1308
    .line 1309
    const-string v10, "format"

    .line 1310
    .line 1311
    const-string v11, "HchatConversationGroups"

    .line 1312
    .line 1313
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1314
    .line 1315
    .line 1316
    const-string v10, "schema"

    .line 1317
    .line 1318
    const-string v11, "HchatConversationGroups"

    .line 1319
    .line 1320
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1321
    .line 1322
    .line 1323
    const-string v10, "version"

    .line 1324
    .line 1325
    invoke-virtual {v9, v10, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1326
    .line 1327
    .line 1328
    const-string v2, "exportedAt"

    .line 1329
    .line 1330
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1331
    .line 1332
    .line 1333
    move-result-wide v10

    .line 1334
    invoke-virtual {v9, v2, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1335
    .line 1336
    .line 1337
    const-string v2, "groups"

    .line 1338
    .line 1339
    invoke-static {v6, v0}, Lc9/o2;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v0

    .line 1343
    invoke-static {v0}, Lc9/o2;->g(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0

    .line 1347
    invoke-virtual {v9, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 1354
    goto :goto_13

    .line 1355
    :catchall_5
    move-exception v0

    .line 1356
    :try_start_b
    new-instance v2, Lsf/f;

    .line 1357
    .line 1358
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1359
    .line 1360
    .line 1361
    move-object v0, v2

    .line 1362
    :goto_13
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v2

    .line 1366
    if-nez v2, :cond_20

    .line 1367
    .line 1368
    move-object v4, v0

    .line 1369
    goto :goto_14

    .line 1370
    :cond_20
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1375
    .line 1376
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1377
    .line 1378
    .line 1379
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    invoke-static {v0, v2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1387
    .line 1388
    .line 1389
    :goto_14
    check-cast v4, Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 1390
    .line 1391
    :goto_15
    monitor-exit v8

    .line 1392
    if-nez v4, :cond_21

    .line 1393
    .line 1394
    const-string v0, "\u5bfc\u51fa\u804a\u5929\u5206\u7ec4\u5931\u8d25"

    .line 1395
    .line 1396
    invoke-static {v6, v0}, Lc9/j1;->p(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    goto :goto_16

    .line 1400
    :cond_21
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1401
    .line 1402
    .line 1403
    move-object v2, v5

    .line 1404
    sget-object v5, Lc9/e;->a:Lc9/e;

    .line 1405
    .line 1406
    new-instance v9, Lc9/i;

    .line 1407
    .line 1408
    const/4 v0, 0x3

    .line 1409
    invoke-direct {v9, v2, v0, v6}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1410
    .line 1411
    .line 1412
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 1413
    .line 1414
    const-string v2, "yyyyMMdd_HHmmss"

    .line 1415
    .line 1416
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1417
    .line 1418
    invoke-direct {v0, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1419
    .line 1420
    .line 1421
    new-instance v2, Ljava/util/Date;

    .line 1422
    .line 1423
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v0

    .line 1430
    const-string v2, "Hchat_chat_groups_"

    .line 1431
    .line 1432
    const-string v3, ".json"

    .line 1433
    .line 1434
    invoke-static {v2, v0, v3}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    new-instance v7, Lc9/b;

    .line 1439
    .line 1440
    invoke-direct {v7, v4}, Lc9/b;-><init>(Ljava/lang/String;)V

    .line 1441
    .line 1442
    .line 1443
    new-instance v8, Landroid/content/Intent;

    .line 1444
    .line 1445
    const-string v2, "android.intent.action.CREATE_DOCUMENT"

    .line 1446
    .line 1447
    invoke-direct {v8, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1448
    .line 1449
    .line 1450
    const-string v2, "android.intent.category.OPENABLE"

    .line 1451
    .line 1452
    invoke-virtual {v8, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1453
    .line 1454
    .line 1455
    const-string v2, "application/json"

    .line 1456
    .line 1457
    invoke-virtual {v8, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1458
    .line 1459
    .line 1460
    const-string v2, "android.intent.extra.TITLE"

    .line 1461
    .line 1462
    invoke-virtual {v8, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1463
    .line 1464
    .line 1465
    invoke-virtual {v8, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1466
    .line 1467
    .line 1468
    invoke-static {v6, v8}, Lc9/e;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 1469
    .line 1470
    .line 1471
    const/4 v10, 0x0

    .line 1472
    invoke-virtual/range {v5 .. v10}, Lc9/e;->a(Landroid/app/Activity;Lc9/o2;Landroid/content/Intent;Lfg/l;Lbi/c;)V

    .line 1473
    .line 1474
    .line 1475
    :goto_16
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1476
    .line 1477
    return-object v0

    .line 1478
    :catchall_6
    move-exception v0

    .line 1479
    monitor-exit v8

    .line 1480
    throw v0

    .line 1481
    :pswitch_1a
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1482
    .line 1483
    check-cast v0, Li0/a1;

    .line 1484
    .line 1485
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1486
    .line 1487
    check-cast v1, Landroid/app/Activity;

    .line 1488
    .line 1489
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1490
    .line 1491
    check-cast v2, Li0/a1;

    .line 1492
    .line 1493
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    check-cast v0, Ljava/util/Set;

    .line 1498
    .line 1499
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 1500
    .line 1501
    .line 1502
    move-result v0

    .line 1503
    if-eqz v0, :cond_22

    .line 1504
    .line 1505
    const-string v0, "\u8bf7\u81f3\u5c11\u9009\u62e9\u4e00\u4e2a\u5206\u7ec4"

    .line 1506
    .line 1507
    invoke-static {v1, v0}, Lc9/j1;->p(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1508
    .line 1509
    .line 1510
    goto :goto_17

    .line 1511
    :cond_22
    sget-object v0, Lc9/e1;->l:Lc9/e1;

    .line 1512
    .line 1513
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1514
    .line 1515
    .line 1516
    :goto_17
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1517
    .line 1518
    return-object v0

    .line 1519
    :pswitch_1b
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1520
    .line 1521
    check-cast v0, Landroid/app/Activity;

    .line 1522
    .line 1523
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1524
    .line 1525
    check-cast v1, Ljava/lang/String;

    .line 1526
    .line 1527
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1528
    .line 1529
    check-cast v2, Lfg/a;

    .line 1530
    .line 1531
    sget-object v3, Lc9/j1;->a:Lc9/j1;

    .line 1532
    .line 1533
    invoke-static {v0, v1, v2}, Lc9/j1;->v(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V

    .line 1534
    .line 1535
    .line 1536
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1537
    .line 1538
    return-object v0

    .line 1539
    :pswitch_1c
    iget-object v0, p0, Lab/e;->h:Ljava/lang/Object;

    .line 1540
    .line 1541
    check-cast v0, Lab/f;

    .line 1542
    .line 1543
    iget-object v1, p0, Lab/e;->i:Ljava/lang/Object;

    .line 1544
    .line 1545
    check-cast v1, Landroid/widget/TextView;

    .line 1546
    .line 1547
    iget-object v2, p0, Lab/e;->j:Ljava/lang/Object;

    .line 1548
    .line 1549
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 1550
    .line 1551
    iget-object v5, v0, Lab/f;->a:Lr8/g;

    .line 1552
    .line 1553
    iget-object v5, v5, Lr8/g;->a:Landroid/content/Context;

    .line 1554
    .line 1555
    const-string v6, "Hchat_quote_delete_clear_config"

    .line 1556
    .line 1557
    invoke-static {v5, v6}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v5

    .line 1561
    const-string v6, "quote_delete_clear_enable"

    .line 1562
    .line 1563
    invoke-interface {v5, v6, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1564
    .line 1565
    .line 1566
    move-result v5

    .line 1567
    if-nez v5, :cond_23

    .line 1568
    .line 1569
    goto/16 :goto_1d

    .line 1570
    .line 1571
    :cond_23
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v5

    .line 1575
    if-eqz v5, :cond_24

    .line 1576
    .line 1577
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 1578
    .line 1579
    .line 1580
    move-result v5

    .line 1581
    if-nez v5, :cond_2a

    .line 1582
    .line 1583
    :cond_24
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v2

    .line 1587
    if-eqz v2, :cond_26

    .line 1588
    .line 1589
    instance-of v5, v2, Landroid/view/View;

    .line 1590
    .line 1591
    if-eqz v5, :cond_25

    .line 1592
    .line 1593
    move-object v5, v2

    .line 1594
    check-cast v5, Landroid/view/View;

    .line 1595
    .line 1596
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1597
    .line 1598
    .line 1599
    move-result v5

    .line 1600
    if-eqz v5, :cond_25

    .line 1601
    .line 1602
    invoke-static {v2}, Lab/f;->g(Ljava/lang/Object;)Z

    .line 1603
    .line 1604
    .line 1605
    move-result v5

    .line 1606
    if-eqz v5, :cond_25

    .line 1607
    .line 1608
    goto :goto_18

    .line 1609
    :cond_25
    move-object v2, v4

    .line 1610
    :goto_18
    if-eqz v2, :cond_26

    .line 1611
    .line 1612
    goto :goto_1c

    .line 1613
    :cond_26
    invoke-static {v1}, Lab/f;->c(Landroid/view/View;)Landroid/view/View;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v2

    .line 1617
    if-eqz v2, :cond_27

    .line 1618
    .line 1619
    :goto_19
    move-object v4, v2

    .line 1620
    goto :goto_1b

    .line 1621
    :cond_27
    iget-object v2, v0, Lab/f;->e:Ljava/lang/ref/WeakReference;

    .line 1622
    .line 1623
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v2

    .line 1627
    if-eqz v2, :cond_28

    .line 1628
    .line 1629
    instance-of v5, v2, Landroid/view/View;

    .line 1630
    .line 1631
    if-eqz v5, :cond_28

    .line 1632
    .line 1633
    move-object v5, v2

    .line 1634
    check-cast v5, Landroid/view/View;

    .line 1635
    .line 1636
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1637
    .line 1638
    .line 1639
    move-result v5

    .line 1640
    if-eqz v5, :cond_28

    .line 1641
    .line 1642
    invoke-static {v2}, Lab/f;->g(Ljava/lang/Object;)Z

    .line 1643
    .line 1644
    .line 1645
    move-result v5

    .line 1646
    if-eqz v5, :cond_28

    .line 1647
    .line 1648
    goto :goto_1a

    .line 1649
    :cond_28
    move-object v2, v4

    .line 1650
    :goto_1a
    if-eqz v2, :cond_29

    .line 1651
    .line 1652
    instance-of v5, v2, Landroid/view/View;

    .line 1653
    .line 1654
    if-eqz v5, :cond_29

    .line 1655
    .line 1656
    move-object v5, v2

    .line 1657
    check-cast v5, Landroid/view/View;

    .line 1658
    .line 1659
    invoke-virtual {v5}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v5

    .line 1663
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v1

    .line 1667
    if-ne v5, v1, :cond_29

    .line 1668
    .line 1669
    goto :goto_19

    .line 1670
    :cond_29
    :goto_1b
    if-eqz v4, :cond_2a

    .line 1671
    .line 1672
    move-object v2, v4

    .line 1673
    :goto_1c
    invoke-virtual {v0, v2}, Lab/f;->a(Ljava/lang/Object;)Z

    .line 1674
    .line 1675
    .line 1676
    move-result v3

    .line 1677
    :cond_2a
    :goto_1d
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    return-object v0

    .line 1682
    nop

    .line 1683
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
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
