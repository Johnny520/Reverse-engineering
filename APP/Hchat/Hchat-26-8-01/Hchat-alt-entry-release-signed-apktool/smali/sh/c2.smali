.class public final Lsh/c2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/n0;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Lsh/w1;


# direct methods
.method public constructor <init>(FLsh/w1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsh/c2;->a:F

    .line 5
    .line 6
    iput-object p2, p0, Lsh/c2;->b:Lsh/w1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final h(Lv1/p0;Ljava/util/List;J)Lv1/o0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    :goto_0
    const-string v6, "Collection contains no element matching the predicate."

    .line 14
    .line 15
    if-ge v5, v3, :cond_d

    .line 16
    .line 17
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    check-cast v7, Lv1/m0;

    .line 22
    .line 23
    invoke-static {v7}, Lv1/w;->i(Lv1/m0;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    const-string v9, "navigationIcon"

    .line 28
    .line 29
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-eqz v8, :cond_c

    .line 34
    .line 35
    const/4 v14, 0x0

    .line 36
    const/16 v15, 0xa

    .line 37
    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v13, 0x0

    .line 41
    move-wide/from16 v9, p3

    .line 42
    .line 43
    invoke-static/range {v9 .. v15}, Lu2/a;->a(JIIIII)J

    .line 44
    .line 45
    .line 46
    move-result-wide v11

    .line 47
    invoke-interface {v7, v11, v12}, Lv1/m0;->Q(J)Lv1/b1;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    move v7, v4

    .line 56
    :goto_1
    if-ge v7, v5, :cond_b

    .line 57
    .line 58
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    check-cast v8, Lv1/m0;

    .line 63
    .line 64
    invoke-static {v8}, Lv1/w;->i(Lv1/m0;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    const-string v10, "actionIcons"

    .line 69
    .line 70
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    if-eqz v9, :cond_a

    .line 75
    .line 76
    const/16 v18, 0x0

    .line 77
    .line 78
    const/16 v19, 0xa

    .line 79
    .line 80
    const/4 v15, 0x0

    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    move-wide/from16 v13, p3

    .line 86
    .line 87
    invoke-static/range {v13 .. v19}, Lu2/a;->a(JIIIII)J

    .line 88
    .line 89
    .line 90
    move-result-wide v9

    .line 91
    invoke-interface {v8, v9, v10}, Lv1/m0;->Q(J)Lv1/b1;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static/range {p3 .. p4}, Lu2/a;->h(J)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    iget v8, v3, Lv1/b1;->g:I

    .line 100
    .line 101
    sub-int/2addr v7, v8

    .line 102
    iget v8, v5, Lv1/b1;->g:I

    .line 103
    .line 104
    sub-int/2addr v7, v8

    .line 105
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    move v9, v4

    .line 110
    :goto_2
    if-ge v9, v8, :cond_9

    .line 111
    .line 112
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    check-cast v10, Lv1/m0;

    .line 117
    .line 118
    invoke-static {v10}, Lv1/w;->i(Lv1/m0;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    const-string v12, "title"

    .line 123
    .line 124
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-eqz v11, :cond_8

    .line 129
    .line 130
    int-to-double v7, v7

    .line 131
    const-wide v11, 0x3feccccccccccccdL    # 0.9

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    mul-double/2addr v7, v11

    .line 137
    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-nez v9, :cond_7

    .line 142
    .line 143
    const-wide v11, 0x41dfffffffc00000L    # 2.147483647E9

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    cmpl-double v9, v7, v11

    .line 149
    .line 150
    if-lez v9, :cond_0

    .line 151
    .line 152
    const v7, 0x7fffffff

    .line 153
    .line 154
    .line 155
    :goto_3
    move/from16 v16, v7

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_0
    const-wide/high16 v11, -0x3e20000000000000L    # -2.147483648E9

    .line 159
    .line 160
    cmpg-double v9, v7, v11

    .line 161
    .line 162
    if-gez v9, :cond_1

    .line 163
    .line 164
    const/high16 v7, -0x80000000

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_1
    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    .line 168
    .line 169
    .line 170
    move-result-wide v7

    .line 171
    long-to-int v7, v7

    .line 172
    goto :goto_3

    .line 173
    :goto_4
    const/16 v18, 0x0

    .line 174
    .line 175
    const/16 v19, 0x8

    .line 176
    .line 177
    const/4 v15, 0x0

    .line 178
    const/16 v17, 0x0

    .line 179
    .line 180
    move-wide/from16 v13, p3

    .line 181
    .line 182
    invoke-static/range {v13 .. v19}, Lu2/a;->a(JIIIII)J

    .line 183
    .line 184
    .line 185
    move-result-wide v7

    .line 186
    invoke-interface {v10, v7, v8}, Lv1/m0;->Q(J)Lv1/b1;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    :goto_5
    if-ge v4, v8, :cond_6

    .line 195
    .line 196
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    check-cast v9, Lv1/m0;

    .line 201
    .line 202
    invoke-static {v9}, Lv1/w;->i(Lv1/m0;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    const-string v11, "largeTitle"

    .line 207
    .line 208
    invoke-static {v10, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    if-eqz v10, :cond_5

    .line 213
    .line 214
    const v18, 0x7fffffff

    .line 215
    .line 216
    .line 217
    const/16 v19, 0x2

    .line 218
    .line 219
    const/4 v15, 0x0

    .line 220
    const/16 v16, 0x0

    .line 221
    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    move-wide/from16 v13, p3

    .line 225
    .line 226
    invoke-static/range {v13 .. v19}, Lu2/a;->a(JIIIII)J

    .line 227
    .line 228
    .line 229
    move-result-wide v10

    .line 230
    invoke-interface {v9, v10, v11}, Lv1/m0;->Q(J)Lv1/b1;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    sget v4, Lsh/s1;->b:F

    .line 235
    .line 236
    invoke-interface {v1, v4}, Lu2/c;->G0(F)I

    .line 237
    .line 238
    .line 239
    move-result v14

    .line 240
    iget v4, v2, Lv1/b1;->h:I

    .line 241
    .line 242
    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    iget v6, v0, Lsh/c2;->a:F

    .line 247
    .line 248
    const/4 v8, 0x0

    .line 249
    cmpl-float v9, v6, v8

    .line 250
    .line 251
    const/high16 v10, 0x3f800000    # 1.0f

    .line 252
    .line 253
    if-lez v9, :cond_4

    .line 254
    .line 255
    iget-object v9, v0, Lsh/c2;->b:Lsh/w1;

    .line 256
    .line 257
    iget-object v9, v9, Lsh/w1;->a:Lsh/x;

    .line 258
    .line 259
    if-eqz v9, :cond_2

    .line 260
    .line 261
    iget-object v9, v9, Lsh/x;->a:Lsh/e2;

    .line 262
    .line 263
    if-eqz v9, :cond_2

    .line 264
    .line 265
    iget-object v9, v9, Lsh/e2;->c:Li0/f1;

    .line 266
    .line 267
    invoke-virtual {v9}, Li0/f1;->g()F

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    goto :goto_6

    .line 272
    :cond_2
    move v9, v8

    .line 273
    :goto_6
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    if-eqz v11, :cond_3

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_3
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    div-float/2addr v9, v6

    .line 285
    invoke-static {v9, v8, v10}, Lr9/e0;->q(FFF)F

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    sub-float/2addr v10, v6

    .line 290
    :cond_4
    :goto_7
    sub-int/2addr v4, v14

    .line 291
    int-to-double v8, v4

    .line 292
    float-to-double v10, v10

    .line 293
    mul-double/2addr v8, v10

    .line 294
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    .line 295
    .line 296
    .line 297
    move-result-wide v8

    .line 298
    long-to-int v4, v8

    .line 299
    add-int/2addr v4, v14

    .line 300
    int-to-float v4, v4

    .line 301
    invoke-static {v4}, Lig/a;->X(F)I

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    invoke-static/range {p3 .. p4}, Lu2/a;->h(J)I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    new-instance v13, Lsh/b2;

    .line 310
    .line 311
    move-wide/from16 v16, p3

    .line 312
    .line 313
    move-object/from16 v20, v2

    .line 314
    .line 315
    move-object v15, v3

    .line 316
    move-object/from16 v19, v5

    .line 317
    .line 318
    move-object/from16 v18, v7

    .line 319
    .line 320
    invoke-direct/range {v13 .. v20}, Lsh/b2;-><init>(ILv1/b1;JLv1/b1;Lv1/b1;Lv1/b1;)V

    .line 321
    .line 322
    .line 323
    sget-object v2, Ltf/u;->g:Ltf/u;

    .line 324
    .line 325
    invoke-interface {v1, v6, v4, v2, v13}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    return-object v1

    .line 330
    :cond_5
    move-object v15, v3

    .line 331
    move-object/from16 v19, v5

    .line 332
    .line 333
    move-object/from16 v18, v7

    .line 334
    .line 335
    add-int/lit8 v4, v4, 0x1

    .line 336
    .line 337
    goto/16 :goto_5

    .line 338
    .line 339
    :cond_6
    invoke-static {v6}, Lw2/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 340
    .line 341
    .line 342
    invoke-static {}, Lokio/a;->c()V

    .line 343
    .line 344
    .line 345
    const/4 v1, 0x0

    .line 346
    return-object v1

    .line 347
    :cond_7
    const-string v1, "Cannot round NaN value."

    .line 348
    .line 349
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    const/4 v1, 0x0

    .line 353
    return-object v1

    .line 354
    :cond_8
    move-object v15, v3

    .line 355
    move-object/from16 v19, v5

    .line 356
    .line 357
    add-int/lit8 v9, v9, 0x1

    .line 358
    .line 359
    goto/16 :goto_2

    .line 360
    .line 361
    :cond_9
    invoke-static {v6}, Lw2/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 362
    .line 363
    .line 364
    invoke-static {}, Lokio/a;->c()V

    .line 365
    .line 366
    .line 367
    const/4 v1, 0x0

    .line 368
    return-object v1

    .line 369
    :cond_a
    move-object v15, v3

    .line 370
    add-int/lit8 v7, v7, 0x1

    .line 371
    .line 372
    goto/16 :goto_1

    .line 373
    .line 374
    :cond_b
    invoke-static {v6}, Lw2/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 375
    .line 376
    .line 377
    invoke-static {}, Lokio/a;->c()V

    .line 378
    .line 379
    .line 380
    const/4 v1, 0x0

    .line 381
    return-object v1

    .line 382
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :cond_d
    invoke-static {v6}, Lw2/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 387
    .line 388
    .line 389
    invoke-static {}, Lokio/a;->c()V

    .line 390
    .line 391
    .line 392
    const/4 v1, 0x0

    .line 393
    return-object v1
.end method
