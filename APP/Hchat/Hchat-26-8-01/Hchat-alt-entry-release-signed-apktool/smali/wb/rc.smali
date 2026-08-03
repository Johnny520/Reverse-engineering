.class public final synthetic Lwb/rc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/rc;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/rc;->h:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/rc;->i:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/rc;->j:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/rc;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/rc;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/rc;->m:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/rc;->n:Li0/a1;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lwb/rc;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/rc;->i:Ljava/util/List;

    iput-object p2, p0, Lwb/rc;->h:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lwb/rc;->j:Li0/a1;

    iput-object p4, p0, Lwb/rc;->k:Li0/a1;

    iput-object p5, p0, Lwb/rc;->l:Li0/a1;

    iput-object p6, p0, Lwb/rc;->m:Li0/a1;

    iput-object p7, p0, Lwb/rc;->n:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/rc;->g:I

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
    if-eqz p1, :cond_d

    .line 31
    .line 32
    iget-object p1, p0, Lwb/rc;->j:Li0/a1;

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
    iget-object p2, p0, Lwb/rc;->h:Landroid/content/SharedPreferences;

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
    new-instance v2, Lwb/me;

    .line 61
    .line 62
    const/16 v0, 0x1a

    .line 63
    .line 64
    invoke-direct {v2, p2, p1, v0}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    move-object v5, v2

    .line 71
    check-cast v5, Lfg/l;

    .line 72
    .line 73
    const/16 v7, 0x1b0

    .line 74
    .line 75
    const/16 v8, 0x8

    .line 76
    .line 77
    const-string v2, "\u5305\u542b\u5173\u952e\u8bcd\u7b5b\u9009"

    .line 78
    .line 79
    const-string v3, "\u5f00\u542f\u540e\uff0c\u6b63\u6587\u9700\u547d\u4e2d\u4efb\u610f\u5173\u952e\u8bcd\u624d\u8f6c\u53d1"

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    const/4 v0, 0x0

    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    const p1, 0x3f46a986

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lwb/rc;->k:Li0/a1;

    .line 108
    .line 109
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    move-object v3, v1

    .line 114
    check-cast v3, Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-nez v1, :cond_3

    .line 125
    .line 126
    if-ne v2, v11, :cond_4

    .line 127
    .line 128
    :cond_3
    new-instance v2, Lwb/me;

    .line 129
    .line 130
    const/16 v1, 0x1b

    .line 131
    .line 132
    invoke-direct {v2, p2, p1, v1}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    move-object v5, v2

    .line 139
    check-cast v5, Lfg/l;

    .line 140
    .line 141
    const/16 v7, 0xc36

    .line 142
    .line 143
    const/4 v8, 0x0

    .line 144
    const-string v1, "\u5305\u542b\u5173\u952e\u8bcd"

    .line 145
    .line 146
    const-string v2, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 147
    .line 148
    const/4 v4, 0x2

    .line 149
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_5
    const p1, 0x3f4e498e

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 163
    .line 164
    .line 165
    :goto_1
    invoke-static {v0, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Lwb/rc;->l:Li0/a1;

    .line 169
    .line 170
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    if-nez v2, :cond_6

    .line 189
    .line 190
    if-ne v3, v11, :cond_7

    .line 191
    .line 192
    :cond_6
    new-instance v3, Lwb/me;

    .line 193
    .line 194
    const/16 v2, 0x1c

    .line 195
    .line 196
    invoke-direct {v3, p2, p1, v2}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_7
    move-object v5, v3

    .line 203
    check-cast v5, Lfg/l;

    .line 204
    .line 205
    const/16 v7, 0x1b0

    .line 206
    .line 207
    const/16 v8, 0x8

    .line 208
    .line 209
    const-string v2, "\u6392\u9664\u5173\u952e\u8bcd\u7b5b\u9009"

    .line 210
    .line 211
    const-string v3, "\u5f00\u542f\u540e\uff0c\u6b63\u6587\u547d\u4e2d\u4efb\u610f\u5173\u952e\u8bcd\u65f6\u4e0d\u8f6c\u53d1\uff0c\u4f18\u5148\u4e8e\u5305\u542b\u89c4\u5219"

    .line 212
    .line 213
    const/4 v4, 0x0

    .line 214
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 215
    .line 216
    .line 217
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    check-cast p1, Ljava/lang/Boolean;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-eqz p1, :cond_a

    .line 228
    .line 229
    const p1, 0x3f571da6

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 233
    .line 234
    .line 235
    invoke-static {v0, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 236
    .line 237
    .line 238
    iget-object p1, p0, Lwb/rc;->m:Li0/a1;

    .line 239
    .line 240
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    move-object v3, v1

    .line 245
    check-cast v3, Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    if-nez v1, :cond_8

    .line 256
    .line 257
    if-ne v2, v11, :cond_9

    .line 258
    .line 259
    :cond_8
    new-instance v2, Lwb/me;

    .line 260
    .line 261
    const/16 v1, 0x1d

    .line 262
    .line 263
    invoke-direct {v2, p2, p1, v1}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_9
    move-object v5, v2

    .line 270
    check-cast v5, Lfg/l;

    .line 271
    .line 272
    const/16 v7, 0xc36

    .line 273
    .line 274
    const/4 v8, 0x0

    .line 275
    const-string v1, "\u6392\u9664\u5173\u952e\u8bcd"

    .line 276
    .line 277
    const-string v2, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 278
    .line 279
    const/4 v4, 0x2

    .line 280
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 284
    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_a
    const p1, 0x3f5ebdae

    .line 288
    .line 289
    .line 290
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 294
    .line 295
    .line 296
    :goto_2
    invoke-static {v0, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 297
    .line 298
    .line 299
    iget-object p1, p0, Lwb/rc;->n:Li0/a1;

    .line 300
    .line 301
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    move-object v3, v0

    .line 306
    check-cast v3, Ljava/lang/String;

    .line 307
    .line 308
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    if-nez v0, :cond_b

    .line 317
    .line 318
    if-ne v1, v11, :cond_c

    .line 319
    .line 320
    :cond_b
    new-instance v1, Lwb/qg;

    .line 321
    .line 322
    const/4 v0, 0x0

    .line 323
    invoke-direct {v1, p2, p1, v0}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_c
    check-cast v1, Lfg/l;

    .line 330
    .line 331
    const/16 v8, 0x6036

    .line 332
    .line 333
    const/4 v9, 0x0

    .line 334
    move-object v7, v6

    .line 335
    move-object v6, v1

    .line 336
    const-string v1, "\u6587\u6848\u6a21\u677f"

    .line 337
    .line 338
    const-string v2, "\u652f\u6301\u4e0b\u65b9\u53d8\u91cf"

    .line 339
    .line 340
    iget-object v4, p0, Lwb/rc;->i:Ljava/util/List;

    .line 341
    .line 342
    const/4 v5, 0x3

    .line 343
    invoke-static/range {v1 .. v9}, Lwb/ho;->i4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;Li0/h0;II)V

    .line 344
    .line 345
    .line 346
    goto :goto_3

    .line 347
    :cond_d
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 348
    .line 349
    .line 350
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 351
    .line 352
    return-object p1

    .line 353
    :pswitch_0
    move-object v4, p1

    .line 354
    check-cast v4, Li0/h0;

    .line 355
    .line 356
    check-cast p2, Ljava/lang/Integer;

    .line 357
    .line 358
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    and-int/lit8 p2, p1, 0x3

    .line 363
    .line 364
    const/4 v9, 0x0

    .line 365
    const/4 v10, 0x1

    .line 366
    const/4 v11, 0x2

    .line 367
    if-eq p2, v11, :cond_e

    .line 368
    .line 369
    move p2, v10

    .line 370
    goto :goto_4

    .line 371
    :cond_e
    move p2, v9

    .line 372
    :goto_4
    and-int/2addr p1, v10

    .line 373
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 374
    .line 375
    .line 376
    move-result p1

    .line 377
    if-eqz p1, :cond_18

    .line 378
    .line 379
    iget-object p1, p0, Lwb/rc;->j:Li0/a1;

    .line 380
    .line 381
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    move-object v3, p2

    .line 386
    check-cast v3, Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p2

    .line 392
    sget-object v12, Li0/l;->a:Li0/e;

    .line 393
    .line 394
    if-ne p2, v12, :cond_f

    .line 395
    .line 396
    new-instance p2, Lwb/mf;

    .line 397
    .line 398
    const/16 v0, 0xc

    .line 399
    .line 400
    invoke-direct {p2, p1, v0}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_f
    check-cast p2, Lfg/l;

    .line 407
    .line 408
    const/16 v7, 0x6036

    .line 409
    .line 410
    const/16 v8, 0x20

    .line 411
    .line 412
    const-string v0, "\u6536\u6b3e\u4f4d\u7f6e"

    .line 413
    .line 414
    const-string v1, "\u4f7f\u7528\u5fae\u4fe1\u5f53\u524d\u8d26\u53f7\u63d0\u4f9b\u7684\u6536\u6b3e\u8d26\u6237"

    .line 415
    .line 416
    iget-object v2, p0, Lwb/rc;->i:Ljava/util/List;

    .line 417
    .line 418
    const/4 v5, 0x0

    .line 419
    move-object v6, v4

    .line 420
    move-object v4, p2

    .line 421
    invoke-static/range {v0 .. v8}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 422
    .line 423
    .line 424
    move-object v4, v6

    .line 425
    const/4 p1, 0x0

    .line 426
    invoke-static {p1, v4, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 427
    .line 428
    .line 429
    const/4 v4, 0x0

    .line 430
    move-object v5, v6

    .line 431
    const/16 v6, 0x6db0

    .line 432
    .line 433
    iget-object v0, p0, Lwb/rc;->h:Landroid/content/SharedPreferences;

    .line 434
    .line 435
    const-string v1, "transfer_refund_rejected"

    .line 436
    .line 437
    const-string v2, "\u62d2\u6536\u65f6\u9000\u56de"

    .line 438
    .line 439
    const-string v3, "\u89c4\u5219\u4e0d\u901a\u8fc7\u65f6\u539f\u8def\u9000\u56de"

    .line 440
    .line 441
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 442
    .line 443
    .line 444
    move-object v4, v5

    .line 445
    invoke-static {p1, v4, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 446
    .line 447
    .line 448
    iget-object p2, p0, Lwb/rc;->k:Li0/a1;

    .line 449
    .line 450
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    check-cast v0, Ljava/lang/Number;

    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    if-eq v0, v10, :cond_11

    .line 461
    .line 462
    if-eq v0, v11, :cond_10

    .line 463
    .line 464
    const-string v0, "\u65e0\u5ef6\u8fdf"

    .line 465
    .line 466
    :goto_5
    move-object v1, v0

    .line 467
    goto :goto_6

    .line 468
    :cond_10
    const-string v0, "\u81ea\u5b9a\u4e49\u5ef6\u8fdf"

    .line 469
    .line 470
    goto :goto_5

    .line 471
    :cond_11
    const-string v0, "\u968f\u673a\u5ef6\u8fdf"

    .line 472
    .line 473
    goto :goto_5

    .line 474
    :goto_6
    invoke-static {}, Lwb/ho;->F6()Ljava/util/ArrayList;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    check-cast v0, Ljava/lang/Number;

    .line 483
    .line 484
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    if-ne v0, v12, :cond_12

    .line 493
    .line 494
    new-instance v0, Lwb/mf;

    .line 495
    .line 496
    const/16 v5, 0xd

    .line 497
    .line 498
    invoke-direct {v0, p2, v5}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v4, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    :cond_12
    check-cast v0, Lfg/l;

    .line 505
    .line 506
    const/4 v5, 0x0

    .line 507
    const/16 v7, 0x6006

    .line 508
    .line 509
    move-object v6, v4

    .line 510
    move-object v4, v0

    .line 511
    const-string v0, "\u6536\u6b3e\u5ef6\u8fdf"

    .line 512
    .line 513
    invoke-static/range {v0 .. v7}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 514
    .line 515
    .line 516
    move-object v4, v6

    .line 517
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    check-cast v0, Ljava/lang/Number;

    .line 522
    .line 523
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    if-ne v0, v11, :cond_14

    .line 528
    .line 529
    const p2, -0x5f763c97

    .line 530
    .line 531
    .line 532
    invoke-virtual {v4, p2}, Li0/h0;->a0(I)V

    .line 533
    .line 534
    .line 535
    invoke-static {p1, v4, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 536
    .line 537
    .line 538
    iget-object p1, p0, Lwb/rc;->l:Li0/a1;

    .line 539
    .line 540
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object p2

    .line 544
    move-object v2, p2

    .line 545
    check-cast v2, Ljava/lang/String;

    .line 546
    .line 547
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object p2

    .line 551
    if-ne p2, v12, :cond_13

    .line 552
    .line 553
    new-instance p2, Lwb/mf;

    .line 554
    .line 555
    const/16 v0, 0xe

    .line 556
    .line 557
    invoke-direct {p2, p1, v0}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    :cond_13
    move-object v3, p2

    .line 564
    check-cast v3, Lfg/l;

    .line 565
    .line 566
    const/16 v5, 0xc36

    .line 567
    .line 568
    const-string v0, "\u81ea\u5b9a\u4e49\u5ef6\u8fdf"

    .line 569
    .line 570
    const-string v1, "\u5355\u4f4d ms"

    .line 571
    .line 572
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v4, v9}, Li0/h0;->p(Z)V

    .line 576
    .line 577
    .line 578
    goto :goto_7

    .line 579
    :cond_14
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object p2

    .line 583
    check-cast p2, Ljava/lang/Number;

    .line 584
    .line 585
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 586
    .line 587
    .line 588
    move-result p2

    .line 589
    if-ne p2, v10, :cond_17

    .line 590
    .line 591
    const p2, -0x5f733e30

    .line 592
    .line 593
    .line 594
    invoke-virtual {v4, p2}, Li0/h0;->a0(I)V

    .line 595
    .line 596
    .line 597
    invoke-static {p1, v4, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 598
    .line 599
    .line 600
    iget-object p2, p0, Lwb/rc;->m:Li0/a1;

    .line 601
    .line 602
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    move-object v2, v0

    .line 607
    check-cast v2, Ljava/lang/String;

    .line 608
    .line 609
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    if-ne v0, v12, :cond_15

    .line 614
    .line 615
    new-instance v0, Lwb/mf;

    .line 616
    .line 617
    const/16 v1, 0xf

    .line 618
    .line 619
    invoke-direct {v0, p2, v1}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v4, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    :cond_15
    move-object v3, v0

    .line 626
    check-cast v3, Lfg/l;

    .line 627
    .line 628
    const/16 v5, 0xc36

    .line 629
    .line 630
    const-string v0, "\u6700\u5c0f\u5ef6\u8fdf"

    .line 631
    .line 632
    const-string v1, "\u5355\u4f4d ms"

    .line 633
    .line 634
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 635
    .line 636
    .line 637
    invoke-static {p1, v4, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 638
    .line 639
    .line 640
    iget-object p1, p0, Lwb/rc;->n:Li0/a1;

    .line 641
    .line 642
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object p2

    .line 646
    move-object v2, p2

    .line 647
    check-cast v2, Ljava/lang/String;

    .line 648
    .line 649
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object p2

    .line 653
    if-ne p2, v12, :cond_16

    .line 654
    .line 655
    new-instance p2, Lwb/mf;

    .line 656
    .line 657
    const/16 v0, 0x10

    .line 658
    .line 659
    invoke-direct {p2, p1, v0}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    :cond_16
    move-object v3, p2

    .line 666
    check-cast v3, Lfg/l;

    .line 667
    .line 668
    const/16 v5, 0xc36

    .line 669
    .line 670
    const-string v0, "\u6700\u5927\u5ef6\u8fdf"

    .line 671
    .line 672
    const-string v1, "\u5355\u4f4d ms"

    .line 673
    .line 674
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v4, v9}, Li0/h0;->p(Z)V

    .line 678
    .line 679
    .line 680
    goto :goto_7

    .line 681
    :cond_17
    const p1, -0x5f6f71ed

    .line 682
    .line 683
    .line 684
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v4, v9}, Li0/h0;->p(Z)V

    .line 688
    .line 689
    .line 690
    goto :goto_7

    .line 691
    :cond_18
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 692
    .line 693
    .line 694
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 695
    .line 696
    return-object p1

    .line 697
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
