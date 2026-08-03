.class public final Lh0/u0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Lh0/d1;


# direct methods
.method public synthetic constructor <init>(Lh0/d1;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lh0/u0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/u0;->j:Lh0/d1;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget v0, p0, Lh0/u0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lh0/u0;

    .line 7
    .line 8
    iget-object v0, p0, Lh0/u0;->j:Lh0/d1;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {p1, v0, p2, v1}, Lh0/u0;-><init>(Lh0/d1;Lwf/c;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lh0/u0;

    .line 16
    .line 17
    iget-object v0, p0, Lh0/u0;->j:Lh0/d1;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, v0, p2, v1}, Lh0/u0;-><init>(Lh0/d1;Lwf/c;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance v0, Lh0/u0;

    .line 25
    .line 26
    iget-object v1, p0, Lh0/u0;->j:Lh0/d1;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v0, v1, p2, v2}, Lh0/u0;-><init>(Lh0/d1;Lwf/c;I)V

    .line 30
    .line 31
    .line 32
    check-cast p1, Le1/b;

    .line 33
    .line 34
    iget-wide p1, p1, Le1/b;->a:J

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lh0/u0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqg/t;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lh0/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lh0/u0;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lh0/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lqg/t;

    .line 24
    .line 25
    check-cast p2, Lwf/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lh0/u0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lh0/u0;

    .line 32
    .line 33
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lh0/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Le1/b;

    .line 41
    .line 42
    iget-wide v0, p1, Le1/b;->a:J

    .line 43
    .line 44
    check-cast p2, Lwf/c;

    .line 45
    .line 46
    new-instance p1, Lh0/u0;

    .line 47
    .line 48
    iget-object v0, p0, Lh0/u0;->j:Lh0/d1;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {p1, v0, p2, v1}, Lh0/u0;-><init>(Lh0/d1;Lwf/c;I)V

    .line 52
    .line 53
    .line 54
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lh0/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lh0/u0;->h:I

    .line 4
    .line 5
    sget-object v2, Lw/h0;->g:Lw/h0;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    iget-object v7, v0, Lh0/u0;->j:Lh0/d1;

    .line 14
    .line 15
    sget-object v8, Lsf/n;->a:Lsf/n;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget v1, v0, Lh0/u0;->i:I

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    if-eq v1, v6, :cond_1

    .line 25
    .line 26
    if-ne v1, v3, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    goto/16 :goto_11

    .line 34
    .line 35
    :cond_0
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    goto/16 :goto_13

    .line 40
    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v4, p1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v7, Lh0/d1;->g:Ly1/y0;

    .line 51
    .line 52
    if-eqz v1, :cond_28

    .line 53
    .line 54
    iput v6, v0, Lh0/u0;->i:I

    .line 55
    .line 56
    check-cast v1, Ly1/h;

    .line 57
    .line 58
    iget-object v1, v1, Ly1/h;->a:Ly1/i;

    .line 59
    .line 60
    invoke-virtual {v1}, Ly1/i;->a()Landroid/content/ClipboardManager;

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
    new-instance v4, Ly1/x0;

    .line 71
    .line 72
    invoke-direct {v4, v1}, Ly1/x0;-><init>(Landroid/content/ClipData;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    const/4 v4, 0x0

    .line 77
    :goto_0
    if-ne v4, v5, :cond_4

    .line 78
    .line 79
    goto/16 :goto_13

    .line 80
    .line 81
    :cond_4
    :goto_1
    check-cast v4, Ly1/x0;

    .line 82
    .line 83
    if-eqz v4, :cond_28

    .line 84
    .line 85
    iput v3, v0, Lh0/u0;->i:I

    .line 86
    .line 87
    iget-object v1, v4, Ly1/x0;->a:Landroid/content/ClipData;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    invoke-virtual {v1, v4}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_24

    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-eqz v1, :cond_24

    .line 101
    .line 102
    instance-of v10, v1, Landroid/text/Spanned;

    .line 103
    .line 104
    if-nez v10, :cond_5

    .line 105
    .line 106
    new-instance v3, Li2/g;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-direct {v3, v1}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    move-object v1, v3

    .line 116
    goto/16 :goto_10

    .line 117
    .line 118
    :cond_5
    move-object v10, v1

    .line 119
    check-cast v10, Landroid/text/Spanned;

    .line 120
    .line 121
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    const-class v12, Landroid/text/Annotation;

    .line 126
    .line 127
    invoke-interface {v10, v4, v11, v12}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

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
    sub-int/2addr v13, v6

    .line 143
    if-ltz v13, :cond_21

    .line 144
    .line 145
    move v14, v4

    .line 146
    :goto_2
    aget-object v15, v11, v14

    .line 147
    .line 148
    invoke-virtual {v15}, Landroid/text/Annotation;->getKey()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    const-string v3, "androidx.compose.text.SpanStyle"

    .line 153
    .line 154
    invoke-static {v9, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-nez v3, :cond_6

    .line 159
    .line 160
    move-object/from16 p1, v1

    .line 161
    .line 162
    move/from16 v17, v4

    .line 163
    .line 164
    move-object/from16 v16, v10

    .line 165
    .line 166
    move-object v15, v11

    .line 167
    goto/16 :goto_e

    .line 168
    .line 169
    :cond_6
    invoke-interface {v10, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-interface {v10, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    new-instance v6, Lo/a;

    .line 178
    .line 179
    invoke-virtual {v15}, Landroid/text/Annotation;->getValue()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    move-object/from16 p1, v1

    .line 187
    .line 188
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    iput-object v1, v6, Lo/a;->a:Landroid/os/Parcel;

    .line 193
    .line 194
    invoke-static {v15, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 195
    .line 196
    .line 197
    move-result-object v15

    .line 198
    move-object/from16 v16, v10

    .line 199
    .line 200
    array-length v10, v15

    .line 201
    invoke-virtual {v1, v15, v4, v10}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 205
    .line 206
    .line 207
    iget-object v1, v6, Lo/a;->a:Landroid/os/Parcel;

    .line 208
    .line 209
    sget-wide v17, Lf1/w;->g:J

    .line 210
    .line 211
    sget-wide v19, Lu2/o;->c:J

    .line 212
    .line 213
    move-wide/from16 v22, v17

    .line 214
    .line 215
    move-wide/from16 v36, v22

    .line 216
    .line 217
    move-wide/from16 v24, v19

    .line 218
    .line 219
    move-wide/from16 v31, v24

    .line 220
    .line 221
    const/16 v26, 0x0

    .line 222
    .line 223
    const/16 v27, 0x0

    .line 224
    .line 225
    const/16 v28, 0x0

    .line 226
    .line 227
    const/16 v30, 0x0

    .line 228
    .line 229
    const/16 v33, 0x0

    .line 230
    .line 231
    const/16 v34, 0x0

    .line 232
    .line 233
    const/16 v38, 0x0

    .line 234
    .line 235
    const/16 v39, 0x0

    .line 236
    .line 237
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    const/4 v15, 0x1

    .line 242
    if-le v10, v15, :cond_20

    .line 243
    .line 244
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    move/from16 v17, v4

    .line 249
    .line 250
    const/16 v4, 0x8

    .line 251
    .line 252
    if-ne v10, v15, :cond_8

    .line 253
    .line 254
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    if-lt v10, v4, :cond_7

    .line 259
    .line 260
    invoke-virtual {v6}, Lo/a;->a()J

    .line 261
    .line 262
    .line 263
    move-result-wide v22

    .line 264
    :goto_4
    move/from16 v4, v17

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_7
    :goto_5
    move-object v15, v11

    .line 268
    goto/16 :goto_d

    .line 269
    .line 270
    :cond_8
    const/4 v15, 0x5

    .line 271
    const/4 v4, 0x2

    .line 272
    if-ne v10, v4, :cond_9

    .line 273
    .line 274
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-lt v4, v15, :cond_7

    .line 279
    .line 280
    invoke-virtual {v6}, Lo/a;->b()J

    .line 281
    .line 282
    .line 283
    move-result-wide v24

    .line 284
    goto :goto_4

    .line 285
    :cond_9
    const/4 v4, 0x3

    .line 286
    const/4 v15, 0x4

    .line 287
    if-ne v10, v4, :cond_a

    .line 288
    .line 289
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-lt v4, v15, :cond_7

    .line 294
    .line 295
    new-instance v4, Lm2/k;

    .line 296
    .line 297
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    invoke-direct {v4, v10}, Lm2/k;-><init>(I)V

    .line 302
    .line 303
    .line 304
    move-object/from16 v26, v4

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_a
    if-ne v10, v15, :cond_d

    .line 308
    .line 309
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    const/4 v10, 0x1

    .line 314
    if-lt v4, v10, :cond_7

    .line 315
    .line 316
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    if-nez v4, :cond_c

    .line 321
    .line 322
    :cond_b
    move/from16 v4, v17

    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_c
    if-ne v4, v10, :cond_b

    .line 326
    .line 327
    move v4, v10

    .line 328
    :goto_6
    new-instance v15, Lm2/i;

    .line 329
    .line 330
    invoke-direct {v15, v4}, Lm2/i;-><init>(I)V

    .line 331
    .line 332
    .line 333
    move-object/from16 v27, v15

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_d
    const/4 v4, 0x5

    .line 337
    const/4 v15, 0x1

    .line 338
    if-ne v10, v4, :cond_12

    .line 339
    .line 340
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    if-lt v4, v15, :cond_7

    .line 345
    .line 346
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    if-nez v4, :cond_f

    .line 351
    .line 352
    :cond_e
    move/from16 v4, v17

    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_f
    if-ne v4, v15, :cond_10

    .line 356
    .line 357
    const v4, 0xffff

    .line 358
    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_10
    const/4 v10, 0x3

    .line 362
    if-ne v4, v10, :cond_11

    .line 363
    .line 364
    const/4 v4, 0x2

    .line 365
    goto :goto_7

    .line 366
    :cond_11
    const/4 v10, 0x2

    .line 367
    if-ne v4, v10, :cond_e

    .line 368
    .line 369
    const/4 v4, 0x1

    .line 370
    :goto_7
    new-instance v10, Lm2/j;

    .line 371
    .line 372
    invoke-direct {v10, v4}, Lm2/j;-><init>(I)V

    .line 373
    .line 374
    .line 375
    move-object/from16 v28, v10

    .line 376
    .line 377
    goto :goto_4

    .line 378
    :cond_12
    const/4 v4, 0x6

    .line 379
    if-ne v10, v4, :cond_13

    .line 380
    .line 381
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v30

    .line 385
    goto :goto_4

    .line 386
    :cond_13
    const/4 v4, 0x7

    .line 387
    if-ne v10, v4, :cond_14

    .line 388
    .line 389
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    const/4 v10, 0x5

    .line 394
    if-lt v4, v10, :cond_7

    .line 395
    .line 396
    invoke-virtual {v6}, Lo/a;->b()J

    .line 397
    .line 398
    .line 399
    move-result-wide v31

    .line 400
    goto/16 :goto_4

    .line 401
    .line 402
    :cond_14
    const/16 v4, 0x8

    .line 403
    .line 404
    if-ne v10, v4, :cond_15

    .line 405
    .line 406
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 407
    .line 408
    .line 409
    move-result v4

    .line 410
    const/4 v10, 0x4

    .line 411
    if-lt v4, v10, :cond_7

    .line 412
    .line 413
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    new-instance v10, Lt2/a;

    .line 418
    .line 419
    invoke-direct {v10, v4}, Lt2/a;-><init>(F)V

    .line 420
    .line 421
    .line 422
    move-object/from16 v33, v10

    .line 423
    .line 424
    goto/16 :goto_4

    .line 425
    .line 426
    :cond_15
    const/16 v15, 0x9

    .line 427
    .line 428
    if-ne v10, v15, :cond_16

    .line 429
    .line 430
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    if-lt v10, v4, :cond_7

    .line 435
    .line 436
    new-instance v4, Lt2/p;

    .line 437
    .line 438
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 439
    .line 440
    .line 441
    move-result v10

    .line 442
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 443
    .line 444
    .line 445
    move-result v15

    .line 446
    invoke-direct {v4, v10, v15}, Lt2/p;-><init>(FF)V

    .line 447
    .line 448
    .line 449
    move-object/from16 v34, v4

    .line 450
    .line 451
    goto/16 :goto_4

    .line 452
    .line 453
    :cond_16
    const/16 v15, 0xa

    .line 454
    .line 455
    if-ne v10, v15, :cond_17

    .line 456
    .line 457
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 458
    .line 459
    .line 460
    move-result v10

    .line 461
    if-lt v10, v4, :cond_7

    .line 462
    .line 463
    invoke-virtual {v6}, Lo/a;->a()J

    .line 464
    .line 465
    .line 466
    move-result-wide v36

    .line 467
    goto/16 :goto_4

    .line 468
    .line 469
    :cond_17
    const/16 v4, 0xb

    .line 470
    .line 471
    if-ne v10, v4, :cond_1f

    .line 472
    .line 473
    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    const/4 v10, 0x4

    .line 478
    if-lt v4, v10, :cond_7

    .line 479
    .line 480
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    and-int/lit8 v10, v4, 0x2

    .line 485
    .line 486
    if-eqz v10, :cond_18

    .line 487
    .line 488
    const/4 v10, 0x1

    .line 489
    goto :goto_8

    .line 490
    :cond_18
    move/from16 v10, v17

    .line 491
    .line 492
    :goto_8
    and-int/lit8 v4, v4, 0x1

    .line 493
    .line 494
    if-eqz v4, :cond_19

    .line 495
    .line 496
    const/4 v4, 0x1

    .line 497
    goto :goto_9

    .line 498
    :cond_19
    move/from16 v4, v17

    .line 499
    .line 500
    :goto_9
    sget-object v15, Lt2/l;->d:Lt2/l;

    .line 501
    .line 502
    move-object/from16 v18, v1

    .line 503
    .line 504
    sget-object v1, Lt2/l;->c:Lt2/l;

    .line 505
    .line 506
    if-eqz v10, :cond_1b

    .line 507
    .line 508
    if-eqz v4, :cond_1b

    .line 509
    .line 510
    filled-new-array {v15, v1}, [Lt2/l;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 523
    .line 524
    .line 525
    move-result v10

    .line 526
    move/from16 v15, v17

    .line 527
    .line 528
    :goto_a
    if-ge v15, v10, :cond_1a

    .line 529
    .line 530
    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v19

    .line 534
    move-object/from16 v20, v1

    .line 535
    .line 536
    move-object/from16 v1, v19

    .line 537
    .line 538
    check-cast v1, Lt2/l;

    .line 539
    .line 540
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    iget v1, v1, Lt2/l;->a:I

    .line 545
    .line 546
    or-int/2addr v1, v4

    .line 547
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    add-int/lit8 v15, v15, 0x1

    .line 552
    .line 553
    move-object/from16 v1, v20

    .line 554
    .line 555
    goto :goto_a

    .line 556
    :cond_1a
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    new-instance v4, Lt2/l;

    .line 561
    .line 562
    invoke-direct {v4, v1}, Lt2/l;-><init>(I)V

    .line 563
    .line 564
    .line 565
    move-object/from16 v38, v4

    .line 566
    .line 567
    goto :goto_c

    .line 568
    :cond_1b
    if-eqz v10, :cond_1c

    .line 569
    .line 570
    move-object/from16 v38, v15

    .line 571
    .line 572
    goto :goto_c

    .line 573
    :cond_1c
    if-eqz v4, :cond_1d

    .line 574
    .line 575
    :goto_b
    move-object/from16 v38, v1

    .line 576
    .line 577
    goto :goto_c

    .line 578
    :cond_1d
    sget-object v1, Lt2/l;->b:Lt2/l;

    .line 579
    .line 580
    goto :goto_b

    .line 581
    :cond_1e
    :goto_c
    move/from16 v4, v17

    .line 582
    .line 583
    move-object/from16 v1, v18

    .line 584
    .line 585
    goto/16 :goto_3

    .line 586
    .line 587
    :cond_1f
    move-object/from16 v18, v1

    .line 588
    .line 589
    const/16 v1, 0xc

    .line 590
    .line 591
    if-ne v10, v1, :cond_1e

    .line 592
    .line 593
    invoke-virtual/range {v18 .. v18}, Landroid/os/Parcel;->dataAvail()I

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    const/16 v4, 0x14

    .line 598
    .line 599
    if-lt v1, v4, :cond_7

    .line 600
    .line 601
    new-instance v40, Lf1/q0;

    .line 602
    .line 603
    invoke-virtual {v6}, Lo/a;->a()J

    .line 604
    .line 605
    .line 606
    move-result-wide v42

    .line 607
    invoke-virtual/range {v18 .. v18}, Landroid/os/Parcel;->readFloat()F

    .line 608
    .line 609
    .line 610
    move-result v1

    .line 611
    invoke-virtual/range {v18 .. v18}, Landroid/os/Parcel;->readFloat()F

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    move-object v15, v11

    .line 620
    int-to-long v10, v1

    .line 621
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    move-wide/from16 v19, v10

    .line 626
    .line 627
    int-to-long v10, v1

    .line 628
    const/16 v1, 0x20

    .line 629
    .line 630
    shl-long v19, v19, v1

    .line 631
    .line 632
    const-wide v44, 0xffffffffL

    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    and-long v10, v10, v44

    .line 638
    .line 639
    or-long v44, v19, v10

    .line 640
    .line 641
    invoke-virtual/range {v18 .. v18}, Landroid/os/Parcel;->readFloat()F

    .line 642
    .line 643
    .line 644
    move-result v41

    .line 645
    invoke-direct/range {v40 .. v45}, Lf1/q0;-><init>(FJJ)V

    .line 646
    .line 647
    .line 648
    move-object v11, v15

    .line 649
    move/from16 v4, v17

    .line 650
    .line 651
    move-object/from16 v1, v18

    .line 652
    .line 653
    move-object/from16 v39, v40

    .line 654
    .line 655
    goto/16 :goto_3

    .line 656
    .line 657
    :cond_20
    move/from16 v17, v4

    .line 658
    .line 659
    goto/16 :goto_5

    .line 660
    .line 661
    :goto_d
    new-instance v21, Li2/f0;

    .line 662
    .line 663
    const v40, 0xc000

    .line 664
    .line 665
    .line 666
    const/16 v29, 0x0

    .line 667
    .line 668
    const/16 v35, 0x0

    .line 669
    .line 670
    invoke-direct/range {v21 .. v40}, Li2/f0;-><init>(JJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;I)V

    .line 671
    .line 672
    .line 673
    move-object/from16 v1, v21

    .line 674
    .line 675
    new-instance v4, Li2/e;

    .line 676
    .line 677
    invoke-direct {v4, v3, v9, v1}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    :goto_e
    if-eq v14, v13, :cond_22

    .line 684
    .line 685
    add-int/lit8 v14, v14, 0x1

    .line 686
    .line 687
    move-object/from16 v1, p1

    .line 688
    .line 689
    move-object v11, v15

    .line 690
    move-object/from16 v10, v16

    .line 691
    .line 692
    move/from16 v4, v17

    .line 693
    .line 694
    const/4 v3, 0x2

    .line 695
    const/4 v6, 0x1

    .line 696
    goto/16 :goto_2

    .line 697
    .line 698
    :cond_21
    move-object/from16 p1, v1

    .line 699
    .line 700
    :cond_22
    new-instance v1, Li2/g;

    .line 701
    .line 702
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    sget-object v4, Li2/h;->a:Li2/g;

    .line 707
    .line 708
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 709
    .line 710
    .line 711
    move-result v4

    .line 712
    if-eqz v4, :cond_23

    .line 713
    .line 714
    const/4 v9, 0x0

    .line 715
    goto :goto_f

    .line 716
    :cond_23
    move-object v9, v12

    .line 717
    :goto_f
    invoke-direct {v1, v9, v3}, Li2/g;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    goto :goto_10

    .line 721
    :cond_24
    const/4 v1, 0x0

    .line 722
    :goto_10
    if-ne v1, v5, :cond_25

    .line 723
    .line 724
    goto :goto_13

    .line 725
    :cond_25
    :goto_11
    check-cast v1, Li2/g;

    .line 726
    .line 727
    if-nez v1, :cond_26

    .line 728
    .line 729
    goto :goto_12

    .line 730
    :cond_26
    invoke-virtual {v7}, Lh0/d1;->j()Z

    .line 731
    .line 732
    .line 733
    move-result v3

    .line 734
    if-nez v3, :cond_27

    .line 735
    .line 736
    goto :goto_12

    .line 737
    :cond_27
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    iget-object v4, v4, Ln2/s;->a:Li2/g;

    .line 746
    .line 747
    iget-object v4, v4, Li2/g;->h:Ljava/lang/String;

    .line 748
    .line 749
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 750
    .line 751
    .line 752
    move-result v4

    .line 753
    invoke-static {v3, v4}, Lig/a;->C(Ln2/s;I)Li2/g;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    new-instance v4, Li2/d;

    .line 758
    .line 759
    invoke-direct {v4, v3}, Li2/d;-><init>(Li2/g;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v4, v1}, Li2/d;->a(Li2/g;)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v4}, Li2/d;->e()Li2/g;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    iget-object v5, v5, Ln2/s;->a:Li2/g;

    .line 778
    .line 779
    iget-object v5, v5, Li2/g;->h:Ljava/lang/String;

    .line 780
    .line 781
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 782
    .line 783
    .line 784
    move-result v5

    .line 785
    invoke-static {v4, v5}, Lig/a;->B(Ln2/s;I)Li2/g;

    .line 786
    .line 787
    .line 788
    move-result-object v4

    .line 789
    new-instance v5, Li2/d;

    .line 790
    .line 791
    invoke-direct {v5, v3}, Li2/d;-><init>(Li2/g;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v5, v4}, Li2/d;->a(Li2/g;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v5}, Li2/d;->e()Li2/g;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 802
    .line 803
    .line 804
    move-result-object v4

    .line 805
    iget-wide v4, v4, Ln2/s;->b:J

    .line 806
    .line 807
    invoke-static {v4, v5}, Li2/m0;->f(J)I

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 812
    .line 813
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    add-int/2addr v1, v4

    .line 818
    invoke-static {v1, v1}, Li2/e0;->b(II)J

    .line 819
    .line 820
    .line 821
    move-result-wide v4

    .line 822
    invoke-static {v3, v4, v5}, Lh0/d1;->e(Li2/g;J)Ln2/s;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    iget-object v3, v7, Lh0/d1;->c:Lfg/l;

    .line 827
    .line 828
    invoke-interface {v3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v7, v2}, Lh0/d1;->q(Lw/h0;)V

    .line 832
    .line 833
    .line 834
    iget-object v1, v7, Lh0/d1;->a:Lw/q1;

    .line 835
    .line 836
    const/4 v15, 0x1

    .line 837
    iput-boolean v15, v1, Lw/q1;->e:Z

    .line 838
    .line 839
    :cond_28
    :goto_12
    move-object v5, v8

    .line 840
    :goto_13
    return-object v5

    .line 841
    :pswitch_0
    move v15, v6

    .line 842
    iget v1, v0, Lh0/u0;->i:I

    .line 843
    .line 844
    if-eqz v1, :cond_2b

    .line 845
    .line 846
    if-ne v1, v15, :cond_2a

    .line 847
    .line 848
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 849
    .line 850
    .line 851
    :cond_29
    :goto_14
    move-object v5, v8

    .line 852
    goto/16 :goto_16

    .line 853
    .line 854
    :cond_2a
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    const/4 v5, 0x0

    .line 858
    goto/16 :goto_16

    .line 859
    .line 860
    :cond_2b
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    iget-wide v3, v1, Ln2/s;->b:J

    .line 868
    .line 869
    invoke-static {v3, v4}, Li2/m0;->c(J)Z

    .line 870
    .line 871
    .line 872
    move-result v1

    .line 873
    if-nez v1, :cond_2c

    .line 874
    .line 875
    invoke-virtual {v7}, Lh0/d1;->j()Z

    .line 876
    .line 877
    .line 878
    move-result v1

    .line 879
    if-eqz v1, :cond_2c

    .line 880
    .line 881
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 882
    .line 883
    .line 884
    move-result-object v1

    .line 885
    invoke-static {v1}, Lig/a;->z(Ln2/s;)Li2/g;

    .line 886
    .line 887
    .line 888
    move-result-object v9

    .line 889
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 890
    .line 891
    .line 892
    move-result-object v1

    .line 893
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 894
    .line 895
    .line 896
    move-result-object v3

    .line 897
    iget-object v3, v3, Ln2/s;->a:Li2/g;

    .line 898
    .line 899
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 900
    .line 901
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 902
    .line 903
    .line 904
    move-result v3

    .line 905
    invoke-static {v1, v3}, Lig/a;->C(Ln2/s;I)Li2/g;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 910
    .line 911
    .line 912
    move-result-object v3

    .line 913
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    iget-object v4, v4, Ln2/s;->a:Li2/g;

    .line 918
    .line 919
    iget-object v4, v4, Li2/g;->h:Ljava/lang/String;

    .line 920
    .line 921
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 922
    .line 923
    .line 924
    move-result v4

    .line 925
    invoke-static {v3, v4}, Lig/a;->B(Ln2/s;I)Li2/g;

    .line 926
    .line 927
    .line 928
    move-result-object v3

    .line 929
    new-instance v4, Li2/d;

    .line 930
    .line 931
    invoke-direct {v4, v1}, Li2/d;-><init>(Li2/g;)V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v4, v3}, Li2/d;->a(Li2/g;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v4}, Li2/d;->e()Li2/g;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    invoke-virtual {v7}, Lh0/d1;->n()Ln2/s;

    .line 942
    .line 943
    .line 944
    move-result-object v3

    .line 945
    iget-wide v3, v3, Ln2/s;->b:J

    .line 946
    .line 947
    invoke-static {v3, v4}, Li2/m0;->f(J)I

    .line 948
    .line 949
    .line 950
    move-result v3

    .line 951
    invoke-static {v3, v3}, Li2/e0;->b(II)J

    .line 952
    .line 953
    .line 954
    move-result-wide v3

    .line 955
    invoke-static {v1, v3, v4}, Lh0/d1;->e(Li2/g;J)Ln2/s;

    .line 956
    .line 957
    .line 958
    move-result-object v1

    .line 959
    iget-object v3, v7, Lh0/d1;->c:Lfg/l;

    .line 960
    .line 961
    invoke-interface {v3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v7, v2}, Lh0/d1;->q(Lw/h0;)V

    .line 965
    .line 966
    .line 967
    iget-object v1, v7, Lh0/d1;->a:Lw/q1;

    .line 968
    .line 969
    const/4 v15, 0x1

    .line 970
    iput-boolean v15, v1, Lw/q1;->e:Z

    .line 971
    .line 972
    goto :goto_15

    .line 973
    :cond_2c
    const/4 v15, 0x1

    .line 974
    const/4 v9, 0x0

    .line 975
    :goto_15
    if-nez v9, :cond_2d

    .line 976
    .line 977
    goto :goto_14

    .line 978
    :cond_2d
    iget-object v1, v7, Lh0/d1;->g:Ly1/y0;

    .line 979
    .line 980
    if-eqz v1, :cond_29

    .line 981
    .line 982
    invoke-static {v9}, Lo/d;->a(Li2/g;)Ly1/x0;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    iput v15, v0, Lh0/u0;->i:I

    .line 987
    .line 988
    check-cast v1, Ly1/h;

    .line 989
    .line 990
    invoke-virtual {v1, v2}, Ly1/h;->a(Ly1/x0;)V

    .line 991
    .line 992
    .line 993
    if-ne v8, v5, :cond_29

    .line 994
    .line 995
    :goto_16
    return-object v5

    .line 996
    :pswitch_1
    move v15, v6

    .line 997
    iget v1, v0, Lh0/u0;->i:I

    .line 998
    .line 999
    if-eqz v1, :cond_31

    .line 1000
    .line 1001
    if-eq v1, v15, :cond_30

    .line 1002
    .line 1003
    const/4 v10, 0x2

    .line 1004
    if-ne v1, v10, :cond_2f

    .line 1005
    .line 1006
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1007
    .line 1008
    .line 1009
    :cond_2e
    move-object v5, v8

    .line 1010
    goto :goto_1b

    .line 1011
    :cond_2f
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1012
    .line 1013
    .line 1014
    const/4 v5, 0x0

    .line 1015
    goto :goto_1b

    .line 1016
    :cond_30
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1017
    .line 1018
    .line 1019
    goto :goto_17

    .line 1020
    :cond_31
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1021
    .line 1022
    .line 1023
    iput v15, v0, Lh0/u0;->i:I

    .line 1024
    .line 1025
    invoke-virtual {v7, v0}, Lh0/d1;->s(Lyf/c;)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v1

    .line 1029
    if-ne v1, v5, :cond_32

    .line 1030
    .line 1031
    goto :goto_1b

    .line 1032
    :cond_32
    :goto_17
    invoke-static {v7}, Lh0/d1;->a(Lh0/d1;)Lsf/e;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    if-eqz v1, :cond_2e

    .line 1037
    .line 1038
    iget-object v2, v1, Lsf/e;->g:Ljava/lang/Object;

    .line 1039
    .line 1040
    move-object v11, v2

    .line 1041
    check-cast v11, Ljava/lang/String;

    .line 1042
    .line 1043
    iget-object v1, v1, Lsf/e;->h:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast v1, Li2/m0;

    .line 1046
    .line 1047
    iget-wide v12, v1, Li2/m0;->a:J

    .line 1048
    .line 1049
    iget-object v10, v7, Lh0/d1;->i:Lh0/p;

    .line 1050
    .line 1051
    if-eqz v10, :cond_2e

    .line 1052
    .line 1053
    const/4 v4, 0x2

    .line 1054
    iput v4, v0, Lh0/u0;->i:I

    .line 1055
    .line 1056
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 1057
    .line 1058
    .line 1059
    move-result v1

    .line 1060
    if-nez v1, :cond_33

    .line 1061
    .line 1062
    goto :goto_18

    .line 1063
    :cond_33
    invoke-static {v12, v13}, Li2/m0;->c(J)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v1

    .line 1067
    if-eqz v1, :cond_34

    .line 1068
    .line 1069
    :goto_18
    move-object v1, v8

    .line 1070
    goto :goto_19

    .line 1071
    :cond_34
    new-instance v9, Lc0/i;

    .line 1072
    .line 1073
    const/4 v14, 0x0

    .line 1074
    const/4 v15, 0x2

    .line 1075
    invoke-direct/range {v9 .. v15}, Lc0/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLwf/c;I)V

    .line 1076
    .line 1077
    .line 1078
    iget-object v1, v10, Lh0/p;->a:Lwf/g;

    .line 1079
    .line 1080
    new-instance v2, Lci/e;

    .line 1081
    .line 1082
    const/4 v3, 0x0

    .line 1083
    invoke-direct {v2, v10, v9, v3}, Lci/e;-><init>(Lh0/p;Lfg/p;Lwf/c;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-static {v1, v2, v0}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v1

    .line 1090
    :goto_19
    if-ne v1, v5, :cond_35

    .line 1091
    .line 1092
    goto :goto_1a

    .line 1093
    :cond_35
    move-object v1, v8

    .line 1094
    :goto_1a
    if-ne v1, v5, :cond_2e

    .line 1095
    .line 1096
    :goto_1b
    return-object v5

    .line 1097
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
