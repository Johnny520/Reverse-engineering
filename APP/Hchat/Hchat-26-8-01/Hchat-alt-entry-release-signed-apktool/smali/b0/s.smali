.class public final synthetic Lb0/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 15
    iput p1, p0, Lb0/s;->g:I

    iput-object p3, p0, Lb0/s;->h:Ljava/lang/Object;

    iput-object p4, p0, Lb0/s;->j:Ljava/lang/Object;

    iput-object p2, p0, Lb0/s;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    iput v0, p0, Lb0/s;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lb0/s;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lb0/s;->h:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lb0/s;->j:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p4, p0, Lb0/s;->g:I

    iput-object p1, p0, Lb0/s;->h:Ljava/lang/Object;

    iput-object p2, p0, Lb0/s;->i:Ljava/lang/Object;

    iput-object p3, p0, Lb0/s;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Ljava/lang/String;Lv8/q;Lv8/h;)V
    .locals 0

    .line 17
    const/16 p3, 0x14

    iput p3, p0, Lb0/s;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/s;->h:Ljava/lang/Object;

    iput-object p2, p0, Lb0/s;->i:Ljava/lang/Object;

    iput-object p4, p0, Lb0/s;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lm/k;Lm/g3;Lqg/r0;Lm/m2;)V
    .locals 0

    .line 18
    const/16 p2, 0xa

    iput p2, p0, Lb0/s;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/s;->h:Ljava/lang/Object;

    iput-object p3, p0, Lb0/s;->i:Ljava/lang/Object;

    iput-object p4, p0, Lb0/s;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lqa/f;Lgg/q;Lgg/q;Lgg/q;)V
    .locals 0

    .line 19
    const/16 p1, 0xf

    iput p1, p0, Lb0/s;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb0/s;->h:Ljava/lang/Object;

    iput-object p3, p0, Lb0/s;->i:Ljava/lang/Object;

    iput-object p4, p0, Lb0/s;->j:Ljava/lang/Object;

    return-void
.end method

.method private final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lb0/s;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw/m0;

    .line 4
    .line 5
    iget-object v1, p0, Lb0/s;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lw/b1;

    .line 8
    .line 9
    iget-object v2, p0, Lb0/s;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lgg/q;

    .line 12
    .line 13
    check-cast p1, Lh0/s0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v3, 0xe

    .line 20
    .line 21
    const/4 v4, -0x1

    .line 22
    const/4 v5, 0x1

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lokio/a;->k()V

    .line 29
    .line 30
    .line 31
    return-object v7

    .line 32
    :pswitch_0
    iget-object p1, v1, Lw/b1;->h:Lw/q1;

    .line 33
    .line 34
    if-eqz p1, :cond_1b

    .line 35
    .line 36
    iget-object v0, p1, Lw/q1;->b:Lp4/t;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v2, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lp4/t;

    .line 43
    .line 44
    iput-object v2, p1, Lw/q1;->b:Lp4/t;

    .line 45
    .line 46
    iget-object v2, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ln2/s;

    .line 49
    .line 50
    iget-object v4, p1, Lw/q1;->a:Lp4/t;

    .line 51
    .line 52
    new-instance v5, Lp4/t;

    .line 53
    .line 54
    invoke-direct {v5, v4, v3, v2}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object v5, p1, Lw/q1;->a:Lp4/t;

    .line 58
    .line 59
    iget v3, p1, Lw/q1;->c:I

    .line 60
    .line 61
    iget-object v2, v2, Ln2/s;->a:Li2/g;

    .line 62
    .line 63
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    add-int/2addr v2, v3

    .line 70
    iput v2, p1, Lw/q1;->c:I

    .line 71
    .line 72
    iget-object p1, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v7, p1

    .line 75
    check-cast v7, Ln2/s;

    .line 76
    .line 77
    :cond_0
    if-eqz v7, :cond_1b

    .line 78
    .line 79
    iget-object p1, v1, Lw/b1;->k:Lfg/l;

    .line 80
    .line 81
    invoke-interface {p1, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :pswitch_1
    iget-object v0, v1, Lw/b1;->h:Lw/q1;

    .line 87
    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    iget-object v2, p1, Lh0/s0;->h:Ln2/s;

    .line 91
    .line 92
    iget-object v4, p1, Lh0/s0;->g:Li2/g;

    .line 93
    .line 94
    iget-wide v5, p1, Lh0/s0;->f:J

    .line 95
    .line 96
    const/4 p1, 0x4

    .line 97
    invoke-static {v2, v4, v5, v6, p1}, Ln2/s;->a(Ln2/s;Li2/g;JI)Ln2/s;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v0, p1}, Lw/q1;->a(Ln2/s;)V

    .line 102
    .line 103
    .line 104
    :cond_1
    iget-object p1, v1, Lw/b1;->h:Lw/q1;

    .line 105
    .line 106
    if-eqz p1, :cond_1b

    .line 107
    .line 108
    iget-object v0, p1, Lw/q1;->a:Lp4/t;

    .line 109
    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    iget-object v2, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Lp4/t;

    .line 115
    .line 116
    if-eqz v2, :cond_2

    .line 117
    .line 118
    iput-object v2, p1, Lw/q1;->a:Lp4/t;

    .line 119
    .line 120
    iget v4, p1, Lw/q1;->c:I

    .line 121
    .line 122
    iget-object v5, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v5, Ln2/s;

    .line 125
    .line 126
    iget-object v5, v5, Ln2/s;->a:Li2/g;

    .line 127
    .line 128
    iget-object v5, v5, Li2/g;->h:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    sub-int/2addr v4, v5

    .line 135
    iput v4, p1, Lw/q1;->c:I

    .line 136
    .line 137
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Ln2/s;

    .line 140
    .line 141
    iget-object v4, p1, Lw/q1;->b:Lp4/t;

    .line 142
    .line 143
    new-instance v5, Lp4/t;

    .line 144
    .line 145
    invoke-direct {v5, v4, v3, v0}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    iput-object v5, p1, Lw/q1;->b:Lp4/t;

    .line 149
    .line 150
    iget-object p1, v2, Lp4/t;->i:Ljava/lang/Object;

    .line 151
    .line 152
    move-object v7, p1

    .line 153
    check-cast v7, Ln2/s;

    .line 154
    .line 155
    :cond_2
    if-eqz v7, :cond_1b

    .line 156
    .line 157
    iget-object p1, v1, Lw/b1;->k:Lfg/l;

    .line 158
    .line 159
    invoke-interface {p1, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :pswitch_2
    iget-boolean p1, v1, Lw/b1;->e:Z

    .line 165
    .line 166
    if-nez p1, :cond_3

    .line 167
    .line 168
    new-instance p1, Ln2/a;

    .line 169
    .line 170
    const-string v0, "\t"

    .line 171
    .line 172
    invoke-direct {p1, v0, v5}, Ln2/a;-><init>(Ljava/lang/String;I)V

    .line 173
    .line 174
    .line 175
    invoke-static {p1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {v1, p1}, Lw/b1;->a(Ljava/util/List;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_4

    .line 183
    .line 184
    :cond_3
    iput-boolean v6, v2, Lgg/q;->g:Z

    .line 185
    .line 186
    goto/16 :goto_4

    .line 187
    .line 188
    :pswitch_3
    iget-boolean p1, v1, Lw/b1;->e:Z

    .line 189
    .line 190
    if-nez p1, :cond_4

    .line 191
    .line 192
    new-instance p1, Ln2/a;

    .line 193
    .line 194
    const-string v0, "\n"

    .line 195
    .line 196
    invoke-direct {p1, v0, v5}, Ln2/a;-><init>(Ljava/lang/String;I)V

    .line 197
    .line 198
    .line 199
    invoke-static {p1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {v1, p1}, Lw/b1;->a(Ljava/util/List;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_4

    .line 207
    .line 208
    :cond_4
    iget-object p1, v1, Lw/b1;->a:Lw/q0;

    .line 209
    .line 210
    iget-object p1, p1, Lw/q0;->x:Lw/w;

    .line 211
    .line 212
    iget v0, v1, Lw/b1;->l:I

    .line 213
    .line 214
    iget-object p1, p1, Lw/w;->h:Lw/q0;

    .line 215
    .line 216
    iget-object p1, p1, Lw/q0;->r:Lb5/c;

    .line 217
    .line 218
    invoke-virtual {p1, v0}, Lb5/c;->M(I)Z

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    iput-boolean p1, v2, Lgg/q;->g:Z

    .line 223
    .line 224
    goto/16 :goto_4

    .line 225
    .line 226
    :pswitch_4
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 227
    .line 228
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 229
    .line 230
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 231
    .line 232
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-lez v0, :cond_1b

    .line 239
    .line 240
    iget-wide v0, p1, Lh0/s0;->f:J

    .line 241
    .line 242
    sget v2, Li2/m0;->c:I

    .line 243
    .line 244
    const-wide v2, 0xffffffffL

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    and-long/2addr v0, v2

    .line 250
    long-to-int v0, v0

    .line 251
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_4

    .line 255
    .line 256
    :pswitch_5
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 257
    .line 258
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 259
    .line 260
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 261
    .line 262
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-lez v0, :cond_6

    .line 269
    .line 270
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_5

    .line 275
    .line 276
    invoke-virtual {p1}, Lh0/s0;->n()V

    .line 277
    .line 278
    .line 279
    goto :goto_0

    .line 280
    :cond_5
    invoke-virtual {p1}, Lh0/s0;->o()V

    .line 281
    .line 282
    .line 283
    :cond_6
    :goto_0
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_4

    .line 287
    .line 288
    :pswitch_6
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 289
    .line 290
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 291
    .line 292
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 293
    .line 294
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-lez v0, :cond_8

    .line 301
    .line 302
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_7

    .line 307
    .line 308
    invoke-virtual {p1}, Lh0/s0;->o()V

    .line 309
    .line 310
    .line 311
    goto :goto_1

    .line 312
    :cond_7
    invoke-virtual {p1}, Lh0/s0;->n()V

    .line 313
    .line 314
    .line 315
    :cond_8
    :goto_1
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_4

    .line 319
    .line 320
    :pswitch_7
    invoke-virtual {p1}, Lh0/s0;->n()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 324
    .line 325
    .line 326
    goto/16 :goto_4

    .line 327
    .line 328
    :pswitch_8
    invoke-virtual {p1}, Lh0/s0;->o()V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_4

    .line 335
    .line 336
    :pswitch_9
    invoke-virtual {p1}, Lh0/s0;->l()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_4

    .line 343
    .line 344
    :pswitch_a
    invoke-virtual {p1}, Lh0/s0;->j()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_4

    .line 351
    .line 352
    :pswitch_b
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 353
    .line 354
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 355
    .line 356
    iget-object v1, p1, Lh0/s0;->g:Li2/g;

    .line 357
    .line 358
    iget-object v2, v1, Li2/g;->h:Ljava/lang/String;

    .line 359
    .line 360
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 361
    .line 362
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-lez v2, :cond_a

    .line 367
    .line 368
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-eqz v2, :cond_9

    .line 373
    .line 374
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 375
    .line 376
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-lez v0, :cond_a

    .line 381
    .line 382
    invoke-virtual {p1}, Lh0/s0;->d()Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    if-eqz v0, :cond_a

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 393
    .line 394
    .line 395
    goto :goto_2

    .line 396
    :cond_9
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-lez v0, :cond_a

    .line 403
    .line 404
    invoke-virtual {p1}, Lh0/s0;->e()Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    if-eqz v0, :cond_a

    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 415
    .line 416
    .line 417
    :cond_a
    :goto_2
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 418
    .line 419
    .line 420
    goto/16 :goto_4

    .line 421
    .line 422
    :pswitch_c
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 423
    .line 424
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 425
    .line 426
    iget-object v1, p1, Lh0/s0;->g:Li2/g;

    .line 427
    .line 428
    iget-object v2, v1, Li2/g;->h:Ljava/lang/String;

    .line 429
    .line 430
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-lez v2, :cond_c

    .line 437
    .line 438
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    if-eqz v2, :cond_b

    .line 443
    .line 444
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 445
    .line 446
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-lez v0, :cond_c

    .line 451
    .line 452
    invoke-virtual {p1}, Lh0/s0;->e()Ljava/lang/Integer;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    if-eqz v0, :cond_c

    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 463
    .line 464
    .line 465
    goto :goto_3

    .line 466
    :cond_b
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 467
    .line 468
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-lez v0, :cond_c

    .line 473
    .line 474
    invoke-virtual {p1}, Lh0/s0;->d()Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    if-eqz v0, :cond_c

    .line 479
    .line 480
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 485
    .line 486
    .line 487
    :cond_c
    :goto_3
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_4

    .line 491
    .line 492
    :pswitch_d
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 493
    .line 494
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 495
    .line 496
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 497
    .line 498
    iget-object v1, v0, Li2/g;->h:Ljava/lang/String;

    .line 499
    .line 500
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    if-lez v1, :cond_d

    .line 505
    .line 506
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 507
    .line 508
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 513
    .line 514
    .line 515
    :cond_d
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 516
    .line 517
    .line 518
    goto/16 :goto_4

    .line 519
    .line 520
    :pswitch_e
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 521
    .line 522
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 523
    .line 524
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 525
    .line 526
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 527
    .line 528
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-lez v0, :cond_e

    .line 533
    .line 534
    invoke-virtual {p1, v6, v6}, Lh0/s0;->q(II)V

    .line 535
    .line 536
    .line 537
    :cond_e
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 538
    .line 539
    .line 540
    goto/16 :goto_4

    .line 541
    .line 542
    :pswitch_f
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 543
    .line 544
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 545
    .line 546
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-lez v0, :cond_f

    .line 551
    .line 552
    iget-object v0, p1, Lh0/s0;->i:Lw/m1;

    .line 553
    .line 554
    if-eqz v0, :cond_f

    .line 555
    .line 556
    invoke-virtual {p1, v0, v5}, Lh0/s0;->h(Lw/m1;I)I

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 561
    .line 562
    .line 563
    :cond_f
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 564
    .line 565
    .line 566
    goto/16 :goto_4

    .line 567
    .line 568
    :pswitch_10
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 569
    .line 570
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 571
    .line 572
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 573
    .line 574
    .line 575
    move-result v0

    .line 576
    if-lez v0, :cond_10

    .line 577
    .line 578
    iget-object v0, p1, Lh0/s0;->i:Lw/m1;

    .line 579
    .line 580
    if-eqz v0, :cond_10

    .line 581
    .line 582
    invoke-virtual {p1, v0, v4}, Lh0/s0;->h(Lw/m1;I)I

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 587
    .line 588
    .line 589
    :cond_10
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 590
    .line 591
    .line 592
    goto/16 :goto_4

    .line 593
    .line 594
    :pswitch_11
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 595
    .line 596
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 597
    .line 598
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 599
    .line 600
    .line 601
    move-result v0

    .line 602
    if-lez v0, :cond_11

    .line 603
    .line 604
    iget-object v0, p1, Lh0/s0;->c:Li2/k0;

    .line 605
    .line 606
    if-eqz v0, :cond_11

    .line 607
    .line 608
    invoke-virtual {p1, v0, v5}, Lh0/s0;->g(Li2/k0;I)I

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 613
    .line 614
    .line 615
    :cond_11
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 616
    .line 617
    .line 618
    goto/16 :goto_4

    .line 619
    .line 620
    :pswitch_12
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 621
    .line 622
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 623
    .line 624
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-lez v0, :cond_12

    .line 629
    .line 630
    iget-object v0, p1, Lh0/s0;->c:Li2/k0;

    .line 631
    .line 632
    if-eqz v0, :cond_12

    .line 633
    .line 634
    invoke-virtual {p1, v0, v4}, Lh0/s0;->g(Li2/k0;I)I

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 639
    .line 640
    .line 641
    :cond_12
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 642
    .line 643
    .line 644
    goto/16 :goto_4

    .line 645
    .line 646
    :pswitch_13
    invoke-virtual {p1}, Lh0/s0;->m()V

    .line 647
    .line 648
    .line 649
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 650
    .line 651
    .line 652
    goto/16 :goto_4

    .line 653
    .line 654
    :pswitch_14
    invoke-virtual {p1}, Lh0/s0;->i()V

    .line 655
    .line 656
    .line 657
    invoke-virtual {p1}, Lh0/s0;->p()V

    .line 658
    .line 659
    .line 660
    goto/16 :goto_4

    .line 661
    .line 662
    :pswitch_15
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 663
    .line 664
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 665
    .line 666
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 667
    .line 668
    iget-object v1, v0, Li2/g;->h:Ljava/lang/String;

    .line 669
    .line 670
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 671
    .line 672
    .line 673
    move-result v1

    .line 674
    if-lez v1, :cond_1b

    .line 675
    .line 676
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 677
    .line 678
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 679
    .line 680
    .line 681
    move-result v0

    .line 682
    invoke-virtual {p1, v6, v0}, Lh0/s0;->q(II)V

    .line 683
    .line 684
    .line 685
    goto/16 :goto_4

    .line 686
    .line 687
    :pswitch_16
    new-instance v0, Lr9/p;

    .line 688
    .line 689
    const/16 v2, 0x19

    .line 690
    .line 691
    invoke-direct {v0, v2}, Lr9/p;-><init>(I)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {p1, v0}, Lh0/s0;->a(Lfg/l;)Ljava/util/List;

    .line 695
    .line 696
    .line 697
    move-result-object p1

    .line 698
    if-eqz p1, :cond_1b

    .line 699
    .line 700
    invoke-virtual {v1, p1}, Lw/b1;->a(Ljava/util/List;)V

    .line 701
    .line 702
    .line 703
    goto/16 :goto_4

    .line 704
    .line 705
    :pswitch_17
    new-instance v0, Lr9/p;

    .line 706
    .line 707
    const/16 v2, 0x18

    .line 708
    .line 709
    invoke-direct {v0, v2}, Lr9/p;-><init>(I)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {p1, v0}, Lh0/s0;->a(Lfg/l;)Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object p1

    .line 716
    if-eqz p1, :cond_1b

    .line 717
    .line 718
    invoke-virtual {v1, p1}, Lw/b1;->a(Ljava/util/List;)V

    .line 719
    .line 720
    .line 721
    goto/16 :goto_4

    .line 722
    .line 723
    :pswitch_18
    new-instance v0, Lr9/p;

    .line 724
    .line 725
    const/16 v2, 0x17

    .line 726
    .line 727
    invoke-direct {v0, v2}, Lr9/p;-><init>(I)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {p1, v0}, Lh0/s0;->a(Lfg/l;)Ljava/util/List;

    .line 731
    .line 732
    .line 733
    move-result-object p1

    .line 734
    if-eqz p1, :cond_1b

    .line 735
    .line 736
    invoke-virtual {v1, p1}, Lw/b1;->a(Ljava/util/List;)V

    .line 737
    .line 738
    .line 739
    goto/16 :goto_4

    .line 740
    .line 741
    :pswitch_19
    new-instance v0, Lr9/p;

    .line 742
    .line 743
    const/16 v2, 0x16

    .line 744
    .line 745
    invoke-direct {v0, v2}, Lr9/p;-><init>(I)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {p1, v0}, Lh0/s0;->a(Lfg/l;)Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object p1

    .line 752
    if-eqz p1, :cond_1b

    .line 753
    .line 754
    invoke-virtual {v1, p1}, Lw/b1;->a(Ljava/util/List;)V

    .line 755
    .line 756
    .line 757
    goto/16 :goto_4

    .line 758
    .line 759
    :pswitch_1a
    new-instance v0, Lr9/p;

    .line 760
    .line 761
    const/16 v2, 0x15

    .line 762
    .line 763
    invoke-direct {v0, v2}, Lr9/p;-><init>(I)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {p1, v0}, Lh0/s0;->a(Lfg/l;)Ljava/util/List;

    .line 767
    .line 768
    .line 769
    move-result-object p1

    .line 770
    if-eqz p1, :cond_1b

    .line 771
    .line 772
    invoke-virtual {v1, p1}, Lw/b1;->a(Ljava/util/List;)V

    .line 773
    .line 774
    .line 775
    goto/16 :goto_4

    .line 776
    .line 777
    :pswitch_1b
    new-instance v0, Lr9/p;

    .line 778
    .line 779
    const/16 v2, 0x14

    .line 780
    .line 781
    invoke-direct {v0, v2}, Lr9/p;-><init>(I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {p1, v0}, Lh0/s0;->a(Lfg/l;)Ljava/util/List;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    if-eqz p1, :cond_1b

    .line 789
    .line 790
    invoke-virtual {v1, p1}, Lw/b1;->a(Ljava/util/List;)V

    .line 791
    .line 792
    .line 793
    goto/16 :goto_4

    .line 794
    .line 795
    :pswitch_1c
    iget-object p1, v1, Lw/b1;->b:Lh0/d1;

    .line 796
    .line 797
    invoke-virtual {p1}, Lh0/d1;->f()V

    .line 798
    .line 799
    .line 800
    goto/16 :goto_4

    .line 801
    .line 802
    :pswitch_1d
    iget-object p1, v1, Lw/b1;->b:Lh0/d1;

    .line 803
    .line 804
    invoke-virtual {p1}, Lh0/d1;->p()V

    .line 805
    .line 806
    .line 807
    goto/16 :goto_4

    .line 808
    .line 809
    :pswitch_1e
    iget-object p1, v1, Lw/b1;->b:Lh0/d1;

    .line 810
    .line 811
    invoke-virtual {p1, v6}, Lh0/d1;->d(Z)Lqg/e1;

    .line 812
    .line 813
    .line 814
    goto/16 :goto_4

    .line 815
    .line 816
    :pswitch_1f
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 817
    .line 818
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 819
    .line 820
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 821
    .line 822
    iget-object v1, v0, Li2/g;->h:Ljava/lang/String;

    .line 823
    .line 824
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 825
    .line 826
    .line 827
    move-result v1

    .line 828
    if-lez v1, :cond_1b

    .line 829
    .line 830
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 831
    .line 832
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 833
    .line 834
    .line 835
    move-result v0

    .line 836
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 837
    .line 838
    .line 839
    goto/16 :goto_4

    .line 840
    .line 841
    :pswitch_20
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 842
    .line 843
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 844
    .line 845
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 846
    .line 847
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 848
    .line 849
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 850
    .line 851
    .line 852
    move-result v0

    .line 853
    if-lez v0, :cond_1b

    .line 854
    .line 855
    invoke-virtual {p1, v6, v6}, Lh0/s0;->q(II)V

    .line 856
    .line 857
    .line 858
    goto/16 :goto_4

    .line 859
    .line 860
    :pswitch_21
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 861
    .line 862
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 863
    .line 864
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    if-lez v0, :cond_1b

    .line 869
    .line 870
    iget-object v0, p1, Lh0/s0;->i:Lw/m1;

    .line 871
    .line 872
    if-eqz v0, :cond_1b

    .line 873
    .line 874
    invoke-virtual {p1, v0, v5}, Lh0/s0;->h(Lw/m1;I)I

    .line 875
    .line 876
    .line 877
    move-result v0

    .line 878
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 879
    .line 880
    .line 881
    goto/16 :goto_4

    .line 882
    .line 883
    :pswitch_22
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 884
    .line 885
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 886
    .line 887
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    if-lez v0, :cond_1b

    .line 892
    .line 893
    iget-object v0, p1, Lh0/s0;->i:Lw/m1;

    .line 894
    .line 895
    if-eqz v0, :cond_1b

    .line 896
    .line 897
    invoke-virtual {p1, v0, v4}, Lh0/s0;->h(Lw/m1;I)I

    .line 898
    .line 899
    .line 900
    move-result v0

    .line 901
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 902
    .line 903
    .line 904
    goto/16 :goto_4

    .line 905
    .line 906
    :pswitch_23
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 907
    .line 908
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 909
    .line 910
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 911
    .line 912
    .line 913
    move-result v0

    .line 914
    if-lez v0, :cond_1b

    .line 915
    .line 916
    iget-object v0, p1, Lh0/s0;->c:Li2/k0;

    .line 917
    .line 918
    if-eqz v0, :cond_1b

    .line 919
    .line 920
    invoke-virtual {p1, v0, v5}, Lh0/s0;->g(Li2/k0;I)I

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 925
    .line 926
    .line 927
    goto/16 :goto_4

    .line 928
    .line 929
    :pswitch_24
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 930
    .line 931
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 932
    .line 933
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    if-lez v0, :cond_1b

    .line 938
    .line 939
    iget-object v0, p1, Lh0/s0;->c:Li2/k0;

    .line 940
    .line 941
    if-eqz v0, :cond_1b

    .line 942
    .line 943
    invoke-virtual {p1, v0, v4}, Lh0/s0;->g(Li2/k0;I)I

    .line 944
    .line 945
    .line 946
    move-result v0

    .line 947
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 948
    .line 949
    .line 950
    goto/16 :goto_4

    .line 951
    .line 952
    :pswitch_25
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 953
    .line 954
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 955
    .line 956
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 957
    .line 958
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 959
    .line 960
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 961
    .line 962
    .line 963
    move-result v0

    .line 964
    if-lez v0, :cond_1b

    .line 965
    .line 966
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 967
    .line 968
    .line 969
    move-result v0

    .line 970
    if-eqz v0, :cond_13

    .line 971
    .line 972
    invoke-virtual {p1}, Lh0/s0;->n()V

    .line 973
    .line 974
    .line 975
    goto/16 :goto_4

    .line 976
    .line 977
    :cond_13
    invoke-virtual {p1}, Lh0/s0;->o()V

    .line 978
    .line 979
    .line 980
    goto/16 :goto_4

    .line 981
    .line 982
    :pswitch_26
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 983
    .line 984
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 985
    .line 986
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 987
    .line 988
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 989
    .line 990
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    if-lez v0, :cond_1b

    .line 995
    .line 996
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 997
    .line 998
    .line 999
    move-result v0

    .line 1000
    if-eqz v0, :cond_14

    .line 1001
    .line 1002
    invoke-virtual {p1}, Lh0/s0;->o()V

    .line 1003
    .line 1004
    .line 1005
    goto/16 :goto_4

    .line 1006
    .line 1007
    :cond_14
    invoke-virtual {p1}, Lh0/s0;->n()V

    .line 1008
    .line 1009
    .line 1010
    goto/16 :goto_4

    .line 1011
    .line 1012
    :pswitch_27
    invoke-virtual {p1}, Lh0/s0;->n()V

    .line 1013
    .line 1014
    .line 1015
    goto/16 :goto_4

    .line 1016
    .line 1017
    :pswitch_28
    invoke-virtual {p1}, Lh0/s0;->o()V

    .line 1018
    .line 1019
    .line 1020
    goto/16 :goto_4

    .line 1021
    .line 1022
    :pswitch_29
    invoke-virtual {p1}, Lh0/s0;->l()V

    .line 1023
    .line 1024
    .line 1025
    goto/16 :goto_4

    .line 1026
    .line 1027
    :pswitch_2a
    invoke-virtual {p1}, Lh0/s0;->j()V

    .line 1028
    .line 1029
    .line 1030
    goto/16 :goto_4

    .line 1031
    .line 1032
    :pswitch_2b
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 1033
    .line 1034
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 1035
    .line 1036
    iget-object v1, p1, Lh0/s0;->g:Li2/g;

    .line 1037
    .line 1038
    iget-object v2, v1, Li2/g;->h:Ljava/lang/String;

    .line 1039
    .line 1040
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 1041
    .line 1042
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    if-lez v2, :cond_1b

    .line 1047
    .line 1048
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v2

    .line 1052
    if-eqz v2, :cond_15

    .line 1053
    .line 1054
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 1055
    .line 1056
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1057
    .line 1058
    .line 1059
    move-result v0

    .line 1060
    if-lez v0, :cond_1b

    .line 1061
    .line 1062
    invoke-virtual {p1}, Lh0/s0;->e()Ljava/lang/Integer;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    if-eqz v0, :cond_1b

    .line 1067
    .line 1068
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1069
    .line 1070
    .line 1071
    move-result v0

    .line 1072
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 1073
    .line 1074
    .line 1075
    goto/16 :goto_4

    .line 1076
    .line 1077
    :cond_15
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 1078
    .line 1079
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1080
    .line 1081
    .line 1082
    move-result v0

    .line 1083
    if-lez v0, :cond_1b

    .line 1084
    .line 1085
    invoke-virtual {p1}, Lh0/s0;->d()Ljava/lang/Integer;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    if-eqz v0, :cond_1b

    .line 1090
    .line 1091
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1092
    .line 1093
    .line 1094
    move-result v0

    .line 1095
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 1096
    .line 1097
    .line 1098
    goto/16 :goto_4

    .line 1099
    .line 1100
    :pswitch_2c
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 1101
    .line 1102
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 1103
    .line 1104
    iget-object v1, p1, Lh0/s0;->g:Li2/g;

    .line 1105
    .line 1106
    iget-object v2, v1, Li2/g;->h:Ljava/lang/String;

    .line 1107
    .line 1108
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 1109
    .line 1110
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1111
    .line 1112
    .line 1113
    move-result v2

    .line 1114
    if-lez v2, :cond_1b

    .line 1115
    .line 1116
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 1117
    .line 1118
    .line 1119
    move-result v2

    .line 1120
    if-eqz v2, :cond_16

    .line 1121
    .line 1122
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 1123
    .line 1124
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1125
    .line 1126
    .line 1127
    move-result v0

    .line 1128
    if-lez v0, :cond_1b

    .line 1129
    .line 1130
    invoke-virtual {p1}, Lh0/s0;->d()Ljava/lang/Integer;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    if-eqz v0, :cond_1b

    .line 1135
    .line 1136
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1137
    .line 1138
    .line 1139
    move-result v0

    .line 1140
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 1141
    .line 1142
    .line 1143
    goto/16 :goto_4

    .line 1144
    .line 1145
    :cond_16
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 1146
    .line 1147
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1148
    .line 1149
    .line 1150
    move-result v0

    .line 1151
    if-lez v0, :cond_1b

    .line 1152
    .line 1153
    invoke-virtual {p1}, Lh0/s0;->e()Ljava/lang/Integer;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    if-eqz v0, :cond_1b

    .line 1158
    .line 1159
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1160
    .line 1161
    .line 1162
    move-result v0

    .line 1163
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 1164
    .line 1165
    .line 1166
    goto :goto_4

    .line 1167
    :pswitch_2d
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 1168
    .line 1169
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 1170
    .line 1171
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 1172
    .line 1173
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 1174
    .line 1175
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1176
    .line 1177
    .line 1178
    move-result v0

    .line 1179
    if-lez v0, :cond_1b

    .line 1180
    .line 1181
    iget-wide v0, p1, Lh0/s0;->f:J

    .line 1182
    .line 1183
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v0

    .line 1187
    if-eqz v0, :cond_17

    .line 1188
    .line 1189
    invoke-virtual {p1}, Lh0/s0;->m()V

    .line 1190
    .line 1191
    .line 1192
    goto :goto_4

    .line 1193
    :cond_17
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 1194
    .line 1195
    .line 1196
    move-result v0

    .line 1197
    iget-wide v1, p1, Lh0/s0;->f:J

    .line 1198
    .line 1199
    if-eqz v0, :cond_18

    .line 1200
    .line 1201
    invoke-static {v1, v2}, Li2/m0;->e(J)I

    .line 1202
    .line 1203
    .line 1204
    move-result v0

    .line 1205
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 1206
    .line 1207
    .line 1208
    goto :goto_4

    .line 1209
    :cond_18
    invoke-static {v1, v2}, Li2/m0;->f(J)I

    .line 1210
    .line 1211
    .line 1212
    move-result v0

    .line 1213
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 1214
    .line 1215
    .line 1216
    goto :goto_4

    .line 1217
    :pswitch_2e
    iget-object v0, p1, Lh0/s0;->e:Lh0/j1;

    .line 1218
    .line 1219
    iput-object v7, v0, Lh0/j1;->a:Ljava/lang/Float;

    .line 1220
    .line 1221
    iget-object v0, p1, Lh0/s0;->g:Li2/g;

    .line 1222
    .line 1223
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 1224
    .line 1225
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1226
    .line 1227
    .line 1228
    move-result v0

    .line 1229
    if-lez v0, :cond_1b

    .line 1230
    .line 1231
    iget-wide v0, p1, Lh0/s0;->f:J

    .line 1232
    .line 1233
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 1234
    .line 1235
    .line 1236
    move-result v0

    .line 1237
    if-eqz v0, :cond_19

    .line 1238
    .line 1239
    invoke-virtual {p1}, Lh0/s0;->i()V

    .line 1240
    .line 1241
    .line 1242
    goto :goto_4

    .line 1243
    :cond_19
    invoke-virtual {p1}, Lh0/s0;->f()Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    iget-wide v1, p1, Lh0/s0;->f:J

    .line 1248
    .line 1249
    if-eqz v0, :cond_1a

    .line 1250
    .line 1251
    invoke-static {v1, v2}, Li2/m0;->f(J)I

    .line 1252
    .line 1253
    .line 1254
    move-result v0

    .line 1255
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 1256
    .line 1257
    .line 1258
    goto :goto_4

    .line 1259
    :cond_1a
    invoke-static {v1, v2}, Li2/m0;->e(J)I

    .line 1260
    .line 1261
    .line 1262
    move-result v0

    .line 1263
    invoke-virtual {p1, v0, v0}, Lh0/s0;->q(II)V

    .line 1264
    .line 1265
    .line 1266
    :cond_1b
    :goto_4
    :pswitch_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1267
    .line 1268
    return-object p1

    .line 1269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_2f
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
        :pswitch_2f
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lb0/s;->g:I

    .line 4
    .line 5
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 6
    .line 7
    const-string v4, "</_wc_custom_link_>"

    .line 8
    .line 9
    const-string v5, "\">"

    .line 10
    .line 11
    const-string v6, "\" href=\""

    .line 12
    .line 13
    const-string v7, "<_wc_custom_link_ color=\""

    .line 14
    .line 15
    const-string v8, "weixin://weixinhongbao/hchat/group_leave_profile/"

    .line 16
    .line 17
    const-string v10, "#576B95"

    .line 18
    .line 19
    const-string v13, ""

    .line 20
    .line 21
    const/4 v11, 0x3

    .line 22
    const/16 v17, 0x20

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    sget-object v19, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    const/4 v9, 0x1

    .line 28
    iget-object v15, v1, Lb0/s;->i:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v14, v1, Lb0/s;->j:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v12, v1, Lb0/s;->h:Ljava/lang/Object;

    .line 33
    .line 34
    packed-switch v0, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    check-cast v12, Leb/c0;

    .line 38
    .line 39
    check-cast v14, Li0/a1;

    .line 40
    .line 41
    move-object/from16 v25, v15

    .line 42
    .line 43
    check-cast v25, Landroid/content/Context;

    .line 44
    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    check-cast v0, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v27

    .line 53
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object/from16 v28, v2

    .line 58
    .line 59
    check-cast v28, Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/util/Map;

    .line 66
    .line 67
    iget-object v3, v12, Leb/c0;->a:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_0

    .line 77
    .line 78
    invoke-static {v3, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    invoke-direct {v4, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v3, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-object v0, v4

    .line 95
    :goto_0
    invoke-interface {v14, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, Ljava/lang/Thread;

    .line 99
    .line 100
    new-instance v24, Lia/l;

    .line 101
    .line 102
    const/16 v30, 0x3

    .line 103
    .line 104
    move-object/from16 v26, v12

    .line 105
    .line 106
    move-object/from16 v29, v14

    .line 107
    .line 108
    invoke-direct/range {v24 .. v30}, Lia/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    move-object/from16 v2, v24

    .line 112
    .line 113
    const-string v4, "Hchat-Script-"

    .line 114
    .line 115
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-direct {v0, v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 123
    .line 124
    .line 125
    return-object v19

    .line 126
    :pswitch_0
    check-cast v12, Lwb/cp;

    .line 127
    .line 128
    check-cast v15, Li0/a1;

    .line 129
    .line 130
    check-cast v14, Lfg/l;

    .line 131
    .line 132
    move-object/from16 v0, p1

    .line 133
    .line 134
    check-cast v0, Lr/h;

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    sget-object v2, Lwb/p0;->i6:Ls0/d;

    .line 140
    .line 141
    invoke-static {v0, v3, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 142
    .line 143
    .line 144
    new-instance v2, Lc9/h0;

    .line 145
    .line 146
    const/16 v4, 0x11

    .line 147
    .line 148
    invoke-direct {v2, v12, v15, v14, v4}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 149
    .line 150
    .line 151
    new-instance v4, Ls0/d;

    .line 152
    .line 153
    const v5, 0x7fa2e3f2

    .line 154
    .line 155
    .line 156
    invoke-direct {v4, v5, v2, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v3, v4, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 160
    .line 161
    .line 162
    return-object v19

    .line 163
    :pswitch_1
    check-cast v12, Lwb/d4;

    .line 164
    .line 165
    check-cast v15, Landroid/content/Context;

    .line 166
    .line 167
    check-cast v14, Li0/a1;

    .line 168
    .line 169
    move-object/from16 v0, p1

    .line 170
    .line 171
    check-cast v0, Ljava/util/List;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-object v2, v12, Lwb/d4;->c:Lfg/l;

    .line 177
    .line 178
    invoke-static {v0}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-interface {v2, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    const-string v2, "\u5df2\u9009\u62e9 "

    .line 190
    .line 191
    const-string v4, " \u4e2a\u7fa4\u6210\u5458"

    .line 192
    .line 193
    const/4 v5, 0x0

    .line 194
    invoke-static {v2, v0, v4, v15, v5}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v14, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    return-object v19

    .line 201
    :pswitch_2
    check-cast v12, Ljava/util/List;

    .line 202
    .line 203
    check-cast v15, Ljava/util/List;

    .line 204
    .line 205
    check-cast v14, Lfg/l;

    .line 206
    .line 207
    move-object/from16 v0, p1

    .line 208
    .line 209
    check-cast v0, Lr/h;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    sget-object v2, Lwb/p0;->w5:Ls0/d;

    .line 215
    .line 216
    invoke-static {v0, v3, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 217
    .line 218
    .line 219
    new-instance v2, Lc9/h0;

    .line 220
    .line 221
    const/16 v4, 0xf

    .line 222
    .line 223
    invoke-direct {v2, v12, v15, v14, v4}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 224
    .line 225
    .line 226
    new-instance v4, Ls0/d;

    .line 227
    .line 228
    const v5, 0x654b518e    # 6.000905E22f

    .line 229
    .line 230
    .line 231
    invoke-direct {v4, v5, v2, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 232
    .line 233
    .line 234
    invoke-static {v0, v3, v4, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 235
    .line 236
    .line 237
    return-object v19

    .line 238
    :pswitch_3
    check-cast v12, Lfg/a;

    .line 239
    .line 240
    check-cast v15, Li0/a1;

    .line 241
    .line 242
    check-cast v14, Li0/a1;

    .line 243
    .line 244
    move-object/from16 v0, p1

    .line 245
    .line 246
    check-cast v0, Lr/h;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    sget-object v2, Lwb/p0;->i2:Ls0/d;

    .line 252
    .line 253
    invoke-static {v0, v3, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 254
    .line 255
    .line 256
    new-instance v2, Lwb/t1;

    .line 257
    .line 258
    const/16 v4, 0xc

    .line 259
    .line 260
    invoke-direct {v2, v4, v15, v14}, Lwb/t1;-><init>(ILi0/a1;Li0/a1;)V

    .line 261
    .line 262
    .line 263
    new-instance v4, Ls0/d;

    .line 264
    .line 265
    const v5, 0x69d4e396

    .line 266
    .line 267
    .line 268
    invoke-direct {v4, v5, v2, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 269
    .line 270
    .line 271
    invoke-static {v0, v3, v4, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 272
    .line 273
    .line 274
    if-eqz v12, :cond_1

    .line 275
    .line 276
    sget-object v2, Lwb/p0;->j2:Ls0/d;

    .line 277
    .line 278
    invoke-static {v0, v3, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 279
    .line 280
    .line 281
    new-instance v2, Lwb/x6;

    .line 282
    .line 283
    const/16 v4, 0x15

    .line 284
    .line 285
    invoke-direct {v2, v12, v4}, Lwb/x6;-><init>(Lfg/a;I)V

    .line 286
    .line 287
    .line 288
    new-instance v4, Ls0/d;

    .line 289
    .line 290
    const v5, -0x4ca18a4f

    .line 291
    .line 292
    .line 293
    invoke-direct {v4, v5, v2, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v3, v4, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 297
    .line 298
    .line 299
    :cond_1
    return-object v19

    .line 300
    :pswitch_4
    invoke-direct/range {p0 .. p1}, Lb0/s;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    return-object v0

    .line 305
    :pswitch_5
    check-cast v12, Lb/e;

    .line 306
    .line 307
    check-cast v15, Lfg/l;

    .line 308
    .line 309
    check-cast v14, Lgg/u;

    .line 310
    .line 311
    move-object/from16 v0, p1

    .line 312
    .line 313
    check-cast v0, Ljava/util/List;

    .line 314
    .line 315
    iget-object v2, v14, Lgg/u;->g:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v2, Ln2/y;

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Lb/e;->l(Ljava/util/List;)Ln2/s;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-eqz v2, :cond_2

    .line 324
    .line 325
    invoke-virtual {v2, v3, v0}, Ln2/y;->a(Ln2/s;Ln2/s;)V

    .line 326
    .line 327
    .line 328
    :cond_2
    invoke-interface {v15, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    return-object v19

    .line 332
    :pswitch_6
    check-cast v12, Lgg/q;

    .line 333
    .line 334
    check-cast v15, Li2/e;

    .line 335
    .line 336
    check-cast v14, Li2/f0;

    .line 337
    .line 338
    move-object/from16 v0, p1

    .line 339
    .line 340
    check-cast v0, Li2/e;

    .line 341
    .line 342
    iget-boolean v2, v12, Lgg/q;->g:Z

    .line 343
    .line 344
    if-eqz v2, :cond_4

    .line 345
    .line 346
    iget-object v2, v0, Li2/e;->a:Ljava/lang/Object;

    .line 347
    .line 348
    iget v3, v0, Li2/e;->c:I

    .line 349
    .line 350
    iget v4, v0, Li2/e;->b:I

    .line 351
    .line 352
    instance-of v2, v2, Li2/f0;

    .line 353
    .line 354
    if-eqz v2, :cond_4

    .line 355
    .line 356
    iget v2, v15, Li2/e;->b:I

    .line 357
    .line 358
    if-ne v4, v2, :cond_4

    .line 359
    .line 360
    iget v2, v15, Li2/e;->c:I

    .line 361
    .line 362
    if-ne v3, v2, :cond_4

    .line 363
    .line 364
    new-instance v2, Li2/e;

    .line 365
    .line 366
    if-nez v14, :cond_3

    .line 367
    .line 368
    new-instance v16, Li2/f0;

    .line 369
    .line 370
    const/16 v34, 0x0

    .line 371
    .line 372
    const v35, 0xffff

    .line 373
    .line 374
    .line 375
    const-wide/16 v17, 0x0

    .line 376
    .line 377
    const-wide/16 v19, 0x0

    .line 378
    .line 379
    const/16 v21, 0x0

    .line 380
    .line 381
    const/16 v22, 0x0

    .line 382
    .line 383
    const/16 v23, 0x0

    .line 384
    .line 385
    const/16 v24, 0x0

    .line 386
    .line 387
    const/16 v25, 0x0

    .line 388
    .line 389
    const-wide/16 v26, 0x0

    .line 390
    .line 391
    const/16 v28, 0x0

    .line 392
    .line 393
    const/16 v29, 0x0

    .line 394
    .line 395
    const/16 v30, 0x0

    .line 396
    .line 397
    const-wide/16 v31, 0x0

    .line 398
    .line 399
    const/16 v33, 0x0

    .line 400
    .line 401
    invoke-direct/range {v16 .. v35}, Li2/f0;-><init>(JJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;I)V

    .line 402
    .line 403
    .line 404
    move-object/from16 v14, v16

    .line 405
    .line 406
    :cond_3
    invoke-direct {v2, v4, v3, v14}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    goto :goto_1

    .line 410
    :cond_4
    move-object v2, v0

    .line 411
    :goto_1
    invoke-virtual {v15, v0}, Li2/e;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    iput-boolean v0, v12, Lgg/q;->g:Z

    .line 416
    .line 417
    return-object v2

    .line 418
    :pswitch_7
    check-cast v12, Lw/q0;

    .line 419
    .line 420
    check-cast v15, Ln2/s;

    .line 421
    .line 422
    check-cast v14, Lb5/k;

    .line 423
    .line 424
    move-object/from16 v0, p1

    .line 425
    .line 426
    check-cast v0, Lh1/d;

    .line 427
    .line 428
    invoke-virtual {v12}, Lw/q0;->d()Lw/m1;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    if-eqz v2, :cond_14

    .line 433
    .line 434
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    iget-object v0, v12, Lw/q0;->A:Li0/j1;

    .line 443
    .line 444
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    check-cast v0, Li2/m0;

    .line 449
    .line 450
    iget-wide v5, v0, Li2/m0;->a:J

    .line 451
    .line 452
    iget-object v0, v12, Lw/q0;->B:Li0/j1;

    .line 453
    .line 454
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    check-cast v0, Li2/m0;

    .line 459
    .line 460
    iget-wide v7, v0, Li2/m0;->a:J

    .line 461
    .line 462
    iget-object v0, v2, Lw/m1;->a:Li2/k0;

    .line 463
    .line 464
    iget-object v2, v0, Li2/k0;->b:Li2/o;

    .line 465
    .line 466
    iget-object v10, v0, Li2/k0;->a:Li2/j0;

    .line 467
    .line 468
    iget-object v13, v12, Lw/q0;->y:Lf1/h;

    .line 469
    .line 470
    iget-wide v11, v12, Lw/q0;->z:J

    .line 471
    .line 472
    invoke-static {v5, v6}, Li2/m0;->c(J)Z

    .line 473
    .line 474
    .line 475
    move-result v18

    .line 476
    if-nez v18, :cond_5

    .line 477
    .line 478
    invoke-virtual {v13, v11, v12}, Lf1/h;->w(J)V

    .line 479
    .line 480
    .line 481
    invoke-static {v5, v6}, Li2/m0;->f(J)I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    invoke-virtual {v14, v3}, Lb5/k;->l(I)I

    .line 486
    .line 487
    .line 488
    invoke-static {v5, v6}, Li2/m0;->e(J)I

    .line 489
    .line 490
    .line 491
    move-result v5

    .line 492
    invoke-virtual {v14, v5}, Lb5/k;->l(I)I

    .line 493
    .line 494
    .line 495
    if-eq v3, v5, :cond_9

    .line 496
    .line 497
    invoke-virtual {v0, v3, v5}, Li2/k0;->i(II)Lf1/j;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    invoke-interface {v4, v3, v13}, Lf1/u;->j(Lf1/j;Lf1/h;)V

    .line 502
    .line 503
    .line 504
    goto :goto_4

    .line 505
    :cond_5
    invoke-static {v7, v8}, Li2/m0;->c(J)Z

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    if-nez v5, :cond_8

    .line 510
    .line 511
    iget-object v5, v10, Li2/j0;->b:Li2/n0;

    .line 512
    .line 513
    invoke-virtual {v5}, Li2/n0;->a()J

    .line 514
    .line 515
    .line 516
    move-result-wide v5

    .line 517
    new-instance v11, Lf1/w;

    .line 518
    .line 519
    invoke-direct {v11, v5, v6}, Lf1/w;-><init>(J)V

    .line 520
    .line 521
    .line 522
    const-wide/16 v20, 0x10

    .line 523
    .line 524
    cmp-long v5, v5, v20

    .line 525
    .line 526
    if-nez v5, :cond_6

    .line 527
    .line 528
    goto :goto_2

    .line 529
    :cond_6
    move-object v3, v11

    .line 530
    :goto_2
    if-eqz v3, :cond_7

    .line 531
    .line 532
    iget-wide v5, v3, Lf1/w;->a:J

    .line 533
    .line 534
    goto :goto_3

    .line 535
    :cond_7
    sget-wide v5, Lf1/w;->b:J

    .line 536
    .line 537
    :goto_3
    invoke-static {v5, v6}, Lf1/w;->d(J)F

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    const v11, 0x3e4ccccd    # 0.2f

    .line 542
    .line 543
    .line 544
    mul-float/2addr v3, v11

    .line 545
    invoke-static {v5, v6, v3}, Lf1/w;->b(JF)J

    .line 546
    .line 547
    .line 548
    move-result-wide v5

    .line 549
    invoke-virtual {v13, v5, v6}, Lf1/h;->w(J)V

    .line 550
    .line 551
    .line 552
    invoke-static {v7, v8}, Li2/m0;->f(J)I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    invoke-virtual {v14, v3}, Lb5/k;->l(I)I

    .line 557
    .line 558
    .line 559
    invoke-static {v7, v8}, Li2/m0;->e(J)I

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    invoke-virtual {v14, v5}, Lb5/k;->l(I)I

    .line 564
    .line 565
    .line 566
    if-eq v3, v5, :cond_9

    .line 567
    .line 568
    invoke-virtual {v0, v3, v5}, Li2/k0;->i(II)Lf1/j;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    invoke-interface {v4, v3, v13}, Lf1/u;->j(Lf1/j;Lf1/h;)V

    .line 573
    .line 574
    .line 575
    goto :goto_4

    .line 576
    :cond_8
    iget-wide v5, v15, Ln2/s;->b:J

    .line 577
    .line 578
    invoke-static {v5, v6}, Li2/m0;->c(J)Z

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    if-nez v3, :cond_9

    .line 583
    .line 584
    invoke-virtual {v13, v11, v12}, Lf1/h;->w(J)V

    .line 585
    .line 586
    .line 587
    iget-wide v5, v15, Ln2/s;->b:J

    .line 588
    .line 589
    invoke-static {v5, v6}, Li2/m0;->f(J)I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    invoke-virtual {v14, v3}, Lb5/k;->l(I)I

    .line 594
    .line 595
    .line 596
    invoke-static {v5, v6}, Li2/m0;->e(J)I

    .line 597
    .line 598
    .line 599
    move-result v5

    .line 600
    invoke-virtual {v14, v5}, Lb5/k;->l(I)I

    .line 601
    .line 602
    .line 603
    if-eq v3, v5, :cond_9

    .line 604
    .line 605
    invoke-virtual {v0, v3, v5}, Li2/k0;->i(II)Lf1/j;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    invoke-interface {v4, v3, v13}, Lf1/u;->j(Lf1/j;Lf1/h;)V

    .line 610
    .line 611
    .line 612
    :cond_9
    :goto_4
    invoke-virtual {v0}, Li2/k0;->d()Z

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    if-eqz v3, :cond_b

    .line 617
    .line 618
    iget v3, v10, Li2/j0;->f:I

    .line 619
    .line 620
    const/4 v5, 0x3

    .line 621
    if-ne v3, v5, :cond_a

    .line 622
    .line 623
    goto :goto_5

    .line 624
    :cond_a
    move v12, v9

    .line 625
    goto :goto_6

    .line 626
    :cond_b
    :goto_5
    const/4 v12, 0x0

    .line 627
    :goto_6
    if-eqz v12, :cond_c

    .line 628
    .line 629
    iget-wide v5, v0, Li2/k0;->c:J

    .line 630
    .line 631
    shr-long v7, v5, v17

    .line 632
    .line 633
    long-to-int v0, v7

    .line 634
    int-to-float v0, v0

    .line 635
    const-wide v7, 0xffffffffL

    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    and-long/2addr v5, v7

    .line 641
    long-to-int v3, v5

    .line 642
    int-to-float v3, v3

    .line 643
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    int-to-long v5, v0

    .line 648
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    int-to-long v13, v0

    .line 653
    shl-long v5, v5, v17

    .line 654
    .line 655
    and-long/2addr v7, v13

    .line 656
    or-long/2addr v5, v7

    .line 657
    const-wide/16 v7, 0x0

    .line 658
    .line 659
    invoke-static {v7, v8, v5, v6}, Lac/p;->a(JJ)Le1/c;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-interface {v4}, Lf1/u;->e()V

    .line 664
    .line 665
    .line 666
    invoke-static {v4, v0}, Lf1/u;->k(Lf1/u;Le1/c;)V

    .line 667
    .line 668
    .line 669
    :cond_c
    iget-object v0, v10, Li2/j0;->b:Li2/n0;

    .line 670
    .line 671
    iget-object v0, v0, Li2/n0;->a:Li2/f0;

    .line 672
    .line 673
    iget-object v3, v0, Li2/f0;->m:Lt2/l;

    .line 674
    .line 675
    iget-object v5, v0, Li2/f0;->a:Lt2/o;

    .line 676
    .line 677
    if-nez v3, :cond_d

    .line 678
    .line 679
    sget-object v3, Lt2/l;->b:Lt2/l;

    .line 680
    .line 681
    :cond_d
    move-object/from16 v29, v3

    .line 682
    .line 683
    iget-object v3, v0, Li2/f0;->n:Lf1/q0;

    .line 684
    .line 685
    if-nez v3, :cond_e

    .line 686
    .line 687
    sget-object v3, Lf1/q0;->d:Lf1/q0;

    .line 688
    .line 689
    :cond_e
    move-object/from16 v28, v3

    .line 690
    .line 691
    iget-object v0, v0, Li2/f0;->o:Lh1/c;

    .line 692
    .line 693
    if-nez v0, :cond_f

    .line 694
    .line 695
    sget-object v0, Lh1/f;->b:Lh1/f;

    .line 696
    .line 697
    :cond_f
    move-object/from16 v30, v0

    .line 698
    .line 699
    :try_start_0
    invoke-interface {v5}, Lt2/o;->c()Lf1/s;

    .line 700
    .line 701
    .line 702
    move-result-object v26
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 703
    sget-object v0, Lt2/n;->a:Lt2/n;

    .line 704
    .line 705
    if-eqz v26, :cond_11

    .line 706
    .line 707
    if-eq v5, v0, :cond_10

    .line 708
    .line 709
    :try_start_1
    invoke-interface {v5}, Lt2/o;->a()F

    .line 710
    .line 711
    .line 712
    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 713
    move/from16 v27, v11

    .line 714
    .line 715
    :goto_7
    move-object/from16 v24, v2

    .line 716
    .line 717
    move-object/from16 v25, v4

    .line 718
    .line 719
    goto :goto_8

    .line 720
    :catchall_0
    move-exception v0

    .line 721
    move-object/from16 v25, v4

    .line 722
    .line 723
    goto :goto_c

    .line 724
    :cond_10
    const/high16 v27, 0x3f800000    # 1.0f

    .line 725
    .line 726
    goto :goto_7

    .line 727
    :goto_8
    :try_start_2
    invoke-static/range {v24 .. v30}, Li2/o;->j(Li2/o;Lf1/u;Lf1/s;FLf1/q0;Lt2/l;Lh1/c;)V

    .line 728
    .line 729
    .line 730
    goto :goto_b

    .line 731
    :catchall_1
    move-exception v0

    .line 732
    goto :goto_c

    .line 733
    :cond_11
    move-object/from16 v24, v2

    .line 734
    .line 735
    move-object/from16 v25, v4

    .line 736
    .line 737
    if-eq v5, v0, :cond_12

    .line 738
    .line 739
    invoke-interface {v5}, Lt2/o;->b()J

    .line 740
    .line 741
    .line 742
    move-result-wide v2

    .line 743
    :goto_9
    move-wide/from16 v26, v2

    .line 744
    .line 745
    goto :goto_a

    .line 746
    :cond_12
    sget-wide v2, Lf1/w;->b:J

    .line 747
    .line 748
    goto :goto_9

    .line 749
    :goto_a
    invoke-static/range {v24 .. v30}, Li2/o;->i(Li2/o;Lf1/u;JLf1/q0;Lt2/l;Lh1/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 750
    .line 751
    .line 752
    :goto_b
    if-eqz v12, :cond_14

    .line 753
    .line 754
    invoke-interface/range {v25 .. v25}, Lf1/u;->p()V

    .line 755
    .line 756
    .line 757
    goto :goto_d

    .line 758
    :goto_c
    if-eqz v12, :cond_13

    .line 759
    .line 760
    invoke-interface/range {v25 .. v25}, Lf1/u;->p()V

    .line 761
    .line 762
    .line 763
    :cond_13
    throw v0

    .line 764
    :cond_14
    :goto_d
    return-object v19

    .line 765
    :pswitch_8
    check-cast v12, Ljava/util/Map;

    .line 766
    .line 767
    check-cast v15, Ljava/lang/String;

    .line 768
    .line 769
    check-cast v14, Lv8/h;

    .line 770
    .line 771
    move-object/from16 v2, p1

    .line 772
    .line 773
    check-cast v2, Lv8/a;

    .line 774
    .line 775
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    iget-object v0, v2, Lv8/a;->a:Ljava/lang/String;

    .line 779
    .line 780
    invoke-interface {v12, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    move-result v0

    .line 784
    if-eqz v0, :cond_15

    .line 785
    .line 786
    iget-object v0, v2, Lv8/a;->g:Ljava/util/Set;

    .line 787
    .line 788
    invoke-interface {v0, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    move-result v0

    .line 792
    if-eqz v0, :cond_15

    .line 793
    .line 794
    iget-object v3, v14, Lv8/h;->b:Ljava/lang/String;

    .line 795
    .line 796
    iget-object v4, v14, Lv8/h;->g:Ljava/lang/String;

    .line 797
    .line 798
    iget v5, v14, Lv8/h;->h:I

    .line 799
    .line 800
    iget-object v6, v14, Lv8/h;->i:Ljava/lang/String;

    .line 801
    .line 802
    iget-boolean v7, v14, Lv8/h;->j:Z

    .line 803
    .line 804
    iget-object v8, v14, Lv8/h;->k:Ljava/lang/String;

    .line 805
    .line 806
    invoke-static/range {v2 .. v8}, Lv8/q;->n(Lv8/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)Z

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    if-eqz v0, :cond_15

    .line 811
    .line 812
    move v12, v9

    .line 813
    goto :goto_e

    .line 814
    :cond_15
    const/4 v12, 0x0

    .line 815
    :goto_e
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    return-object v0

    .line 820
    :pswitch_9
    check-cast v12, Lv0/d;

    .line 821
    .line 822
    check-cast v14, Lv0/i;

    .line 823
    .line 824
    move-object/from16 v0, p1

    .line 825
    .line 826
    check-cast v0, Li0/a0;

    .line 827
    .line 828
    iget-object v0, v12, Lv0/d;->h:Lf/k0;

    .line 829
    .line 830
    invoke-virtual {v0, v15}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    move-result v2

    .line 834
    if-nez v2, :cond_16

    .line 835
    .line 836
    iget-object v2, v12, Lv0/d;->g:Ljava/util/Map;

    .line 837
    .line 838
    invoke-interface {v2, v15}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v0, v15, v14}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    new-instance v3, Lh/f;

    .line 845
    .line 846
    invoke-direct {v3, v12, v15, v14, v9}, Lh/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 847
    .line 848
    .line 849
    goto :goto_f

    .line 850
    :cond_16
    const-string v0, "Key "

    .line 851
    .line 852
    const-string v2, " was used multiple times "

    .line 853
    .line 854
    invoke-static {v15, v0, v2}, Lokio/a;->h(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    :goto_f
    return-object v3

    .line 858
    :pswitch_a
    check-cast v12, Lgg/r;

    .line 859
    .line 860
    check-cast v15, Lsh/e2;

    .line 861
    .line 862
    check-cast v14, Lgg/r;

    .line 863
    .line 864
    move-object/from16 v0, p1

    .line 865
    .line 866
    check-cast v0, Li/j;

    .line 867
    .line 868
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    iget-object v2, v0, Li/j;->e:Li0/j1;

    .line 872
    .line 873
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    check-cast v3, Ljava/lang/Number;

    .line 878
    .line 879
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 880
    .line 881
    .line 882
    move-result v3

    .line 883
    iget v4, v12, Lgg/r;->g:F

    .line 884
    .line 885
    sub-float/2addr v3, v4

    .line 886
    iget-object v4, v15, Lsh/e2;->c:Li0/f1;

    .line 887
    .line 888
    invoke-virtual {v4}, Li0/f1;->g()F

    .line 889
    .line 890
    .line 891
    move-result v4

    .line 892
    add-float v5, v4, v3

    .line 893
    .line 894
    invoke-virtual {v15, v5}, Lsh/e2;->b(F)V

    .line 895
    .line 896
    .line 897
    iget-object v5, v15, Lsh/e2;->c:Li0/f1;

    .line 898
    .line 899
    invoke-virtual {v5}, Li0/f1;->g()F

    .line 900
    .line 901
    .line 902
    move-result v5

    .line 903
    sub-float/2addr v4, v5

    .line 904
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 905
    .line 906
    .line 907
    move-result v4

    .line 908
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    check-cast v2, Ljava/lang/Number;

    .line 913
    .line 914
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 915
    .line 916
    .line 917
    move-result v2

    .line 918
    iput v2, v12, Lgg/r;->g:F

    .line 919
    .line 920
    iget-object v2, v0, Li/j;->a:Li/m1;

    .line 921
    .line 922
    iget-object v2, v2, Li/m1;->b:Lfg/l;

    .line 923
    .line 924
    iget-object v5, v0, Li/j;->f:Li/q;

    .line 925
    .line 926
    invoke-interface {v2, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    check-cast v2, Ljava/lang/Number;

    .line 931
    .line 932
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 933
    .line 934
    .line 935
    move-result v2

    .line 936
    iput v2, v14, Lgg/r;->g:F

    .line 937
    .line 938
    sub-float/2addr v3, v4

    .line 939
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 940
    .line 941
    .line 942
    move-result v2

    .line 943
    const/high16 v3, 0x3f000000    # 0.5f

    .line 944
    .line 945
    cmpl-float v2, v2, v3

    .line 946
    .line 947
    if-lez v2, :cond_17

    .line 948
    .line 949
    invoke-virtual {v0}, Li/j;->a()V

    .line 950
    .line 951
    .line 952
    :cond_17
    return-object v19

    .line 953
    :pswitch_b
    check-cast v12, Ls3/e;

    .line 954
    .line 955
    check-cast v15, Ls3/a;

    .line 956
    .line 957
    check-cast v14, Lr3/a;

    .line 958
    .line 959
    move-object/from16 v0, p1

    .line 960
    .line 961
    check-cast v0, Li0/a0;

    .line 962
    .line 963
    iget-object v0, v12, Ls3/e;->e:Ls3/a;

    .line 964
    .line 965
    if-nez v0, :cond_1b

    .line 966
    .line 967
    iput-object v15, v12, Ls3/e;->e:Ls3/a;

    .line 968
    .line 969
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 970
    .line 971
    .line 972
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    iget-boolean v0, v14, Lr3/a;->a:Z

    .line 976
    .line 977
    if-nez v0, :cond_1a

    .line 978
    .line 979
    iget-object v0, v14, Lr3/a;->d:Ljava/util/LinkedHashSet;

    .line 980
    .line 981
    invoke-interface {v0, v15}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    move-result v0

    .line 985
    if-eqz v0, :cond_19

    .line 986
    .line 987
    iget-object v0, v14, Lr3/a;->b:Lr3/d;

    .line 988
    .line 989
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    iget-object v2, v15, Ls3/a;->f:Lr3/a;

    .line 993
    .line 994
    if-nez v2, :cond_18

    .line 995
    .line 996
    iget-object v2, v0, Lr3/d;->c:Ltf/k;

    .line 997
    .line 998
    invoke-virtual {v2, v15}, Ltf/k;->addFirst(Ljava/lang/Object;)V

    .line 999
    .line 1000
    .line 1001
    iput-object v14, v15, Ls3/a;->f:Lr3/a;

    .line 1002
    .line 1003
    invoke-virtual {v0}, Lr3/d;->a()V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_10

    .line 1007
    :cond_18
    const-string v0, "Handler \'"

    .line 1008
    .line 1009
    const-string v2, "\' is already registered with a dispatcher"

    .line 1010
    .line 1011
    invoke-static {v15, v0, v2}, Lokio/a;->h(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    goto :goto_11

    .line 1015
    :cond_19
    :goto_10
    new-instance v3, Lci/w;

    .line 1016
    .line 1017
    const/4 v0, 0x7

    .line 1018
    invoke-direct {v3, v15, v0, v12}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1019
    .line 1020
    .line 1021
    goto :goto_11

    .line 1022
    :cond_1a
    const-string v0, "This NavigationEventDispatcher has already been disposed and cannot be used."

    .line 1023
    .line 1024
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    :goto_11
    return-object v3

    .line 1028
    :cond_1b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    const-string v2, "NavigationEventState \'"

    .line 1031
    .line 1032
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1036
    .line 1037
    .line 1038
    const-string v2, "\' is already registered with a NavigationEventHandler \'"

    .line 1039
    .line 1040
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1044
    .line 1045
    .line 1046
    const-string v2, "\'."

    .line 1047
    .line 1048
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 1056
    .line 1057
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1062
    .line 1063
    .line 1064
    throw v2

    .line 1065
    :pswitch_c
    move-object v6, v12

    .line 1066
    check-cast v6, Lqb/k;

    .line 1067
    .line 1068
    move-object v8, v15

    .line 1069
    check-cast v8, Landroid/app/Activity;

    .line 1070
    .line 1071
    move-object v7, v14

    .line 1072
    check-cast v7, Lqb/i;

    .line 1073
    .line 1074
    move-object/from16 v4, p1

    .line 1075
    .line 1076
    check-cast v4, Ljava/util/List;

    .line 1077
    .line 1078
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1082
    .line 1083
    .line 1084
    move-result v0

    .line 1085
    if-eqz v0, :cond_1c

    .line 1086
    .line 1087
    goto :goto_12

    .line 1088
    :cond_1c
    new-instance v5, Landroid/os/Handler;

    .line 1089
    .line 1090
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v0

    .line 1094
    invoke-direct {v5, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1095
    .line 1096
    .line 1097
    iget-object v0, v6, Lqb/k;->q:Ljava/util/concurrent/ExecutorService;

    .line 1098
    .line 1099
    new-instance v3, Lca/x;

    .line 1100
    .line 1101
    const/16 v9, 0xb

    .line 1102
    .line 1103
    invoke-direct/range {v3 .. v9}, Lca/x;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/app/Activity;I)V

    .line 1104
    .line 1105
    .line 1106
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1107
    .line 1108
    .line 1109
    :goto_12
    return-object v19

    .line 1110
    :pswitch_d
    check-cast v12, Lgg/q;

    .line 1111
    .line 1112
    check-cast v15, Lgg/q;

    .line 1113
    .line 1114
    check-cast v14, Lgg/q;

    .line 1115
    .line 1116
    move-object/from16 v0, p1

    .line 1117
    .line 1118
    check-cast v0, Ljava/lang/String;

    .line 1119
    .line 1120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1121
    .line 1122
    .line 1123
    invoke-static {v0}, Lqa/f;->r(Ljava/lang/String;)Lqa/b;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    const/4 v2, -0x1

    .line 1128
    if-nez v0, :cond_1d

    .line 1129
    .line 1130
    move v0, v2

    .line 1131
    goto :goto_13

    .line 1132
    :cond_1d
    sget-object v4, Lqa/d;->a:[I

    .line 1133
    .line 1134
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1135
    .line 1136
    .line 1137
    move-result v0

    .line 1138
    aget v0, v4, v0

    .line 1139
    .line 1140
    :goto_13
    if-eq v0, v2, :cond_21

    .line 1141
    .line 1142
    if-eq v0, v9, :cond_20

    .line 1143
    .line 1144
    const/4 v2, 0x2

    .line 1145
    if-eq v0, v2, :cond_1f

    .line 1146
    .line 1147
    const/4 v5, 0x3

    .line 1148
    if-ne v0, v5, :cond_1e

    .line 1149
    .line 1150
    iput-boolean v9, v14, Lgg/q;->g:Z

    .line 1151
    .line 1152
    goto :goto_14

    .line 1153
    :cond_1e
    invoke-static {}, Lokio/a;->k()V

    .line 1154
    .line 1155
    .line 1156
    goto :goto_15

    .line 1157
    :cond_1f
    iput-boolean v9, v15, Lgg/q;->g:Z

    .line 1158
    .line 1159
    goto :goto_14

    .line 1160
    :cond_20
    iput-boolean v9, v12, Lgg/q;->g:Z

    .line 1161
    .line 1162
    :cond_21
    :goto_14
    move-object/from16 v3, v19

    .line 1163
    .line 1164
    :goto_15
    return-object v3

    .line 1165
    :pswitch_e
    check-cast v12, Lhb/r;

    .line 1166
    .line 1167
    check-cast v15, Lq9/f;

    .line 1168
    .line 1169
    move-object/from16 v0, p1

    .line 1170
    .line 1171
    check-cast v0, Log/f;

    .line 1172
    .line 1173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1174
    .line 1175
    .line 1176
    check-cast v0, Log/i;

    .line 1177
    .line 1178
    invoke-virtual {v0}, Log/i;->c()Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v2

    .line 1182
    const-string v9, "%userWxid%"

    .line 1183
    .line 1184
    invoke-virtual {v2, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v2

    .line 1188
    if-eqz v2, :cond_24

    .line 1189
    .line 1190
    iget-object v0, v15, Lq9/f;->a:Ljava/lang/String;

    .line 1191
    .line 1192
    iget-object v2, v12, Lhb/r;->c:Ljava/lang/Object;

    .line 1193
    .line 1194
    check-cast v2, Landroid/content/SharedPreferences;

    .line 1195
    .line 1196
    const-string v9, "group_rename_wxid_color"

    .line 1197
    .line 1198
    invoke-interface {v2, v9, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v2

    .line 1202
    if-eqz v2, :cond_22

    .line 1203
    .line 1204
    const/16 v9, 0x2c

    .line 1205
    .line 1206
    invoke-static {v2, v9}, Log/m;->M0(Ljava/lang/String;C)Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v3

    .line 1210
    :cond_22
    invoke-static {v3}, La7/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v2

    .line 1214
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1215
    .line 1216
    .line 1217
    move-result v3

    .line 1218
    if-nez v3, :cond_23

    .line 1219
    .line 1220
    goto :goto_16

    .line 1221
    :cond_23
    move-object v10, v2

    .line 1222
    :goto_16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1223
    .line 1224
    .line 1225
    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v2

    .line 1229
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v2

    .line 1241
    invoke-static {v2}, Lhb/r;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v2

    .line 1245
    invoke-static {v0}, Lhb/r;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    invoke-static {v7, v10, v6, v2, v5}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v2

    .line 1253
    invoke-static {v2, v0, v4}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v0

    .line 1257
    goto :goto_18

    .line 1258
    :cond_24
    invoke-virtual {v0}, Log/i;->c()Ljava/lang/String;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v0

    .line 1262
    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    check-cast v0, Ljava/lang/String;

    .line 1267
    .line 1268
    if-nez v0, :cond_25

    .line 1269
    .line 1270
    goto :goto_17

    .line 1271
    :cond_25
    move-object v13, v0

    .line 1272
    :goto_17
    invoke-static {v13}, Lhb/r;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v0

    .line 1276
    :goto_18
    return-object v0

    .line 1277
    :pswitch_f
    check-cast v12, Ljava/util/ArrayList;

    .line 1278
    .line 1279
    check-cast v15, Lo9/p;

    .line 1280
    .line 1281
    check-cast v14, Ljava/lang/String;

    .line 1282
    .line 1283
    move-object/from16 v0, p1

    .line 1284
    .line 1285
    check-cast v0, Log/f;

    .line 1286
    .line 1287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1288
    .line 1289
    .line 1290
    check-cast v0, Log/i;

    .line 1291
    .line 1292
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v0

    .line 1296
    invoke-static {v9, v0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v0

    .line 1300
    check-cast v0, Ljava/lang/String;

    .line 1301
    .line 1302
    if-eqz v0, :cond_26

    .line 1303
    .line 1304
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    goto :goto_19

    .line 1313
    :cond_26
    move-object v0, v3

    .line 1314
    :goto_19
    if-nez v0, :cond_27

    .line 1315
    .line 1316
    move-object v0, v13

    .line 1317
    :cond_27
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1318
    .line 1319
    .line 1320
    move-result v2

    .line 1321
    if-eqz v2, :cond_28

    .line 1322
    .line 1323
    goto/16 :goto_20

    .line 1324
    .line 1325
    :cond_28
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    const-string v2, "notify@all"

    .line 1332
    .line 1333
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1334
    .line 1335
    .line 1336
    move-result v2

    .line 1337
    if-eqz v2, :cond_29

    .line 1338
    .line 1339
    const-string v0, "\u6240\u6709\u4eba"

    .line 1340
    .line 1341
    goto :goto_1f

    .line 1342
    :cond_29
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v2

    .line 1346
    if-eqz v2, :cond_2a

    .line 1347
    .line 1348
    invoke-virtual {v2, v0}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v4

    .line 1352
    goto :goto_1a

    .line 1353
    :cond_2a
    move-object v4, v3

    .line 1354
    :goto_1a
    if-eqz v2, :cond_2b

    .line 1355
    .line 1356
    invoke-virtual {v2, v14, v0}, Lg8/i;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v2

    .line 1360
    goto :goto_1b

    .line 1361
    :cond_2b
    move-object v2, v3

    .line 1362
    :goto_1b
    if-eqz v4, :cond_2c

    .line 1363
    .line 1364
    iget-object v5, v4, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 1365
    .line 1366
    goto :goto_1c

    .line 1367
    :cond_2c
    move-object v5, v3

    .line 1368
    :goto_1c
    if-eqz v4, :cond_2d

    .line 1369
    .line 1370
    iget-object v3, v4, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 1371
    .line 1372
    :cond_2d
    filled-new-array {v2, v5, v3, v0}, [Ljava/lang/String;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v2

    .line 1376
    const/4 v12, 0x0

    .line 1377
    :goto_1d
    const/4 v3, 0x4

    .line 1378
    if-lt v12, v3, :cond_2e

    .line 1379
    .line 1380
    goto :goto_1e

    .line 1381
    :cond_2e
    aget-object v3, v2, v12

    .line 1382
    .line 1383
    if-eqz v3, :cond_2f

    .line 1384
    .line 1385
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1386
    .line 1387
    .line 1388
    move-result v4

    .line 1389
    if-eqz v4, :cond_30

    .line 1390
    .line 1391
    :cond_2f
    move/from16 v9, v17

    .line 1392
    .line 1393
    goto :goto_21

    .line 1394
    :cond_30
    move-object v13, v3

    .line 1395
    :goto_1e
    const/16 v2, 0xa

    .line 1396
    .line 1397
    move/from16 v9, v17

    .line 1398
    .line 1399
    invoke-virtual {v13, v2, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v2

    .line 1403
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1404
    .line 1405
    .line 1406
    const/16 v3, 0xd

    .line 1407
    .line 1408
    invoke-virtual {v2, v3, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v2

    .line 1412
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1413
    .line 1414
    .line 1415
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v2

    .line 1419
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v2

    .line 1423
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1424
    .line 1425
    .line 1426
    move-result v3

    .line 1427
    if-eqz v3, :cond_31

    .line 1428
    .line 1429
    goto :goto_1f

    .line 1430
    :cond_31
    move-object v0, v2

    .line 1431
    :goto_1f
    const-string v2, "@"

    .line 1432
    .line 1433
    const-string v3, "\u2005"

    .line 1434
    .line 1435
    invoke-static {v2, v0, v3}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v13

    .line 1439
    :goto_20
    return-object v13

    .line 1440
    :goto_21
    add-int/lit8 v12, v12, 0x1

    .line 1441
    .line 1442
    move/from16 v17, v9

    .line 1443
    .line 1444
    goto :goto_1d

    .line 1445
    :pswitch_10
    check-cast v12, Ljava/util/Map;

    .line 1446
    .line 1447
    check-cast v15, Lo9/p;

    .line 1448
    .line 1449
    move-object/from16 v0, p1

    .line 1450
    .line 1451
    check-cast v0, Log/f;

    .line 1452
    .line 1453
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1454
    .line 1455
    .line 1456
    check-cast v0, Log/i;

    .line 1457
    .line 1458
    invoke-virtual {v0}, Log/i;->c()Ljava/lang/String;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v0

    .line 1462
    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v2

    .line 1466
    check-cast v2, Ljava/lang/String;

    .line 1467
    .line 1468
    if-eqz v2, :cond_34

    .line 1469
    .line 1470
    iget-object v0, v15, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 1471
    .line 1472
    const-string v9, "group_leave_monitor_wxid_color"

    .line 1473
    .line 1474
    invoke-interface {v0, v9, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v0

    .line 1478
    if-eqz v0, :cond_32

    .line 1479
    .line 1480
    const/16 v9, 0x2c

    .line 1481
    .line 1482
    invoke-static {v0, v9}, Log/m;->M0(Ljava/lang/String;C)Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v3

    .line 1486
    :cond_32
    invoke-static {v3}, La7/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1491
    .line 1492
    .line 1493
    move-result v3

    .line 1494
    if-nez v3, :cond_33

    .line 1495
    .line 1496
    goto :goto_22

    .line 1497
    :cond_33
    move-object v10, v0

    .line 1498
    :goto_22
    invoke-static {v2}, Lo9/p;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v2

    .line 1506
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1507
    .line 1508
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1512
    .line 1513
    .line 1514
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v2

    .line 1518
    invoke-static {v2}, Lo9/p;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v2

    .line 1522
    invoke-static {v7, v10, v6, v2, v5}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v2

    .line 1526
    invoke-static {v2, v0, v4}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v0

    .line 1530
    goto :goto_24

    .line 1531
    :cond_34
    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v0

    .line 1535
    check-cast v0, Ljava/lang/String;

    .line 1536
    .line 1537
    if-nez v0, :cond_35

    .line 1538
    .line 1539
    goto :goto_23

    .line 1540
    :cond_35
    move-object v13, v0

    .line 1541
    :goto_23
    invoke-static {v13}, Lo9/p;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v0

    .line 1545
    :goto_24
    return-object v0

    .line 1546
    :pswitch_11
    check-cast v12, Lm9/e;

    .line 1547
    .line 1548
    check-cast v15, Lm9/c;

    .line 1549
    .line 1550
    check-cast v14, Lm9/d;

    .line 1551
    .line 1552
    move-object/from16 v0, p1

    .line 1553
    .line 1554
    check-cast v0, Ljava/lang/Integer;

    .line 1555
    .line 1556
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1557
    .line 1558
    .line 1559
    move-result v0

    .line 1560
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1561
    .line 1562
    .line 1563
    sget-object v2, Lm9/c;->i:Lm9/c;

    .line 1564
    .line 1565
    if-ne v15, v2, :cond_36

    .line 1566
    .line 1567
    sget-object v2, Lm9/e;->j:Ljava/util/List;

    .line 1568
    .line 1569
    goto :goto_25

    .line 1570
    :cond_36
    sget-object v2, Lm9/e;->i:Ljava/util/List;

    .line 1571
    .line 1572
    :goto_25
    invoke-static {v0, v2}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v0

    .line 1576
    check-cast v0, Lm9/b;

    .line 1577
    .line 1578
    if-eqz v0, :cond_37

    .line 1579
    .line 1580
    invoke-virtual {v12, v14, v0}, Lm9/e;->c(Lm9/d;Lm9/b;)V

    .line 1581
    .line 1582
    .line 1583
    :cond_37
    return-object v19

    .line 1584
    :pswitch_12
    check-cast v12, Lm/k;

    .line 1585
    .line 1586
    check-cast v15, Lqg/r0;

    .line 1587
    .line 1588
    check-cast v14, Lm/m2;

    .line 1589
    .line 1590
    move-object/from16 v0, p1

    .line 1591
    .line 1592
    check-cast v0, Ljava/lang/Float;

    .line 1593
    .line 1594
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 1595
    .line 1596
    .line 1597
    move-result v0

    .line 1598
    iget-boolean v2, v12, Lm/k;->w:Z

    .line 1599
    .line 1600
    if-eqz v2, :cond_38

    .line 1601
    .line 1602
    const/high16 v11, 0x3f800000    # 1.0f

    .line 1603
    .line 1604
    goto :goto_26

    .line 1605
    :cond_38
    const/high16 v11, -0x40800000    # -1.0f

    .line 1606
    .line 1607
    :goto_26
    mul-float v2, v11, v0

    .line 1608
    .line 1609
    iget-object v4, v12, Lm/k;->v:Lm/o2;

    .line 1610
    .line 1611
    invoke-virtual {v4, v2}, Lm/o2;->h(F)J

    .line 1612
    .line 1613
    .line 1614
    move-result-wide v5

    .line 1615
    invoke-virtual {v4, v5, v6}, Lm/o2;->e(J)J

    .line 1616
    .line 1617
    .line 1618
    move-result-wide v5

    .line 1619
    iget-object v2, v14, Lm/m2;->a:Lm/o2;

    .line 1620
    .line 1621
    iget-object v7, v2, Lm/o2;->k:Lm/u1;

    .line 1622
    .line 1623
    invoke-virtual {v2, v7, v5, v6, v9}, Lm/o2;->c(Lm/u1;JI)J

    .line 1624
    .line 1625
    .line 1626
    move-result-wide v5

    .line 1627
    invoke-virtual {v4, v5, v6}, Lm/o2;->e(J)J

    .line 1628
    .line 1629
    .line 1630
    move-result-wide v5

    .line 1631
    invoke-virtual {v4, v5, v6}, Lm/o2;->g(J)F

    .line 1632
    .line 1633
    .line 1634
    move-result v2

    .line 1635
    mul-float/2addr v2, v11

    .line 1636
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 1637
    .line 1638
    .line 1639
    move-result v4

    .line 1640
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 1641
    .line 1642
    .line 1643
    move-result v5

    .line 1644
    cmpg-float v4, v4, v5

    .line 1645
    .line 1646
    if-gez v4, :cond_39

    .line 1647
    .line 1648
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1649
    .line 1650
    const-string v5, "Scroll animation cancelled because scroll was not consumed ("

    .line 1651
    .line 1652
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 1656
    .line 1657
    .line 1658
    const-string v2, " < "

    .line 1659
    .line 1660
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 1664
    .line 1665
    .line 1666
    const/16 v0, 0x29

    .line 1667
    .line 1668
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1669
    .line 1670
    .line 1671
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v0

    .line 1675
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 1676
    .line 1677
    invoke-direct {v2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1681
    .line 1682
    .line 1683
    invoke-interface {v15, v2}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 1684
    .line 1685
    .line 1686
    :cond_39
    return-object v19

    .line 1687
    :pswitch_13
    check-cast v15, Landroid/content/Context;

    .line 1688
    .line 1689
    check-cast v12, Ljava/lang/ClassLoader;

    .line 1690
    .line 1691
    check-cast v14, Ljava/lang/String;

    .line 1692
    .line 1693
    move-object/from16 v0, p1

    .line 1694
    .line 1695
    check-cast v0, Ljava/lang/String;

    .line 1696
    .line 1697
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1698
    .line 1699
    .line 1700
    sget-object v2, Lj8/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1701
    .line 1702
    const-string v2, "Hchat_fav_preview"

    .line 1703
    .line 1704
    invoke-static {v15, v12, v0, v2, v14}, Lj8/d;->j(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v0

    .line 1708
    return-object v0

    .line 1709
    :pswitch_14
    check-cast v12, Lh0/d1;

    .line 1710
    .line 1711
    check-cast v14, Lqg/t;

    .line 1712
    .line 1713
    check-cast v15, Landroid/content/Context;

    .line 1714
    .line 1715
    move-object/from16 v0, p1

    .line 1716
    .line 1717
    check-cast v0, Ly/a;

    .line 1718
    .line 1719
    iget-object v2, v0, Ly/a;->a:Lf/f0;

    .line 1720
    .line 1721
    iget-object v0, v0, Ly/a;->a:Lf/f0;

    .line 1722
    .line 1723
    sget-object v4, Lz/f;->b:Lz/f;

    .line 1724
    .line 1725
    invoke-virtual {v2, v4}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 1726
    .line 1727
    .line 1728
    sget-object v2, Lw/w0;->h:[Lw/w0;

    .line 1729
    .line 1730
    invoke-virtual {v12}, Lh0/d1;->n()Ln2/s;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v2

    .line 1734
    iget-wide v5, v2, Ln2/s;->b:J

    .line 1735
    .line 1736
    invoke-static {v5, v6}, Li2/m0;->c(J)Z

    .line 1737
    .line 1738
    .line 1739
    move-result v2

    .line 1740
    if-nez v2, :cond_3a

    .line 1741
    .line 1742
    invoke-virtual {v12}, Lh0/d1;->j()Z

    .line 1743
    .line 1744
    .line 1745
    move-result v2

    .line 1746
    if-eqz v2, :cond_3a

    .line 1747
    .line 1748
    iget-object v2, v12, Lh0/d1;->g:Ly1/y0;

    .line 1749
    .line 1750
    if-eqz v2, :cond_3a

    .line 1751
    .line 1752
    move v2, v9

    .line 1753
    goto :goto_27

    .line 1754
    :cond_3a
    const/4 v2, 0x0

    .line 1755
    :goto_27
    new-instance v5, Lh0/w0;

    .line 1756
    .line 1757
    invoke-direct {v5, v12, v3, v9}, Lh0/w0;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 1758
    .line 1759
    .line 1760
    new-instance v6, Laa/c;

    .line 1761
    .line 1762
    invoke-direct {v6, v14, v5}, Laa/c;-><init>(Lqg/t;Lfg/l;)V

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v5

    .line 1769
    new-instance v7, Lc9/i;

    .line 1770
    .line 1771
    const/16 v8, 0xc

    .line 1772
    .line 1773
    invoke-direct {v7, v6, v8, v3}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1774
    .line 1775
    .line 1776
    if-eqz v2, :cond_3b

    .line 1777
    .line 1778
    const v2, 0x1040003

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v2

    .line 1785
    new-instance v5, Lz/d;

    .line 1786
    .line 1787
    sget-object v6, Lz/e;->a:Ljava/lang/Object;

    .line 1788
    .line 1789
    const v8, 0x1010311

    .line 1790
    .line 1791
    .line 1792
    invoke-direct {v5, v6, v2, v8, v7}, Lz/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILfg/l;)V

    .line 1793
    .line 1794
    .line 1795
    invoke-virtual {v0, v5}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 1796
    .line 1797
    .line 1798
    :cond_3b
    sget-object v2, Lw/w0;->h:[Lw/w0;

    .line 1799
    .line 1800
    invoke-virtual {v12}, Lh0/d1;->n()Ln2/s;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v2

    .line 1804
    iget-wide v5, v2, Ln2/s;->b:J

    .line 1805
    .line 1806
    invoke-static {v5, v6}, Li2/m0;->c(J)Z

    .line 1807
    .line 1808
    .line 1809
    move-result v2

    .line 1810
    if-nez v2, :cond_3c

    .line 1811
    .line 1812
    iget-object v2, v12, Lh0/d1;->g:Ly1/y0;

    .line 1813
    .line 1814
    if-eqz v2, :cond_3c

    .line 1815
    .line 1816
    move v2, v9

    .line 1817
    goto :goto_28

    .line 1818
    :cond_3c
    const/4 v2, 0x0

    .line 1819
    :goto_28
    new-instance v5, Lh0/w0;

    .line 1820
    .line 1821
    const/4 v6, 0x2

    .line 1822
    invoke-direct {v5, v12, v3, v6}, Lh0/w0;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 1823
    .line 1824
    .line 1825
    new-instance v6, Laa/c;

    .line 1826
    .line 1827
    invoke-direct {v6, v14, v5}, Laa/c;-><init>(Lqg/t;Lfg/l;)V

    .line 1828
    .line 1829
    .line 1830
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v5

    .line 1834
    new-instance v7, Lc9/i;

    .line 1835
    .line 1836
    const/16 v8, 0xc

    .line 1837
    .line 1838
    invoke-direct {v7, v6, v8, v3}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1839
    .line 1840
    .line 1841
    if-eqz v2, :cond_3d

    .line 1842
    .line 1843
    const v2, 0x1040001

    .line 1844
    .line 1845
    .line 1846
    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v2

    .line 1850
    new-instance v5, Lz/d;

    .line 1851
    .line 1852
    sget-object v6, Lz/e;->b:Ljava/lang/Object;

    .line 1853
    .line 1854
    const v8, 0x1010312

    .line 1855
    .line 1856
    .line 1857
    invoke-direct {v5, v6, v2, v8, v7}, Lz/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILfg/l;)V

    .line 1858
    .line 1859
    .line 1860
    invoke-virtual {v0, v5}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 1861
    .line 1862
    .line 1863
    :cond_3d
    sget-object v2, Lw/w0;->h:[Lw/w0;

    .line 1864
    .line 1865
    invoke-virtual {v12}, Lh0/d1;->j()Z

    .line 1866
    .line 1867
    .line 1868
    move-result v2

    .line 1869
    if-eqz v2, :cond_3e

    .line 1870
    .line 1871
    iget-object v2, v12, Lh0/d1;->w:Li0/j1;

    .line 1872
    .line 1873
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v2

    .line 1877
    check-cast v2, Ljava/lang/Boolean;

    .line 1878
    .line 1879
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1880
    .line 1881
    .line 1882
    move-result v2

    .line 1883
    if-eqz v2, :cond_3e

    .line 1884
    .line 1885
    iget-object v2, v12, Lh0/d1;->g:Ly1/y0;

    .line 1886
    .line 1887
    if-eqz v2, :cond_3e

    .line 1888
    .line 1889
    move v2, v9

    .line 1890
    goto :goto_29

    .line 1891
    :cond_3e
    const/4 v2, 0x0

    .line 1892
    :goto_29
    new-instance v5, Lh0/w0;

    .line 1893
    .line 1894
    const/4 v6, 0x3

    .line 1895
    invoke-direct {v5, v12, v3, v6}, Lh0/w0;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 1896
    .line 1897
    .line 1898
    new-instance v6, Laa/c;

    .line 1899
    .line 1900
    invoke-direct {v6, v14, v5}, Laa/c;-><init>(Lqg/t;Lfg/l;)V

    .line 1901
    .line 1902
    .line 1903
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v5

    .line 1907
    new-instance v7, Lc9/i;

    .line 1908
    .line 1909
    const/16 v8, 0xc

    .line 1910
    .line 1911
    invoke-direct {v7, v6, v8, v3}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1912
    .line 1913
    .line 1914
    if-eqz v2, :cond_3f

    .line 1915
    .line 1916
    const v2, 0x104000b

    .line 1917
    .line 1918
    .line 1919
    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v2

    .line 1923
    new-instance v5, Lz/d;

    .line 1924
    .line 1925
    sget-object v6, Lz/e;->c:Ljava/lang/Object;

    .line 1926
    .line 1927
    const v8, 0x1010313

    .line 1928
    .line 1929
    .line 1930
    invoke-direct {v5, v6, v2, v8, v7}, Lz/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILfg/l;)V

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v0, v5}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 1934
    .line 1935
    .line 1936
    :cond_3f
    sget-object v2, Lw/w0;->h:[Lw/w0;

    .line 1937
    .line 1938
    invoke-virtual {v12}, Lh0/d1;->n()Ln2/s;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v2

    .line 1942
    iget-wide v5, v2, Ln2/s;->b:J

    .line 1943
    .line 1944
    invoke-static {v5, v6}, Li2/m0;->d(J)I

    .line 1945
    .line 1946
    .line 1947
    move-result v2

    .line 1948
    invoke-virtual {v12}, Lh0/d1;->n()Ln2/s;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v5

    .line 1952
    iget-object v5, v5, Ln2/s;->a:Li2/g;

    .line 1953
    .line 1954
    iget-object v5, v5, Li2/g;->h:Ljava/lang/String;

    .line 1955
    .line 1956
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1957
    .line 1958
    .line 1959
    move-result v5

    .line 1960
    if-eq v2, v5, :cond_40

    .line 1961
    .line 1962
    move v2, v9

    .line 1963
    goto :goto_2a

    .line 1964
    :cond_40
    const/4 v2, 0x0

    .line 1965
    :goto_2a
    new-instance v5, Lh0/i1;

    .line 1966
    .line 1967
    const/4 v6, 0x0

    .line 1968
    invoke-direct {v5, v12, v6}, Lh0/i1;-><init>(Lh0/d1;I)V

    .line 1969
    .line 1970
    .line 1971
    new-instance v6, Lh0/i1;

    .line 1972
    .line 1973
    invoke-direct {v6, v12, v9}, Lh0/i1;-><init>(Lh0/d1;I)V

    .line 1974
    .line 1975
    .line 1976
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v7

    .line 1980
    new-instance v8, Lc9/i;

    .line 1981
    .line 1982
    const/16 v10, 0xc

    .line 1983
    .line 1984
    invoke-direct {v8, v6, v10, v5}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1985
    .line 1986
    .line 1987
    if-eqz v2, :cond_41

    .line 1988
    .line 1989
    const v2, 0x104000d

    .line 1990
    .line 1991
    .line 1992
    invoke-virtual {v7, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v2

    .line 1996
    new-instance v5, Lz/d;

    .line 1997
    .line 1998
    sget-object v6, Lz/e;->d:Ljava/lang/Object;

    .line 1999
    .line 2000
    const v7, 0x101037e

    .line 2001
    .line 2002
    .line 2003
    invoke-direct {v5, v6, v2, v7, v8}, Lz/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILfg/l;)V

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v0, v5}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 2007
    .line 2008
    .line 2009
    :cond_41
    sget-object v2, Lw/w0;->h:[Lw/w0;

    .line 2010
    .line 2011
    invoke-virtual {v12}, Lh0/d1;->j()Z

    .line 2012
    .line 2013
    .line 2014
    move-result v2

    .line 2015
    if-eqz v2, :cond_42

    .line 2016
    .line 2017
    invoke-virtual {v12}, Lh0/d1;->n()Ln2/s;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v2

    .line 2021
    iget-wide v5, v2, Ln2/s;->b:J

    .line 2022
    .line 2023
    invoke-static {v5, v6}, Li2/m0;->c(J)Z

    .line 2024
    .line 2025
    .line 2026
    move-result v2

    .line 2027
    if-eqz v2, :cond_42

    .line 2028
    .line 2029
    goto :goto_2b

    .line 2030
    :cond_42
    const/4 v9, 0x0

    .line 2031
    :goto_2b
    new-instance v2, Lh0/i1;

    .line 2032
    .line 2033
    const/4 v6, 0x2

    .line 2034
    invoke-direct {v2, v12, v6}, Lh0/i1;-><init>(Lh0/d1;I)V

    .line 2035
    .line 2036
    .line 2037
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v5

    .line 2041
    new-instance v6, Lc9/i;

    .line 2042
    .line 2043
    const/16 v8, 0xc

    .line 2044
    .line 2045
    invoke-direct {v6, v2, v8, v3}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2046
    .line 2047
    .line 2048
    if-eqz v9, :cond_43

    .line 2049
    .line 2050
    const v2, 0x104001a

    .line 2051
    .line 2052
    .line 2053
    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v2

    .line 2057
    new-instance v3, Lz/d;

    .line 2058
    .line 2059
    sget-object v5, Lz/e;->e:Ljava/lang/Object;

    .line 2060
    .line 2061
    const/4 v7, 0x0

    .line 2062
    invoke-direct {v3, v5, v2, v7, v6}, Lz/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILfg/l;)V

    .line 2063
    .line 2064
    .line 2065
    invoke-virtual {v0, v3}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 2066
    .line 2067
    .line 2068
    :cond_43
    invoke-virtual {v0, v4}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 2069
    .line 2070
    .line 2071
    return-object v19

    .line 2072
    :pswitch_15
    move-object v10, v12

    .line 2073
    check-cast v10, Lh0/q0;

    .line 2074
    .line 2075
    check-cast v15, Lg1/d;

    .line 2076
    .line 2077
    move-object v0, v14

    .line 2078
    check-cast v0, Lgg/q;

    .line 2079
    .line 2080
    move-object/from16 v2, p1

    .line 2081
    .line 2082
    check-cast v2, Ls1/t;

    .line 2083
    .line 2084
    iget-wide v12, v2, Ls1/t;->c:J

    .line 2085
    .line 2086
    iget-object v3, v10, Lh0/q0;->d:Ljava/lang/Object;

    .line 2087
    .line 2088
    check-cast v3, Lh0/d1;

    .line 2089
    .line 2090
    invoke-virtual {v3}, Lh0/d1;->k()Z

    .line 2091
    .line 2092
    .line 2093
    move-result v4

    .line 2094
    if-eqz v4, :cond_46

    .line 2095
    .line 2096
    invoke-virtual {v3}, Lh0/d1;->n()Ln2/s;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v4

    .line 2100
    iget-object v4, v4, Ln2/s;->a:Li2/g;

    .line 2101
    .line 2102
    iget-object v4, v4, Li2/g;->h:Ljava/lang/String;

    .line 2103
    .line 2104
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 2105
    .line 2106
    .line 2107
    move-result v4

    .line 2108
    if-nez v4, :cond_44

    .line 2109
    .line 2110
    goto :goto_2c

    .line 2111
    :cond_44
    iget-object v4, v3, Lh0/d1;->d:Lw/q0;

    .line 2112
    .line 2113
    if-eqz v4, :cond_46

    .line 2114
    .line 2115
    invoke-virtual {v4}, Lw/q0;->d()Lw/m1;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v4

    .line 2119
    if-nez v4, :cond_45

    .line 2120
    .line 2121
    goto :goto_2c

    .line 2122
    :cond_45
    invoke-virtual {v3}, Lh0/d1;->n()Ln2/s;

    .line 2123
    .line 2124
    .line 2125
    move-result-object v11

    .line 2126
    const/4 v14, 0x0

    .line 2127
    invoke-virtual/range {v10 .. v15}, Lh0/q0;->f(Ln2/s;JZLg1/d;)J

    .line 2128
    .line 2129
    .line 2130
    move v12, v9

    .line 2131
    goto :goto_2d

    .line 2132
    :cond_46
    :goto_2c
    const/4 v12, 0x0

    .line 2133
    :goto_2d
    if-eqz v12, :cond_47

    .line 2134
    .line 2135
    invoke-virtual {v2}, Ls1/t;->a()V

    .line 2136
    .line 2137
    .line 2138
    iput-boolean v9, v0, Lgg/q;->g:Z

    .line 2139
    .line 2140
    :cond_47
    return-object v19

    .line 2141
    :pswitch_16
    check-cast v12, Ljava/lang/String;

    .line 2142
    .line 2143
    check-cast v14, Ljava/lang/String;

    .line 2144
    .line 2145
    move-object/from16 v0, p1

    .line 2146
    .line 2147
    check-cast v0, Lj8/p;

    .line 2148
    .line 2149
    invoke-static {v12, v15, v14, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lj8/p;)Z

    .line 2150
    .line 2151
    .line 2152
    move-result v0

    .line 2153
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v0

    .line 2157
    return-object v0

    .line 2158
    :pswitch_17
    check-cast v12, Ljava/util/LinkedHashMap;

    .line 2159
    .line 2160
    check-cast v15, Ljava/util/LinkedHashMap;

    .line 2161
    .line 2162
    check-cast v14, Ljava/util/LinkedHashSet;

    .line 2163
    .line 2164
    move-object/from16 v0, p1

    .line 2165
    .line 2166
    check-cast v0, Lc9/a;

    .line 2167
    .line 2168
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2169
    .line 2170
    .line 2171
    iget-object v3, v0, Lc9/a;->c:Ljava/lang/String;

    .line 2172
    .line 2173
    invoke-static {v15, v14, v3}, Lc9/o2;->p(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashSet;Ljava/lang/String;)Ljava/lang/String;

    .line 2174
    .line 2175
    .line 2176
    move-result-object v19

    .line 2177
    iget-object v3, v0, Lc9/a;->e:Ljava/util/List;

    .line 2178
    .line 2179
    iget-object v4, v0, Lc9/a;->a:Ljava/lang/String;

    .line 2180
    .line 2181
    invoke-virtual {v12, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v4

    .line 2185
    check-cast v4, Ljava/util/List;

    .line 2186
    .line 2187
    if-nez v4, :cond_48

    .line 2188
    .line 2189
    goto :goto_2e

    .line 2190
    :cond_48
    move-object v2, v4

    .line 2191
    :goto_2e
    invoke-static {v3, v2}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v2

    .line 2195
    invoke-static {v2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v2

    .line 2199
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v21

    .line 2203
    iget-object v2, v0, Lc9/a;->f:Ljava/util/List;

    .line 2204
    .line 2205
    new-instance v4, Ljava/util/ArrayList;

    .line 2206
    .line 2207
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2208
    .line 2209
    .line 2210
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v2

    .line 2214
    :cond_49
    :goto_2f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2215
    .line 2216
    .line 2217
    move-result v5

    .line 2218
    if-eqz v5, :cond_4a

    .line 2219
    .line 2220
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v5

    .line 2224
    move-object v6, v5

    .line 2225
    check-cast v6, Ljava/lang/String;

    .line 2226
    .line 2227
    invoke-interface {v3, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2228
    .line 2229
    .line 2230
    move-result v6

    .line 2231
    if-eqz v6, :cond_49

    .line 2232
    .line 2233
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2234
    .line 2235
    .line 2236
    goto :goto_2f

    .line 2237
    :cond_4a
    const/16 v27, 0x0

    .line 2238
    .line 2239
    const/16 v28, 0xfcb

    .line 2240
    .line 2241
    const/16 v17, 0x0

    .line 2242
    .line 2243
    const/16 v18, 0x0

    .line 2244
    .line 2245
    const/16 v20, 0x0

    .line 2246
    .line 2247
    const/16 v23, 0x0

    .line 2248
    .line 2249
    const/16 v24, 0x0

    .line 2250
    .line 2251
    const/16 v25, 0x0

    .line 2252
    .line 2253
    const/16 v26, 0x0

    .line 2254
    .line 2255
    move-object/from16 v16, v0

    .line 2256
    .line 2257
    move-object/from16 v22, v4

    .line 2258
    .line 2259
    invoke-static/range {v16 .. v28}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v0

    .line 2263
    return-object v0

    .line 2264
    :pswitch_18
    check-cast v12, Ljava/util/List;

    .line 2265
    .line 2266
    check-cast v15, Ljava/util/Set;

    .line 2267
    .line 2268
    check-cast v14, Lfg/l;

    .line 2269
    .line 2270
    move-object/from16 v0, p1

    .line 2271
    .line 2272
    check-cast v0, Lr/h;

    .line 2273
    .line 2274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2275
    .line 2276
    .line 2277
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v2

    .line 2281
    :goto_30
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2282
    .line 2283
    .line 2284
    move-result v3

    .line 2285
    if-eqz v3, :cond_4c

    .line 2286
    .line 2287
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v3

    .line 2291
    check-cast v3, Lc9/c1;

    .line 2292
    .line 2293
    iget-object v4, v3, Lc9/c1;->a:Ljava/lang/String;

    .line 2294
    .line 2295
    if-eqz v4, :cond_4b

    .line 2296
    .line 2297
    goto :goto_31

    .line 2298
    :cond_4b
    const-string v4, "__wechat_home__"

    .line 2299
    .line 2300
    :goto_31
    new-instance v5, Lc9/h0;

    .line 2301
    .line 2302
    invoke-direct {v5, v3, v15, v14, v9}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 2303
    .line 2304
    .line 2305
    new-instance v3, Ls0/d;

    .line 2306
    .line 2307
    const v6, 0x348ca374

    .line 2308
    .line 2309
    .line 2310
    invoke-direct {v3, v6, v5, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 2311
    .line 2312
    .line 2313
    const/4 v6, 0x2

    .line 2314
    invoke-static {v0, v4, v3, v6}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 2315
    .line 2316
    .line 2317
    goto :goto_30

    .line 2318
    :cond_4c
    return-object v19

    .line 2319
    :pswitch_19
    check-cast v12, Lfg/a;

    .line 2320
    .line 2321
    check-cast v15, Landroid/app/Activity;

    .line 2322
    .line 2323
    check-cast v14, Lfg/a;

    .line 2324
    .line 2325
    move-object/from16 v0, p1

    .line 2326
    .line 2327
    check-cast v0, Lc9/p2;

    .line 2328
    .line 2329
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2330
    .line 2331
    .line 2332
    iget-object v2, v0, Lc9/p2;->a:Ljava/lang/String;

    .line 2333
    .line 2334
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2335
    .line 2336
    .line 2337
    move-result v3

    .line 2338
    if-nez v3, :cond_4d

    .line 2339
    .line 2340
    invoke-static {v15, v2}, Lc9/j1;->p(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2341
    .line 2342
    .line 2343
    :cond_4d
    iget-boolean v0, v0, Lc9/p2;->b:Z

    .line 2344
    .line 2345
    if-eqz v0, :cond_4e

    .line 2346
    .line 2347
    invoke-static {v14}, Lc9/j1;->n(Lfg/a;)V

    .line 2348
    .line 2349
    .line 2350
    :cond_4e
    invoke-interface {v12}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2351
    .line 2352
    .line 2353
    return-object v19

    .line 2354
    :pswitch_1a
    check-cast v12, Landroid/app/Activity;

    .line 2355
    .line 2356
    check-cast v15, Ljava/util/ArrayList;

    .line 2357
    .line 2358
    check-cast v14, Lwb/jv;

    .line 2359
    .line 2360
    move-object/from16 v0, p1

    .line 2361
    .line 2362
    check-cast v0, Ljava/lang/Boolean;

    .line 2363
    .line 2364
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2365
    .line 2366
    .line 2367
    move-result v0

    .line 2368
    if-nez v0, :cond_4f

    .line 2369
    .line 2370
    goto :goto_32

    .line 2371
    :cond_4f
    sget-object v0, Lc9/b0;->a:Landroid/os/Handler;

    .line 2372
    .line 2373
    new-instance v0, Lc9/i;

    .line 2374
    .line 2375
    invoke-direct {v0, v15, v9, v14}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2376
    .line 2377
    .line 2378
    new-instance v2, Lc9/j;

    .line 2379
    .line 2380
    invoke-direct {v2, v12, v9}, Lc9/j;-><init>(Landroid/app/Activity;I)V

    .line 2381
    .line 2382
    .line 2383
    const-string v3, "\u53d1\u9001\u7fa4\u804a\u9080\u8bf7"

    .line 2384
    .line 2385
    const-string v4, "\u6b63\u5728\u63d0\u4ea4\u7fa4\u804a\u9080\u8bf7..."

    .line 2386
    .line 2387
    invoke-static {v12, v3, v4, v0, v2}, Lc9/b0;->d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/l;)V

    .line 2388
    .line 2389
    .line 2390
    :goto_32
    return-object v19

    .line 2391
    :pswitch_1b
    check-cast v12, Landroid/app/Activity;

    .line 2392
    .line 2393
    check-cast v15, Ljava/lang/String;

    .line 2394
    .line 2395
    check-cast v14, Ljava/util/ArrayList;

    .line 2396
    .line 2397
    move-object/from16 v4, p1

    .line 2398
    .line 2399
    check-cast v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2400
    .line 2401
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2402
    .line 2403
    .line 2404
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v5

    .line 2408
    sget-object v0, Lc9/b0;->a:Landroid/os/Handler;

    .line 2409
    .line 2410
    invoke-static {v12, v15}, Lc9/b0;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/util/List;

    .line 2411
    .line 2412
    .line 2413
    move-result-object v0

    .line 2414
    invoke-static {v0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v0

    .line 2418
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v6

    .line 2422
    if-eqz v6, :cond_50

    .line 2423
    .line 2424
    invoke-virtual {v6}, Lh8/a;->c()Ljava/util/ArrayList;

    .line 2425
    .line 2426
    .line 2427
    move-result-object v6

    .line 2428
    goto :goto_33

    .line 2429
    :cond_50
    move-object v6, v3

    .line 2430
    :goto_33
    if-nez v6, :cond_51

    .line 2431
    .line 2432
    goto :goto_34

    .line 2433
    :cond_51
    move-object v2, v6

    .line 2434
    :goto_34
    new-instance v6, Ljava/util/HashSet;

    .line 2435
    .line 2436
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 2437
    .line 2438
    .line 2439
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2440
    .line 2441
    .line 2442
    move-result-object v2

    .line 2443
    :goto_35
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2444
    .line 2445
    .line 2446
    move-result v7

    .line 2447
    if-eqz v7, :cond_52

    .line 2448
    .line 2449
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v7

    .line 2453
    check-cast v7, Ll8/b;

    .line 2454
    .line 2455
    iget-object v7, v7, Ll8/b;->a:Ljava/lang/String;

    .line 2456
    .line 2457
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2458
    .line 2459
    .line 2460
    goto :goto_35

    .line 2461
    :cond_52
    new-instance v2, Ljava/util/ArrayList;

    .line 2462
    .line 2463
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2464
    .line 2465
    .line 2466
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v7

    .line 2470
    :cond_53
    :goto_36
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2471
    .line 2472
    .line 2473
    move-result v8

    .line 2474
    if-eqz v8, :cond_54

    .line 2475
    .line 2476
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v8

    .line 2480
    move-object v10, v8

    .line 2481
    check-cast v10, Ljava/lang/String;

    .line 2482
    .line 2483
    invoke-interface {v0, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2484
    .line 2485
    .line 2486
    move-result v11

    .line 2487
    if-eqz v11, :cond_53

    .line 2488
    .line 2489
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 2490
    .line 2491
    .line 2492
    move-result v11

    .line 2493
    if-eqz v11, :cond_53

    .line 2494
    .line 2495
    invoke-static {v10}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 2496
    .line 2497
    .line 2498
    move-result v10

    .line 2499
    if-nez v10, :cond_53

    .line 2500
    .line 2501
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2502
    .line 2503
    .line 2504
    goto :goto_36

    .line 2505
    :cond_54
    const/16 v0, 0x32

    .line 2506
    .line 2507
    invoke-static {v0, v2}, Ltf/m;->n1(ILjava/util/List;)Ljava/util/ArrayList;

    .line 2508
    .line 2509
    .line 2510
    move-result-object v0

    .line 2511
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2512
    .line 2513
    .line 2514
    move-result-object v2

    .line 2515
    const/4 v6, 0x0

    .line 2516
    :cond_55
    :goto_37
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2517
    .line 2518
    .line 2519
    move-result v0

    .line 2520
    if-eqz v0, :cond_61

    .line 2521
    .line 2522
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v0

    .line 2526
    check-cast v0, Ljava/util/List;

    .line 2527
    .line 2528
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 2529
    .line 2530
    .line 2531
    move-result v7

    .line 2532
    if-eqz v7, :cond_56

    .line 2533
    .line 2534
    goto :goto_37

    .line 2535
    :cond_56
    if-eqz v5, :cond_60

    .line 2536
    .line 2537
    iget-object v7, v5, Lk8/s;->c:Lh/Hchat/dexkit/DexFinder;

    .line 2538
    .line 2539
    if-eqz v0, :cond_60

    .line 2540
    .line 2541
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2542
    .line 2543
    .line 2544
    move-result v8

    .line 2545
    if-eqz v8, :cond_57

    .line 2546
    .line 2547
    goto/16 :goto_3d

    .line 2548
    .line 2549
    :cond_57
    new-instance v8, Ljava/util/ArrayList;

    .line 2550
    .line 2551
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2552
    .line 2553
    .line 2554
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2555
    .line 2556
    .line 2557
    move-result-object v10

    .line 2558
    :cond_58
    :goto_38
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2559
    .line 2560
    .line 2561
    move-result v11

    .line 2562
    if-eqz v11, :cond_5a

    .line 2563
    .line 2564
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v11

    .line 2568
    check-cast v11, Ljava/lang/String;

    .line 2569
    .line 2570
    if-eqz v11, :cond_59

    .line 2571
    .line 2572
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2573
    .line 2574
    .line 2575
    move-result-object v11

    .line 2576
    goto :goto_39

    .line 2577
    :cond_59
    move-object v11, v13

    .line 2578
    :goto_39
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2579
    .line 2580
    .line 2581
    move-result v12

    .line 2582
    if-nez v12, :cond_58

    .line 2583
    .line 2584
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2585
    .line 2586
    .line 2587
    move-result v12

    .line 2588
    if-nez v12, :cond_58

    .line 2589
    .line 2590
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2591
    .line 2592
    .line 2593
    goto :goto_38

    .line 2594
    :cond_5a
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2595
    .line 2596
    .line 2597
    move-result v10

    .line 2598
    if-eqz v10, :cond_5b

    .line 2599
    .line 2600
    goto/16 :goto_3d

    .line 2601
    .line 2602
    :cond_5b
    iget-object v7, v7, Lh/Hchat/dexkit/DexFinder;->messageClearBatchMethod:Ljava/lang/reflect/Method;

    .line 2603
    .line 2604
    if-eqz v7, :cond_5f

    .line 2605
    .line 2606
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2607
    .line 2608
    .line 2609
    move-result-object v10

    .line 2610
    array-length v10, v10

    .line 2611
    const/4 v11, 0x2

    .line 2612
    if-ge v10, v11, :cond_5c

    .line 2613
    .line 2614
    goto/16 :goto_3c

    .line 2615
    .line 2616
    :cond_5c
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2617
    .line 2618
    .line 2619
    move-result-object v10

    .line 2620
    aget-object v10, v10, v9

    .line 2621
    .line 2622
    invoke-virtual {v10}, Ljava/lang/Class;->isInterface()Z

    .line 2623
    .line 2624
    .line 2625
    move-result v11

    .line 2626
    if-nez v11, :cond_5d

    .line 2627
    .line 2628
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2629
    .line 2630
    .line 2631
    move-result-object v0

    .line 2632
    const-string v7, "\u539f\u751f\u6d88\u606f\u6e05\u7406\u56de\u8c03\u7c7b\u578b\u5f02\u5e38: "

    .line 2633
    .line 2634
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2635
    .line 2636
    .line 2637
    move-result-object v0

    .line 2638
    invoke-virtual {v5, v0}, Lk8/s;->i(Ljava/lang/String;)V

    .line 2639
    .line 2640
    .line 2641
    goto :goto_3d

    .line 2642
    :cond_5d
    invoke-virtual {v10}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2643
    .line 2644
    .line 2645
    move-result-object v11

    .line 2646
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 2647
    .line 2648
    .line 2649
    move-result-object v10

    .line 2650
    new-instance v12, Lk8/r;

    .line 2651
    .line 2652
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 2653
    .line 2654
    .line 2655
    invoke-static {v11, v10, v12}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 2656
    .line 2657
    .line 2658
    move-result-object v10

    .line 2659
    :try_start_3
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2660
    .line 2661
    .line 2662
    move-result-object v11

    .line 2663
    array-length v11, v11

    .line 2664
    const/4 v12, 0x3

    .line 2665
    if-ne v11, v12, :cond_5e

    .line 2666
    .line 2667
    const-wide v11, 0x7fffffffffffffffL

    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2673
    .line 2674
    .line 2675
    move-result-object v11

    .line 2676
    filled-new-array {v8, v10, v11}, [Ljava/lang/Object;

    .line 2677
    .line 2678
    .line 2679
    move-result-object v10

    .line 2680
    invoke-static {v7, v3, v10}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2681
    .line 2682
    .line 2683
    goto :goto_3a

    .line 2684
    :catchall_2
    move-exception v0

    .line 2685
    goto :goto_3b

    .line 2686
    :cond_5e
    filled-new-array {v8, v10}, [Ljava/lang/Object;

    .line 2687
    .line 2688
    .line 2689
    move-result-object v10

    .line 2690
    invoke-static {v7, v3, v10}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 2691
    .line 2692
    .line 2693
    :goto_3a
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2694
    .line 2695
    .line 2696
    move-result v0

    .line 2697
    add-int/2addr v6, v0

    .line 2698
    goto :goto_3d

    .line 2699
    :goto_3b
    new-instance v7, Ljava/lang/StringBuilder;

    .line 2700
    .line 2701
    const-string v10, "\u539f\u751f\u6d88\u606f\u6e05\u7406\u63d0\u4ea4\u5931\u8d25: "

    .line 2702
    .line 2703
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2704
    .line 2705
    .line 2706
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v0

    .line 2710
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2711
    .line 2712
    .line 2713
    const-string v0, " count="

    .line 2714
    .line 2715
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2716
    .line 2717
    .line 2718
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 2719
    .line 2720
    .line 2721
    move-result v0

    .line 2722
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2723
    .line 2724
    .line 2725
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2726
    .line 2727
    .line 2728
    move-result-object v0

    .line 2729
    invoke-virtual {v5, v0}, Lk8/s;->i(Ljava/lang/String;)V

    .line 2730
    .line 2731
    .line 2732
    goto :goto_3d

    .line 2733
    :cond_5f
    :goto_3c
    const-string v0, "\u539f\u751f\u6d88\u606f\u6e05\u7406API\u5c1a\u672a\u5c31\u7eea"

    .line 2734
    .line 2735
    invoke-virtual {v5, v0}, Lk8/s;->i(Ljava/lang/String;)V

    .line 2736
    .line 2737
    .line 2738
    :cond_60
    :goto_3d
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 2739
    .line 2740
    .line 2741
    move-result v0

    .line 2742
    if-nez v0, :cond_55

    .line 2743
    .line 2744
    const-wide/16 v7, 0x12c

    .line 2745
    .line 2746
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    .line 2747
    .line 2748
    .line 2749
    goto/16 :goto_37

    .line 2750
    .line 2751
    :cond_61
    new-instance v0, Lc9/y;

    .line 2752
    .line 2753
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2754
    .line 2755
    .line 2756
    move-result v2

    .line 2757
    const-string v3, "\u6e05\u7406\u8bf7\u6c42\u63d0\u4ea4"

    .line 2758
    .line 2759
    const/4 v5, 0x0

    .line 2760
    invoke-direct {v0, v3, v6, v2, v5}, Lc9/y;-><init>(Ljava/lang/String;IIZ)V

    .line 2761
    .line 2762
    .line 2763
    return-object v0

    .line 2764
    :pswitch_1c
    check-cast v12, Lz/c;

    .line 2765
    .line 2766
    check-cast v15, Landroid/content/Context;

    .line 2767
    .line 2768
    check-cast v14, Lz/g;

    .line 2769
    .line 2770
    move-object/from16 v0, p1

    .line 2771
    .line 2772
    check-cast v0, Ll/e;

    .line 2773
    .line 2774
    iget-object v2, v12, Lz/c;->a:Ljava/lang/Object;

    .line 2775
    .line 2776
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 2777
    .line 2778
    .line 2779
    move-result v4

    .line 2780
    const/4 v5, 0x0

    .line 2781
    :goto_3e
    if-ge v5, v4, :cond_6d

    .line 2782
    .line 2783
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2784
    .line 2785
    .line 2786
    move-result-object v6

    .line 2787
    check-cast v6, Lz/b;

    .line 2788
    .line 2789
    instance-of v7, v6, Lz/d;

    .line 2790
    .line 2791
    const/4 v8, 0x6

    .line 2792
    if-eqz v7, :cond_64

    .line 2793
    .line 2794
    new-instance v7, Lb0/t;

    .line 2795
    .line 2796
    check-cast v6, Lz/d;

    .line 2797
    .line 2798
    const/4 v10, 0x0

    .line 2799
    invoke-direct {v7, v6, v10}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 2800
    .line 2801
    .line 2802
    iget v11, v6, Lz/d;->c:I

    .line 2803
    .line 2804
    if-nez v11, :cond_62

    .line 2805
    .line 2806
    move-object v12, v3

    .line 2807
    goto :goto_3f

    .line 2808
    :cond_62
    new-instance v11, Lb0/u;

    .line 2809
    .line 2810
    invoke-direct {v11, v6, v10}, Lb0/u;-><init>(Ljava/lang/Object;I)V

    .line 2811
    .line 2812
    .line 2813
    new-instance v12, Ls0/d;

    .line 2814
    .line 2815
    const v13, -0x731428a5

    .line 2816
    .line 2817
    .line 2818
    invoke-direct {v12, v13, v11, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 2819
    .line 2820
    .line 2821
    :goto_3f
    new-instance v11, Laa/c;

    .line 2822
    .line 2823
    const/4 v13, 0x3

    .line 2824
    invoke-direct {v11, v6, v13, v14}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2825
    .line 2826
    .line 2827
    invoke-static {v0, v7, v12, v11, v8}, Ll/e;->b(Ll/e;Lfg/p;Ls0/d;Lfg/a;I)V

    .line 2828
    .line 2829
    .line 2830
    :cond_63
    :goto_40
    const/4 v10, 0x3

    .line 2831
    const/4 v12, 0x2

    .line 2832
    const/4 v13, 0x4

    .line 2833
    goto/16 :goto_43

    .line 2834
    .line 2835
    :cond_64
    const/4 v10, 0x0

    .line 2836
    instance-of v7, v6, Lz/h;

    .line 2837
    .line 2838
    if-eqz v7, :cond_6b

    .line 2839
    .line 2840
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2841
    .line 2842
    const/16 v11, 0x1c

    .line 2843
    .line 2844
    if-lt v7, v11, :cond_63

    .line 2845
    .line 2846
    check-cast v6, Lz/h;

    .line 2847
    .line 2848
    if-nez v15, :cond_65

    .line 2849
    .line 2850
    goto :goto_40

    .line 2851
    :cond_65
    iget v7, v6, Lz/h;->c:I

    .line 2852
    .line 2853
    iget-object v6, v6, Lz/h;->b:Landroid/view/textclassifier/TextClassification;

    .line 2854
    .line 2855
    if-gez v7, :cond_67

    .line 2856
    .line 2857
    new-instance v7, Lb0/t;

    .line 2858
    .line 2859
    invoke-direct {v7, v6, v9}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 2860
    .line 2861
    .line 2862
    invoke-virtual {v6}, Landroid/view/textclassifier/TextClassification;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v11

    .line 2866
    if-eqz v11, :cond_66

    .line 2867
    .line 2868
    new-instance v12, Lb0/u;

    .line 2869
    .line 2870
    invoke-direct {v12, v11, v9}, Lb0/u;-><init>(Ljava/lang/Object;I)V

    .line 2871
    .line 2872
    .line 2873
    new-instance v11, Ls0/d;

    .line 2874
    .line 2875
    const v13, -0x42f30a7b

    .line 2876
    .line 2877
    .line 2878
    invoke-direct {v11, v13, v12, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 2879
    .line 2880
    .line 2881
    goto :goto_41

    .line 2882
    :cond_66
    move-object v11, v3

    .line 2883
    :goto_41
    new-instance v12, Laa/c;

    .line 2884
    .line 2885
    const/4 v13, 0x4

    .line 2886
    invoke-direct {v12, v15, v13, v6}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2887
    .line 2888
    .line 2889
    invoke-static {v0, v7, v11, v12, v8}, Ll/e;->b(Ll/e;Lfg/p;Ls0/d;Lfg/a;I)V

    .line 2890
    .line 2891
    .line 2892
    const/4 v10, 0x3

    .line 2893
    const/4 v12, 0x2

    .line 2894
    goto :goto_43

    .line 2895
    :cond_67
    const/4 v13, 0x4

    .line 2896
    invoke-static {v6}, Lb0/b0;->r(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 2897
    .line 2898
    .line 2899
    move-result-object v6

    .line 2900
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v6

    .line 2904
    check-cast v6, Landroid/app/RemoteAction;

    .line 2905
    .line 2906
    if-nez v7, :cond_68

    .line 2907
    .line 2908
    move v7, v9

    .line 2909
    goto :goto_42

    .line 2910
    :cond_68
    move v7, v10

    .line 2911
    :goto_42
    new-instance v11, Lb0/t;

    .line 2912
    .line 2913
    const/4 v12, 0x2

    .line 2914
    invoke-direct {v11, v6, v12}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 2915
    .line 2916
    .line 2917
    if-nez v7, :cond_69

    .line 2918
    .line 2919
    invoke-static {v6}, Lb0/b0;->v(Landroid/app/RemoteAction;)Z

    .line 2920
    .line 2921
    .line 2922
    move-result v7

    .line 2923
    if-eqz v7, :cond_6a

    .line 2924
    .line 2925
    :cond_69
    new-instance v7, Lb0/u;

    .line 2926
    .line 2927
    invoke-direct {v7, v6, v12}, Lb0/u;-><init>(Ljava/lang/Object;I)V

    .line 2928
    .line 2929
    .line 2930
    new-instance v3, Ls0/d;

    .line 2931
    .line 2932
    const v10, -0x4b2bf918

    .line 2933
    .line 2934
    .line 2935
    invoke-direct {v3, v10, v7, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 2936
    .line 2937
    .line 2938
    :cond_6a
    new-instance v7, Lab/a;

    .line 2939
    .line 2940
    const/4 v10, 0x3

    .line 2941
    invoke-direct {v7, v6, v10}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 2942
    .line 2943
    .line 2944
    invoke-static {v0, v11, v3, v7, v8}, Ll/e;->b(Ll/e;Lfg/p;Ls0/d;Lfg/a;I)V

    .line 2945
    .line 2946
    .line 2947
    goto :goto_43

    .line 2948
    :cond_6b
    const/4 v10, 0x3

    .line 2949
    const/4 v12, 0x2

    .line 2950
    const/4 v13, 0x4

    .line 2951
    instance-of v3, v6, Lz/f;

    .line 2952
    .line 2953
    if-eqz v3, :cond_6c

    .line 2954
    .line 2955
    iget-object v3, v0, Ll/e;->a:Lw0/p;

    .line 2956
    .line 2957
    sget-object v6, Ll/c;->b:Ls0/d;

    .line 2958
    .line 2959
    invoke-virtual {v3, v6}, Lw0/p;->add(Ljava/lang/Object;)Z

    .line 2960
    .line 2961
    .line 2962
    :cond_6c
    :goto_43
    add-int/lit8 v5, v5, 0x1

    .line 2963
    .line 2964
    const/4 v3, 0x0

    .line 2965
    goto/16 :goto_3e

    .line 2966
    .line 2967
    :cond_6d
    return-object v19

    .line 2968
    nop

    .line 2969
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
