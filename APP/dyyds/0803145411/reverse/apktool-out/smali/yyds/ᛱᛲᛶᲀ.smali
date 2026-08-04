.class public final Lyyds/ᛱᛲᛶᲀ;
.super Lyyds/ᛲᛷᛱᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛳᲈᛷᲁ;

.field public final ᲀᛲᛳᲀ:Landroid/content/Context;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛳᲈᛷᲁ;


# direct methods
.method public native constructor <init>(Landroid/content/Context;Lyyds/ᛳᲈᛷᲁ;Lyyds/ᛳᲈᛷᲁ;)V
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Lyyds/ᛱᛸᛳᛵ;I)V
    .locals 9

    .line 1
    check-cast p1, Lyyds/ᛱᛶᲇᛱ;

    .line 2
    .line 3
    const-wide v0, -0x1365be68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛲᛷᛱᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᛷᲇ;

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛲᛷᛷᲇ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-wide v0, -0x13662e68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    check-cast p0, Lyyds/ᲈᛸᛷᛴ;

    .line 28
    .line 29
    iget-object p2, p1, Lyyds/ᛱᛶᲇᛱ;->ᛲᛳᛴᛸ:Landroid/widget/ImageView;

    .line 30
    .line 31
    iget-object v0, p1, Lyyds/ᛱᛶᲇᛱ;->ᛱᛳᛶᛳ:Lyyds/ᛱᛲᛶᲀ;

    .line 32
    .line 33
    const-wide v1, -0x422f7e68a836eL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    iget-object v1, p1, Lyyds/ᛱᛶᲇᛱ;->ᛳᛸᛴᛶ:Landroid/widget/TextView;

    .line 42
    .line 43
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛷᛲᲈᛱ()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p1, Lyyds/ᛱᛶᲇᛱ;->ᛶᲈᛴᲈ:Landroid/widget/TextView;

    .line 51
    .line 52
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛲᛲᲈᲈ()Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-static {v2, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/16 v3, 0x2d

    .line 63
    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛱᛳᲇ()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    invoke-static {v2}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᲇᲈᛵᛷ()J

    .line 85
    .line 86
    .line 87
    move-result-wide v4

    .line 88
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᲀᛲᛳᲀ()J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-wide v3, -0x422fde68a836eL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛱᛳᲇ()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    goto :goto_1

    .line 125
    :cond_1
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᲇᲈᛵᛷ()J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᲀᛲᛳᲀ()J

    .line 141
    .line 142
    .line 143
    move-result-wide v3

    .line 144
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-wide v3, -0x42306e68a836eL

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛷᛵᲇᲀ()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    sget-object v2, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 171
    .line 172
    if-nez v1, :cond_2

    .line 173
    .line 174
    move-object v1, v2

    .line 175
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛲᛴᛳᛲ()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-nez v3, :cond_3

    .line 184
    .line 185
    move-object v3, v2

    .line 186
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    iget-object v4, p1, Lyyds/ᛱᛶᲇᛱ;->ᛶᛸᲀᲁ:Landroid/widget/TextView;

    .line 191
    .line 192
    sget-object v5, Lyyds/ᛴᲁᛸᛴ;->ᛲᲈᲁ:Lyyds/ᛴᲁᛸᛴ;

    .line 193
    .line 194
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛵᛸᛸᛷ()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-static {v6}, Lyyds/ᛴᲁᛸᛴ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    const-wide v6, -0x42309e68a836eL

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    if-eqz v6, :cond_4

    .line 219
    .line 220
    new-instance v1, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-wide v5, -0x4230fe68a836eL

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    goto :goto_2

    .line 245
    :cond_4
    const-wide v6, -0x42313e68a836eL

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    if-eqz v5, :cond_5

    .line 259
    .line 260
    new-instance v5, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-wide v6, -0x42319e68a836eL

    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-wide v6, -0x4231ee68a836eL

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    goto :goto_2

    .line 300
    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const/16 v1, 0x6761

    .line 309
    .line 310
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    :goto_2
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛷᛵᲇᲀ()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    if-nez v1, :cond_6

    .line 325
    .line 326
    move-object v1, v2

    .line 327
    :cond_6
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛲᛴᛳᛲ()Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    if-nez v3, :cond_7

    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_7
    move-object v2, v3

    .line 335
    :goto_3
    new-instance v3, Ljava/util/ArrayList;

    .line 336
    .line 337
    const/16 v4, 0xa

    .line 338
    .line 339
    invoke-static {v2, v4}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 344
    .line 345
    .line 346
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    if-eqz v4, :cond_9

    .line 355
    .line 356
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    check-cast v4, Lyyds/ᛵᛷᛱᛵ;

    .line 361
    .line 362
    new-instance v5, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    const-wide v6, -0x42322e68a836eL

    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4}, Lyyds/ᛵᛷᛱᛵ;->ᛲᲈᲁ()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    invoke-static {v6}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 381
    .line 382
    .line 383
    move-result v7

    .line 384
    if-eqz v7, :cond_8

    .line 385
    .line 386
    invoke-virtual {v4}, Lyyds/ᛵᛷᛱᛵ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    :cond_8
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    goto :goto_4

    .line 401
    :cond_9
    iget-object v2, p1, Lyyds/ᛱᛶᲇᛱ;->ᛵᲀᲈᛴ:Landroid/widget/TextView;

    .line 402
    .line 403
    sget-object v4, Lyyds/ᛴᲁᛸᛴ;->ᛲᲈᲁ:Lyyds/ᛴᲁᛸᛴ;

    .line 404
    .line 405
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛵᛸᛸᛷ()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-static {v5}, Lyyds/ᛴᲁᛸᛴ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    const-wide v5, -0x42328e68a836eL

    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    if-eqz v5, :cond_a

    .line 430
    .line 431
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    if-eqz v1, :cond_d

    .line 436
    .line 437
    const-wide v3, -0x4232ee68a836eL

    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    goto :goto_6

    .line 451
    :cond_a
    const-wide v5, -0x42333e68a836eL

    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    if-eqz v4, :cond_b

    .line 465
    .line 466
    invoke-static {v1, v3}, Lyyds/ᛷᛷᛶᲇ;->ᲁᛶᛴᛸ(Ljava/util/List;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    if-eqz v3, :cond_c

    .line 475
    .line 476
    const-wide v3, -0x42339e68a836eL

    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    goto :goto_5

    .line 490
    :cond_b
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    if-eqz v3, :cond_c

    .line 495
    .line 496
    const-wide v3, -0x4233ee68a836eL

    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    :cond_c
    :goto_5
    move-object v3, v1

    .line 510
    :cond_d
    :goto_6
    const-wide v4, -0x42343e68a836eL

    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v4

    .line 519
    const/4 v7, 0x0

    .line 520
    const/16 v8, 0x3e

    .line 521
    .line 522
    const/4 v5, 0x0

    .line 523
    const/4 v6, 0x0

    .line 524
    invoke-static/range {v3 .. v8}, Lyyds/ᛷᛷᛶᲇ;->ᲈᛷᲈᛶ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;I)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 529
    .line 530
    .line 531
    invoke-static {}, Lyyds/ᛸᛸᛵᛳ;->ᛵᛸᛸᛷ()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    const/4 v3, 0x0

    .line 540
    if-eqz v2, :cond_e

    .line 541
    .line 542
    move v2, v3

    .line 543
    goto :goto_8

    .line 544
    :cond_e
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    move v2, v3

    .line 549
    :cond_f
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 550
    .line 551
    .line 552
    move-result v4

    .line 553
    if-eqz v4, :cond_11

    .line 554
    .line 555
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    check-cast v4, Lyyds/ᲀᛳᲈᛱ;

    .line 560
    .line 561
    invoke-virtual {v4}, Lyyds/ᲀᛳᲈᛱ;->ᛲᛴᛳᛲ()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v5

    .line 569
    invoke-static {v4, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    if-eqz v4, :cond_f

    .line 574
    .line 575
    add-int/lit8 v2, v2, 0x1

    .line 576
    .line 577
    if-ltz v2, :cond_10

    .line 578
    .line 579
    goto :goto_7

    .line 580
    :cond_10
    invoke-static {}, Lyyds/ᲈᛸᲁᛶ;->ᛵᛶᛲᲀ()V

    .line 581
    .line 582
    .line 583
    const/4 p0, 0x0

    .line 584
    throw p0

    .line 585
    :cond_11
    :goto_8
    iget-object v1, p1, Lyyds/ᛱᛶᲇᛱ;->ᲈᲀᛲᲀ:Landroid/widget/TextView;

    .line 586
    .line 587
    new-instance v4, Ljava/lang/StringBuilder;

    .line 588
    .line 589
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    const/16 v2, 0x4e2a

    .line 596
    .line 597
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 605
    .line 606
    .line 607
    iget-object v1, p1, Lyyds/ᛱᛶᲇᛱ;->ᛲᛶᛱᲈ:Landroid/widget/TextView;

    .line 608
    .line 609
    new-instance v2, Lyyds/ᛶᲈᛴᲈ;

    .line 610
    .line 611
    const/4 v4, 0x4

    .line 612
    invoke-direct {v2, v4, p1}, Lyyds/ᛶᲈᛴᲈ;-><init>(ILjava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 616
    .line 617
    .line 618
    iget-object p1, p1, Lyyds/ᛱᛶᲇᛱ;->ᛵᲀᛵᛸ:Landroid/widget/ImageView;

    .line 619
    .line 620
    new-instance v1, Lyyds/ᲁᲁᛷᛶ;

    .line 621
    .line 622
    invoke-direct {v1, v0, p0, v3}, Lyyds/ᲁᲁᛷᛶ;-><init>(Lyyds/ᛱᛲᛶᲀ;Lyyds/ᲈᛸᛷᛴ;I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 626
    .line 627
    .line 628
    new-instance p1, Lyyds/ᲁᲁᛷᛶ;

    .line 629
    .line 630
    const/4 v1, 0x1

    .line 631
    invoke-direct {p1, v0, p0, v1}, Lyyds/ᲁᲁᛷᛶ;-><init>(Lyyds/ᛱᛲᛶᲀ;Lyyds/ᲈᛸᛷᛴ;I)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {p0}, Lyyds/ᲈᛸᛷᛴ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object p0

    .line 641
    const-wide v0, -0x42345e68a836eL

    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object p1

    .line 650
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result p0

    .line 654
    if-eqz p0, :cond_12

    .line 655
    .line 656
    const/16 p0, 0x8

    .line 657
    .line 658
    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 659
    .line 660
    .line 661
    return-void

    .line 662
    :cond_12
    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 663
    .line 664
    .line 665
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Landroid/view/ViewGroup;I)Lyyds/ᛱᛸᛳᛵ;
    .locals 2

    .line 1
    const-wide v0, -0x13654e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lyyds/ᛱᛲᛶᲀ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {p2}, Lyyds/ᛵᛶᛵᲈ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const v0, 0x660c007a

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance p2, Lyyds/ᛱᛶᲇᛱ;

    .line 24
    .line 25
    invoke-direct {p2, p0, p1}, Lyyds/ᛱᛶᲇᛱ;-><init>(Lyyds/ᛱᛲᛶᲀ;Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    return-object p2
.end method
