.class public abstract Lop0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Leb;

.field public static final b:Lkw;

.field public static final c:Lkw;

.field public static final d:Lz8;

.field public static final e:Leq1;

.field public static final f:Lpw;

.field public static final g:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Leb;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Leb;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lop0;->a:Leb;

    .line 8
    .line 9
    new-instance v0, Low;

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-direct {v0, v1}, Low;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lkw;

    .line 16
    .line 17
    const v2, 0x5ed1b7bc

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, v2, v3, v0}, Lkw;-><init>(IZLun0;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lop0;->b:Lkw;

    .line 25
    .line 26
    new-instance v0, Low;

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-direct {v0, v1}, Low;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lkw;

    .line 33
    .line 34
    const v2, -0x504168e1

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v2, v3, v0}, Lkw;-><init>(IZLun0;)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lop0;->c:Lkw;

    .line 41
    .line 42
    new-instance v0, Lz8;

    .line 43
    .line 44
    const/16 v1, 0x1c

    .line 45
    .line 46
    invoke-direct {v0, v1}, Lz8;-><init>(I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lop0;->d:Lz8;

    .line 50
    .line 51
    new-instance v0, Leq1;

    .line 52
    .line 53
    const/16 v1, 0xd

    .line 54
    .line 55
    invoke-direct {v0, v1}, Leq1;-><init>(I)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lop0;->e:Leq1;

    .line 59
    .line 60
    new-instance v0, Lpw;

    .line 61
    .line 62
    const/4 v1, 0x2

    .line 63
    invoke-direct {v0, v1}, Lpw;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lop0;->f:Lpw;

    .line 67
    .line 68
    new-instance v0, Ljava/lang/Object;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lop0;->g:Ljava/lang/Object;

    .line 74
    .line 75
    return-void
.end method

.method public static final A(Lsd;)Lqt;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lqt;

    .line 4
    .line 5
    iget-object v2, v0, Lsd;->j:Ljava/util/ArrayList;

    .line 6
    .line 7
    sget-object v3, Lbe0;->h:Lbe0;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v4, v2

    .line 14
    :goto_0
    iget-object v0, v0, Lsd;->i:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_1
    new-instance v4, Landroid/text/SpannableString;

    .line 25
    .line 26
    invoke-direct {v4, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lu40;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iput-object v5, v0, Lu40;->a:Landroid/os/Parcel;

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    move-object v2, v3

    .line 43
    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v6, 0x0

    .line 48
    :goto_1
    if-ge v6, v3, :cond_15

    .line 49
    .line 50
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    check-cast v7, Lrd;

    .line 55
    .line 56
    iget-object v8, v7, Lrd;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v8, Llt2;

    .line 59
    .line 60
    iget v9, v7, Lrd;->b:I

    .line 61
    .line 62
    iget v7, v7, Lrd;->c:I

    .line 63
    .line 64
    iget-object v10, v0, Lu40;->a:Landroid/os/Parcel;

    .line 65
    .line 66
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    iput-object v10, v0, Lu40;->a:Landroid/os/Parcel;

    .line 74
    .line 75
    iget-object v10, v8, Llt2;->a:Ll03;

    .line 76
    .line 77
    iget-wide v11, v8, Llt2;->l:J

    .line 78
    .line 79
    iget-wide v13, v8, Llt2;->h:J

    .line 80
    .line 81
    move v15, v6

    .line 82
    iget-wide v5, v8, Llt2;->b:J

    .line 83
    .line 84
    move-object/from16 v16, v2

    .line 85
    .line 86
    move/from16 v17, v3

    .line 87
    .line 88
    invoke-interface {v10}, Ll03;->b()J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    move/from16 v18, v9

    .line 93
    .line 94
    sget-wide v9, Lju;->g:J

    .line 95
    .line 96
    invoke-static {v2, v3, v9, v10}, Lju;->c(JJ)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    const/4 v3, 0x1

    .line 101
    if-nez v2, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0, v3}, Lu40;->c(B)V

    .line 104
    .line 105
    .line 106
    iget-object v2, v8, Llt2;->a:Ll03;

    .line 107
    .line 108
    move-object/from16 v19, v4

    .line 109
    .line 110
    invoke-interface {v2}, Ll03;->b()J

    .line 111
    .line 112
    .line 113
    move-result-wide v3

    .line 114
    iget-object v2, v0, Lu40;->a:Landroid/os/Parcel;

    .line 115
    .line 116
    invoke-virtual {v2, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    move-object/from16 v19, v4

    .line 121
    .line 122
    :goto_2
    sget-wide v2, Lp13;->c:J

    .line 123
    .line 124
    invoke-static {v5, v6, v2, v3}, Lp13;->a(JJ)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    move/from16 v20, v4

    .line 129
    .line 130
    const/4 v4, 0x2

    .line 131
    if-nez v20, :cond_4

    .line 132
    .line 133
    invoke-virtual {v0, v4}, Lu40;->c(B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v5, v6}, Lu40;->e(J)V

    .line 137
    .line 138
    .line 139
    :cond_4
    iget-object v5, v8, Llt2;->c:Lim0;

    .line 140
    .line 141
    const/4 v6, 0x3

    .line 142
    if-eqz v5, :cond_5

    .line 143
    .line 144
    invoke-virtual {v0, v6}, Lu40;->c(B)V

    .line 145
    .line 146
    .line 147
    iget v5, v5, Lim0;->h:I

    .line 148
    .line 149
    iget-object v6, v0, Lu40;->a:Landroid/os/Parcel;

    .line 150
    .line 151
    invoke-virtual {v6, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 152
    .line 153
    .line 154
    :cond_5
    iget-object v5, v8, Llt2;->d:Lgm0;

    .line 155
    .line 156
    if-eqz v5, :cond_8

    .line 157
    .line 158
    iget v5, v5, Lgm0;->a:I

    .line 159
    .line 160
    const/4 v6, 0x4

    .line 161
    invoke-virtual {v0, v6}, Lu40;->c(B)V

    .line 162
    .line 163
    .line 164
    if-nez v5, :cond_7

    .line 165
    .line 166
    :cond_6
    const/4 v6, 0x0

    .line 167
    goto :goto_3

    .line 168
    :cond_7
    const/4 v6, 0x1

    .line 169
    if-ne v5, v6, :cond_6

    .line 170
    .line 171
    const/4 v6, 0x1

    .line 172
    :goto_3
    invoke-virtual {v0, v6}, Lu40;->c(B)V

    .line 173
    .line 174
    .line 175
    :cond_8
    iget-object v5, v8, Llt2;->e:Lhm0;

    .line 176
    .line 177
    if-eqz v5, :cond_d

    .line 178
    .line 179
    iget v5, v5, Lhm0;->a:I

    .line 180
    .line 181
    const/4 v6, 0x5

    .line 182
    invoke-virtual {v0, v6}, Lu40;->c(B)V

    .line 183
    .line 184
    .line 185
    if-nez v5, :cond_a

    .line 186
    .line 187
    :cond_9
    const/4 v4, 0x0

    .line 188
    goto :goto_4

    .line 189
    :cond_a
    const v6, 0xffff

    .line 190
    .line 191
    .line 192
    if-ne v5, v6, :cond_b

    .line 193
    .line 194
    const/4 v4, 0x1

    .line 195
    goto :goto_4

    .line 196
    :cond_b
    const/4 v6, 0x1

    .line 197
    if-ne v5, v6, :cond_c

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_c
    if-ne v5, v4, :cond_9

    .line 201
    .line 202
    const/4 v4, 0x3

    .line 203
    :goto_4
    invoke-virtual {v0, v4}, Lu40;->c(B)V

    .line 204
    .line 205
    .line 206
    :cond_d
    iget-object v4, v8, Llt2;->g:Ljava/lang/String;

    .line 207
    .line 208
    if-eqz v4, :cond_e

    .line 209
    .line 210
    const/4 v5, 0x6

    .line 211
    invoke-virtual {v0, v5}, Lu40;->c(B)V

    .line 212
    .line 213
    .line 214
    iget-object v5, v0, Lu40;->a:Landroid/os/Parcel;

    .line 215
    .line 216
    invoke-virtual {v5, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    :cond_e
    invoke-static {v13, v14, v2, v3}, Lp13;->a(JJ)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-nez v2, :cond_f

    .line 224
    .line 225
    const/4 v2, 0x7

    .line 226
    invoke-virtual {v0, v2}, Lu40;->c(B)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v13, v14}, Lu40;->e(J)V

    .line 230
    .line 231
    .line 232
    :cond_f
    iget-object v2, v8, Llt2;->i:Lxj;

    .line 233
    .line 234
    if-eqz v2, :cond_10

    .line 235
    .line 236
    iget v2, v2, Lxj;->a:F

    .line 237
    .line 238
    const/16 v3, 0x8

    .line 239
    .line 240
    invoke-virtual {v0, v3}, Lu40;->c(B)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v2}, Lu40;->d(F)V

    .line 244
    .line 245
    .line 246
    :cond_10
    iget-object v2, v8, Llt2;->j:Lm03;

    .line 247
    .line 248
    if-eqz v2, :cond_11

    .line 249
    .line 250
    const/16 v3, 0x9

    .line 251
    .line 252
    invoke-virtual {v0, v3}, Lu40;->c(B)V

    .line 253
    .line 254
    .line 255
    iget v3, v2, Lm03;->a:F

    .line 256
    .line 257
    invoke-virtual {v0, v3}, Lu40;->d(F)V

    .line 258
    .line 259
    .line 260
    iget v2, v2, Lm03;->b:F

    .line 261
    .line 262
    invoke-virtual {v0, v2}, Lu40;->d(F)V

    .line 263
    .line 264
    .line 265
    :cond_11
    invoke-static {v11, v12, v9, v10}, Lju;->c(JJ)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-nez v2, :cond_12

    .line 270
    .line 271
    const/16 v2, 0xa

    .line 272
    .line 273
    invoke-virtual {v0, v2}, Lu40;->c(B)V

    .line 274
    .line 275
    .line 276
    iget-object v2, v0, Lu40;->a:Landroid/os/Parcel;

    .line 277
    .line 278
    invoke-virtual {v2, v11, v12}, Landroid/os/Parcel;->writeLong(J)V

    .line 279
    .line 280
    .line 281
    :cond_12
    iget-object v2, v8, Llt2;->m:Lgz2;

    .line 282
    .line 283
    if-eqz v2, :cond_13

    .line 284
    .line 285
    const/16 v3, 0xb

    .line 286
    .line 287
    invoke-virtual {v0, v3}, Lu40;->c(B)V

    .line 288
    .line 289
    .line 290
    iget v2, v2, Lgz2;->a:I

    .line 291
    .line 292
    iget-object v3, v0, Lu40;->a:Landroid/os/Parcel;

    .line 293
    .line 294
    invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 295
    .line 296
    .line 297
    :cond_13
    iget-object v2, v8, Llt2;->n:Lbq2;

    .line 298
    .line 299
    if-eqz v2, :cond_14

    .line 300
    .line 301
    const/16 v3, 0xc

    .line 302
    .line 303
    invoke-virtual {v0, v3}, Lu40;->c(B)V

    .line 304
    .line 305
    .line 306
    iget-wide v3, v2, Lbq2;->a:J

    .line 307
    .line 308
    iget-object v5, v0, Lu40;->a:Landroid/os/Parcel;

    .line 309
    .line 310
    invoke-virtual {v5, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 311
    .line 312
    .line 313
    iget-wide v3, v2, Lbq2;->b:J

    .line 314
    .line 315
    const/16 v5, 0x20

    .line 316
    .line 317
    shr-long v5, v3, v5

    .line 318
    .line 319
    long-to-int v5, v5

    .line 320
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    invoke-virtual {v0, v5}, Lu40;->d(F)V

    .line 325
    .line 326
    .line 327
    const-wide v5, 0xffffffffL

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    and-long/2addr v3, v5

    .line 333
    long-to-int v3, v3

    .line 334
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    invoke-virtual {v0, v3}, Lu40;->d(F)V

    .line 339
    .line 340
    .line 341
    iget v2, v2, Lbq2;->c:F

    .line 342
    .line 343
    invoke-virtual {v0, v2}, Lu40;->d(F)V

    .line 344
    .line 345
    .line 346
    :cond_14
    new-instance v2, Landroid/text/Annotation;

    .line 347
    .line 348
    iget-object v3, v0, Lu40;->a:Landroid/os/Parcel;

    .line 349
    .line 350
    invoke-virtual {v3}, Landroid/os/Parcel;->marshall()[B

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    const/4 v4, 0x0

    .line 355
    invoke-static {v3, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    const-string v5, "androidx.compose.text.SpanStyle"

    .line 360
    .line 361
    invoke-direct {v2, v5, v3}, Landroid/text/Annotation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    const/16 v3, 0x21

    .line 365
    .line 366
    move/from16 v6, v18

    .line 367
    .line 368
    move-object/from16 v5, v19

    .line 369
    .line 370
    invoke-virtual {v5, v2, v6, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 371
    .line 372
    .line 373
    add-int/lit8 v6, v15, 0x1

    .line 374
    .line 375
    move-object v4, v5

    .line 376
    move-object/from16 v2, v16

    .line 377
    .line 378
    move/from16 v3, v17

    .line 379
    .line 380
    goto/16 :goto_1

    .line 381
    .line 382
    :cond_15
    move-object v5, v4

    .line 383
    move-object v0, v5

    .line 384
    :goto_5
    const-string v2, "plain text"

    .line 385
    .line 386
    invoke-static {v2, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-direct {v1, v0}, Lqt;-><init>(Landroid/content/ClipData;)V

    .line 391
    .line 392
    .line 393
    return-object v1
.end method

.method public static final B([Lf42;Lyy1;Lyy1;)Lyy1;
    .locals 6

    .line 1
    sget-object v0, Lyy1;->k:Lyy1;

    .line 2
    .line 3
    new-instance v1, Lxy1;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lbz1;-><init>(Lzy1;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, v1, Lxy1;->n:Lyy1;

    .line 9
    .line 10
    array-length v0, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    aget-object v3, p0, v2

    .line 15
    .line 16
    iget-object v4, v3, Lf42;->a:Le42;

    .line 17
    .line 18
    iget-boolean v5, v3, Lf42;->f:Z

    .line 19
    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1, v4}, Lyy1;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_1

    .line 27
    .line 28
    :cond_0
    invoke-virtual {p2, v4}, Lyy1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Lm93;

    .line 33
    .line 34
    invoke-virtual {v4, v3, v5}, Le42;->c(Lf42;Lm93;)Lm93;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v1, v4, v3}, Lbz1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {v1}, Lxy1;->d()Lyy1;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static final C(II)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    move v2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v2, v0

    .line 10
    :goto_0
    if-nez v2, :cond_1

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "both minLines "

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v3, " and maxLines "

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v3, " must be greater than zero"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lnz0;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    if-gt p0, p1, :cond_2

    .line 43
    .line 44
    move v0, v1

    .line 45
    :cond_2
    if-nez v0, :cond_3

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "minLines "

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, " must be less than or equal to maxLines "

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lnz0;->a(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method public static final D(Lc61;)Lo62;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Ls11;->w(Lc61;Z)Lo62;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lo62;->d()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-interface {p0, v1, v2}, Lc61;->g(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iget v3, v0, Lo62;->c:F

    .line 15
    .line 16
    iget v0, v0, Lo62;->d:F

    .line 17
    .line 18
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    int-to-long v3, v3

    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-long v5, v0

    .line 28
    const/16 v0, 0x20

    .line 29
    .line 30
    shl-long/2addr v3, v0

    .line 31
    const-wide v7, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v5, v7

    .line 37
    or-long/2addr v3, v5

    .line 38
    invoke-interface {p0, v3, v4}, Lc61;->g(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    new-instance p0, Lo62;

    .line 43
    .line 44
    shr-long v5, v1, v0

    .line 45
    .line 46
    long-to-int v5, v5

    .line 47
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    and-long/2addr v1, v7

    .line 52
    long-to-int v1, v1

    .line 53
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    shr-long v9, v3, v0

    .line 58
    .line 59
    long-to-int v0, v9

    .line 60
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    and-long v2, v3, v7

    .line 65
    .line 66
    long-to-int v2, v2

    .line 67
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-direct {p0, v5, v1, v0, v2}, Lo62;-><init>(FFFF)V

    .line 72
    .line 73
    .line 74
    return-object p0
.end method

.method public static final a(Luh1;FJLpx;II)V
    .locals 12

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    check-cast v0, Lgo0;

    .line 4
    .line 5
    const v1, 0x47a9d25

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lgo0;->X(I)Lgo0;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, p6, 0x1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    or-int/lit8 v5, p5, 0x6

    .line 16
    .line 17
    move v6, v5

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v0, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    if-eqz v6, :cond_1

    .line 24
    .line 25
    const/4 v6, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v6, 0x2

    .line 28
    :goto_0
    or-int v6, p5, v6

    .line 29
    .line 30
    :goto_1
    invoke-virtual {v0, p2, p3}, Lgo0;->e(J)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const/16 v8, 0x100

    .line 35
    .line 36
    if-eqz v7, :cond_2

    .line 37
    .line 38
    move v7, v8

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/16 v7, 0x80

    .line 41
    .line 42
    :goto_2
    or-int/2addr v6, v7

    .line 43
    and-int/lit16 v7, v6, 0x93

    .line 44
    .line 45
    const/16 v9, 0x92

    .line 46
    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v11, 0x1

    .line 49
    if-eq v7, v9, :cond_3

    .line 50
    .line 51
    move v7, v11

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move v7, v10

    .line 54
    :goto_3
    and-int/lit8 v9, v6, 0x1

    .line 55
    .line 56
    invoke-virtual {v0, v9, v7}, Lgo0;->O(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_c

    .line 61
    .line 62
    invoke-virtual {v0}, Lgo0;->T()V

    .line 63
    .line 64
    .line 65
    and-int/lit8 v7, p5, 0x1

    .line 66
    .line 67
    if-eqz v7, :cond_6

    .line 68
    .line 69
    invoke-virtual {v0}, Lgo0;->y()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_4

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    invoke-virtual {v0}, Lgo0;->R()V

    .line 77
    .line 78
    .line 79
    :cond_5
    move-object v1, p0

    .line 80
    goto :goto_5

    .line 81
    :cond_6
    :goto_4
    if-eqz v1, :cond_5

    .line 82
    .line 83
    sget-object v1, Lrh1;->a:Lrh1;

    .line 84
    .line 85
    :goto_5
    invoke-virtual {v0}, Lgo0;->q()V

    .line 86
    .line 87
    .line 88
    sget-object v5, Lte;->e:Lyi0;

    .line 89
    .line 90
    invoke-interface {v1, v5}, Luh1;->c(Luh1;)Luh1;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v5, p1}, Lte;->O(Luh1;F)Luh1;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    and-int/lit16 v7, v6, 0x380

    .line 99
    .line 100
    xor-int/lit16 v7, v7, 0x180

    .line 101
    .line 102
    if-le v7, v8, :cond_7

    .line 103
    .line 104
    invoke-virtual {v0, p2, p3}, Lgo0;->e(J)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-nez v7, :cond_9

    .line 109
    .line 110
    :cond_7
    and-int/lit16 v6, v6, 0x180

    .line 111
    .line 112
    if-ne v6, v8, :cond_8

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_8
    move v11, v10

    .line 116
    :cond_9
    :goto_6
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    if-nez v11, :cond_a

    .line 121
    .line 122
    sget-object v7, Lnx;->a:Leb;

    .line 123
    .line 124
    if-ne v6, v7, :cond_b

    .line 125
    .line 126
    :cond_a
    new-instance v6, Lka0;

    .line 127
    .line 128
    invoke-direct {v6, p1, v10, p2, p3}, Lka0;-><init>(FIJ)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_b
    check-cast v6, Lin0;

    .line 135
    .line 136
    invoke-static {v5, v6, v0, v10}, Leu;->b(Luh1;Lin0;Lpx;I)V

    .line 137
    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_c
    invoke-virtual {v0}, Lgo0;->R()V

    .line 141
    .line 142
    .line 143
    move-object v1, p0

    .line 144
    :goto_7
    invoke-virtual {v0}, Lgo0;->r()Lb62;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    if-eqz v7, :cond_d

    .line 149
    .line 150
    new-instance v0, Lla0;

    .line 151
    .line 152
    move v2, p1

    .line 153
    move-wide v3, p2

    .line 154
    move/from16 v5, p5

    .line 155
    .line 156
    move/from16 v6, p6

    .line 157
    .line 158
    invoke-direct/range {v0 .. v6}, Lla0;-><init>(Luh1;FJII)V

    .line 159
    .line 160
    .line 161
    iput-object v0, v7, Lb62;->d:Lmn0;

    .line 162
    .line 163
    :cond_d
    return-void
.end method

.method public static final b(Lkw;Lpx;I)V
    .locals 10

    .line 1
    check-cast p1, Lgo0;

    .line 2
    .line 3
    const v0, -0x2a4a252b

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 20
    .line 21
    invoke-virtual {p1, v1, v0}, Lgo0;->O(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    sget-object v0, Lhc2;->a:Ltu2;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lfc2;

    .line 34
    .line 35
    const v4, 0x753e26b5

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v4}, Lgo0;->W(I)V

    .line 39
    .line 40
    .line 41
    new-array v4, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const/16 v6, 0xa

    .line 48
    .line 49
    sget-object v7, Lnx;->a:Leb;

    .line 50
    .line 51
    if-ne v5, v7, :cond_1

    .line 52
    .line 53
    new-instance v5, Lhn1;

    .line 54
    .line 55
    invoke-direct {v5, v6}, Lhn1;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    check-cast v5, Lxm0;

    .line 62
    .line 63
    const/16 v8, 0x180

    .line 64
    .line 65
    sget-object v9, Ldc2;->l:Ldq1;

    .line 66
    .line 67
    invoke-static {v4, v9, v5, p1, v8}, Lgf1;->O([Ljava/lang/Object;Lwc2;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Ldc2;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lfc2;

    .line 78
    .line 79
    iput-object v5, v4, Ldc2;->j:Lfc2;

    .line 80
    .line 81
    invoke-virtual {p1, v2}, Lgo0;->p(Z)V

    .line 82
    .line 83
    .line 84
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    new-instance v8, Lz81;

    .line 89
    .line 90
    invoke-direct {v8, v3}, Lz81;-><init>(I)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Ld2;

    .line 94
    .line 95
    const/16 v9, 0x14

    .line 96
    .line 97
    invoke-direct {v3, v9, v1, v4}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance v9, Ldq1;

    .line 101
    .line 102
    invoke-direct {v9, v6, v8, v3}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-virtual {p1, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    or-int/2addr v3, v6

    .line 114
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    if-nez v3, :cond_2

    .line 119
    .line 120
    if-ne v6, v7, :cond_3

    .line 121
    .line 122
    :cond_2
    new-instance v6, Lr1;

    .line 123
    .line 124
    const/16 v3, 0x17

    .line 125
    .line 126
    invoke-direct {v6, v3, v1, v4}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    check-cast v6, Lxm0;

    .line 133
    .line 134
    invoke-static {v5, v9, v6, p1, v2}, Lgf1;->O([Ljava/lang/Object;Lwc2;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Lg91;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v2, Laf;

    .line 145
    .line 146
    const/16 v3, 0xf

    .line 147
    .line 148
    invoke-direct {v2, v3, p0, v1}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    const v1, -0x189b31eb

    .line 152
    .line 153
    .line 154
    invoke-static {v1, v2, p1}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    const/16 v2, 0x38

    .line 159
    .line 160
    invoke-static {v0, v1, p1, v2}, Lci0;->a(Lf42;Lkw;Lpx;I)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_4
    invoke-virtual {p1}, Lgo0;->R()V

    .line 165
    .line 166
    .line 167
    :goto_1
    invoke-virtual {p1}, Lgo0;->r()Lb62;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-eqz p1, :cond_5

    .line 172
    .line 173
    new-instance v0, Lo0;

    .line 174
    .line 175
    const/4 v1, 0x5

    .line 176
    invoke-direct {v0, p0, p2, v1}, Lo0;-><init>(Lkw;II)V

    .line 177
    .line 178
    .line 179
    iput-object v0, p1, Lb62;->d:Lmn0;

    .line 180
    .line 181
    :cond_5
    return-void
.end method

.method public static final c(Luh1;FJLpx;I)V
    .locals 6

    .line 1
    check-cast p4, Lgo0;

    .line 2
    .line 3
    const v0, -0x5b7bfc6d

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p4, p2, p3}, Lgo0;->e(J)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x100

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 v0, 0x80

    .line 20
    .line 21
    :goto_0
    or-int/2addr v0, p5

    .line 22
    and-int/lit16 v2, v0, 0x93

    .line 23
    .line 24
    const/16 v3, 0x92

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 28
    if-eq v2, v3, :cond_1

    .line 29
    .line 30
    move v2, v5

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v2, v4

    .line 33
    :goto_1
    and-int/lit8 v3, v0, 0x1

    .line 34
    .line 35
    invoke-virtual {p4, v3, v2}, Lgo0;->O(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_9

    .line 40
    .line 41
    invoke-virtual {p4}, Lgo0;->T()V

    .line 42
    .line 43
    .line 44
    and-int/lit8 v2, p5, 0x1

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p4}, Lgo0;->y()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-virtual {p4}, Lgo0;->R()V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_2
    invoke-virtual {p4}, Lgo0;->q()V

    .line 59
    .line 60
    .line 61
    sget-object v2, Lte;->f:Lyi0;

    .line 62
    .line 63
    invoke-interface {p0, v2}, Luh1;->c(Luh1;)Luh1;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2, p1}, Lte;->q0(Luh1;F)Luh1;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    and-int/lit16 v3, v0, 0x380

    .line 72
    .line 73
    xor-int/lit16 v3, v3, 0x180

    .line 74
    .line 75
    if-le v3, v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p4, p2, p3}, Lgo0;->e(J)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_5

    .line 82
    .line 83
    :cond_4
    and-int/lit16 v0, v0, 0x180

    .line 84
    .line 85
    if-ne v0, v1, :cond_6

    .line 86
    .line 87
    :cond_5
    move v0, v5

    .line 88
    goto :goto_3

    .line 89
    :cond_6
    move v0, v4

    .line 90
    :goto_3
    invoke-virtual {p4}, Lgo0;->L()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-nez v0, :cond_7

    .line 95
    .line 96
    sget-object v0, Lnx;->a:Leb;

    .line 97
    .line 98
    if-ne v1, v0, :cond_8

    .line 99
    .line 100
    :cond_7
    new-instance v1, Lka0;

    .line 101
    .line 102
    invoke-direct {v1, p1, v5, p2, p3}, Lka0;-><init>(FIJ)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p4, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_8
    check-cast v1, Lin0;

    .line 109
    .line 110
    invoke-static {v2, v1, p4, v4}, Leu;->b(Luh1;Lin0;Lpx;I)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_9
    invoke-virtual {p4}, Lgo0;->R()V

    .line 115
    .line 116
    .line 117
    :goto_4
    invoke-virtual {p4}, Lgo0;->r()Lb62;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    if-eqz p4, :cond_a

    .line 122
    .line 123
    new-instance v0, Lma0;

    .line 124
    .line 125
    move-object v1, p0

    .line 126
    move v2, p1

    .line 127
    move-wide v3, p2

    .line 128
    move v5, p5

    .line 129
    invoke-direct/range {v0 .. v5}, Lma0;-><init>(Luh1;FJI)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p4, Lb62;->d:Lmn0;

    .line 133
    .line 134
    :cond_a
    return-void
.end method

.method public static final d(C)I
    .locals 3

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x3a

    .line 6
    .line 7
    if-ge p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x67

    .line 16
    .line 17
    if-ge p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-gt v0, p0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    if-ge p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Unexpected hex digit: "

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public static final e(Li23;Lxw;Ljava/lang/Throwable;Lu00;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Ldk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ldk0;

    .line 7
    .line 8
    iget v1, v0, Ldk0;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldk0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldk0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lu00;-><init>(Lt00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ldk0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldk0;->m:I

    .line 28
    .line 29
    sget-object v2, La83;->a:La83;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-object p2, v0, Ldk0;->k:Ljava/lang/Throwable;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :try_start_1
    iput-object p2, v0, Ldk0;->k:Ljava/lang/Throwable;

    .line 55
    .line 56
    iput v3, v0, Ldk0;->m:I

    .line 57
    .line 58
    invoke-virtual {p1, p0, p2, v0}, Lxw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    sget-object p0, Lk20;->h:Lk20;

    .line 62
    .line 63
    if-ne v2, p0, :cond_3

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_3
    :goto_1
    return-object v2

    .line 67
    :goto_2
    if-eqz p2, :cond_4

    .line 68
    .line 69
    if-eq p2, p0, :cond_4

    .line 70
    .line 71
    invoke-static {p0, p2}, Lfg1;->m(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :cond_4
    throw p0
.end method

.method public static final f(Lab3;Lr61;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lr61;->M:Lvn1;

    .line 2
    .line 3
    iget-object p1, p1, Lvn1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lqz0;

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lzn1;->M(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const/16 p1, 0x20

    .line 14
    .line 15
    shr-long v2, v0, p1

    .line 16
    .line 17
    long-to-int p1, v2

    .line 18
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const-wide v2, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v0, v2

    .line 32
    long-to-int v0, v0

    .line 33
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/2addr v1, p1

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static final g(Ljava/util/logging/Logger;Ley2;Lhy2;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p2, p2, Lhy2;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 p2, 0x20

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-string p3, "%-22s"

    .line 26
    .line 27
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p2, ": "

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, Ley2;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static h(Ltr2;Ljava/util/List;Lfy;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_3

    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lao0;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ltr2;->c(Lao0;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p0, v2}, Ltr2;->r(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    iget-object v4, p0, Ltr2;->b:[I

    .line 29
    .line 30
    invoke-virtual {p0, v4, v3}, Ltr2;->N([II)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget-object v4, p0, Ltr2;->b:[I

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Ltr2;->r(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p0, v4, v2}, Ltr2;->g([II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ge v3, v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Ltr2;->h(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget-object v3, p0, Ltr2;->c:[Ljava/lang/Object;

    .line 53
    .line 54
    aget-object v2, v3, v2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    sget-object v2, Lnx;->a:Leb;

    .line 58
    .line 59
    :goto_1
    instance-of v3, v2, Lb62;

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    check-cast v2, Lb62;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    const/4 v2, 0x0

    .line 67
    :goto_2
    if-eqz v2, :cond_2

    .line 68
    .line 69
    iput-object p2, v2, Lb62;->a:Lfy;

    .line 70
    .line 71
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    return-void
.end method

.method public static final i(Lcz0;FFLzy0;Lpx;)Laz0;
    .locals 4

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p4, Lgo0;

    .line 10
    .line 11
    invoke-virtual {p4}, Lgo0;->L()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lnx;->a:Leb;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    new-instance v0, Laz0;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1, p2, p3}, Laz0;-><init>(Lcz0;Ljava/lang/Float;Ljava/lang/Float;Lzy0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p4, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    check-cast v0, Laz0;

    .line 28
    .line 29
    invoke-virtual {p4, p3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p4}, Lgo0;->L()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    if-ne v3, v1, :cond_2

    .line 40
    .line 41
    :cond_1
    new-instance v3, Ldz0;

    .line 42
    .line 43
    invoke-direct {v3, p1, v0, p2, p3}, Ldz0;-><init>(Ljava/lang/Float;Laz0;Ljava/lang/Float;Lzy0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p4, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    check-cast v3, Lxm0;

    .line 50
    .line 51
    invoke-static {v3, p4}, Leu;->r(Lxm0;Lpx;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p4, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p4}, Lgo0;->L()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    if-ne p2, v1, :cond_4

    .line 65
    .line 66
    :cond_3
    new-instance p2, Ld2;

    .line 67
    .line 68
    const/16 p1, 0x12

    .line 69
    .line 70
    invoke-direct {p2, p1, p0, v0}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p4, p2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    check-cast p2, Lin0;

    .line 77
    .line 78
    invoke-static {v0, p2, p4}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public static final k(Ljava/util/ArrayList;Ltw2;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lbe0;->h:Lbe0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lxi;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    new-array v2, v1, [Ln60;

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [Ln60;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lxi;-><init>([Ln60;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lmp;

    .line 25
    .line 26
    invoke-static {p1}, Lgf1;->z(Lt00;)Lt00;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v2, v3, p1}, Lmp;-><init>(ILt00;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lmp;->u()V

    .line 35
    .line 36
    .line 37
    array-length p1, p0

    .line 38
    new-array v4, p1, [Lvi;

    .line 39
    .line 40
    move v5, v1

    .line 41
    :goto_0
    if-ge v5, p1, :cond_1

    .line 42
    .line 43
    aget-object v6, p0, v5

    .line 44
    .line 45
    move-object v7, v6

    .line 46
    check-cast v7, Lr21;

    .line 47
    .line 48
    invoke-virtual {v7}, Lr21;->start()Z

    .line 49
    .line 50
    .line 51
    new-instance v7, Lvi;

    .line 52
    .line 53
    invoke-direct {v7, v0, v2}, Lvi;-><init>(Lxi;Lmp;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v6, v3, v7}, Lxe1;->H(Lk21;ZLn21;)Lca0;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iput-object v6, v7, Lvi;->m:Lca0;

    .line 61
    .line 62
    aput-object v7, v4, v5

    .line 63
    .line 64
    add-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    new-instance p0, Lwi;

    .line 68
    .line 69
    invoke-direct {p0, v4}, Lwi;-><init>([Lvi;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    if-ge v1, p1, :cond_2

    .line 73
    .line 74
    aget-object v0, v4, v1

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object v3, Lvi;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 80
    .line 81
    invoke-virtual {v3, v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    sget-object p1, Lmp;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 88
    .line 89
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    instance-of p1, p1, Lko1;

    .line 94
    .line 95
    if-nez p1, :cond_3

    .line 96
    .line 97
    invoke-virtual {p0}, Lwi;->b()V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    invoke-virtual {v2, p0}, Lmp;->x(Lko1;)V

    .line 102
    .line 103
    .line 104
    :goto_2
    invoke-virtual {v2}, Lmp;->t()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method public static final l()Lzk1;
    .locals 3

    .line 1
    sget-object v0, Lls2;->b:Lb5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb5;->p()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lzk1;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lzk1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v2, v2, [Lfo0;

    .line 15
    .line 16
    invoke-direct {v1, v2}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lb5;->A(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v1
.end method

.method public static final m(Lxm0;)Ln70;
    .locals 2

    .line 1
    sget-object v0, Lls2;->a:Lb5;

    .line 2
    .line 3
    new-instance v0, Ln70;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Ln70;-><init>(Lxm0;Lsn;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final n(Llj1;Lqp;Lan;FLbq2;Lgz2;Lop0;)V
    .locals 10

    .line 1
    iget-object p0, p0, Llj1;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lrw1;

    .line 15
    .line 16
    iget-object v3, v2, Lrw1;->a:Lt9;

    .line 17
    .line 18
    move-object v4, p1

    .line 19
    move-object v5, p2

    .line 20
    move v6, p3

    .line 21
    move-object v7, p4

    .line 22
    move-object v8, p5

    .line 23
    move-object/from16 v9, p6

    .line 24
    .line 25
    invoke-virtual/range {v3 .. v9}, Lt9;->g(Lqp;Lan;FLbq2;Lgz2;Lop0;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v2, Lrw1;->a:Lt9;

    .line 29
    .line 30
    invoke-virtual {v2}, Lt9;->b()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-interface {p1, v3, v2}, Lqp;->g(FF)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void
.end method

.method public static final o(J)Ljava/lang/String;
    .locals 18

    .line 1
    const-wide/32 v0, -0x3b9328e0

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    const-string v1, " s "

    .line 7
    .line 8
    const-wide/32 v2, 0x3b9aca00

    .line 9
    .line 10
    .line 11
    const-wide/32 v4, 0x1dcd6500

    .line 12
    .line 13
    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    sub-long v4, p0, v4

    .line 22
    .line 23
    div-long/2addr v4, v2

    .line 24
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    const-wide/32 v6, -0xf404c

    .line 37
    .line 38
    .line 39
    cmp-long v0, p0, v6

    .line 40
    .line 41
    const-string v6, " ms"

    .line 42
    .line 43
    const-wide/32 v7, 0xf4240

    .line 44
    .line 45
    .line 46
    const-wide/32 v9, 0x7a120

    .line 47
    .line 48
    .line 49
    if-gtz v0, :cond_1

    .line 50
    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    sub-long v1, p0, v9

    .line 57
    .line 58
    div-long/2addr v1, v7

    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const-wide/16 v11, 0x0

    .line 71
    .line 72
    cmp-long v0, p0, v11

    .line 73
    .line 74
    const-string v11, " \u00b5s"

    .line 75
    .line 76
    const-wide/16 v12, 0x3e8

    .line 77
    .line 78
    const-wide/16 v14, 0x1f4

    .line 79
    .line 80
    if-gtz v0, :cond_2

    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    sub-long v1, p0, v14

    .line 88
    .line 89
    div-long/2addr v1, v12

    .line 90
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const-wide/32 v16, 0xf404c

    .line 102
    .line 103
    .line 104
    cmp-long v0, p0, v16

    .line 105
    .line 106
    if-gez v0, :cond_3

    .line 107
    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    add-long v1, p0, v14

    .line 114
    .line 115
    div-long/2addr v1, v12

    .line 116
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_0

    .line 127
    :cond_3
    const-wide/32 v11, 0x3b9328e0

    .line 128
    .line 129
    .line 130
    cmp-long v0, p0, v11

    .line 131
    .line 132
    if-gez v0, :cond_4

    .line 133
    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    add-long v1, p0, v9

    .line 140
    .line 141
    div-long/2addr v1, v7

    .line 142
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    goto :goto_0

    .line 153
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    add-long v4, p0, v4

    .line 159
    .line 160
    div-long/2addr v4, v2

    .line 161
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :goto_0
    const/4 v1, 0x1

    .line 172
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    const-string v1, "%6s"

    .line 181
    .line 182
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0
.end method

.method public static p([Lvj;Z)V
    .locals 9

    .line 1
    sget-object v0, Lpp1;->a:Lpp1;

    .line 2
    .line 3
    invoke-static {}, Lpp1;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    array-length v1, p0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_3

    .line 10
    .line 11
    aget-object v3, p0, v2

    .line 12
    .line 13
    instance-of v4, v3, Ltb1;

    .line 14
    .line 15
    if-nez v4, :cond_2

    .line 16
    .line 17
    sget-object v4, Lst0;->a:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Lvj;->f()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    instance-of v4, v3, Lw70;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3}, Lvj;->d()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v3}, Lvj;->d()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    sget-object v5, Lup0;->m:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    const-string v6, " in "

    .line 47
    .line 48
    const-string v7, ": dex cache is invalid"

    .line 49
    .line 50
    const-string v8, "Skip hooker "

    .line 51
    .line 52
    invoke-static {v8, v3, v6, v5, v7}, Lvi0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {v4, v3}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    const-string p0, "hostProcess"

    .line 61
    .line 62
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    throw p0

    .line 67
    :cond_1
    invoke-static {v3, v0}, Lop0;->q(Lvj;Z)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    return-void
.end method

.method public static q(Lvj;Z)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Lvj;->b()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object p1, Lpp1;->a:Lpp1;

    .line 12
    .line 13
    invoke-virtual {p0}, Lvj;->d()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lpp1;->e(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lvj;->b()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v0, 0x1

    .line 31
    :goto_0
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    :try_start_0
    invoke-static {p0}, Lst0;->a(Lvj;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    new-instance v0, Lx92;

    .line 45
    .line 46
    invoke-direct {v0, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p1, v0

    .line 50
    :goto_1
    invoke-static {p1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    sget-object v0, Lpp1;->a:Lpp1;

    .line 57
    .line 58
    const-string v0, "install"

    .line 59
    .line 60
    const-string v1, "Hooker install failed"

    .line 61
    .line 62
    invoke-static {p0, v0, p1, v1}, Lpp1;->h(Lvj;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lvj;->d()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p0}, Lvj;->d()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p1}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v2, "Hooker "

    .line 80
    .line 81
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p0, " failed: "

    .line 88
    .line 89
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {v0, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    :goto_2
    return-void
.end method

.method public static r(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "Connection"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Keep-Alive"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "Proxy-Authenticate"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "Proxy-Authorization"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const-string v0, "TE"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    const-string v0, "Trailers"

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    const-string v0, "Transfer-Encoding"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-string v0, "Upgrade"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_0

    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_0
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method public static final s(Lpx;)Z
    .locals 1

    .line 1
    sget-object v0, Lr7;->a:Lmy;

    .line 2
    .line 3
    check-cast p0, Lgo0;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/content/res/Configuration;

    .line 10
    .line 11
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 12
    .line 13
    and-int/lit8 p0, p0, 0x30

    .line 14
    .line 15
    const/16 v0, 0x20

    .line 16
    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static final t(Ljava/util/ArrayList;Lu00;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Laj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Laj;

    .line 7
    .line 8
    iget v1, v0, Laj;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Laj;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Laj;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lu00;-><init>(Lt00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Laj;->m:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Laj;->n:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget p0, v0, Laj;->l:I

    .line 35
    .line 36
    iget-object v1, v0, Laj;->k:Ljava/util/Iterator;

    .line 37
    .line 38
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const/4 p1, 0x0

    .line 57
    move-object v1, p0

    .line 58
    move p0, p1

    .line 59
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lk21;

    .line 70
    .line 71
    iput-object v1, v0, Laj;->k:Ljava/util/Iterator;

    .line 72
    .line 73
    iput p0, v0, Laj;->l:I

    .line 74
    .line 75
    iput v2, v0, Laj;->n:I

    .line 76
    .line 77
    invoke-interface {p1, v0}, Lk21;->A(Lu00;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object v3, Lk20;->h:Lk20;

    .line 82
    .line 83
    if-ne p1, v3, :cond_3

    .line 84
    .line 85
    return-object v3

    .line 86
    :cond_4
    sget-object p0, La83;->a:La83;

    .line 87
    .line 88
    return-object p0
.end method

.method public static u(Ljava/lang/Object;)Lnx1;
    .locals 2

    .line 1
    sget-object v0, Lsn;->T:Lsn;

    .line 2
    .line 3
    new-instance v1, Lnx1;

    .line 4
    .line 5
    invoke-direct {v1, p0, v0}, Lnx1;-><init>(Ljava/lang/Object;Lks2;)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method

.method public static final v(Ltm1;)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lum1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lum1;-><init>(Ltm1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final w(Lyy1;Le42;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lyy1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Le42;->b()Lm93;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    check-cast v0, Lm93;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Lm93;->a(Lyy1;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final x(Ljava/lang/Object;Lpx;)Lxk1;
    .locals 2

    .line 1
    check-cast p1, Lgo0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lnx;->a:Leb;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    check-cast v0, Lxk1;

    .line 19
    .line 20
    invoke-interface {v0, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static y(Ljava/lang/Object;)Ln4;
    .locals 5

    .line 1
    instance-of v0, p0, Lbt;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    sget-object v2, Lxf1;->h:Lxf1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ln4;

    .line 10
    .line 11
    move-object v3, p0

    .line 12
    check-cast v3, Lbt;

    .line 13
    .line 14
    invoke-static {v3}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    new-instance v4, Lyf1;

    .line 19
    .line 20
    invoke-direct {v4, v3, p0, v2}, Lyf1;-><init>(Ljava/lang/Class;Ljava/lang/Object;Lxf1;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v4}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    instance-of v0, p0, Ljava/lang/Class;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Ln4;

    .line 32
    .line 33
    move-object v3, p0

    .line 34
    check-cast v3, Ljava/lang/Class;

    .line 35
    .line 36
    new-instance v4, Lyf1;

    .line 37
    .line 38
    invoke-direct {v4, v3, p0, v2}, Lyf1;-><init>(Ljava/lang/Class;Ljava/lang/Object;Lxf1;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1, v4}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    new-instance v0, Ln4;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v4, Lyf1;

    .line 52
    .line 53
    invoke-direct {v4, v3, p0, v2}, Lyf1;-><init>(Ljava/lang/Class;Ljava/lang/Object;Lxf1;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1, v4}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public static final z(JJ)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p2, v0

    .line 11
    .line 12
    long-to-int v2, v2

    .line 13
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    mul-float/2addr v2, v1

    .line 18
    const-wide v3, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p0, v3

    .line 24
    long-to-int p0, p0

    .line 25
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    and-long p1, p2, v3

    .line 30
    .line 31
    long-to-int p1, p1

    .line 32
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    mul-float/2addr p1, p0

    .line 37
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    int-to-long p2, p0

    .line 42
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    int-to-long p0, p0

    .line 47
    shl-long/2addr p2, v0

    .line 48
    and-long/2addr p0, v3

    .line 49
    or-long/2addr p0, p2

    .line 50
    return-wide p0
.end method


# virtual methods
.method public abstract j(Lr82;Ljava/lang/Object;)V
.end method
