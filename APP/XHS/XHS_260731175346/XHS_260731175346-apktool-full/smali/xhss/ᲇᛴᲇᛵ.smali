.class public final synthetic Lxhss/ᲇᛴᲇᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᛴᛲᛲ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᲇᛴᲇᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᲇᛴᲇᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lxhss/ᲇᛴᲇᛵ;->ᛱᛱᛲᲇ:I

    .line 6
    .line 7
    const-wide v3, -0xfcf11b858845L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v5, -0xfce91b858845L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide v7, -0xfd001b858845L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    packed-switch v2, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lxhss/ᲇᛴᲇᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    check-cast v1, Lxhss/ᛵᛴᛲᛵ;

    .line 32
    .line 33
    sget-object v2, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 34
    .line 35
    const-wide v11, -0x133401b858845L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    iget-object v11, v1, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 44
    .line 45
    instance-of v12, v11, Landroid/view/View;

    .line 46
    .line 47
    if-eqz v12, :cond_0

    .line 48
    .line 49
    move-object v9, v11

    .line 50
    check-cast v9, Landroid/view/View;

    .line 51
    .line 52
    :cond_0
    if-nez v9, :cond_1

    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_1
    iget-object v1, v1, Lxhss/ᛵᛴᛲᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_2
    sget-object v11, Lxhss/ᲁᲁᲀᲇ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 63
    .line 64
    if-eqz v11, :cond_4

    .line 65
    .line 66
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    if-eqz v12, :cond_4

    .line 71
    .line 72
    :cond_3
    move v11, v10

    .line 73
    goto :goto_0

    .line 74
    :cond_4
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    :cond_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    if-eqz v12, :cond_3

    .line 83
    .line 84
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    check-cast v12, Lxhss/ᲀᛴᛳᛸ;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    const-wide v14, -0xecbd1b858845L

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v14, v15}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    iget-object v12, v12, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v12, Ljava/lang/CharSequence;

    .line 109
    .line 110
    invoke-static {v13, v12, v10}, Lxhss/ᛲᛱᛲᲀ;->ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    if-eqz v12, :cond_5

    .line 115
    .line 116
    const/4 v11, 0x1

    .line 117
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const/16 v12, 0x8

    .line 126
    .line 127
    if-eqz v11, :cond_8

    .line 128
    .line 129
    sget-object v0, Lxhss/ᲁᲁᲀᲇ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 130
    .line 131
    const-wide v3, -0xecca1b858845L

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    sget-object v0, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᛲ;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    sget-object v0, Lxhss/ᛳᛱᛲᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛳᲀᲇ;

    .line 145
    .line 146
    sget-object v3, Lxhss/ᛳᛱᛲᛲ;->ᛱᛱᛲᲇ:[Lxhss/ᛴᛲᛱᲇ;

    .line 147
    .line 148
    aget-object v3, v3, v10

    .line 149
    .line 150
    invoke-virtual {v0, v3}, Lxhss/ᛶᛳᲀᲇ;->ᛷᛵᛵᲈ(Lxhss/ᛴᛲᛱᲇ;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ljava/lang/String;

    .line 155
    .line 156
    const-wide v3, -0xecce1b858845L

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    filled-new-array {v3}, [Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-static {v0, v3}, Lxhss/ᛲᛱᛲᲀ;->ᲈᲈᲈ(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    sget-object v3, Lxhss/ᲁᲁᲀᲇ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 174
    .line 175
    if-eqz v3, :cond_6

    .line 176
    .line 177
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v4, :cond_6

    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :cond_6
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_b

    .line 194
    .line 195
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    check-cast v4, Lxhss/ᲀᛴᛳᛸ;

    .line 200
    .line 201
    iget-object v5, v4, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 202
    .line 203
    invoke-static {v5, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-eqz v5, :cond_7

    .line 208
    .line 209
    iget-object v4, v4, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 210
    .line 211
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_7

    .line 216
    .line 217
    invoke-virtual {v9, v12}, Landroid/view/View;->setVisibility(I)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_8
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-nez v9, :cond_b

    .line 226
    .line 227
    sget-object v9, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᛲ;

    .line 228
    .line 229
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object v9, Lxhss/ᛳᛱᛲᛲ;->ᛷᲁᲁ:Lxhss/ᛶᛳᲀᲇ;

    .line 233
    .line 234
    sget-object v11, Lxhss/ᛳᛱᛲᛲ;->ᛱᛱᛲᲇ:[Lxhss/ᛴᛲᛱᲇ;

    .line 235
    .line 236
    aget-object v11, v11, v12

    .line 237
    .line 238
    invoke-virtual {v9, v11}, Lxhss/ᛶᛳᲀᲇ;->ᛷᛵᛵᲈ(Lxhss/ᛴᛲᛱᲇ;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    check-cast v9, Ljava/lang/Boolean;

    .line 243
    .line 244
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    if-eqz v9, :cond_b

    .line 249
    .line 250
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    const-wide v11, -0x133501b858845L

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-static {v7, v8, v0, v5, v6}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛴᛶᛳ(JLjava/lang/String;J)I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-nez v1, :cond_9

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    :goto_1
    if-ge v10, v1, :cond_b

    .line 278
    .line 279
    add-int/lit16 v5, v10, 0x7d0

    .line 280
    .line 281
    if-le v5, v1, :cond_a

    .line 282
    .line 283
    move v5, v1

    .line 284
    :cond_a
    invoke-virtual {v0, v10, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    sget-object v7, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 292
    .line 293
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-static {v6}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    move v10, v5

    .line 300
    goto :goto_1

    .line 301
    :cond_b
    :goto_2
    return-object v2

    .line 302
    :pswitch_0
    iget-object v0, v0, Lxhss/ᲇᛴᲇᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Lxhss/ᲁᲀᛸᛶ;

    .line 305
    .line 306
    check-cast v1, Ljava/lang/Boolean;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    iget-object v0, v0, Lxhss/ᲁᲀᛸᛶ;->ᛷᛵᛵᲈ:Landroid/widget/EditText;

    .line 313
    .line 314
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 315
    .line 316
    .line 317
    if-eqz v1, :cond_c

    .line 318
    .line 319
    const/high16 v1, 0x3f800000    # 1.0f

    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_c
    const/high16 v1, 0x3f000000    # 0.5f

    .line 323
    .line 324
    :goto_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 325
    .line 326
    .line 327
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_1
    iget-object v0, v0, Lxhss/ᲇᛴᲇᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Lxhss/ᲇᛶᛳᛵ;

    .line 333
    .line 334
    check-cast v1, Lxhss/ᛵᛴᛲᛵ;

    .line 335
    .line 336
    sget-object v2, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 337
    .line 338
    const-wide v11, -0x122af1b858845L

    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    sget-object v11, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 347
    .line 348
    iget-object v12, v1, Lxhss/ᛵᛴᛲᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 349
    .line 350
    const-wide v13, -0x122bb1b858845L

    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v13

    .line 359
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-static {v12, v13}, Lxhss/ᲇᲁᛱᛸ;->ᲇᛸᛳᲁ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v11

    .line 366
    const-wide v13, -0x122c21b858845L

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v13

    .line 375
    new-array v14, v10, [Ljava/lang/Object;

    .line 376
    .line 377
    if-eqz v11, :cond_d

    .line 378
    .line 379
    sget v15, Lxhss/ᲇᲀᛵᲁ;->ᛷᛵᛵᲈ:I

    .line 380
    .line 381
    invoke-static {v11}, Lxhss/ᲀᲈᛵᛸ;->ᲈᛲᛵᲁ(Ljava/lang/Object;)Lxhss/ᲇᛵᛲᲁ;

    .line 382
    .line 383
    .line 384
    move-result-object v11

    .line 385
    iget-object v15, v11, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v15, Lxhss/ᛸᛵᲇᲈ;

    .line 388
    .line 389
    move-wide/from16 v16, v3

    .line 390
    .line 391
    const/4 v3, 0x2

    .line 392
    iput v3, v15, Lxhss/ᛸᛵᲇᲈ;->ᲇᛴᲇᛵ:I

    .line 393
    .line 394
    invoke-virtual {v11}, Lxhss/ᲇᛵᛲᲁ;->ᛳᲈᲈᛲ()Lxhss/ᛷᛴᲀᛳ;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    invoke-virtual {v3}, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ()V

    .line 399
    .line 400
    .line 401
    iput-object v13, v3, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {v3}, Lxhss/ᛷᛴᲀᛳ;->ᛳᲁᲇᛸ()Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-static {v3}, Lxhss/ᛷᲇᛵᛳ;->ᛱᲈᛳᛴ(Ljava/util/List;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    check-cast v3, Lxhss/ᛲᲀᛱ;

    .line 412
    .line 413
    if-eqz v3, :cond_e

    .line 414
    .line 415
    invoke-static {v14, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-virtual {v3, v4}, Lxhss/ᛲᲀᛱ;->ᛱᲈᛳᛴ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    goto :goto_4

    .line 424
    :cond_d
    move-wide/from16 v16, v3

    .line 425
    .line 426
    :cond_e
    move-object v3, v9

    .line 427
    :goto_4
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 428
    .line 429
    if-nez v4, :cond_f

    .line 430
    .line 431
    goto :goto_5

    .line 432
    :cond_f
    move-object v9, v3

    .line 433
    :goto_5
    check-cast v9, Landroid/view/ViewGroup;

    .line 434
    .line 435
    if-nez v9, :cond_10

    .line 436
    .line 437
    goto/16 :goto_b

    .line 438
    .line 439
    :cond_10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    const-wide v13, -0x122ca1b858845L

    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    const/16 v4, 0x20

    .line 461
    .line 462
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    invoke-static {v7, v8, v3, v5, v6}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛴᛶᛳ(JLjava/lang/String;J)I

    .line 473
    .line 474
    .line 475
    move-result v11

    .line 476
    if-nez v11, :cond_11

    .line 477
    .line 478
    goto :goto_7

    .line 479
    :cond_11
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 480
    .line 481
    .line 482
    move-result v11

    .line 483
    move v13, v10

    .line 484
    :goto_6
    if-ge v13, v11, :cond_13

    .line 485
    .line 486
    add-int/lit16 v14, v13, 0x7d0

    .line 487
    .line 488
    if-le v14, v11, :cond_12

    .line 489
    .line 490
    move v14, v11

    .line 491
    :cond_12
    invoke-virtual {v3, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v13

    .line 495
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    sget-object v15, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 499
    .line 500
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-static {v13}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    move v13, v14

    .line 507
    goto :goto_6

    .line 508
    :cond_13
    :goto_7
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    sget v11, Lxhss/ᲇᲀᛵᲁ;->ᛷᛵᛵᲈ:I

    .line 513
    .line 514
    invoke-static {v12}, Lxhss/ᲀᲈᛵᛸ;->ᲈᛲᛵᲁ(Ljava/lang/Object;)Lxhss/ᲇᛵᛲᲁ;

    .line 515
    .line 516
    .line 517
    move-result-object v11

    .line 518
    invoke-virtual {v11}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛷᲈᲈ()Lxhss/ᛵᛸᲈᛲ;

    .line 519
    .line 520
    .line 521
    move-result-object v11

    .line 522
    iget-object v0, v0, Lxhss/ᲇᛶᛳᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 523
    .line 524
    iput-object v0, v11, Lxhss/ᛵᛸᲈᛲ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 525
    .line 526
    invoke-virtual {v11}, Lxhss/ᛵᛸᲈᛲ;->ᛳᲁᲇᛸ()Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-static {v0}, Lxhss/ᛷᲇᛵᛳ;->ᛱᲈᛳᛴ(Ljava/util/List;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    check-cast v0, Lxhss/ᛸᛴᲁᛸ;

    .line 535
    .line 536
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 537
    .line 538
    .line 539
    move-result v11

    .line 540
    move v12, v10

    .line 541
    :goto_8
    if-ge v12, v11, :cond_17

    .line 542
    .line 543
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 544
    .line 545
    .line 546
    move-result-object v13

    .line 547
    const-wide v14, -0x122dd1b858845L

    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    invoke-static {v14, v15}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    new-instance v14, Ljava/lang/StringBuilder;

    .line 556
    .line 557
    const-wide v18, -0x122ed1b858845L

    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v15

    .line 566
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 576
    .line 577
    .line 578
    move-result v13

    .line 579
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v13

    .line 586
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 593
    .line 594
    .line 595
    move-result v14

    .line 596
    if-nez v14, :cond_14

    .line 597
    .line 598
    goto :goto_a

    .line 599
    :cond_14
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 600
    .line 601
    .line 602
    move-result v14

    .line 603
    move v15, v10

    .line 604
    :goto_9
    if-ge v15, v14, :cond_16

    .line 605
    .line 606
    add-int/lit16 v4, v15, 0x7d0

    .line 607
    .line 608
    if-le v4, v14, :cond_15

    .line 609
    .line 610
    move v4, v14

    .line 611
    :cond_15
    invoke-virtual {v13, v15, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v15

    .line 615
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    sget-object v18, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 619
    .line 620
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    invoke-static {v15}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    move v15, v4

    .line 627
    const/16 v4, 0x20

    .line 628
    .line 629
    goto :goto_9

    .line 630
    :cond_16
    :goto_a
    add-int/lit8 v12, v12, 0x1

    .line 631
    .line 632
    const/16 v4, 0x20

    .line 633
    .line 634
    goto :goto_8

    .line 635
    :cond_17
    sget-object v4, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 636
    .line 637
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    invoke-static {v3}, Lxhss/ᲇᲁᛱᛸ;->ᛴᲈᛱᛴ(Landroid/content/Context;)V

    .line 641
    .line 642
    .line 643
    const-wide v4, -0x122f61b858845L

    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    invoke-static {v9, v4}, Lxhss/ᛶᲈᛴᛲ;->ᲀᲇᛳᲁ(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    sget-object v5, Lxhss/ᛱᛷᛶᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᛶᛸ;

    .line 657
    .line 658
    new-instance v6, Ljava/lang/StringBuilder;

    .line 659
    .line 660
    const-wide v7, -0x123151b858845L

    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v7

    .line 669
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-static {v6}, Lxhss/ᲇᛱᲈᛸ;->ᲈᛳᲀ(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    if-eqz v4, :cond_18

    .line 686
    .line 687
    new-instance v5, Lxhss/ᲇᛱᛵᲁ;

    .line 688
    .line 689
    invoke-direct {v5, v1, v0, v3}, Lxhss/ᲇᛱᛵᲁ;-><init>(Lxhss/ᛵᛴᛲᛵ;Lxhss/ᛸᛴᲁᛸ;Landroid/content/Context;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 693
    .line 694
    .line 695
    :cond_18
    :goto_b
    return-object v2

    .line 696
    :pswitch_2
    iget-object v0, v0, Lxhss/ᲇᛴᲇᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v0, Lxhss/ᲀᛸᛸᲁ;

    .line 699
    .line 700
    check-cast v1, Ljava/lang/Integer;

    .line 701
    .line 702
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    invoke-virtual {v0, v1}, Lxhss/ᲀᛸᛸᲁ;->ᛱᛱᛲᲇ(I)Lxhss/ᛷᛴᲇᲀ;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    return-object v0

    .line 711
    :pswitch_3
    iget-object v0, v0, Lxhss/ᲇᛴᲇᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v0, Ljava/util/ArrayList;

    .line 714
    .line 715
    check-cast v1, Ljava/lang/Integer;

    .line 716
    .line 717
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 718
    .line 719
    .line 720
    move-result v1

    .line 721
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    check-cast v0, Ljava/lang/Boolean;

    .line 726
    .line 727
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_4
    sget-object v2, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 732
    .line 733
    iget-object v0, v0, Lxhss/ᲇᛴᲇᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 734
    .line 735
    check-cast v0, Ljava/util/Set;

    .line 736
    .line 737
    check-cast v1, Lxhss/ᛵᛴᛲᛵ;

    .line 738
    .line 739
    const-wide v3, -0x13cb41b858845L

    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    iget-object v3, v1, Lxhss/ᛵᛴᛲᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 748
    .line 749
    instance-of v4, v3, Landroid/view/View;

    .line 750
    .line 751
    if-eqz v4, :cond_19

    .line 752
    .line 753
    move-object v9, v3

    .line 754
    check-cast v9, Landroid/view/View;

    .line 755
    .line 756
    :cond_19
    if-nez v9, :cond_1a

    .line 757
    .line 758
    goto :goto_c

    .line 759
    :cond_1a
    iget-object v1, v1, Lxhss/ᛵᛴᛲᛵ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 760
    .line 761
    invoke-static {v1, v10}, Lxhss/ᛷᲇᛵᛳ;->ᛸᛴᛸᛲ(Ljava/util/List;I)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    if-nez v1, :cond_1b

    .line 766
    .line 767
    goto :goto_c

    .line 768
    :cond_1b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    move-result v0

    .line 776
    if-nez v0, :cond_1c

    .line 777
    .line 778
    goto :goto_c

    .line 779
    :cond_1c
    sget-object v0, Lxhss/ᲈᲁᲈᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᲁᲈᲁ;

    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    sget-object v3, Lxhss/ᲈᲁᲈᲁ;->ᛸᛷᲈᲈ:Ljava/util/WeakHashMap;

    .line 785
    .line 786
    monitor-enter v3

    .line 787
    :try_start_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 788
    .line 789
    invoke-direct {v0, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v3, v1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 793
    .line 794
    .line 795
    monitor-exit v3

    .line 796
    :goto_c
    return-object v2

    .line 797
    :catchall_0
    move-exception v0

    .line 798
    monitor-exit v3

    .line 799
    throw v0

    .line 800
    :pswitch_5
    iget-object v0, v0, Lxhss/ᲇᛴᲇᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v0, Lxhss/ᛶᛵᲈᛱ;

    .line 803
    .line 804
    check-cast v1, Ljava/lang/Integer;

    .line 805
    .line 806
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 807
    .line 808
    .line 809
    move-result v1

    .line 810
    iput v1, v0, Lxhss/ᛶᛵᲈᛱ;->ᛱᛱᛲᲇ:I

    .line 811
    .line 812
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 813
    .line 814
    return-object v0

    .line 815
    :pswitch_6
    iget-object v0, v0, Lxhss/ᲇᛴᲇᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v0, Lxhss/ᛷᛴᛷᛱ;

    .line 818
    .line 819
    if-ne v1, v0, :cond_1d

    .line 820
    .line 821
    const-string v0, "(this Collection)"

    .line 822
    .line 823
    goto :goto_d

    .line 824
    :cond_1d
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    :goto_d
    return-object v0

    .line 829
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
