.class public final Luz2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public final synthetic n:Lb03;


# direct methods
.method public synthetic constructor <init>(Lb03;Lt00;I)V
    .locals 0

    .line 1
    iput p3, p0, Luz2;->l:I

    .line 2
    .line 3
    iput-object p1, p0, Luz2;->n:Lb03;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Luz2;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lj20;

    .line 9
    .line 10
    check-cast p2, Lt00;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Luz2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Luz2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Luz2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lj20;

    .line 24
    .line 25
    check-cast p2, Lt00;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Luz2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Luz2;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Luz2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Lrs1;

    .line 39
    .line 40
    iget-wide v2, p1, Lrs1;->a:J

    .line 41
    .line 42
    check-cast p2, Lt00;

    .line 43
    .line 44
    new-instance p1, Luz2;

    .line 45
    .line 46
    iget-object p0, p0, Luz2;->n:Lb03;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-direct {p1, p0, p2, v0}, Luz2;-><init>(Lb03;Lt00;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1}, Luz2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    iget v0, p0, Luz2;->l:I

    .line 2
    .line 3
    iget-object p0, p0, Luz2;->n:Lb03;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Luz2;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p2, p0, p1, v0}, Luz2;-><init>(Lb03;Lt00;I)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Luz2;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p2, p0, p1, v0}, Luz2;-><init>(Lb03;Lt00;I)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_1
    new-instance v0, Luz2;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p1, v1}, Luz2;-><init>(Lb03;Lt00;I)V

    .line 26
    .line 27
    .line 28
    check-cast p2, Lrs1;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luz2;->l:I

    .line 4
    .line 5
    sget-object v2, Ltr0;->h:Ltr0;

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v6, Lk20;->h:Lk20;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    iget-object v8, v0, Luz2;->n:Lb03;

    .line 14
    .line 15
    sget-object v9, La83;->a:La83;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget v1, v0, Luz2;->m:I

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    if-eq v1, v7, :cond_1

    .line 25
    .line 26
    if-ne v1, v4, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object/from16 v0, p1

    .line 32
    .line 33
    goto/16 :goto_f

    .line 34
    .line 35
    :cond_0
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    goto/16 :goto_11

    .line 40
    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v5, p1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v8, Lb03;->h:Lrt;

    .line 51
    .line 52
    if-eqz v1, :cond_28

    .line 53
    .line 54
    iput v7, v0, Luz2;->m:I

    .line 55
    .line 56
    check-cast v1, Li6;

    .line 57
    .line 58
    iget-object v1, v1, Li6;->a:Lj6;

    .line 59
    .line 60
    invoke-virtual {v1}, Lj6;->a()Landroid/content/ClipboardManager;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    new-instance v5, Lqt;

    .line 71
    .line 72
    invoke-direct {v5, v1}, Lqt;-><init>(Landroid/content/ClipData;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    const/4 v5, 0x0

    .line 77
    :goto_0
    if-ne v5, v6, :cond_4

    .line 78
    .line 79
    goto/16 :goto_11

    .line 80
    .line 81
    :cond_4
    :goto_1
    check-cast v5, Lqt;

    .line 82
    .line 83
    if-eqz v5, :cond_28

    .line 84
    .line 85
    iput v4, v0, Luz2;->m:I

    .line 86
    .line 87
    iget-object v0, v5, Lqt;->a:Landroid/content/ClipData;

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-virtual {v0, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_24

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_24

    .line 101
    .line 102
    instance-of v5, v0, Landroid/text/Spanned;

    .line 103
    .line 104
    if-nez v5, :cond_5

    .line 105
    .line 106
    new-instance v1, Lsd;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-direct {v1, v0}, Lsd;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    move-object v0, v1

    .line 116
    goto/16 :goto_e

    .line 117
    .line 118
    :cond_5
    move-object v5, v0

    .line 119
    check-cast v5, Landroid/text/Spanned;

    .line 120
    .line 121
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    const-class v12, Landroid/text/Annotation;

    .line 126
    .line 127
    invoke-interface {v5, v1, v11, v12}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    check-cast v11, [Landroid/text/Annotation;

    .line 132
    .line 133
    new-instance v12, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    array-length v13, v11

    .line 142
    sub-int/2addr v13, v7

    .line 143
    if-ltz v13, :cond_21

    .line 144
    .line 145
    move v14, v1

    .line 146
    :goto_2
    aget-object v15, v11, v14

    .line 147
    .line 148
    invoke-virtual {v15}, Landroid/text/Annotation;->getKey()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    const-string v3, "androidx.compose.text.SpanStyle"

    .line 153
    .line 154
    invoke-static {v10, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-nez v3, :cond_6

    .line 159
    .line 160
    move-object/from16 p0, v0

    .line 161
    .line 162
    move/from16 p1, v1

    .line 163
    .line 164
    goto/16 :goto_c

    .line 165
    .line 166
    :cond_6
    invoke-interface {v5, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    invoke-interface {v5, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    new-instance v4, Lu40;

    .line 175
    .line 176
    invoke-virtual {v15}, Landroid/text/Annotation;->getValue()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    iput-object v7, v4, Lu40;->a:Landroid/os/Parcel;

    .line 188
    .line 189
    invoke-static {v15, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    move-object/from16 p0, v0

    .line 194
    .line 195
    array-length v0, v15

    .line 196
    invoke-virtual {v7, v15, v1, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v7, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 200
    .line 201
    .line 202
    iget-object v0, v4, Lu40;->a:Landroid/os/Parcel;

    .line 203
    .line 204
    sget-wide v16, Lju;->g:J

    .line 205
    .line 206
    sget-wide v18, Lp13;->c:J

    .line 207
    .line 208
    move-wide/from16 v21, v16

    .line 209
    .line 210
    move-wide/from16 v35, v21

    .line 211
    .line 212
    move-wide/from16 v23, v18

    .line 213
    .line 214
    move-wide/from16 v30, v23

    .line 215
    .line 216
    const/16 v25, 0x0

    .line 217
    .line 218
    const/16 v26, 0x0

    .line 219
    .line 220
    const/16 v27, 0x0

    .line 221
    .line 222
    const/16 v29, 0x0

    .line 223
    .line 224
    const/16 v32, 0x0

    .line 225
    .line 226
    const/16 v33, 0x0

    .line 227
    .line 228
    const/16 v37, 0x0

    .line 229
    .line 230
    const/16 v38, 0x0

    .line 231
    .line 232
    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    const/4 v15, 0x1

    .line 237
    if-le v7, v15, :cond_1f

    .line 238
    .line 239
    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    move/from16 p1, v1

    .line 244
    .line 245
    const/16 v1, 0x8

    .line 246
    .line 247
    if-ne v7, v15, :cond_7

    .line 248
    .line 249
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-lt v7, v1, :cond_20

    .line 254
    .line 255
    invoke-virtual {v4}, Lu40;->a()J

    .line 256
    .line 257
    .line 258
    move-result-wide v21

    .line 259
    :goto_4
    move/from16 v1, p1

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_7
    const/4 v15, 0x5

    .line 263
    const/4 v1, 0x2

    .line 264
    if-ne v7, v1, :cond_8

    .line 265
    .line 266
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-lt v1, v15, :cond_20

    .line 271
    .line 272
    invoke-virtual {v4}, Lu40;->b()J

    .line 273
    .line 274
    .line 275
    move-result-wide v23

    .line 276
    goto :goto_4

    .line 277
    :cond_8
    const/4 v1, 0x3

    .line 278
    const/4 v15, 0x4

    .line 279
    if-ne v7, v1, :cond_9

    .line 280
    .line 281
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-lt v1, v15, :cond_20

    .line 286
    .line 287
    new-instance v1, Lim0;

    .line 288
    .line 289
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    invoke-direct {v1, v7}, Lim0;-><init>(I)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v25, v1

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_9
    if-ne v7, v15, :cond_c

    .line 300
    .line 301
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    const/4 v7, 0x1

    .line 306
    if-lt v1, v7, :cond_20

    .line 307
    .line 308
    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-nez v1, :cond_b

    .line 313
    .line 314
    :cond_a
    move/from16 v1, p1

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_b
    if-ne v1, v7, :cond_a

    .line 318
    .line 319
    move v1, v7

    .line 320
    :goto_5
    new-instance v15, Lgm0;

    .line 321
    .line 322
    invoke-direct {v15, v1}, Lgm0;-><init>(I)V

    .line 323
    .line 324
    .line 325
    move/from16 v1, p1

    .line 326
    .line 327
    move-object/from16 v26, v15

    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_c
    const/4 v1, 0x5

    .line 331
    const/4 v15, 0x1

    .line 332
    if-ne v7, v1, :cond_11

    .line 333
    .line 334
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-lt v1, v15, :cond_20

    .line 339
    .line 340
    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-nez v1, :cond_e

    .line 345
    .line 346
    :cond_d
    move/from16 v1, p1

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_e
    if-ne v1, v15, :cond_f

    .line 350
    .line 351
    const v1, 0xffff

    .line 352
    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_f
    const/4 v7, 0x3

    .line 356
    if-ne v1, v7, :cond_10

    .line 357
    .line 358
    const/4 v1, 0x2

    .line 359
    goto :goto_6

    .line 360
    :cond_10
    const/4 v7, 0x2

    .line 361
    if-ne v1, v7, :cond_d

    .line 362
    .line 363
    const/4 v1, 0x1

    .line 364
    :goto_6
    new-instance v7, Lhm0;

    .line 365
    .line 366
    invoke-direct {v7, v1}, Lhm0;-><init>(I)V

    .line 367
    .line 368
    .line 369
    move/from16 v1, p1

    .line 370
    .line 371
    move-object/from16 v27, v7

    .line 372
    .line 373
    goto/16 :goto_3

    .line 374
    .line 375
    :cond_11
    const/4 v1, 0x6

    .line 376
    if-ne v7, v1, :cond_12

    .line 377
    .line 378
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v29

    .line 382
    goto :goto_4

    .line 383
    :cond_12
    const/4 v1, 0x7

    .line 384
    if-ne v7, v1, :cond_13

    .line 385
    .line 386
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    const/4 v7, 0x5

    .line 391
    if-lt v1, v7, :cond_20

    .line 392
    .line 393
    invoke-virtual {v4}, Lu40;->b()J

    .line 394
    .line 395
    .line 396
    move-result-wide v30

    .line 397
    goto/16 :goto_4

    .line 398
    .line 399
    :cond_13
    const/16 v1, 0x8

    .line 400
    .line 401
    if-ne v7, v1, :cond_14

    .line 402
    .line 403
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    const/4 v7, 0x4

    .line 408
    if-lt v1, v7, :cond_20

    .line 409
    .line 410
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    new-instance v7, Lxj;

    .line 415
    .line 416
    invoke-direct {v7, v1}, Lxj;-><init>(F)V

    .line 417
    .line 418
    .line 419
    move/from16 v1, p1

    .line 420
    .line 421
    move-object/from16 v32, v7

    .line 422
    .line 423
    goto/16 :goto_3

    .line 424
    .line 425
    :cond_14
    const/16 v15, 0x9

    .line 426
    .line 427
    if-ne v7, v15, :cond_15

    .line 428
    .line 429
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 430
    .line 431
    .line 432
    move-result v7

    .line 433
    if-lt v7, v1, :cond_20

    .line 434
    .line 435
    new-instance v1, Lm03;

    .line 436
    .line 437
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 442
    .line 443
    .line 444
    move-result v15

    .line 445
    invoke-direct {v1, v7, v15}, Lm03;-><init>(FF)V

    .line 446
    .line 447
    .line 448
    move-object/from16 v33, v1

    .line 449
    .line 450
    goto/16 :goto_4

    .line 451
    .line 452
    :cond_15
    const/16 v15, 0xa

    .line 453
    .line 454
    if-ne v7, v15, :cond_16

    .line 455
    .line 456
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 457
    .line 458
    .line 459
    move-result v7

    .line 460
    if-lt v7, v1, :cond_20

    .line 461
    .line 462
    invoke-virtual {v4}, Lu40;->a()J

    .line 463
    .line 464
    .line 465
    move-result-wide v35

    .line 466
    goto/16 :goto_4

    .line 467
    .line 468
    :cond_16
    const/16 v1, 0xb

    .line 469
    .line 470
    if-ne v7, v1, :cond_1e

    .line 471
    .line 472
    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    const/4 v7, 0x4

    .line 477
    if-lt v1, v7, :cond_20

    .line 478
    .line 479
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    and-int/lit8 v7, v1, 0x2

    .line 484
    .line 485
    if-eqz v7, :cond_17

    .line 486
    .line 487
    const/4 v7, 0x1

    .line 488
    goto :goto_7

    .line 489
    :cond_17
    move/from16 v7, p1

    .line 490
    .line 491
    :goto_7
    and-int/lit8 v1, v1, 0x1

    .line 492
    .line 493
    if-eqz v1, :cond_18

    .line 494
    .line 495
    const/4 v1, 0x1

    .line 496
    goto :goto_8

    .line 497
    :cond_18
    move/from16 v1, p1

    .line 498
    .line 499
    :goto_8
    sget-object v15, Lgz2;->d:Lgz2;

    .line 500
    .line 501
    move-object/from16 v16, v0

    .line 502
    .line 503
    sget-object v0, Lgz2;->c:Lgz2;

    .line 504
    .line 505
    if-eqz v7, :cond_1a

    .line 506
    .line 507
    if-eqz v1, :cond_1a

    .line 508
    .line 509
    filled-new-array {v15, v0}, [Lgz2;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-static {v0}, Leu;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 522
    .line 523
    .line 524
    move-result v7

    .line 525
    move/from16 v15, p1

    .line 526
    .line 527
    :goto_9
    if-ge v15, v7, :cond_19

    .line 528
    .line 529
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v17

    .line 533
    move-object/from16 v18, v0

    .line 534
    .line 535
    move-object/from16 v0, v17

    .line 536
    .line 537
    check-cast v0, Lgz2;

    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    iget v0, v0, Lgz2;->a:I

    .line 544
    .line 545
    or-int/2addr v0, v1

    .line 546
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    add-int/lit8 v15, v15, 0x1

    .line 551
    .line 552
    move-object/from16 v0, v18

    .line 553
    .line 554
    goto :goto_9

    .line 555
    :cond_19
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 556
    .line 557
    .line 558
    move-result v0

    .line 559
    new-instance v1, Lgz2;

    .line 560
    .line 561
    invoke-direct {v1, v0}, Lgz2;-><init>(I)V

    .line 562
    .line 563
    .line 564
    move-object/from16 v37, v1

    .line 565
    .line 566
    goto :goto_b

    .line 567
    :cond_1a
    if-eqz v7, :cond_1b

    .line 568
    .line 569
    move-object/from16 v37, v15

    .line 570
    .line 571
    goto :goto_b

    .line 572
    :cond_1b
    if-eqz v1, :cond_1c

    .line 573
    .line 574
    :goto_a
    move-object/from16 v37, v0

    .line 575
    .line 576
    goto :goto_b

    .line 577
    :cond_1c
    sget-object v0, Lgz2;->b:Lgz2;

    .line 578
    .line 579
    goto :goto_a

    .line 580
    :cond_1d
    :goto_b
    move/from16 v1, p1

    .line 581
    .line 582
    move-object/from16 v0, v16

    .line 583
    .line 584
    goto/16 :goto_3

    .line 585
    .line 586
    :cond_1e
    move-object/from16 v16, v0

    .line 587
    .line 588
    const/16 v0, 0xc

    .line 589
    .line 590
    if-ne v7, v0, :cond_1d

    .line 591
    .line 592
    invoke-virtual/range {v16 .. v16}, Landroid/os/Parcel;->dataAvail()I

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    const/16 v1, 0x14

    .line 597
    .line 598
    if-lt v0, v1, :cond_20

    .line 599
    .line 600
    new-instance v39, Lbq2;

    .line 601
    .line 602
    invoke-virtual {v4}, Lu40;->a()J

    .line 603
    .line 604
    .line 605
    move-result-wide v40

    .line 606
    invoke-virtual/range {v16 .. v16}, Landroid/os/Parcel;->readFloat()F

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    invoke-virtual/range {v16 .. v16}, Landroid/os/Parcel;->readFloat()F

    .line 611
    .line 612
    .line 613
    move-result v1

    .line 614
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    move v7, v1

    .line 619
    int-to-long v0, v0

    .line 620
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 621
    .line 622
    .line 623
    move-result v7

    .line 624
    move-wide/from16 v17, v0

    .line 625
    .line 626
    int-to-long v0, v7

    .line 627
    const/16 v7, 0x20

    .line 628
    .line 629
    shl-long v17, v17, v7

    .line 630
    .line 631
    const-wide v19, 0xffffffffL

    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    and-long v0, v0, v19

    .line 637
    .line 638
    or-long v42, v17, v0

    .line 639
    .line 640
    invoke-virtual/range {v16 .. v16}, Landroid/os/Parcel;->readFloat()F

    .line 641
    .line 642
    .line 643
    move-result v44

    .line 644
    invoke-direct/range {v39 .. v44}, Lbq2;-><init>(JJF)V

    .line 645
    .line 646
    .line 647
    move/from16 v1, p1

    .line 648
    .line 649
    move-object/from16 v0, v16

    .line 650
    .line 651
    move-object/from16 v38, v39

    .line 652
    .line 653
    goto/16 :goto_3

    .line 654
    .line 655
    :cond_1f
    move/from16 p1, v1

    .line 656
    .line 657
    :cond_20
    new-instance v20, Llt2;

    .line 658
    .line 659
    const v39, 0xc000

    .line 660
    .line 661
    .line 662
    const/16 v28, 0x0

    .line 663
    .line 664
    const/16 v34, 0x0

    .line 665
    .line 666
    invoke-direct/range {v20 .. v39}, Llt2;-><init>(JJLim0;Lgm0;Lhm0;Lmx2;Ljava/lang/String;JLxj;Lm03;Lkc1;JLgz2;Lbq2;I)V

    .line 667
    .line 668
    .line 669
    move-object/from16 v0, v20

    .line 670
    .line 671
    new-instance v1, Lrd;

    .line 672
    .line 673
    invoke-direct {v1, v3, v10, v0}, Lrd;-><init>(IILjava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    :goto_c
    if-eq v14, v13, :cond_22

    .line 680
    .line 681
    add-int/lit8 v14, v14, 0x1

    .line 682
    .line 683
    move-object/from16 v0, p0

    .line 684
    .line 685
    move/from16 v1, p1

    .line 686
    .line 687
    const/4 v4, 0x2

    .line 688
    const/4 v7, 0x1

    .line 689
    goto/16 :goto_2

    .line 690
    .line 691
    :cond_21
    move-object/from16 p0, v0

    .line 692
    .line 693
    :cond_22
    new-instance v0, Lsd;

    .line 694
    .line 695
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    sget-object v3, Ltd;->a:Lsd;

    .line 700
    .line 701
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    if-eqz v3, :cond_23

    .line 706
    .line 707
    const/4 v10, 0x0

    .line 708
    goto :goto_d

    .line 709
    :cond_23
    move-object v10, v12

    .line 710
    :goto_d
    invoke-direct {v0, v10, v1}, Lsd;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    goto :goto_e

    .line 714
    :cond_24
    const/4 v0, 0x0

    .line 715
    :goto_e
    if-ne v0, v6, :cond_25

    .line 716
    .line 717
    goto :goto_11

    .line 718
    :cond_25
    :goto_f
    check-cast v0, Lsd;

    .line 719
    .line 720
    if-nez v0, :cond_26

    .line 721
    .line 722
    goto :goto_10

    .line 723
    :cond_26
    invoke-virtual {v8}, Lb03;->j()Z

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    if-nez v1, :cond_27

    .line 728
    .line 729
    goto :goto_10

    .line 730
    :cond_27
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 735
    .line 736
    .line 737
    move-result-object v3

    .line 738
    iget-object v3, v3, Lk03;->a:Lsd;

    .line 739
    .line 740
    iget-object v3, v3, Lsd;->i:Ljava/lang/String;

    .line 741
    .line 742
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 743
    .line 744
    .line 745
    move-result v3

    .line 746
    invoke-static {v1, v3}, Lt11;->C(Lk03;I)Lsd;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    new-instance v3, Lqd;

    .line 751
    .line 752
    invoke-direct {v3, v1}, Lqd;-><init>(Lsd;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v3, v0}, Lqd;->a(Lsd;)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v3}, Lqd;->b()Lsd;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 763
    .line 764
    .line 765
    move-result-object v3

    .line 766
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 767
    .line 768
    .line 769
    move-result-object v4

    .line 770
    iget-object v4, v4, Lk03;->a:Lsd;

    .line 771
    .line 772
    iget-object v4, v4, Lsd;->i:Ljava/lang/String;

    .line 773
    .line 774
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 775
    .line 776
    .line 777
    move-result v4

    .line 778
    invoke-static {v3, v4}, Lt11;->B(Lk03;I)Lsd;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    new-instance v4, Lqd;

    .line 783
    .line 784
    invoke-direct {v4, v1}, Lqd;-><init>(Lsd;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v4, v3}, Lqd;->a(Lsd;)V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v4}, Lqd;->b()Lsd;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    iget-wide v3, v3, Lk03;->b:J

    .line 799
    .line 800
    invoke-static {v3, v4}, Lf13;->f(J)I

    .line 801
    .line 802
    .line 803
    move-result v3

    .line 804
    iget-object v0, v0, Lsd;->i:Ljava/lang/String;

    .line 805
    .line 806
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    add-int/2addr v0, v3

    .line 811
    invoke-static {v0, v0}, Lfg1;->i(II)J

    .line 812
    .line 813
    .line 814
    move-result-wide v3

    .line 815
    invoke-static {v1, v3, v4}, Lb03;->e(Lsd;J)Lk03;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    iget-object v1, v8, Lb03;->c:Lin0;

    .line 820
    .line 821
    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v8, v2}, Lb03;->q(Ltr0;)V

    .line 825
    .line 826
    .line 827
    iget-object v0, v8, Lb03;->a:Lw73;

    .line 828
    .line 829
    const/4 v15, 0x1

    .line 830
    iput-boolean v15, v0, Lw73;->e:Z

    .line 831
    .line 832
    :cond_28
    :goto_10
    move-object v6, v9

    .line 833
    :goto_11
    return-object v6

    .line 834
    :pswitch_0
    move v15, v7

    .line 835
    iget v1, v0, Luz2;->m:I

    .line 836
    .line 837
    if-eqz v1, :cond_2b

    .line 838
    .line 839
    if-ne v1, v15, :cond_2a

    .line 840
    .line 841
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    :cond_29
    :goto_12
    move-object v6, v9

    .line 845
    goto/16 :goto_14

    .line 846
    .line 847
    :cond_2a
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    const/4 v6, 0x0

    .line 851
    goto/16 :goto_14

    .line 852
    .line 853
    :cond_2b
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    iget-wide v3, v1, Lk03;->b:J

    .line 861
    .line 862
    invoke-static {v3, v4}, Lf13;->c(J)Z

    .line 863
    .line 864
    .line 865
    move-result v1

    .line 866
    if-nez v1, :cond_2c

    .line 867
    .line 868
    invoke-virtual {v8}, Lb03;->j()Z

    .line 869
    .line 870
    .line 871
    move-result v1

    .line 872
    if-eqz v1, :cond_2c

    .line 873
    .line 874
    iget-object v1, v8, Lb03;->f:Lwb3;

    .line 875
    .line 876
    instance-of v1, v1, Ltx1;

    .line 877
    .line 878
    if-nez v1, :cond_2c

    .line 879
    .line 880
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 881
    .line 882
    .line 883
    move-result-object v1

    .line 884
    invoke-static {v1}, Lt11;->A(Lk03;)Lsd;

    .line 885
    .line 886
    .line 887
    move-result-object v10

    .line 888
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    iget-object v3, v3, Lk03;->a:Lsd;

    .line 897
    .line 898
    iget-object v3, v3, Lsd;->i:Ljava/lang/String;

    .line 899
    .line 900
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 901
    .line 902
    .line 903
    move-result v3

    .line 904
    invoke-static {v1, v3}, Lt11;->C(Lk03;I)Lsd;

    .line 905
    .line 906
    .line 907
    move-result-object v1

    .line 908
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 909
    .line 910
    .line 911
    move-result-object v3

    .line 912
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 913
    .line 914
    .line 915
    move-result-object v4

    .line 916
    iget-object v4, v4, Lk03;->a:Lsd;

    .line 917
    .line 918
    iget-object v4, v4, Lsd;->i:Ljava/lang/String;

    .line 919
    .line 920
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 921
    .line 922
    .line 923
    move-result v4

    .line 924
    invoke-static {v3, v4}, Lt11;->B(Lk03;I)Lsd;

    .line 925
    .line 926
    .line 927
    move-result-object v3

    .line 928
    new-instance v4, Lqd;

    .line 929
    .line 930
    invoke-direct {v4, v1}, Lqd;-><init>(Lsd;)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v4, v3}, Lqd;->a(Lsd;)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v4}, Lqd;->b()Lsd;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    invoke-virtual {v8}, Lb03;->n()Lk03;

    .line 941
    .line 942
    .line 943
    move-result-object v3

    .line 944
    iget-wide v3, v3, Lk03;->b:J

    .line 945
    .line 946
    invoke-static {v3, v4}, Lf13;->f(J)I

    .line 947
    .line 948
    .line 949
    move-result v3

    .line 950
    invoke-static {v3, v3}, Lfg1;->i(II)J

    .line 951
    .line 952
    .line 953
    move-result-wide v3

    .line 954
    invoke-static {v1, v3, v4}, Lb03;->e(Lsd;J)Lk03;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    iget-object v3, v8, Lb03;->c:Lin0;

    .line 959
    .line 960
    invoke-interface {v3, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v8, v2}, Lb03;->q(Ltr0;)V

    .line 964
    .line 965
    .line 966
    iget-object v1, v8, Lb03;->a:Lw73;

    .line 967
    .line 968
    const/4 v15, 0x1

    .line 969
    iput-boolean v15, v1, Lw73;->e:Z

    .line 970
    .line 971
    goto :goto_13

    .line 972
    :cond_2c
    const/4 v15, 0x1

    .line 973
    const/4 v10, 0x0

    .line 974
    :goto_13
    if-nez v10, :cond_2d

    .line 975
    .line 976
    goto/16 :goto_12

    .line 977
    .line 978
    :cond_2d
    iget-object v1, v8, Lb03;->h:Lrt;

    .line 979
    .line 980
    if-eqz v1, :cond_29

    .line 981
    .line 982
    invoke-static {v10}, Lop0;->A(Lsd;)Lqt;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    iput v15, v0, Luz2;->m:I

    .line 987
    .line 988
    check-cast v1, Li6;

    .line 989
    .line 990
    invoke-virtual {v1, v2}, Li6;->a(Lqt;)V

    .line 991
    .line 992
    .line 993
    if-ne v9, v6, :cond_29

    .line 994
    .line 995
    :goto_14
    return-object v6

    .line 996
    :pswitch_1
    move v15, v7

    .line 997
    iget v1, v0, Luz2;->m:I

    .line 998
    .line 999
    if-eqz v1, :cond_31

    .line 1000
    .line 1001
    if-eq v1, v15, :cond_30

    .line 1002
    .line 1003
    const/4 v7, 0x2

    .line 1004
    if-ne v1, v7, :cond_2f

    .line 1005
    .line 1006
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 1007
    .line 1008
    .line 1009
    :cond_2e
    move-object v6, v9

    .line 1010
    goto :goto_19

    .line 1011
    :cond_2f
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 1012
    .line 1013
    .line 1014
    const/4 v6, 0x0

    .line 1015
    goto :goto_19

    .line 1016
    :cond_30
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 1017
    .line 1018
    .line 1019
    goto :goto_15

    .line 1020
    :cond_31
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 1021
    .line 1022
    .line 1023
    iput v15, v0, Luz2;->m:I

    .line 1024
    .line 1025
    invoke-virtual {v8, v0}, Lb03;->s(Lu00;)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v1

    .line 1029
    if-ne v1, v6, :cond_32

    .line 1030
    .line 1031
    goto :goto_19

    .line 1032
    :cond_32
    :goto_15
    invoke-static {v8}, Lb03;->a(Lb03;)Low1;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    if-eqz v1, :cond_2e

    .line 1037
    .line 1038
    iget-object v2, v1, Low1;->h:Ljava/lang/Object;

    .line 1039
    .line 1040
    move-object v15, v2

    .line 1041
    check-cast v15, Ljava/lang/String;

    .line 1042
    .line 1043
    iget-object v1, v1, Low1;->i:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast v1, Lf13;

    .line 1046
    .line 1047
    iget-wide v11, v1, Lf13;->a:J

    .line 1048
    .line 1049
    iget-object v14, v8, Lb03;->j:Lp02;

    .line 1050
    .line 1051
    if-eqz v14, :cond_2e

    .line 1052
    .line 1053
    const/4 v7, 0x2

    .line 1054
    iput v7, v0, Luz2;->m:I

    .line 1055
    .line 1056
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 1057
    .line 1058
    .line 1059
    move-result v1

    .line 1060
    if-nez v1, :cond_33

    .line 1061
    .line 1062
    goto :goto_16

    .line 1063
    :cond_33
    invoke-static {v11, v12}, Lf13;->c(J)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v1

    .line 1067
    if-eqz v1, :cond_34

    .line 1068
    .line 1069
    :goto_16
    move-object v0, v9

    .line 1070
    goto :goto_17

    .line 1071
    :cond_34
    new-instance v10, Lf2;

    .line 1072
    .line 1073
    const/4 v13, 0x0

    .line 1074
    invoke-direct/range {v10 .. v15}, Lf2;-><init>(JLt00;Lp02;Ljava/lang/CharSequence;)V

    .line 1075
    .line 1076
    .line 1077
    iget-object v1, v14, Lp02;->a:La20;

    .line 1078
    .line 1079
    new-instance v2, Lk9;

    .line 1080
    .line 1081
    const/4 v3, 0x7

    .line 1082
    const/4 v4, 0x0

    .line 1083
    invoke-direct {v2, v14, v10, v4, v3}, Lk9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 1084
    .line 1085
    .line 1086
    invoke-static {v1, v2, v0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    :goto_17
    if-ne v0, v6, :cond_35

    .line 1091
    .line 1092
    goto :goto_18

    .line 1093
    :cond_35
    move-object v0, v9

    .line 1094
    :goto_18
    if-ne v0, v6, :cond_2e

    .line 1095
    .line 1096
    :goto_19
    return-object v6

    .line 1097
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
