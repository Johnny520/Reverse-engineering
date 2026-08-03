.class public final synthetic Lw/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lh0/d1;ZI)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    iput p3, p0, Lw/v;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lw/v;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lw/v;->h:Z

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 12
    iput p3, p0, Lw/v;->g:I

    iput-boolean p1, p0, Lw/v;->h:Z

    iput-object p2, p0, Lw/v;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lw/v;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw/v;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li0/a1;

    .line 9
    .line 10
    move-object v6, p1

    .line 11
    check-cast v6, Li0/h0;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    and-int/lit8 p2, p1, 0x3

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    const/4 v2, 0x1

    .line 23
    if-eq p2, v1, :cond_0

    .line 24
    .line 25
    move p2, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p2, 0x0

    .line 28
    :goto_0
    and-int/2addr p1, v2

    .line 29
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget-boolean p1, p0, Lw/v;->h:Z

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    const-string p1, "\u6807\u7b7e\u540d\u79f0"

    .line 40
    .line 41
    :goto_1
    move-object v2, p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p1, "\u6635\u79f0 / \u7fa4\u804a\u5907\u6ce8 / wxid"

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :goto_2
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    move-object v3, p1

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v6, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    sget-object p1, Li0/l;->a:Li0/e;

    .line 64
    .line 65
    if-ne p2, p1, :cond_3

    .line 66
    .line 67
    :cond_2
    new-instance p2, Lwb/aj;

    .line 68
    .line 69
    const/16 p1, 0x10

    .line 70
    .line 71
    invoke-direct {p2, v0, p1}, Lwb/aj;-><init>(Li0/a1;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    move-object v5, p2

    .line 78
    check-cast v5, Lfg/l;

    .line 79
    .line 80
    const/4 v7, 0x6

    .line 81
    const/16 v8, 0x8

    .line 82
    .line 83
    const-string v1, "\u641c\u7d22"

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 91
    .line 92
    .line 93
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 94
    .line 95
    return-object p1

    .line 96
    :pswitch_0
    iget-object v0, p0, Lw/v;->i:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Le9/c;

    .line 99
    .line 100
    move-object v4, p1

    .line 101
    check-cast v4, Li0/h0;

    .line 102
    .line 103
    check-cast p2, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    and-int/lit8 p2, p1, 0x3

    .line 110
    .line 111
    const/4 v1, 0x2

    .line 112
    const/4 v7, 0x1

    .line 113
    const/4 v8, 0x0

    .line 114
    if-eq p2, v1, :cond_5

    .line 115
    .line 116
    move p2, v7

    .line 117
    goto :goto_4

    .line 118
    :cond_5
    move p2, v8

    .line 119
    :goto_4
    and-int/2addr p1, v7

    .line 120
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_a

    .line 125
    .line 126
    iget-boolean p1, p0, Lw/v;->h:Z

    .line 127
    .line 128
    if-eqz p1, :cond_8

    .line 129
    .line 130
    const p1, 0x5f86f73b

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 134
    .line 135
    .line 136
    iget-boolean p1, v0, Le9/c;->e:Z

    .line 137
    .line 138
    if-eqz p1, :cond_6

    .line 139
    .line 140
    const-string p1, "\u672a\u5355\u72ec\u914d\u7f6e\u7684\u516c\u4f17\u53f7"

    .line 141
    .line 142
    :goto_5
    move-object v2, p1

    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget-boolean p1, v0, Le9/c;->d:Z

    .line 145
    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    const-string p1, "\u672a\u5355\u72ec\u914d\u7f6e\u7684\u7fa4\u804a"

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_7
    const-string p1, "\u672a\u5355\u72ec\u914d\u7f6e\u7684\u79c1\u804a"

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :goto_6
    const/4 v5, 0x6

    .line 155
    const/4 v6, 0x4

    .line 156
    const-string v1, "\u7c7b\u578b"

    .line 157
    .line 158
    const/4 v3, 0x0

    .line 159
    invoke-static/range {v1 .. v6}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v8}, Li0/h0;->p(Z)V

    .line 163
    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_8
    const p1, 0x5f8c7e17

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 170
    .line 171
    .line 172
    iget-object p1, v0, Le9/c;->c:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-eqz p2, :cond_9

    .line 179
    .line 180
    iget-object p1, v0, Le9/c;->b:Ljava/lang/String;

    .line 181
    .line 182
    :cond_9
    move-object v2, p1

    .line 183
    const/4 v5, 0x6

    .line 184
    const/4 v6, 0x4

    .line 185
    const-string v1, "\u540d\u79f0"

    .line 186
    .line 187
    const/4 v3, 0x0

    .line 188
    invoke-static/range {v1 .. v6}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 189
    .line 190
    .line 191
    const/4 p1, 0x0

    .line 192
    invoke-static {p1, v4, v8, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 193
    .line 194
    .line 195
    iget-object v2, v0, Le9/c;->b:Ljava/lang/String;

    .line 196
    .line 197
    const-string v1, "ID"

    .line 198
    .line 199
    invoke-static/range {v1 .. v6}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v8}, Li0/h0;->p(Z)V

    .line 203
    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_a
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 207
    .line 208
    .line 209
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 210
    .line 211
    return-object p1

    .line 212
    :pswitch_1
    iget-object v0, p0, Lw/v;->i:Ljava/lang/Object;

    .line 213
    .line 214
    move-object v2, v0

    .line 215
    check-cast v2, Ljava/lang/String;

    .line 216
    .line 217
    move-object v4, p1

    .line 218
    check-cast v4, Li0/h0;

    .line 219
    .line 220
    check-cast p2, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    and-int/lit8 p2, p1, 0x3

    .line 227
    .line 228
    const/4 v0, 0x2

    .line 229
    const/4 v1, 0x1

    .line 230
    const/4 v9, 0x0

    .line 231
    if-eq p2, v0, :cond_b

    .line 232
    .line 233
    move p2, v1

    .line 234
    goto :goto_8

    .line 235
    :cond_b
    move p2, v9

    .line 236
    :goto_8
    and-int/2addr p1, v1

    .line 237
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-eqz p1, :cond_e

    .line 242
    .line 243
    iget-boolean p1, p0, Lw/v;->h:Z

    .line 244
    .line 245
    if-eqz p1, :cond_c

    .line 246
    .line 247
    const-string p1, "\u5904\u7406\u4e2d"

    .line 248
    .line 249
    goto :goto_9

    .line 250
    :cond_c
    const-string p1, "\u5f85\u5f00\u59cb"

    .line 251
    .line 252
    :goto_9
    const/4 v7, 0x6

    .line 253
    const/4 v8, 0x4

    .line 254
    const-string v3, "\u5f53\u524d\u72b6\u6001"

    .line 255
    .line 256
    const/4 v5, 0x0

    .line 257
    move-object v6, v4

    .line 258
    move-object v4, p1

    .line 259
    invoke-static/range {v3 .. v8}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 260
    .line 261
    .line 262
    move-object v4, v6

    .line 263
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    if-nez p1, :cond_d

    .line 268
    .line 269
    const p1, 0x62c40125

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 273
    .line 274
    .line 275
    const/4 p1, 0x0

    .line 276
    invoke-static {p1, v4, v9, v1}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 277
    .line 278
    .line 279
    const/4 v5, 0x6

    .line 280
    const/4 v6, 0x4

    .line 281
    const-string v1, "\u6700\u8fd1\u7ed3\u679c"

    .line 282
    .line 283
    const/4 v3, 0x0

    .line 284
    invoke-static/range {v1 .. v6}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4, v9}, Li0/h0;->p(Z)V

    .line 288
    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_d
    const p1, 0x62c5ad17

    .line 292
    .line 293
    .line 294
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, v9}, Li0/h0;->p(Z)V

    .line 298
    .line 299
    .line 300
    goto :goto_a

    .line 301
    :cond_e
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 302
    .line 303
    .line 304
    :goto_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 305
    .line 306
    return-object p1

    .line 307
    :pswitch_2
    iget-object v0, p0, Lw/v;->i:Ljava/lang/Object;

    .line 308
    .line 309
    move-object v5, v0

    .line 310
    check-cast v5, Lfg/l;

    .line 311
    .line 312
    move-object v6, p1

    .line 313
    check-cast v6, Li0/h0;

    .line 314
    .line 315
    check-cast p2, Ljava/lang/Integer;

    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 318
    .line 319
    .line 320
    move-result p1

    .line 321
    and-int/lit8 p2, p1, 0x3

    .line 322
    .line 323
    const/4 v0, 0x2

    .line 324
    const/4 v1, 0x1

    .line 325
    if-eq p2, v0, :cond_f

    .line 326
    .line 327
    move p2, v1

    .line 328
    goto :goto_b

    .line 329
    :cond_f
    const/4 p2, 0x0

    .line 330
    :goto_b
    and-int/2addr p1, v1

    .line 331
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    if-eqz p1, :cond_11

    .line 336
    .line 337
    iget-boolean v1, p0, Lw/v;->h:Z

    .line 338
    .line 339
    if-eqz v1, :cond_10

    .line 340
    .line 341
    const-string p1, "\u5df2\u5f52\u62e2\u4f1a\u8bdd\u4ece\u5fae\u4fe1\u9996\u9875\u9690\u85cf"

    .line 342
    .line 343
    :goto_c
    move-object v3, p1

    .line 344
    goto :goto_d

    .line 345
    :cond_10
    const-string p1, "\u5206\u7ec4\u914d\u7f6e\u4fdd\u7559\uff0c\u4f1a\u8bdd\u6062\u590d\u5728\u5fae\u4fe1\u9996\u9875\u663e\u793a"

    .line 346
    .line 347
    goto :goto_c

    .line 348
    :goto_d
    const/16 v7, 0x30

    .line 349
    .line 350
    const/16 v8, 0x8

    .line 351
    .line 352
    const-string v2, "\u804a\u5929\u5206\u7ec4"

    .line 353
    .line 354
    const/4 v4, 0x0

    .line 355
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 356
    .line 357
    .line 358
    goto :goto_e

    .line 359
    :cond_11
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 360
    .line 361
    .line 362
    :goto_e
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 363
    .line 364
    return-object p1

    .line 365
    :pswitch_3
    iget-object v0, p0, Lw/v;->i:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Lh0/d1;

    .line 368
    .line 369
    check-cast p1, Li0/h0;

    .line 370
    .line 371
    check-cast p2, Ljava/lang/Integer;

    .line 372
    .line 373
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    const/4 p2, 0x1

    .line 377
    invoke-static {p2}, Li0/r;->C(I)I

    .line 378
    .line 379
    .line 380
    move-result p2

    .line 381
    iget-boolean v1, p0, Lw/v;->h:Z

    .line 382
    .line 383
    invoke-static {v0, v1, p1, p2}, Lw/s;->i(Lh0/d1;ZLi0/h0;I)V

    .line 384
    .line 385
    .line 386
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 387
    .line 388
    return-object p1

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
