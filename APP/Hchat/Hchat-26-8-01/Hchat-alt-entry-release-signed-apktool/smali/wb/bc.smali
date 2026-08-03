.class public final synthetic Lwb/bc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/bc;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/bc;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/bc;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/bc;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/bc;->i:Li0/a1;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lwb/bc;->j:Li0/a1;

    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 24
    .line 25
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v2, "text_voice_engine"

    .line 30
    .line 31
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v0, "text_voice_tts_voice"

    .line 36
    .line 37
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_0
    check-cast p1, Lr/h;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget-object v0, Lwb/p0;->G2:Ls0/d;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    const/4 v2, 0x3

    .line 56
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lwb/t7;

    .line 60
    .line 61
    const/16 v3, 0xb

    .line 62
    .line 63
    iget-object v4, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 64
    .line 65
    iget-object v5, p0, Lwb/bc;->i:Li0/a1;

    .line 66
    .line 67
    iget-object v6, p0, Lwb/bc;->j:Li0/a1;

    .line 68
    .line 69
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/t7;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 70
    .line 71
    .line 72
    new-instance v3, Ls0/d;

    .line 73
    .line 74
    const v4, -0x6d73b341

    .line 75
    .line 76
    .line 77
    const/4 v5, 0x1

    .line 78
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 82
    .line 83
    .line 84
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1
    check-cast p1, Lr/h;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v0, Lwb/p0;->r2:Ls0/d;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    const/4 v2, 0x3

    .line 96
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 97
    .line 98
    .line 99
    new-instance v0, Lwb/t7;

    .line 100
    .line 101
    const/16 v3, 0xa

    .line 102
    .line 103
    iget-object v4, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 104
    .line 105
    iget-object v5, p0, Lwb/bc;->i:Li0/a1;

    .line 106
    .line 107
    iget-object v6, p0, Lwb/bc;->j:Li0/a1;

    .line 108
    .line 109
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/t7;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 110
    .line 111
    .line 112
    new-instance v3, Ls0/d;

    .line 113
    .line 114
    const v4, -0x2cc52b86

    .line 115
    .line 116
    .line 117
    const/4 v5, 0x1

    .line 118
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 122
    .line 123
    .line 124
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1

    .line 127
    :pswitch_2
    check-cast p1, Lr/h;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object v0, Lwb/p0;->J2:Ls0/d;

    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    const/4 v2, 0x3

    .line 136
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 137
    .line 138
    .line 139
    new-instance v0, Lwb/t7;

    .line 140
    .line 141
    const/4 v3, 0x5

    .line 142
    iget-object v4, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 143
    .line 144
    iget-object v5, p0, Lwb/bc;->i:Li0/a1;

    .line 145
    .line 146
    iget-object v6, p0, Lwb/bc;->j:Li0/a1;

    .line 147
    .line 148
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/t7;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 149
    .line 150
    .line 151
    new-instance v3, Ls0/d;

    .line 152
    .line 153
    const v4, -0x361cc1fc    # -1861568.5f

    .line 154
    .line 155
    .line 156
    const/4 v5, 0x1

    .line 157
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 158
    .line 159
    .line 160
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 161
    .line 162
    .line 163
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 164
    .line 165
    return-object p1

    .line 166
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    new-instance v0, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 178
    .line 179
    .line 180
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_0

    .line 189
    .line 190
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    check-cast v1, Lwb/s0;

    .line 195
    .line 196
    iget-object v1, v1, Lwb/s0;->a:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_2

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    move-object v2, v1

    .line 222
    check-cast v2, Ljava/lang/String;

    .line 223
    .line 224
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-nez v2, :cond_1

    .line 229
    .line 230
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_2
    invoke-static {p1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iget-object v0, p0, Lwb/bc;->i:Li0/a1;

    .line 239
    .line 240
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iget-object p1, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 244
    .line 245
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Ljava/util/Set;

    .line 254
    .line 255
    check-cast v0, Ljava/lang/Iterable;

    .line 256
    .line 257
    invoke-static {v0}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    const-string v1, "targets"

    .line 262
    .line 263
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 268
    .line 269
    .line 270
    sget-object p1, Lwb/po;->a:Lwb/po;

    .line 271
    .line 272
    iget-object v0, p0, Lwb/bc;->j:Li0/a1;

    .line 273
    .line 274
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 278
    .line 279
    return-object p1

    .line 280
    :pswitch_4
    check-cast p1, Lr/h;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    sget-object v0, Lwb/p0;->a0:Ls0/d;

    .line 286
    .line 287
    const/4 v1, 0x0

    .line 288
    const/4 v2, 0x3

    .line 289
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 290
    .line 291
    .line 292
    new-instance v0, Lwb/t7;

    .line 293
    .line 294
    const/16 v3, 0x8

    .line 295
    .line 296
    iget-object v4, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 297
    .line 298
    iget-object v5, p0, Lwb/bc;->i:Li0/a1;

    .line 299
    .line 300
    iget-object v6, p0, Lwb/bc;->j:Li0/a1;

    .line 301
    .line 302
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/t7;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 303
    .line 304
    .line 305
    new-instance v3, Ls0/d;

    .line 306
    .line 307
    const v4, -0x7742d8ac

    .line 308
    .line 309
    .line 310
    const/4 v5, 0x1

    .line 311
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 312
    .line 313
    .line 314
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 315
    .line 316
    .line 317
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 318
    .line 319
    return-object p1

    .line 320
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-static {p1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    check-cast p1, Lwb/s0;

    .line 330
    .line 331
    if-eqz p1, :cond_3

    .line 332
    .line 333
    iget-object p1, p1, Lwb/s0;->a:Ljava/lang/String;

    .line 334
    .line 335
    goto :goto_2

    .line 336
    :cond_3
    const/4 p1, 0x0

    .line 337
    :goto_2
    if-nez p1, :cond_4

    .line 338
    .line 339
    const-string p1, ""

    .line 340
    .line 341
    :cond_4
    iget-object v0, p0, Lwb/bc;->i:Li0/a1;

    .line 342
    .line 343
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    iget-object p1, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 347
    .line 348
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    check-cast v0, Ljava/lang/String;

    .line 357
    .line 358
    const-string v1, "audio_transform_last_talker"

    .line 359
    .line 360
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 365
    .line 366
    .line 367
    sget-object p1, Lwb/e;->b:Lwb/e;

    .line 368
    .line 369
    iget-object v0, p0, Lwb/bc;->j:Li0/a1;

    .line 370
    .line 371
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 375
    .line 376
    return-object p1

    .line 377
    :pswitch_6
    check-cast p1, Ljava/util/List;

    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    new-instance v0, Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 389
    .line 390
    .line 391
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-eqz v1, :cond_5

    .line 400
    .line 401
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    check-cast v1, Lwb/s0;

    .line 406
    .line 407
    iget-object v1, v1, Lwb/s0;->a:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    goto :goto_3

    .line 413
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    if-eqz v1, :cond_7

    .line 427
    .line 428
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    move-object v2, v1

    .line 433
    check-cast v2, Ljava/lang/String;

    .line 434
    .line 435
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-nez v2, :cond_6

    .line 440
    .line 441
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    goto :goto_4

    .line 445
    :cond_7
    invoke-static {p1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    iget-object v0, p0, Lwb/bc;->i:Li0/a1;

    .line 450
    .line 451
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    iget-object p1, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 455
    .line 456
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    check-cast v0, Ljava/util/Set;

    .line 465
    .line 466
    check-cast v0, Ljava/lang/Iterable;

    .line 467
    .line 468
    invoke-static {v0}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    const-string v1, "targets"

    .line 473
    .line 474
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 479
    .line 480
    .line 481
    sget-object p1, Lwb/vo;->a:Lwb/vo;

    .line 482
    .line 483
    iget-object v0, p0, Lwb/bc;->j:Li0/a1;

    .line 484
    .line 485
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 489
    .line 490
    return-object p1

    .line 491
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 492
    .line 493
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    iget-object v0, p0, Lwb/bc;->i:Li0/a1;

    .line 497
    .line 498
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    iget-object v0, p0, Lwb/bc;->j:Li0/a1;

    .line 502
    .line 503
    const-string v1, ""

    .line 504
    .line 505
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    iget-object v0, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 509
    .line 510
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    const-string v2, "text_speech_tts_engine"

    .line 515
    .line 516
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    const-string v0, "text_speech_tts_voice"

    .line 521
    .line 522
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 527
    .line 528
    .line 529
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 530
    .line 531
    return-object p1

    .line 532
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 533
    .line 534
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 535
    .line 536
    .line 537
    move-result p1

    .line 538
    if-eqz p1, :cond_8

    .line 539
    .line 540
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 541
    .line 542
    iget-object v0, p0, Lwb/bc;->i:Li0/a1;

    .line 543
    .line 544
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    goto :goto_5

    .line 548
    :cond_8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 549
    .line 550
    const-string v0, "zombie_check_auto_delete"

    .line 551
    .line 552
    iget-object v1, p0, Lwb/bc;->j:Li0/a1;

    .line 553
    .line 554
    iget-object v2, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 555
    .line 556
    const/4 v3, 0x0

    .line 557
    invoke-static {v1, p1, v2, v0, v3}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 558
    .line 559
    .line 560
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 561
    .line 562
    return-object p1

    .line 563
    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    .line 564
    .line 565
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    iget-object v1, p0, Lwb/bc;->i:Li0/a1;

    .line 570
    .line 571
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    iget-object p1, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 575
    .line 576
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    const-string v2, "block_at_all_notification_enable"

    .line 581
    .line 582
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    if-eqz v0, :cond_9

    .line 587
    .line 588
    const-string v0, "block_at_all_notification_groups"

    .line 589
    .line 590
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 591
    .line 592
    .line 593
    move-result p1

    .line 594
    if-nez p1, :cond_9

    .line 595
    .line 596
    const-string p1, ""

    .line 597
    .line 598
    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 599
    .line 600
    .line 601
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 602
    .line 603
    iget-object v0, p0, Lwb/bc;->j:Li0/a1;

    .line 604
    .line 605
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    :cond_9
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 609
    .line 610
    .line 611
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 612
    .line 613
    return-object p1

    .line 614
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 615
    .line 616
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    iget-object v1, p0, Lwb/bc;->i:Li0/a1;

    .line 621
    .line 622
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    iget-object p1, p0, Lwb/bc;->j:Li0/a1;

    .line 626
    .line 627
    if-eqz v0, :cond_a

    .line 628
    .line 629
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 630
    .line 631
    invoke-interface {p1, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    :cond_a
    iget-object v1, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 635
    .line 636
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    const-string v2, "game_emoji_pick_before_send"

    .line 641
    .line 642
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    if-eqz v0, :cond_b

    .line 647
    .line 648
    const/4 p1, 0x0

    .line 649
    goto :goto_6

    .line 650
    :cond_b
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    check-cast p1, Ljava/lang/Boolean;

    .line 655
    .line 656
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 657
    .line 658
    .line 659
    move-result p1

    .line 660
    :goto_6
    const-string v0, "game_emoji_fixed_result"

    .line 661
    .line 662
    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 663
    .line 664
    .line 665
    move-result-object p1

    .line 666
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 667
    .line 668
    .line 669
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 670
    .line 671
    return-object p1

    .line 672
    :pswitch_b
    check-cast p1, Ljava/lang/Boolean;

    .line 673
    .line 674
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    iget-object v1, p0, Lwb/bc;->i:Li0/a1;

    .line 679
    .line 680
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    iget-object p1, p0, Lwb/bc;->j:Li0/a1;

    .line 684
    .line 685
    if-eqz v0, :cond_c

    .line 686
    .line 687
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 688
    .line 689
    invoke-interface {p1, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    :cond_c
    iget-object v1, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 693
    .line 694
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    const-string v2, "game_emoji_fixed_result"

    .line 699
    .line 700
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    if-eqz v0, :cond_d

    .line 705
    .line 706
    const/4 p1, 0x0

    .line 707
    goto :goto_7

    .line 708
    :cond_d
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object p1

    .line 712
    check-cast p1, Ljava/lang/Boolean;

    .line 713
    .line 714
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 715
    .line 716
    .line 717
    move-result p1

    .line 718
    :goto_7
    const-string v0, "game_emoji_pick_before_send"

    .line 719
    .line 720
    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 721
    .line 722
    .line 723
    move-result-object p1

    .line 724
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 725
    .line 726
    .line 727
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 728
    .line 729
    return-object p1

    .line 730
    :pswitch_c
    check-cast p1, Li0/a0;

    .line 731
    .line 732
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    new-instance p1, Lh/f;

    .line 736
    .line 737
    const/4 v0, 0x2

    .line 738
    iget-object v1, p0, Lwb/bc;->h:Landroid/content/SharedPreferences;

    .line 739
    .line 740
    iget-object v2, p0, Lwb/bc;->i:Li0/a1;

    .line 741
    .line 742
    iget-object v3, p0, Lwb/bc;->j:Li0/a1;

    .line 743
    .line 744
    invoke-direct {p1, v1, v2, v3, v0}, Lh/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 745
    .line 746
    .line 747
    return-object p1

    .line 748
    nop

    .line 749
    :pswitch_data_0
    .packed-switch 0x0
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
