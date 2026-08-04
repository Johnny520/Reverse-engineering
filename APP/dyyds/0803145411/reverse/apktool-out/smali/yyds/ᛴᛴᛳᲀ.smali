.class public final synthetic Lyyds/ᛴᛴᛳᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:Landroid/view/View;

.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᛱᛷᛸᲈ;

.field public final synthetic ᲀᛲᛳᲀ:Landroid/view/ViewGroup;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lyyds/ᛱᛷᛸᲈ;Landroid/view/ViewGroup;Lyyds/ᛱᛷᛸᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᛴᛳᲀ;->ᛲᲈᲁ:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛴᛴᛳᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛴᛴᛳᲀ;->ᲀᛲᛳᲀ:Landroid/view/ViewGroup;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛴᛴᛳᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onDraw()V
    .locals 14

    .line 1
    sget v0, Lyyds/ᛶᲁᛳᛴ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    sget v1, Lyyds/ᛶᲁᛳᛴ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    sget v2, Lyyds/ᛶᲁᛳᛴ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    sget-object v3, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 8
    .line 9
    sget-object v4, Lyyds/ᲀᛴᛱᛷ;->ᛶᛷᛲᲁ:Lyyds/ᲀᛴᛱᛷ;

    .line 10
    .line 11
    invoke-virtual {v4}, Lyyds/ᲀᛴᛱᛷ;->ᛲᛶᛱᲈ()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sget-object v5, Lyyds/ᛷᛳᛲᛳ;->ᛲᛳᛴᛸ:Lyyds/ᛳᲀᛲ;

    .line 21
    .line 22
    sget-object v6, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 23
    .line 24
    const/16 v7, 0x19

    .line 25
    .line 26
    aget-object v6, v6, v7

    .line 27
    .line 28
    invoke-virtual {v5, v6}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v5, Lyyds/ᛷᛳᛲᛳ;->ᲀᛲᛱᛱ:Lyyds/ᛳᲀᛲ;

    .line 40
    .line 41
    sget-object v6, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 42
    .line 43
    const/16 v7, 0x1d

    .line 44
    .line 45
    aget-object v6, v6, v7

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {v5}, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ(I)F

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-object v5, p0, Lyyds/ᛴᛴᛳᲀ;->ᛲᲈᲁ:Landroid/view/View;

    .line 65
    .line 66
    check-cast v5, Landroid/view/ViewGroup;

    .line 67
    .line 68
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    const/4 v7, 0x0

    .line 73
    invoke-static {v7, v6}, Lyyds/ᛳᛵᲀ;->ᛷᛵᲇᲀ(II)Lyyds/ᲈᲈᲀᲈ;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    iget v8, v6, Lyyds/ᲇᲁᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 78
    .line 79
    iget v6, v6, Lyyds/ᲇᲁᲁᲁ;->ᲇᲈᛵᛷ:I

    .line 80
    .line 81
    if-gt v8, v6, :cond_f

    .line 82
    .line 83
    :goto_1
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    const-wide v10, -0x27868e68a836eL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    iget-object v10, p0, Lyyds/ᛴᛴᛳᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 96
    .line 97
    iget-object v11, v10, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 98
    .line 99
    if-eqz v11, :cond_2

    .line 100
    .line 101
    invoke-virtual {v9}, Landroid/view/View;->getId()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    iget-object v12, v10, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v12, Ljava/lang/Integer;

    .line 108
    .line 109
    if-nez v12, :cond_1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_1
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-ne v11, v12, :cond_2

    .line 117
    .line 118
    goto/16 :goto_6

    .line 119
    .line 120
    :cond_2
    :goto_2
    instance-of v11, v9, Landroid/view/ViewStub;

    .line 121
    .line 122
    if-eqz v11, :cond_3

    .line 123
    .line 124
    goto/16 :goto_6

    .line 125
    .line 126
    :cond_3
    invoke-virtual {v9}, Landroid/view/View;->isAttachedToWindow()Z

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    if-nez v11, :cond_4

    .line 131
    .line 132
    goto/16 :goto_6

    .line 133
    .line 134
    :cond_4
    instance-of v11, v9, Landroid/view/ViewGroup;

    .line 135
    .line 136
    if-eqz v11, :cond_5

    .line 137
    .line 138
    iget-object v11, v10, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 139
    .line 140
    if-nez v11, :cond_5

    .line 141
    .line 142
    move-object v11, v9

    .line 143
    check-cast v11, Landroid/view/ViewGroup;

    .line 144
    .line 145
    const-wide v12, -0x27878e68a836eL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    invoke-static {v12, v13}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    invoke-static {v11, v12}, Lyyds/ᛶᲁᛳᛴ;->ᛶᛷᛲᲁ(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    if-eqz v12, :cond_5

    .line 159
    .line 160
    invoke-virtual {v11}, Landroid/view/View;->getId()I

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    iput-object v9, v10, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 169
    .line 170
    goto/16 :goto_6

    .line 171
    .line 172
    :cond_5
    invoke-virtual {v9}, Landroid/view/View;->getAlpha()F

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    cmpg-float v10, v3, v10

    .line 177
    .line 178
    if-nez v10, :cond_6

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    invoke-virtual {v9, v3}, Landroid/view/View;->setAlpha(F)V

    .line 182
    .line 183
    .line 184
    :goto_3
    sget-object v10, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 185
    .line 186
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲁᛸᛲᲈ()Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eqz v10, :cond_e

    .line 194
    .line 195
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛵᛲᛶᲁ()Z

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    const/4 v11, 0x4

    .line 200
    if-eqz v10, :cond_7

    .line 201
    .line 202
    invoke-virtual {v4}, Lyyds/ᲀᛴᛱᛷ;->ᛲᛶᛱᲈ()Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-nez v10, :cond_8

    .line 207
    .line 208
    :cond_7
    const/4 v10, 0x0

    .line 209
    cmpg-float v10, v3, v10

    .line 210
    .line 211
    if-nez v10, :cond_9

    .line 212
    .line 213
    :cond_8
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-nez v10, :cond_e

    .line 218
    .line 219
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {v9, v2, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9}, Landroid/view/View;->isClickable()Z

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    invoke-virtual {v9, v1, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v9}, Landroid/view/View;->isFocusable()Z

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    invoke-virtual {v9, v0, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v9, v7}, Landroid/view/View;->setClickable(Z)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v9, v11}, Landroid/view/View;->setVisibility(I)V

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_9
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    if-ne v10, v11, :cond_e

    .line 261
    .line 262
    invoke-virtual {v9, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 267
    .line 268
    invoke-static {v10, v11}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    if-eqz v10, :cond_e

    .line 273
    .line 274
    const/4 v10, 0x0

    .line 275
    invoke-virtual {v9, v2, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v9, v7}, Landroid/view/View;->setVisibility(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v11

    .line 285
    instance-of v12, v11, Ljava/lang/Boolean;

    .line 286
    .line 287
    if-eqz v12, :cond_a

    .line 288
    .line 289
    check-cast v11, Ljava/lang/Boolean;

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_a
    move-object v11, v10

    .line 293
    :goto_4
    const/4 v12, 0x1

    .line 294
    if-eqz v11, :cond_b

    .line 295
    .line 296
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    goto :goto_5

    .line 301
    :cond_b
    move v11, v12

    .line 302
    :goto_5
    invoke-virtual {v9, v11}, Landroid/view/View;->setClickable(Z)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v9, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v11

    .line 309
    instance-of v13, v11, Ljava/lang/Boolean;

    .line 310
    .line 311
    if-eqz v13, :cond_c

    .line 312
    .line 313
    move-object v10, v11

    .line 314
    check-cast v10, Ljava/lang/Boolean;

    .line 315
    .line 316
    :cond_c
    if-eqz v10, :cond_d

    .line 317
    .line 318
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 319
    .line 320
    .line 321
    move-result v12

    .line 322
    :cond_d
    invoke-virtual {v9, v12}, Landroid/view/View;->setFocusable(Z)V

    .line 323
    .line 324
    .line 325
    :cond_e
    :goto_6
    if-eq v8, v6, :cond_f

    .line 326
    .line 327
    add-int/lit8 v8, v8, 0x1

    .line 328
    .line 329
    goto/16 :goto_1

    .line 330
    .line 331
    :cond_f
    iget-object v0, p0, Lyyds/ᛴᛴᛳᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 332
    .line 333
    iget-object v1, v0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 334
    .line 335
    iget-object p0, p0, Lyyds/ᛴᛴᛳᲀ;->ᲀᛲᛳᲀ:Landroid/view/ViewGroup;

    .line 336
    .line 337
    if-nez v1, :cond_10

    .line 338
    .line 339
    const-wide v1, -0x278ace68a836eL

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-static {p0, v1}, Lyyds/ᛶᲁᛳᛴ;->ᛶᛷᛲᲁ(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    invoke-static {p0}, Lyyds/ᛶᲁᛳᛴ;->ᛷᛲᲈᛱ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    if-eqz p0, :cond_11

    .line 357
    .line 358
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    iput-object v1, v0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 367
    .line 368
    invoke-static {p0}, Lyyds/ᲈᲁᛴᛸ;->ᛷᛵᲇᲀ(Landroid/view/View;)V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :cond_10
    check-cast v1, Ljava/lang/Integer;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-static {p0, v0}, Lyyds/ᛶᲁᛳᛴ;->ᛱᲈᲁ(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    if-eqz p0, :cond_11

    .line 383
    .line 384
    invoke-static {p0}, Lyyds/ᲈᲁᛴᛸ;->ᛷᛵᲇᲀ(Landroid/view/View;)V

    .line 385
    .line 386
    .line 387
    :cond_11
    return-void
.end method
