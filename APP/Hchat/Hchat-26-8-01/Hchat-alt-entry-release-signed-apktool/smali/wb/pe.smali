.class public final synthetic Lwb/pe;
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

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p11, p0, Lwb/pe;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/pe;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/pe;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/pe;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/pe;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/pe;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/pe;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/pe;->n:Li0/a1;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/pe;->o:Li0/a1;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/pe;->p:Li0/a1;

    .line 20
    .line 21
    iput-object p10, p0, Lwb/pe;->q:Li0/a1;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/pe;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Li0/h0;

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
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_16

    .line 31
    .line 32
    iget-object p1, p0, Lwb/pe;->i:Li0/a1;

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
    iget-object p2, p0, Lwb/pe;->h:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

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
    new-instance v2, Lwb/jo;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-direct {v2, p2, p1, v0}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

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
    const-string v2, "\u6587\u5b57\u670b\u53cb\u5708"

    .line 77
    .line 78
    const-string v3, "\u5141\u8bb8\u81ea\u52a8\u8bc4\u8bba"

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    invoke-static {p1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lwb/pe;->j:Li0/a1;

    .line 89
    .line 90
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-nez v2, :cond_3

    .line 109
    .line 110
    if-ne v3, v11, :cond_4

    .line 111
    .line 112
    :cond_3
    new-instance v3, Lwb/jo;

    .line 113
    .line 114
    const/4 v2, 0x1

    .line 115
    invoke-direct {v3, p2, v0, v2}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    move-object v5, v3

    .line 122
    check-cast v5, Lfg/l;

    .line 123
    .line 124
    const/16 v7, 0x1b0

    .line 125
    .line 126
    const/16 v8, 0x8

    .line 127
    .line 128
    const-string v2, "\u56fe\u7247/\u56fe\u6587\u670b\u53cb\u5708"

    .line 129
    .line 130
    const-string v3, "\u5141\u8bb8\u81ea\u52a8\u8bc4\u8bba"

    .line 131
    .line 132
    const/4 v4, 0x0

    .line 133
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lwb/pe;->k:Li0/a1;

    .line 140
    .line 141
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    if-nez v2, :cond_5

    .line 160
    .line 161
    if-ne v3, v11, :cond_6

    .line 162
    .line 163
    :cond_5
    new-instance v3, Lwb/jo;

    .line 164
    .line 165
    const/4 v2, 0x2

    .line 166
    invoke-direct {v3, p2, v0, v2}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_6
    move-object v5, v3

    .line 173
    check-cast v5, Lfg/l;

    .line 174
    .line 175
    const/16 v7, 0x1b0

    .line 176
    .line 177
    const/16 v8, 0x8

    .line 178
    .line 179
    const-string v2, "\u89c6\u9891/\u89c6\u6587\u670b\u53cb\u5708"

    .line 180
    .line 181
    const-string v3, "\u5141\u8bb8\u81ea\u52a8\u8bc4\u8bba"

    .line 182
    .line 183
    const/4 v4, 0x0

    .line 184
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 185
    .line 186
    .line 187
    invoke-static {p1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 188
    .line 189
    .line 190
    iget-object v0, p0, Lwb/pe;->l:Li0/a1;

    .line 191
    .line 192
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    if-nez v2, :cond_7

    .line 211
    .line 212
    if-ne v3, v11, :cond_8

    .line 213
    .line 214
    :cond_7
    new-instance v3, Lwb/jo;

    .line 215
    .line 216
    const/4 v2, 0x3

    .line 217
    invoke-direct {v3, p2, v0, v2}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_8
    move-object v5, v3

    .line 224
    check-cast v5, Lfg/l;

    .line 225
    .line 226
    const/16 v7, 0x1b0

    .line 227
    .line 228
    const/16 v8, 0x8

    .line 229
    .line 230
    const-string v2, "\u6587\u5b57\u670b\u53cb\u5708\u5173\u952e\u8bcd"

    .line 231
    .line 232
    const-string v3, "\u5f00\u542f\u540e\u6309\u5173\u952e\u8bcd\u6392\u9664"

    .line 233
    .line 234
    const/4 v4, 0x0

    .line 235
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Ljava/lang/Boolean;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_b

    .line 249
    .line 250
    const v0, 0x1c315c46

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6, v0}, Li0/h0;->a0(I)V

    .line 254
    .line 255
    .line 256
    invoke-static {p1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 257
    .line 258
    .line 259
    iget-object v0, p0, Lwb/pe;->m:Li0/a1;

    .line 260
    .line 261
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    move-object v3, v1

    .line 266
    check-cast v3, Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    if-nez v1, :cond_9

    .line 277
    .line 278
    if-ne v2, v11, :cond_a

    .line 279
    .line 280
    :cond_9
    new-instance v2, Lwb/jo;

    .line 281
    .line 282
    const/4 v1, 0x4

    .line 283
    invoke-direct {v2, p2, v0, v1}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    :cond_a
    move-object v5, v2

    .line 290
    check-cast v5, Lfg/l;

    .line 291
    .line 292
    const/16 v7, 0xc36

    .line 293
    .line 294
    const/4 v8, 0x0

    .line 295
    const-string v1, "\u6587\u5b57\u6392\u9664\u5173\u952e\u8bcd"

    .line 296
    .line 297
    const-string v2, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 298
    .line 299
    const/4 v4, 0x2

    .line 300
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 304
    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_b
    const v0, 0x1c3690e9

    .line 308
    .line 309
    .line 310
    invoke-virtual {v6, v0}, Li0/h0;->a0(I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 314
    .line 315
    .line 316
    :goto_1
    invoke-static {p1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 317
    .line 318
    .line 319
    iget-object v0, p0, Lwb/pe;->n:Li0/a1;

    .line 320
    .line 321
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    check-cast v1, Ljava/lang/Boolean;

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    if-nez v2, :cond_c

    .line 340
    .line 341
    if-ne v3, v11, :cond_d

    .line 342
    .line 343
    :cond_c
    new-instance v3, Lwb/jo;

    .line 344
    .line 345
    const/4 v2, 0x5

    .line 346
    invoke-direct {v3, p2, v0, v2}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    :cond_d
    move-object v5, v3

    .line 353
    check-cast v5, Lfg/l;

    .line 354
    .line 355
    const/16 v7, 0x1b0

    .line 356
    .line 357
    const/16 v8, 0x8

    .line 358
    .line 359
    const-string v2, "\u56fe\u6587\u670b\u53cb\u5708\u5173\u952e\u8bcd"

    .line 360
    .line 361
    const-string v3, "\u5f00\u542f\u540e\u6309\u5173\u952e\u8bcd\u6392\u9664"

    .line 362
    .line 363
    const/4 v4, 0x0

    .line 364
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    check-cast v0, Ljava/lang/Boolean;

    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_10

    .line 378
    .line 379
    const v0, 0x1c3b6b36

    .line 380
    .line 381
    .line 382
    invoke-virtual {v6, v0}, Li0/h0;->a0(I)V

    .line 383
    .line 384
    .line 385
    invoke-static {p1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 386
    .line 387
    .line 388
    iget-object v0, p0, Lwb/pe;->o:Li0/a1;

    .line 389
    .line 390
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    move-object v3, v1

    .line 395
    check-cast v3, Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    if-nez v1, :cond_e

    .line 406
    .line 407
    if-ne v2, v11, :cond_f

    .line 408
    .line 409
    :cond_e
    new-instance v2, Lwb/jo;

    .line 410
    .line 411
    const/4 v1, 0x6

    .line 412
    invoke-direct {v2, p2, v0, v1}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    :cond_f
    move-object v5, v2

    .line 419
    check-cast v5, Lfg/l;

    .line 420
    .line 421
    const/16 v7, 0xc36

    .line 422
    .line 423
    const/4 v8, 0x0

    .line 424
    const-string v1, "\u56fe\u6587\u6392\u9664\u5173\u952e\u8bcd"

    .line 425
    .line 426
    const-string v2, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 427
    .line 428
    const/4 v4, 0x2

    .line 429
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 433
    .line 434
    .line 435
    goto :goto_2

    .line 436
    :cond_10
    const v0, 0x1c40dbe9

    .line 437
    .line 438
    .line 439
    invoke-virtual {v6, v0}, Li0/h0;->a0(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 443
    .line 444
    .line 445
    :goto_2
    invoke-static {p1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 446
    .line 447
    .line 448
    iget-object v0, p0, Lwb/pe;->p:Li0/a1;

    .line 449
    .line 450
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    check-cast v1, Ljava/lang/Boolean;

    .line 455
    .line 456
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    if-nez v2, :cond_11

    .line 469
    .line 470
    if-ne v3, v11, :cond_12

    .line 471
    .line 472
    :cond_11
    new-instance v3, Lwb/jo;

    .line 473
    .line 474
    const/4 v2, 0x7

    .line 475
    invoke-direct {v3, p2, v0, v2}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    :cond_12
    move-object v5, v3

    .line 482
    check-cast v5, Lfg/l;

    .line 483
    .line 484
    const/16 v7, 0x1b0

    .line 485
    .line 486
    const/16 v8, 0x8

    .line 487
    .line 488
    const-string v2, "\u89c6\u6587\u670b\u53cb\u5708\u5173\u952e\u8bcd"

    .line 489
    .line 490
    const-string v3, "\u5f00\u542f\u540e\u6309\u5173\u952e\u8bcd\u6392\u9664"

    .line 491
    .line 492
    const/4 v4, 0x0

    .line 493
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 494
    .line 495
    .line 496
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    check-cast v0, Ljava/lang/Boolean;

    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    if-eqz v0, :cond_15

    .line 507
    .line 508
    const v0, 0x1c45b636

    .line 509
    .line 510
    .line 511
    invoke-virtual {v6, v0}, Li0/h0;->a0(I)V

    .line 512
    .line 513
    .line 514
    invoke-static {p1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 515
    .line 516
    .line 517
    iget-object p1, p0, Lwb/pe;->q:Li0/a1;

    .line 518
    .line 519
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    move-object v3, v0

    .line 524
    check-cast v3, Ljava/lang/String;

    .line 525
    .line 526
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    if-nez v0, :cond_13

    .line 535
    .line 536
    if-ne v1, v11, :cond_14

    .line 537
    .line 538
    :cond_13
    new-instance v1, Lwb/jo;

    .line 539
    .line 540
    const/16 v0, 0x8

    .line 541
    .line 542
    invoke-direct {v1, p2, p1, v0}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v6, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :cond_14
    move-object v5, v1

    .line 549
    check-cast v5, Lfg/l;

    .line 550
    .line 551
    const/16 v7, 0xc36

    .line 552
    .line 553
    const/4 v8, 0x0

    .line 554
    const-string v1, "\u89c6\u6587\u6392\u9664\u5173\u952e\u8bcd"

    .line 555
    .line 556
    const-string v2, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 557
    .line 558
    const/4 v4, 0x2

    .line 559
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 563
    .line 564
    .line 565
    goto :goto_3

    .line 566
    :cond_15
    const p1, 0x1c4b26e9

    .line 567
    .line 568
    .line 569
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 573
    .line 574
    .line 575
    goto :goto_3

    .line 576
    :cond_16
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 577
    .line 578
    .line 579
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 580
    .line 581
    return-object p1

    .line 582
    :pswitch_0
    move-object v5, p1

    .line 583
    check-cast v5, Li0/h0;

    .line 584
    .line 585
    check-cast p2, Ljava/lang/Integer;

    .line 586
    .line 587
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 588
    .line 589
    .line 590
    move-result p1

    .line 591
    and-int/lit8 p2, p1, 0x3

    .line 592
    .line 593
    const/4 v0, 0x2

    .line 594
    const/4 v8, 0x1

    .line 595
    const/4 v9, 0x0

    .line 596
    if-eq p2, v0, :cond_17

    .line 597
    .line 598
    move p2, v8

    .line 599
    goto :goto_4

    .line 600
    :cond_17
    move p2, v9

    .line 601
    :goto_4
    and-int/2addr p1, v8

    .line 602
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 603
    .line 604
    .line 605
    move-result p1

    .line 606
    if-eqz p1, :cond_2d

    .line 607
    .line 608
    iget-object p1, p0, Lwb/pe;->i:Li0/a1;

    .line 609
    .line 610
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object p2

    .line 614
    check-cast p2, Ljava/lang/Boolean;

    .line 615
    .line 616
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    iget-object p2, p0, Lwb/pe;->h:Landroid/content/SharedPreferences;

    .line 621
    .line 622
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    move-result v1

    .line 626
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    sget-object v10, Li0/l;->a:Li0/e;

    .line 631
    .line 632
    if-nez v1, :cond_18

    .line 633
    .line 634
    if-ne v2, v10, :cond_19

    .line 635
    .line 636
    :cond_18
    new-instance v2, Lwb/wh;

    .line 637
    .line 638
    const/16 v1, 0x17

    .line 639
    .line 640
    invoke-direct {v2, p2, p1, v1}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    :cond_19
    move-object v4, v2

    .line 647
    check-cast v4, Lfg/l;

    .line 648
    .line 649
    const/16 v6, 0x1b0

    .line 650
    .line 651
    const/16 v7, 0x8

    .line 652
    .line 653
    const-string v1, "\u6587\u5b57\u670b\u53cb\u5708"

    .line 654
    .line 655
    const-string v2, "\u5141\u8bb8\u81ea\u52a8\u70b9\u8d5e"

    .line 656
    .line 657
    const/4 v3, 0x0

    .line 658
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 659
    .line 660
    .line 661
    const/4 p1, 0x0

    .line 662
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 663
    .line 664
    .line 665
    iget-object v0, p0, Lwb/pe;->j:Li0/a1;

    .line 666
    .line 667
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    check-cast v1, Ljava/lang/Boolean;

    .line 672
    .line 673
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 674
    .line 675
    .line 676
    move-result v1

    .line 677
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    if-nez v2, :cond_1a

    .line 686
    .line 687
    if-ne v3, v10, :cond_1b

    .line 688
    .line 689
    :cond_1a
    new-instance v3, Lwb/wh;

    .line 690
    .line 691
    const/16 v2, 0x18

    .line 692
    .line 693
    invoke-direct {v3, p2, v0, v2}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    :cond_1b
    move-object v4, v3

    .line 700
    check-cast v4, Lfg/l;

    .line 701
    .line 702
    const/16 v6, 0x1b0

    .line 703
    .line 704
    const/16 v7, 0x8

    .line 705
    .line 706
    move v0, v1

    .line 707
    const-string v1, "\u56fe\u7247/\u56fe\u6587\u670b\u53cb\u5708"

    .line 708
    .line 709
    const-string v2, "\u5141\u8bb8\u81ea\u52a8\u70b9\u8d5e"

    .line 710
    .line 711
    const/4 v3, 0x0

    .line 712
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 713
    .line 714
    .line 715
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 716
    .line 717
    .line 718
    iget-object v0, p0, Lwb/pe;->k:Li0/a1;

    .line 719
    .line 720
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    check-cast v1, Ljava/lang/Boolean;

    .line 725
    .line 726
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 727
    .line 728
    .line 729
    move-result v1

    .line 730
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v2

    .line 734
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v3

    .line 738
    if-nez v2, :cond_1c

    .line 739
    .line 740
    if-ne v3, v10, :cond_1d

    .line 741
    .line 742
    :cond_1c
    new-instance v3, Lwb/wh;

    .line 743
    .line 744
    const/16 v2, 0x19

    .line 745
    .line 746
    invoke-direct {v3, p2, v0, v2}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    :cond_1d
    move-object v4, v3

    .line 753
    check-cast v4, Lfg/l;

    .line 754
    .line 755
    const/16 v6, 0x1b0

    .line 756
    .line 757
    const/16 v7, 0x8

    .line 758
    .line 759
    move v0, v1

    .line 760
    const-string v1, "\u89c6\u9891/\u89c6\u6587\u670b\u53cb\u5708"

    .line 761
    .line 762
    const-string v2, "\u5141\u8bb8\u81ea\u52a8\u70b9\u8d5e"

    .line 763
    .line 764
    const/4 v3, 0x0

    .line 765
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 766
    .line 767
    .line 768
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 769
    .line 770
    .line 771
    iget-object v11, p0, Lwb/pe;->l:Li0/a1;

    .line 772
    .line 773
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    check-cast v0, Ljava/lang/Boolean;

    .line 778
    .line 779
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 780
    .line 781
    .line 782
    move-result v0

    .line 783
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result v1

    .line 787
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    if-nez v1, :cond_1e

    .line 792
    .line 793
    if-ne v2, v10, :cond_1f

    .line 794
    .line 795
    :cond_1e
    new-instance v2, Lwb/wh;

    .line 796
    .line 797
    const/16 v1, 0x1a

    .line 798
    .line 799
    invoke-direct {v2, p2, v11, v1}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 803
    .line 804
    .line 805
    :cond_1f
    move-object v4, v2

    .line 806
    check-cast v4, Lfg/l;

    .line 807
    .line 808
    const/16 v6, 0x1b0

    .line 809
    .line 810
    const/16 v7, 0x8

    .line 811
    .line 812
    const-string v1, "\u6587\u5b57\u670b\u53cb\u5708\u5173\u952e\u8bcd"

    .line 813
    .line 814
    const-string v2, "\u5f00\u542f\u540e\u6309\u5173\u952e\u8bcd\u6392\u9664"

    .line 815
    .line 816
    const/4 v3, 0x0

    .line 817
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 818
    .line 819
    .line 820
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    check-cast v0, Ljava/lang/Boolean;

    .line 825
    .line 826
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 827
    .line 828
    .line 829
    move-result v0

    .line 830
    if-eqz v0, :cond_22

    .line 831
    .line 832
    const v0, -0x301ea7b2

    .line 833
    .line 834
    .line 835
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 836
    .line 837
    .line 838
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 839
    .line 840
    .line 841
    iget-object v0, p0, Lwb/pe;->m:Li0/a1;

    .line 842
    .line 843
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    move-object v2, v1

    .line 848
    check-cast v2, Ljava/lang/String;

    .line 849
    .line 850
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    move-result v1

    .line 854
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v3

    .line 858
    if-nez v1, :cond_20

    .line 859
    .line 860
    if-ne v3, v10, :cond_21

    .line 861
    .line 862
    :cond_20
    new-instance v3, Lwb/wh;

    .line 863
    .line 864
    const/16 v1, 0x1b

    .line 865
    .line 866
    invoke-direct {v3, p2, v0, v1}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    :cond_21
    move-object v4, v3

    .line 873
    check-cast v4, Lfg/l;

    .line 874
    .line 875
    const/16 v6, 0xc36

    .line 876
    .line 877
    const/4 v7, 0x0

    .line 878
    const-string v0, "\u6587\u5b57\u6392\u9664\u5173\u952e\u8bcd"

    .line 879
    .line 880
    const-string v1, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 881
    .line 882
    const/4 v3, 0x2

    .line 883
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 887
    .line 888
    .line 889
    goto :goto_5

    .line 890
    :cond_22
    const v0, -0x30197e52

    .line 891
    .line 892
    .line 893
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 897
    .line 898
    .line 899
    :goto_5
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 900
    .line 901
    .line 902
    iget-object v11, p0, Lwb/pe;->n:Li0/a1;

    .line 903
    .line 904
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    check-cast v0, Ljava/lang/Boolean;

    .line 909
    .line 910
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 911
    .line 912
    .line 913
    move-result v0

    .line 914
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    move-result v1

    .line 918
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    if-nez v1, :cond_23

    .line 923
    .line 924
    if-ne v2, v10, :cond_24

    .line 925
    .line 926
    :cond_23
    new-instance v2, Lwb/wh;

    .line 927
    .line 928
    const/16 v1, 0x1c

    .line 929
    .line 930
    invoke-direct {v2, p2, v11, v1}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    :cond_24
    move-object v4, v2

    .line 937
    check-cast v4, Lfg/l;

    .line 938
    .line 939
    const/16 v6, 0x1b0

    .line 940
    .line 941
    const/16 v7, 0x8

    .line 942
    .line 943
    const-string v1, "\u56fe\u6587\u670b\u53cb\u5708\u5173\u952e\u8bcd"

    .line 944
    .line 945
    const-string v2, "\u5f00\u542f\u540e\u6309\u5173\u952e\u8bcd\u6392\u9664"

    .line 946
    .line 947
    const/4 v3, 0x0

    .line 948
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 949
    .line 950
    .line 951
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    check-cast v0, Ljava/lang/Boolean;

    .line 956
    .line 957
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    if-eqz v0, :cond_27

    .line 962
    .line 963
    const v0, -0x3014b002

    .line 964
    .line 965
    .line 966
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 967
    .line 968
    .line 969
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 970
    .line 971
    .line 972
    iget-object v0, p0, Lwb/pe;->o:Li0/a1;

    .line 973
    .line 974
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v1

    .line 978
    move-object v2, v1

    .line 979
    check-cast v2, Ljava/lang/String;

    .line 980
    .line 981
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    move-result v1

    .line 985
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v3

    .line 989
    if-nez v1, :cond_25

    .line 990
    .line 991
    if-ne v3, v10, :cond_26

    .line 992
    .line 993
    :cond_25
    new-instance v3, Lwb/wh;

    .line 994
    .line 995
    const/16 v1, 0x1d

    .line 996
    .line 997
    invoke-direct {v3, p2, v0, v1}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1001
    .line 1002
    .line 1003
    :cond_26
    move-object v4, v3

    .line 1004
    check-cast v4, Lfg/l;

    .line 1005
    .line 1006
    const/16 v6, 0xc36

    .line 1007
    .line 1008
    const/4 v7, 0x0

    .line 1009
    const-string v0, "\u56fe\u6587\u6392\u9664\u5173\u952e\u8bcd"

    .line 1010
    .line 1011
    const-string v1, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 1012
    .line 1013
    const/4 v3, 0x2

    .line 1014
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1018
    .line 1019
    .line 1020
    goto :goto_6

    .line 1021
    :cond_27
    const v0, -0x300f4a92

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1028
    .line 1029
    .line 1030
    :goto_6
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1031
    .line 1032
    .line 1033
    iget-object v11, p0, Lwb/pe;->p:Li0/a1;

    .line 1034
    .line 1035
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    check-cast v0, Ljava/lang/Boolean;

    .line 1040
    .line 1041
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1042
    .line 1043
    .line 1044
    move-result v0

    .line 1045
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1046
    .line 1047
    .line 1048
    move-result v1

    .line 1049
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v2

    .line 1053
    if-nez v1, :cond_28

    .line 1054
    .line 1055
    if-ne v2, v10, :cond_29

    .line 1056
    .line 1057
    :cond_28
    new-instance v2, Lwb/di;

    .line 1058
    .line 1059
    const/4 v1, 0x0

    .line 1060
    invoke-direct {v2, p2, v11, v1}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1064
    .line 1065
    .line 1066
    :cond_29
    move-object v4, v2

    .line 1067
    check-cast v4, Lfg/l;

    .line 1068
    .line 1069
    const/16 v6, 0x1b0

    .line 1070
    .line 1071
    const/16 v7, 0x8

    .line 1072
    .line 1073
    const-string v1, "\u89c6\u6587\u670b\u53cb\u5708\u5173\u952e\u8bcd"

    .line 1074
    .line 1075
    const-string v2, "\u5f00\u542f\u540e\u6309\u5173\u952e\u8bcd\u6392\u9664"

    .line 1076
    .line 1077
    const/4 v3, 0x0

    .line 1078
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1079
    .line 1080
    .line 1081
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    check-cast v0, Ljava/lang/Boolean;

    .line 1086
    .line 1087
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v0

    .line 1091
    if-eqz v0, :cond_2c

    .line 1092
    .line 1093
    const v0, -0x300a7c42

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 1097
    .line 1098
    .line 1099
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1100
    .line 1101
    .line 1102
    iget-object p1, p0, Lwb/pe;->q:Li0/a1;

    .line 1103
    .line 1104
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    move-object v2, v0

    .line 1109
    check-cast v2, Ljava/lang/String;

    .line 1110
    .line 1111
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v0

    .line 1115
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v1

    .line 1119
    if-nez v0, :cond_2a

    .line 1120
    .line 1121
    if-ne v1, v10, :cond_2b

    .line 1122
    .line 1123
    :cond_2a
    new-instance v1, Lwb/di;

    .line 1124
    .line 1125
    const/4 v0, 0x1

    .line 1126
    invoke-direct {v1, p2, p1, v0}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1130
    .line 1131
    .line 1132
    :cond_2b
    move-object v4, v1

    .line 1133
    check-cast v4, Lfg/l;

    .line 1134
    .line 1135
    const/16 v6, 0xc36

    .line 1136
    .line 1137
    const/4 v7, 0x0

    .line 1138
    const-string v0, "\u89c6\u6587\u6392\u9664\u5173\u952e\u8bcd"

    .line 1139
    .line 1140
    const-string v1, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 1141
    .line 1142
    const/4 v3, 0x2

    .line 1143
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1147
    .line 1148
    .line 1149
    goto :goto_7

    .line 1150
    :cond_2c
    const p1, -0x300516d2

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1157
    .line 1158
    .line 1159
    goto :goto_7

    .line 1160
    :cond_2d
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1161
    .line 1162
    .line 1163
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1164
    .line 1165
    return-object p1

    .line 1166
    :pswitch_1
    move-object v5, p1

    .line 1167
    check-cast v5, Li0/h0;

    .line 1168
    .line 1169
    check-cast p2, Ljava/lang/Integer;

    .line 1170
    .line 1171
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1172
    .line 1173
    .line 1174
    move-result p1

    .line 1175
    and-int/lit8 p2, p1, 0x3

    .line 1176
    .line 1177
    const/4 v0, 0x2

    .line 1178
    const/4 v9, 0x1

    .line 1179
    const/4 v10, 0x0

    .line 1180
    if-eq p2, v0, :cond_2e

    .line 1181
    .line 1182
    move p2, v9

    .line 1183
    goto :goto_8

    .line 1184
    :cond_2e
    move p2, v10

    .line 1185
    :goto_8
    and-int/2addr p1, v9

    .line 1186
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1187
    .line 1188
    .line 1189
    move-result p1

    .line 1190
    if-eqz p1, :cond_3b

    .line 1191
    .line 1192
    const/4 v4, 0x0

    .line 1193
    const/16 v6, 0x6db0

    .line 1194
    .line 1195
    iget-object v0, p0, Lwb/pe;->h:Landroid/content/SharedPreferences;

    .line 1196
    .line 1197
    const-string v1, "group_member_reply_enable"

    .line 1198
    .line 1199
    const-string v2, "\u542f\u7528\u81ea\u52a8\u56de\u590d"

    .line 1200
    .line 1201
    const-string v3, "\u53ea\u5bf9\u4e0b\u65b9\u76d1\u542c\u7fa4\u751f\u6548\uff0c\u9ed8\u8ba4\u5173\u95ed"

    .line 1202
    .line 1203
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1204
    .line 1205
    .line 1206
    const/4 p1, 0x0

    .line 1207
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1208
    .line 1209
    .line 1210
    const/4 v4, 0x1

    .line 1211
    const-string v1, "group_member_reply_join_enable"

    .line 1212
    .line 1213
    const-string v2, "\u8fdb\u7fa4\u56de\u590d"

    .line 1214
    .line 1215
    const-string v3, "\u68c0\u6d4b\u5230\u65b0\u6210\u5458\u8fdb\u7fa4\u540e\u53d1\u9001\u6b22\u8fce\u5185\u5bb9"

    .line 1216
    .line 1217
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1218
    .line 1219
    .line 1220
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1221
    .line 1222
    .line 1223
    const-string v1, "group_member_reply_left_enable"

    .line 1224
    .line 1225
    const-string v2, "\u9000\u7fa4\u56de\u590d"

    .line 1226
    .line 1227
    const-string v3, "\u68c0\u6d4b\u5230\u6210\u5458\u9000\u7fa4\u540e\u53d1\u9001\u9000\u7fa4\u5185\u5bb9"

    .line 1228
    .line 1229
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1230
    .line 1231
    .line 1232
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1233
    .line 1234
    .line 1235
    iget-object p2, p0, Lwb/pe;->i:Li0/a1;

    .line 1236
    .line 1237
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object p2

    .line 1241
    check-cast p2, Ljava/lang/String;

    .line 1242
    .line 1243
    invoke-static {p2}, Lwb/ho;->Y5(Ljava/lang/String;)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object p2

    .line 1247
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    sget-object v11, Li0/l;->a:Li0/e;

    .line 1252
    .line 1253
    if-ne v0, v11, :cond_2f

    .line 1254
    .line 1255
    new-instance v0, Lwb/ud;

    .line 1256
    .line 1257
    const/16 v1, 0x16

    .line 1258
    .line 1259
    iget-object v2, p0, Lwb/pe;->j:Li0/a1;

    .line 1260
    .line 1261
    invoke-direct {v0, v2, v1}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1265
    .line 1266
    .line 1267
    :cond_2f
    check-cast v0, Lfg/a;

    .line 1268
    .line 1269
    const-string v1, "\u76d1\u542c\u7fa4\u4e0e\u4e13\u5c5e\u8bbe\u7f6e"

    .line 1270
    .line 1271
    const/16 v2, 0x186

    .line 1272
    .line 1273
    invoke-static {v1, p2, v0, v5, v2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1274
    .line 1275
    .line 1276
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1277
    .line 1278
    .line 1279
    iget-object p2, p0, Lwb/pe;->k:Li0/a1;

    .line 1280
    .line 1281
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    check-cast v0, Ljava/util/List;

    .line 1286
    .line 1287
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1288
    .line 1289
    .line 1290
    move-result v0

    .line 1291
    if-eqz v0, :cond_30

    .line 1292
    .line 1293
    const-string v0, "\u6682\u65e0\u6a21\u677f\uff0c\u8fdb\u5165\u540e\u6dfb\u52a0\u6279\u91cf\u914d\u7f6e"

    .line 1294
    .line 1295
    goto :goto_9

    .line 1296
    :cond_30
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v0

    .line 1300
    check-cast v0, Ljava/util/List;

    .line 1301
    .line 1302
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1303
    .line 1304
    .line 1305
    move-result v0

    .line 1306
    const-string v1, " \u4e2a\u6a21\u677f\uff0c\u8fdb\u5165\u540e\u4fee\u6539\u6216\u5220\u9664"

    .line 1307
    .line 1308
    invoke-static {v0, v1}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    :goto_9
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v1

    .line 1316
    if-ne v1, v11, :cond_31

    .line 1317
    .line 1318
    new-instance v1, Lwb/ud;

    .line 1319
    .line 1320
    const/16 v3, 0x17

    .line 1321
    .line 1322
    iget-object v4, p0, Lwb/pe;->l:Li0/a1;

    .line 1323
    .line 1324
    invoke-direct {v1, v4, v3}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1328
    .line 1329
    .line 1330
    :cond_31
    check-cast v1, Lfg/a;

    .line 1331
    .line 1332
    const-string v3, "\u56de\u590d\u6a21\u677f\u7ba1\u7406"

    .line 1333
    .line 1334
    invoke-static {v3, v0, v1, v5, v2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1335
    .line 1336
    .line 1337
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1338
    .line 1339
    .line 1340
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    check-cast v0, Ljava/util/List;

    .line 1345
    .line 1346
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1347
    .line 1348
    .line 1349
    move-result v0

    .line 1350
    if-eqz v0, :cond_32

    .line 1351
    .line 1352
    const-string p2, "\u5148\u65b0\u589e\u6a21\u677f\uff0c\u518d\u6279\u91cf\u7ed1\u5b9a\u76d1\u542c\u7fa4"

    .line 1353
    .line 1354
    goto :goto_a

    .line 1355
    :cond_32
    iget-object v0, p0, Lwb/pe;->m:Li0/a1;

    .line 1356
    .line 1357
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    check-cast v0, Ljava/util/List;

    .line 1362
    .line 1363
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1364
    .line 1365
    .line 1366
    move-result-object p2

    .line 1367
    check-cast p2, Ljava/util/List;

    .line 1368
    .line 1369
    invoke-static {v0, p2}, Lwb/ho;->H5(Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 1370
    .line 1371
    .line 1372
    move-result-object p2

    .line 1373
    :goto_a
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v0

    .line 1377
    if-ne v0, v11, :cond_33

    .line 1378
    .line 1379
    new-instance v0, Lwb/ud;

    .line 1380
    .line 1381
    const/16 v1, 0x18

    .line 1382
    .line 1383
    iget-object v3, p0, Lwb/pe;->n:Li0/a1;

    .line 1384
    .line 1385
    invoke-direct {v0, v3, v1}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1389
    .line 1390
    .line 1391
    :cond_33
    check-cast v0, Lfg/a;

    .line 1392
    .line 1393
    const-string v1, "\u6279\u91cf\u5957\u7528\u6a21\u677f"

    .line 1394
    .line 1395
    invoke-static {v1, p2, v0, v5, v2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1396
    .line 1397
    .line 1398
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1399
    .line 1400
    .line 1401
    iget-object p2, p0, Lwb/pe;->o:Li0/a1;

    .line 1402
    .line 1403
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    move-object v2, v0

    .line 1408
    check-cast v2, Ljava/lang/String;

    .line 1409
    .line 1410
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    if-ne v0, v11, :cond_34

    .line 1415
    .line 1416
    new-instance v0, Lwb/zd;

    .line 1417
    .line 1418
    const/16 v1, 0x18

    .line 1419
    .line 1420
    invoke-direct {v0, p2, v1}, Lwb/zd;-><init>(Li0/a1;I)V

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1424
    .line 1425
    .line 1426
    :cond_34
    move-object v3, v0

    .line 1427
    check-cast v3, Lfg/l;

    .line 1428
    .line 1429
    move-object v6, v5

    .line 1430
    const/16 v5, 0xc36

    .line 1431
    .line 1432
    const-string v0, "\u6574\u4f53\u5ef6\u8fdf"

    .line 1433
    .line 1434
    const-string v1, "\u5355\u4f4d\u79d2\uff0c0-600"

    .line 1435
    .line 1436
    move-object v4, v6

    .line 1437
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1438
    .line 1439
    .line 1440
    move-object v5, v4

    .line 1441
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1442
    .line 1443
    .line 1444
    iget-object p2, p0, Lwb/pe;->p:Li0/a1;

    .line 1445
    .line 1446
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    check-cast v0, Ljava/lang/String;

    .line 1451
    .line 1452
    const-string v1, "card"

    .line 1453
    .line 1454
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v1

    .line 1458
    const-string v12, "both"

    .line 1459
    .line 1460
    if-eqz v1, :cond_35

    .line 1461
    .line 1462
    const-string v0, "\u5361\u7247"

    .line 1463
    .line 1464
    :goto_b
    move-object v1, v0

    .line 1465
    goto :goto_c

    .line 1466
    :cond_35
    invoke-static {v0, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v0

    .line 1470
    if-eqz v0, :cond_36

    .line 1471
    .line 1472
    const-string v0, "\u6587\u672c+\u5361\u7247"

    .line 1473
    .line 1474
    goto :goto_b

    .line 1475
    :cond_36
    const-string v0, "\u6587\u672c"

    .line 1476
    .line 1477
    goto :goto_b

    .line 1478
    :goto_c
    invoke-static {}, Lwb/ho;->R5()Ljava/util/List;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v2

    .line 1482
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    move-object v3, v0

    .line 1487
    check-cast v3, Ljava/lang/String;

    .line 1488
    .line 1489
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v0

    .line 1493
    if-ne v0, v11, :cond_37

    .line 1494
    .line 1495
    new-instance v0, Lwb/zd;

    .line 1496
    .line 1497
    const/16 v4, 0x19

    .line 1498
    .line 1499
    invoke-direct {v0, p2, v4}, Lwb/zd;-><init>(Li0/a1;I)V

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1503
    .line 1504
    .line 1505
    :cond_37
    move-object v4, v0

    .line 1506
    check-cast v4, Lfg/l;

    .line 1507
    .line 1508
    const/16 v7, 0x6006

    .line 1509
    .line 1510
    const/16 v8, 0x20

    .line 1511
    .line 1512
    const-string v0, "\u63d0\u793a\u7c7b\u578b"

    .line 1513
    .line 1514
    move-object v6, v5

    .line 1515
    const/4 v5, 0x0

    .line 1516
    invoke-static/range {v0 .. v8}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 1517
    .line 1518
    .line 1519
    move-object v5, v6

    .line 1520
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1521
    .line 1522
    .line 1523
    move-result-object p2

    .line 1524
    check-cast p2, Ljava/lang/String;

    .line 1525
    .line 1526
    invoke-static {p2, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1527
    .line 1528
    .line 1529
    move-result p2

    .line 1530
    if-eqz p2, :cond_3a

    .line 1531
    .line 1532
    const p2, 0x631c1a91

    .line 1533
    .line 1534
    .line 1535
    invoke-virtual {v5, p2}, Li0/h0;->a0(I)V

    .line 1536
    .line 1537
    .line 1538
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1539
    .line 1540
    .line 1541
    iget-object p1, p0, Lwb/pe;->q:Li0/a1;

    .line 1542
    .line 1543
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1544
    .line 1545
    .line 1546
    move-result-object p2

    .line 1547
    check-cast p2, Ljava/lang/String;

    .line 1548
    .line 1549
    const-string v0, "card_first"

    .line 1550
    .line 1551
    invoke-static {p2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1552
    .line 1553
    .line 1554
    move-result p2

    .line 1555
    if-eqz p2, :cond_38

    .line 1556
    .line 1557
    const-string p2, "\u5148\u5361\u7247\u540e\u6587\u672c"

    .line 1558
    .line 1559
    :goto_d
    move-object v1, p2

    .line 1560
    goto :goto_e

    .line 1561
    :cond_38
    const-string p2, "\u5148\u6587\u672c\u540e\u5361\u7247"

    .line 1562
    .line 1563
    goto :goto_d

    .line 1564
    :goto_e
    invoke-static {}, Lwb/ho;->F5()Ljava/util/List;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v2

    .line 1568
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1569
    .line 1570
    .line 1571
    move-result-object p2

    .line 1572
    move-object v3, p2

    .line 1573
    check-cast v3, Ljava/lang/String;

    .line 1574
    .line 1575
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1576
    .line 1577
    .line 1578
    move-result-object p2

    .line 1579
    if-ne p2, v11, :cond_39

    .line 1580
    .line 1581
    new-instance p2, Lwb/zd;

    .line 1582
    .line 1583
    const/16 v0, 0x1a

    .line 1584
    .line 1585
    invoke-direct {p2, p1, v0}, Lwb/zd;-><init>(Li0/a1;I)V

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v5, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1589
    .line 1590
    .line 1591
    :cond_39
    move-object v4, p2

    .line 1592
    check-cast v4, Lfg/l;

    .line 1593
    .line 1594
    const/16 v7, 0x6006

    .line 1595
    .line 1596
    const/16 v8, 0x20

    .line 1597
    .line 1598
    const-string v0, "\u6587\u672c+\u5361\u7247\u987a\u5e8f"

    .line 1599
    .line 1600
    move-object v6, v5

    .line 1601
    const/4 v5, 0x0

    .line 1602
    invoke-static/range {v0 .. v8}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 1603
    .line 1604
    .line 1605
    move-object v5, v6

    .line 1606
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 1607
    .line 1608
    .line 1609
    goto :goto_f

    .line 1610
    :cond_3a
    const p1, 0x63233af7

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 1617
    .line 1618
    .line 1619
    goto :goto_f

    .line 1620
    :cond_3b
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1621
    .line 1622
    .line 1623
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1624
    .line 1625
    return-object p1

    .line 1626
    nop

    .line 1627
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
