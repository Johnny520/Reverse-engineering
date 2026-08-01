.class public abstract Lxhss/ᛶᛸᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛵᛵᲈ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    sput-object v1, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 5
    .line 6
    const-string v1, "efbbbf"

    .line 7
    .line 8
    invoke-static {v1}, Lxhss/ᲈᲀᲀᛱ;->ᛳᲁᲇᛸ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "feff"

    .line 13
    .line 14
    invoke-static {v2}, Lxhss/ᲈᲀᲀᛱ;->ᛳᲁᲇᛸ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "fffe0000"

    .line 19
    .line 20
    invoke-static {v3}, Lxhss/ᲈᲀᲀᛱ;->ᛳᲁᲇᛸ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "fffe"

    .line 25
    .line 26
    invoke-static {v4}, Lxhss/ᲈᲀᲀᛱ;->ᛳᲁᲇᛸ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "0000feff"

    .line 31
    .line 32
    invoke-static {v5}, Lxhss/ᲈᲀᲀᛱ;->ᛳᲁᲇᛸ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    filled-new-array {v1, v2, v3, v4, v5}, [Lxhss/ᛳᛶᲈᲈ;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v6, Ljava/util/ArrayList;

    .line 41
    .line 42
    new-instance v2, Lxhss/ᛳᛲᛷᛷ;

    .line 43
    .line 44
    invoke-direct {v2, v0, v1}, Lxhss/ᛳᛲᛷᛷ;-><init>(Z[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x1

    .line 55
    if-le v2, v3, :cond_0

    .line 56
    .line 57
    invoke-static {v6}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    new-instance v9, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    move v4, v0

    .line 70
    :goto_0
    if-ge v4, v2, :cond_1

    .line 71
    .line 72
    const/4 v5, -0x1

    .line 73
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v4, v4, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    move v2, v0

    .line 84
    move v4, v2

    .line 85
    :goto_1
    const/4 v10, 0x5

    .line 86
    if-ge v2, v10, :cond_7

    .line 87
    .line 88
    aget-object v5, v1, v2

    .line 89
    .line 90
    add-int/lit8 v7, v4, 0x1

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    const-string v11, ")."

    .line 101
    .line 102
    if-ltz v8, :cond_6

    .line 103
    .line 104
    if-gt v8, v10, :cond_5

    .line 105
    .line 106
    add-int/lit8 v8, v8, -0x1

    .line 107
    .line 108
    move v10, v0

    .line 109
    :goto_2
    if-gt v10, v8, :cond_3

    .line 110
    .line 111
    add-int v11, v10, v8

    .line 112
    .line 113
    ushr-int/2addr v11, v3

    .line 114
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    check-cast v12, Ljava/lang/Comparable;

    .line 119
    .line 120
    invoke-static {v12, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛱᛱᛲᲇ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    if-gez v12, :cond_2

    .line 125
    .line 126
    add-int/lit8 v10, v11, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_2
    if-lez v12, :cond_4

    .line 130
    .line 131
    add-int/lit8 v8, v11, -0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 135
    .line 136
    neg-int v11, v10

    .line 137
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v9, v11, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    add-int/lit8 v2, v2, 0x1

    .line 145
    .line 146
    move v4, v7

    .line 147
    goto :goto_1

    .line 148
    :cond_5
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 149
    .line 150
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v2, "toIndex ("

    .line 153
    .line 154
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v2, ") is greater than size ("

    .line 161
    .line 162
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0

    .line 179
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 180
    .line 181
    new-instance v1, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string v2, "fromIndex (0) is greater than toIndex ("

    .line 184
    .line 185
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_7
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    check-cast v2, Lxhss/ᛳᛶᲈᲈ;

    .line 207
    .line 208
    invoke-virtual {v2}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-lez v2, :cond_d

    .line 213
    .line 214
    move v2, v0

    .line 215
    :goto_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-ge v2, v3, :cond_b

    .line 220
    .line 221
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, Lxhss/ᛳᛶᲈᲈ;

    .line 226
    .line 227
    add-int/lit8 v4, v2, 0x1

    .line 228
    .line 229
    move v5, v4

    .line 230
    :goto_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    if-ge v5, v7, :cond_a

    .line 235
    .line 236
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    check-cast v7, Lxhss/ᛳᛶᲈᲈ;

    .line 241
    .line 242
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    invoke-virtual {v7, v3, v8}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛶᛴᲀ(Lxhss/ᛳᛶᲈᲈ;I)Z

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    if-eqz v8, :cond_a

    .line 254
    .line 255
    invoke-virtual {v7}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    invoke-virtual {v3}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    if-eq v8, v11, :cond_9

    .line 264
    .line 265
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    check-cast v7, Ljava/lang/Number;

    .line 270
    .line 271
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    check-cast v8, Ljava/lang/Number;

    .line 280
    .line 281
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    if-le v7, v8, :cond_8

    .line 286
    .line 287
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    check-cast v7, Ljava/lang/Number;

    .line 295
    .line 296
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 297
    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    const-string v1, "duplicate option: "

    .line 306
    .line 307
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v1

    .line 327
    :cond_a
    move v2, v4

    .line 328
    goto :goto_3

    .line 329
    :cond_b
    new-instance v4, Lxhss/ᛴᛲᛴᛶ;

    .line 330
    .line 331
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 332
    .line 333
    .line 334
    const/4 v7, 0x0

    .line 335
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 336
    .line 337
    .line 338
    move-result v8

    .line 339
    const-wide/16 v2, 0x0

    .line 340
    .line 341
    const/4 v5, 0x0

    .line 342
    invoke-static/range {v2 .. v9}, Lxhss/ᲀᲈᛵᛸ;->ᛷᛵᛵᲈ(JLxhss/ᛴᛲᛴᛶ;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 343
    .line 344
    .line 345
    iget-wide v2, v4, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 346
    .line 347
    const-wide/16 v5, 0x4

    .line 348
    .line 349
    div-long/2addr v2, v5

    .line 350
    long-to-int v2, v2

    .line 351
    new-array v3, v2, [I

    .line 352
    .line 353
    :goto_5
    if-ge v0, v2, :cond_c

    .line 354
    .line 355
    invoke-virtual {v4}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛶᲈᛶ()I

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    aput v5, v3, v0

    .line 360
    .line 361
    add-int/lit8 v0, v0, 0x1

    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_c
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    check-cast v0, [Lxhss/ᛳᛶᲈᲈ;

    .line 369
    .line 370
    return-void

    .line 371
    :cond_d
    const-string v0, "the empty byte string is not a supported option"

    .line 372
    .line 373
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    return-void
.end method

.method public static final ᛱᛱᛲᲇ(IILjava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    :goto_0
    if-ge p0, p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p3, v0}, Lxhss/ᛲᛱᛲᲀ;->ᛱᛲᛸᲇ(Ljava/lang/CharSequence;C)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return p1
.end method

.method public static final ᛳᲁᲇᛸ(Ljava/lang/String;CII)I
    .locals 1

    .line 1
    :goto_0
    if-ge p2, p3, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return p2

    .line 10
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    return p3
.end method

.method public static final ᛷᛴᛷᛱ(Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/16 v3, 0x1f

    .line 13
    .line 14
    invoke-static {v2, v3}, Lxhss/ᛱᛱᛷᛸ;->ᲇᛴᲇᛵ(II)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-lez v3, :cond_1

    .line 19
    .line 20
    const/16 v3, 0x7f

    .line 21
    .line 22
    invoke-static {v2, v3}, Lxhss/ᛱᛱᛷᛸ;->ᲇᛴᲇᛵ(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ltz v2, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    return v1

    .line 33
    :cond_2
    const/4 p0, -0x1

    .line 34
    return p0
.end method

.method public static final ᛷᛵᛵᲈ(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    :catch_0
    return-void

    .line 5
    :catch_1
    move-exception p0

    .line 6
    throw p0
.end method

.method public static final ᛷᲁᲁ(Ljava/lang/String;I)I
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const-wide/32 v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    cmp-long v0, p0, v0

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    const p0, 0x7fffffff

    .line 15
    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v0, p0, v0

    .line 21
    .line 22
    if-gez v0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    long-to-int p0, p0

    .line 27
    return p0

    .line 28
    :catch_0
    :cond_2
    return p1
.end method

.method public static final ᛸᛲᲀᛵ(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "Authorization"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "Cookie"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "Proxy-Authorization"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "Set-Cookie"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public static final ᛸᛴᛶᛳ([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_2

    .line 10
    .line 11
    aget-object v4, p0, v3

    .line 12
    .line 13
    array-length v5, p1

    .line 14
    move v6, v2

    .line 15
    :goto_1
    if-ge v6, v5, :cond_1

    .line 16
    .line 17
    aget-object v7, p1, v6

    .line 18
    .line 19
    invoke-interface {p2, v4, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-nez v7, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    new-array p0, v2, [Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, [Ljava/lang/String;

    .line 42
    .line 43
    return-object p0
.end method

.method public static final ᛸᛷᲈᲈ(C)I
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x3a

    .line 6
    .line 7
    if-ge p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x67

    .line 16
    .line 17
    if-ge p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-gt v0, p0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    if-ge p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, -0x1

    .line 34
    return p0
.end method

.method public static final ᲀᲇᛳᲁ(Ljava/lang/String;II)I
    .locals 2

    .line 1
    add-int/lit8 p2, p2, -0x1

    .line 2
    .line 3
    if-gt p1, p2, :cond_1

    .line 4
    .line 5
    :goto_0
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x9

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    const/16 v1, 0xc

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0xd

    .line 22
    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    return p2

    .line 32
    :cond_0
    if-eq p2, p1, :cond_1

    .line 33
    .line 34
    add-int/lit8 p2, p2, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return p1
.end method

.method public static final ᲇᛴᲇᛵ([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    if-eqz p1, :cond_4

    .line 7
    .line 8
    array-length v0, p1

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_1
    array-length v0, p0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    if-ge v2, v0, :cond_4

    .line 15
    .line 16
    aget-object v3, p0, v2

    .line 17
    .line 18
    array-length v4, p1

    .line 19
    move v5, v1

    .line 20
    :goto_1
    if-ge v5, v4, :cond_3

    .line 21
    .line 22
    aget-object v6, p1, v5

    .line 23
    .line 24
    invoke-interface {p2, v3, v6}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_2

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    :goto_2
    return v1
.end method

.method public static final ᲇᛶᛴᲀ(Ljava/lang/String;II)I
    .locals 2

    .line 1
    :goto_0
    if-ge p1, p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x9

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0xc

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const/16 v1, 0xd

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    return p1

    .line 28
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return p2
.end method

.method public static final ᲈᛳᲀ(Lxhss/ᲁᛸᛵᛳ;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x10

    .line 8
    .line 9
    invoke-virtual {p0}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    and-int/lit16 v1, v1, 0xff

    .line 14
    .line 15
    shl-int/lit8 v1, v1, 0x8

    .line 16
    .line 17
    or-int/2addr v0, v1

    .line 18
    invoke-virtual {p0}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    and-int/lit16 p0, p0, 0xff

    .line 23
    .line 24
    or-int/2addr p0, v0

    .line 25
    return p0
.end method
