.class public final Lyyds/ᲈᛱᲁᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛱᲈᲁ:Lcom/android/app/CustomConstraintLayout;

.field public ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Lcom/android/app/CustomConstraintLayout;

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Lcom/android/app/CustomConstraintLayout;Lcom/android/app/CustomConstraintLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛱᲁᲇ;->ᛱᲈᲁ:Lcom/android/app/CustomConstraintLayout;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᛱᲁᲇ;->ᛲᲈᲁ:Lcom/android/app/CustomConstraintLayout;

    .line 7
    .line 8
    return-void
.end method

.method public static ᛲᲈᲁ(III)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 v1, 0x40000000    # 2.0f

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    const/high16 v0, -0x80000000

    .line 21
    .line 22
    if-eq p0, v0, :cond_1

    .line 23
    .line 24
    if-nez p0, :cond_2

    .line 25
    .line 26
    :cond_1
    if-ne p2, p1, :cond_2

    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return p0
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ(Lyyds/ᛴᲀᲈᛲ;Lyyds/ᛲᛷᛲᲇ;)V
    .locals 17

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
    iget-object v3, v1, Lyyds/ᛴᲀᲈᛲ;->ᛲᛱᲁᛳ:Lyyds/ᲀᲈᲁᛲ;

    .line 8
    .line 9
    iget-object v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᛷᲇᛲᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 10
    .line 11
    iget v5, v1, Lyyds/ᛴᲀᲈᛲ;->ᲈᛳ:I

    .line 12
    .line 13
    const/16 v6, 0x8

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    if-ne v5, v6, :cond_0

    .line 17
    .line 18
    iput v7, v2, Lyyds/ᛲᛷᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 19
    .line 20
    iput v7, v2, Lyyds/ᛲᛷᛲᲇ;->ᲇᲇᲇᛱ:I

    .line 21
    .line 22
    iput v7, v2, Lyyds/ᛲᛷᛲᲇ;->ᛶᛷᛲᲁ:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v5, v1, Lyyds/ᛴᲀᲈᛲ;->ᛱᲀᲈᛲ:Lyyds/ᛴᛵᛷᛴ;

    .line 26
    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    goto/16 :goto_10

    .line 30
    .line 31
    :cond_1
    iget v5, v2, Lyyds/ᛲᛷᛲᲇ;->ᛲᲈᲁ:I

    .line 32
    .line 33
    iget v6, v2, Lyyds/ᛲᛷᛲᲇ;->ᛵᛸᛸᛷ:I

    .line 34
    .line 35
    iget v8, v2, Lyyds/ᛲᛷᛲᲇ;->ᲀᛲᛳᲀ:I

    .line 36
    .line 37
    iget v9, v2, Lyyds/ᛲᛷᛲᲇ;->ᲇᲈᛵᛷ:I

    .line 38
    .line 39
    iget v10, v0, Lyyds/ᲈᛱᲁᲇ;->ᛵᛸᛸᛷ:I

    .line 40
    .line 41
    iget v11, v0, Lyyds/ᲈᛱᲁᲇ;->ᲀᛲᛳᲀ:I

    .line 42
    .line 43
    add-int/2addr v10, v11

    .line 44
    iget v11, v0, Lyyds/ᲈᛱᲁᲇ;->ᲇᲈᛵᛷ:I

    .line 45
    .line 46
    iget-object v12, v1, Lyyds/ᛴᲀᲈᛲ;->ᛷᲈᛳᛲ:Landroid/view/View;

    .line 47
    .line 48
    invoke-static {v5}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 49
    .line 50
    .line 51
    move-result v13

    .line 52
    const/4 v14, 0x1

    .line 53
    const/4 v15, 0x3

    .line 54
    const/4 v7, 0x2

    .line 55
    if-eqz v13, :cond_c

    .line 56
    .line 57
    if-eq v13, v14, :cond_b

    .line 58
    .line 59
    if-eq v13, v7, :cond_5

    .line 60
    .line 61
    if-eq v13, v15, :cond_2

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    iget v8, v0, Lyyds/ᲈᛱᲁᲇ;->ᲇᲇᲇᛱ:I

    .line 66
    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    iget v13, v4, Lyyds/ᲀᲈᲁᛲ;->ᛶᛷᛲᲁ:I

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const/4 v13, 0x0

    .line 73
    :goto_0
    if-eqz v3, :cond_4

    .line 74
    .line 75
    iget v15, v3, Lyyds/ᲀᲈᲁᛲ;->ᛶᛷᛲᲁ:I

    .line 76
    .line 77
    add-int/2addr v13, v15

    .line 78
    :cond_4
    add-int/2addr v11, v13

    .line 79
    const/4 v13, -0x1

    .line 80
    invoke-static {v8, v11, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    goto :goto_3

    .line 85
    :cond_5
    iget v8, v0, Lyyds/ᲈᛱᲁᲇ;->ᲇᲇᲇᛱ:I

    .line 86
    .line 87
    const/4 v13, -0x2

    .line 88
    invoke-static {v8, v11, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    iget v11, v1, Lyyds/ᛴᲀᲈᛲ;->ᛵᛶᛲᲀ:I

    .line 93
    .line 94
    if-ne v11, v14, :cond_6

    .line 95
    .line 96
    move v11, v14

    .line 97
    goto :goto_1

    .line 98
    :cond_6
    const/4 v11, 0x0

    .line 99
    :goto_1
    iget v13, v2, Lyyds/ᛲᛷᛲᲇ;->ᛷᲈᲈᲁ:I

    .line 100
    .line 101
    if-eq v13, v14, :cond_7

    .line 102
    .line 103
    if-ne v13, v7, :cond_d

    .line 104
    .line 105
    :cond_7
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 110
    .line 111
    .line 112
    move-result v15

    .line 113
    if-ne v13, v15, :cond_8

    .line 114
    .line 115
    move v13, v14

    .line 116
    goto :goto_2

    .line 117
    :cond_8
    const/4 v13, 0x0

    .line 118
    :goto_2
    iget v15, v2, Lyyds/ᛲᛷᛲᲇ;->ᛷᲈᲈᲁ:I

    .line 119
    .line 120
    if-eq v15, v7, :cond_a

    .line 121
    .line 122
    if-eqz v11, :cond_a

    .line 123
    .line 124
    if-eqz v11, :cond_9

    .line 125
    .line 126
    if-nez v13, :cond_a

    .line 127
    .line 128
    :cond_9
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᲈᲀᛲᲀ()Z

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    if-eqz v11, :cond_d

    .line 133
    .line 134
    :cond_a
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    const/high16 v13, 0x40000000    # 2.0f

    .line 139
    .line 140
    invoke-static {v8, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    goto :goto_3

    .line 145
    :cond_b
    const/high16 v13, 0x40000000    # 2.0f

    .line 146
    .line 147
    iget v8, v0, Lyyds/ᲈᛱᲁᲇ;->ᲇᲇᲇᛱ:I

    .line 148
    .line 149
    const/4 v15, -0x2

    .line 150
    invoke-static {v8, v11, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    goto :goto_3

    .line 155
    :cond_c
    const/high16 v13, 0x40000000    # 2.0f

    .line 156
    .line 157
    invoke-static {v8, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    :cond_d
    :goto_3
    invoke-static {v6}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    if-eqz v11, :cond_18

    .line 166
    .line 167
    if-eq v11, v14, :cond_17

    .line 168
    .line 169
    if-eq v11, v7, :cond_11

    .line 170
    .line 171
    const/4 v9, 0x3

    .line 172
    if-eq v11, v9, :cond_e

    .line 173
    .line 174
    const/4 v3, 0x0

    .line 175
    goto/16 :goto_7

    .line 176
    .line 177
    :cond_e
    iget v9, v0, Lyyds/ᲈᛱᲁᲇ;->ᛶᛷᛲᲁ:I

    .line 178
    .line 179
    if-eqz v4, :cond_f

    .line 180
    .line 181
    iget-object v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᲈᛷᲈᛶ:Lyyds/ᲀᲈᲁᛲ;

    .line 182
    .line 183
    iget v4, v4, Lyyds/ᲀᲈᲁᛲ;->ᛶᛷᛲᲁ:I

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_f
    const/4 v4, 0x0

    .line 187
    :goto_4
    if-eqz v3, :cond_10

    .line 188
    .line 189
    iget-object v3, v1, Lyyds/ᛴᲀᲈᛲ;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 190
    .line 191
    iget v3, v3, Lyyds/ᲀᲈᲁᛲ;->ᛶᛷᛲᲁ:I

    .line 192
    .line 193
    add-int/2addr v4, v3

    .line 194
    :cond_10
    add-int/2addr v10, v4

    .line 195
    const/4 v13, -0x1

    .line 196
    invoke-static {v9, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    goto :goto_7

    .line 201
    :cond_11
    iget v3, v0, Lyyds/ᲈᛱᲁᲇ;->ᛶᛷᛲᲁ:I

    .line 202
    .line 203
    const/4 v13, -0x2

    .line 204
    invoke-static {v3, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    iget v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛲᲇ:I

    .line 209
    .line 210
    if-ne v4, v14, :cond_12

    .line 211
    .line 212
    move v4, v14

    .line 213
    goto :goto_5

    .line 214
    :cond_12
    const/4 v4, 0x0

    .line 215
    :goto_5
    iget v9, v2, Lyyds/ᛲᛷᛲᲇ;->ᛷᲈᲈᲁ:I

    .line 216
    .line 217
    if-eq v9, v14, :cond_13

    .line 218
    .line 219
    if-ne v9, v7, :cond_19

    .line 220
    .line 221
    :cond_13
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    if-ne v9, v10, :cond_14

    .line 230
    .line 231
    move v9, v14

    .line 232
    goto :goto_6

    .line 233
    :cond_14
    const/4 v9, 0x0

    .line 234
    :goto_6
    iget v10, v2, Lyyds/ᛲᛷᛲᲇ;->ᛷᲈᲈᲁ:I

    .line 235
    .line 236
    if-eq v10, v7, :cond_16

    .line 237
    .line 238
    if-eqz v4, :cond_16

    .line 239
    .line 240
    if-eqz v4, :cond_15

    .line 241
    .line 242
    if-nez v9, :cond_16

    .line 243
    .line 244
    :cond_15
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛵᲀᛵᛸ()Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_19

    .line 249
    .line 250
    :cond_16
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    const/high16 v13, 0x40000000    # 2.0f

    .line 255
    .line 256
    invoke-static {v3, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    goto :goto_7

    .line 261
    :cond_17
    const/high16 v13, 0x40000000    # 2.0f

    .line 262
    .line 263
    iget v3, v0, Lyyds/ᲈᛱᲁᲇ;->ᛶᛷᛲᲁ:I

    .line 264
    .line 265
    const/4 v15, -0x2

    .line 266
    invoke-static {v3, v10, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    goto :goto_7

    .line 271
    :cond_18
    const/high16 v13, 0x40000000    # 2.0f

    .line 272
    .line 273
    invoke-static {v9, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    :cond_19
    :goto_7
    iget-object v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᛱᲀᲈᛲ:Lyyds/ᛴᛵᛷᛴ;

    .line 278
    .line 279
    iget-object v0, v0, Lyyds/ᲈᛱᲁᲇ;->ᛱᲈᲁ:Lcom/android/app/CustomConstraintLayout;

    .line 280
    .line 281
    if-eqz v4, :cond_1a

    .line 282
    .line 283
    iget v9, v0, Lyyds/ᛶᛵᲀᲀ;->ᛷᛲᲈᛱ:I

    .line 284
    .line 285
    const/16 v10, 0x100

    .line 286
    .line 287
    invoke-static {v9, v10}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲈᛵᛷ(II)Z

    .line 288
    .line 289
    .line 290
    move-result v9

    .line 291
    if-eqz v9, :cond_1a

    .line 292
    .line 293
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    if-ne v9, v10, :cond_1a

    .line 302
    .line 303
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    invoke-virtual {v4}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 308
    .line 309
    .line 310
    move-result v10

    .line 311
    if-ge v9, v10, :cond_1a

    .line 312
    .line 313
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    if-ne v9, v10, :cond_1a

    .line 322
    .line 323
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 324
    .line 325
    .line 326
    move-result v9

    .line 327
    invoke-virtual {v4}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-ge v9, v4, :cond_1a

    .line 332
    .line 333
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    iget v9, v1, Lyyds/ᛴᲀᲈᛲ;->ᲇᲇᲈᲀ:I

    .line 338
    .line 339
    if-ne v4, v9, :cond_1a

    .line 340
    .line 341
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛶᛱᲈ()Z

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-nez v4, :cond_1a

    .line 346
    .line 347
    iget v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᲀᛴᲁᲈ:I

    .line 348
    .line 349
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    invoke-static {v4, v8, v9}, Lyyds/ᲈᛱᲁᲇ;->ᛲᲈᲁ(III)Z

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    if-eqz v4, :cond_1a

    .line 358
    .line 359
    iget v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᛷᛶᛷᲀ:I

    .line 360
    .line 361
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 362
    .line 363
    .line 364
    move-result v9

    .line 365
    invoke-static {v4, v3, v9}, Lyyds/ᲈᛱᲁᲇ;->ᛲᲈᲁ(III)Z

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-eqz v4, :cond_1a

    .line 370
    .line 371
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    iput v0, v2, Lyyds/ᛲᛷᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 376
    .line 377
    invoke-virtual {v1}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    iput v0, v2, Lyyds/ᛲᛷᛲᲇ;->ᲇᲇᲇᛱ:I

    .line 382
    .line 383
    iget v0, v1, Lyyds/ᛴᲀᲈᛲ;->ᲇᲇᲈᲀ:I

    .line 384
    .line 385
    iput v0, v2, Lyyds/ᛲᛷᛲᲇ;->ᛶᛷᛲᲁ:I

    .line 386
    .line 387
    return-void

    .line 388
    :cond_1a
    const/4 v9, 0x3

    .line 389
    if-ne v5, v9, :cond_1b

    .line 390
    .line 391
    move v4, v14

    .line 392
    goto :goto_8

    .line 393
    :cond_1b
    const/4 v4, 0x0

    .line 394
    :goto_8
    if-ne v6, v9, :cond_1c

    .line 395
    .line 396
    move v9, v14

    .line 397
    goto :goto_9

    .line 398
    :cond_1c
    const/4 v9, 0x0

    .line 399
    :goto_9
    const/4 v10, 0x4

    .line 400
    if-eq v6, v10, :cond_1e

    .line 401
    .line 402
    if-ne v6, v14, :cond_1d

    .line 403
    .line 404
    goto :goto_a

    .line 405
    :cond_1d
    const/4 v6, 0x0

    .line 406
    goto :goto_b

    .line 407
    :cond_1e
    :goto_a
    move v6, v14

    .line 408
    :goto_b
    if-eq v5, v10, :cond_20

    .line 409
    .line 410
    if-ne v5, v14, :cond_1f

    .line 411
    .line 412
    goto :goto_c

    .line 413
    :cond_1f
    const/4 v5, 0x0

    .line 414
    goto :goto_d

    .line 415
    :cond_20
    :goto_c
    move v5, v14

    .line 416
    :goto_d
    const/4 v10, 0x0

    .line 417
    if-eqz v4, :cond_21

    .line 418
    .line 419
    iget v11, v1, Lyyds/ᛴᲀᲈᛲ;->ᛴᛸᛴᛸ:F

    .line 420
    .line 421
    cmpl-float v11, v11, v10

    .line 422
    .line 423
    if-lez v11, :cond_21

    .line 424
    .line 425
    move v11, v14

    .line 426
    goto :goto_e

    .line 427
    :cond_21
    const/4 v11, 0x0

    .line 428
    :goto_e
    if-eqz v9, :cond_22

    .line 429
    .line 430
    iget v13, v1, Lyyds/ᛴᲀᲈᛲ;->ᛴᛸᛴᛸ:F

    .line 431
    .line 432
    cmpl-float v10, v13, v10

    .line 433
    .line 434
    if-lez v10, :cond_22

    .line 435
    .line 436
    move v10, v14

    .line 437
    goto :goto_f

    .line 438
    :cond_22
    const/4 v10, 0x0

    .line 439
    :goto_f
    if-nez v12, :cond_23

    .line 440
    .line 441
    :goto_10
    return-void

    .line 442
    :cond_23
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 443
    .line 444
    .line 445
    move-result-object v13

    .line 446
    check-cast v13, Lyyds/ᛶᛶᛵᛶ;

    .line 447
    .line 448
    iget v15, v2, Lyyds/ᛲᛷᛲᲇ;->ᛷᲈᲈᲁ:I

    .line 449
    .line 450
    if-eq v15, v14, :cond_25

    .line 451
    .line 452
    if-eq v15, v7, :cond_25

    .line 453
    .line 454
    if-eqz v4, :cond_25

    .line 455
    .line 456
    iget v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᛵᛶᛲᲀ:I

    .line 457
    .line 458
    if-nez v4, :cond_25

    .line 459
    .line 460
    if-eqz v9, :cond_25

    .line 461
    .line 462
    iget v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛲᲇ:I

    .line 463
    .line 464
    if-eqz v4, :cond_24

    .line 465
    .line 466
    goto :goto_11

    .line 467
    :cond_24
    const/4 v0, -0x1

    .line 468
    const/4 v4, 0x0

    .line 469
    const/4 v5, 0x0

    .line 470
    const/4 v14, 0x0

    .line 471
    const/4 v15, 0x0

    .line 472
    goto/16 :goto_18

    .line 473
    .line 474
    :cond_25
    :goto_11
    invoke-virtual {v12, v8, v3}, Landroid/view/View;->measure(II)V

    .line 475
    .line 476
    .line 477
    iput v8, v1, Lyyds/ᛴᲀᲈᛲ;->ᲀᛴᲁᲈ:I

    .line 478
    .line 479
    iput v3, v1, Lyyds/ᛴᲀᲈᛲ;->ᛷᛶᛷᲀ:I

    .line 480
    .line 481
    const/4 v4, 0x0

    .line 482
    iput-boolean v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᛶᛷᛲᲁ:Z

    .line 483
    .line 484
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 489
    .line 490
    .line 491
    move-result v7

    .line 492
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 493
    .line 494
    .line 495
    move-result v9

    .line 496
    iget v15, v1, Lyyds/ᛴᲀᲈᛲ;->ᛶᲈᛴᲈ:I

    .line 497
    .line 498
    if-lez v15, :cond_26

    .line 499
    .line 500
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    .line 501
    .line 502
    .line 503
    move-result v15

    .line 504
    goto :goto_12

    .line 505
    :cond_26
    move v15, v4

    .line 506
    :goto_12
    iget v14, v1, Lyyds/ᛴᲀᲈᛲ;->ᛶᛸᲀᲁ:I

    .line 507
    .line 508
    if-lez v14, :cond_27

    .line 509
    .line 510
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 511
    .line 512
    .line 513
    move-result v15

    .line 514
    :cond_27
    iget v14, v1, Lyyds/ᛴᲀᲈᛲ;->ᛲᛶᛱᲈ:I

    .line 515
    .line 516
    if-lez v14, :cond_28

    .line 517
    .line 518
    invoke-static {v14, v7}, Ljava/lang/Math;->max(II)I

    .line 519
    .line 520
    .line 521
    move-result v14

    .line 522
    :goto_13
    move/from16 v16, v3

    .line 523
    .line 524
    goto :goto_14

    .line 525
    :cond_28
    move v14, v7

    .line 526
    goto :goto_13

    .line 527
    :goto_14
    iget v3, v1, Lyyds/ᛴᲀᲈᛲ;->ᲈᲀᛲᲀ:I

    .line 528
    .line 529
    if-lez v3, :cond_29

    .line 530
    .line 531
    invoke-static {v3, v14}, Ljava/lang/Math;->min(II)I

    .line 532
    .line 533
    .line 534
    move-result v14

    .line 535
    :cond_29
    iget v0, v0, Lyyds/ᛶᛵᲀᲀ;->ᛷᛲᲈᛱ:I

    .line 536
    .line 537
    const/4 v3, 0x1

    .line 538
    invoke-static {v0, v3}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲈᛵᛷ(II)Z

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    if-nez v0, :cond_2b

    .line 543
    .line 544
    const/high16 v0, 0x3f000000    # 0.5f

    .line 545
    .line 546
    if-eqz v11, :cond_2a

    .line 547
    .line 548
    if-eqz v6, :cond_2a

    .line 549
    .line 550
    iget v3, v1, Lyyds/ᛴᲀᲈᛲ;->ᛴᛸᛴᛸ:F

    .line 551
    .line 552
    int-to-float v5, v14

    .line 553
    mul-float/2addr v5, v3

    .line 554
    add-float/2addr v5, v0

    .line 555
    float-to-int v0, v5

    .line 556
    move v15, v0

    .line 557
    goto :goto_15

    .line 558
    :cond_2a
    if-eqz v10, :cond_2b

    .line 559
    .line 560
    if-eqz v5, :cond_2b

    .line 561
    .line 562
    iget v3, v1, Lyyds/ᛴᲀᲈᛲ;->ᛴᛸᛴᛸ:F

    .line 563
    .line 564
    int-to-float v5, v15

    .line 565
    div-float/2addr v5, v3

    .line 566
    add-float/2addr v5, v0

    .line 567
    float-to-int v0, v5

    .line 568
    move v14, v0

    .line 569
    :cond_2b
    :goto_15
    if-ne v4, v15, :cond_2d

    .line 570
    .line 571
    if-eq v7, v14, :cond_2c

    .line 572
    .line 573
    goto :goto_16

    .line 574
    :cond_2c
    move v5, v9

    .line 575
    const/4 v0, -0x1

    .line 576
    const/4 v4, 0x0

    .line 577
    goto :goto_18

    .line 578
    :cond_2d
    :goto_16
    const/high16 v0, 0x40000000    # 2.0f

    .line 579
    .line 580
    if-eq v4, v15, :cond_2e

    .line 581
    .line 582
    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 583
    .line 584
    .line 585
    move-result v8

    .line 586
    :cond_2e
    if-eq v7, v14, :cond_2f

    .line 587
    .line 588
    invoke-static {v14, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    goto :goto_17

    .line 593
    :cond_2f
    move/from16 v3, v16

    .line 594
    .line 595
    :goto_17
    invoke-virtual {v12, v8, v3}, Landroid/view/View;->measure(II)V

    .line 596
    .line 597
    .line 598
    iput v8, v1, Lyyds/ᛴᲀᲈᛲ;->ᲀᛴᲁᲈ:I

    .line 599
    .line 600
    iput v3, v1, Lyyds/ᛴᲀᲈᛲ;->ᛷᛶᛷᲀ:I

    .line 601
    .line 602
    const/4 v4, 0x0

    .line 603
    iput-boolean v4, v1, Lyyds/ᛴᲀᲈᛲ;->ᛶᛷᛲᲁ:Z

    .line 604
    .line 605
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    move v15, v0

    .line 618
    move v14, v3

    .line 619
    const/4 v0, -0x1

    .line 620
    :goto_18
    if-eq v5, v0, :cond_30

    .line 621
    .line 622
    const/4 v0, 0x1

    .line 623
    goto :goto_19

    .line 624
    :cond_30
    move v0, v4

    .line 625
    :goto_19
    iget v3, v2, Lyyds/ᛲᛷᛲᲇ;->ᲀᛲᛳᲀ:I

    .line 626
    .line 627
    if-ne v15, v3, :cond_32

    .line 628
    .line 629
    iget v3, v2, Lyyds/ᛲᛷᛲᲇ;->ᲇᲈᛵᛷ:I

    .line 630
    .line 631
    if-eq v14, v3, :cond_31

    .line 632
    .line 633
    goto :goto_1a

    .line 634
    :cond_31
    move v7, v4

    .line 635
    goto :goto_1b

    .line 636
    :cond_32
    :goto_1a
    const/4 v7, 0x1

    .line 637
    :goto_1b
    iput-boolean v7, v2, Lyyds/ᛲᛷᛲᲇ;->ᛲᛳᛶᲁ:Z

    .line 638
    .line 639
    iget-boolean v3, v13, Lyyds/ᛶᛶᛵᛶ;->ᛲᛳᛵᛱ:Z

    .line 640
    .line 641
    if-eqz v3, :cond_33

    .line 642
    .line 643
    const/4 v3, 0x1

    .line 644
    goto :goto_1c

    .line 645
    :cond_33
    move v3, v0

    .line 646
    :goto_1c
    if-eqz v3, :cond_34

    .line 647
    .line 648
    const/4 v13, -0x1

    .line 649
    if-eq v5, v13, :cond_34

    .line 650
    .line 651
    iget v0, v1, Lyyds/ᛴᲀᲈᛲ;->ᲇᲇᲈᲀ:I

    .line 652
    .line 653
    if-eq v0, v5, :cond_34

    .line 654
    .line 655
    const/4 v0, 0x1

    .line 656
    iput-boolean v0, v2, Lyyds/ᛲᛷᛲᲇ;->ᛲᛳᛶᲁ:Z

    .line 657
    .line 658
    :cond_34
    iput v15, v2, Lyyds/ᛲᛷᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 659
    .line 660
    iput v14, v2, Lyyds/ᛲᛷᛲᲇ;->ᲇᲇᲇᛱ:I

    .line 661
    .line 662
    iput-boolean v3, v2, Lyyds/ᛲᛷᛲᲇ;->ᛱᲈᲁ:Z

    .line 663
    .line 664
    iput v5, v2, Lyyds/ᛲᛷᛲᲇ;->ᛶᛷᛲᲁ:I

    .line 665
    .line 666
    return-void
.end method
