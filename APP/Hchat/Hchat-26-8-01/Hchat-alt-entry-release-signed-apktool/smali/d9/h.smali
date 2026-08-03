.class public final synthetic Ld9/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


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
    iput p1, p0, Ld9/h;->g:I

    iput-object p2, p0, Ld9/h;->i:Ljava/lang/Object;

    iput-boolean p5, p0, Ld9/h;->h:Z

    iput-object p3, p0, Ld9/h;->j:Ljava/lang/Object;

    iput-object p4, p0, Ld9/h;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ld9/h;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ld9/h;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ld9/h;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ld9/h;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p4, p0, Ld9/h;->h:Z

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;ZLjava/lang/Object;I)V
    .locals 0

    .line 17
    iput p5, p0, Ld9/h;->g:I

    iput-object p1, p0, Ld9/h;->i:Ljava/lang/Object;

    iput-object p2, p0, Ld9/h;->j:Ljava/lang/Object;

    iput-boolean p3, p0, Ld9/h;->h:Z

    iput-object p4, p0, Ld9/h;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLfg/l;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p5, p0, Ld9/h;->g:I

    iput-boolean p1, p0, Ld9/h;->h:Z

    iput-object p2, p0, Ld9/h;->i:Ljava/lang/Object;

    iput-object p3, p0, Ld9/h;->j:Ljava/lang/Object;

    iput-object p4, p0, Ld9/h;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Ld9/h;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ld9/h;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lx8/k;

    .line 12
    .line 13
    iget-object v1, p0, Ld9/h;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    iget-boolean v2, p0, Ld9/h;->h:Z

    .line 18
    .line 19
    iget-object v3, p0, Ld9/h;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    check-cast p1, Lokio/ByteString;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lx8/k;->i()V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Lokio/ByteString;->toByteArray()[B

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    array-length v0, p1

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    monitor-enter v3

    .line 50
    :try_start_0
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    monitor-exit v3

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p1, v0

    .line 57
    monitor-exit v3

    .line 58
    throw p1

    .line 59
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_0
    iget-object v0, p0, Ld9/h;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Landroid/content/SharedPreferences;

    .line 65
    .line 66
    iget-boolean v4, p0, Ld9/h;->h:Z

    .line 67
    .line 68
    iget-object v5, p0, Ld9/h;->j:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v5, Li0/a1;

    .line 71
    .line 72
    iget-object v6, p0, Ld9/h;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v6, Li0/a1;

    .line 75
    .line 76
    check-cast p1, Lr/h;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v7, Lwb/p0;->S4:Ls0/d;

    .line 82
    .line 83
    invoke-static {p1, v1, v7, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 84
    .line 85
    .line 86
    new-instance v7, Lwb/wl;

    .line 87
    .line 88
    invoke-direct {v7, v0, v4, v5, v6}, Lwb/wl;-><init>(Landroid/content/SharedPreferences;ZLi0/a1;Li0/a1;)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Ls0/d;

    .line 92
    .line 93
    const v4, -0xd94b826

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, v4, v7, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 97
    .line 98
    .line 99
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 100
    .line 101
    .line 102
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 103
    .line 104
    return-object p1

    .line 105
    :pswitch_1
    iget-boolean v0, p0, Ld9/h;->h:Z

    .line 106
    .line 107
    iget-object v1, p0, Ld9/h;->i:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Lfg/l;

    .line 110
    .line 111
    iget-object v2, p0, Ld9/h;->j:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, Li0/a1;

    .line 114
    .line 115
    iget-object v3, p0, Ld9/h;->k:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v3, Li0/a1;

    .line 118
    .line 119
    check-cast p1, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v0}, Lwb/ho;->Y4(Ljava/lang/String;)Lsf/e;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_4

    .line 147
    .line 148
    iget-object v0, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Ljava/lang/CharSequence;

    .line 151
    .line 152
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-nez v2, :cond_3

    .line 157
    .line 158
    move-object v0, p1

    .line 159
    :cond_3
    check-cast v0, Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {v0, p1}, Lwb/ho;->a5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    goto :goto_2

    .line 166
    :cond_4
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {p1, v0}, Lwb/ho;->a5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    :cond_5
    :goto_2
    invoke-interface {v1, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :pswitch_2
    iget-boolean v0, p0, Ld9/h;->h:Z

    .line 179
    .line 180
    iget-object v4, p0, Ld9/h;->i:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v4, Lfg/l;

    .line 183
    .line 184
    iget-object v5, p0, Ld9/h;->j:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v5, Ljava/util/List;

    .line 187
    .line 188
    iget-object v6, p0, Ld9/h;->k:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v6, Lfg/a;

    .line 191
    .line 192
    check-cast p1, Lr/h;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    sget-object v7, Lwb/p0;->K0:Ls0/d;

    .line 198
    .line 199
    invoke-static {p1, v1, v7, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 200
    .line 201
    .line 202
    new-instance v7, Lhb/j0;

    .line 203
    .line 204
    invoke-direct {v7, v0, v4, v5, v6}, Lhb/j0;-><init>(ZLfg/l;Ljava/util/List;Lfg/a;)V

    .line 205
    .line 206
    .line 207
    new-instance v0, Ls0/d;

    .line 208
    .line 209
    const v4, -0x71ffbf

    .line 210
    .line 211
    .line 212
    invoke-direct {v0, v4, v7, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 213
    .line 214
    .line 215
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :pswitch_3
    iget-object v0, p0, Ld9/h;->i:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Ljava/util/List;

    .line 222
    .line 223
    iget-boolean v4, p0, Ld9/h;->h:Z

    .line 224
    .line 225
    iget-object v5, p0, Ld9/h;->j:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v5, Lfg/l;

    .line 228
    .line 229
    iget-object v6, p0, Ld9/h;->k:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v6, Lfg/l;

    .line 232
    .line 233
    check-cast p1, Lr/h;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    sget-object v7, Lwb/p0;->p4:Ls0/d;

    .line 239
    .line 240
    invoke-static {p1, v1, v7, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 241
    .line 242
    .line 243
    new-instance v7, Lwb/yd;

    .line 244
    .line 245
    invoke-direct {v7, v4, v5, v0}, Lwb/yd;-><init>(ZLfg/l;Ljava/util/List;)V

    .line 246
    .line 247
    .line 248
    new-instance v4, Ls0/d;

    .line 249
    .line 250
    const v5, 0x43635c7a

    .line 251
    .line 252
    .line 253
    invoke-direct {v4, v5, v7, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 254
    .line 255
    .line 256
    invoke-static {p1, v1, v4, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 257
    .line 258
    .line 259
    sget-object v4, Lwb/p0;->q4:Ls0/d;

    .line 260
    .line 261
    invoke-static {p1, v1, v4, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 262
    .line 263
    .line 264
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-eqz v4, :cond_6

    .line 269
    .line 270
    sget-object v0, Lwb/p0;->s4:Ls0/d;

    .line 271
    .line 272
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-eqz v4, :cond_7

    .line 285
    .line 286
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    check-cast v4, Ldb/c;

    .line 291
    .line 292
    new-instance v5, Lwb/wc;

    .line 293
    .line 294
    const/4 v7, 0x2

    .line 295
    invoke-direct {v5, v7, v4, v6}, Lwb/wc;-><init>(ILdb/c;Lfg/l;)V

    .line 296
    .line 297
    .line 298
    new-instance v4, Ls0/d;

    .line 299
    .line 300
    const v7, 0x275e1df2

    .line 301
    .line 302
    .line 303
    invoke-direct {v4, v7, v5, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 304
    .line 305
    .line 306
    invoke-static {p1, v1, v4, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 307
    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_7
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 311
    .line 312
    return-object p1

    .line 313
    :pswitch_4
    iget-object v0, p0, Ld9/h;->i:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Li0/a1;

    .line 316
    .line 317
    iget-object v1, p0, Ld9/h;->j:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v1, Ljava/util/ArrayList;

    .line 320
    .line 321
    iget-object v2, p0, Ld9/h;->k:Ljava/lang/Object;

    .line 322
    .line 323
    iget-boolean v4, p0, Ld9/h;->h:Z

    .line 324
    .line 325
    check-cast p1, Lv1/a1;

    .line 326
    .line 327
    iput-boolean v3, p1, Lv1/a1;->g:Z

    .line 328
    .line 329
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    const/4 v5, 0x0

    .line 334
    move v6, v5

    .line 335
    :goto_5
    if-ge v6, v3, :cond_8

    .line 336
    .line 337
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    check-cast v7, Lr/q;

    .line 342
    .line 343
    invoke-virtual {v7, p1, v4}, Lr/q;->c(Lv1/a1;Z)V

    .line 344
    .line 345
    .line 346
    add-int/lit8 v6, v6, 0x1

    .line 347
    .line 348
    goto :goto_5

    .line 349
    :cond_8
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    move v3, v5

    .line 354
    :goto_6
    if-ge v3, v1, :cond_9

    .line 355
    .line 356
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    check-cast v6, Lr/q;

    .line 361
    .line 362
    invoke-virtual {v6, p1, v4}, Lr/q;->c(Lv1/a1;Z)V

    .line 363
    .line 364
    .line 365
    add-int/lit8 v3, v3, 0x1

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_9
    iput-boolean v5, p1, Lv1/a1;->g:Z

    .line 369
    .line 370
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :pswitch_5
    iget-object v0, p0, Ld9/h;->i:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Lfg/a;

    .line 378
    .line 379
    iget-boolean v1, p0, Ld9/h;->h:Z

    .line 380
    .line 381
    iget-object v2, p0, Ld9/h;->j:Ljava/lang/Object;

    .line 382
    .line 383
    move-object v4, v2

    .line 384
    check-cast v4, Lf1/g;

    .line 385
    .line 386
    iget-object v2, p0, Ld9/h;->k:Ljava/lang/Object;

    .line 387
    .line 388
    move-object v8, v2

    .line 389
    check-cast v8, Lf1/n;

    .line 390
    .line 391
    move-object v3, p1

    .line 392
    check-cast v3, Lx1/h0;

    .line 393
    .line 394
    invoke-virtual {v3}, Lx1/h0;->e()V

    .line 395
    .line 396
    .line 397
    iget-object p1, v3, Lx1/h0;->g:Lh1/b;

    .line 398
    .line 399
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    check-cast v0, Ljava/lang/Boolean;

    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    if-nez v0, :cond_a

    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_a
    if-eqz v1, :cond_b

    .line 413
    .line 414
    invoke-interface {p1}, Lh1/d;->I0()J

    .line 415
    .line 416
    .line 417
    move-result-wide v0

    .line 418
    iget-object p1, p1, Lh1/b;->h:Lb5/c;

    .line 419
    .line 420
    invoke-virtual {p1}, Lb5/c;->v()J

    .line 421
    .line 422
    .line 423
    move-result-wide v11

    .line 424
    invoke-virtual {p1}, Lb5/c;->p()Lf1/u;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-interface {v2}, Lf1/u;->e()V

    .line 429
    .line 430
    .line 431
    :try_start_1
    iget-object v2, p1, Lb5/c;->a:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v2, Landroidx/lifecycle/x;

    .line 434
    .line 435
    const/high16 v5, -0x40800000    # -1.0f

    .line 436
    .line 437
    const/high16 v6, 0x3f800000    # 1.0f

    .line 438
    .line 439
    invoke-virtual {v2, v5, v6, v0, v1}, Landroidx/lifecycle/x;->S(FFJ)V

    .line 440
    .line 441
    .line 442
    const/4 v9, 0x0

    .line 443
    const/16 v10, 0x2e

    .line 444
    .line 445
    const-wide/16 v5, 0x0

    .line 446
    .line 447
    const/4 v7, 0x0

    .line 448
    invoke-static/range {v3 .. v10}, Lh1/d;->U(Lh1/d;Lf1/g;JFLf1/n;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 449
    .line 450
    .line 451
    invoke-virtual {p1}, Lb5/c;->p()Lf1/u;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-interface {v0}, Lf1/u;->p()V

    .line 456
    .line 457
    .line 458
    invoke-virtual {p1, v11, v12}, Lb5/c;->U(J)V

    .line 459
    .line 460
    .line 461
    goto :goto_7

    .line 462
    :catchall_1
    move-exception v0

    .line 463
    invoke-virtual {p1}, Lb5/c;->p()Lf1/u;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    invoke-interface {v1}, Lf1/u;->p()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {p1, v11, v12}, Lb5/c;->U(J)V

    .line 471
    .line 472
    .line 473
    throw v0

    .line 474
    :cond_b
    const/4 v9, 0x0

    .line 475
    const/16 v10, 0x2e

    .line 476
    .line 477
    const-wide/16 v5, 0x0

    .line 478
    .line 479
    const/4 v7, 0x0

    .line 480
    invoke-static/range {v3 .. v10}, Lh1/d;->U(Lh1/d;Lf1/g;JFLf1/n;II)V

    .line 481
    .line 482
    .line 483
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 484
    .line 485
    return-object p1

    .line 486
    :pswitch_6
    iget-object v0, p0, Ld9/h;->i:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v0, Landroid/app/Activity;

    .line 489
    .line 490
    iget-object v1, p0, Ld9/h;->j:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v1, Ljava/lang/String;

    .line 493
    .line 494
    iget-boolean v4, p0, Ld9/h;->h:Z

    .line 495
    .line 496
    iget-object v5, p0, Ld9/h;->k:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v5, Ld9/m;

    .line 499
    .line 500
    check-cast p1, Ljava/lang/Integer;

    .line 501
    .line 502
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 503
    .line 504
    .line 505
    move-result p1

    .line 506
    if-nez p1, :cond_c

    .line 507
    .line 508
    new-instance p1, Lc9/i;

    .line 509
    .line 510
    const/16 v2, 0xb

    .line 511
    .line 512
    invoke-direct {p1, v5, v2, v0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    sget-object v2, Ld9/f;->a:Ld9/f;

    .line 516
    .line 517
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    sget-object v2, Ld9/f;->a:Ld9/f;

    .line 524
    .line 525
    invoke-virtual {v2, v0, p1, v1, v3}, Ld9/f;->b(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Z)V

    .line 526
    .line 527
    .line 528
    goto :goto_8

    .line 529
    :cond_c
    if-eqz v4, :cond_d

    .line 530
    .line 531
    iget-object p1, v5, Ld9/m;->a:Lr8/g;

    .line 532
    .line 533
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 534
    .line 535
    invoke-static {p1, v1}, Ld9/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    .line 536
    .line 537
    .line 538
    const-string p1, "\u5df2\u6062\u590d\u5fae\u4fe1\u5934\u50cf"

    .line 539
    .line 540
    if-eqz v0, :cond_d

    .line 541
    .line 542
    new-instance v1, Landroid/os/Handler;

    .line 543
    .line 544
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 549
    .line 550
    .line 551
    new-instance v3, Lc9/t;

    .line 552
    .line 553
    invoke-direct {v3, v0, p1, v2}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 557
    .line 558
    .line 559
    :cond_d
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 560
    .line 561
    return-object p1

    .line 562
    nop

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
