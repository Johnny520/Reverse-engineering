.class public final Lyyds/ᛳᲁᲀᛶ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Ljava/lang/String;

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᛱᛸᛳᛱ;

.field public final synthetic ᛶᛷᛲᲁ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lyyds/ᛱᛸᛳᛱ;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᛳᲁᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᲁᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛳᲁᲀᛶ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛸᛳᛱ;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lyyds/ᛱᛸᛳᛱ;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛳᲁᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 13
    iput-object p1, p0, Lyyds/ᛳᲁᲀᛶ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛸᛳᛱ;

    iput-object p2, p0, Lyyds/ᛳᲁᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lyyds/ᛳᲁᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛳᲁᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lyyds/ᛳᲁᲀᛶ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛸᛳᛱ;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Ljava/io/File;

    .line 15
    .line 16
    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_b

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v3, 0x1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    new-instance v4, Lyyds/ᲇᲀᲈᛱ;

    .line 52
    .line 53
    invoke-direct {v4, v1, v3}, Lyyds/ᲇᲀᲈᛱ;-><init>(Ljava/io/File;Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-nez p1, :cond_2

    .line 64
    .line 65
    new-array p1, v2, [Ljava/io/File;

    .line 66
    .line 67
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    array-length v4, p1

    .line 73
    move v5, v2

    .line 74
    :goto_0
    if-ge v5, v4, :cond_4

    .line 75
    .line 76
    aget-object v6, p1, v5

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_3

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/io/File;->canRead()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    iget-boolean v4, p0, Lyyds/ᛱᛸᛳᛱ;->ᛷᲇᛲᛱ:Z

    .line 97
    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    new-instance v4, Lyyds/ᛶᛳᛶᛵ;

    .line 101
    .line 102
    const/4 v5, 0x5

    .line 103
    invoke-direct {v4, v5}, Lyyds/ᛶᛳᛶᛵ;-><init>(I)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    new-instance v4, Lyyds/ᛶᛳᛶᛵ;

    .line 108
    .line 109
    const/4 v5, 0x3

    .line 110
    invoke-direct {v4, v5}, Lyyds/ᛶᛳᛶᛵ;-><init>(I)V

    .line 111
    .line 112
    .line 113
    :goto_1
    invoke-static {v1, v4}, Lyyds/ᛷᛷᛶᲇ;->ᛶᛴᛱᛲ(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_6

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Ljava/io/File;

    .line 132
    .line 133
    new-instance v5, Lyyds/ᲇᲀᲈᛱ;

    .line 134
    .line 135
    invoke-direct {v5, v4, v3}, Lyyds/ᲇᲀᲈᛱ;-><init>(Ljava/io/File;Z)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    array-length v3, p1

    .line 148
    move v4, v2

    .line 149
    :goto_3
    if-ge v4, v3, :cond_9

    .line 150
    .line 151
    aget-object v5, p1, v4

    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_8

    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    const-wide v7, -0xcb33e68a836eL

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 172
    .line 173
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    const-wide v7, -0x7484e68a836eL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    const-wide v7, -0x7495e68a836eL

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-static {v6, v7, v2}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-nez v7, :cond_7

    .line 199
    .line 200
    const-wide v7, -0x749ae68a836eL

    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-static {v6, v7, v2}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    if-nez v7, :cond_7

    .line 214
    .line 215
    const-wide v7, -0x749fe68a836eL

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-static {v6, v7, v2}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-nez v7, :cond_7

    .line 229
    .line 230
    const-wide v7, -0x74a4e68a836eL

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-static {v6, v7, v2}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    if-nez v7, :cond_7

    .line 244
    .line 245
    const-wide v7, -0x74a9e68a836eL

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    invoke-static {v6, v7, v2}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-nez v7, :cond_7

    .line 259
    .line 260
    const-wide v7, -0x74aee68a836eL

    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-static {v6, v7, v2}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    if-nez v7, :cond_7

    .line 274
    .line 275
    const-wide v7, -0x74b4e68a836eL

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-static {v6, v7, v2}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-nez v7, :cond_7

    .line 289
    .line 290
    const-wide v7, -0x74b9e68a836eL

    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    invoke-static {v6, v7, v2}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    if-eqz v6, :cond_8

    .line 304
    .line 305
    :cond_7
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 309
    .line 310
    goto/16 :goto_3

    .line 311
    .line 312
    :cond_9
    iget-boolean p0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛷᲇᛲᛱ:Z

    .line 313
    .line 314
    if-eqz p0, :cond_a

    .line 315
    .line 316
    new-instance p0, Lyyds/ᛶᛳᛶᛵ;

    .line 317
    .line 318
    const/4 p1, 0x6

    .line 319
    invoke-direct {p0, p1}, Lyyds/ᛶᛳᛶᛵ;-><init>(I)V

    .line 320
    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_a
    new-instance p0, Lyyds/ᛶᛳᛶᛵ;

    .line 324
    .line 325
    const/4 p1, 0x4

    .line 326
    invoke-direct {p0, p1}, Lyyds/ᛶᛳᛶᛵ;-><init>(I)V

    .line 327
    .line 328
    .line 329
    :goto_4
    invoke-static {v1, p0}, Lyyds/ᛷᛷᛶᲇ;->ᛶᛴᛱᛲ(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    if-eqz p1, :cond_c

    .line 342
    .line 343
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    check-cast p1, Ljava/io/File;

    .line 348
    .line 349
    new-instance v1, Lyyds/ᲇᲀᲈᛱ;

    .line 350
    .line 351
    invoke-direct {v1, p1, v2}, Lyyds/ᲇᲀᲈᛱ;-><init>(Ljava/io/File;Z)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_b
    :goto_6
    sget-object v0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 359
    .line 360
    :cond_c
    return-object v0

    .line 361
    :pswitch_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    new-instance p1, Lyyds/ᛷᲀᲇᲈ;

    .line 365
    .line 366
    invoke-direct {p1}, Lyyds/ᛷᲀᲇᲈ;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1, v1}, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    new-instance v0, Lyyds/ᲀᲁᲁ;

    .line 373
    .line 374
    invoke-direct {v0, p1}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 375
    .line 376
    .line 377
    sget-object p1, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 378
    .line 379
    invoke-static {}, Lyyds/ᛶᛵᛲᛲ;->ᛲᛴᛳᛲ()Lyyds/ᛶᛲᛷ;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    new-instance v1, Lyyds/ᲈᲀᛱᛷ;

    .line 387
    .line 388
    invoke-direct {v1, p1, v0}, Lyyds/ᲈᲀᛱᛷ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    iget-boolean v0, p1, Lyyds/ᛴᛴᛷᲁ;->ᛵᛶᛲᲀ:Z

    .line 396
    .line 397
    if-eqz v0, :cond_11

    .line 398
    .line 399
    sget-object v0, Lyyds/ᛴᛸᛴᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛸᛴᛲ;

    .line 400
    .line 401
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛱ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    const-wide v0, -0x2ad70e68a836eL

    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    new-instance v0, Ljava/io/File;

    .line 415
    .line 416
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    const-wide v3, -0x2ad78e68a836eL

    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 433
    .line 434
    .line 435
    move-result p0

    .line 436
    if-nez p0, :cond_d

    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 439
    .line 440
    .line 441
    :cond_d
    new-instance p0, Ljava/io/File;

    .line 442
    .line 443
    new-instance v1, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    const-wide v3, -0x73b1e68a836eL

    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 458
    .line 459
    .line 460
    move-result-wide v3

    .line 461
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    const-wide v3, -0x73b6e68a836eL

    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    iget-object p1, p1, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 484
    .line 485
    invoke-virtual {p1}, Lyyds/ᛲᛶᲀ;->ᛲᲈᲁ()Ljava/io/InputStream;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    .line 490
    .line 491
    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 492
    .line 493
    .line 494
    const/16 v1, 0x2000

    .line 495
    .line 496
    :try_start_1
    new-array v1, v1, [B

    .line 497
    .line 498
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    :goto_7
    if-ltz v3, :cond_e

    .line 503
    .line 504
    invoke-virtual {v0, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    goto :goto_7

    .line 512
    :cond_e
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 513
    .line 514
    .line 515
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 516
    .line 517
    .line 518
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 519
    .line 520
    .line 521
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 522
    .line 523
    .line 524
    move-result p1

    .line 525
    if-eqz p1, :cond_10

    .line 526
    .line 527
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 528
    .line 529
    .line 530
    move-result-wide v0

    .line 531
    const-wide/16 v2, 0x0

    .line 532
    .line 533
    cmp-long p1, v0, v2

    .line 534
    .line 535
    if-eqz p1, :cond_10

    .line 536
    .line 537
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 538
    .line 539
    new-instance v0, Ljava/lang/StringBuilder;

    .line 540
    .line 541
    const-wide v4, -0x73c4e68a836eL

    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    const-wide v4, -0x73cfe68a836eL

    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 573
    .line 574
    .line 575
    move-result-wide v4

    .line 576
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    const-wide v4, -0x73d6e68a836eL

    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {p1, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    :try_start_3
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    .line 599
    .line 600
    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 601
    .line 602
    .line 603
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    invoke-virtual {v0, v1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    const/16 v1, 0x9

    .line 611
    .line 612
    invoke-virtual {v0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    if-eqz v1, :cond_f

    .line 617
    .line 618
    invoke-static {v1}, Lyyds/ᛳᲇᲁᛳ;->ᛵᛶᛲᲀ(Ljava/lang/String;)Ljava/lang/Long;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    if-eqz v1, :cond_f

    .line 623
    .line 624
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 625
    .line 626
    .line 627
    move-result-wide v4

    .line 628
    goto :goto_8

    .line 629
    :catch_0
    move-exception p1

    .line 630
    goto :goto_9

    .line 631
    :cond_f
    move-wide v4, v2

    .line 632
    :goto_8
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 633
    .line 634
    .line 635
    new-instance v0, Ljava/lang/StringBuilder;

    .line 636
    .line 637
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 638
    .line 639
    .line 640
    const-wide v6, -0x73dde68a836eL

    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    const-wide v6, -0x73e4e68a836eL

    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {p1, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 672
    .line 673
    .line 674
    move-wide v2, v4

    .line 675
    goto :goto_a

    .line 676
    :goto_9
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 677
    .line 678
    const-wide v4, -0x73e7e68a836eL

    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    invoke-virtual {v0, v1, p1}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 688
    .line 689
    .line 690
    :goto_a
    new-instance p1, Lkotlin/Pair;

    .line 691
    .line 692
    new-instance v0, Ljava/lang/Long;

    .line 693
    .line 694
    invoke-direct {v0, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 695
    .line 696
    .line 697
    invoke-direct {p1, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    return-object p1

    .line 701
    :cond_10
    new-instance p0, Ljava/lang/Exception;

    .line 702
    .line 703
    const-wide v0, -0x73bbe68a836eL

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object p1

    .line 712
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    throw p0

    .line 716
    :catchall_0
    move-exception p0

    .line 717
    goto :goto_b

    .line 718
    :catchall_1
    move-exception p0

    .line 719
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 720
    :catchall_2
    move-exception v1

    .line 721
    :try_start_5
    invoke-static {v0, p0}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 722
    .line 723
    .line 724
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 725
    :goto_b
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 726
    :catchall_3
    move-exception v0

    .line 727
    invoke-static {p1, p0}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 728
    .line 729
    .line 730
    throw v0

    .line 731
    :cond_11
    new-instance p0, Ljava/lang/Exception;

    .line 732
    .line 733
    const-wide v0, -0x73aae68a836eL

    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    iget p1, p1, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 743
    .line 744
    new-instance v1, Ljava/lang/StringBuilder;

    .line 745
    .line 746
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object p1

    .line 756
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    throw p0

    .line 760
    nop

    .line 761
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 1

    .line 1
    iget p1, p0, Lyyds/ᛳᲁᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛳᲁᲀᛶ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛸᛳᛱ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛳᲁᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Lyyds/ᛳᲁᲀᛶ;

    .line 11
    .line 12
    invoke-direct {p1, p0, v0, p2}, Lyyds/ᛳᲁᲀᛶ;-><init>(Ljava/lang/String;Lyyds/ᛱᛸᛳᛱ;Lyyds/ᛲᛱᛶᛸ;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lyyds/ᛳᲁᲀᛶ;

    .line 17
    .line 18
    invoke-direct {p1, v0, p0, p2}, Lyyds/ᛳᲁᲀᛶ;-><init>(Lyyds/ᛱᛸᛳᛱ;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛳᲁᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 6
    .line 7
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᛳᲁᲀᛶ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛳᲁᲀᛶ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛳᲁᲀᛶ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛳᲁᲀᛶ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lyyds/ᛳᲁᲀᛶ;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lyyds/ᛳᲁᲀᛶ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
