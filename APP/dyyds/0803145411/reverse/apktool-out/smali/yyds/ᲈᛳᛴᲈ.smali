.class public final Lyyds/ᲈᛳᛴᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᲈᲁ:[I

.field public ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Landroid/content/Context;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛵᲀᛴᲁ;

.field public ᛶᛷᛲᲁ:I

.field public ᲀᛲᛳᲀ:Landroid/view/VelocityTracker;

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lyyds/ᛵᲀᛴᲁ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lyyds/ᲈᛳᛴᲈ;->ᛲᛴᛳᛲ:I

    .line 6
    .line 7
    iput v0, p0, Lyyds/ᲈᛳᛴᲈ;->ᲇᲇᲇᛱ:I

    .line 8
    .line 9
    iput v0, p0, Lyyds/ᲈᛳᛴᲈ;->ᛶᛷᛲᲁ:I

    .line 10
    .line 11
    const v0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    filled-new-array {v0, v1}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lyyds/ᲈᛳᛴᲈ;->ᛱᲈᲁ:[I

    .line 20
    .line 21
    iput-object p1, p0, Lyyds/ᲈᛳᛴᲈ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 22
    .line 23
    iput-object p2, p0, Lyyds/ᲈᛳᛴᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲀᛴᲁ;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Landroid/view/MotionEvent;I)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    iget v5, v0, Lyyds/ᲈᛳᛴᲈ;->ᲇᲇᲇᛱ:I

    .line 16
    .line 17
    const/16 v6, 0x22

    .line 18
    .line 19
    const/high16 v8, 0x400000

    .line 20
    .line 21
    iget-object v10, v0, Lyyds/ᲈᛳᛴᲈ;->ᛱᲈᲁ:[I

    .line 22
    .line 23
    if-ne v5, v3, :cond_1

    .line 24
    .line 25
    iget v5, v0, Lyyds/ᲈᛳᛴᲈ;->ᛶᛷᛲᲁ:I

    .line 26
    .line 27
    if-ne v5, v4, :cond_1

    .line 28
    .line 29
    iget v5, v0, Lyyds/ᲈᛳᛴᲈ;->ᛲᛴᛳᛲ:I

    .line 30
    .line 31
    if-eq v5, v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v12, 0x0

    .line 35
    const/16 v16, 0x1

    .line 36
    .line 37
    const/16 v17, 0x0

    .line 38
    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    :cond_1
    :goto_0
    iget-object v5, v0, Lyyds/ᲈᛳᛴᲈ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 42
    .line 43
    invoke-static {v5}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 44
    .line 45
    .line 46
    move-result-object v13

    .line 47
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 48
    .line 49
    .line 50
    move-result v14

    .line 51
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 52
    .line 53
    .line 54
    move-result v15

    .line 55
    const/16 v16, 0x1

    .line 56
    .line 57
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    const-string v12, "android"

    .line 62
    .line 63
    const-string v7, "dimen"

    .line 64
    .line 65
    const/4 v9, -0x1

    .line 66
    if-lt v11, v6, :cond_2

    .line 67
    .line 68
    invoke-static {v13, v14, v2, v15}, Lyyds/ᲇᛶᲀᲇ;->ᲇᲇᲇᛱ(Landroid/view/ViewConfiguration;III)I

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    goto :goto_3

    .line 73
    :cond_2
    invoke-static {v14}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    .line 74
    .line 75
    .line 76
    move-result-object v14

    .line 77
    if-eqz v14, :cond_5

    .line 78
    .line 79
    invoke-virtual {v14, v2, v15}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    .line 80
    .line 81
    .line 82
    move-result-object v14

    .line 83
    if-eqz v14, :cond_5

    .line 84
    .line 85
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    if-ne v15, v8, :cond_3

    .line 90
    .line 91
    const/16 v15, 0x1a

    .line 92
    .line 93
    if-ne v2, v15, :cond_3

    .line 94
    .line 95
    const-string v15, "config_viewMinRotaryEncoderFlingVelocity"

    .line 96
    .line 97
    invoke-virtual {v14, v15, v7, v12}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v15

    .line 101
    goto :goto_1

    .line 102
    :cond_3
    move v15, v9

    .line 103
    :goto_1
    if-eq v15, v9, :cond_4

    .line 104
    .line 105
    if-eqz v15, :cond_5

    .line 106
    .line 107
    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 108
    .line 109
    .line 110
    move-result v14

    .line 111
    if-gez v14, :cond_6

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-virtual {v13}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 115
    .line 116
    .line 117
    move-result v14

    .line 118
    goto :goto_3

    .line 119
    :cond_5
    :goto_2
    const v14, 0x7fffffff

    .line 120
    .line 121
    .line 122
    :cond_6
    :goto_3
    aput v14, v10, v17

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    if-lt v11, v6, :cond_7

    .line 133
    .line 134
    invoke-static {v13, v14, v2, v15}, Lyyds/ᲇᛶᲀᲇ;->ᛲᛴᛳᛲ(Landroid/view/ViewConfiguration;III)I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    goto :goto_6

    .line 139
    :cond_7
    invoke-static {v14}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    const/high16 v14, -0x80000000

    .line 144
    .line 145
    if-eqz v11, :cond_a

    .line 146
    .line 147
    invoke-virtual {v11, v2, v15}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    if-eqz v11, :cond_a

    .line 152
    .line 153
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    if-ne v15, v8, :cond_8

    .line 158
    .line 159
    const/16 v15, 0x1a

    .line 160
    .line 161
    if-ne v2, v15, :cond_8

    .line 162
    .line 163
    const-string v11, "config_viewMaxRotaryEncoderFlingVelocity"

    .line 164
    .line 165
    invoke-virtual {v5, v11, v7, v12}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    goto :goto_4

    .line 170
    :cond_8
    move v7, v9

    .line 171
    :goto_4
    if-eq v7, v9, :cond_9

    .line 172
    .line 173
    if-eqz v7, :cond_a

    .line 174
    .line 175
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-gez v5, :cond_b

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_9
    invoke-virtual {v13}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    goto :goto_6

    .line 187
    :cond_a
    :goto_5
    move v5, v14

    .line 188
    :cond_b
    :goto_6
    aput v5, v10, v16

    .line 189
    .line 190
    iput v3, v0, Lyyds/ᲈᛳᛴᲈ;->ᲇᲇᲇᛱ:I

    .line 191
    .line 192
    iput v4, v0, Lyyds/ᲈᛳᛴᲈ;->ᛶᛷᛲᲁ:I

    .line 193
    .line 194
    iput v2, v0, Lyyds/ᲈᛳᛴᲈ;->ᛲᛴᛳᛲ:I

    .line 195
    .line 196
    move/from16 v12, v16

    .line 197
    .line 198
    :goto_7
    aget v3, v10, v17

    .line 199
    .line 200
    iget-object v4, v0, Lyyds/ᲈᛳᛴᲈ;->ᲀᛲᛳᲀ:Landroid/view/VelocityTracker;

    .line 201
    .line 202
    const v5, 0x7fffffff

    .line 203
    .line 204
    .line 205
    if-ne v3, v5, :cond_c

    .line 206
    .line 207
    if-eqz v4, :cond_27

    .line 208
    .line 209
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->recycle()V

    .line 210
    .line 211
    .line 212
    const/4 v1, 0x0

    .line 213
    iput-object v1, v0, Lyyds/ᲈᛳᛴᲈ;->ᲀᛲᛳᲀ:Landroid/view/VelocityTracker;

    .line 214
    .line 215
    return-void

    .line 216
    :cond_c
    if-nez v4, :cond_d

    .line 217
    .line 218
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    iput-object v4, v0, Lyyds/ᲈᛳᛴᲈ;->ᲀᛲᛳᲀ:Landroid/view/VelocityTracker;

    .line 223
    .line 224
    :cond_d
    sget-object v3, Lyyds/ᛷᛳᛸ;->ᛲᲈᲁ:Ljava/util/Map;

    .line 225
    .line 226
    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 227
    .line 228
    .line 229
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 230
    .line 231
    const/4 v5, 0x0

    .line 232
    const/16 v7, 0x14

    .line 233
    .line 234
    if-lt v3, v6, :cond_e

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-ne v3, v8, :cond_12

    .line 242
    .line 243
    sget-object v3, Lyyds/ᛷᛳᛸ;->ᛲᲈᲁ:Ljava/util/Map;

    .line 244
    .line 245
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-nez v8, :cond_f

    .line 250
    .line 251
    new-instance v8, Lyyds/ᛸᲈᲈᛱ;

    .line 252
    .line 253
    invoke-direct {v8}, Lyyds/ᛸᲈᲈᛱ;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-interface {v3, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    :cond_f
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    check-cast v3, Lyyds/ᛸᲈᲈᛱ;

    .line 264
    .line 265
    iget-object v8, v3, Lyyds/ᛸᲈᲈᛱ;->ᛵᛸᛸᛷ:[J

    .line 266
    .line 267
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 268
    .line 269
    .line 270
    move-result-wide v13

    .line 271
    iget v9, v3, Lyyds/ᛸᲈᲈᛱ;->ᲇᲈᛵᛷ:I

    .line 272
    .line 273
    if-eqz v9, :cond_10

    .line 274
    .line 275
    iget v11, v3, Lyyds/ᛸᲈᲈᛱ;->ᛲᛴᛳᛲ:I

    .line 276
    .line 277
    aget-wide v19, v8, v11

    .line 278
    .line 279
    sub-long v19, v13, v19

    .line 280
    .line 281
    const-wide/16 v21, 0x28

    .line 282
    .line 283
    cmp-long v11, v19, v21

    .line 284
    .line 285
    if-lez v11, :cond_10

    .line 286
    .line 287
    move/from16 v11, v17

    .line 288
    .line 289
    iput v11, v3, Lyyds/ᛸᲈᲈᛱ;->ᲇᲈᛵᛷ:I

    .line 290
    .line 291
    iput v5, v3, Lyyds/ᛸᲈᲈᛱ;->ᲀᛲᛳᲀ:F

    .line 292
    .line 293
    const/4 v9, 0x0

    .line 294
    :cond_10
    iget v11, v3, Lyyds/ᛸᲈᲈᛱ;->ᛲᛴᛳᛲ:I

    .line 295
    .line 296
    add-int/lit8 v11, v11, 0x1

    .line 297
    .line 298
    rem-int/2addr v11, v7

    .line 299
    iput v11, v3, Lyyds/ᛸᲈᲈᛱ;->ᛲᛴᛳᛲ:I

    .line 300
    .line 301
    if-eq v9, v7, :cond_11

    .line 302
    .line 303
    add-int/lit8 v9, v9, 0x1

    .line 304
    .line 305
    iput v9, v3, Lyyds/ᛸᲈᲈᛱ;->ᲇᲈᛵᛷ:I

    .line 306
    .line 307
    :cond_11
    iget-object v9, v3, Lyyds/ᛸᲈᲈᛱ;->ᛲᲈᲁ:[F

    .line 308
    .line 309
    const/16 v15, 0x1a

    .line 310
    .line 311
    invoke-virtual {v1, v15}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    aput v1, v9, v11

    .line 316
    .line 317
    iget v1, v3, Lyyds/ᛸᲈᲈᛱ;->ᛲᛴᛳᛲ:I

    .line 318
    .line 319
    aput-wide v13, v8, v1

    .line 320
    .line 321
    :cond_12
    :goto_8
    const/16 v1, 0x3e8

    .line 322
    .line 323
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v1, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 327
    .line 328
    .line 329
    sget-object v1, Lyyds/ᛷᛳᛸ;->ᛲᲈᲁ:Ljava/util/Map;

    .line 330
    .line 331
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    check-cast v1, Lyyds/ᛸᲈᲈᛱ;

    .line 336
    .line 337
    if-eqz v1, :cond_1e

    .line 338
    .line 339
    iget-object v8, v1, Lyyds/ᛸᲈᲈᛱ;->ᛲᲈᲁ:[F

    .line 340
    .line 341
    iget-object v9, v1, Lyyds/ᛸᲈᲈᛱ;->ᛵᛸᛸᛷ:[J

    .line 342
    .line 343
    iget v11, v1, Lyyds/ᛸᲈᲈᛱ;->ᲇᲈᛵᛷ:I

    .line 344
    .line 345
    const/4 v13, 0x2

    .line 346
    if-ge v11, v13, :cond_13

    .line 347
    .line 348
    :goto_9
    move/from16 p1, v3

    .line 349
    .line 350
    move v7, v5

    .line 351
    move/from16 v23, v7

    .line 352
    .line 353
    goto/16 :goto_d

    .line 354
    .line 355
    :cond_13
    iget v14, v1, Lyyds/ᛸᲈᲈᛱ;->ᛲᛴᛳᛲ:I

    .line 356
    .line 357
    add-int/lit8 v15, v14, 0x14

    .line 358
    .line 359
    add-int/lit8 v11, v11, -0x1

    .line 360
    .line 361
    sub-int/2addr v15, v11

    .line 362
    rem-int/2addr v15, v7

    .line 363
    aget-wide v19, v9, v14

    .line 364
    .line 365
    :goto_a
    aget-wide v21, v9, v15

    .line 366
    .line 367
    sub-long v23, v19, v21

    .line 368
    .line 369
    const-wide/16 v25, 0x64

    .line 370
    .line 371
    cmp-long v11, v23, v25

    .line 372
    .line 373
    iget v14, v1, Lyyds/ᛸᲈᲈᛱ;->ᲇᲈᛵᛷ:I

    .line 374
    .line 375
    if-lez v11, :cond_14

    .line 376
    .line 377
    add-int/lit8 v14, v14, -0x1

    .line 378
    .line 379
    iput v14, v1, Lyyds/ᛸᲈᲈᛱ;->ᲇᲈᛵᛷ:I

    .line 380
    .line 381
    add-int/lit8 v15, v15, 0x1

    .line 382
    .line 383
    rem-int/2addr v15, v7

    .line 384
    goto :goto_a

    .line 385
    :cond_14
    if-ge v14, v13, :cond_15

    .line 386
    .line 387
    goto :goto_9

    .line 388
    :cond_15
    if-ne v14, v13, :cond_17

    .line 389
    .line 390
    add-int/lit8 v15, v15, 0x1

    .line 391
    .line 392
    rem-int/2addr v15, v7

    .line 393
    aget-wide v13, v9, v15

    .line 394
    .line 395
    cmp-long v7, v21, v13

    .line 396
    .line 397
    if-nez v7, :cond_16

    .line 398
    .line 399
    goto :goto_9

    .line 400
    :cond_16
    aget v7, v8, v15

    .line 401
    .line 402
    sub-long v13, v13, v21

    .line 403
    .line 404
    long-to-float v8, v13

    .line 405
    div-float/2addr v7, v8

    .line 406
    move/from16 p1, v3

    .line 407
    .line 408
    move/from16 v23, v5

    .line 409
    .line 410
    goto/16 :goto_d

    .line 411
    .line 412
    :cond_17
    move/from16 p1, v3

    .line 413
    .line 414
    move v14, v5

    .line 415
    const/4 v11, 0x0

    .line 416
    const/4 v13, 0x0

    .line 417
    :goto_b
    iget v3, v1, Lyyds/ᛸᲈᲈᛱ;->ᲇᲈᛵᛷ:I

    .line 418
    .line 419
    add-int/lit8 v3, v3, -0x1

    .line 420
    .line 421
    const/high16 v18, 0x40000000    # 2.0f

    .line 422
    .line 423
    const/high16 v19, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/high16 v20, -0x40800000    # -1.0f

    .line 426
    .line 427
    if-ge v11, v3, :cond_1b

    .line 428
    .line 429
    add-int v3, v11, v15

    .line 430
    .line 431
    rem-int/lit8 v21, v3, 0x14

    .line 432
    .line 433
    aget-wide v21, v9, v21

    .line 434
    .line 435
    add-int/lit8 v3, v3, 0x1

    .line 436
    .line 437
    rem-int/2addr v3, v7

    .line 438
    aget-wide v23, v9, v3

    .line 439
    .line 440
    cmp-long v23, v23, v21

    .line 441
    .line 442
    if-nez v23, :cond_18

    .line 443
    .line 444
    move/from16 v23, v5

    .line 445
    .line 446
    move-object/from16 v25, v8

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_18
    add-int/lit8 v13, v13, 0x1

    .line 450
    .line 451
    cmpg-float v23, v14, v5

    .line 452
    .line 453
    if-gez v23, :cond_19

    .line 454
    .line 455
    move/from16 v19, v20

    .line 456
    .line 457
    :cond_19
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 458
    .line 459
    .line 460
    move-result v20

    .line 461
    move/from16 v23, v5

    .line 462
    .line 463
    mul-float v5, v20, v18

    .line 464
    .line 465
    move-object/from16 v25, v8

    .line 466
    .line 467
    float-to-double v7, v5

    .line 468
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 469
    .line 470
    .line 471
    move-result-wide v7

    .line 472
    double-to-float v5, v7

    .line 473
    mul-float v19, v19, v5

    .line 474
    .line 475
    aget v5, v25, v3

    .line 476
    .line 477
    aget-wide v7, v9, v3

    .line 478
    .line 479
    sub-long v7, v7, v21

    .line 480
    .line 481
    long-to-float v3, v7

    .line 482
    div-float/2addr v5, v3

    .line 483
    sub-float v3, v5, v19

    .line 484
    .line 485
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    mul-float/2addr v5, v3

    .line 490
    add-float/2addr v14, v5

    .line 491
    move/from16 v3, v16

    .line 492
    .line 493
    if-ne v13, v3, :cond_1a

    .line 494
    .line 495
    const/high16 v3, 0x3f000000    # 0.5f

    .line 496
    .line 497
    mul-float/2addr v14, v3

    .line 498
    :cond_1a
    :goto_c
    add-int/lit8 v11, v11, 0x1

    .line 499
    .line 500
    move/from16 v5, v23

    .line 501
    .line 502
    move-object/from16 v8, v25

    .line 503
    .line 504
    const/16 v7, 0x14

    .line 505
    .line 506
    const/16 v16, 0x1

    .line 507
    .line 508
    goto :goto_b

    .line 509
    :cond_1b
    move/from16 v23, v5

    .line 510
    .line 511
    cmpg-float v3, v14, v23

    .line 512
    .line 513
    if-gez v3, :cond_1c

    .line 514
    .line 515
    move/from16 v19, v20

    .line 516
    .line 517
    :cond_1c
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    mul-float v3, v3, v18

    .line 522
    .line 523
    float-to-double v7, v3

    .line 524
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 525
    .line 526
    .line 527
    move-result-wide v7

    .line 528
    double-to-float v3, v7

    .line 529
    mul-float v7, v19, v3

    .line 530
    .line 531
    :goto_d
    const/high16 v3, 0x447a0000    # 1000.0f

    .line 532
    .line 533
    mul-float/2addr v7, v3

    .line 534
    iput v7, v1, Lyyds/ᛸᲈᲈᛱ;->ᲀᛲᛳᲀ:F

    .line 535
    .line 536
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    neg-float v3, v3

    .line 541
    cmpg-float v3, v7, v3

    .line 542
    .line 543
    if-gez v3, :cond_1d

    .line 544
    .line 545
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    neg-float v3, v3

    .line 550
    iput v3, v1, Lyyds/ᛸᲈᲈᛱ;->ᲀᛲᛳᲀ:F

    .line 551
    .line 552
    goto :goto_e

    .line 553
    :cond_1d
    iget v3, v1, Lyyds/ᛸᲈᲈᛱ;->ᲀᛲᛳᲀ:F

    .line 554
    .line 555
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    cmpl-float v3, v3, v5

    .line 560
    .line 561
    if-lez v3, :cond_1f

    .line 562
    .line 563
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    iput v3, v1, Lyyds/ᛸᲈᲈᛱ;->ᲀᛲᛳᲀ:F

    .line 568
    .line 569
    goto :goto_e

    .line 570
    :cond_1e
    move/from16 v23, v5

    .line 571
    .line 572
    :cond_1f
    :goto_e
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 573
    .line 574
    if-lt v1, v6, :cond_20

    .line 575
    .line 576
    invoke-static {v4, v2}, Lyyds/ᲇᛶᲀᲇ;->ᛵᛸᛸᛷ(Landroid/view/VelocityTracker;I)F

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    goto :goto_10

    .line 581
    :cond_20
    if-nez v2, :cond_21

    .line 582
    .line 583
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    goto :goto_10

    .line 588
    :cond_21
    const/4 v3, 0x1

    .line 589
    if-ne v2, v3, :cond_22

    .line 590
    .line 591
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    goto :goto_10

    .line 596
    :cond_22
    sget-object v1, Lyyds/ᛷᛳᛸ;->ᛲᲈᲁ:Ljava/util/Map;

    .line 597
    .line 598
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    check-cast v1, Lyyds/ᛸᲈᲈᛱ;

    .line 603
    .line 604
    if-eqz v1, :cond_24

    .line 605
    .line 606
    const/16 v15, 0x1a

    .line 607
    .line 608
    if-eq v2, v15, :cond_23

    .line 609
    .line 610
    goto :goto_f

    .line 611
    :cond_23
    iget v1, v1, Lyyds/ᛸᲈᲈᛱ;->ᲀᛲᛳᲀ:F

    .line 612
    .line 613
    goto :goto_10

    .line 614
    :cond_24
    :goto_f
    move/from16 v1, v23

    .line 615
    .line 616
    :goto_10
    iget-object v2, v0, Lyyds/ᲈᛳᛴᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲀᛴᲁ;

    .line 617
    .line 618
    invoke-interface {v2}, Lyyds/ᛵᲀᛴᲁ;->ᛲᛲᲈᲈ()F

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    mul-float/2addr v3, v1

    .line 623
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    if-nez v12, :cond_25

    .line 628
    .line 629
    iget v4, v0, Lyyds/ᲈᛳᛴᲈ;->ᲇᲈᛵᛷ:F

    .line 630
    .line 631
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    cmpl-float v4, v1, v4

    .line 636
    .line 637
    if-eqz v4, :cond_26

    .line 638
    .line 639
    cmpl-float v1, v1, v23

    .line 640
    .line 641
    if-eqz v1, :cond_26

    .line 642
    .line 643
    :cond_25
    invoke-interface {v2}, Lyyds/ᛵᲀᛴᲁ;->ᲇᛱᛲ()V

    .line 644
    .line 645
    .line 646
    :cond_26
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    const/16 v17, 0x0

    .line 651
    .line 652
    aget v4, v10, v17

    .line 653
    .line 654
    int-to-float v4, v4

    .line 655
    cmpg-float v1, v1, v4

    .line 656
    .line 657
    if-gez v1, :cond_28

    .line 658
    .line 659
    :cond_27
    return-void

    .line 660
    :cond_28
    const/16 v16, 0x1

    .line 661
    .line 662
    aget v1, v10, v16

    .line 663
    .line 664
    neg-int v4, v1

    .line 665
    int-to-float v4, v4

    .line 666
    int-to-float v1, v1

    .line 667
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 672
    .line 673
    .line 674
    move-result v1

    .line 675
    invoke-interface {v2, v1}, Lyyds/ᛵᲀᛴᲁ;->ᲇᲇᲇᛱ(F)Z

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    if-eqz v2, :cond_29

    .line 680
    .line 681
    move v5, v1

    .line 682
    goto :goto_11

    .line 683
    :cond_29
    move/from16 v5, v23

    .line 684
    .line 685
    :goto_11
    iput v5, v0, Lyyds/ᲈᛳᛴᲈ;->ᲇᲈᛵᛷ:F

    .line 686
    .line 687
    return-void
.end method
