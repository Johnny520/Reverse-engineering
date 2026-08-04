.class public final synthetic Lyyds/ᛸᛶᛲᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛱᛸᛳᛱ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛱᛸᛳᛱ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛸᛶᛲᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛸᛶᛲᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛸᛳᛱ;

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
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᛸᛶᛲᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    iget-object p0, p0, Lyyds/ᛸᛶᛲᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛸᛳᛱ;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast p2, Lyyds/ᲇᲀᲈᛱ;

    .line 17
    .line 18
    iget-boolean p1, p2, Lyyds/ᲇᲀᲈᛱ;->ᛵᛸᛸᛷ:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p2, Lyyds/ᲇᲀᲈᛱ;->ᛲᲈᲁ:Ljava/io/File;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Lyyds/ᛱᛸᛳᛱ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p2, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-wide v2, -0x1a3ce68a836eL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    sget-object p2, Lyyds/ᛷᛳᛲᛳ;->ᛱᛲᛵᛴ:Lyyds/ᛳᲀᛲ;

    .line 45
    .line 46
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 47
    .line 48
    const/16 v2, 0xc9

    .line 49
    .line 50
    aget-object v0, v0, v2

    .line 51
    .line 52
    invoke-virtual {p2, v0, p1}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛱᲈᲁ:Landroid/widget/EditText;

    .line 56
    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    const-wide p1, -0x747ae68a836eL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    iget-object p1, p0, Lyyds/ᛱᛸᛳᛱ;->ᛱᛳᛶᛳ:Lyyds/ᲁᲇᲈᲁ;

    .line 73
    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    iget-object p1, p1, Lyyds/ᲁᲇᲈᲁ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    :cond_1
    if-ltz v2, :cond_4

    .line 83
    .line 84
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛱᛳᛶᛳ:Lyyds/ᲁᲇᲈᲁ;

    .line 85
    .line 86
    if-eqz p0, :cond_4

    .line 87
    .line 88
    iget-object p1, p0, Lyyds/ᲁᲇᲈᲁ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 89
    .line 90
    iget p2, p0, Lyyds/ᲁᲇᲈᲁ;->ᛶᛷᛲᲁ:I

    .line 91
    .line 92
    iput v2, p0, Lyyds/ᲁᲇᲈᲁ;->ᛶᛷᛲᲁ:I

    .line 93
    .line 94
    if-ltz v2, :cond_2

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-ge v2, v0, :cond_2

    .line 101
    .line 102
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lyyds/ᲇᲀᲈᛱ;

    .line 107
    .line 108
    iget-boolean v0, v0, Lyyds/ᲇᲀᲈᛱ;->ᛵᛸᛸᛷ:Z

    .line 109
    .line 110
    if-nez v0, :cond_2

    .line 111
    .line 112
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Lyyds/ᲇᲀᲈᛱ;

    .line 117
    .line 118
    iget-object v0, v0, Lyyds/ᲇᲀᲈᛱ;->ᛲᲈᲁ:Ljava/io/File;

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    const/4 v0, 0x0

    .line 122
    :goto_0
    iput-object v0, p0, Lyyds/ᲁᲇᲈᲁ;->ᛱᲈᲁ:Ljava/io/File;

    .line 123
    .line 124
    if-ltz p2, :cond_3

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-ge p2, v0, :cond_3

    .line 131
    .line 132
    invoke-virtual {p0, p2}, Lyyds/ᛲᛵᲇᛳ;->ᲇᲈᛵᛷ(I)V

    .line 133
    .line 134
    .line 135
    :cond_3
    if-ltz v2, :cond_4

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-ge v2, p1, :cond_4

    .line 142
    .line 143
    invoke-virtual {p0, v2}, Lyyds/ᛲᛵᲇᛳ;->ᲇᲈᛵᛷ(I)V

    .line 144
    .line 145
    .line 146
    :cond_4
    :goto_1
    return-object v1

    .line 147
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    check-cast p2, Ljava/io/File;

    .line 154
    .line 155
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 156
    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-wide v4, -0x74bee68a836eL

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-wide v4, -0x74d3e68a836eL

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-virtual {v0, v3}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    iget v3, p0, Lyyds/ᛱᛸᛳᛱ;->ᛲᛳᛴᛸ:I

    .line 201
    .line 202
    const/4 v4, 0x1

    .line 203
    if-ne v3, p1, :cond_5

    .line 204
    .line 205
    iget-object v3, p0, Lyyds/ᛱᛸᛳᛱ;->ᛵᲀᛵᛸ:Landroid/media/MediaPlayer;

    .line 206
    .line 207
    if-eqz v3, :cond_5

    .line 208
    .line 209
    invoke-virtual {v3}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-ne v3, v4, :cond_5

    .line 214
    .line 215
    const-wide p1, -0x74dae68a836eL

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {v0, p1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛱ;->ᛱᲈᲁ()V

    .line 228
    .line 229
    .line 230
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛱᛳᛶᛳ:Lyyds/ᲁᲇᲈᲁ;

    .line 231
    .line 232
    if-eqz p0, :cond_6

    .line 233
    .line 234
    invoke-virtual {p0, v2}, Lyyds/ᲁᲇᲈᲁ;->ᛱᲈᲁ(I)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_5
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛱ;->ᛱᲈᲁ()V

    .line 239
    .line 240
    .line 241
    sget-object v2, Lyyds/ᲈᛳᛱᛲ;->ᛲᲈᲁ:Lyyds/ᲈᛳᛱᛲ;

    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-static {}, Lyyds/ᲈᛳᛱᛲ;->ᛱᛳᲇ()V

    .line 247
    .line 248
    .line 249
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    const-wide v5, -0x74dfe68a836eL

    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v0, v2}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    new-instance v0, Landroid/media/MediaPlayer;

    .line 281
    .line 282
    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    invoke-virtual {v0, p2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 296
    .line 297
    .line 298
    new-instance p2, Lyyds/ᲇᲈᲈᛳ;

    .line 299
    .line 300
    invoke-direct {p2, v4, p0}, Lyyds/ᲇᲈᲈᛳ;-><init>(ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, p2}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 304
    .line 305
    .line 306
    iput-object v0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛵᲀᛵᛸ:Landroid/media/MediaPlayer;

    .line 307
    .line 308
    iput p1, p0, Lyyds/ᛱᛸᛳᛱ;->ᛲᛳᛴᛸ:I

    .line 309
    .line 310
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛱᛳᛶᛳ:Lyyds/ᲁᲇᲈᲁ;

    .line 311
    .line 312
    if-eqz p0, :cond_6

    .line 313
    .line 314
    invoke-virtual {p0, p1}, Lyyds/ᲁᲇᲈᲁ;->ᛱᲈᲁ(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 315
    .line 316
    .line 317
    goto :goto_2

    .line 318
    :catch_0
    move-exception p0

    .line 319
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 320
    .line 321
    new-instance p2, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-wide v2, -0x74e6e68a836eL

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p2

    .line 346
    invoke-virtual {p1, p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 350
    .line 351
    .line 352
    :cond_6
    :goto_2
    return-object v1

    .line 353
    :pswitch_1
    check-cast p1, Lyyds/ᲇᛶᛸᛸ;

    .line 354
    .line 355
    check-cast p2, Landroid/app/AlertDialog;

    .line 356
    .line 357
    const-wide v3, -0x7549e68a836eL

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    const-wide v3, -0x7555e68a836eL

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    sget-object p2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 374
    .line 375
    new-instance v0, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    const-wide v3, -0x7562e68a836eL

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object v3, p1, Lyyds/ᲇᛶᛸᛸ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 390
    .line 391
    const-wide v4, -0x756be68a836eL

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    invoke-static {v0, v3, v4, v5}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 397
    .line 398
    .line 399
    iget-object v4, p1, Lyyds/ᲇᛶᛸᛸ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 400
    .line 401
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {p2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iget-object p2, p0, Lyyds/ᛱᛸᛳᛱ;->ᛲᛱᲁᛳ:Ljava/util/List;

    .line 412
    .line 413
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 414
    .line 415
    .line 416
    move-result-object p2

    .line 417
    const/4 v0, 0x0

    .line 418
    move v5, v0

    .line 419
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    if-eqz v6, :cond_8

    .line 424
    .line 425
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    check-cast v6, Lyyds/ᲁᛸᲇᛲ;

    .line 430
    .line 431
    iget-object v6, v6, Lyyds/ᲁᛸᲇᛲ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 432
    .line 433
    iget-object v7, p1, Lyyds/ᲇᛶᛸᛸ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 434
    .line 435
    invoke-static {v6, v7}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    if-eqz v6, :cond_7

    .line 440
    .line 441
    move v2, v5

    .line 442
    goto :goto_4

    .line 443
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 444
    .line 445
    goto :goto_3

    .line 446
    :cond_8
    :goto_4
    if-ltz v2, :cond_9

    .line 447
    .line 448
    iget-object p1, p0, Lyyds/ᛱᛸᛳᛱ;->ᛳᲁᲁᲇ:Landroid/widget/Spinner;

    .line 449
    .line 450
    invoke-virtual {p1, v2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 451
    .line 452
    .line 453
    :cond_9
    iget-object p1, p0, Lyyds/ᛱᛸᛳᛱ;->ᲇᛱᛲ:Landroid/widget/EditText;

    .line 454
    .line 455
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 456
    .line 457
    .line 458
    new-instance p1, Ljava/io/File;

    .line 459
    .line 460
    invoke-direct {p1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    sget-object p2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 464
    .line 465
    new-instance v2, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    const-wide v3, -0x7572e68a836eL

    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    const-wide v3, -0x757de68a836eL

    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    if-eqz v3, :cond_a

    .line 503
    .line 504
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 505
    .line 506
    .line 507
    move-result-wide v3

    .line 508
    goto :goto_5

    .line 509
    :cond_a
    const-wide/16 v3, 0x0

    .line 510
    .line 511
    :goto_5
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    const-wide v3, -0x7584e68a836eL

    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    invoke-virtual {p2, v2}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    if-eqz v2, :cond_b

    .line 538
    .line 539
    iput-object p1, p0, Lyyds/ᛱᛸᛳᛱ;->ᛱᛸᲁᲇ:Ljava/io/File;

    .line 540
    .line 541
    iget-object p2, p0, Lyyds/ᛱᛸᛳᛱ;->ᛵᛶᛲᲀ:Landroid/widget/LinearLayout;

    .line 542
    .line 543
    const/16 v2, 0x8

    .line 544
    .line 545
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 546
    .line 547
    .line 548
    iget-object p2, p0, Lyyds/ᛱᛸᛳᛱ;->ᲀᛲᛲᲇ:Landroid/widget/LinearLayout;

    .line 549
    .line 550
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 551
    .line 552
    .line 553
    iget-object p2, p0, Lyyds/ᛱᛸᛳᛱ;->ᛳᛸᛴᛶ:Landroid/widget/LinearLayout;

    .line 554
    .line 555
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {p0, p1}, Lyyds/ᛱᛸᛳᛱ;->ᛲᛴᛳᛲ(Ljava/io/File;)V

    .line 559
    .line 560
    .line 561
    goto :goto_6

    .line 562
    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    .line 563
    .line 564
    const-wide v2, -0x758be68a836eL

    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object p0

    .line 587
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 588
    .line 589
    .line 590
    new-instance p0, Ljava/lang/StringBuilder;

    .line 591
    .line 592
    const-wide v2, -0x7597e68a836eL

    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object p0

    .line 615
    invoke-virtual {p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    :goto_6
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
