.class public abstract Li91;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lz92;


# direct methods
.method public static final δ(JJ)Lml1;
    .locals 8

    .line 1
    new-instance v0, Lml1;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    shr-long v2, p0, v1

    .line 6
    .line 7
    long-to-int v2, v2

    .line 8
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const-wide v4, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr p0, v4

    .line 18
    long-to-int p0, p0

    .line 19
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shr-long v6, p2, v1

    .line 28
    .line 29
    long-to-int v1, v6

    .line 30
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-float/2addr v1, v2

    .line 35
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    and-long/2addr p2, v4

    .line 40
    long-to-int p2, p2

    .line 41
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    add-float/2addr p2, p0

    .line 46
    invoke-direct {v0, v3, p1, v1, p2}, Lml1;-><init>(FFFF)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public static final ε(Lbh1;Z[Lte0;F)F
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v0, :cond_3

    .line 7
    .line 8
    aget-object v4, p2, v3

    .line 9
    .line 10
    invoke-virtual {p0, v4}, Lbh1;->δ(Lte0;)F

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    cmpl-float v5, v4, v1

    .line 21
    .line 22
    if-lez v5, :cond_0

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v5, v2

    .line 27
    :goto_1
    if-ne p1, v5, :cond_2

    .line 28
    .line 29
    :cond_1
    move v1, v4

    .line 30
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_4

    .line 38
    .line 39
    return p3

    .line 40
    :cond_4
    return v1
.end method

.method public static ζ(Landroid/app/Activity;Landroid/view/View;Landroid/app/AlertDialog;Lyd1;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v4, v3, Lxx;->δ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v5, v3, Lxx;->θ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v6, v3, Lxx;->ο:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v7, v3, Lxx;->λ:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v8, v3, Lxx;->ν:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v9, v3, Lxx;->ι:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v10, v3, Lxx;->β:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v11, v3, Lxx;->η:Ljava/lang/String;

    .line 26
    .line 27
    const/16 v12, 0x10

    .line 28
    .line 29
    invoke-static {v12, v0, v10}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    invoke-virtual {v1, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    .line 36
    const v10, 0x7f0900ba

    .line 37
    .line 38
    .line 39
    const v12, 0x7f0900b6

    .line 40
    .line 41
    .line 42
    const v13, 0x7f0900c6

    .line 43
    .line 44
    .line 45
    filled-new-array {v13, v10, v12}, [I

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    const/4 v13, 0x0

    .line 50
    :goto_0
    const/4 v14, 0x3

    .line 51
    if-ge v13, v14, :cond_0

    .line 52
    .line 53
    aget v14, v10, v13

    .line 54
    .line 55
    invoke-virtual {v1, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    iget-object v15, v3, Lxx;->γ:Ljava/lang/String;

    .line 60
    .line 61
    const/16 v12, 0xc

    .line 62
    .line 63
    invoke-static {v12, v0, v15}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    invoke-virtual {v14, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v13, v13, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const v10, 0x7f0900b9

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    check-cast v12, Landroid/widget/TextView;

    .line 81
    .line 82
    const v13, 0x7f0900c7

    .line 83
    .line 84
    .line 85
    invoke-static {v11, v12, v1, v13}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    check-cast v12, Landroid/widget/TextView;

    .line 90
    .line 91
    iget-object v13, v3, Lxx;->ζ:Ljava/lang/String;

    .line 92
    .line 93
    const v14, 0x7f0900bd

    .line 94
    .line 95
    .line 96
    invoke-static {v13, v12, v1, v14}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    check-cast v12, Landroid/widget/TextView;

    .line 101
    .line 102
    const v13, 0x7f0900c1

    .line 103
    .line 104
    .line 105
    invoke-static {v11, v12, v1, v13}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    check-cast v11, Landroid/widget/TextView;

    .line 110
    .line 111
    const v12, 0x7f0900c2

    .line 112
    .line 113
    .line 114
    invoke-static {v9, v11, v1, v12}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    check-cast v11, Landroid/widget/TextView;

    .line 119
    .line 120
    const v15, 0x7f0900c4

    .line 121
    .line 122
    .line 123
    invoke-static {v8, v11, v1, v15}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    check-cast v11, Landroid/widget/TextView;

    .line 128
    .line 129
    const v15, 0x7f0900c8

    .line 130
    .line 131
    .line 132
    invoke-static {v7, v11, v1, v15}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    check-cast v11, Landroid/widget/TextView;

    .line 137
    .line 138
    const v15, 0x7f0900c3

    .line 139
    .line 140
    .line 141
    invoke-static {v6, v11, v1, v15}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    check-cast v11, Landroid/widget/TextView;

    .line 146
    .line 147
    iget-object v3, v3, Lxx;->Β:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v3, v11, v1, v10}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    new-instance v10, Lsa;

    .line 154
    .line 155
    const/16 v11, 0x11

    .line 156
    .line 157
    move-object/from16 v15, p2

    .line 158
    .line 159
    invoke-direct {v10, v15, v11}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    .line 164
    .line 165
    iget-object v3, v2, Lyd1;->β:Ljb1;

    .line 166
    .line 167
    iget-object v2, v2, Lyd1;->α:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {v1, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    check-cast v10, Landroid/widget/TextView;

    .line 174
    .line 175
    iget-object v11, v3, Ljb1;->α:Ljava/time/LocalDate;

    .line 176
    .line 177
    const-string v14, "yyyy\u5e74M\u6708d\u65e5"

    .line 178
    .line 179
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    invoke-static {v14, v15}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    invoke-virtual {v11, v14}, Ljava/time/LocalDate;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    check-cast v10, Landroid/widget/TextView;

    .line 199
    .line 200
    iget-wide v13, v3, Ljb1;->β:J

    .line 201
    .line 202
    iget v11, v3, Ljb1;->ζ:I

    .line 203
    .line 204
    const/4 v15, 0x1

    .line 205
    if-lez v11, :cond_1

    .line 206
    .line 207
    move v11, v15

    .line 208
    goto :goto_1

    .line 209
    :cond_1
    const/4 v11, 0x0

    .line 210
    :goto_1
    invoke-static {v13, v14, v11}, Li91;->κ(JZ)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    check-cast v10, Landroid/widget/TextView;

    .line 222
    .line 223
    iget-wide v11, v3, Ljb1;->γ:J

    .line 224
    .line 225
    iget v13, v3, Ljb1;->η:I

    .line 226
    .line 227
    if-lez v13, :cond_2

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_2
    const/4 v15, 0x0

    .line 231
    :goto_2
    invoke-static {v11, v12, v15}, Li91;->κ(JZ)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    .line 237
    .line 238
    const v10, 0x7f0900c4

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    check-cast v10, Landroid/widget/TextView;

    .line 246
    .line 247
    iget v11, v3, Ljb1;->δ:I

    .line 248
    .line 249
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 250
    .line 251
    .line 252
    move-result-object v12

    .line 253
    invoke-static {v12}, Ljava/text/NumberFormat;->getIntegerInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    invoke-virtual {v12, v11}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 269
    .line 270
    .line 271
    const v10, 0x7f0900c8

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    check-cast v10, Landroid/widget/TextView;

    .line 279
    .line 280
    iget v3, v3, Ljb1;->ε:I

    .line 281
    .line 282
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    invoke-static {v11}, Ljava/text/NumberFormat;->getIntegerInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-virtual {v11, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    .line 303
    .line 304
    const-string v3, "M/d"

    .line 305
    .line 306
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    invoke-static {v3, v10}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    new-instance v10, Ljava/util/ArrayList;

    .line 315
    .line 316
    const/16 v11, 0xa

    .line 317
    .line 318
    invoke-static {v2, v11}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 319
    .line 320
    .line 321
    move-result v12

    .line 322
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v12

    .line 329
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v13

    .line 333
    if-eqz v13, :cond_3

    .line 334
    .line 335
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v13

    .line 339
    check-cast v13, Ljb1;

    .line 340
    .line 341
    iget-object v13, v13, Ljb1;->α:Ljava/time/LocalDate;

    .line 342
    .line 343
    invoke-virtual {v13, v3}, Ljava/time/LocalDate;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v13

    .line 347
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_3
    new-instance v3, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;

    .line 352
    .line 353
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 358
    .line 359
    .line 360
    move-result v13

    .line 361
    invoke-direct {v3, v0, v12, v13}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;-><init>(Landroid/app/Activity;II)V

    .line 362
    .line 363
    .line 364
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 365
    .line 366
    .line 367
    move-result v12

    .line 368
    new-instance v13, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-static {v2, v11}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 371
    .line 372
    .line 373
    move-result v14

    .line 374
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v14

    .line 381
    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v15

    .line 385
    if-eqz v15, :cond_4

    .line 386
    .line 387
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v15

    .line 391
    check-cast v15, Ljb1;

    .line 392
    .line 393
    move/from16 p3, v12

    .line 394
    .line 395
    iget-wide v11, v15, Ljb1;->β:J

    .line 396
    .line 397
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 398
    .line 399
    .line 400
    move-result-object v11

    .line 401
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move/from16 v12, p3

    .line 405
    .line 406
    const/16 v11, 0xa

    .line 407
    .line 408
    goto :goto_4

    .line 409
    :cond_4
    move/from16 p3, v12

    .line 410
    .line 411
    new-instance v11, Lce1;

    .line 412
    .line 413
    const-string v12, "\u91d1\u5e01\u6536\u76ca"

    .line 414
    .line 415
    move/from16 v14, p3

    .line 416
    .line 417
    invoke-direct {v11, v14, v12, v13}, Lce1;-><init>(ILjava/lang/String;Ljava/util/List;)V

    .line 418
    .line 419
    .line 420
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 421
    .line 422
    .line 423
    move-result v12

    .line 424
    new-instance v13, Ljava/util/ArrayList;

    .line 425
    .line 426
    const/16 v14, 0xa

    .line 427
    .line 428
    invoke-static {v2, v14}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 429
    .line 430
    .line 431
    move-result v15

    .line 432
    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v14

    .line 439
    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v15

    .line 443
    if-eqz v15, :cond_5

    .line 444
    .line 445
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v15

    .line 449
    check-cast v15, Ljb1;

    .line 450
    .line 451
    move-object/from16 v16, v4

    .line 452
    .line 453
    move-object/from16 v17, v5

    .line 454
    .line 455
    iget-wide v4, v15, Ljb1;->γ:J

    .line 456
    .line 457
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-object/from16 v4, v16

    .line 465
    .line 466
    move-object/from16 v5, v17

    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_5
    move-object/from16 v16, v4

    .line 470
    .line 471
    move-object/from16 v17, v5

    .line 472
    .line 473
    new-instance v4, Lce1;

    .line 474
    .line 475
    const-string v5, "\u91d1\u5e01\u6295\u5165"

    .line 476
    .line 477
    invoke-direct {v4, v12, v5, v13}, Lce1;-><init>(ILjava/lang/String;Ljava/util/List;)V

    .line 478
    .line 479
    .line 480
    filled-new-array {v11, v4}, [Lce1;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    invoke-static {v4}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    const-string v5, "\u91d1\u5e01"

    .line 489
    .line 490
    invoke-virtual {v3, v10, v4, v5}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->β(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    const v4, 0x7f0900bb

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    check-cast v4, Landroid/widget/FrameLayout;

    .line 504
    .line 505
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 506
    .line 507
    .line 508
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 509
    .line 510
    const/4 v11, -0x1

    .line 511
    invoke-direct {v5, v11, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v4, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 515
    .line 516
    .line 517
    new-instance v3, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;

    .line 518
    .line 519
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    invoke-direct {v3, v0, v4, v5}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;-><init>(Landroid/app/Activity;II)V

    .line 528
    .line 529
    .line 530
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    new-instance v4, Ljava/util/ArrayList;

    .line 535
    .line 536
    const/16 v14, 0xa

    .line 537
    .line 538
    invoke-static {v2, v14}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 550
    .line 551
    .line 552
    move-result v12

    .line 553
    if-eqz v12, :cond_6

    .line 554
    .line 555
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v12

    .line 559
    check-cast v12, Ljb1;

    .line 560
    .line 561
    iget v12, v12, Ljb1;->δ:I

    .line 562
    .line 563
    int-to-long v12, v12

    .line 564
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 565
    .line 566
    .line 567
    move-result-object v12

    .line 568
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    goto :goto_6

    .line 572
    :cond_6
    new-instance v5, Lce1;

    .line 573
    .line 574
    const-string v12, "\u79cd\u5730\u6b21\u6570"

    .line 575
    .line 576
    invoke-direct {v5, v0, v12, v4}, Lce1;-><init>(ILjava/lang/String;Ljava/util/List;)V

    .line 577
    .line 578
    .line 579
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    new-instance v4, Ljava/util/ArrayList;

    .line 584
    .line 585
    const/16 v14, 0xa

    .line 586
    .line 587
    invoke-static {v2, v14}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 588
    .line 589
    .line 590
    move-result v12

    .line 591
    invoke-direct {v4, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 595
    .line 596
    .line 597
    move-result-object v12

    .line 598
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 599
    .line 600
    .line 601
    move-result v13

    .line 602
    if-eqz v13, :cond_7

    .line 603
    .line 604
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v13

    .line 608
    check-cast v13, Ljb1;

    .line 609
    .line 610
    iget v13, v13, Ljb1;->ε:I

    .line 611
    .line 612
    int-to-long v13, v13

    .line 613
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 614
    .line 615
    .line 616
    move-result-object v13

    .line 617
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    goto :goto_7

    .line 621
    :cond_7
    new-instance v12, Lce1;

    .line 622
    .line 623
    const-string v13, "\u6d47\u6c34\u6b21\u6570"

    .line 624
    .line 625
    invoke-direct {v12, v0, v13, v4}, Lce1;-><init>(ILjava/lang/String;Ljava/util/List;)V

    .line 626
    .line 627
    .line 628
    filled-new-array {v5, v12}, [Lce1;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    const-string v4, "\u6b21"

    .line 637
    .line 638
    invoke-virtual {v3, v10, v0, v4}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->β(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    const v0, 0x7f0900b7

    .line 642
    .line 643
    .line 644
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    check-cast v0, Landroid/widget/FrameLayout;

    .line 652
    .line 653
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 654
    .line 655
    .line 656
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 657
    .line 658
    invoke-direct {v4, v11, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 662
    .line 663
    .line 664
    const v0, 0x7f0900bc

    .line 665
    .line 666
    .line 667
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    check-cast v0, Landroid/widget/TextView;

    .line 672
    .line 673
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 674
    .line 675
    .line 676
    move-result v3

    .line 677
    const-string v4, "\u6295\u5165"

    .line 678
    .line 679
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    const-string v8, "\u6536\u76ca"

    .line 684
    .line 685
    invoke-static {v3, v5, v8, v4}, Li91;->η(IILjava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;

    .line 686
    .line 687
    .line 688
    move-result-object v3

    .line 689
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 690
    .line 691
    .line 692
    const v0, 0x7f0900b8

    .line 693
    .line 694
    .line 695
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    check-cast v0, Landroid/widget/TextView;

    .line 700
    .line 701
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    const-string v4, "\u6d47\u6c34"

    .line 706
    .line 707
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 708
    .line 709
    .line 710
    move-result v5

    .line 711
    const-string v6, "\u79cd\u5730"

    .line 712
    .line 713
    invoke-static {v3, v5, v6, v4}, Li91;->η(IILjava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;

    .line 714
    .line 715
    .line 716
    move-result-object v3

    .line 717
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 718
    .line 719
    .line 720
    const v0, 0x7f0900c3

    .line 721
    .line 722
    .line 723
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    check-cast v0, Landroid/widget/TextView;

    .line 728
    .line 729
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    const-wide/16 v3, 0x0

    .line 734
    .line 735
    move-wide v5, v3

    .line 736
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 737
    .line 738
    .line 739
    move-result v7

    .line 740
    if-eqz v7, :cond_8

    .line 741
    .line 742
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v7

    .line 746
    check-cast v7, Ljb1;

    .line 747
    .line 748
    iget v7, v7, Ljb1;->ζ:I

    .line 749
    .line 750
    int-to-long v7, v7

    .line 751
    add-long/2addr v5, v7

    .line 752
    goto :goto_8

    .line 753
    :cond_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    move-wide v7, v3

    .line 758
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 759
    .line 760
    .line 761
    move-result v2

    .line 762
    if-eqz v2, :cond_9

    .line 763
    .line 764
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    check-cast v2, Ljb1;

    .line 769
    .line 770
    iget v2, v2, Ljb1;->η:I

    .line 771
    .line 772
    int-to-long v9, v2

    .line 773
    add-long/2addr v7, v9

    .line 774
    goto :goto_9

    .line 775
    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 776
    .line 777
    const-string v2, "\u4ec5\u7edf\u8ba1 DyHelper \u7ecf\u670d\u52a1\u7aef\u786e\u8ba4\u6210\u529f\u7684\u64cd\u4f5c\uff0c\u6309\u8bbe\u5907\u5f53\u524d\u65f6\u533a\u81ea\u7136\u65e5\u7d2f\u8ba1\u3002\u91d1\u5e01\u91d1\u989d\u4f9d\u636e\u5bbf\u4e3b\u79cd\u5b50\u76ee\u5f55\uff0c\u53cc\u500d\u4f5c\u7269\u6309 2 \u500d\u6536\u76ca\u8ba1\u5165\u3002\u672c\u9875\u4e0e\u5165\u53e3\u5361\u7247\u4f7f\u7528\u70b9\u51fb\u65f6\u7684\u540c\u4e00\u4efd\u5feb\u7167\uff1b\u540e\u53f0\u4efb\u52a1\u7ee7\u7eed\u8fd0\u884c\u65f6\uff0c\u91cd\u65b0\u6253\u5f00\u53ef\u67e5\u770b\u66f4\u65b0\u3002"

    .line 778
    .line 779
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    cmp-long v2, v5, v3

    .line 783
    .line 784
    if-gtz v2, :cond_a

    .line 785
    .line 786
    cmp-long v9, v7, v3

    .line 787
    .line 788
    if-lez v9, :cond_e

    .line 789
    .line 790
    :cond_a
    const-string v9, " * \u8fd1 7 \u5929\u6709"

    .line 791
    .line 792
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    const-string v9, " "

    .line 796
    .line 797
    if-lez v2, :cond_b

    .line 798
    .line 799
    new-instance v10, Ljava/lang/StringBuilder;

    .line 800
    .line 801
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v10, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    const-string v5, " \u6b21\u6536\u83b7\u6536\u76ca\u672a\u77e5"

    .line 808
    .line 809
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v5

    .line 816
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    :cond_b
    if-lez v2, :cond_c

    .line 820
    .line 821
    cmp-long v2, v7, v3

    .line 822
    .line 823
    if-lez v2, :cond_c

    .line 824
    .line 825
    const-string v2, "\u3001"

    .line 826
    .line 827
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    :cond_c
    cmp-long v2, v7, v3

    .line 831
    .line 832
    if-lez v2, :cond_d

    .line 833
    .line 834
    new-instance v2, Ljava/lang/StringBuilder;

    .line 835
    .line 836
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 840
    .line 841
    .line 842
    const-string v3, " \u6b21\u79cd\u5730\u6295\u5165\u672a\u77e5"

    .line 843
    .line 844
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    .line 853
    .line 854
    :cond_d
    const-string v2, "\uff0c\u672a\u8ba1\u5165\u91d1\u5e01\u66f2\u7ebf\u3002"

    .line 855
    .line 856
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 857
    .line 858
    .line 859
    :cond_e
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 864
    .line 865
    .line 866
    return-void
.end method

.method public static η(IILjava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;
    .locals 3

    .line 1
    const-string v0, "\u25cf "

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    new-instance v0, Landroid/text/SpannableString;

    .line 12
    .line 13
    const-string v1, "    "

    .line 14
    .line 15
    invoke-static {p2, v1, p3}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-direct {v0, p3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    new-instance p3, Landroid/text/style/ForegroundColorSpan;

    .line 23
    .line 24
    invoke-direct {p3, p0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    const/4 v1, 0x0

    .line 32
    const/16 v2, 0x21

    .line 33
    .line 34
    invoke-virtual {v0, p3, v1, p0, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/lit8 p0, p0, 0x4

    .line 42
    .line 43
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    .line 44
    .line 45
    invoke-direct {p2, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {v0, p2, p0, p1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public static final θ()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public static final ι(Lq01;ZZ)Lml1;
    .locals 1

    .line 1
    iget-object v0, p0, Lq01;->ε:Lq01;

    .line 2
    .line 3
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lml1;->ε:Lml1;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/16 v0, 0x8

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    invoke-static {p0, v0}, Lh62;->ф(Lur;I)Lq31;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ls1;->ι(Lmp0;)Lmp0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1, p0, p2}, Lmp0;->ж(Lmp0;Z)Lml1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p0, v0}, Lh62;->ф(Lur;I)Lq31;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lq31;->ｏ()Lml1;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static κ(JZ)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/text/NumberFormat;->getIntegerInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0, p1}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    const-string p1, "*"

    .line 16
    .line 17
    invoke-static {p0, p1}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public static final λ(J)J
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
    const/high16 v2, 0x40000000    # 2.0f

    .line 11
    .line 12
    div-float/2addr v1, v2

    .line 13
    const-wide v3, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p0, v3

    .line 19
    long-to-int p0, p0

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    div-float/2addr p0, v2

    .line 25
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-long v1, p1

    .line 30
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    int-to-long p0, p0

    .line 35
    shl-long v0, v1, v0

    .line 36
    .line 37
    and-long/2addr p0, v3

    .line 38
    or-long/2addr p0, v0

    .line 39
    return-wide p0
.end method

.method public static final μ(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;
    .locals 12

    .line 1
    instance-of v0, p1, Landroid/text/Spanned;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/text/Spanned;

    .line 7
    .line 8
    add-int/lit8 v1, p2, -0x1

    .line 9
    .line 10
    const-class v2, Landroid/text/style/MetricAffectingSpan;

    .line 11
    .line 12
    invoke-interface {v0, v1, p3, v2}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eq v1, p3, :cond_3

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v3, Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v4, Landroid/text/TextPaint;

    .line 29
    .line 30
    invoke-direct {v4}, Landroid/text/TextPaint;-><init>()V

    .line 31
    .line 32
    .line 33
    :goto_0
    if-ge p2, p3, :cond_2

    .line 34
    .line 35
    invoke-interface {v0, p2, p3, v2}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-interface {v0, p2, v5, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, [Landroid/text/style/MetricAffectingSpan;

    .line 44
    .line 45
    invoke-virtual {v4, p0}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 46
    .line 47
    .line 48
    array-length v7, v6

    .line 49
    const/4 v8, 0x0

    .line 50
    :goto_1
    if-ge v8, v7, :cond_1

    .line 51
    .line 52
    aget-object v9, v6, v8

    .line 53
    .line 54
    invoke-interface {v0, v9}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    invoke-interface {v0, v9}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    if-eq v10, v11, :cond_0

    .line 63
    .line 64
    invoke-virtual {v9, v4}, Landroid/text/style/MetricAffectingSpan;->updateMeasureState(Landroid/text/TextPaint;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v4, p1, p2, v5, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V

    .line 71
    .line 72
    .line 73
    iget p2, v1, Landroid/graphics/Rect;->right:I

    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    add-int/2addr v6, p2

    .line 80
    iput v6, v1, Landroid/graphics/Rect;->right:I

    .line 81
    .line 82
    iget p2, v1, Landroid/graphics/Rect;->top:I

    .line 83
    .line 84
    iget v6, v3, Landroid/graphics/Rect;->top:I

    .line 85
    .line 86
    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    iput p2, v1, Landroid/graphics/Rect;->top:I

    .line 91
    .line 92
    iget p2, v1, Landroid/graphics/Rect;->bottom:I

    .line 93
    .line 94
    iget v6, v3, Landroid/graphics/Rect;->bottom:I

    .line 95
    .line 96
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    iput p2, v1, Landroid/graphics/Rect;->bottom:I

    .line 101
    .line 102
    move p2, v5

    .line 103
    goto :goto_0

    .line 104
    :cond_2
    return-object v1

    .line 105
    :cond_3
    new-instance v0, Landroid/graphics/Rect;

    .line 106
    .line 107
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V

    .line 111
    .line 112
    .line 113
    return-object v0
.end method

.method public static final ν(Lzr1;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lh62;->ц(Lur;)Lyp0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lyp0;->Ε()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final ξ(Landroid/view/ViewStructure;Lyp0;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lol1;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lfs1;->α:Lis1;

    .line 6
    .line 7
    sget-object v2, Lwr1;->α:Lis1;

    .line 8
    .line 9
    invoke-virtual {v1}, Lyp0;->υ()Lxr1;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v8, 0x2

    .line 14
    const/16 v11, 0x8

    .line 15
    .line 16
    const/4 v14, 0x1

    .line 17
    if-eqz v2, :cond_14

    .line 18
    .line 19
    iget-object v2, v2, Lxr1;->ε:Lb21;

    .line 20
    .line 21
    if-eqz v2, :cond_14

    .line 22
    .line 23
    iget-object v15, v2, Lb21;->β:[Ljava/lang/Object;

    .line 24
    .line 25
    const-wide/16 v16, 0x80

    .line 26
    .line 27
    iget-object v3, v2, Lb21;->γ:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v2, v2, Lb21;->α:[J

    .line 30
    .line 31
    array-length v4, v2

    .line 32
    sub-int/2addr v4, v8

    .line 33
    move/from16 v31, v8

    .line 34
    .line 35
    if-ltz v4, :cond_12

    .line 36
    .line 37
    move/from16 v28, v14

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const-wide/16 v18, 0xff

    .line 42
    .line 43
    const/16 v20, 0x0

    .line 44
    .line 45
    const/16 v21, 0x0

    .line 46
    .line 47
    const/16 v22, 0x0

    .line 48
    .line 49
    const/16 v23, 0x0

    .line 50
    .line 51
    const/16 v24, 0x0

    .line 52
    .line 53
    const/16 v25, 0x0

    .line 54
    .line 55
    const/16 v26, 0x0

    .line 56
    .line 57
    const/16 v27, 0x0

    .line 58
    .line 59
    const/16 v29, 0x0

    .line 60
    .line 61
    const/16 v30, 0x7

    .line 62
    .line 63
    :goto_0
    aget-wide v7, v2, v5

    .line 64
    .line 65
    const-wide v32, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    not-long v9, v7

    .line 71
    shl-long v9, v9, v30

    .line 72
    .line 73
    and-long/2addr v9, v7

    .line 74
    and-long v9, v9, v32

    .line 75
    .line 76
    cmp-long v9, v9, v32

    .line 77
    .line 78
    if-eqz v9, :cond_11

    .line 79
    .line 80
    sub-int v9, v5, v4

    .line 81
    .line 82
    not-int v9, v9

    .line 83
    ushr-int/lit8 v9, v9, 0x1f

    .line 84
    .line 85
    rsub-int/lit8 v9, v9, 0x8

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    :goto_1
    if-ge v10, v9, :cond_10

    .line 89
    .line 90
    and-long v34, v7, v18

    .line 91
    .line 92
    cmp-long v34, v34, v16

    .line 93
    .line 94
    if-gez v34, :cond_f

    .line 95
    .line 96
    shl-int/lit8 v34, v5, 0x3

    .line 97
    .line 98
    add-int v34, v34, v10

    .line 99
    .line 100
    aget-object v35, v15, v34

    .line 101
    .line 102
    aget-object v34, v3, v34

    .line 103
    .line 104
    move-object/from16 v12, v35

    .line 105
    .line 106
    check-cast v12, Lis1;

    .line 107
    .line 108
    sget-object v13, Lfs1;->σ:Lis1;

    .line 109
    .line 110
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    if-eqz v13, :cond_0

    .line 115
    .line 116
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-object/from16 v6, v34

    .line 120
    .line 121
    check-cast v6, La2;

    .line 122
    .line 123
    goto/16 :goto_2

    .line 124
    .line 125
    :cond_0
    sget-object v13, Lfs1;->α:Lis1;

    .line 126
    .line 127
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-eqz v13, :cond_1

    .line 132
    .line 133
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    check-cast v34, Ljava/util/List;

    .line 137
    .line 138
    invoke-static/range {v34 .. v34}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    check-cast v12, Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v12, :cond_f

    .line 145
    .line 146
    invoke-virtual {v0, v12}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_2

    .line 150
    .line 151
    :cond_1
    sget-object v13, Lfs1;->ρ:Lis1;

    .line 152
    .line 153
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-eqz v13, :cond_2

    .line 158
    .line 159
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-object/from16 v24, v34

    .line 163
    .line 164
    check-cast v24, Llp;

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :cond_2
    sget-object v13, Lfs1;->τ:Lis1;

    .line 169
    .line 170
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    if-eqz v13, :cond_3

    .line 175
    .line 176
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object/from16 v23, v34

    .line 180
    .line 181
    check-cast v23, Lg2;

    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :cond_3
    sget-object v13, Lfs1;->Ζ:Lis1;

    .line 186
    .line 187
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    if-eqz v13, :cond_4

    .line 192
    .line 193
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-object/from16 v22, v34

    .line 197
    .line 198
    check-cast v22, Lg4;

    .line 199
    .line 200
    goto/16 :goto_2

    .line 201
    .line 202
    :cond_4
    sget-object v13, Lfs1;->μ:Lis1;

    .line 203
    .line 204
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v13, :cond_5

    .line 209
    .line 210
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    check-cast v34, Ljava/lang/Boolean;

    .line 214
    .line 215
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Boolean;->booleanValue()Z

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    invoke-virtual {v0, v12}, Landroid/view/ViewStructure;->setFocused(Z)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_2

    .line 223
    .line 224
    :cond_5
    sget-object v13, Lfs1;->Ν:Lis1;

    .line 225
    .line 226
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    if-eqz v13, :cond_6

    .line 231
    .line 232
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-object/from16 v29, v34

    .line 236
    .line 237
    check-cast v29, Ljava/lang/Integer;

    .line 238
    .line 239
    goto/16 :goto_2

    .line 240
    .line 241
    :cond_6
    sget-object v13, Lfs1;->Κ:Lis1;

    .line 242
    .line 243
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    if-eqz v13, :cond_7

    .line 248
    .line 249
    move/from16 v27, v14

    .line 250
    .line 251
    goto/16 :goto_2

    .line 252
    .line 253
    :cond_7
    sget-object v13, Lfs1;->ξ:Lis1;

    .line 254
    .line 255
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-eqz v13, :cond_8

    .line 260
    .line 261
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    check-cast v34, Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result v28

    .line 270
    goto :goto_2

    .line 271
    :cond_8
    sget-object v13, Lfs1;->ψ:Lis1;

    .line 272
    .line 273
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    if-eqz v13, :cond_9

    .line 278
    .line 279
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-object/from16 v26, v34

    .line 283
    .line 284
    check-cast v26, Lso1;

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_9
    sget-object v13, Lfs1;->Θ:Lis1;

    .line 288
    .line 289
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    if-eqz v13, :cond_a

    .line 294
    .line 295
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-object/from16 v25, v34

    .line 299
    .line 300
    check-cast v25, Ljava/lang/Boolean;

    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_a
    sget-object v13, Lfs1;->Ι:Lis1;

    .line 304
    .line 305
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    if-eqz v13, :cond_b

    .line 310
    .line 311
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-object/from16 v21, v34

    .line 315
    .line 316
    check-cast v21, Lr42;

    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_b
    sget-object v13, Lwr1;->β:Lis1;

    .line 320
    .line 321
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    if-eqz v13, :cond_c

    .line 326
    .line 327
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setClickable(Z)V

    .line 328
    .line 329
    .line 330
    goto :goto_2

    .line 331
    :cond_c
    sget-object v13, Lwr1;->γ:Lis1;

    .line 332
    .line 333
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v13

    .line 337
    if-eqz v13, :cond_d

    .line 338
    .line 339
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setLongClickable(Z)V

    .line 340
    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_d
    sget-object v13, Lwr1;->φ:Lis1;

    .line 344
    .line 345
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v13

    .line 349
    if-eqz v13, :cond_e

    .line 350
    .line 351
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setFocusable(Z)V

    .line 352
    .line 353
    .line 354
    goto :goto_2

    .line 355
    :cond_e
    sget-object v13, Lwr1;->κ:Lis1;

    .line 356
    .line 357
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v12

    .line 361
    if-eqz v12, :cond_f

    .line 362
    .line 363
    move/from16 v20, v14

    .line 364
    .line 365
    :cond_f
    :goto_2
    shr-long/2addr v7, v11

    .line 366
    add-int/lit8 v10, v10, 0x1

    .line 367
    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :cond_10
    if-ne v9, v11, :cond_13

    .line 371
    .line 372
    :cond_11
    if-eq v5, v4, :cond_13

    .line 373
    .line 374
    add-int/lit8 v5, v5, 0x1

    .line 375
    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_12
    const-wide/16 v18, 0xff

    .line 379
    .line 380
    const/16 v30, 0x7

    .line 381
    .line 382
    const-wide v32, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    move/from16 v28, v14

    .line 388
    .line 389
    const/4 v6, 0x0

    .line 390
    const/16 v20, 0x0

    .line 391
    .line 392
    const/16 v21, 0x0

    .line 393
    .line 394
    const/16 v22, 0x0

    .line 395
    .line 396
    const/16 v23, 0x0

    .line 397
    .line 398
    const/16 v24, 0x0

    .line 399
    .line 400
    const/16 v25, 0x0

    .line 401
    .line 402
    const/16 v26, 0x0

    .line 403
    .line 404
    const/16 v27, 0x0

    .line 405
    .line 406
    const/16 v29, 0x0

    .line 407
    .line 408
    :cond_13
    move-object/from16 v2, v21

    .line 409
    .line 410
    move-object/from16 v3, v22

    .line 411
    .line 412
    move-object/from16 v4, v23

    .line 413
    .line 414
    move-object/from16 v5, v26

    .line 415
    .line 416
    goto :goto_3

    .line 417
    :cond_14
    move/from16 v31, v8

    .line 418
    .line 419
    const-wide/16 v16, 0x80

    .line 420
    .line 421
    const-wide/16 v18, 0xff

    .line 422
    .line 423
    const/16 v30, 0x7

    .line 424
    .line 425
    const-wide v32, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    move/from16 v28, v14

    .line 431
    .line 432
    const/4 v2, 0x0

    .line 433
    const/4 v3, 0x0

    .line 434
    const/4 v4, 0x0

    .line 435
    const/4 v5, 0x0

    .line 436
    const/4 v6, 0x0

    .line 437
    const/16 v20, 0x0

    .line 438
    .line 439
    const/16 v24, 0x0

    .line 440
    .line 441
    const/16 v25, 0x0

    .line 442
    .line 443
    const/16 v27, 0x0

    .line 444
    .line 445
    const/16 v29, 0x0

    .line 446
    .line 447
    :goto_3
    invoke-virtual {v1}, Lyp0;->υ()Lxr1;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    if-eqz v7, :cond_18

    .line 452
    .line 453
    iget-boolean v8, v7, Lxr1;->η:Z

    .line 454
    .line 455
    if-eqz v8, :cond_18

    .line 456
    .line 457
    iget-boolean v8, v7, Lxr1;->θ:Z

    .line 458
    .line 459
    if-eqz v8, :cond_15

    .line 460
    .line 461
    goto :goto_5

    .line 462
    :cond_15
    invoke-virtual {v7}, Lxr1;->β()Lxr1;

    .line 463
    .line 464
    .line 465
    move-result-object v7

    .line 466
    new-instance v8, Lv11;

    .line 467
    .line 468
    invoke-virtual {v1}, Lyp0;->μ()Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v9

    .line 472
    check-cast v9, Lh21;

    .line 473
    .line 474
    iget-object v9, v9, Lh21;->ε:Lk21;

    .line 475
    .line 476
    iget v9, v9, Lk21;->η:I

    .line 477
    .line 478
    invoke-direct {v8, v9}, Lv11;-><init>(I)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1}, Lyp0;->μ()Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v9

    .line 485
    invoke-virtual {v8, v9}, Lv11;->γ(Ljava/util/List;)V

    .line 486
    .line 487
    .line 488
    :cond_16
    :goto_4
    invoke-virtual {v8}, Lv11;->ι()Z

    .line 489
    .line 490
    .line 491
    move-result v9

    .line 492
    if-eqz v9, :cond_18

    .line 493
    .line 494
    iget v9, v8, Lv11;->β:I

    .line 495
    .line 496
    sub-int/2addr v9, v14

    .line 497
    invoke-virtual {v8, v9}, Lv11;->λ(I)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    check-cast v9, Lyp0;

    .line 502
    .line 503
    invoke-virtual {v9}, Lyp0;->υ()Lxr1;

    .line 504
    .line 505
    .line 506
    move-result-object v10

    .line 507
    if-eqz v10, :cond_16

    .line 508
    .line 509
    iget-boolean v12, v10, Lxr1;->η:Z

    .line 510
    .line 511
    if-eqz v12, :cond_17

    .line 512
    .line 513
    goto :goto_4

    .line 514
    :cond_17
    invoke-virtual {v7, v10}, Lxr1;->δ(Lxr1;)V

    .line 515
    .line 516
    .line 517
    iget-boolean v10, v10, Lxr1;->θ:Z

    .line 518
    .line 519
    if-nez v10, :cond_16

    .line 520
    .line 521
    invoke-virtual {v9}, Lyp0;->μ()Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v9

    .line 525
    invoke-virtual {v8, v9}, Lv11;->γ(Ljava/util/List;)V

    .line 526
    .line 527
    .line 528
    goto :goto_4

    .line 529
    :cond_18
    :goto_5
    if-eqz v7, :cond_1e

    .line 530
    .line 531
    iget-object v7, v7, Lxr1;->ε:Lb21;

    .line 532
    .line 533
    if-eqz v7, :cond_1e

    .line 534
    .line 535
    iget-object v8, v7, Lb21;->β:[Ljava/lang/Object;

    .line 536
    .line 537
    iget-object v9, v7, Lb21;->γ:[Ljava/lang/Object;

    .line 538
    .line 539
    iget-object v7, v7, Lb21;->α:[J

    .line 540
    .line 541
    array-length v10, v7

    .line 542
    add-int/lit8 v10, v10, -0x2

    .line 543
    .line 544
    move/from16 v21, v14

    .line 545
    .line 546
    if-ltz v10, :cond_1f

    .line 547
    .line 548
    const/4 v12, 0x0

    .line 549
    const/4 v13, 0x0

    .line 550
    :goto_6
    aget-wide v14, v7, v12

    .line 551
    .line 552
    move/from16 v22, v11

    .line 553
    .line 554
    move/from16 v23, v12

    .line 555
    .line 556
    not-long v11, v14

    .line 557
    shl-long v11, v11, v30

    .line 558
    .line 559
    and-long/2addr v11, v14

    .line 560
    and-long v11, v11, v32

    .line 561
    .line 562
    cmp-long v11, v11, v32

    .line 563
    .line 564
    if-eqz v11, :cond_1d

    .line 565
    .line 566
    sub-int v12, v23, v10

    .line 567
    .line 568
    not-int v11, v12

    .line 569
    ushr-int/lit8 v11, v11, 0x1f

    .line 570
    .line 571
    rsub-int/lit8 v11, v11, 0x8

    .line 572
    .line 573
    const/4 v12, 0x0

    .line 574
    :goto_7
    if-ge v12, v11, :cond_1c

    .line 575
    .line 576
    and-long v36, v14, v18

    .line 577
    .line 578
    cmp-long v26, v36, v16

    .line 579
    .line 580
    if-gez v26, :cond_1a

    .line 581
    .line 582
    shl-int/lit8 v26, v23, 0x3

    .line 583
    .line 584
    add-int v26, v26, v12

    .line 585
    .line 586
    aget-object v34, v8, v26

    .line 587
    .line 588
    aget-object v26, v9, v26

    .line 589
    .line 590
    move-object/from16 v36, v7

    .line 591
    .line 592
    move-object/from16 v7, v34

    .line 593
    .line 594
    check-cast v7, Lis1;

    .line 595
    .line 596
    move-object/from16 v34, v8

    .line 597
    .line 598
    sget-object v8, Lfs1;->κ:Lis1;

    .line 599
    .line 600
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v8

    .line 604
    if-eqz v8, :cond_19

    .line 605
    .line 606
    const/4 v8, 0x0

    .line 607
    invoke-virtual {v0, v8}, Landroid/view/ViewStructure;->setEnabled(Z)V

    .line 608
    .line 609
    .line 610
    goto :goto_8

    .line 611
    :cond_19
    sget-object v8, Lfs1;->Β:Lis1;

    .line 612
    .line 613
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v7

    .line 617
    if-eqz v7, :cond_1b

    .line 618
    .line 619
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    move-object/from16 v13, v26

    .line 623
    .line 624
    check-cast v13, Ljava/util/List;

    .line 625
    .line 626
    goto :goto_8

    .line 627
    :cond_1a
    move-object/from16 v36, v7

    .line 628
    .line 629
    move-object/from16 v34, v8

    .line 630
    .line 631
    :cond_1b
    :goto_8
    shr-long v14, v14, v22

    .line 632
    .line 633
    add-int/lit8 v12, v12, 0x1

    .line 634
    .line 635
    move-object/from16 v8, v34

    .line 636
    .line 637
    move-object/from16 v7, v36

    .line 638
    .line 639
    goto :goto_7

    .line 640
    :cond_1c
    move-object/from16 v36, v7

    .line 641
    .line 642
    move-object/from16 v34, v8

    .line 643
    .line 644
    move/from16 v7, v22

    .line 645
    .line 646
    if-ne v11, v7, :cond_20

    .line 647
    .line 648
    :goto_9
    move/from16 v8, v23

    .line 649
    .line 650
    goto :goto_a

    .line 651
    :cond_1d
    move-object/from16 v36, v7

    .line 652
    .line 653
    move-object/from16 v34, v8

    .line 654
    .line 655
    move/from16 v7, v22

    .line 656
    .line 657
    goto :goto_9

    .line 658
    :goto_a
    if-eq v8, v10, :cond_20

    .line 659
    .line 660
    add-int/lit8 v12, v8, 0x1

    .line 661
    .line 662
    move v11, v7

    .line 663
    move-object/from16 v8, v34

    .line 664
    .line 665
    move-object/from16 v7, v36

    .line 666
    .line 667
    goto :goto_6

    .line 668
    :cond_1e
    move/from16 v21, v14

    .line 669
    .line 670
    :cond_1f
    const/4 v13, 0x0

    .line 671
    :cond_20
    iget v7, v1, Lyp0;->ζ:I

    .line 672
    .line 673
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 674
    .line 675
    .line 676
    move-result-object v7

    .line 677
    invoke-virtual {v1}, Lyp0;->σ()Lyp0;

    .line 678
    .line 679
    .line 680
    move-result-object v8

    .line 681
    if-nez v8, :cond_21

    .line 682
    .line 683
    const/4 v7, 0x0

    .line 684
    :cond_21
    if-eqz v7, :cond_22

    .line 685
    .line 686
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 687
    .line 688
    .line 689
    move-result v7

    .line 690
    :goto_b
    move-object/from16 v8, p2

    .line 691
    .line 692
    goto :goto_c

    .line 693
    :cond_22
    const/4 v7, -0x1

    .line 694
    goto :goto_b

    .line 695
    :goto_c
    invoke-virtual {v0, v8, v7}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    .line 696
    .line 697
    .line 698
    move-object/from16 v8, p3

    .line 699
    .line 700
    const/4 v9, 0x0

    .line 701
    invoke-virtual {v0, v7, v8, v9, v9}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    if-eqz v6, :cond_23

    .line 705
    .line 706
    iget v6, v6, La2;->α:I

    .line 707
    .line 708
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 709
    .line 710
    .line 711
    move-result-object v12

    .line 712
    goto :goto_d

    .line 713
    :cond_23
    if-eqz v20, :cond_24

    .line 714
    .line 715
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 716
    .line 717
    .line 718
    move-result-object v12

    .line 719
    goto :goto_d

    .line 720
    :cond_24
    if-eqz v2, :cond_25

    .line 721
    .line 722
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 723
    .line 724
    .line 725
    move-result-object v12

    .line 726
    goto :goto_d

    .line 727
    :cond_25
    move-object v12, v9

    .line 728
    :goto_d
    if-eqz v12, :cond_26

    .line 729
    .line 730
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 731
    .line 732
    .line 733
    move-result v6

    .line 734
    invoke-virtual {v0, v6}, Landroid/view/ViewStructure;->setAutofillType(I)V

    .line 735
    .line 736
    .line 737
    :cond_26
    if-eqz v3, :cond_29

    .line 738
    .line 739
    iget-object v3, v3, Lg4;->ζ:Ljava/lang/String;

    .line 740
    .line 741
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 742
    .line 743
    .line 744
    move-result v6

    .line 745
    const/16 v7, 0x1388

    .line 746
    .line 747
    if-ge v6, v7, :cond_27

    .line 748
    .line 749
    goto :goto_e

    .line 750
    :cond_27
    const/16 v6, 0x1387

    .line 751
    .line 752
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    .line 753
    .line 754
    .line 755
    move-result v8

    .line 756
    invoke-static {v8}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 757
    .line 758
    .line 759
    move-result v8

    .line 760
    if-eqz v8, :cond_28

    .line 761
    .line 762
    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    .line 763
    .line 764
    .line 765
    move-result v8

    .line 766
    invoke-static {v8}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 767
    .line 768
    .line 769
    move-result v8

    .line 770
    if-eqz v8, :cond_28

    .line 771
    .line 772
    invoke-static {v3, v6}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    goto :goto_e

    .line 777
    :cond_28
    invoke-static {v3, v7}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v3

    .line 781
    :goto_e
    invoke-static {v3}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 782
    .line 783
    .line 784
    move-result-object v3

    .line 785
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 786
    .line 787
    .line 788
    :cond_29
    if-eqz v4, :cond_2a

    .line 789
    .line 790
    iget-object v3, v4, Lg2;->α:Landroid/view/autofill/AutofillValue;

    .line 791
    .line 792
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 793
    .line 794
    .line 795
    :cond_2a
    if-eqz v24, :cond_2b

    .line 796
    .line 797
    invoke-static/range {v24 .. v24}, Lln0;->Θ(Llp;)[Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    if-eqz v3, :cond_2b

    .line 802
    .line 803
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillHints([Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    :cond_2b
    move-object/from16 v3, p4

    .line 807
    .line 808
    iget-object v3, v3, Lol1;->β:Ln2;

    .line 809
    .line 810
    iget v4, v1, Lyp0;->ζ:I

    .line 811
    .line 812
    new-instance v6, Lhi1;

    .line 813
    .line 814
    invoke-direct {v6, v0}, Lhi1;-><init>(Landroid/view/ViewStructure;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v3, v4, v6}, Ln2;->ζ(ILg80;)V

    .line 818
    .line 819
    .line 820
    if-eqz v25, :cond_2c

    .line 821
    .line 822
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 823
    .line 824
    .line 825
    move-result v3

    .line 826
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setSelected(Z)V

    .line 827
    .line 828
    .line 829
    :cond_2c
    const/4 v3, 0x4

    .line 830
    if-eqz v2, :cond_2e

    .line 831
    .line 832
    move/from16 v4, v21

    .line 833
    .line 834
    invoke-virtual {v0, v4}, Landroid/view/ViewStructure;->setCheckable(Z)V

    .line 835
    .line 836
    .line 837
    sget-object v4, Lr42;->ε:Lr42;

    .line 838
    .line 839
    if-ne v2, v4, :cond_2d

    .line 840
    .line 841
    const/4 v2, 0x1

    .line 842
    goto :goto_f

    .line 843
    :cond_2d
    const/4 v2, 0x0

    .line 844
    :goto_f
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setChecked(Z)V

    .line 845
    .line 846
    .line 847
    goto :goto_11

    .line 848
    :cond_2e
    if-eqz v25, :cond_31

    .line 849
    .line 850
    if-nez v5, :cond_30

    .line 851
    .line 852
    :cond_2f
    const/4 v4, 0x1

    .line 853
    goto :goto_10

    .line 854
    :cond_30
    iget v2, v5, Lso1;->α:I

    .line 855
    .line 856
    if-ne v2, v3, :cond_2f

    .line 857
    .line 858
    goto :goto_11

    .line 859
    :goto_10
    invoke-virtual {v0, v4}, Landroid/view/ViewStructure;->setCheckable(Z)V

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setChecked(Z)V

    .line 867
    .line 868
    .line 869
    :cond_31
    :goto_11
    sget-object v2, Llp;->α:Lkp;

    .line 870
    .line 871
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    sget-object v2, Lkp;->β:Lb2;

    .line 875
    .line 876
    invoke-static {v2}, Lln0;->Θ(Llp;)[Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v2

    .line 880
    invoke-static {v2}, Lg7;->а([Ljava/lang/Object;)Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    check-cast v2, Ljava/lang/String;

    .line 885
    .line 886
    if-eqz v24, :cond_33

    .line 887
    .line 888
    invoke-static/range {v24 .. v24}, Lln0;->Θ(Llp;)[Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v4

    .line 892
    if-eqz v4, :cond_33

    .line 893
    .line 894
    invoke-static {v4, v2}, Lg7;->Κ([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v2

    .line 898
    const/4 v4, 0x1

    .line 899
    if-ne v2, v4, :cond_32

    .line 900
    .line 901
    move v2, v4

    .line 902
    goto :goto_13

    .line 903
    :cond_32
    :goto_12
    const/4 v2, 0x0

    .line 904
    goto :goto_13

    .line 905
    :cond_33
    const/4 v4, 0x1

    .line 906
    goto :goto_12

    .line 907
    :goto_13
    if-nez v27, :cond_35

    .line 908
    .line 909
    if-eqz v2, :cond_34

    .line 910
    .line 911
    goto :goto_14

    .line 912
    :cond_34
    const/4 v2, 0x0

    .line 913
    goto :goto_15

    .line 914
    :cond_35
    :goto_14
    move v2, v4

    .line 915
    :goto_15
    if-nez v2, :cond_37

    .line 916
    .line 917
    if-eqz v28, :cond_36

    .line 918
    .line 919
    goto :goto_16

    .line 920
    :cond_36
    const/4 v14, 0x0

    .line 921
    goto :goto_17

    .line 922
    :cond_37
    :goto_16
    move v14, v4

    .line 923
    :goto_17
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setDataIsSensitive(Z)V

    .line 924
    .line 925
    .line 926
    iget-object v4, v1, Lyp0;->Κ:Lk31;

    .line 927
    .line 928
    iget-object v4, v4, Lk31;->δ:Lq31;

    .line 929
    .line 930
    invoke-virtual {v4}, Lq31;->ａ()Z

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    if-eqz v4, :cond_38

    .line 935
    .line 936
    goto :goto_18

    .line 937
    :cond_38
    const/4 v3, 0x0

    .line 938
    :goto_18
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setVisibility(I)V

    .line 939
    .line 940
    .line 941
    if-eqz v13, :cond_3a

    .line 942
    .line 943
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 944
    .line 945
    .line 946
    move-result v3

    .line 947
    const-string v4, ""

    .line 948
    .line 949
    const/4 v6, 0x0

    .line 950
    :goto_19
    if-ge v6, v3, :cond_39

    .line 951
    .line 952
    invoke-interface {v13, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v7

    .line 956
    check-cast v7, Lg4;

    .line 957
    .line 958
    new-instance v8, Ljava/lang/StringBuilder;

    .line 959
    .line 960
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    iget-object v4, v7, Lg4;->ζ:Ljava/lang/String;

    .line 967
    .line 968
    const/16 v7, 0xa

    .line 969
    .line 970
    invoke-static {v8, v4, v7}, Lnx;->λ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    add-int/lit8 v6, v6, 0x1

    .line 975
    .line 976
    goto :goto_19

    .line 977
    :cond_39
    invoke-virtual {v0, v4}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 978
    .line 979
    .line 980
    const-string v3, "android.widget.TextView"

    .line 981
    .line 982
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    :cond_3a
    invoke-virtual {v1}, Lyp0;->μ()Ljava/util/List;

    .line 986
    .line 987
    .line 988
    move-result-object v1

    .line 989
    check-cast v1, Lh21;

    .line 990
    .line 991
    invoke-virtual {v1}, Lh21;->isEmpty()Z

    .line 992
    .line 993
    .line 994
    move-result v1

    .line 995
    if-eqz v1, :cond_3b

    .line 996
    .line 997
    if-eqz v5, :cond_3b

    .line 998
    .line 999
    iget v1, v5, Lso1;->α:I

    .line 1000
    .line 1001
    invoke-static {v1}, Lv71;->σ(I)Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    if-eqz v1, :cond_3b

    .line 1006
    .line 1007
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    :cond_3b
    if-eqz v20, :cond_3d

    .line 1011
    .line 1012
    const-string v1, "android.widget.EditText"

    .line 1013
    .line 1014
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    if-eqz v29, :cond_3c

    .line 1018
    .line 1019
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Number;->intValue()I

    .line 1020
    .line 1021
    .line 1022
    move-result v1

    .line 1023
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setMaxTextLength(I)V

    .line 1024
    .line 1025
    .line 1026
    :cond_3c
    if-eqz v2, :cond_3d

    .line 1027
    .line 1028
    const/16 v1, 0x81

    .line 1029
    .line 1030
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setInputType(I)V

    .line 1031
    .line 1032
    .line 1033
    :cond_3d
    return-void
.end method

.method public static final ο(Lwq1;Lwq1;Le80;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    :try_start_0
    invoke-static {v0, p2}, Lh62;->κ(ILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    invoke-interface {p2, p1, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    new-instance p2, Lom;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p2, p1, v0}, Lom;-><init>(Ljava/lang/Throwable;Z)V

    .line 15
    .line 16
    .line 17
    move-object p1, p2

    .line 18
    :goto_0
    sget-object p2, Lcq;->ε:Lcq;

    .line 19
    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Lfo0;->Ξ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, Lxb;->ι:Luy;

    .line 28
    .line 29
    if-ne p0, p1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    instance-of p1, p0, Lom;

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    invoke-static {p0}, Lxb;->д(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    :goto_1
    return-object p2

    .line 41
    :cond_2
    check-cast p0, Lom;

    .line 42
    .line 43
    iget-object p0, p0, Lom;->α:Ljava/lang/Throwable;

    .line 44
    .line 45
    throw p0
.end method


# virtual methods
.method public β()V
    .locals 0

    .line 1
    return-void
.end method

.method public γ()V
    .locals 0

    .line 1
    return-void
.end method
