.class public final synthetic Lxhss/ᛶᲀᲀᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᛴᛲᛲ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public final synthetic ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛶᲀᲀᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛶᲀᲀᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lxhss/ᛶᲀᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lxhss/ᛶᲀᲀᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lxhss/ᛶᲀᲀᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lxhss/ᛳᛲᲀᲈ;

    .line 12
    .line 13
    iget-object p0, p0, Lxhss/ᛶᲀᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/ArrayList;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    const-wide v4, -0x6eb1b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, Lxhss/ᛳᛲᲀᲈ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Landroid/widget/ImageView;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/16 v5, 0x8

    .line 36
    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    move v4, v5

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v4, v2

    .line 42
    :goto_0
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lxhss/ᛲᛱᛲᲀ;->ᛵᛳᛸᲇ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-lez v1, :cond_1

    .line 58
    .line 59
    move v1, v3

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v1, v2

    .line 62
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :cond_2
    move v4, v2

    .line 67
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_f

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    check-cast v6, Lxhss/ᛵᛷᛷᛲ;

    .line 78
    .line 79
    iget-object v7, v6, Lxhss/ᛵᛷᛷᛲ;->ᲇᛴᲇᛵ:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    move v8, v2

    .line 86
    :goto_3
    move v9, v8

    .line 87
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    if-eqz v10, :cond_b

    .line 92
    .line 93
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    check-cast v10, Lxhss/ᛷᛱᲁᲀ;

    .line 98
    .line 99
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const-wide v11, -0x96f1b858845L

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    if-eqz v11, :cond_4

    .line 115
    .line 116
    :goto_4
    move v11, v3

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    iget-object v11, v10, Lxhss/ᛷᛱᲁᲀ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v11}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    iget-object v12, v10, Lxhss/ᛷᛱᲁᲀ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 125
    .line 126
    invoke-static {v11, v12}, Lxhss/ᛷᲇᛵᛳ;->ᛱᛱᛴᲀ(Ljava/util/List;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    if-eqz v12, :cond_6

    .line 135
    .line 136
    :cond_5
    move v11, v2

    .line 137
    goto :goto_5

    .line 138
    :cond_6
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    :cond_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    if-eqz v12, :cond_5

    .line 147
    .line 148
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    check-cast v12, Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v12, p1, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    if-eqz v12, :cond_7

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :goto_5
    iget-object v12, v10, Lxhss/ᛷᛱᲁᲀ;->ᛳᲁᲇᛸ:Landroid/widget/LinearLayout;

    .line 162
    .line 163
    if-eqz v11, :cond_8

    .line 164
    .line 165
    move v13, v2

    .line 166
    goto :goto_6

    .line 167
    :cond_8
    move v13, v5

    .line 168
    :goto_6
    invoke-virtual {v12, v13}, Landroid/view/View;->setVisibility(I)V

    .line 169
    .line 170
    .line 171
    iget-object v10, v10, Lxhss/ᛷᛱᲁᲀ;->ᲇᛴᲇᛵ:Landroid/view/View;

    .line 172
    .line 173
    if-eqz v10, :cond_a

    .line 174
    .line 175
    if-eqz v11, :cond_9

    .line 176
    .line 177
    if-eqz v9, :cond_9

    .line 178
    .line 179
    move v12, v2

    .line 180
    goto :goto_7

    .line 181
    :cond_9
    move v12, v5

    .line 182
    :goto_7
    invoke-virtual {v10, v12}, Landroid/view/View;->setVisibility(I)V

    .line 183
    .line 184
    .line 185
    :cond_a
    if-eqz v11, :cond_3

    .line 186
    .line 187
    move v8, v3

    .line 188
    goto :goto_3

    .line 189
    :cond_b
    iget-object v7, v6, Lxhss/ᛵᛷᛷᛲ;->ᛱᛱᛲᲇ:Landroid/widget/TextView;

    .line 190
    .line 191
    if-eqz v1, :cond_c

    .line 192
    .line 193
    move v9, v5

    .line 194
    goto :goto_8

    .line 195
    :cond_c
    move v9, v2

    .line 196
    :goto_8
    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    .line 197
    .line 198
    .line 199
    iget-object v7, v6, Lxhss/ᛵᛷᛷᛲ;->ᛳᲁᲇᛸ:Landroid/widget/LinearLayout;

    .line 200
    .line 201
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    .line 202
    .line 203
    .line 204
    iget-object v6, v6, Lxhss/ᛵᛷᛷᛲ;->ᛷᛵᛵᲈ:Landroid/widget/LinearLayout;

    .line 205
    .line 206
    if-eqz v8, :cond_d

    .line 207
    .line 208
    move v7, v2

    .line 209
    goto :goto_9

    .line 210
    :cond_d
    move v7, v5

    .line 211
    :goto_9
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    if-nez v4, :cond_e

    .line 215
    .line 216
    if-eqz v8, :cond_2

    .line 217
    .line 218
    :cond_e
    move v4, v3

    .line 219
    goto/16 :goto_2

    .line 220
    .line 221
    :cond_f
    iget-object p0, v0, Lxhss/ᛳᛲᲀᲈ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p0, Landroid/widget/TextView;

    .line 224
    .line 225
    if-eqz v4, :cond_10

    .line 226
    .line 227
    move p1, v5

    .line 228
    goto :goto_a

    .line 229
    :cond_10
    move p1, v2

    .line 230
    :goto_a
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 231
    .line 232
    .line 233
    iget-object p0, v0, Lxhss/ᛳᛲᲀᲈ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast p0, Landroid/widget/LinearLayout;

    .line 236
    .line 237
    if-eqz v4, :cond_11

    .line 238
    .line 239
    goto :goto_b

    .line 240
    :cond_11
    move v2, v5

    .line 241
    :goto_b
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 242
    .line 243
    .line 244
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 245
    .line 246
    return-object p0

    .line 247
    :pswitch_0
    iget-object v0, p0, Lxhss/ᛶᲀᲀᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Landroid/content/Context;

    .line 250
    .line 251
    iget-object p0, p0, Lxhss/ᛶᲀᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p0, Lxhss/ᛵᲇᲀᛳ;

    .line 254
    .line 255
    check-cast p1, Landroid/view/View;

    .line 256
    .line 257
    const-wide v4, -0x6e51b858845L

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-object p1, v0

    .line 266
    :goto_c
    instance-of v2, p1, Landroid/content/ContextWrapper;

    .line 267
    .line 268
    if-eqz v2, :cond_13

    .line 269
    .line 270
    instance-of v2, p1, Landroid/app/Activity;

    .line 271
    .line 272
    if-eqz v2, :cond_12

    .line 273
    .line 274
    move-object v1, p1

    .line 275
    check-cast v1, Landroid/app/Activity;

    .line 276
    .line 277
    goto :goto_d

    .line 278
    :cond_12
    check-cast p1, Landroid/content/ContextWrapper;

    .line 279
    .line 280
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    goto :goto_c

    .line 285
    :cond_13
    :goto_d
    invoke-static {v0}, Lxhss/ᛱᛴᛳᛴ;->ᛴᲀᛸᛵ(Landroid/content/Context;)Lxhss/ᛱᛴᛳᛴ;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    const-wide v4, -0x3a61b858845L

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iput-object v0, p1, Lxhss/ᛱᛴᛳᛴ;->ᛲᛴᲇᛲ:Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {p1}, Lxhss/ᛱᛴᛳᛴ;->ᛴᲈᲀᲀ()V

    .line 301
    .line 302
    .line 303
    const-wide v4, -0x3a91b858845L

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    iput-object v0, p1, Lxhss/ᛱᛴᛳᛴ;->ᲁᲁᛴᲁ:Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {p1}, Lxhss/ᛱᛴᛳᛴ;->ᛴᲈᲀᲀ()V

    .line 315
    .line 316
    .line 317
    const-wide v4, -0x3bd1b858845L

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    new-instance v2, Lxhss/ᛲᛱᛷᛲ;

    .line 327
    .line 328
    invoke-direct {v2, v3, p0, v1}, Lxhss/ᛲᛱᛷᛲ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1, v0, v2}, Lxhss/ᛱᛴᛳᛴ;->ᛷᛸᛷ(Ljava/lang/CharSequence;Lxhss/ᛸᲈᲁᲇ;)Lxhss/ᛱᛴᛳᛴ;

    .line 332
    .line 333
    .line 334
    const-wide v0, -0x3c01b858845L

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    invoke-virtual {p1, p0}, Lxhss/ᛱᛴᛳᛴ;->ᛴᛷᛵᛴ(Ljava/lang/CharSequence;)Lxhss/ᛱᛴᛳᛴ;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p1}, Lxhss/ᛱᛴᛳᛴ;->ᲁᛲᲈᛵ()V

    .line 347
    .line 348
    .line 349
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 350
    .line 351
    return-object p0

    .line 352
    :pswitch_1
    sget-object v4, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 353
    .line 354
    iget-object v0, p0, Lxhss/ᛶᲀᲀᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 355
    .line 356
    move-object v8, v0

    .line 357
    check-cast v8, Ljava/lang/reflect/Method;

    .line 358
    .line 359
    iget-object p0, p0, Lxhss/ᛶᲀᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast p0, Ljava/util/Set;

    .line 362
    .line 363
    move-object v9, p1

    .line 364
    check-cast v9, Lxhss/ᛸᲀᲇᛱ;

    .line 365
    .line 366
    const-wide v5, -0x13f0b1b858845L

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    sget-object p1, Lxhss/ᲈᲁᲈᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᲁᲈᲁ;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-static {}, Lxhss/ᲈᲁᲈᲁ;->ᛲᛴᲀᲈ()Z

    .line 380
    .line 381
    .line 382
    move-result p1

    .line 383
    if-eqz p1, :cond_14

    .line 384
    .line 385
    goto/16 :goto_14

    .line 386
    .line 387
    :cond_14
    iget-object p1, v9, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 388
    .line 389
    if-eqz p1, :cond_23

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    invoke-static {p1}, Lxhss/ᲈᲁᲈᲁ;->ᛳᲈᲈᛲ(Ljava/lang/Class;)Lxhss/ᲈᛱᛱᲀ;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    invoke-virtual {p1}, Lxhss/ᲈᛱᛱᲀ;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    :cond_15
    move-object v0, p1

    .line 404
    check-cast v0, Lxhss/ᛸᛴᲇᲁ;

    .line 405
    .line 406
    invoke-virtual {v0}, Lxhss/ᛸᛴᲇᲁ;->hasNext()Z

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    if-eqz v5, :cond_18

    .line 411
    .line 412
    invoke-virtual {v0}, Lxhss/ᛸᛴᲇᲁ;->next()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    check-cast v0, Ljava/lang/reflect/Field;

    .line 417
    .line 418
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 419
    .line 420
    .line 421
    iget-object v5, v9, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 422
    .line 423
    invoke-virtual {v0, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    if-eqz v0, :cond_16

    .line 428
    .line 429
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    invoke-interface {p0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 437
    if-eqz v5, :cond_16

    .line 438
    .line 439
    goto :goto_e

    .line 440
    :cond_16
    move-object v0, v1

    .line 441
    goto :goto_e

    .line 442
    :catchall_0
    move-exception v0

    .line 443
    new-instance v5, Lxhss/ᲈᛳᛱᲇ;

    .line 444
    .line 445
    invoke-direct {v5, v0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    move-object v0, v5

    .line 449
    :goto_e
    instance-of v5, v0, Lxhss/ᲈᛳᛱᲇ;

    .line 450
    .line 451
    if-eqz v5, :cond_17

    .line 452
    .line 453
    move-object v0, v1

    .line 454
    :cond_17
    if-eqz v0, :cond_15

    .line 455
    .line 456
    goto :goto_f

    .line 457
    :cond_18
    move-object v0, v1

    .line 458
    :goto_f
    if-nez v0, :cond_19

    .line 459
    .line 460
    goto/16 :goto_14

    .line 461
    .line 462
    :cond_19
    const-wide p0, -0x13f1c1b858845L

    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    new-instance p0, Ljava/lang/StringBuilder;

    .line 472
    .line 473
    const-wide v5, -0x13f291b858845L

    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    const/16 p1, 0x2e

    .line 497
    .line 498
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    const-wide v5, -0x13f3b1b858845L

    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object p1

    .line 528
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object p0

    .line 535
    invoke-static {p0}, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    sget-object p0, Lxhss/ᲈᲁᲈᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᲁᲈᲁ;

    .line 539
    .line 540
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-static {v7}, Lxhss/ᲈᲁᲈᲁ;->ᛱᲈᛳᛴ(Ljava/lang/String;)Lxhss/ᲇᛲᛲᛲ;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    sget-object p1, Lxhss/ᲇᛲᛲᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛲᛲᛲ;

    .line 548
    .line 549
    if-ne p0, p1, :cond_1a

    .line 550
    .line 551
    goto/16 :goto_14

    .line 552
    .line 553
    :cond_1a
    iget-object p1, v9, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 554
    .line 555
    if-nez p1, :cond_1b

    .line 556
    .line 557
    move-object p1, v1

    .line 558
    goto :goto_11

    .line 559
    :cond_1b
    sget-object v3, Lxhss/ᲈᲁᲈᲁ;->ᛸᛷᲈᲈ:Ljava/util/WeakHashMap;

    .line 560
    .line 561
    monitor-enter v3

    .line 562
    :try_start_1
    invoke-virtual {v3, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object p1

    .line 566
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 567
    .line 568
    if-eqz p1, :cond_1c

    .line 569
    .line 570
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    check-cast p1, Landroid/view/View;

    .line 575
    .line 576
    if-eqz p1, :cond_1c

    .line 577
    .line 578
    invoke-static {p1}, Lxhss/ᲈᲁᲈᲁ;->ᛲᛴᲇᛲ(Landroid/view/View;)Z

    .line 579
    .line 580
    .line 581
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 582
    if-eqz v0, :cond_1c

    .line 583
    .line 584
    goto :goto_10

    .line 585
    :cond_1c
    move-object p1, v1

    .line 586
    goto :goto_10

    .line 587
    :catchall_1
    move-exception v0

    .line 588
    move-object p0, v0

    .line 589
    goto/16 :goto_13

    .line 590
    .line 591
    :goto_10
    monitor-exit v3

    .line 592
    :goto_11
    if-nez p1, :cond_1d

    .line 593
    .line 594
    const-wide p0, -0x13f471b858845L

    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object p0

    .line 603
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object p0

    .line 615
    invoke-static {p0}, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    goto/16 :goto_14

    .line 619
    .line 620
    :cond_1d
    new-instance v6, Lxhss/ᛱᛶᛳ;

    .line 621
    .line 622
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 627
    .line 628
    .line 629
    move-result-object p1

    .line 630
    invoke-direct {v6, v0, p1}, Lxhss/ᛱᛶᛳ;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 631
    .line 632
    .line 633
    invoke-static {v6, v7}, Lxhss/ᲈᲁᲈᲁ;->ᛵᛷᛲᛸ(Lxhss/ᛱᛶᛳ;Ljava/lang/String;)Z

    .line 634
    .line 635
    .line 636
    move-result p1

    .line 637
    if-nez p1, :cond_1e

    .line 638
    .line 639
    goto/16 :goto_14

    .line 640
    .line 641
    :cond_1e
    sget-object p1, Lxhss/ᲇᛲᛲᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛲᛲᛲ;

    .line 642
    .line 643
    if-ne p0, p1, :cond_1f

    .line 644
    .line 645
    const-wide p0, -0x13f691b858845L

    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object p0

    .line 654
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    move-result-object p1

    .line 658
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object p1

    .line 662
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object p0

    .line 666
    invoke-static {p0}, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v9, v1}, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    goto :goto_14

    .line 673
    :cond_1f
    iget-object p0, v6, Lxhss/ᛱᛶᛳ;->ᛷᛵᛵᲈ:Landroid/content/Context;

    .line 674
    .line 675
    if-nez p0, :cond_20

    .line 676
    .line 677
    invoke-static {v6, v7}, Lxhss/ᲈᲁᲈᲁ;->ᛵᛲᲁᛶ(Lxhss/ᛱᛶᛳ;Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    const-wide p0, -0x13f7f1b858845L

    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    invoke-static {p0}, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    goto :goto_14

    .line 693
    :cond_20
    iget-object p1, v9, Lxhss/ᛸᲀᲇᛱ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 694
    .line 695
    new-instance v0, Ljava/util/ArrayList;

    .line 696
    .line 697
    invoke-static {p1}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 705
    .line 706
    .line 707
    move-result-object p1

    .line 708
    :goto_12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 709
    .line 710
    .line 711
    move-result v3

    .line 712
    if-eqz v3, :cond_21

    .line 713
    .line 714
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    goto :goto_12

    .line 722
    :cond_21
    new-array p1, v2, [Ljava/lang/Object;

    .line 723
    .line 724
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v10

    .line 728
    sget-object p1, Lxhss/ᲈᲁᲈᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᲁᲈᲁ;

    .line 729
    .line 730
    new-instance v5, Lxhss/ᲈᛸᛳᛲ;

    .line 731
    .line 732
    const/4 v11, 0x1

    .line 733
    invoke-direct/range {v5 .. v11}, Lxhss/ᲈᛸᛳᛲ;-><init>(Lxhss/ᛱᛶᛳ;Ljava/lang/String;Ljava/lang/reflect/Method;Lxhss/ᛸᲀᲇᛱ;[Ljava/lang/Object;I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {p1, p0, v7, v5}, Lxhss/ᲈᲁᲈᲁ;->ᲁᛴᛴᛸ(Landroid/content/Context;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)Z

    .line 737
    .line 738
    .line 739
    move-result p0

    .line 740
    if-nez p0, :cond_22

    .line 741
    .line 742
    invoke-static {v6, v7}, Lxhss/ᲈᲁᲈᲁ;->ᛵᛲᲁᛶ(Lxhss/ᛱᛶᛳ;Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    goto :goto_14

    .line 746
    :cond_22
    invoke-virtual {v9, v1}, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    goto :goto_14

    .line 750
    :goto_13
    monitor-exit v3

    .line 751
    throw p0

    .line 752
    :cond_23
    :goto_14
    return-object v4

    .line 753
    :pswitch_2
    iget-object v0, p0, Lxhss/ᛶᲀᲀᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v0, Lxhss/ᛶᛳᲀᲇ;

    .line 756
    .line 757
    iget-object p0, p0, Lxhss/ᛶᲀᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast p0, Lxhss/ᛴᛲᛱᲇ;

    .line 760
    .line 761
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 762
    .line 763
    .line 764
    iget-object v0, v0, Lxhss/ᛶᛳᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛵᲇᛱᛴ;

    .line 765
    .line 766
    check-cast p0, Lxhss/ᛱᛱᛶᲁ;

    .line 767
    .line 768
    iget-object p0, p0, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 769
    .line 770
    invoke-interface {v0, p0, p1}, Lxhss/ᛵᲇᛱᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 774
    .line 775
    return-object p0

    .line 776
    :pswitch_3
    iget-object v0, p0, Lxhss/ᛶᲀᲀᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v0, Lxhss/ᛵᛷᲈᛲ;

    .line 779
    .line 780
    iget-object p0, p0, Lxhss/ᛶᲀᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast p0, Lxhss/ᛳᛵᛲᲇ;

    .line 783
    .line 784
    check-cast p1, Ljava/lang/Throwable;

    .line 785
    .line 786
    iget-object p1, v0, Lxhss/ᛵᛷᲈᛲ;->ᛳᲁᲇᛸ:Landroid/os/Handler;

    .line 787
    .line 788
    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 789
    .line 790
    .line 791
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 792
    .line 793
    return-object p0

    .line 794
    nop

    .line 795
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
