.class public final Lk5/a0;
.super Lo5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic j:Lk5/b0;


# direct methods
.method public constructor <init>(Lk5/b0;Landroidx/lifecycle/x;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/a0;->j:Lk5/b0;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lo5/t;-><init>(Landroidx/lifecycle/x;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La5/a;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p1, La5/a;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lk5/a0;->j:Lk5/b0;

    .line 4
    .line 5
    iget v2, v1, Lk5/b0;->h:I

    .line 6
    .line 7
    iget-object v1, v1, Lk5/b0;->i:Lac/k;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-lt v0, v2, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x3

    .line 13
    iput p1, p0, Lo5/t;->g:I

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    iget-object v4, v1, Lac/k;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Lk5/u;

    .line 19
    .line 20
    iget-object v5, p1, La5/a;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Landroidx/lifecycle/x;

    .line 23
    .line 24
    invoke-virtual {v5, v0}, Landroidx/lifecycle/x;->O(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget v0, p1, La5/a;->h:I

    .line 31
    .line 32
    invoke-virtual {v5, v0}, Landroidx/lifecycle/x;->P(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    :cond_1
    iget-object v5, v4, Lk5/u;->c:Lf5/g;

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/16 v6, 0x100

    .line 42
    .line 43
    if-eq v0, v6, :cond_5

    .line 44
    .line 45
    const/16 v6, 0x200

    .line 46
    .line 47
    if-eq v0, v6, :cond_4

    .line 48
    .line 49
    const/16 v6, 0x300

    .line 50
    .line 51
    if-eq v0, v6, :cond_3

    .line 52
    .line 53
    if-ltz v0, :cond_2

    .line 54
    .line 55
    iget-object v5, v5, Lf5/g;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v5, [Lf5/f;

    .line 58
    .line 59
    array-length v6, v5

    .line 60
    if-ge v0, v6, :cond_2

    .line 61
    .line 62
    aget-object v0, v5, v0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v0, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    sget-object v0, Lf5/f;->u:Lf5/f;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    sget-object v0, Lf5/f;->t:Lf5/f;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    sget-object v0, Lf5/f;->s:Lf5/f;

    .line 74
    .line 75
    :goto_0
    iget v5, p1, La5/a;->h:I

    .line 76
    .line 77
    iget-object v6, v4, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    if-nez v0, :cond_6

    .line 83
    .line 84
    new-instance v0, Ll5/f0;

    .line 85
    .line 86
    sget-object v6, Lf5/f;->n:Lf5/f;

    .line 87
    .line 88
    invoke-direct {v0, v4, v6, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :cond_6
    iget v6, v0, Lf5/f;->m:I

    .line 94
    .line 95
    invoke-static {v6}, Lt3/c;->b(I)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    packed-switch v7, :pswitch_data_0

    .line 100
    .line 101
    .line 102
    new-instance p1, Ld6/f;

    .line 103
    .line 104
    invoke-static {v6}, Leh/a;->B(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v1, "Unexpected opcode format: %s"

    .line 113
    .line 114
    invoke-direct {p1, v3, v1, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :pswitch_0
    new-instance v0, Ll5/e0;

    .line 119
    .line 120
    invoke-direct {v0, v4, v5}, Ll5/e0;-><init>(Lk5/u;I)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_2

    .line 124
    .line 125
    :pswitch_1
    new-instance v0, Ll5/c0;

    .line 126
    .line 127
    invoke-direct {v0, v4, v5}, Ll5/c0;-><init>(Lk5/u;I)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_2

    .line 131
    .line 132
    :pswitch_2
    new-instance v0, Ll5/b;

    .line 133
    .line 134
    invoke-direct {v0, v4, v5}, Ll5/b;-><init>(Lk5/u;I)V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :pswitch_3
    new-instance v6, Ll5/j;

    .line 140
    .line 141
    const/4 v7, 0x1

    .line 142
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/j;-><init>(Lk5/u;Lf5/f;II)V

    .line 143
    .line 144
    .line 145
    :goto_1
    move-object v0, v6

    .line 146
    goto/16 :goto_2

    .line 147
    .line 148
    :pswitch_4
    new-instance v6, Ll5/z;

    .line 149
    .line 150
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :pswitch_5
    new-instance v6, Ll5/y;

    .line 155
    .line 156
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :pswitch_6
    new-instance v6, Ll5/x;

    .line 161
    .line 162
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :pswitch_7
    new-instance v6, Ll5/w;

    .line 167
    .line 168
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :pswitch_8
    new-instance v6, Ll5/v;

    .line 173
    .line 174
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :pswitch_9
    new-instance v6, Ll5/u;

    .line 179
    .line 180
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :pswitch_a
    new-instance v6, Ll5/t;

    .line 185
    .line 186
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :pswitch_b
    new-instance v6, Ll5/s;

    .line 191
    .line 192
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :pswitch_c
    new-instance v6, Ll5/g;

    .line 197
    .line 198
    const/4 v7, 0x2

    .line 199
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/g;-><init>(Lk5/u;Lf5/f;II)V

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :pswitch_d
    new-instance v6, Ll5/r;

    .line 204
    .line 205
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :pswitch_e
    new-instance v6, Ll5/e;

    .line 210
    .line 211
    const/4 v7, 0x3

    .line 212
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/e;-><init>(Lk5/u;Lf5/f;II)V

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :pswitch_f
    new-instance v6, Ll5/q;

    .line 217
    .line 218
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 219
    .line 220
    .line 221
    goto :goto_1

    .line 222
    :pswitch_10
    new-instance v6, Ll5/c;

    .line 223
    .line 224
    const/4 v7, 0x2

    .line 225
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/c;-><init>(Lk5/u;Lf5/f;II)V

    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :pswitch_11
    new-instance v6, Ll5/p;

    .line 230
    .line 231
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 232
    .line 233
    .line 234
    goto :goto_1

    .line 235
    :pswitch_12
    new-instance v6, Ll5/g;

    .line 236
    .line 237
    const/4 v7, 0x1

    .line 238
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/g;-><init>(Lk5/u;Lf5/f;II)V

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :pswitch_13
    new-instance v6, Ll5/o;

    .line 243
    .line 244
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 245
    .line 246
    .line 247
    goto :goto_1

    .line 248
    :pswitch_14
    new-instance v6, Ll5/l;

    .line 249
    .line 250
    const/4 v7, 0x1

    .line 251
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/l;-><init>(Lk5/u;Lf5/f;II)V

    .line 252
    .line 253
    .line 254
    goto :goto_1

    .line 255
    :pswitch_15
    new-instance v6, Ll5/n;

    .line 256
    .line 257
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 258
    .line 259
    .line 260
    goto :goto_1

    .line 261
    :pswitch_16
    new-instance v6, Ll5/m;

    .line 262
    .line 263
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 264
    .line 265
    .line 266
    goto :goto_1

    .line 267
    :pswitch_17
    new-instance v6, Ll5/l;

    .line 268
    .line 269
    const/4 v7, 0x0

    .line 270
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/l;-><init>(Lk5/u;Lf5/f;II)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :pswitch_18
    new-instance v6, Ll5/k;

    .line 276
    .line 277
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_1

    .line 281
    .line 282
    :pswitch_19
    new-instance v6, Ll5/e;

    .line 283
    .line 284
    const/4 v7, 0x2

    .line 285
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/e;-><init>(Lk5/u;Lf5/f;II)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_1

    .line 289
    .line 290
    :pswitch_1a
    new-instance v6, Ll5/j;

    .line 291
    .line 292
    const/4 v7, 0x0

    .line 293
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/j;-><init>(Lk5/u;Lf5/f;II)V

    .line 294
    .line 295
    .line 296
    goto/16 :goto_1

    .line 297
    .line 298
    :pswitch_1b
    new-instance v6, Ll5/e;

    .line 299
    .line 300
    const/4 v7, 0x1

    .line 301
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/e;-><init>(Lk5/u;Lf5/f;II)V

    .line 302
    .line 303
    .line 304
    goto/16 :goto_1

    .line 305
    .line 306
    :pswitch_1c
    new-instance v6, Ll5/i;

    .line 307
    .line 308
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 309
    .line 310
    .line 311
    goto/16 :goto_1

    .line 312
    .line 313
    :pswitch_1d
    new-instance v6, Ll5/c;

    .line 314
    .line 315
    const/4 v7, 0x1

    .line 316
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/c;-><init>(Lk5/u;Lf5/f;II)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_1

    .line 320
    .line 321
    :pswitch_1e
    new-instance v6, Ll5/h;

    .line 322
    .line 323
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 324
    .line 325
    .line 326
    goto/16 :goto_1

    .line 327
    .line 328
    :pswitch_1f
    new-instance v6, Ll5/g;

    .line 329
    .line 330
    const/4 v7, 0x0

    .line 331
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/g;-><init>(Lk5/u;Lf5/f;II)V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_1

    .line 335
    .line 336
    :pswitch_20
    new-instance v6, Ll5/f;

    .line 337
    .line 338
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_1

    .line 342
    .line 343
    :pswitch_21
    new-instance v6, Ll5/e;

    .line 344
    .line 345
    const/4 v7, 0x0

    .line 346
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/e;-><init>(Lk5/u;Lf5/f;II)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_1

    .line 350
    .line 351
    :pswitch_22
    new-instance v6, Ll5/d;

    .line 352
    .line 353
    invoke-direct {v6, v4, v0, v5}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_1

    .line 357
    .line 358
    :pswitch_23
    new-instance v6, Ll5/c;

    .line 359
    .line 360
    const/4 v7, 0x0

    .line 361
    invoke-direct {v6, v4, v0, v5, v7}, Ll5/c;-><init>(Lk5/u;Lf5/f;II)V

    .line 362
    .line 363
    .line 364
    goto/16 :goto_1

    .line 365
    .line 366
    :goto_2
    invoke-interface {v0}, Lt5/d;->c()I

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    mul-int/lit8 v4, v4, 0x2

    .line 371
    .line 372
    iget v5, p1, La5/a;->h:I

    .line 373
    .line 374
    add-int/2addr v5, v4

    .line 375
    iput v5, p1, La5/a;->h:I

    .line 376
    .line 377
    if-gt v5, v2, :cond_7

    .line 378
    .line 379
    if-ltz v5, :cond_7

    .line 380
    .line 381
    return-object v0

    .line 382
    :cond_7
    new-instance p1, Ld6/f;

    .line 383
    .line 384
    iget-object v0, v1, Lac/k;->j:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v0, Lk5/z;

    .line 387
    .line 388
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    const-string v1, "The last instruction in method %s is truncated"

    .line 393
    .line 394
    invoke-direct {p1, v3, v1, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    throw p1

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
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
    .end packed-switch
.end method
