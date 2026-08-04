.class public final synthetic Lyyds/ᛷᛵᲇᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛷᛵᲇᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛷᛵᲇᲀ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lyyds/ᛷᛵᲇᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object p0, p0, Lyyds/ᛷᛵᲇᲀ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lyyds/ᛱᛲᛴᛲ;

    .line 14
    .line 15
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    check-cast p2, Lyyds/ᲇᛶᛸᛸ;

    .line 22
    .line 23
    const-wide v0, -0xb133e68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/io/File;

    .line 32
    .line 33
    iget-object p2, p2, Lyyds/ᲇᛶᛸᛸ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object p2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-wide v5, -0xb0b4e68a836eL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p2, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-wide v5, -0xb0bfe68a836eL

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-wide v5, -0xb0c8e68a836eL

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_0

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    goto :goto_0

    .line 112
    :cond_0
    const-wide/16 v5, 0x0

    .line 113
    .line 114
    :goto_0
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-wide v5, -0xb0d1e68a836eL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {p2, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-nez v1, :cond_1

    .line 141
    .line 142
    new-instance p0, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-wide v3, -0xb0d8e68a836eL

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 168
    .line 169
    .line 170
    new-instance p0, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-wide v3, -0xb0e2e68a836eL

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᛴᛳᛲ(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_1

    .line 199
    .line 200
    :cond_1
    iget p2, p0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 201
    .line 202
    if-ne p2, p1, :cond_2

    .line 203
    .line 204
    iget-object p2, p0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast p2, Landroid/media/MediaPlayer;

    .line 207
    .line 208
    if-eqz p2, :cond_2

    .line 209
    .line 210
    invoke-virtual {p2}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    if-ne p2, v4, :cond_2

    .line 215
    .line 216
    invoke-virtual {p0}, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ()V

    .line 217
    .line 218
    .line 219
    iget-object p0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p0, Lyyds/ᛲᲀᛲᲈ;

    .line 222
    .line 223
    if-eqz p0, :cond_3

    .line 224
    .line 225
    const/4 p1, -0x1

    .line 226
    invoke-virtual {p0, p1}, Lyyds/ᛲᲀᛲᲈ;->ᛱᲈᲁ(I)V

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ()V

    .line 231
    .line 232
    .line 233
    sget-object p2, Lyyds/ᲈᛳᛱᛲ;->ᛲᲈᲁ:Lyyds/ᲈᛳᛱᛲ;

    .line 234
    .line 235
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {}, Lyyds/ᲈᛳᛱᛲ;->ᛱᛳᲇ()V

    .line 239
    .line 240
    .line 241
    :try_start_0
    new-instance p2, Landroid/media/MediaPlayer;

    .line 242
    .line 243
    invoke-direct {p2}, Landroid/media/MediaPlayer;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {p2, v0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2}, Landroid/media/MediaPlayer;->prepare()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2}, Landroid/media/MediaPlayer;->start()V

    .line 257
    .line 258
    .line 259
    new-instance v0, Lyyds/ᲇᲈᲈᛳ;

    .line 260
    .line 261
    const/4 v1, 0x2

    .line 262
    invoke-direct {v0, v1, p0}, Lyyds/ᲇᲈᲈᛳ;-><init>(ILjava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 266
    .line 267
    .line 268
    iput-object p2, p0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 269
    .line 270
    iput p1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 271
    .line 272
    iget-object p0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast p0, Lyyds/ᛲᲀᛲᲈ;

    .line 275
    .line 276
    if-eqz p0, :cond_3

    .line 277
    .line 278
    invoke-virtual {p0, p1}, Lyyds/ᛲᲀᛲᲈ;->ᛱᲈᲁ(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    .line 280
    .line 281
    goto :goto_1

    .line 282
    :catch_0
    move-exception v0

    .line 283
    move-object p0, v0

    .line 284
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 285
    .line 286
    const-wide v0, -0xb0ece68a836eL

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    invoke-virtual {p1, p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    new-instance p1, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-wide v0, -0xb0f1e68a836eL

    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 324
    .line 325
    .line 326
    :cond_3
    :goto_1
    return-object v2

    .line 327
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 328
    .line 329
    move-object v7, p1

    .line 330
    check-cast v7, Ljava/lang/CharSequence;

    .line 331
    .line 332
    check-cast p2, Ljava/lang/Integer;

    .line 333
    .line 334
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 339
    .line 340
    .line 341
    move-result p2

    .line 342
    if-ne p2, v4, :cond_6

    .line 343
    .line 344
    invoke-static {p0}, Lyyds/ᛷᛷᛶᲇ;->ᛲᲀᛵᛷ(Ljava/util/List;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    check-cast p0, Ljava/lang/String;

    .line 349
    .line 350
    const/4 p2, 0x4

    .line 351
    invoke-static {v7, p0, p1, v1, p2}, Lyyds/ᛲᲇᛸᲇ;->ᛸᛸᛷᛱ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    if-gez p1, :cond_5

    .line 356
    .line 357
    :cond_4
    move-object p2, v3

    .line 358
    goto/16 :goto_6

    .line 359
    .line 360
    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    new-instance p2, Lkotlin/Pair;

    .line 365
    .line 366
    invoke-direct {p2, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_6

    .line 370
    .line 371
    :cond_6
    new-instance p2, Lyyds/ᲈᲈᲀᲈ;

    .line 372
    .line 373
    if-gez p1, :cond_7

    .line 374
    .line 375
    move p1, v1

    .line 376
    :cond_7
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    invoke-direct {p2, p1, v0, v4}, Lyyds/ᲇᲁᲁᲁ;-><init>(III)V

    .line 381
    .line 382
    .line 383
    instance-of v0, v7, Ljava/lang/String;

    .line 384
    .line 385
    iget v2, p2, Lyyds/ᲇᲁᲁᲁ;->ᛲᛴᛳᛲ:I

    .line 386
    .line 387
    iget p2, p2, Lyyds/ᲇᲁᲁᲁ;->ᲇᲈᛵᛷ:I

    .line 388
    .line 389
    if-eqz v0, :cond_d

    .line 390
    .line 391
    if-lez v2, :cond_8

    .line 392
    .line 393
    if-le p1, p2, :cond_9

    .line 394
    .line 395
    :cond_8
    if-gez v2, :cond_4

    .line 396
    .line 397
    if-gt p2, p1, :cond_4

    .line 398
    .line 399
    :cond_9
    :goto_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    if-eqz v4, :cond_b

    .line 408
    .line 409
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    move-object v5, v4

    .line 414
    check-cast v5, Ljava/lang/String;

    .line 415
    .line 416
    move-object v6, v7

    .line 417
    check-cast v6, Ljava/lang/String;

    .line 418
    .line 419
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 420
    .line 421
    .line 422
    move-result v8

    .line 423
    invoke-virtual {v5, v1, v6, p1, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    if-eqz v5, :cond_a

    .line 428
    .line 429
    goto :goto_3

    .line 430
    :cond_b
    move-object v4, v3

    .line 431
    :goto_3
    check-cast v4, Ljava/lang/String;

    .line 432
    .line 433
    if-eqz v4, :cond_c

    .line 434
    .line 435
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    new-instance p2, Lkotlin/Pair;

    .line 440
    .line 441
    invoke-direct {p2, p0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    goto :goto_6

    .line 445
    :cond_c
    if-eq p1, p2, :cond_4

    .line 446
    .line 447
    add-int/2addr p1, v2

    .line 448
    goto :goto_2

    .line 449
    :cond_d
    if-lez v2, :cond_e

    .line 450
    .line 451
    if-le p1, p2, :cond_f

    .line 452
    .line 453
    :cond_e
    if-gez v2, :cond_4

    .line 454
    .line 455
    if-gt p2, p1, :cond_4

    .line 456
    .line 457
    :cond_f
    move v8, p1

    .line 458
    :goto_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-eqz v0, :cond_11

    .line 467
    .line 468
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    move-object v5, v0

    .line 473
    check-cast v5, Ljava/lang/String;

    .line 474
    .line 475
    const/4 v6, 0x0

    .line 476
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 477
    .line 478
    .line 479
    move-result v9

    .line 480
    const/4 v10, 0x0

    .line 481
    invoke-static/range {v5 .. v10}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛸᲁᲇ(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-eqz v1, :cond_10

    .line 486
    .line 487
    goto :goto_5

    .line 488
    :cond_11
    move-object v0, v3

    .line 489
    :goto_5
    check-cast v0, Ljava/lang/String;

    .line 490
    .line 491
    if-eqz v0, :cond_12

    .line 492
    .line 493
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    new-instance p2, Lkotlin/Pair;

    .line 498
    .line 499
    invoke-direct {p2, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    goto :goto_6

    .line 503
    :cond_12
    if-eq v8, p2, :cond_4

    .line 504
    .line 505
    add-int/2addr v8, v2

    .line 506
    goto :goto_4

    .line 507
    :goto_6
    if-eqz p2, :cond_13

    .line 508
    .line 509
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object p0

    .line 513
    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    check-cast p1, Ljava/lang/String;

    .line 518
    .line 519
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 520
    .line 521
    .line 522
    move-result p1

    .line 523
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    new-instance v3, Lkotlin/Pair;

    .line 528
    .line 529
    invoke-direct {v3, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    :cond_13
    return-object v3

    .line 533
    :pswitch_1
    check-cast p0, [C

    .line 534
    .line 535
    check-cast p1, Ljava/lang/CharSequence;

    .line 536
    .line 537
    check-cast p2, Ljava/lang/Integer;

    .line 538
    .line 539
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result p2

    .line 543
    invoke-static {p1, p0, p2, v1}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛲᛱᛱ(Ljava/lang/CharSequence;[CIZ)I

    .line 544
    .line 545
    .line 546
    move-result p0

    .line 547
    if-gez p0, :cond_14

    .line 548
    .line 549
    goto :goto_7

    .line 550
    :cond_14
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 555
    .line 556
    .line 557
    move-result-object p1

    .line 558
    new-instance v3, Lkotlin/Pair;

    .line 559
    .line 560
    invoke-direct {v3, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    :goto_7
    return-object v3

    .line 564
    :pswitch_2
    check-cast p0, Lyyds/ᛲᛲᲇᲈ;

    .line 565
    .line 566
    check-cast p1, Ljava/lang/Integer;

    .line 567
    .line 568
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 569
    .line 570
    .line 571
    move-result p1

    .line 572
    check-cast p2, Ljava/lang/Integer;

    .line 573
    .line 574
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 575
    .line 576
    .line 577
    move-result p2

    .line 578
    iget-object v0, p0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, Landroid/widget/Button;

    .line 581
    .line 582
    if-lez p1, :cond_15

    .line 583
    .line 584
    if-ne p1, p2, :cond_15

    .line 585
    .line 586
    const-wide v3, -0xb5b5e68a836eL

    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    :goto_8
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    goto :goto_9

    .line 596
    :cond_15
    const-wide v3, -0xb5bae68a836eL

    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    goto :goto_8

    .line 602
    :goto_9
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 603
    .line 604
    .line 605
    iget-object p0, p0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast p0, Landroid/widget/Button;

    .line 608
    .line 609
    const/16 v0, 0x29

    .line 610
    .line 611
    if-lez p1, :cond_16

    .line 612
    .line 613
    new-instance p2, Ljava/lang/StringBuilder;

    .line 614
    .line 615
    const-wide v3, -0xb5bde68a836eL

    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    invoke-static {p2, p1, v0}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    goto :goto_a

    .line 632
    :cond_16
    new-instance p1, Ljava/lang/StringBuilder;

    .line 633
    .line 634
    const-wide v3, -0xb5c4e68a836eL

    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    invoke-static {p1, p2, v0}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object p1

    .line 650
    :goto_a
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 651
    .line 652
    .line 653
    return-object v2

    .line 654
    :pswitch_3
    check-cast p0, Lyyds/ᛱᛷᛸᲈ;

    .line 655
    .line 656
    check-cast p1, Ljava/lang/String;

    .line 657
    .line 658
    check-cast p2, Lyyds/ᲀᛲᛳᲀ;

    .line 659
    .line 660
    const-wide v0, -0x2257ae68a836eL

    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    const-wide v0, -0x22587e68a836eL

    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast p0, Ljava/lang/String;

    .line 679
    .line 680
    const/16 p1, 0x3f

    .line 681
    .line 682
    invoke-static {p2, v3, v3, p0, p1}, Lyyds/ᲀᛲᛳᲀ;->ᛲᲈᲁ(Lyyds/ᲀᛲᛳᲀ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lyyds/ᲀᛲᛳᲀ;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    return-object p0

    .line 687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
