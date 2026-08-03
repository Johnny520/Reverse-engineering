.class public final synthetic Lhb/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 16
    iput p1, p0, Lhb/j0;->g:I

    iput-object p2, p0, Lhb/j0;->i:Ljava/lang/Object;

    iput-object p3, p0, Lhb/j0;->j:Ljava/lang/Object;

    iput-boolean p5, p0, Lhb/j0;->h:Z

    iput-object p4, p0, Lhb/j0;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lsh/x;Lr/z;Landroid/content/SharedPreferences;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lhb/j0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhb/j0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lhb/j0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lhb/j0;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p4, p0, Lhb/j0;->h:Z

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(ZLfg/l;Ljava/util/List;Lfg/a;)V
    .locals 1

    .line 17
    const/4 v0, 0x1

    iput v0, p0, Lhb/j0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lhb/j0;->h:Z

    iput-object p2, p0, Lhb/j0;->i:Ljava/lang/Object;

    iput-object p3, p0, Lhb/j0;->j:Ljava/lang/Object;

    iput-object p4, p0, Lhb/j0;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lhb/j0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/j0;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lsh/x;

    .line 9
    .line 10
    iget-object v1, p0, Lhb/j0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, Lr/z;

    .line 14
    .line 15
    iget-object v1, p0, Lhb/j0;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroid/content/SharedPreferences;

    .line 18
    .line 19
    check-cast p1, Lp/x0;

    .line 20
    .line 21
    move-object/from16 v11, p2

    .line 22
    .line 23
    check-cast v11, Li0/h0;

    .line 24
    .line 25
    move-object/from16 v2, p3

    .line 26
    .line 27
    check-cast v2, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    and-int/lit8 v4, v2, 0x6

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    invoke-virtual {v11, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    const/4 v4, 0x4

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v4, 0x2

    .line 49
    :goto_0
    or-int/2addr v2, v4

    .line 50
    :cond_1
    and-int/lit8 v4, v2, 0x13

    .line 51
    .line 52
    const/16 v5, 0x12

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    if-eq v4, v5, :cond_2

    .line 56
    .line 57
    move v4, v6

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/4 v4, 0x0

    .line 60
    :goto_1
    and-int/2addr v2, v6

    .line 61
    invoke-virtual {v11, v2, v4}, Li0/h0;->S(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 68
    .line 69
    iget-object v0, v0, Lsh/x;->e:Lm/a;

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-static {v2, v0, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {p1}, Lp/x0;->c()F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/16 v4, 0x8

    .line 81
    .line 82
    int-to-float v4, v4

    .line 83
    add-float/2addr v0, v4

    .line 84
    invoke-interface {p1}, Lp/x0;->a()F

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    const/16 v4, 0x54

    .line 89
    .line 90
    int-to-float v4, v4

    .line 91
    add-float/2addr p1, v4

    .line 92
    const/4 v4, 0x5

    .line 93
    invoke-static {v0, p1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v11, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-nez p1, :cond_3

    .line 106
    .line 107
    sget-object p1, Li0/l;->a:Li0/e;

    .line 108
    .line 109
    if-ne v0, p1, :cond_4

    .line 110
    .line 111
    :cond_3
    new-instance v0, Lwb/g3;

    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    iget-boolean v5, p0, Lhb/j0;->h:Z

    .line 115
    .line 116
    invoke-direct {v0, v1, v5, p1}, Lwb/g3;-><init>(Ljava/lang/Object;ZI)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    move-object v10, v0

    .line 123
    check-cast v10, Lfg/l;

    .line 124
    .line 125
    const/4 v12, 0x0

    .line 126
    const/16 v13, 0x1f8

    .line 127
    .line 128
    const/4 v5, 0x0

    .line 129
    const/4 v6, 0x0

    .line 130
    const/4 v7, 0x0

    .line 131
    const/4 v8, 0x0

    .line 132
    const/4 v9, 0x0

    .line 133
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 138
    .line 139
    .line 140
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 141
    .line 142
    return-object p1

    .line 143
    :pswitch_0
    iget-object v0, p0, Lhb/j0;->i:Ljava/lang/Object;

    .line 144
    .line 145
    move-object v1, v0

    .line 146
    check-cast v1, Lwb/s0;

    .line 147
    .line 148
    iget-object v0, p0, Lhb/j0;->j:Ljava/lang/Object;

    .line 149
    .line 150
    move-object v2, v0

    .line 151
    check-cast v2, Ljava/lang/String;

    .line 152
    .line 153
    iget-object v0, p0, Lhb/j0;->k:Ljava/lang/Object;

    .line 154
    .line 155
    move-object v4, v0

    .line 156
    check-cast v4, Lfg/a;

    .line 157
    .line 158
    check-cast p1, Lp/u;

    .line 159
    .line 160
    move-object/from16 v5, p2

    .line 161
    .line 162
    check-cast v5, Li0/h0;

    .line 163
    .line 164
    move-object/from16 v0, p3

    .line 165
    .line 166
    check-cast v0, Ljava/lang/Integer;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    and-int/lit8 p1, v0, 0x11

    .line 176
    .line 177
    const/16 v3, 0x10

    .line 178
    .line 179
    const/4 v6, 0x1

    .line 180
    if-eq p1, v3, :cond_6

    .line 181
    .line 182
    move p1, v6

    .line 183
    goto :goto_3

    .line 184
    :cond_6
    const/4 p1, 0x0

    .line 185
    :goto_3
    and-int/2addr v0, v6

    .line 186
    invoke-virtual {v5, v0, p1}, Li0/h0;->S(IZ)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_7

    .line 191
    .line 192
    const/4 v6, 0x0

    .line 193
    iget-boolean v3, p0, Lhb/j0;->h:Z

    .line 194
    .line 195
    invoke-static/range {v1 .. v6}, Lwb/ho;->W1(Lwb/s0;Ljava/lang/String;ZLfg/a;Li0/h0;I)V

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_7
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 200
    .line 201
    .line 202
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 203
    .line 204
    return-object p1

    .line 205
    :pswitch_1
    iget-object v0, p0, Lhb/j0;->i:Ljava/lang/Object;

    .line 206
    .line 207
    move-object v3, v0

    .line 208
    check-cast v3, Lfg/l;

    .line 209
    .line 210
    iget-object v0, p0, Lhb/j0;->j:Ljava/lang/Object;

    .line 211
    .line 212
    move-object v4, v0

    .line 213
    check-cast v4, Ljava/util/List;

    .line 214
    .line 215
    iget-object v0, p0, Lhb/j0;->k:Ljava/lang/Object;

    .line 216
    .line 217
    move-object v5, v0

    .line 218
    check-cast v5, Lfg/a;

    .line 219
    .line 220
    check-cast p1, Lr/d;

    .line 221
    .line 222
    move-object/from16 v0, p2

    .line 223
    .line 224
    check-cast v0, Li0/h0;

    .line 225
    .line 226
    move-object/from16 v1, p3

    .line 227
    .line 228
    check-cast v1, Ljava/lang/Integer;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    and-int/lit8 p1, v1, 0x11

    .line 238
    .line 239
    const/16 v2, 0x10

    .line 240
    .line 241
    const/4 v7, 0x1

    .line 242
    if-eq p1, v2, :cond_8

    .line 243
    .line 244
    move p1, v7

    .line 245
    goto :goto_5

    .line 246
    :cond_8
    const/4 p1, 0x0

    .line 247
    :goto_5
    and-int/2addr v1, v7

    .line 248
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-eqz p1, :cond_9

    .line 253
    .line 254
    new-instance v1, Lsh/j;

    .line 255
    .line 256
    const/4 v2, 0x3

    .line 257
    iget-boolean v6, p0, Lhb/j0;->h:Z

    .line 258
    .line 259
    invoke-direct/range {v1 .. v6}, Lsh/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 260
    .line 261
    .line 262
    const p1, -0x75344c0

    .line 263
    .line 264
    .line 265
    invoke-static {p1, v1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    const/16 v1, 0x30

    .line 270
    .line 271
    const/4 v2, 0x0

    .line 272
    invoke-static {v2, p1, v0, v1, v7}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_9
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 277
    .line 278
    .line 279
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 280
    .line 281
    return-object p1

    .line 282
    :pswitch_2
    iget-object v0, p0, Lhb/j0;->i:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 285
    .line 286
    iget-object v1, p0, Lhb/j0;->j:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v1, Lwb/kv;

    .line 289
    .line 290
    iget-object v2, p0, Lhb/j0;->k:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v2, Landroid/app/Activity;

    .line 293
    .line 294
    check-cast p1, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    move-object/from16 v3, p2

    .line 301
    .line 302
    check-cast v3, Ljava/lang/Integer;

    .line 303
    .line 304
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    move-object/from16 v4, p3

    .line 309
    .line 310
    check-cast v4, Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    const/4 v5, 0x1

    .line 317
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 318
    .line 319
    .line 320
    if-eqz v1, :cond_a

    .line 321
    .line 322
    invoke-interface {v1}, Lwb/kv;->close()V

    .line 323
    .line 324
    .line 325
    :cond_a
    iget-boolean v0, p0, Lhb/j0;->h:Z

    .line 326
    .line 327
    if-eqz v0, :cond_b

    .line 328
    .line 329
    const-string v0, "\u539f\u751f\u7fa4\u53d1"

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_b
    const-string v0, "\u6a21\u5757\u7fa4\u53d1"

    .line 333
    .line 334
    :goto_7
    const-string v1, "/"

    .line 335
    .line 336
    if-eqz v4, :cond_c

    .line 337
    .line 338
    new-instance v4, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v0, " \u5df2\u53d6\u6d88: "

    .line 347
    .line 348
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    goto :goto_8

    .line 365
    :cond_c
    if-ne p1, v3, :cond_d

    .line 366
    .line 367
    new-instance v4, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    const-string v0, " \u5b8c\u6210: "

    .line 376
    .line 377
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    goto :goto_8

    .line 394
    :cond_d
    new-instance v4, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    const-string v0, " \u90e8\u5206\u5931\u8d25: "

    .line 403
    .line 404
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    :goto_8
    new-instance v0, Landroid/os/Handler;

    .line 421
    .line 422
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 427
    .line 428
    .line 429
    new-instance v1, Lc9/t;

    .line 430
    .line 431
    const/4 v3, 0x7

    .line 432
    invoke-direct {v1, v2, p1, v3}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 436
    .line 437
    .line 438
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 439
    .line 440
    return-object p1

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
