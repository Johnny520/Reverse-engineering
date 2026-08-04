.class public final Lyyds/ᛵᛴᛴᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x6231de68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-wide v0, -0x621fee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method

.method public static ᛱᛳᲇ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;)Lkotlin/Pair;
    .locals 2

    .line 1
    iget-wide v0, p1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readByte()B

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit16 p1, p1, 0xff

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-virtual {p0, v0}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 14
    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/16 p1, 0x14

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 p1, 0x20

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 27
    .line 28
    .line 29
    :goto_0
    const/16 p1, 0x8

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x4

    .line 35
    invoke-virtual {p0, p1}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 39
    .line 40
    .line 41
    const/16 p1, 0x24

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    shr-int/lit8 p1, p1, 0x10

    .line 55
    .line 56
    shr-int/lit8 p0, p0, 0x10

    .line 57
    .line 58
    new-instance v0, Lkotlin/Pair;

    .line 59
    .line 60
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {v0, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method

.method public static ᛱᲈᲁ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;)Lyyds/ᛱᲀᛸᛷ;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 6
    .line 7
    iget-wide v4, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 8
    .line 9
    invoke-static {v0, v2, v3, v4, v5}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    move-object v5, v3

    .line 29
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;

    .line 30
    .line 31
    iget-object v5, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 32
    .line 33
    const-wide v6, -0x62287e68a836eL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v3, v4

    .line 50
    :goto_0
    check-cast v3, Lyyds/ᛴᛲᛲᛸ;

    .line 51
    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    goto/16 :goto_7

    .line 55
    .line 56
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    move-object v6, v5

    .line 76
    check-cast v6, Lyyds/ᛴᛲᛲᛸ;

    .line 77
    .line 78
    iget-object v6, v6, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 79
    .line 80
    const-wide v7, -0x6228ce68a836eL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_3

    .line 94
    .line 95
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :cond_5
    iget-wide v5, v3, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 108
    .line 109
    iget-wide v7, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 110
    .line 111
    invoke-static {v0, v5, v6, v7, v8}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 116
    .line 117
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 118
    .line 119
    .line 120
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 121
    .line 122
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const/4 v7, 0x0

    .line 130
    move v8, v7

    .line 131
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-eqz v9, :cond_10

    .line 136
    .line 137
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    add-int/lit8 v10, v8, 0x1

    .line 142
    .line 143
    if-ltz v8, :cond_f

    .line 144
    .line 145
    check-cast v9, Lyyds/ᛴᛲᛲᛸ;

    .line 146
    .line 147
    iget-object v8, v9, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 148
    .line 149
    const-wide v11, -0x62291e68a836eL

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    invoke-virtual {v8, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-eqz v8, :cond_e

    .line 163
    .line 164
    const-wide v11, -0x622e0e68a836eL

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    sget-object v11, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 174
    .line 175
    invoke-virtual {v8, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    const-wide v11, -0x622fbe68a836eL

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    iget-wide v13, v9, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 188
    .line 189
    array-length v11, v8

    .line 190
    int-to-long v11, v11

    .line 191
    const-wide/16 v15, 0x5

    .line 192
    .line 193
    add-long/2addr v15, v11

    .line 194
    iget-wide v11, v9, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 195
    .line 196
    move-wide/from16 v17, v11

    .line 197
    .line 198
    invoke-static/range {v13 .. v18}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-nez v11, :cond_6

    .line 203
    .line 204
    sget-object v8, Lyyds/ᛶᛷᛷᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛷᛷᛷ;

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_6
    iget-wide v11, v9, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 208
    .line 209
    invoke-virtual {v0, v11, v12}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    const/4 v12, 0x3

    .line 217
    invoke-virtual {v0, v12}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 218
    .line 219
    .line 220
    if-eqz v11, :cond_7

    .line 221
    .line 222
    sget-object v8, Lyyds/ᛶᛷᛷᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛷᛷᛷ;

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_7
    array-length v11, v8

    .line 226
    move v12, v7

    .line 227
    :goto_3
    if-ge v12, v11, :cond_9

    .line 228
    .line 229
    aget-byte v13, v8, v12

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    and-int/lit16 v13, v13, 0xff

    .line 236
    .line 237
    if-eq v14, v13, :cond_8

    .line 238
    .line 239
    sget-object v8, Lyyds/ᛶᛷᛷᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛷᛷᛷ;

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_9
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-eqz v8, :cond_a

    .line 250
    .line 251
    sget-object v8, Lyyds/ᛶᛷᛷᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛷᛷᛷ;

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_a
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 255
    .line 256
    .line 257
    move-result-wide v11

    .line 258
    iget-wide v8, v9, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 259
    .line 260
    cmp-long v8, v11, v8

    .line 261
    .line 262
    if-nez v8, :cond_b

    .line 263
    .line 264
    sget-object v8, Lyyds/ᛶᛷᛷᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛶᛷᛷᛷ;

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_b
    sget-object v8, Lyyds/ᛶᛷᛷᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛶᛷᛷᛷ;

    .line 268
    .line 269
    :goto_4
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    if-eqz v8, :cond_e

    .line 274
    .line 275
    const/4 v9, 0x1

    .line 276
    if-eq v8, v9, :cond_d

    .line 277
    .line 278
    const/4 v9, 0x2

    .line 279
    if-ne v8, v9, :cond_c

    .line 280
    .line 281
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    invoke-interface {v3, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    invoke-interface {v5, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_c
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 297
    .line 298
    .line 299
    return-object v4

    .line 300
    :cond_d
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    invoke-interface {v3, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    :cond_e
    :goto_5
    move v8, v10

    .line 308
    goto/16 :goto_2

    .line 309
    .line 310
    :cond_f
    invoke-static {}, Lyyds/ᲈᛸᲁᛶ;->ᲀᛲᛲᲇ()V

    .line 311
    .line 312
    .line 313
    throw v4

    .line 314
    :cond_10
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    if-eqz v6, :cond_11

    .line 319
    .line 320
    new-instance v0, Lyyds/ᛱᲀᛸᛷ;

    .line 321
    .line 322
    sget-object v1, Lyyds/ᛶᲁᛲᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲁᛲᛶ;

    .line 323
    .line 324
    invoke-direct {v0, v1, v1}, Lyyds/ᛱᲀᛸᛷ;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    .line 325
    .line 326
    .line 327
    return-object v0

    .line 328
    :cond_11
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 329
    .line 330
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 331
    .line 332
    .line 333
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 334
    .line 335
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    :cond_12
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v8

    .line 346
    if-eqz v8, :cond_15

    .line 347
    .line 348
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    check-cast v8, Lyyds/ᛴᛲᛲᛸ;

    .line 353
    .line 354
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    invoke-static {v0, v8, v9, v3}, Lyyds/ᛵᛴᛴᛳ;->ᛲᛲᲈᲈ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;ILjava/util/LinkedHashSet;)Ljava/util/LinkedHashSet;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    if-nez v9, :cond_13

    .line 363
    .line 364
    goto :goto_7

    .line 365
    :cond_13
    invoke-virtual {v6, v9}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 366
    .line 367
    .line 368
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 369
    .line 370
    .line 371
    move-result v9

    .line 372
    if-nez v9, :cond_12

    .line 373
    .line 374
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    invoke-static {v0, v8, v9, v5}, Lyyds/ᛵᛴᛴᛳ;->ᛲᛲᲈᲈ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;ILjava/util/LinkedHashSet;)Ljava/util/LinkedHashSet;

    .line 379
    .line 380
    .line 381
    move-result-object v8

    .line 382
    if-nez v8, :cond_14

    .line 383
    .line 384
    :goto_7
    return-object v4

    .line 385
    :cond_14
    invoke-virtual {v7, v8}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_6

    .line 389
    :cond_15
    new-instance v0, Lyyds/ᛱᲀᛸᛷ;

    .line 390
    .line 391
    invoke-direct {v0, v6, v7}, Lyyds/ᛱᲀᛸᛷ;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    .line 392
    .line 393
    .line 394
    return-object v0
.end method

.method public static ᛲᛲᲈᲈ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;ILjava/util/LinkedHashSet;)Ljava/util/LinkedHashSet;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 6
    .line 7
    const-wide/16 v4, 0x8

    .line 8
    .line 9
    iget-wide v6, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 10
    .line 11
    invoke-static/range {v2 .. v7}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    iget-wide v2, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 20
    .line 21
    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    shl-int/lit8 v3, v3, 0x10

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    shl-int/lit8 v4, v4, 0x8

    .line 39
    .line 40
    or-int/2addr v3, v4

    .line 41
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    or-int/2addr v3, v4

    .line 46
    const/4 v4, 0x2

    .line 47
    const/4 v5, 0x1

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    if-eq v2, v5, :cond_1

    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_1
    const/4 v2, 0x4

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v2, v4

    .line 57
    :goto_0
    and-int/2addr v3, v5

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    move v3, v4

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move v3, v5

    .line 63
    :goto_1
    if-ne v3, v4, :cond_4

    .line 64
    .line 65
    const/16 v6, 0x7fff

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/16 v6, 0x7f

    .line 69
    .line 70
    :goto_2
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    int-to-long v7, v7

    .line 75
    const-wide v9, 0xffffffffL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr v7, v9

    .line 81
    const-wide/32 v9, 0x186a0

    .line 82
    .line 83
    .line 84
    cmp-long v9, v7, v9

    .line 85
    .line 86
    if-lez v9, :cond_5

    .line 87
    .line 88
    goto/16 :goto_6

    .line 89
    .line 90
    :cond_5
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 91
    .line 92
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 93
    .line 94
    .line 95
    long-to-int v7, v7

    .line 96
    const/4 v8, 0x0

    .line 97
    move v10, v8

    .line 98
    :goto_3
    if-ge v10, v7, :cond_e

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 101
    .line 102
    .line 103
    move-result-wide v11

    .line 104
    int-to-long v13, v2

    .line 105
    const-wide/16 v15, 0x1

    .line 106
    .line 107
    add-long/2addr v13, v15

    .line 108
    move/from16 v17, v6

    .line 109
    .line 110
    iget-wide v5, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 111
    .line 112
    move-wide v15, v5

    .line 113
    invoke-static/range {v11 .. v16}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_6

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_6
    invoke-static {v0, v2}, Lyyds/ᛵᛴᛴᛳ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    if-eqz v5, :cond_d

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    int-to-long v11, v6

    .line 131
    int-to-long v13, v3

    .line 132
    mul-long v20, v11, v13

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 135
    .line 136
    .line 137
    move-result-wide v18

    .line 138
    iget-wide v11, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 139
    .line 140
    move-wide/from16 v22, v11

    .line 141
    .line 142
    invoke-static/range {v18 .. v23}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-nez v11, :cond_7

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_7
    move v11, v8

    .line 150
    move v12, v11

    .line 151
    :goto_4
    if-ge v11, v6, :cond_b

    .line 152
    .line 153
    if-ne v3, v4, :cond_8

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    goto :goto_5

    .line 160
    :cond_8
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    :goto_5
    and-int v13, v13, v17

    .line 165
    .line 166
    move/from16 v14, p2

    .line 167
    .line 168
    if-le v13, v14, :cond_9

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_9
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    move-object/from16 v15, p3

    .line 176
    .line 177
    invoke-interface {v15, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    if-eqz v13, :cond_a

    .line 182
    .line 183
    const/4 v12, 0x1

    .line 184
    :cond_a
    add-int/lit8 v11, v11, 0x1

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_b
    move/from16 v14, p2

    .line 188
    .line 189
    move-object/from16 v15, p3

    .line 190
    .line 191
    if-eqz v12, :cond_c

    .line 192
    .line 193
    invoke-virtual {v9, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    :cond_c
    add-int/lit8 v10, v10, 0x1

    .line 197
    .line 198
    move/from16 v6, v17

    .line 199
    .line 200
    const/4 v5, 0x1

    .line 201
    goto :goto_3

    .line 202
    :cond_d
    :goto_6
    const/4 v0, 0x0

    .line 203
    return-object v0

    .line 204
    :cond_e
    return-object v9
.end method

.method public static ᛲᛳᛶᲁ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;I)Ljava/util/LinkedHashSet;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 6
    .line 7
    const-wide/16 v4, 0x4

    .line 8
    .line 9
    iget-wide v6, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 10
    .line 11
    invoke-static/range {v2 .. v7}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v5, 0x3

    .line 27
    invoke-virtual {v0, v5}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    if-eq v4, v5, :cond_1

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_1
    const/4 v4, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 v4, 0x2

    .line 40
    :goto_0
    const-wide/16 v6, 0x4

    .line 41
    .line 42
    add-long/2addr v2, v6

    .line 43
    iget-wide v6, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 44
    .line 45
    invoke-static {v0, v2, v3, v6, v7}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_b

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Lyyds/ᛴᛲᛲᛸ;

    .line 69
    .line 70
    iget-object v6, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 71
    .line 72
    const-wide v7, -0x6227de68a836eL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_a

    .line 86
    .line 87
    iget-wide v7, v3, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 88
    .line 89
    int-to-long v13, v4

    .line 90
    const-wide/16 v9, 0x2

    .line 91
    .line 92
    add-long/2addr v9, v13

    .line 93
    iget-wide v11, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 94
    .line 95
    invoke-static/range {v7 .. v12}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-nez v6, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    iget-wide v6, v3, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 103
    .line 104
    invoke-virtual {v0, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v4}, Lyyds/ᛵᛴᛴᛳ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    if-eqz v6, :cond_9

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    const v8, 0x186a0

    .line 118
    .line 119
    .line 120
    if-le v7, v8, :cond_5

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    int-to-long v8, v7

    .line 124
    mul-long v17, v8, v13

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 127
    .line 128
    .line 129
    move-result-wide v15

    .line 130
    iget-wide v8, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 131
    .line 132
    move-wide/from16 v19, v8

    .line 133
    .line 134
    invoke-static/range {v15 .. v20}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-nez v3, :cond_6

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    const/4 v3, 0x0

    .line 142
    move v8, v3

    .line 143
    :goto_2
    if-ge v3, v7, :cond_8

    .line 144
    .line 145
    invoke-static {v0, v4}, Lyyds/ᛵᛴᛴᛳ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    if-eqz v9, :cond_9

    .line 150
    .line 151
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    move/from16 v10, p2

    .line 156
    .line 157
    if-ne v9, v10, :cond_7

    .line 158
    .line 159
    move v8, v5

    .line 160
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_8
    move/from16 v10, p2

    .line 164
    .line 165
    if-eqz v8, :cond_3

    .line 166
    .line 167
    invoke-virtual {v2, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_9
    :goto_3
    const/4 v0, 0x0

    .line 172
    return-object v0

    .line 173
    :cond_a
    move/from16 v10, p2

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_b
    return-object v2
.end method

.method public static ᛲᲈᲁ(JJJ)Z
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-ltz v2, :cond_0

    .line 6
    .line 7
    cmp-long v0, p2, v0

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    cmp-long v0, p0, p4

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    sub-long/2addr p4, p0

    .line 16
    cmp-long p0, p2, p4

    .line 17
    .line 18
    if-gtz p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    cmp-long v3, p1, v1

    .line 6
    .line 7
    if-ltz v3, :cond_6

    .line 8
    .line 9
    cmp-long v3, p3, p1

    .line 10
    .line 11
    if-ltz v3, :cond_6

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    cmp-long v3, p3, v3

    .line 18
    .line 19
    if-lez v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    move-wide/from16 v4, p1

    .line 29
    .line 30
    :goto_0
    const-wide/16 v6, 0x8

    .line 31
    .line 32
    move-wide/from16 v8, p3

    .line 33
    .line 34
    invoke-static/range {v4 .. v9}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_5

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const v7, 0x186a0

    .line 45
    .line 46
    .line 47
    if-lt v6, v7, :cond_1

    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    invoke-virtual {v0, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 52
    .line 53
    .line 54
    const/16 v10, 0x8

    .line 55
    .line 56
    new-array v6, v10, [B

    .line 57
    .line 58
    invoke-virtual {v0, v6}, Ljava/io/RandomAccessFile;->read([B)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-ne v7, v10, :cond_5

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x4

    .line 66
    invoke-static {v6, v7, v8}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    sget-object v11, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 71
    .line 72
    invoke-virtual {v7, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    int-to-long v12, v7

    .line 81
    const-wide v14, 0xffffffffL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    and-long/2addr v12, v14

    .line 87
    new-instance v14, Ljava/lang/String;

    .line 88
    .line 89
    sget-object v7, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 90
    .line 91
    invoke-direct {v14, v6, v8, v8, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 92
    .line 93
    .line 94
    const-wide/16 v6, 0x1

    .line 95
    .line 96
    cmp-long v6, v12, v6

    .line 97
    .line 98
    if-nez v6, :cond_2

    .line 99
    .line 100
    const-wide/16 v6, 0x10

    .line 101
    .line 102
    move-wide/from16 v8, p3

    .line 103
    .line 104
    invoke-static/range {v4 .. v9}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-eqz v6, :cond_5

    .line 109
    .line 110
    new-array v6, v10, [B

    .line 111
    .line 112
    invoke-virtual {v0, v6}, Ljava/io/RandomAccessFile;->read([B)I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-ne v7, v10, :cond_5

    .line 117
    .line 118
    invoke-static {v6}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v6, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->getLong()J

    .line 127
    .line 128
    .line 129
    move-result-wide v12

    .line 130
    const-wide/16 v6, 0x10

    .line 131
    .line 132
    :goto_1
    move-wide v8, v12

    .line 133
    goto :goto_2

    .line 134
    :cond_2
    cmp-long v6, v12, v1

    .line 135
    .line 136
    const-wide/16 v7, 0x8

    .line 137
    .line 138
    if-nez v6, :cond_3

    .line 139
    .line 140
    sub-long v12, p3, v4

    .line 141
    .line 142
    :cond_3
    move-wide v6, v7

    .line 143
    goto :goto_1

    .line 144
    :goto_2
    cmp-long v10, v8, v6

    .line 145
    .line 146
    if-ltz v10, :cond_5

    .line 147
    .line 148
    sub-long v10, p3, v4

    .line 149
    .line 150
    cmp-long v10, v8, v10

    .line 151
    .line 152
    if-lez v10, :cond_4

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_4
    move-wide v10, v6

    .line 156
    move-wide v6, v4

    .line 157
    new-instance v4, Lyyds/ᛴᛲᛲᛸ;

    .line 158
    .line 159
    add-long/2addr v10, v6

    .line 160
    add-long v12, v6, v8

    .line 161
    .line 162
    move-object v5, v14

    .line 163
    invoke-direct/range {v4 .. v13}, Lyyds/ᛴᛲᛲᛸ;-><init>(Ljava/lang/String;JJJJ)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-wide v4, v12

    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_5
    :goto_3
    return-object v3

    .line 173
    :cond_6
    :goto_4
    sget-object v0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 174
    .line 175
    return-object v0
.end method

.method public static ᛵᛸᛸᛷ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;II)Ljava/lang/Boolean;
    .locals 21

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
    move/from16 v3, p3

    .line 8
    .line 9
    iget-wide v4, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 10
    .line 11
    const-wide/16 v6, 0x4

    .line 12
    .line 13
    iget-wide v8, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 14
    .line 15
    invoke-static/range {v4 .. v9}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-nez v6, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/4 v7, 0x3

    .line 31
    invoke-virtual {v0, v7}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 32
    .line 33
    .line 34
    if-eqz v6, :cond_2

    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    if-eq v6, v7, :cond_1

    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_1
    const/4 v6, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 v6, 0x2

    .line 44
    :goto_0
    const-wide/16 v7, 0x4

    .line 45
    .line 46
    add-long/2addr v4, v7

    .line 47
    iget-wide v7, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 48
    .line 49
    invoke-static {v0, v4, v5, v7, v8}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_b

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Lyyds/ᛴᛲᛲᛸ;

    .line 68
    .line 69
    iget-object v5, v4, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 70
    .line 71
    const-wide v7, -0x62282e68a836eL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    iget-wide v7, v4, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 87
    .line 88
    int-to-long v13, v6

    .line 89
    const-wide/16 v9, 0x2

    .line 90
    .line 91
    add-long/2addr v9, v13

    .line 92
    iget-wide v11, v4, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 93
    .line 94
    invoke-static/range {v7 .. v12}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    iget-wide v7, v4, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 102
    .line 103
    invoke-virtual {v0, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v6}, Lyyds/ᛵᛴᛴᛳ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    if-eqz v5, :cond_a

    .line 111
    .line 112
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    const v8, 0x186a0

    .line 121
    .line 122
    .line 123
    if-le v7, v8, :cond_5

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    int-to-long v8, v7

    .line 127
    mul-long v17, v8, v13

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 130
    .line 131
    .line 132
    move-result-wide v15

    .line 133
    iget-wide v8, v4, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 134
    .line 135
    move-wide/from16 v19, v8

    .line 136
    .line 137
    invoke-static/range {v15 .. v20}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-nez v4, :cond_6

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    const/4 v4, 0x0

    .line 145
    :goto_1
    if-ge v4, v7, :cond_3

    .line 146
    .line 147
    invoke-static {v0, v6}, Lyyds/ᛵᛴᛴᛳ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    if-eqz v8, :cond_a

    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-ne v5, v2, :cond_7

    .line 158
    .line 159
    if-eq v8, v3, :cond_8

    .line 160
    .line 161
    :cond_7
    if-ne v5, v3, :cond_9

    .line 162
    .line 163
    if-ne v8, v2, :cond_9

    .line 164
    .line 165
    :cond_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 166
    .line 167
    return-object v0

    .line 168
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_a
    :goto_2
    const/4 v0, 0x0

    .line 172
    return-object v0

    .line 173
    :cond_b
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 174
    .line 175
    return-object v0
.end method

.method public static ᛶᛳᛶᛵ(Ljava/io/RandomAccessFile;IJ)Ljava/lang/Long;
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 v2, 0x1

    .line 11
    if-gt v2, p1, :cond_4

    .line 12
    .line 13
    const/16 v2, 0x9

    .line 14
    .line 15
    if-ge p1, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    int-to-long v5, p1

    .line 22
    move-wide v7, p2

    .line 23
    invoke-static/range {v3 .. v8}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 p2, 0x0

    .line 31
    :goto_0
    if-ge p2, p1, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    int-to-long v2, p3

    .line 38
    const-wide v4, 0x7fffffffffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    sub-long/2addr v4, v2

    .line 44
    const-wide/16 v6, 0x100

    .line 45
    .line 46
    div-long/2addr v4, v6

    .line 47
    cmp-long p3, v0, v4

    .line 48
    .line 49
    if-lez p3, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    mul-long/2addr v0, v6

    .line 53
    add-long/2addr v0, v2

    .line 54
    add-int/lit8 p2, p2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 63
    return-object p0
.end method

.method public static ᛷᛲᲈᛱ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;ILyyds/ᛴᛲᛲᛸ;)Ljava/util/ArrayList;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v5, 0x4

    .line 14
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    const/4 v7, 0x0

    .line 19
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    iget-wide v9, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 24
    .line 25
    iget-wide v13, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 26
    .line 27
    const-wide/16 v11, 0x6

    .line 28
    .line 29
    invoke-static/range {v9 .. v14}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    if-nez v9, :cond_1

    .line 34
    .line 35
    :cond_0
    :goto_0
    const/16 v17, 0x0

    .line 36
    .line 37
    goto/16 :goto_10

    .line 38
    .line 39
    :cond_1
    iget-wide v11, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 40
    .line 41
    invoke-virtual {v0, v11, v12}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    shl-int/lit8 v11, v11, 0x10

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    shl-int/lit8 v3, v12, 0x8

    .line 59
    .line 60
    or-int/2addr v3, v11

    .line 61
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    or-int/2addr v3, v11

    .line 66
    if-ltz v9, :cond_0

    .line 67
    .line 68
    const/4 v11, 0x3

    .line 69
    if-ge v9, v11, :cond_0

    .line 70
    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    ushr-int/lit8 v12, v3, 0x4

    .line 79
    .line 80
    and-int/lit8 v3, v3, 0xf

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    ushr-int/lit8 v5, v15, 0x4

    .line 87
    .line 88
    and-int/lit8 v15, v15, 0xf

    .line 89
    .line 90
    move/from16 v16, v7

    .line 91
    .line 92
    const/4 v7, 0x2

    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    const/4 v10, 0x1

    .line 96
    if-eq v9, v10, :cond_4

    .line 97
    .line 98
    if-eq v9, v7, :cond_4

    .line 99
    .line 100
    if-eqz v15, :cond_3

    .line 101
    .line 102
    goto/16 :goto_10

    .line 103
    .line 104
    :cond_3
    move/from16 v15, v16

    .line 105
    .line 106
    :cond_4
    filled-new-array {v8, v6, v4}, [Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v18

    .line 110
    invoke-static/range {v18 .. v18}, Lyyds/ᛱᛱᲁᲈ;->ᛲᛶᛱᲈ([Ljava/lang/Object;)Ljava/util/Set;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-interface {v11, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    if-eqz v10, :cond_21

    .line 123
    .line 124
    filled-new-array {v6, v4}, [Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-static {v10}, Lyyds/ᛱᛱᲁᲈ;->ᛲᛶᛱᲈ([Ljava/lang/Object;)Ljava/util/Set;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-eqz v10, :cond_21

    .line 141
    .line 142
    filled-new-array {v8, v6, v4}, [Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    invoke-static {v10}, Lyyds/ᛱᛱᲁᲈ;->ᛲᛶᛱᲈ([Ljava/lang/Object;)Ljava/util/Set;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-eqz v10, :cond_21

    .line 159
    .line 160
    filled-new-array {v8, v6, v4}, [Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-static {v4}, Lyyds/ᛱᛱᲁᲈ;->ᛲᛶᛱᲈ([Ljava/lang/Object;)Ljava/util/Set;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-interface {v4, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-nez v4, :cond_5

    .line 177
    .line 178
    goto/16 :goto_10

    .line 179
    .line 180
    :cond_5
    if-ge v9, v7, :cond_7

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 183
    .line 184
    .line 185
    move-result-wide v20

    .line 186
    const-wide/16 v22, 0x2

    .line 187
    .line 188
    iget-wide v10, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 189
    .line 190
    move-wide/from16 v24, v10

    .line 191
    .line 192
    invoke-static/range {v20 .. v25}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-nez v4, :cond_6

    .line 197
    .line 198
    goto/16 :goto_10

    .line 199
    .line 200
    :cond_6
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    int-to-long v10, v4

    .line 205
    goto :goto_1

    .line 206
    :cond_7
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 207
    .line 208
    .line 209
    move-result-wide v20

    .line 210
    const-wide/16 v22, 0x4

    .line 211
    .line 212
    iget-wide v10, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 213
    .line 214
    move-wide/from16 v24, v10

    .line 215
    .line 216
    invoke-static/range {v20 .. v25}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-nez v4, :cond_8

    .line 221
    .line 222
    goto/16 :goto_10

    .line 223
    .line 224
    :cond_8
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    int-to-long v10, v4

    .line 229
    const-wide v20, 0xffffffffL

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    and-long v10, v10, v20

    .line 235
    .line 236
    :goto_1
    const-wide/32 v20, 0x186a0

    .line 237
    .line 238
    .line 239
    cmp-long v4, v10, v20

    .line 240
    .line 241
    if-lez v4, :cond_9

    .line 242
    .line 243
    goto/16 :goto_10

    .line 244
    .line 245
    :cond_9
    long-to-int v4, v10

    .line 246
    move/from16 v6, v16

    .line 247
    .line 248
    :goto_2
    if-ge v6, v4, :cond_21

    .line 249
    .line 250
    if-ge v9, v7, :cond_a

    .line 251
    .line 252
    move v8, v7

    .line 253
    goto :goto_3

    .line 254
    :cond_a
    const/4 v8, 0x4

    .line 255
    :goto_3
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 256
    .line 257
    .line 258
    move-result-wide v20

    .line 259
    int-to-long v10, v8

    .line 260
    move/from16 v27, v8

    .line 261
    .line 262
    iget-wide v7, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 263
    .line 264
    move-wide/from16 v24, v7

    .line 265
    .line 266
    move-wide/from16 v22, v10

    .line 267
    .line 268
    invoke-static/range {v20 .. v25}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    if-nez v7, :cond_b

    .line 273
    .line 274
    goto/16 :goto_10

    .line 275
    .line 276
    :cond_b
    move/from16 v7, v27

    .line 277
    .line 278
    invoke-static {v0, v7}, Lyyds/ᛵᛴᛴᛳ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    if-eqz v7, :cond_21

    .line 283
    .line 284
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    const/4 v8, 0x1

    .line 289
    if-eq v9, v8, :cond_c

    .line 290
    .line 291
    const/4 v8, 0x2

    .line 292
    if-eq v9, v8, :cond_c

    .line 293
    .line 294
    move/from16 v8, v16

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_c
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 298
    .line 299
    .line 300
    move-result-wide v20

    .line 301
    const-wide/16 v22, 0x2

    .line 302
    .line 303
    iget-wide v10, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 304
    .line 305
    move-wide/from16 v24, v10

    .line 306
    .line 307
    invoke-static/range {v20 .. v25}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 308
    .line 309
    .line 310
    move-result v8

    .line 311
    if-nez v8, :cond_d

    .line 312
    .line 313
    goto/16 :goto_10

    .line 314
    .line 315
    :cond_d
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 316
    .line 317
    .line 318
    move-result v8

    .line 319
    const v10, 0xfff0

    .line 320
    .line 321
    .line 322
    and-int/2addr v10, v8

    .line 323
    if-eqz v10, :cond_e

    .line 324
    .line 325
    goto/16 :goto_10

    .line 326
    .line 327
    :cond_e
    and-int/lit8 v8, v8, 0xf

    .line 328
    .line 329
    :goto_4
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 330
    .line 331
    .line 332
    move-result-wide v20

    .line 333
    const-wide/16 v22, 0x2

    .line 334
    .line 335
    iget-wide v10, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 336
    .line 337
    move-wide/from16 v24, v10

    .line 338
    .line 339
    invoke-static/range {v20 .. v25}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    if-nez v10, :cond_f

    .line 344
    .line 345
    goto/16 :goto_10

    .line 346
    .line 347
    :cond_f
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    invoke-static {v0, v5, v13, v14}, Lyyds/ᛵᛴᛴᛳ;->ᛶᛳᛶᛵ(Ljava/io/RandomAccessFile;IJ)Ljava/lang/Long;

    .line 352
    .line 353
    .line 354
    move-result-object v11

    .line 355
    if-eqz v11, :cond_21

    .line 356
    .line 357
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 358
    .line 359
    .line 360
    move-result-wide v20

    .line 361
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 362
    .line 363
    .line 364
    move-result-wide v27

    .line 365
    const-wide/16 v29, 0x2

    .line 366
    .line 367
    move/from16 v22, v4

    .line 368
    .line 369
    move v11, v5

    .line 370
    iget-wide v4, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 371
    .line 372
    move-wide/from16 v31, v4

    .line 373
    .line 374
    invoke-static/range {v27 .. v32}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-nez v4, :cond_10

    .line 379
    .line 380
    goto/16 :goto_10

    .line 381
    .line 382
    :cond_10
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    const v5, 0x186a0

    .line 387
    .line 388
    .line 389
    if-le v4, v5, :cond_11

    .line 390
    .line 391
    goto/16 :goto_10

    .line 392
    .line 393
    :cond_11
    move/from16 v5, p2

    .line 394
    .line 395
    if-ne v7, v5, :cond_12

    .line 396
    .line 397
    const/4 v7, 0x1

    .line 398
    goto :goto_5

    .line 399
    :cond_12
    move/from16 v7, v16

    .line 400
    .line 401
    :goto_5
    if-eqz v7, :cond_13

    .line 402
    .line 403
    if-eqz v10, :cond_13

    .line 404
    .line 405
    goto/16 :goto_10

    .line 406
    .line 407
    :cond_13
    if-eqz v7, :cond_14

    .line 408
    .line 409
    new-instance v10, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 412
    .line 413
    .line 414
    goto :goto_6

    .line 415
    :cond_14
    move-object/from16 v10, v17

    .line 416
    .line 417
    :goto_6
    move/from16 v1, v16

    .line 418
    .line 419
    :goto_7
    if-ge v1, v4, :cond_1f

    .line 420
    .line 421
    if-lez v15, :cond_15

    .line 422
    .line 423
    invoke-static {v0, v15, v13, v14}, Lyyds/ᛵᛴᛴᛳ;->ᛶᛳᛶᛵ(Ljava/io/RandomAccessFile;IJ)Ljava/lang/Long;

    .line 424
    .line 425
    .line 426
    move-result-object v23

    .line 427
    if-nez v23, :cond_15

    .line 428
    .line 429
    goto/16 :goto_10

    .line 430
    .line 431
    :cond_15
    invoke-static {v0, v12, v13, v14}, Lyyds/ᛵᛴᛴᛳ;->ᛶᛳᛶᛵ(Ljava/io/RandomAccessFile;IJ)Ljava/lang/Long;

    .line 432
    .line 433
    .line 434
    move-result-object v23

    .line 435
    if-eqz v23, :cond_21

    .line 436
    .line 437
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Long;->longValue()J

    .line 438
    .line 439
    .line 440
    move-result-wide v23

    .line 441
    invoke-static {v0, v3, v13, v14}, Lyyds/ᛵᛴᛴᛳ;->ᛶᛳᛶᛵ(Ljava/io/RandomAccessFile;IJ)Ljava/lang/Long;

    .line 442
    .line 443
    .line 444
    move-result-object v25

    .line 445
    if-eqz v25, :cond_21

    .line 446
    .line 447
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Long;->longValue()J

    .line 448
    .line 449
    .line 450
    move-result-wide v29

    .line 451
    if-eqz v7, :cond_1e

    .line 452
    .line 453
    const-wide/16 v27, 0x0

    .line 454
    .line 455
    cmp-long v25, v29, v27

    .line 456
    .line 457
    if-gtz v25, :cond_16

    .line 458
    .line 459
    goto/16 :goto_10

    .line 460
    .line 461
    :cond_16
    if-eqz v8, :cond_18

    .line 462
    .line 463
    const/4 v0, 0x1

    .line 464
    if-eq v8, v0, :cond_17

    .line 465
    .line 466
    goto/16 :goto_10

    .line 467
    .line 468
    :cond_17
    if-eqz v2, :cond_21

    .line 469
    .line 470
    move/from16 v18, v0

    .line 471
    .line 472
    move/from16 v25, v1

    .line 473
    .line 474
    iget-wide v0, v2, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 475
    .line 476
    move-wide/from16 v31, v0

    .line 477
    .line 478
    :goto_8
    const/4 v0, 0x3

    .line 479
    goto :goto_9

    .line 480
    :cond_18
    move/from16 v25, v1

    .line 481
    .line 482
    const/16 v18, 0x1

    .line 483
    .line 484
    move-wide/from16 v31, v27

    .line 485
    .line 486
    goto :goto_8

    .line 487
    :goto_9
    new-array v1, v0, [J

    .line 488
    .line 489
    aput-wide v31, v1, v16

    .line 490
    .line 491
    aput-wide v20, v1, v18

    .line 492
    .line 493
    const/16 v26, 0x2

    .line 494
    .line 495
    aput-wide v23, v1, v26

    .line 496
    .line 497
    move-object/from16 v19, v1

    .line 498
    .line 499
    move/from16 v1, v16

    .line 500
    .line 501
    move-wide/from16 v23, v27

    .line 502
    .line 503
    :goto_a
    if-ge v1, v0, :cond_1b

    .line 504
    .line 505
    aget-wide v31, v19, v1

    .line 506
    .line 507
    cmp-long v33, v31, v27

    .line 508
    .line 509
    if-ltz v33, :cond_1a

    .line 510
    .line 511
    const-wide v33, 0x7fffffffffffffffL

    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    sub-long v33, v33, v31

    .line 517
    .line 518
    cmp-long v33, v23, v33

    .line 519
    .line 520
    if-lez v33, :cond_19

    .line 521
    .line 522
    goto :goto_b

    .line 523
    :cond_19
    add-long v23, v23, v31

    .line 524
    .line 525
    add-int/lit8 v1, v1, 0x1

    .line 526
    .line 527
    goto :goto_a

    .line 528
    :cond_1a
    :goto_b
    move-object/from16 v1, v17

    .line 529
    .line 530
    goto :goto_c

    .line 531
    :cond_1b
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    :goto_c
    if-eqz v1, :cond_21

    .line 536
    .line 537
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 538
    .line 539
    .line 540
    move-result-wide v27

    .line 541
    const/4 v1, 0x1

    .line 542
    if-ne v8, v1, :cond_1c

    .line 543
    .line 544
    iget-wide v0, v2, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 545
    .line 546
    :goto_d
    move-wide/from16 v31, v0

    .line 547
    .line 548
    goto :goto_e

    .line 549
    :cond_1c
    invoke-virtual/range {p0 .. p0}, Ljava/io/RandomAccessFile;->length()J

    .line 550
    .line 551
    .line 552
    move-result-wide v0

    .line 553
    goto :goto_d

    .line 554
    :goto_e
    invoke-static/range {v27 .. v32}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    move/from16 v23, v0

    .line 559
    .line 560
    move/from16 v24, v3

    .line 561
    .line 562
    move-wide/from16 v2, v27

    .line 563
    .line 564
    move-wide/from16 v0, v29

    .line 565
    .line 566
    if-nez v23, :cond_1d

    .line 567
    .line 568
    goto :goto_10

    .line 569
    :cond_1d
    move/from16 v23, v4

    .line 570
    .line 571
    new-instance v4, Lyyds/ᛸᛵᛳᛳ;

    .line 572
    .line 573
    invoke-direct {v4, v2, v3, v0, v1}, Lyyds/ᛸᛵᛳᛳ;-><init>(JJ)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    goto :goto_f

    .line 580
    :cond_1e
    move/from16 v25, v1

    .line 581
    .line 582
    move/from16 v24, v3

    .line 583
    .line 584
    move/from16 v23, v4

    .line 585
    .line 586
    const/16 v26, 0x2

    .line 587
    .line 588
    :goto_f
    add-int/lit8 v1, v25, 0x1

    .line 589
    .line 590
    move-object/from16 v0, p0

    .line 591
    .line 592
    move-object/from16 v2, p3

    .line 593
    .line 594
    move/from16 v4, v23

    .line 595
    .line 596
    move/from16 v3, v24

    .line 597
    .line 598
    goto/16 :goto_7

    .line 599
    .line 600
    :cond_1f
    move/from16 v24, v3

    .line 601
    .line 602
    const/16 v26, 0x2

    .line 603
    .line 604
    if-eqz v7, :cond_20

    .line 605
    .line 606
    return-object v10

    .line 607
    :cond_20
    add-int/lit8 v6, v6, 0x1

    .line 608
    .line 609
    move-object/from16 v0, p0

    .line 610
    .line 611
    move-object/from16 v1, p1

    .line 612
    .line 613
    move-object/from16 v2, p3

    .line 614
    .line 615
    move v5, v11

    .line 616
    move/from16 v4, v22

    .line 617
    .line 618
    move/from16 v3, v24

    .line 619
    .line 620
    move/from16 v7, v26

    .line 621
    .line 622
    goto/16 :goto_2

    .line 623
    .line 624
    :cond_21
    :goto_10
    return-object v17
.end method

.method public static ᛷᛵᲇᲀ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;)Lyyds/ᲈᲇᲁᲈ;
    .locals 7

    .line 1
    iget-wide v0, p1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 2
    .line 3
    const-wide/16 v2, 0x4

    .line 4
    .line 5
    iget-wide v4, p1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 6
    .line 7
    invoke-static/range {v0 .. v5}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v0, p1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x3

    .line 24
    invoke-virtual {p0, v1}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    if-eq v0, v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v0, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 v0, 0x2

    .line 36
    :goto_0
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    int-to-long v3, v0

    .line 41
    iget-wide v5, p1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 42
    .line 43
    invoke-static/range {v1 .. v6}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-static {p0, v0}, Lyyds/ᛵᛴᛴᛳ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    new-instance p1, Lyyds/ᲈᲇᲁᲈ;

    .line 61
    .line 62
    invoke-direct {p1, p0, v1, v2, v0}, Lyyds/ᲈᲇᲁᲈ;-><init>(IJI)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 67
    return-object p0
.end method

.method public static ᛷᲈᲈᲁ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;II)Lyyds/ᲇᛴᲇᛸ;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 6
    .line 7
    iget-wide v4, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 8
    .line 9
    invoke-static {v0, v2, v3, v4, v5}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    move-object v5, v3

    .line 28
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;

    .line 29
    .line 30
    iget-object v5, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 31
    .line 32
    const-wide v6, -0x62296e68a836eL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v3, 0x0

    .line 49
    :goto_0
    check-cast v3, Lyyds/ᛴᛲᛲᛸ;

    .line 50
    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    :goto_1
    const/16 p1, 0x0

    .line 54
    .line 55
    goto/16 :goto_1e

    .line 56
    .line 57
    :cond_2
    iget-wide v5, v3, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 58
    .line 59
    iget-wide v2, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 60
    .line 61
    invoke-static {v0, v5, v6, v2, v3}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 73
    .line 74
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v5, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_5

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    move-object v7, v6

    .line 97
    check-cast v7, Lyyds/ᛴᛲᛲᛸ;

    .line 98
    .line 99
    iget-object v7, v7, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 100
    .line 101
    const-wide v8, -0x6229be68a836eL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_4

    .line 115
    .line 116
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_8

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    check-cast v6, Lyyds/ᛴᛲᛲᛸ;

    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    move/from16 v8, p2

    .line 148
    .line 149
    invoke-static {v0, v6, v7, v8}, Lyyds/ᛵᛴᛴᛳ;->ᲇᲇᲇᛱ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;II)Ljava/util/LinkedHashSet;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    if-nez v6, :cond_7

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_7
    invoke-virtual {v3, v6}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_8
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 161
    .line 162
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_a

    .line 174
    .line 175
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    check-cast v6, Lyyds/ᛴᛲᛲᛸ;

    .line 180
    .line 181
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    move/from16 v8, p3

    .line 186
    .line 187
    invoke-static {v0, v6, v7, v8}, Lyyds/ᛵᛴᛴᛳ;->ᲇᲇᲇᛱ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;II)Ljava/util/LinkedHashSet;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    if-nez v6, :cond_9

    .line 192
    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :cond_9
    invoke-virtual {v1, v6}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_a
    new-instance v5, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    :cond_b
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    const/4 v8, 0x1

    .line 213
    if-eqz v7, :cond_d

    .line 214
    .line 215
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    check-cast v7, Ljava/lang/Number;

    .line 220
    .line 221
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    sub-int/2addr v7, v8

    .line 226
    invoke-static {v7, v2}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛶᛷᲀ(ILjava/util/List;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    check-cast v7, Lyyds/ᛴᛲᛲᛸ;

    .line 231
    .line 232
    if-eqz v7, :cond_c

    .line 233
    .line 234
    iget-object v8, v7, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 235
    .line 236
    const-wide v9, -0x622a0e68a836eL

    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-eqz v8, :cond_c

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_c
    const/4 v7, 0x0

    .line 253
    :goto_6
    if-eqz v7, :cond_b

    .line 254
    .line 255
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-eq v6, v8, :cond_e

    .line 264
    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :cond_e
    invoke-static {v5}, Lyyds/ᛷᛷᛶᲇ;->ᛲᲀᛵᛷ(Ljava/util/List;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;

    .line 272
    .line 273
    iget-wide v9, v5, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 274
    .line 275
    const-wide/16 v11, 0x17

    .line 276
    .line 277
    iget-wide v13, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 278
    .line 279
    invoke-static/range {v9 .. v14}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    const/4 v7, 0x0

    .line 284
    if-nez v6, :cond_f

    .line 285
    .line 286
    :goto_7
    move/from16 p2, v8

    .line 287
    .line 288
    const/16 p1, 0x0

    .line 289
    .line 290
    const/4 v6, 0x0

    .line 291
    goto/16 :goto_10

    .line 292
    .line 293
    :cond_f
    iget-wide v10, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 294
    .line 295
    iget-wide v5, v5, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 296
    .line 297
    sub-long/2addr v10, v5

    .line 298
    const-wide/16 v12, 0x17

    .line 299
    .line 300
    cmp-long v12, v12, v10

    .line 301
    .line 302
    if-gtz v12, :cond_11

    .line 303
    .line 304
    const-wide/32 v12, 0x40001

    .line 305
    .line 306
    .line 307
    cmp-long v12, v10, v12

    .line 308
    .line 309
    if-gez v12, :cond_11

    .line 310
    .line 311
    long-to-int v10, v10

    .line 312
    new-array v11, v10, [B

    .line 313
    .line 314
    invoke-virtual {v0, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v11}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 318
    .line 319
    .line 320
    aget-byte v5, v11, v7

    .line 321
    .line 322
    if-eq v5, v8, :cond_10

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_10
    const/16 v5, 0x10

    .line 326
    .line 327
    aget-byte v5, v11, v5

    .line 328
    .line 329
    const/4 v6, 0x3

    .line 330
    and-int/2addr v5, v6

    .line 331
    const/16 v12, 0x11

    .line 332
    .line 333
    aget-byte v12, v11, v12

    .line 334
    .line 335
    and-int/lit8 v12, v12, 0x7

    .line 336
    .line 337
    const/16 v13, 0x12

    .line 338
    .line 339
    aget-byte v13, v11, v13

    .line 340
    .line 341
    and-int/lit8 v13, v13, 0x7

    .line 342
    .line 343
    if-ne v5, v8, :cond_11

    .line 344
    .line 345
    if-nez v12, :cond_11

    .line 346
    .line 347
    if-eqz v13, :cond_12

    .line 348
    .line 349
    :cond_11
    move/from16 p2, v8

    .line 350
    .line 351
    const/16 p1, 0x0

    .line 352
    .line 353
    goto :goto_9

    .line 354
    :cond_12
    const/16 v5, 0x15

    .line 355
    .line 356
    aget-byte v5, v11, v5

    .line 357
    .line 358
    and-int/2addr v5, v6

    .line 359
    add-int/2addr v5, v8

    .line 360
    const/16 v12, 0x16

    .line 361
    .line 362
    aget-byte v12, v11, v12

    .line 363
    .line 364
    and-int/lit16 v12, v12, 0xff

    .line 365
    .line 366
    const/16 v13, 0x20

    .line 367
    .line 368
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v14

    .line 372
    new-instance v15, Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 375
    .line 376
    .line 377
    const/16 p1, 0x0

    .line 378
    .line 379
    new-instance v4, Lkotlin/Pair;

    .line 380
    .line 381
    invoke-direct {v4, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    const/16 v14, 0x21

    .line 385
    .line 386
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 387
    .line 388
    .line 389
    move-result-object v14

    .line 390
    new-instance v15, Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 393
    .line 394
    .line 395
    move/from16 p2, v6

    .line 396
    .line 397
    new-instance v6, Lkotlin/Pair;

    .line 398
    .line 399
    invoke-direct {v6, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    const/16 v14, 0x22

    .line 403
    .line 404
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v14

    .line 408
    new-instance v15, Ljava/util/ArrayList;

    .line 409
    .line 410
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 411
    .line 412
    .line 413
    new-instance v7, Lkotlin/Pair;

    .line 414
    .line 415
    invoke-direct {v7, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    filled-new-array {v4, v6, v7}, [Lkotlin/Pair;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 423
    .line 424
    invoke-static/range {p2 .. p2}, Lyyds/ᲁᲈᛶᛴ;->ᛳᛸᛴᛶ(I)I

    .line 425
    .line 426
    .line 427
    move-result v7

    .line 428
    invoke-direct {v6, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 429
    .line 430
    .line 431
    invoke-static {v6, v4}, Lyyds/ᲁᲈᛶᛴ;->ᛶᛸᲀᲁ(Ljava/util/LinkedHashMap;[Lkotlin/Pair;)V

    .line 432
    .line 433
    .line 434
    const/16 v4, 0x17

    .line 435
    .line 436
    move/from16 p2, v8

    .line 437
    .line 438
    const/4 v7, 0x0

    .line 439
    const/4 v14, 0x0

    .line 440
    const/4 v15, 0x0

    .line 441
    :goto_8
    if-ge v7, v12, :cond_1d

    .line 442
    .line 443
    add-int/lit8 v9, v10, -0x3

    .line 444
    .line 445
    if-le v4, v9, :cond_14

    .line 446
    .line 447
    :cond_13
    :goto_9
    move-object/from16 v6, p1

    .line 448
    .line 449
    goto/16 :goto_10

    .line 450
    .line 451
    :cond_14
    aget-byte v9, v11, v4

    .line 452
    .line 453
    and-int/lit8 v16, v9, 0x40

    .line 454
    .line 455
    if-eqz v16, :cond_15

    .line 456
    .line 457
    :goto_a
    goto :goto_9

    .line 458
    :cond_15
    and-int/lit8 v9, v9, 0x3f

    .line 459
    .line 460
    add-int/lit8 v16, v4, 0x1

    .line 461
    .line 462
    aget-byte v8, v11, v16

    .line 463
    .line 464
    and-int/lit16 v8, v8, 0xff

    .line 465
    .line 466
    shl-int/lit8 v8, v8, 0x8

    .line 467
    .line 468
    add-int/lit8 v16, v4, 0x2

    .line 469
    .line 470
    aget-byte v13, v11, v16

    .line 471
    .line 472
    and-int/lit16 v13, v13, 0xff

    .line 473
    .line 474
    or-int/2addr v8, v13

    .line 475
    add-int/lit8 v4, v4, 0x3

    .line 476
    .line 477
    rsub-int v13, v8, 0x100

    .line 478
    .line 479
    if-le v14, v13, :cond_16

    .line 480
    .line 481
    goto :goto_a

    .line 482
    :cond_16
    add-int/2addr v14, v8

    .line 483
    const/4 v13, 0x0

    .line 484
    :goto_b
    if-ge v13, v8, :cond_1c

    .line 485
    .line 486
    move/from16 v16, v5

    .line 487
    .line 488
    add-int/lit8 v5, v10, -0x2

    .line 489
    .line 490
    if-le v4, v5, :cond_17

    .line 491
    .line 492
    goto :goto_9

    .line 493
    :cond_17
    aget-byte v5, v11, v4

    .line 494
    .line 495
    and-int/lit16 v5, v5, 0xff

    .line 496
    .line 497
    shl-int/lit8 v5, v5, 0x8

    .line 498
    .line 499
    add-int/lit8 v19, v4, 0x1

    .line 500
    .line 501
    move/from16 v20, v4

    .line 502
    .line 503
    aget-byte v4, v11, v19

    .line 504
    .line 505
    and-int/lit16 v4, v4, 0xff

    .line 506
    .line 507
    or-int/2addr v4, v5

    .line 508
    add-int/lit8 v5, v20, 0x2

    .line 509
    .line 510
    move/from16 v19, v7

    .line 511
    .line 512
    const/4 v7, 0x2

    .line 513
    if-lt v4, v7, :cond_13

    .line 514
    .line 515
    sub-int v7, v10, v4

    .line 516
    .line 517
    if-le v5, v7, :cond_18

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_18
    aget-byte v7, v11, v5

    .line 521
    .line 522
    ushr-int/lit8 v7, v7, 0x1

    .line 523
    .line 524
    and-int/lit8 v7, v7, 0x3f

    .line 525
    .line 526
    if-eq v7, v9, :cond_19

    .line 527
    .line 528
    goto :goto_a

    .line 529
    :cond_19
    const/16 v7, 0x20

    .line 530
    .line 531
    if-gt v7, v9, :cond_1b

    .line 532
    .line 533
    const/16 v7, 0x23

    .line 534
    .line 535
    if-ge v9, v7, :cond_1b

    .line 536
    .line 537
    const v7, 0x3fffc

    .line 538
    .line 539
    .line 540
    sub-int/2addr v7, v4

    .line 541
    if-le v15, v7, :cond_1a

    .line 542
    .line 543
    goto :goto_9

    .line 544
    :cond_1a
    add-int/lit8 v7, v4, 0x4

    .line 545
    .line 546
    add-int/2addr v7, v15

    .line 547
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 548
    .line 549
    .line 550
    move-result-object v15

    .line 551
    invoke-static {v6, v15}, Lyyds/ᲁᲈᛶᛴ;->ᲀᛲᛲᲇ(Ljava/util/LinkedHashMap;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v15

    .line 555
    check-cast v15, Ljava/util/List;

    .line 556
    .line 557
    move/from16 v21, v4

    .line 558
    .line 559
    add-int v4, v5, v21

    .line 560
    .line 561
    invoke-static {v11, v5, v4}, Lyyds/ᲀᲀᛷᛸ;->ᲈᲀᛲᲀ([BII)[B

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-interface {v15, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move v15, v7

    .line 569
    goto :goto_c

    .line 570
    :cond_1b
    move/from16 v21, v4

    .line 571
    .line 572
    :goto_c
    add-int v4, v5, v21

    .line 573
    .line 574
    add-int/lit8 v13, v13, 0x1

    .line 575
    .line 576
    move/from16 v5, v16

    .line 577
    .line 578
    move/from16 v7, v19

    .line 579
    .line 580
    goto :goto_b

    .line 581
    :cond_1c
    move/from16 v20, v4

    .line 582
    .line 583
    move/from16 v16, v5

    .line 584
    .line 585
    move/from16 v19, v7

    .line 586
    .line 587
    add-int/lit8 v7, v19, 0x1

    .line 588
    .line 589
    const/16 v13, 0x20

    .line 590
    .line 591
    goto/16 :goto_8

    .line 592
    .line 593
    :cond_1d
    move/from16 v16, v5

    .line 594
    .line 595
    if-ne v4, v10, :cond_13

    .line 596
    .line 597
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 598
    .line 599
    .line 600
    move-result-object v4

    .line 601
    if-eqz v4, :cond_1e

    .line 602
    .line 603
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 604
    .line 605
    .line 606
    move-result v5

    .line 607
    if-eqz v5, :cond_1e

    .line 608
    .line 609
    goto :goto_d

    .line 610
    :cond_1e
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 611
    .line 612
    .line 613
    move-result-object v4

    .line 614
    :cond_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 615
    .line 616
    .line 617
    move-result v5

    .line 618
    if-eqz v5, :cond_20

    .line 619
    .line 620
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v5

    .line 624
    check-cast v5, Ljava/util/List;

    .line 625
    .line 626
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 627
    .line 628
    .line 629
    move-result v5

    .line 630
    if-eqz v5, :cond_1f

    .line 631
    .line 632
    goto/16 :goto_9

    .line 633
    .line 634
    :cond_20
    :goto_d
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 635
    .line 636
    invoke-direct {v4, v15}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 637
    .line 638
    .line 639
    const/16 v7, 0x23

    .line 640
    .line 641
    const/16 v13, 0x20

    .line 642
    .line 643
    :goto_e
    if-ge v13, v7, :cond_22

    .line 644
    .line 645
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 646
    .line 647
    .line 648
    move-result-object v5

    .line 649
    invoke-static {v6, v5}, Lyyds/ᲁᲈᛶᛴ;->ᲀᛲᛲᲇ(Ljava/util/LinkedHashMap;Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v5

    .line 653
    check-cast v5, Ljava/util/List;

    .line 654
    .line 655
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 656
    .line 657
    .line 658
    move-result-object v5

    .line 659
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 660
    .line 661
    .line 662
    move-result v8

    .line 663
    if-eqz v8, :cond_21

    .line 664
    .line 665
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v8

    .line 669
    check-cast v8, [B

    .line 670
    .line 671
    const/4 v9, 0x4

    .line 672
    new-array v10, v9, [B

    .line 673
    .line 674
    fill-array-data v10, :array_0

    .line 675
    .line 676
    .line 677
    invoke-virtual {v4, v10}, Ljava/io/OutputStream;->write([B)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v4, v8}, Ljava/io/OutputStream;->write([B)V

    .line 681
    .line 682
    .line 683
    goto :goto_f

    .line 684
    :cond_21
    add-int/lit8 v13, v13, 0x1

    .line 685
    .line 686
    goto :goto_e

    .line 687
    :cond_22
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 692
    .line 693
    .line 694
    move-result-object v4

    .line 695
    new-instance v6, Lkotlin/Pair;

    .line 696
    .line 697
    invoke-direct {v6, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    :goto_10
    if-nez v6, :cond_23

    .line 701
    .line 702
    goto/16 :goto_1e

    .line 703
    .line 704
    :cond_23
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 705
    .line 706
    .line 707
    move-result v4

    .line 708
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 709
    .line 710
    .line 711
    move-result v5

    .line 712
    add-int/2addr v5, v4

    .line 713
    invoke-static {v5}, Lyyds/ᲁᲈᛶᛴ;->ᛳᛸᛴᛶ(I)I

    .line 714
    .line 715
    .line 716
    move-result v4

    .line 717
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 718
    .line 719
    invoke-direct {v5, v4}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v5, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 723
    .line 724
    .line 725
    invoke-static {v1, v5}, Lyyds/ᛶᲁᛶᲁ;->ᛶᛸᲀᲁ(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 726
    .line 727
    .line 728
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 729
    .line 730
    .line 731
    move-result v1

    .line 732
    if-eqz v1, :cond_24

    .line 733
    .line 734
    goto :goto_12

    .line 735
    :cond_24
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    :cond_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 740
    .line 741
    .line 742
    move-result v4

    .line 743
    if-eqz v4, :cond_27

    .line 744
    .line 745
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v4

    .line 749
    check-cast v4, Ljava/lang/Number;

    .line 750
    .line 751
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 752
    .line 753
    .line 754
    move-result v4

    .line 755
    const-wide v7, -0x622a5e68a836eL

    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v5

    .line 764
    const-wide v7, -0x622aae68a836eL

    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v7

    .line 773
    const-wide v8, -0x622afe68a836eL

    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v8

    .line 782
    filled-new-array {v5, v7, v8}, [Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    invoke-static {v5}, Lyyds/ᛱᛱᲁᲈ;->ᛲᛶᛱᲈ([Ljava/lang/Object;)Ljava/util/Set;

    .line 787
    .line 788
    .line 789
    move-result-object v5

    .line 790
    add-int/lit8 v4, v4, -0x1

    .line 791
    .line 792
    invoke-static {v4, v2}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛶᛷᲀ(ILjava/util/List;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v4

    .line 796
    check-cast v4, Lyyds/ᛴᛲᛲᛸ;

    .line 797
    .line 798
    if-eqz v4, :cond_26

    .line 799
    .line 800
    iget-object v4, v4, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 801
    .line 802
    goto :goto_11

    .line 803
    :cond_26
    move-object/from16 v4, p1

    .line 804
    .line 805
    :goto_11
    invoke-static {v5, v4}, Lyyds/ᛷᛷᛶᲇ;->ᲈᲀᛲᲀ(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-result v4

    .line 809
    if-eqz v4, :cond_25

    .line 810
    .line 811
    goto/16 :goto_1e

    .line 812
    .line 813
    :cond_27
    :goto_12
    new-instance v1, Ljava/util/ArrayList;

    .line 814
    .line 815
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 816
    .line 817
    .line 818
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 819
    .line 820
    .line 821
    move-result-object v4

    .line 822
    :cond_28
    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 823
    .line 824
    .line 825
    move-result v5

    .line 826
    if-eqz v5, :cond_2a

    .line 827
    .line 828
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v5

    .line 832
    check-cast v5, Ljava/lang/Number;

    .line 833
    .line 834
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 835
    .line 836
    .line 837
    move-result v5

    .line 838
    add-int/lit8 v5, v5, -0x1

    .line 839
    .line 840
    invoke-static {v5, v2}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛶᛷᲀ(ILjava/util/List;)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v5

    .line 844
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;

    .line 845
    .line 846
    if-eqz v5, :cond_29

    .line 847
    .line 848
    iget-object v7, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 849
    .line 850
    const-wide v8, -0x622b4e68a836eL

    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v8

    .line 859
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v7

    .line 863
    if-eqz v7, :cond_29

    .line 864
    .line 865
    goto :goto_14

    .line 866
    :cond_29
    move-object/from16 v5, p1

    .line 867
    .line 868
    :goto_14
    if-eqz v5, :cond_28

    .line 869
    .line 870
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    goto :goto_13

    .line 874
    :cond_2a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 875
    .line 876
    .line 877
    move-result v4

    .line 878
    move/from16 v5, p2

    .line 879
    .line 880
    if-eq v4, v5, :cond_2b

    .line 881
    .line 882
    goto/16 :goto_1e

    .line 883
    .line 884
    :cond_2b
    invoke-static {v1}, Lyyds/ᛷᛷᛶᲇ;->ᛲᲀᛵᛷ(Ljava/util/List;)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    check-cast v1, Lyyds/ᛴᛲᛲᛸ;

    .line 889
    .line 890
    iget-wide v7, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 891
    .line 892
    const-wide/16 v9, 0xc

    .line 893
    .line 894
    iget-wide v11, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 895
    .line 896
    invoke-static/range {v7 .. v12}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 897
    .line 898
    .line 899
    move-result v4

    .line 900
    if-nez v4, :cond_2d

    .line 901
    .line 902
    :cond_2c
    :goto_15
    move-object/from16 v5, p1

    .line 903
    .line 904
    goto :goto_18

    .line 905
    :cond_2d
    iget-wide v4, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 906
    .line 907
    invoke-virtual {v0, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 911
    .line 912
    .line 913
    move-result v1

    .line 914
    if-eqz v1, :cond_2e

    .line 915
    .line 916
    goto :goto_15

    .line 917
    :cond_2e
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 918
    .line 919
    .line 920
    move-result v1

    .line 921
    int-to-long v4, v1

    .line 922
    const-wide v7, 0xffffffffL

    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    and-long/2addr v4, v7

    .line 928
    const-wide/16 v9, 0x1

    .line 929
    .line 930
    cmp-long v1, v9, v4

    .line 931
    .line 932
    const-wide v11, 0x80000000L

    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    if-gtz v1, :cond_2f

    .line 938
    .line 939
    cmp-long v1, v4, v11

    .line 940
    .line 941
    if-gez v1, :cond_2f

    .line 942
    .line 943
    long-to-int v1, v4

    .line 944
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    goto :goto_16

    .line 949
    :cond_2f
    move-object/from16 v1, p1

    .line 950
    .line 951
    :goto_16
    if-eqz v1, :cond_2c

    .line 952
    .line 953
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 954
    .line 955
    .line 956
    move-result v4

    .line 957
    int-to-long v4, v4

    .line 958
    and-long/2addr v4, v7

    .line 959
    cmp-long v7, v9, v4

    .line 960
    .line 961
    if-gtz v7, :cond_30

    .line 962
    .line 963
    cmp-long v7, v4, v11

    .line 964
    .line 965
    if-gez v7, :cond_30

    .line 966
    .line 967
    long-to-int v4, v4

    .line 968
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 969
    .line 970
    .line 971
    move-result-object v4

    .line 972
    goto :goto_17

    .line 973
    :cond_30
    move-object/from16 v4, p1

    .line 974
    .line 975
    :goto_17
    if-eqz v4, :cond_2c

    .line 976
    .line 977
    new-instance v5, Lkotlin/Pair;

    .line 978
    .line 979
    invoke-direct {v5, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 980
    .line 981
    .line 982
    :goto_18
    if-nez v5, :cond_31

    .line 983
    .line 984
    goto/16 :goto_1e

    .line 985
    .line 986
    :cond_31
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 987
    .line 988
    .line 989
    move-result-object v1

    .line 990
    const-wide v3, -0x622b9e68a836eL

    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-object/from16 v12, p1

    .line 999
    .line 1000
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1001
    .line 1002
    .line 1003
    move-result v3

    .line 1004
    if-eqz v3, :cond_3c

    .line 1005
    .line 1006
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v3

    .line 1010
    const-wide v7, -0x622c7e68a836eL

    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    check-cast v3, Ljava/lang/Number;

    .line 1019
    .line 1020
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1021
    .line 1022
    .line 1023
    move-result v3

    .line 1024
    const/4 v4, 0x1

    .line 1025
    sub-int/2addr v3, v4

    .line 1026
    invoke-static {v3, v2}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛶᛷᲀ(ILjava/util/List;)Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v3

    .line 1030
    check-cast v3, Lyyds/ᛴᛲᛲᛸ;

    .line 1031
    .line 1032
    if-nez v3, :cond_32

    .line 1033
    .line 1034
    goto/16 :goto_1e

    .line 1035
    .line 1036
    :cond_32
    iget-wide v7, v3, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 1037
    .line 1038
    iget-object v9, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 1039
    .line 1040
    const-wide v10, -0x622d1e68a836eL

    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v10

    .line 1049
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v9

    .line 1053
    if-eqz v9, :cond_3b

    .line 1054
    .line 1055
    iget-wide v9, v3, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 1056
    .line 1057
    const-wide/16 v18, 0x4

    .line 1058
    .line 1059
    iget-wide v13, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 1060
    .line 1061
    move-wide/from16 v16, v9

    .line 1062
    .line 1063
    move-wide/from16 v20, v13

    .line 1064
    .line 1065
    invoke-static/range {v16 .. v21}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v9

    .line 1069
    if-nez v9, :cond_33

    .line 1070
    .line 1071
    move-object/from16 v9, p1

    .line 1072
    .line 1073
    goto :goto_1a

    .line 1074
    :cond_33
    invoke-virtual {v0, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 1075
    .line 1076
    .line 1077
    const/4 v9, 0x4

    .line 1078
    new-array v10, v9, [B

    .line 1079
    .line 1080
    invoke-virtual {v0, v10}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 1081
    .line 1082
    .line 1083
    new-instance v9, Ljava/lang/String;

    .line 1084
    .line 1085
    sget-object v11, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 1086
    .line 1087
    invoke-direct {v9, v10, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 1088
    .line 1089
    .line 1090
    :goto_1a
    if-nez v9, :cond_34

    .line 1091
    .line 1092
    goto/16 :goto_1e

    .line 1093
    .line 1094
    :cond_34
    const-wide v10, -0x622d6e68a836eL

    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v10

    .line 1103
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v9

    .line 1107
    if-eqz v9, :cond_3b

    .line 1108
    .line 1109
    iget-wide v9, v3, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 1110
    .line 1111
    const-wide/16 v18, 0xb

    .line 1112
    .line 1113
    iget-wide v13, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 1114
    .line 1115
    move-wide/from16 v16, v9

    .line 1116
    .line 1117
    move-wide/from16 v20, v13

    .line 1118
    .line 1119
    invoke-static/range {v16 .. v21}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v3

    .line 1123
    if-nez v3, :cond_35

    .line 1124
    .line 1125
    move-object/from16 v3, p1

    .line 1126
    .line 1127
    const/4 v9, 0x4

    .line 1128
    goto :goto_1d

    .line 1129
    :cond_35
    invoke-virtual {v0, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 1130
    .line 1131
    .line 1132
    const/4 v9, 0x4

    .line 1133
    new-array v3, v9, [B

    .line 1134
    .line 1135
    invoke-virtual {v0, v3}, Ljava/io/RandomAccessFile;->read([B)I

    .line 1136
    .line 1137
    .line 1138
    move-result v7

    .line 1139
    if-ne v7, v9, :cond_38

    .line 1140
    .line 1141
    new-instance v7, Ljava/lang/String;

    .line 1142
    .line 1143
    sget-object v8, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 1144
    .line 1145
    invoke-direct {v7, v3, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 1146
    .line 1147
    .line 1148
    const-wide v10, -0x622dbe68a836eL

    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v3

    .line 1157
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v3

    .line 1161
    if-nez v3, :cond_36

    .line 1162
    .line 1163
    goto :goto_1c

    .line 1164
    :cond_36
    const/4 v3, 0x6

    .line 1165
    invoke-virtual {v0, v3}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 1169
    .line 1170
    .line 1171
    move-result v3

    .line 1172
    and-int/lit16 v3, v3, 0x80

    .line 1173
    .line 1174
    if-eqz v3, :cond_37

    .line 1175
    .line 1176
    move v3, v4

    .line 1177
    goto :goto_1b

    .line 1178
    :cond_37
    const/4 v3, 0x0

    .line 1179
    :goto_1b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v3

    .line 1183
    goto :goto_1d

    .line 1184
    :cond_38
    :goto_1c
    move-object/from16 v3, p1

    .line 1185
    .line 1186
    :goto_1d
    if-eqz v3, :cond_3a

    .line 1187
    .line 1188
    if-eqz v12, :cond_39

    .line 1189
    .line 1190
    invoke-virtual {v12, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1191
    .line 1192
    .line 1193
    move-result v7

    .line 1194
    if-nez v7, :cond_39

    .line 1195
    .line 1196
    goto :goto_1e

    .line 1197
    :cond_39
    move-object v12, v3

    .line 1198
    goto/16 :goto_19

    .line 1199
    .line 1200
    :cond_3a
    :goto_1e
    return-object p1

    .line 1201
    :cond_3b
    const/4 v9, 0x4

    .line 1202
    goto/16 :goto_19

    .line 1203
    .line 1204
    :cond_3c
    new-instance v7, Lyyds/ᲇᛴᲇᛸ;

    .line 1205
    .line 1206
    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v0

    .line 1210
    check-cast v0, Ljava/lang/Number;

    .line 1211
    .line 1212
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1213
    .line 1214
    .line 1215
    move-result v8

    .line 1216
    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    check-cast v0, Ljava/lang/Number;

    .line 1221
    .line 1222
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1223
    .line 1224
    .line 1225
    move-result v9

    .line 1226
    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    check-cast v0, Ljava/lang/Number;

    .line 1231
    .line 1232
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1233
    .line 1234
    .line 1235
    move-result v10

    .line 1236
    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    move-object v11, v0

    .line 1241
    check-cast v11, [B

    .line 1242
    .line 1243
    invoke-direct/range {v7 .. v12}, Lyyds/ᲇᛴᲇᛸ;-><init>(III[BLjava/lang/Boolean;)V

    .line 1244
    .line 1245
    .line 1246
    return-object v7

    .line 1247
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public static ᲀᛲᛳᲀ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;)Z
    .locals 6

    .line 1
    iget-wide v0, p1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 2
    .line 3
    iget-wide v2, p1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 4
    .line 5
    invoke-static {p0, v0, v1, v2, v3}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v2, v0

    .line 25
    check-cast v2, Lyyds/ᛴᛲᛲᛸ;

    .line 26
    .line 27
    iget-object v2, v2, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 28
    .line 29
    const-wide v3, -0x62309e68a836eL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v0, v1

    .line 46
    :goto_0
    check-cast v0, Lyyds/ᛴᛲᛲᛸ;

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-wide v2, v0, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 52
    .line 53
    iget-wide v4, v0, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 54
    .line 55
    invoke-static {p0, v2, v3, v4, v5}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    move-object v2, v0

    .line 74
    check-cast v2, Lyyds/ᛴᛲᛲᛸ;

    .line 75
    .line 76
    iget-object v2, v2, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 77
    .line 78
    const-wide v3, -0x6230ee68a836eL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    move-object v1, v0

    .line 94
    :cond_4
    check-cast v1, Lyyds/ᛴᛲᛲᛸ;

    .line 95
    .line 96
    if-nez v1, :cond_5

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    iget-wide v0, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 100
    .line 101
    const-wide/16 v2, 0x8

    .line 102
    .line 103
    add-long/2addr v0, v2

    .line 104
    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 105
    .line 106
    .line 107
    const/4 p1, 0x4

    .line 108
    new-array v0, p1, [B

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Ljava/io/RandomAccessFile;->read([B)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-ge p0, p1, :cond_6

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_6
    new-instance p0, Ljava/lang/String;

    .line 118
    .line 119
    sget-object p1, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 120
    .line 121
    invoke-direct {p0, v0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 122
    .line 123
    .line 124
    const-wide v0, -0x62313e68a836eL

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-nez p1, :cond_8

    .line 138
    .line 139
    const-wide v0, -0x62318e68a836eL

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-eqz p0, :cond_7

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    :goto_1
    const/4 p0, 0x0

    .line 156
    return p0

    .line 157
    :cond_8
    :goto_2
    const/4 p0, 0x1

    .line 158
    return p0
.end method

.method public static ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    int-to-long p0, p0

    .line 13
    const-wide v0, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p0, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-long p0, p0

    .line 25
    :goto_0
    const-wide/16 v0, 0x1

    .line 26
    .line 27
    cmp-long v0, v0, p0

    .line 28
    .line 29
    if-gtz v0, :cond_2

    .line 30
    .line 31
    const-wide v0, 0x80000000L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    cmp-long v0, p0, v0

    .line 37
    .line 38
    if-gez v0, :cond_2

    .line 39
    .line 40
    long-to-int p0, p0

    .line 41
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public static ᲇᲇᲇᛱ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;II)Ljava/util/LinkedHashSet;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 6
    .line 7
    const-wide/16 v4, 0x8

    .line 8
    .line 9
    iget-wide v6, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 10
    .line 11
    invoke-static/range {v2 .. v7}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    iget-wide v2, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 20
    .line 21
    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    shl-int/lit8 v3, v3, 0x10

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    shl-int/lit8 v4, v4, 0x8

    .line 39
    .line 40
    or-int/2addr v3, v4

    .line 41
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    or-int/2addr v3, v4

    .line 46
    const/4 v4, 0x2

    .line 47
    const/4 v5, 0x1

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    if-eq v2, v5, :cond_1

    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_1
    const/4 v2, 0x4

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v2, v4

    .line 57
    :goto_0
    and-int/2addr v3, v5

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    move v5, v4

    .line 61
    :cond_3
    if-ne v5, v4, :cond_4

    .line 62
    .line 63
    const/16 v3, 0x7fff

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    const/16 v3, 0x7f

    .line 67
    .line 68
    :goto_1
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    int-to-long v6, v6

    .line 73
    const-wide v8, 0xffffffffL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr v6, v8

    .line 79
    const-wide/32 v8, 0x186a0

    .line 80
    .line 81
    .line 82
    cmp-long v8, v6, v8

    .line 83
    .line 84
    if-lez v8, :cond_5

    .line 85
    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :cond_5
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    long-to-int v6, v6

    .line 94
    const/4 v7, 0x0

    .line 95
    move v9, v7

    .line 96
    :goto_2
    if-ge v9, v6, :cond_d

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 99
    .line 100
    .line 101
    move-result-wide v10

    .line 102
    int-to-long v12, v2

    .line 103
    const-wide/16 v14, 0x1

    .line 104
    .line 105
    add-long/2addr v12, v14

    .line 106
    iget-wide v14, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 107
    .line 108
    invoke-static/range {v10 .. v15}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    if-nez v10, :cond_6

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_6
    invoke-static {v0, v2}, Lyyds/ᛵᛴᛴᛳ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    if-eqz v10, :cond_c

    .line 120
    .line 121
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    int-to-long v12, v11

    .line 130
    int-to-long v14, v5

    .line 131
    mul-long v18, v12, v14

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 134
    .line 135
    .line 136
    move-result-wide v16

    .line 137
    iget-wide v12, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 138
    .line 139
    move-wide/from16 v20, v12

    .line 140
    .line 141
    invoke-static/range {v16 .. v21}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    if-nez v12, :cond_7

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_7
    move v12, v7

    .line 149
    :goto_3
    if-ge v12, v11, :cond_b

    .line 150
    .line 151
    if-ne v5, v4, :cond_8

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    goto :goto_4

    .line 158
    :cond_8
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    :goto_4
    and-int/2addr v13, v3

    .line 163
    move/from16 v14, p2

    .line 164
    .line 165
    if-le v13, v14, :cond_9

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_9
    move/from16 v15, p3

    .line 169
    .line 170
    if-ne v10, v15, :cond_a

    .line 171
    .line 172
    if-eqz v13, :cond_a

    .line 173
    .line 174
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    invoke-virtual {v8, v13}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    :cond_a
    add-int/lit8 v12, v12, 0x1

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_b
    move/from16 v14, p2

    .line 185
    .line 186
    move/from16 v15, p3

    .line 187
    .line 188
    add-int/lit8 v9, v9, 0x1

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_c
    :goto_5
    const/4 v0, 0x0

    .line 192
    return-object v0

    .line 193
    :cond_d
    return-object v8
.end method

.method public static ᲇᲈᛵᛷ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;I)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 6
    .line 7
    const-wide/16 v4, 0x6

    .line 8
    .line 9
    iget-wide v6, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 10
    .line 11
    invoke-static/range {v2 .. v7}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    iget-wide v4, v1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 21
    .line 22
    invoke-virtual {v0, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    shl-int/lit8 v4, v4, 0x10

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    shl-int/lit8 v5, v5, 0x8

    .line 40
    .line 41
    or-int/2addr v4, v5

    .line 42
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    or-int/2addr v4, v5

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    const/4 v4, 0x1

    .line 52
    if-eqz v2, :cond_4

    .line 53
    .line 54
    if-eq v2, v4, :cond_2

    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_2
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    const-wide/16 v7, 0x4

    .line 63
    .line 64
    iget-wide v9, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 65
    .line 66
    invoke-static/range {v5 .. v10}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_3

    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_3
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    int-to-long v5, v2

    .line 79
    const-wide v7, 0xffffffffL

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    and-long/2addr v5, v7

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    int-to-long v5, v2

    .line 91
    :goto_0
    const-wide/32 v7, 0x186a0

    .line 92
    .line 93
    .line 94
    cmp-long v2, v5, v7

    .line 95
    .line 96
    if-lez v2, :cond_5

    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_5
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 101
    .line 102
    .line 103
    move-result-wide v7

    .line 104
    iget-wide v1, v1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 105
    .line 106
    invoke-static {v0, v7, v8, v1, v2}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    long-to-int v5, v5

    .line 115
    if-ne v2, v5, :cond_12

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_8

    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;

    .line 139
    .line 140
    iget-object v5, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 141
    .line 142
    const-wide v6, -0x62273e68a836eL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-nez v5, :cond_7

    .line 156
    .line 157
    goto/16 :goto_4

    .line 158
    .line 159
    :cond_8
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    move v2, v3

    .line 164
    :cond_9
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_11

    .line 169
    .line 170
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;

    .line 175
    .line 176
    iget-wide v6, v5, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 177
    .line 178
    const-wide/16 v8, 0x4

    .line 179
    .line 180
    iget-wide v10, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 181
    .line 182
    invoke-static/range {v6 .. v11}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-nez v6, :cond_a

    .line 187
    .line 188
    goto/16 :goto_4

    .line 189
    .line 190
    :cond_a
    iget-wide v6, v5, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 191
    .line 192
    invoke-virtual {v0, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    shl-int/lit8 v7, v7, 0x10

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    shl-int/lit8 v8, v8, 0x8

    .line 210
    .line 211
    or-int/2addr v7, v8

    .line 212
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    or-int/2addr v7, v8

    .line 217
    const v8, 0xfffffe

    .line 218
    .line 219
    .line 220
    and-int/2addr v7, v8

    .line 221
    if-eqz v7, :cond_b

    .line 222
    .line 223
    goto/16 :goto_4

    .line 224
    .line 225
    :cond_b
    const/4 v7, 0x4

    .line 226
    const/4 v8, 0x2

    .line 227
    if-eqz v6, :cond_d

    .line 228
    .line 229
    if-eq v6, v4, :cond_d

    .line 230
    .line 231
    if-eq v6, v8, :cond_d

    .line 232
    .line 233
    const/4 v9, 0x3

    .line 234
    if-eq v6, v9, :cond_c

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_c
    move v9, v7

    .line 238
    goto :goto_3

    .line 239
    :cond_d
    move v9, v8

    .line 240
    :goto_3
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 241
    .line 242
    .line 243
    move-result-wide v10

    .line 244
    int-to-long v12, v9

    .line 245
    const-wide/16 v14, 0x2

    .line 246
    .line 247
    add-long/2addr v12, v14

    .line 248
    iget-wide v14, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 249
    .line 250
    invoke-static/range {v10 .. v15}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    if-nez v10, :cond_e

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_e
    invoke-static {v0, v9}, Lyyds/ᛵᛴᛴᛳ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    if-eqz v9, :cond_12

    .line 262
    .line 263
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedShort()I

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    move/from16 v11, p2

    .line 272
    .line 273
    if-ne v9, v11, :cond_9

    .line 274
    .line 275
    if-gt v8, v6, :cond_12

    .line 276
    .line 277
    if-ge v6, v7, :cond_12

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 280
    .line 281
    .line 282
    move-result-wide v12

    .line 283
    const-wide/16 v14, 0x4

    .line 284
    .line 285
    iget-wide v5, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 286
    .line 287
    move-wide/from16 v16, v5

    .line 288
    .line 289
    invoke-static/range {v12 .. v17}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-nez v5, :cond_f

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_f
    new-array v5, v7, [B

    .line 297
    .line 298
    invoke-virtual {v0, v5}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 299
    .line 300
    .line 301
    if-nez v2, :cond_12

    .line 302
    .line 303
    if-nez v10, :cond_12

    .line 304
    .line 305
    new-instance v2, Ljava/lang/String;

    .line 306
    .line 307
    sget-object v6, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 308
    .line 309
    invoke-direct {v2, v5, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 310
    .line 311
    .line 312
    const-wide v5, -0x62278e68a836eL

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-nez v2, :cond_10

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_10
    move v2, v4

    .line 329
    goto/16 :goto_2

    .line 330
    .line 331
    :cond_11
    return v2

    .line 332
    :cond_12
    :goto_4
    return v3
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ()Lyyds/ᲁᲇᛷᛳ;
    .locals 18

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 19
    .line 20
    const-wide v3, -0x62207e68a836eL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-direct {v1, v0, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    const-wide/16 v5, 0x0

    .line 37
    .line 38
    invoke-static {v1, v5, v6, v3, v4}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v4, v3

    .line 57
    check-cast v4, Lyyds/ᛴᛲᛲᛸ;

    .line 58
    .line 59
    iget-object v4, v4, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 60
    .line 61
    const-wide v7, -0x62209e68a836eL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    move-object/from16 p0, v2

    .line 79
    .line 80
    goto/16 :goto_12

    .line 81
    .line 82
    :cond_2
    move-object v3, v2

    .line 83
    :goto_0
    check-cast v3, Lyyds/ᛴᛲᛲᛸ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    if-nez v3, :cond_3

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :cond_3
    :try_start_1
    iget-wide v7, v3, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 92
    .line 93
    iget-wide v3, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 94
    .line 95
    invoke-static {v1, v7, v8, v3, v4}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v3, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    move-object v7, v4

    .line 119
    check-cast v7, Lyyds/ᛴᛲᛲᛸ;

    .line 120
    .line 121
    iget-object v7, v7, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 122
    .line 123
    const-wide v8, -0x6220ee68a836eL

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_4

    .line 137
    .line 138
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 149
    .line 150
    .line 151
    return-object v2

    .line 152
    :cond_6
    :try_start_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_8

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    move-object v7, v4

    .line 167
    check-cast v7, Lyyds/ᛴᛲᛲᛸ;

    .line 168
    .line 169
    invoke-static {v1, v7}, Lyyds/ᛵᛴᛴᛳ;->ᲀᛲᛳᲀ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;)Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_7

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_8
    move-object v4, v2

    .line 177
    :goto_2
    check-cast v4, Lyyds/ᛴᛲᛲᛸ;

    .line 178
    .line 179
    if-nez v4, :cond_9

    .line 180
    .line 181
    invoke-static {v3}, Lyyds/ᛷᛷᛶᲇ;->ᛸᛸᛷᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    move-object v4, v0

    .line 186
    check-cast v4, Lyyds/ᛴᛲᛲᛸ;

    .line 187
    .line 188
    :cond_9
    iget-wide v7, v4, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 189
    .line 190
    iget-wide v3, v4, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 191
    .line 192
    invoke-static {v1, v7, v8, v3, v4}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-eqz v4, :cond_b

    .line 205
    .line 206
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    move-object v7, v4

    .line 211
    check-cast v7, Lyyds/ᛴᛲᛲᛸ;

    .line 212
    .line 213
    iget-object v7, v7, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 214
    .line 215
    const-wide v8, -0x62213e68a836eL

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-eqz v7, :cond_a

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_b
    move-object v4, v2

    .line 232
    :goto_3
    check-cast v4, Lyyds/ᛴᛲᛲᛸ;

    .line 233
    .line 234
    if-eqz v4, :cond_c

    .line 235
    .line 236
    invoke-static {v1, v4}, Lyyds/ᛵᛴᛴᛳ;->ᛱᛳᲇ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;)Lkotlin/Pair;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    check-cast v7, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    check-cast v4, Ljava/lang/Number;

    .line 255
    .line 256
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    goto :goto_4

    .line 261
    :cond_c
    const/4 v4, 0x0

    .line 262
    const/4 v7, 0x0

    .line 263
    :goto_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-eqz v8, :cond_e

    .line 272
    .line 273
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    move-object v9, v8

    .line 278
    check-cast v9, Lyyds/ᛴᛲᛲᛸ;

    .line 279
    .line 280
    iget-object v9, v9, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 281
    .line 282
    const-wide v10, -0x62218e68a836eL

    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-eqz v9, :cond_d

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_e
    move-object v8, v2

    .line 299
    :goto_5
    check-cast v8, Lyyds/ᛴᛲᛲᛸ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 300
    .line 301
    if-nez v8, :cond_f

    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 304
    .line 305
    .line 306
    return-object v2

    .line 307
    :cond_f
    :try_start_3
    iget-wide v9, v8, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 308
    .line 309
    iget-wide v11, v8, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 310
    .line 311
    invoke-static {v1, v9, v10, v11, v12}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    :cond_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-eqz v9, :cond_11

    .line 324
    .line 325
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    move-object v10, v9

    .line 330
    check-cast v10, Lyyds/ᛴᛲᛲᛸ;

    .line 331
    .line 332
    iget-object v10, v10, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 333
    .line 334
    const-wide v11, -0x6221de68a836eL

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v11

    .line 343
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    if-eqz v10, :cond_10

    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_11
    move-object v9, v2

    .line 351
    :goto_6
    check-cast v9, Lyyds/ᛴᛲᛲᛸ;

    .line 352
    .line 353
    const-wide/16 v10, 0x3e8

    .line 354
    .line 355
    if-eqz v9, :cond_13

    .line 356
    .line 357
    iget-wide v8, v9, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 358
    .line 359
    invoke-virtual {v1, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readByte()B

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    and-int/lit16 v8, v8, 0xff

    .line 367
    .line 368
    const/4 v9, 0x3

    .line 369
    invoke-virtual {v1, v9}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 370
    .line 371
    .line 372
    if-nez v8, :cond_12

    .line 373
    .line 374
    const/16 v8, 0x8

    .line 375
    .line 376
    invoke-virtual {v1, v8}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 377
    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_12
    const/16 v8, 0x10

    .line 381
    .line 382
    invoke-virtual {v1, v8}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 383
    .line 384
    .line 385
    :goto_7
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    .line 386
    .line 387
    .line 388
    move-result v8

    .line 389
    int-to-long v8, v8

    .line 390
    const-wide v12, 0xffffffffL

    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    and-long/2addr v8, v12

    .line 396
    goto :goto_8

    .line 397
    :cond_13
    move-wide v8, v10

    .line 398
    :goto_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v12

    .line 406
    if-eqz v12, :cond_15

    .line 407
    .line 408
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v12

    .line 412
    move-object v13, v12

    .line 413
    check-cast v13, Lyyds/ᛴᛲᛲᛸ;

    .line 414
    .line 415
    iget-object v13, v13, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 416
    .line 417
    const-wide v14, -0x62222e68a836eL

    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    invoke-static {v14, v15}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v14

    .line 426
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v13

    .line 430
    if-eqz v13, :cond_14

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :cond_15
    move-object v12, v2

    .line 434
    :goto_9
    check-cast v12, Lyyds/ᛴᛲᛲᛸ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 435
    .line 436
    if-nez v12, :cond_16

    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 439
    .line 440
    .line 441
    return-object v2

    .line 442
    :cond_16
    :try_start_4
    iget-wide v13, v12, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 443
    .line 444
    move-object/from16 p0, v2

    .line 445
    .line 446
    :try_start_5
    iget-wide v2, v12, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 447
    .line 448
    invoke-static {v1, v13, v14, v2, v3}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    if-eqz v3, :cond_18

    .line 461
    .line 462
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    move-object v12, v3

    .line 467
    check-cast v12, Lyyds/ᛴᛲᛲᛸ;

    .line 468
    .line 469
    iget-object v12, v12, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 470
    .line 471
    const-wide v13, -0x62227e68a836eL

    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v13

    .line 480
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v12

    .line 484
    if-eqz v12, :cond_17

    .line 485
    .line 486
    goto :goto_a

    .line 487
    :catchall_1
    move-exception v0

    .line 488
    goto/16 :goto_12

    .line 489
    .line 490
    :cond_18
    move-object/from16 v3, p0

    .line 491
    .line 492
    :goto_a
    check-cast v3, Lyyds/ᛴᛲᛲᛸ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 493
    .line 494
    if-nez v3, :cond_19

    .line 495
    .line 496
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 497
    .line 498
    .line 499
    return-object p0

    .line 500
    :cond_19
    :try_start_6
    iget-wide v12, v3, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 501
    .line 502
    iget-wide v2, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 503
    .line 504
    invoke-static {v1, v12, v13, v2, v3}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    :cond_1a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 513
    .line 514
    .line 515
    move-result v12

    .line 516
    if-eqz v12, :cond_1b

    .line 517
    .line 518
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v12

    .line 522
    move-object v13, v12

    .line 523
    check-cast v13, Lyyds/ᛴᛲᛲᛸ;

    .line 524
    .line 525
    iget-object v13, v13, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 526
    .line 527
    const-wide v14, -0x6222ce68a836eL

    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    invoke-static {v14, v15}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v14

    .line 536
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v13

    .line 540
    if-eqz v13, :cond_1a

    .line 541
    .line 542
    goto :goto_b

    .line 543
    :cond_1b
    move-object/from16 v12, p0

    .line 544
    .line 545
    :goto_b
    check-cast v12, Lyyds/ᛴᛲᛲᛸ;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 546
    .line 547
    if-nez v12, :cond_1c

    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 550
    .line 551
    .line 552
    return-object p0

    .line 553
    :cond_1c
    :try_start_7
    iget-wide v12, v12, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 554
    .line 555
    invoke-virtual {v1, v12, v13}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 556
    .line 557
    .line 558
    const/4 v3, 0x4

    .line 559
    invoke-virtual {v1, v3}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 560
    .line 561
    .line 562
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    .line 563
    .line 564
    .line 565
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    .line 566
    .line 567
    .line 568
    move-result v12

    .line 569
    if-lez v12, :cond_26

    .line 570
    .line 571
    const v13, 0x186a0

    .line 572
    .line 573
    .line 574
    if-le v12, v13, :cond_1d

    .line 575
    .line 576
    goto/16 :goto_11

    .line 577
    .line 578
    :cond_1d
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    :cond_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 583
    .line 584
    .line 585
    move-result v14

    .line 586
    if-eqz v14, :cond_1f

    .line 587
    .line 588
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v14

    .line 592
    move-object v15, v14

    .line 593
    check-cast v15, Lyyds/ᛴᛲᛲᛸ;

    .line 594
    .line 595
    iget-object v15, v15, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 596
    .line 597
    const-wide v16, -0x62231e68a836eL

    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v15, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_1e

    .line 611
    .line 612
    goto :goto_c

    .line 613
    :cond_1f
    move-object/from16 v14, p0

    .line 614
    .line 615
    :goto_c
    check-cast v14, Lyyds/ᛴᛲᛲᛸ;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 616
    .line 617
    sget-object v0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 618
    .line 619
    if-eqz v14, :cond_21

    .line 620
    .line 621
    :try_start_8
    iget-wide v14, v14, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 622
    .line 623
    invoke-virtual {v1, v14, v15}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v3}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 627
    .line 628
    .line 629
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    if-ltz v2, :cond_21

    .line 634
    .line 635
    if-le v2, v13, :cond_20

    .line 636
    .line 637
    goto :goto_e

    .line 638
    :cond_20
    new-instance v0, Ljava/util/ArrayList;

    .line 639
    .line 640
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 641
    .line 642
    .line 643
    const/4 v3, 0x0

    .line 644
    :goto_d
    if-ge v3, v2, :cond_21

    .line 645
    .line 646
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    .line 647
    .line 648
    .line 649
    move-result v13

    .line 650
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    .line 651
    .line 652
    .line 653
    move-result v14

    .line 654
    new-instance v15, Lkotlin/Pair;

    .line 655
    .line 656
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 657
    .line 658
    .line 659
    move-result-object v13

    .line 660
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 661
    .line 662
    .line 663
    move-result-object v14

    .line 664
    invoke-direct {v15, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    add-int/lit8 v3, v3, 0x1

    .line 671
    .line 672
    goto :goto_d

    .line 673
    :cond_21
    :goto_e
    new-array v2, v12, [I

    .line 674
    .line 675
    cmp-long v3, v8, v5

    .line 676
    .line 677
    if-gtz v3, :cond_22

    .line 678
    .line 679
    goto :goto_10

    .line 680
    :cond_22
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    const/4 v3, 0x0

    .line 685
    :cond_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 686
    .line 687
    .line 688
    move-result v5

    .line 689
    if-eqz v5, :cond_25

    .line 690
    .line 691
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v5

    .line 695
    check-cast v5, Lkotlin/Pair;

    .line 696
    .line 697
    invoke-virtual {v5}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v6

    .line 701
    check-cast v6, Ljava/lang/Number;

    .line 702
    .line 703
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 704
    .line 705
    .line 706
    move-result v6

    .line 707
    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v5

    .line 711
    check-cast v5, Ljava/lang/Number;

    .line 712
    .line 713
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 714
    .line 715
    .line 716
    move-result v5

    .line 717
    if-lez v6, :cond_23

    .line 718
    .line 719
    int-to-long v13, v5

    .line 720
    mul-long/2addr v13, v10

    .line 721
    div-long/2addr v13, v8

    .line 722
    long-to-int v5, v13

    .line 723
    const/4 v13, 0x0

    .line 724
    :goto_f
    if-ge v13, v6, :cond_23

    .line 725
    .line 726
    if-lt v3, v12, :cond_24

    .line 727
    .line 728
    goto :goto_10

    .line 729
    :cond_24
    aput v5, v2, v3

    .line 730
    .line 731
    add-int/lit8 v3, v3, 0x1

    .line 732
    .line 733
    add-int/lit8 v13, v13, 0x1

    .line 734
    .line 735
    goto :goto_f

    .line 736
    :cond_25
    :goto_10
    new-instance v0, Lyyds/ᲁᲇᛷᛳ;

    .line 737
    .line 738
    const-wide v5, -0x624ffe68a836eL

    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 747
    .line 748
    .line 749
    iput v12, v0, Lyyds/ᲁᲇᛷᛳ;->ᛲᲈᲁ:I

    .line 750
    .line 751
    iput-object v2, v0, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 752
    .line 753
    iput v7, v0, Lyyds/ᲁᲇᛷᛳ;->ᲀᛲᛳᲀ:I

    .line 754
    .line 755
    iput v4, v0, Lyyds/ᲁᲇᛷᛳ;->ᲇᲈᛵᛷ:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 756
    .line 757
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 758
    .line 759
    .line 760
    return-object v0

    .line 761
    :cond_26
    :goto_11
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 762
    .line 763
    .line 764
    return-object p0

    .line 765
    :goto_12
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 766
    .line 767
    .line 768
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 769
    .line 770
    .line 771
    return-object p0

    .line 772
    :catchall_2
    move-exception v0

    .line 773
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 774
    .line 775
    .line 776
    throw v0
.end method

.method public final ᛶᛷᛲᲁ()Lyyds/ᛲᛵᛱᛱ;
    .locals 9

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_8

    .line 16
    .line 17
    :cond_0
    new-instance p0, Ljava/io/RandomAccessFile;

    .line 18
    .line 19
    const-wide v2, -0x62236e68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {p0, v0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 29
    .line 30
    .line 31
    :try_start_1
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->length()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    invoke-static {p0, v4, v5, v2, v3}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    move-object v3, v2

    .line 56
    check-cast v3, Lyyds/ᛴᛲᛲᛸ;

    .line 57
    .line 58
    iget-object v3, v3, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 59
    .line 60
    const-wide v4, -0x62238e68a836eL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object v2, v0

    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_2
    move-object v2, v1

    .line 81
    :goto_0
    check-cast v2, Lyyds/ᛴᛲᛲᛸ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    if-nez v2, :cond_3

    .line 84
    .line 85
    :try_start_2
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_3
    :try_start_3
    iget-wide v3, v2, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 90
    .line 91
    iget-wide v7, v2, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 92
    .line 93
    const-wide/16 v5, 0x4

    .line 94
    .line 95
    invoke-static/range {v3 .. v8}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 96
    .line 97
    .line 98
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    :try_start_4
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_4
    :try_start_5
    iget-wide v3, v2, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 106
    .line 107
    const-wide/16 v5, 0x4

    .line 108
    .line 109
    add-long/2addr v3, v5

    .line 110
    iget-wide v5, v2, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 111
    .line 112
    invoke-static {p0, v3, v4, v5, v6}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_6

    .line 125
    .line 126
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    move-object v4, v3

    .line 131
    check-cast v4, Lyyds/ᛴᛲᛲᛸ;

    .line 132
    .line 133
    iget-object v4, v4, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 134
    .line 135
    const-wide v5, -0x6223de68a836eL

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_5

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_6
    move-object v3, v1

    .line 152
    :goto_1
    check-cast v3, Lyyds/ᛴᛲᛲᛸ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 153
    .line 154
    if-nez v3, :cond_7

    .line 155
    .line 156
    :try_start_6
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 157
    .line 158
    .line 159
    return-object v1

    .line 160
    :cond_7
    :try_start_7
    invoke-static {p0, v3}, Lyyds/ᛵᛴᛴᛳ;->ᛷᛵᲇᲀ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;)Lyyds/ᲈᲇᲁᲈ;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    iget v2, v2, Lyyds/ᲈᲇᲁᲈ;->ᛲᲈᲁ:I

    .line 167
    .line 168
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    goto :goto_2

    .line 173
    :cond_8
    move-object v2, v1

    .line 174
    :goto_2
    if-eqz v2, :cond_16

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-eqz v4, :cond_a

    .line 189
    .line 190
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    move-object v5, v4

    .line 195
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;

    .line 196
    .line 197
    iget-object v5, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 198
    .line 199
    const-wide v6, -0x62242e68a836eL

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_9

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_a
    move-object v4, v1

    .line 216
    :goto_3
    check-cast v4, Lyyds/ᛴᛲᛲᛸ;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 217
    .line 218
    if-nez v4, :cond_b

    .line 219
    .line 220
    :try_start_8
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 221
    .line 222
    .line 223
    return-object v1

    .line 224
    :cond_b
    :try_start_9
    invoke-static {p0, v4, v2}, Lyyds/ᛵᛴᛴᛳ;->ᛲᛳᛶᲁ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;I)Ljava/util/LinkedHashSet;

    .line 225
    .line 226
    .line 227
    move-result-object v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 228
    if-nez v3, :cond_c

    .line 229
    .line 230
    :try_start_a
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 231
    .line 232
    .line 233
    return-object v1

    .line 234
    :cond_c
    :try_start_b
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 238
    if-eqz v5, :cond_d

    .line 239
    .line 240
    :try_start_c
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 241
    .line 242
    .line 243
    return-object v1

    .line 244
    :cond_d
    :try_start_d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :cond_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    if-eqz v5, :cond_f

    .line 253
    .line 254
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    move-object v6, v5

    .line 259
    check-cast v6, Lyyds/ᛴᛲᛲᛸ;

    .line 260
    .line 261
    iget-object v6, v6, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 262
    .line 263
    const-wide v7, -0x62247e68a836eL

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    if-eqz v6, :cond_e

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_f
    move-object v5, v1

    .line 280
    :goto_4
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 281
    .line 282
    if-nez v5, :cond_10

    .line 283
    .line 284
    :try_start_e
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 285
    .line 286
    .line 287
    return-object v1

    .line 288
    :cond_10
    :try_start_f
    invoke-static {p0, v5}, Lyyds/ᛵᛴᛴᛳ;->ᛱᲈᲁ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;)Lyyds/ᛱᲀᛸᛷ;

    .line 289
    .line 290
    .line 291
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 292
    if-nez v0, :cond_11

    .line 293
    .line 294
    :try_start_10
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 295
    .line 296
    .line 297
    return-object v1

    .line 298
    :cond_11
    :try_start_11
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    :cond_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-eqz v5, :cond_13

    .line 307
    .line 308
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    move-object v6, v5

    .line 313
    check-cast v6, Ljava/lang/Number;

    .line 314
    .line 315
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    iget-object v7, v0, Lyyds/ᛱᲀᛸᛷ;->ᛲᲈᲁ:Ljava/util/Set;

    .line 320
    .line 321
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    if-eqz v6, :cond_12

    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_13
    move-object v5, v1

    .line 333
    :goto_5
    check-cast v5, Ljava/lang/Integer;

    .line 334
    .line 335
    if-eqz v5, :cond_15

    .line 336
    .line 337
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    invoke-static {p0, v4, v2, v3}, Lyyds/ᛵᛴᛴᛳ;->ᛵᛸᛸᛷ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;II)Ljava/lang/Boolean;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    new-instance v6, Lyyds/ᛲᛵᛱᛱ;

    .line 346
    .line 347
    iget-object v0, v0, Lyyds/ᛱᲀᛸᛷ;->ᛵᛸᛸᛷ:Ljava/util/Set;

    .line 348
    .line 349
    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    if-nez v0, :cond_14

    .line 354
    .line 355
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 356
    .line 357
    invoke-static {v4, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_14

    .line 362
    .line 363
    const/4 v0, 0x1

    .line 364
    goto :goto_6

    .line 365
    :cond_14
    const/4 v0, 0x0

    .line 366
    :goto_6
    invoke-direct {v6, v2, v3, v0}, Lyyds/ᛲᛵᛱᛱ;-><init>(IIZ)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 367
    .line 368
    .line 369
    :try_start_12
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V

    .line 370
    .line 371
    .line 372
    return-object v6

    .line 373
    :cond_15
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V

    .line 374
    .line 375
    .line 376
    return-object v1

    .line 377
    :cond_16
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 378
    .line 379
    .line 380
    return-object v1

    .line 381
    :goto_7
    :try_start_13
    throw v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    .line 382
    :catchall_1
    move-exception v0

    .line 383
    :try_start_14
    invoke-static {p0, v2}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    .line 387
    :catchall_2
    :goto_8
    return-object v1
.end method
