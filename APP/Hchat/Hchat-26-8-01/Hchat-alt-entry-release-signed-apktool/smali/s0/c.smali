.class public final synthetic Ls0/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 22
    iput p6, p0, Ls0/c;->g:I

    iput-object p1, p0, Ls0/c;->i:Ljava/lang/Object;

    iput-object p2, p0, Ls0/c;->j:Ljava/lang/Object;

    iput-object p3, p0, Ls0/c;->k:Ljava/lang/Object;

    iput p4, p0, Ls0/c;->h:I

    iput-object p5, p0, Ls0/c;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 19
    iput p6, p0, Ls0/c;->g:I

    iput-object p1, p0, Ls0/c;->i:Ljava/lang/Object;

    iput-object p2, p0, Ls0/c;->j:Ljava/lang/Object;

    iput-object p3, p0, Ls0/c;->k:Ljava/lang/Object;

    iput-object p4, p0, Ls0/c;->l:Ljava/lang/Object;

    iput p5, p0, Ls0/c;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILy0/o;Lfg/l;I)V
    .locals 0

    .line 20
    const/4 p6, 0x7

    iput p6, p0, Ls0/c;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/c;->i:Ljava/lang/Object;

    iput-object p2, p0, Ls0/c;->j:Ljava/lang/Object;

    iput p3, p0, Ls0/c;->h:I

    iput-object p4, p0, Ls0/c;->k:Ljava/lang/Object;

    iput-object p5, p0, Ls0/c;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lp/f1;Lfg/a;Ly0/o;Ls0/d;I)V
    .locals 1

    .line 21
    const/4 v0, 0x2

    iput v0, p0, Ls0/c;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/c;->j:Ljava/lang/Object;

    iput-object p2, p0, Ls0/c;->k:Ljava/lang/Object;

    iput-object p3, p0, Ls0/c;->l:Ljava/lang/Object;

    iput-object p4, p0, Ls0/c;->i:Ljava/lang/Object;

    iput p5, p0, Ls0/c;->h:I

    return-void
.end method

.method public synthetic constructor <init>(Lwb/fr;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;ILwb/er;I)V
    .locals 0

    .line 1
    const/16 p6, 0xc

    .line 2
    .line 3
    iput p6, p0, Ls0/c;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 13
    .line 14
    iput p4, p0, Ls0/c;->h:I

    .line 15
    .line 16
    iput-object p5, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ls0/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li0/a1;

    .line 9
    .line 10
    iget-object v1, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Li0/a1;

    .line 13
    .line 14
    iget-object v2, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    iget-object v3, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lsh/t;

    .line 21
    .line 22
    check-cast p1, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    and-int/lit8 v4, p2, 0x3

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    const/4 v6, 0x1

    .line 34
    if-eq v4, v5, :cond_0

    .line 35
    .line 36
    move v4, v6

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v4, 0x0

    .line 39
    :goto_0
    and-int/2addr p2, v6

    .line 40
    invoke-virtual {p1, p2, v4}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    sget-object p2, Lbi/g;->a:Li0/m2;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Lfg/a;

    .line 53
    .line 54
    invoke-static {p2, p1}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    sget-object v5, Li0/l;->a:Li0/e;

    .line 63
    .line 64
    if-ne v4, v5, :cond_1

    .line 65
    .line 66
    new-instance v4, Lwb/ad;

    .line 67
    .line 68
    const/16 v5, 0xb

    .line 69
    .line 70
    invoke-direct {v4, v0, v1, p2, v5}, Lwb/ad;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    check-cast v4, Lfg/l;

    .line 77
    .line 78
    new-instance p2, Lb0/r;

    .line 79
    .line 80
    iget v0, p0, Ls0/c;->h:I

    .line 81
    .line 82
    invoke-direct {p2, v2, v0, v3, v4}, Lb0/r;-><init>(Ljava/util/ArrayList;ILsh/t;Lfg/l;)V

    .line 83
    .line 84
    .line 85
    const v0, 0x179eab5d

    .line 86
    .line 87
    .line 88
    invoke-static {v0, p2, p1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    const/4 v0, 0x6

    .line 93
    invoke-static {p2, p1, v0}, Lsh/s;->g(Ls0/d;Li0/h0;I)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 98
    .line 99
    .line 100
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 101
    .line 102
    return-object p1

    .line 103
    :pswitch_0
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v1, v0

    .line 106
    check-cast v1, Lwb/fr;

    .line 107
    .line 108
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v2, v0

    .line 111
    check-cast v2, Landroid/widget/FrameLayout;

    .line 112
    .line 113
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 114
    .line 115
    move-object v3, v0

    .line 116
    check-cast v3, Landroid/widget/FrameLayout;

    .line 117
    .line 118
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 119
    .line 120
    move-object v5, v0

    .line 121
    check-cast v5, Lwb/er;

    .line 122
    .line 123
    move-object v6, p1

    .line 124
    check-cast v6, Li0/h0;

    .line 125
    .line 126
    check-cast p2, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    const/16 p1, 0x6001

    .line 132
    .line 133
    invoke-static {p1}, Li0/r;->C(I)I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    iget v4, p0, Ls0/c;->h:I

    .line 138
    .line 139
    invoke-virtual/range {v1 .. v7}, Lwb/fr;->a(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;ILwb/er;Li0/h0;I)V

    .line 140
    .line 141
    .line 142
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 143
    .line 144
    return-object p1

    .line 145
    :pswitch_1
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Landroid/app/Activity;

    .line 148
    .line 149
    iget-object v1, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Landroid/widget/FrameLayout;

    .line 152
    .line 153
    iget-object v2, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v2, Landroid/widget/FrameLayout;

    .line 156
    .line 157
    iget-object v3, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v3, Lwb/er;

    .line 160
    .line 161
    check-cast p1, Li0/h0;

    .line 162
    .line 163
    check-cast p2, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    and-int/lit8 v4, p2, 0x3

    .line 170
    .line 171
    const/4 v5, 0x2

    .line 172
    const/4 v6, 0x1

    .line 173
    if-eq v4, v5, :cond_3

    .line 174
    .line 175
    move v4, v6

    .line 176
    goto :goto_3

    .line 177
    :cond_3
    const/4 v4, 0x0

    .line 178
    :goto_3
    and-int/2addr p2, v6

    .line 179
    invoke-virtual {p1, p2, v4}, Li0/h0;->S(IZ)Z

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    if-eqz p2, :cond_4

    .line 184
    .line 185
    sget-object p2, Lwb/fr;->a:Lwb/fr;

    .line 186
    .line 187
    new-instance v4, Lb0/r;

    .line 188
    .line 189
    iget v5, p0, Ls0/c;->h:I

    .line 190
    .line 191
    invoke-direct {v4, v1, v2, v5, v3}, Lb0/r;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;ILwb/er;)V

    .line 192
    .line 193
    .line 194
    const v1, 0x31f61fe7

    .line 195
    .line 196
    .line 197
    invoke-static {v1, v4, p1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    const/16 v2, 0x1b0

    .line 202
    .line 203
    invoke-virtual {p2, v0, v1, p1, v2}, Lwb/fr;->b(Landroid/app/Activity;Ls0/d;Li0/h0;I)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_4
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 208
    .line 209
    .line 210
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 211
    .line 212
    return-object p1

    .line 213
    :pswitch_2
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 214
    .line 215
    move-object v1, v0

    .line 216
    check-cast v1, Lwb/y2;

    .line 217
    .line 218
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 219
    .line 220
    move-object v2, v0

    .line 221
    check-cast v2, Landroid/content/Context;

    .line 222
    .line 223
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 224
    .line 225
    move-object v3, v0

    .line 226
    check-cast v3, Lvb/a;

    .line 227
    .line 228
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 229
    .line 230
    move-object v4, v0

    .line 231
    check-cast v4, Lfg/a;

    .line 232
    .line 233
    move-object v5, p1

    .line 234
    check-cast v5, Li0/h0;

    .line 235
    .line 236
    check-cast p2, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget p1, p0, Ls0/c;->h:I

    .line 242
    .line 243
    or-int/lit8 p1, p1, 0x1

    .line 244
    .line 245
    invoke-static {p1}, Li0/r;->C(I)I

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->L1(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 250
    .line 251
    .line 252
    goto :goto_2

    .line 253
    :pswitch_3
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 254
    .line 255
    move-object v1, v0

    .line 256
    check-cast v1, Landroid/content/Context;

    .line 257
    .line 258
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 259
    .line 260
    move-object v2, v0

    .line 261
    check-cast v2, Lwb/v0;

    .line 262
    .line 263
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 264
    .line 265
    move-object v3, v0

    .line 266
    check-cast v3, Lfg/a;

    .line 267
    .line 268
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 269
    .line 270
    move-object v4, v0

    .line 271
    check-cast v4, Lfg/l;

    .line 272
    .line 273
    move-object v5, p1

    .line 274
    check-cast v5, Li0/h0;

    .line 275
    .line 276
    check-cast p2, Ljava/lang/Integer;

    .line 277
    .line 278
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    iget p1, p0, Ls0/c;->h:I

    .line 282
    .line 283
    or-int/lit8 p1, p1, 0x1

    .line 284
    .line 285
    invoke-static {p1}, Li0/r;->C(I)I

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    invoke-static/range {v1 .. v6}, Lwb/ho;->b0(Landroid/content/Context;Lwb/v0;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_2

    .line 293
    .line 294
    :pswitch_4
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 295
    .line 296
    move-object v1, v0

    .line 297
    check-cast v1, Landroid/content/Context;

    .line 298
    .line 299
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 300
    .line 301
    move-object v2, v0

    .line 302
    check-cast v2, Lwb/d4;

    .line 303
    .line 304
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 305
    .line 306
    move-object v3, v0

    .line 307
    check-cast v3, Lfg/a;

    .line 308
    .line 309
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 310
    .line 311
    move-object v4, v0

    .line 312
    check-cast v4, Lfg/l;

    .line 313
    .line 314
    move-object v5, p1

    .line 315
    check-cast v5, Li0/h0;

    .line 316
    .line 317
    check-cast p2, Ljava/lang/Integer;

    .line 318
    .line 319
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    iget p1, p0, Ls0/c;->h:I

    .line 323
    .line 324
    or-int/lit8 p1, p1, 0x1

    .line 325
    .line 326
    invoke-static {p1}, Li0/r;->C(I)I

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    invoke-static/range {v1 .. v6}, Lwb/ho;->o1(Landroid/content/Context;Lwb/d4;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_2

    .line 334
    .line 335
    :pswitch_5
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 336
    .line 337
    move-object v5, v0

    .line 338
    check-cast v5, Ljava/lang/String;

    .line 339
    .line 340
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 341
    .line 342
    move-object v6, v0

    .line 343
    check-cast v6, Ljava/lang/String;

    .line 344
    .line 345
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 346
    .line 347
    move-object v7, v0

    .line 348
    check-cast v7, Ly0/o;

    .line 349
    .line 350
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 351
    .line 352
    move-object v3, v0

    .line 353
    check-cast v3, Lfg/l;

    .line 354
    .line 355
    move-object v4, p1

    .line 356
    check-cast v4, Li0/h0;

    .line 357
    .line 358
    check-cast p2, Ljava/lang/Integer;

    .line 359
    .line 360
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    const/16 p1, 0x187

    .line 364
    .line 365
    invoke-static {p1}, Li0/r;->C(I)I

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    iget v1, p0, Ls0/c;->h:I

    .line 370
    .line 371
    invoke-static/range {v1 .. v7}, Lwb/ho;->V3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Ly0/o;)V

    .line 372
    .line 373
    .line 374
    goto/16 :goto_2

    .line 375
    .line 376
    :pswitch_6
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 377
    .line 378
    move-object v1, v0

    .line 379
    check-cast v1, Ljava/lang/String;

    .line 380
    .line 381
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 382
    .line 383
    move-object v2, v0

    .line 384
    check-cast v2, Ljava/lang/String;

    .line 385
    .line 386
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 387
    .line 388
    move-object v3, v0

    .line 389
    check-cast v3, Ljava/lang/String;

    .line 390
    .line 391
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 392
    .line 393
    move-object v4, v0

    .line 394
    check-cast v4, Lfg/l;

    .line 395
    .line 396
    move-object v5, p1

    .line 397
    check-cast v5, Li0/h0;

    .line 398
    .line 399
    check-cast p2, Ljava/lang/Integer;

    .line 400
    .line 401
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    iget p1, p0, Ls0/c;->h:I

    .line 405
    .line 406
    or-int/lit8 p1, p1, 0x1

    .line 407
    .line 408
    invoke-static {p1}, Li0/r;->C(I)I

    .line 409
    .line 410
    .line 411
    move-result v6

    .line 412
    invoke-static/range {v1 .. v6}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 413
    .line 414
    .line 415
    goto/16 :goto_2

    .line 416
    .line 417
    :pswitch_7
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 418
    .line 419
    move-object v1, v0

    .line 420
    check-cast v1, Ljava/lang/String;

    .line 421
    .line 422
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 423
    .line 424
    move-object v2, v0

    .line 425
    check-cast v2, Ld1/v;

    .line 426
    .line 427
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 428
    .line 429
    move-object v3, v0

    .line 430
    check-cast v3, Lfg/l;

    .line 431
    .line 432
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 433
    .line 434
    move-object v4, v0

    .line 435
    check-cast v4, Lfg/a;

    .line 436
    .line 437
    move-object v5, p1

    .line 438
    check-cast v5, Li0/h0;

    .line 439
    .line 440
    check-cast p2, Ljava/lang/Integer;

    .line 441
    .line 442
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 443
    .line 444
    .line 445
    iget p1, p0, Ls0/c;->h:I

    .line 446
    .line 447
    or-int/lit8 p1, p1, 0x1

    .line 448
    .line 449
    invoke-static {p1}, Li0/r;->C(I)I

    .line 450
    .line 451
    .line 452
    move-result v6

    .line 453
    invoke-static/range {v1 .. v6}, Lwb/ho;->w3(Ljava/lang/String;Ld1/v;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_2

    .line 457
    .line 458
    :pswitch_8
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 459
    .line 460
    move-object v1, v0

    .line 461
    check-cast v1, Landroid/content/Context;

    .line 462
    .line 463
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 464
    .line 465
    move-object v2, v0

    .line 466
    check-cast v2, Lfg/l;

    .line 467
    .line 468
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 469
    .line 470
    move-object v3, v0

    .line 471
    check-cast v3, Lfg/a;

    .line 472
    .line 473
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 474
    .line 475
    move-object v4, v0

    .line 476
    check-cast v4, Lfg/a;

    .line 477
    .line 478
    move-object v5, p1

    .line 479
    check-cast v5, Li0/h0;

    .line 480
    .line 481
    check-cast p2, Ljava/lang/Integer;

    .line 482
    .line 483
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    iget p1, p0, Ls0/c;->h:I

    .line 487
    .line 488
    or-int/lit8 p1, p1, 0x1

    .line 489
    .line 490
    invoke-static {p1}, Li0/r;->C(I)I

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    invoke-static/range {v1 .. v6}, Lwb/ho;->t3(Landroid/content/Context;Lfg/l;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 495
    .line 496
    .line 497
    goto/16 :goto_2

    .line 498
    .line 499
    :pswitch_9
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 500
    .line 501
    move-object v1, v0

    .line 502
    check-cast v1, Lwb/y2;

    .line 503
    .line 504
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 505
    .line 506
    move-object v2, v0

    .line 507
    check-cast v2, Ljava/lang/String;

    .line 508
    .line 509
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 510
    .line 511
    move-object v3, v0

    .line 512
    check-cast v3, Lfg/l;

    .line 513
    .line 514
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 515
    .line 516
    move-object v4, v0

    .line 517
    check-cast v4, Ly0/o;

    .line 518
    .line 519
    move-object v5, p1

    .line 520
    check-cast v5, Li0/h0;

    .line 521
    .line 522
    check-cast p2, Ljava/lang/Integer;

    .line 523
    .line 524
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    iget p1, p0, Ls0/c;->h:I

    .line 528
    .line 529
    or-int/lit8 p1, p1, 0x1

    .line 530
    .line 531
    invoke-static {p1}, Li0/r;->C(I)I

    .line 532
    .line 533
    .line 534
    move-result v6

    .line 535
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->M(Ljava/lang/String;Lfg/l;Ly0/o;Li0/h0;I)V

    .line 536
    .line 537
    .line 538
    goto/16 :goto_2

    .line 539
    .line 540
    :pswitch_a
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 541
    .line 542
    move-object v1, v0

    .line 543
    check-cast v1, Lp/f1;

    .line 544
    .line 545
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 546
    .line 547
    move-object v2, v0

    .line 548
    check-cast v2, Lfg/a;

    .line 549
    .line 550
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 551
    .line 552
    move-object v3, v0

    .line 553
    check-cast v3, Ly0/o;

    .line 554
    .line 555
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 556
    .line 557
    move-object v4, v0

    .line 558
    check-cast v4, Ls0/d;

    .line 559
    .line 560
    move-object v5, p1

    .line 561
    check-cast v5, Li0/h0;

    .line 562
    .line 563
    check-cast p2, Ljava/lang/Integer;

    .line 564
    .line 565
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    iget p1, p0, Ls0/c;->h:I

    .line 569
    .line 570
    or-int/lit8 p1, p1, 0x1

    .line 571
    .line 572
    invoke-static {p1}, Li0/r;->C(I)I

    .line 573
    .line 574
    .line 575
    move-result v6

    .line 576
    invoke-static/range {v1 .. v6}, Lwb/o3;->c(Lp/f1;Lfg/a;Ly0/o;Ls0/d;Li0/h0;I)V

    .line 577
    .line 578
    .line 579
    goto/16 :goto_2

    .line 580
    .line 581
    :pswitch_b
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 582
    .line 583
    move-object v1, v0

    .line 584
    check-cast v1, Lwb/h2;

    .line 585
    .line 586
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 587
    .line 588
    move-object v2, v0

    .line 589
    check-cast v2, Landroid/content/Context;

    .line 590
    .line 591
    iget-object v0, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 592
    .line 593
    move-object v3, v0

    .line 594
    check-cast v3, Lvb/a;

    .line 595
    .line 596
    iget-object v0, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 597
    .line 598
    move-object v4, v0

    .line 599
    check-cast v4, Lfg/a;

    .line 600
    .line 601
    move-object v5, p1

    .line 602
    check-cast v5, Li0/h0;

    .line 603
    .line 604
    check-cast p2, Ljava/lang/Integer;

    .line 605
    .line 606
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    iget p1, p0, Ls0/c;->h:I

    .line 610
    .line 611
    or-int/lit8 p1, p1, 0x1

    .line 612
    .line 613
    invoke-static {p1}, Li0/r;->C(I)I

    .line 614
    .line 615
    .line 616
    move-result v6

    .line 617
    invoke-virtual/range {v1 .. v6}, Lwb/h2;->e(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 618
    .line 619
    .line 620
    goto/16 :goto_2

    .line 621
    .line 622
    :pswitch_c
    iget-object v0, p0, Ls0/c;->i:Ljava/lang/Object;

    .line 623
    .line 624
    move-object v1, v0

    .line 625
    check-cast v1, Ls0/d;

    .line 626
    .line 627
    iget-object v0, p0, Ls0/c;->j:Ljava/lang/Object;

    .line 628
    .line 629
    move-object v2, v0

    .line 630
    check-cast v2, Ld0/b;

    .line 631
    .line 632
    move-object v5, p1

    .line 633
    check-cast v5, Li0/h0;

    .line 634
    .line 635
    check-cast p2, Ljava/lang/Integer;

    .line 636
    .line 637
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    iget p1, p0, Ls0/c;->h:I

    .line 641
    .line 642
    invoke-static {p1}, Li0/r;->C(I)I

    .line 643
    .line 644
    .line 645
    move-result p1

    .line 646
    or-int/lit8 v6, p1, 0x1

    .line 647
    .line 648
    iget-object v3, p0, Ls0/c;->k:Ljava/lang/Object;

    .line 649
    .line 650
    iget-object v4, p0, Ls0/c;->l:Ljava/lang/Object;

    .line 651
    .line 652
    invoke-virtual/range {v1 .. v6}, Ls0/d;->e(Ld0/b;Ljava/lang/Object;Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    goto/16 :goto_2

    .line 656
    .line 657
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
