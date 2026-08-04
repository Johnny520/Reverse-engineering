.class public final Lyyds/ᛳᛶᛷᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛳᛶᛷᛳ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x62a5fe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᛳᛶᛷᛳ;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyyds/ᛳᛶᛷᛳ;->ᛲᲈᲁ:Lyyds/ᛳᛶᛷᛳ;

    .line 15
    .line 16
    return-void
.end method

.method public static ᛲᲈᲁ(Landroid/graphics/Bitmap;Lyyds/ᛲᲇᛵᛵ;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v8

    .line 9
    new-array v1, v3, [I

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 13
    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    move v5, v9

    .line 17
    :goto_0
    if-ge v5, v8, :cond_2

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v7, 0x1

    .line 21
    const/4 v2, 0x0

    .line 22
    move v6, v3

    .line 23
    move-object v0, p0

    .line 24
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 25
    .line 26
    .line 27
    move p0, v9

    .line 28
    :goto_1
    if-ge p0, v3, :cond_1

    .line 29
    .line 30
    iget-object v2, p1, Lyyds/ᛲᲇᛵᛵ;->ᲀᛲᛳᲀ:[B

    .line 31
    .line 32
    mul-int v4, v5, v3

    .line 33
    .line 34
    add-int/2addr v4, p0

    .line 35
    aget-byte v2, v2, v4

    .line 36
    .line 37
    const/16 v4, 0xff

    .line 38
    .line 39
    and-int/2addr v2, v4

    .line 40
    sget-object v6, Lyyds/ᛴᲇᛶᲀ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛶᲀ;

    .line 41
    .line 42
    iget v7, p1, Lyyds/ᛲᲇᛵᛵ;->ᲇᲈᛵᛷ:I

    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v9, v4}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-static {v7, v9, v4}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    sub-int/2addr v2, v4

    .line 56
    if-gez v2, :cond_0

    .line 57
    .line 58
    move v2, v9

    .line 59
    :cond_0
    shl-int/lit8 v2, v2, 0x18

    .line 60
    .line 61
    aget v4, v1, p0

    .line 62
    .line 63
    const v6, 0xffffff

    .line 64
    .line 65
    .line 66
    and-int/2addr v4, v6

    .line 67
    or-int/2addr v2, v4

    .line 68
    aput v2, v1, p0

    .line 69
    .line 70
    add-int/lit8 p0, p0, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/4 v4, 0x0

    .line 74
    const/4 v7, 0x1

    .line 75
    const/4 v2, 0x0

    .line 76
    move v6, v3

    .line 77
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v5, v5, 0x1

    .line 81
    .line 82
    move-object p0, v0

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/String;)Lyyds/ᛸᲀᛲ;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-wide v2, -0x629b0e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/io/File;

    .line 12
    .line 13
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v3, 0x0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :try_start_0
    invoke-static {v2}, Landroid/graphics/ImageDecoder;->createSource(Ljava/io/File;)Landroid/graphics/ImageDecoder$Source;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-wide v4, -0x62a0ee68a836eL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    new-instance v4, Lyyds/ᛵᛷᛸᛳ;

    .line 37
    .line 38
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v4}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    move-object v4, v0

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    const-wide v4, -0x62a20e68a836eL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    new-instance v5, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-wide v6, -0x62a31e68a836eL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {v4, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 83
    .line 84
    .line 85
    move-object v4, v3

    .line 86
    :goto_0
    if-nez v4, :cond_1

    .line 87
    .line 88
    :goto_1
    return-object v3

    .line 89
    :cond_1
    new-instance v0, Lyyds/ᛵᛴᛴᛳ;

    .line 90
    .line 91
    invoke-direct {v0, v1}, Lyyds/ᛵᛴᛴᛳ;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0}, Lyyds/ᛵᛴᛴᛳ;->ᛶᛷᛲᲁ()Lyyds/ᛲᛵᛱᛱ;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    const/4 v6, 0x0

    .line 101
    if-nez v5, :cond_2

    .line 102
    .line 103
    new-instance v0, Lyyds/ᛸᲀᛲ;

    .line 104
    .line 105
    invoke-direct {v0, v4, v6, v6}, Lyyds/ᛸᲀᛲ;-><init>(Landroid/graphics/Bitmap;ZZ)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_2
    iget-boolean v0, v5, Lyyds/ᛲᛵᛱᛱ;->ᲀᛲᛳᲀ:Z

    .line 110
    .line 111
    const/4 v7, 0x1

    .line 112
    if-nez v0, :cond_3

    .line 113
    .line 114
    new-instance v0, Lyyds/ᛸᲀᛲ;

    .line 115
    .line 116
    invoke-direct {v0, v4, v7, v6}, Lyyds/ᛸᲀᛲ;-><init>(Landroid/graphics/Bitmap;ZZ)V

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_3
    const-wide/16 v8, 0x0

    .line 121
    .line 122
    :try_start_1
    new-instance v0, Ljava/io/File;

    .line 123
    .line 124
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    if-nez v12, :cond_4

    .line 132
    .line 133
    :goto_2
    move-object v0, v3

    .line 134
    const-wide/16 v20, 0x4

    .line 135
    .line 136
    goto/16 :goto_8

    .line 137
    .line 138
    :cond_4
    new-instance v12, Ljava/io/RandomAccessFile;

    .line 139
    .line 140
    const-wide v13, -0x6224ce68a836eL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    invoke-direct {v12, v0, v13}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 150
    .line 151
    .line 152
    :try_start_2
    invoke-virtual {v12}, Ljava/io/RandomAccessFile;->length()J

    .line 153
    .line 154
    .line 155
    move-result-wide v13

    .line 156
    invoke-static {v12, v8, v9, v13, v14}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 168
    if-eqz v13, :cond_6

    .line 169
    .line 170
    :try_start_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    move-object v14, v13

    .line 175
    check-cast v14, Lyyds/ᛴᛲᛲᛸ;

    .line 176
    .line 177
    iget-object v14, v14, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 178
    .line 179
    const-wide v15, -0x6224ee68a836eL

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static/range {v15 .. v16}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v15

    .line 188
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 192
    if-eqz v14, :cond_5

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :catchall_1
    move-exception v0

    .line 196
    move-object v10, v0

    .line 197
    const-wide/16 v20, 0x4

    .line 198
    .line 199
    goto/16 :goto_7

    .line 200
    .line 201
    :cond_6
    move-object v13, v3

    .line 202
    :goto_3
    :try_start_4
    check-cast v13, Lyyds/ᛴᛲᛲᛸ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 203
    .line 204
    if-nez v13, :cond_7

    .line 205
    .line 206
    :try_start_5
    invoke-virtual {v12}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :catchall_2
    const-wide/16 v20, 0x4

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_7
    :try_start_6
    iget-wide v14, v13, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 214
    .line 215
    const-wide/16 v20, 0x4

    .line 216
    .line 217
    :try_start_7
    iget-wide v10, v13, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 218
    .line 219
    const-wide/16 v16, 0x4

    .line 220
    .line 221
    move-wide/from16 v18, v10

    .line 222
    .line 223
    invoke-static/range {v14 .. v19}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 224
    .line 225
    .line 226
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 227
    if-nez v0, :cond_8

    .line 228
    .line 229
    :try_start_8
    invoke-virtual {v12}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 230
    .line 231
    .line 232
    :catchall_3
    :goto_4
    move-object v0, v3

    .line 233
    goto :goto_8

    .line 234
    :cond_8
    :try_start_9
    iget-wide v10, v13, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 235
    .line 236
    add-long v10, v10, v20

    .line 237
    .line 238
    iget-wide v13, v13, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 239
    .line 240
    invoke-static {v12, v10, v11, v13, v14}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    if-eqz v10, :cond_a

    .line 253
    .line 254
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    move-object v11, v10

    .line 259
    check-cast v11, Lyyds/ᛴᛲᛲᛸ;

    .line 260
    .line 261
    iget-object v11, v11, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 262
    .line 263
    const-wide v13, -0x62253e68a836eL

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    if-eqz v11, :cond_9

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :catchall_4
    move-exception v0

    .line 280
    :goto_5
    move-object v10, v0

    .line 281
    goto :goto_7

    .line 282
    :cond_a
    move-object v10, v3

    .line 283
    :goto_6
    check-cast v10, Lyyds/ᛴᛲᛲᛸ;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 284
    .line 285
    if-nez v10, :cond_b

    .line 286
    .line 287
    :try_start_a
    invoke-virtual {v12}, Ljava/io/RandomAccessFile;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 288
    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_b
    :try_start_b
    invoke-static {v12, v10}, Lyyds/ᛵᛴᛴᛳ;->ᛷᛵᲇᲀ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;)Lyyds/ᲈᲇᲁᲈ;

    .line 292
    .line 293
    .line 294
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 295
    :try_start_c
    invoke-virtual {v12}, Ljava/io/RandomAccessFile;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 296
    .line 297
    .line 298
    goto :goto_8

    .line 299
    :catchall_5
    move-exception v0

    .line 300
    const-wide/16 v20, 0x4

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :goto_7
    :try_start_d
    throw v10
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 304
    :catchall_6
    move-exception v0

    .line 305
    :try_start_e
    invoke-static {v12, v10}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 309
    :goto_8
    if-eqz v0, :cond_29

    .line 310
    .line 311
    iget v0, v0, Lyyds/ᲈᲇᲁᲈ;->ᛲᲈᲁ:I

    .line 312
    .line 313
    iget v10, v5, Lyyds/ᛲᛵᛱᛱ;->ᛲᲈᲁ:I

    .line 314
    .line 315
    if-eq v0, v10, :cond_c

    .line 316
    .line 317
    goto/16 :goto_14

    .line 318
    .line 319
    :cond_c
    iget v12, v5, Lyyds/ᛲᛵᛱᛱ;->ᛵᛸᛸᛷ:I

    .line 320
    .line 321
    if-lez v10, :cond_22

    .line 322
    .line 323
    if-lez v12, :cond_22

    .line 324
    .line 325
    if-ne v10, v12, :cond_d

    .line 326
    .line 327
    goto/16 :goto_f

    .line 328
    .line 329
    :cond_d
    :try_start_f
    new-instance v0, Ljava/io/File;

    .line 330
    .line 331
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-nez v1, :cond_e

    .line 339
    .line 340
    goto/16 :goto_f

    .line 341
    .line 342
    :cond_e
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 343
    .line 344
    const-wide v13, -0x62258e68a836eL

    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    invoke-direct {v1, v0, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 354
    .line 355
    .line 356
    :try_start_10
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J

    .line 357
    .line 358
    .line 359
    move-result-wide v13

    .line 360
    invoke-static {v1, v8, v9, v13, v14}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    if-eqz v5, :cond_10

    .line 373
    .line 374
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    move-object v8, v5

    .line 379
    check-cast v8, Lyyds/ᛴᛲᛲᛸ;

    .line 380
    .line 381
    iget-object v8, v8, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 382
    .line 383
    const-wide v13, -0x6225ae68a836eL

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v9

    .line 392
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v8

    .line 396
    if-eqz v8, :cond_f

    .line 397
    .line 398
    goto :goto_9

    .line 399
    :catchall_7
    move-exception v0

    .line 400
    move-object v5, v0

    .line 401
    goto/16 :goto_e

    .line 402
    .line 403
    :cond_10
    move-object v5, v3

    .line 404
    :goto_9
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 405
    .line 406
    if-nez v5, :cond_11

    .line 407
    .line 408
    :try_start_11
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 409
    .line 410
    .line 411
    goto/16 :goto_f

    .line 412
    .line 413
    :cond_11
    :try_start_12
    iget-wide v13, v5, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 414
    .line 415
    iget-wide v8, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 416
    .line 417
    const-wide/16 v15, 0x4

    .line 418
    .line 419
    move-wide/from16 v17, v8

    .line 420
    .line 421
    invoke-static/range {v13 .. v18}, Lyyds/ᛵᛴᛴᛳ;->ᛲᲈᲁ(JJJ)Z

    .line 422
    .line 423
    .line 424
    move-result v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 425
    if-nez v0, :cond_12

    .line 426
    .line 427
    :try_start_13
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 428
    .line 429
    .line 430
    goto/16 :goto_f

    .line 431
    .line 432
    :cond_12
    :try_start_14
    iget-wide v8, v5, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 433
    .line 434
    add-long v8, v8, v20

    .line 435
    .line 436
    iget-wide v13, v5, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 437
    .line 438
    invoke-static {v1, v8, v9, v13, v14}, Lyyds/ᛵᛴᛴᛳ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;JJ)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 443
    .line 444
    .line 445
    move-result-object v5

    .line 446
    :cond_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 447
    .line 448
    .line 449
    move-result v8

    .line 450
    if-eqz v8, :cond_14

    .line 451
    .line 452
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    move-object v9, v8

    .line 457
    check-cast v9, Lyyds/ᛴᛲᛲᛸ;

    .line 458
    .line 459
    iget-object v9, v9, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 460
    .line 461
    const-wide v13, -0x6225fe68a836eL

    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v11

    .line 470
    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v9

    .line 474
    if-eqz v9, :cond_13

    .line 475
    .line 476
    goto :goto_a

    .line 477
    :cond_14
    move-object v8, v3

    .line 478
    :goto_a
    check-cast v8, Lyyds/ᛴᛲᛲᛸ;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 479
    .line 480
    if-nez v8, :cond_15

    .line 481
    .line 482
    :try_start_15
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    .line 483
    .line 484
    .line 485
    goto/16 :goto_f

    .line 486
    .line 487
    :cond_15
    :try_start_16
    invoke-static {v1, v8, v12}, Lyyds/ᛵᛴᛴᛳ;->ᲇᲈᛵᛷ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;I)Z

    .line 488
    .line 489
    .line 490
    move-result v5
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    .line 491
    if-nez v5, :cond_16

    .line 492
    .line 493
    :try_start_17
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_9

    .line 494
    .line 495
    .line 496
    goto/16 :goto_f

    .line 497
    .line 498
    :cond_16
    :try_start_18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    :cond_17
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v8

    .line 506
    if-eqz v8, :cond_18

    .line 507
    .line 508
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v8

    .line 512
    move-object v9, v8

    .line 513
    check-cast v9, Lyyds/ᛴᛲᛲᛸ;

    .line 514
    .line 515
    iget-object v9, v9, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 516
    .line 517
    const-wide v13, -0x62264e68a836eL

    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v11

    .line 526
    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v9

    .line 530
    if-eqz v9, :cond_17

    .line 531
    .line 532
    goto :goto_b

    .line 533
    :cond_18
    move-object v8, v3

    .line 534
    :goto_b
    check-cast v8, Lyyds/ᛴᛲᛲᛸ;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    .line 535
    .line 536
    if-nez v8, :cond_19

    .line 537
    .line 538
    :try_start_19
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    .line 539
    .line 540
    .line 541
    goto/16 :goto_f

    .line 542
    .line 543
    :cond_19
    :try_start_1a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    :cond_1a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 548
    .line 549
    .line 550
    move-result v9

    .line 551
    if-eqz v9, :cond_1b

    .line 552
    .line 553
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v9

    .line 557
    move-object v11, v9

    .line 558
    check-cast v11, Lyyds/ᛴᛲᛲᛸ;

    .line 559
    .line 560
    iget-object v11, v11, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 561
    .line 562
    const-wide v13, -0x62269e68a836eL

    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v13

    .line 571
    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v11

    .line 575
    if-eqz v11, :cond_1a

    .line 576
    .line 577
    goto :goto_c

    .line 578
    :cond_1b
    move-object v9, v3

    .line 579
    :goto_c
    check-cast v9, Lyyds/ᛴᛲᛲᛸ;

    .line 580
    .line 581
    invoke-static {v1, v8, v12, v9}, Lyyds/ᛵᛴᛴᛳ;->ᛷᛲᲈᛱ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;ILyyds/ᛴᛲᛲᛸ;)Ljava/util/ArrayList;

    .line 582
    .line 583
    .line 584
    move-result-object v13
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_7

    .line 585
    if-nez v13, :cond_1c

    .line 586
    .line 587
    :try_start_1b
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    .line 588
    .line 589
    .line 590
    goto :goto_f

    .line 591
    :cond_1c
    :try_start_1c
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 592
    .line 593
    .line 594
    move-result v5
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_7

    .line 595
    if-eqz v5, :cond_1d

    .line 596
    .line 597
    :try_start_1d
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_9

    .line 598
    .line 599
    .line 600
    goto :goto_f

    .line 601
    :cond_1d
    :try_start_1e
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 606
    .line 607
    .line 608
    move-result v5

    .line 609
    if-eqz v5, :cond_1f

    .line 610
    .line 611
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    move-object v8, v5

    .line 616
    check-cast v8, Lyyds/ᛴᛲᛲᛸ;

    .line 617
    .line 618
    iget-object v8, v8, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 619
    .line 620
    const-wide v14, -0x6226ee68a836eL

    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    invoke-static {v14, v15}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v9

    .line 629
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v8

    .line 633
    if-eqz v8, :cond_1e

    .line 634
    .line 635
    goto :goto_d

    .line 636
    :cond_1f
    move-object v5, v3

    .line 637
    :goto_d
    check-cast v5, Lyyds/ᛴᛲᛲᛸ;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_7

    .line 638
    .line 639
    if-nez v5, :cond_20

    .line 640
    .line 641
    :try_start_1f
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_9

    .line 642
    .line 643
    .line 644
    goto :goto_f

    .line 645
    :cond_20
    :try_start_20
    invoke-static {v1, v5, v12, v10}, Lyyds/ᛵᛴᛴᛳ;->ᛷᲈᲈᲁ(Ljava/io/RandomAccessFile;Lyyds/ᛴᛲᛲᛸ;II)Lyyds/ᲇᛴᲇᛸ;

    .line 646
    .line 647
    .line 648
    move-result-object v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_7

    .line 649
    if-nez v0, :cond_21

    .line 650
    .line 651
    :try_start_21
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_9

    .line 652
    .line 653
    .line 654
    goto :goto_f

    .line 655
    :cond_21
    :try_start_22
    new-instance v11, Lyyds/ᛲᛷᲁᛷ;

    .line 656
    .line 657
    iget v14, v0, Lyyds/ᲇᛴᲇᛸ;->ᛲᲈᲁ:I

    .line 658
    .line 659
    iget v15, v0, Lyyds/ᲇᛴᲇᛸ;->ᛵᛸᛸᛷ:I

    .line 660
    .line 661
    iget v5, v0, Lyyds/ᲇᛴᲇᛸ;->ᲀᛲᛳᲀ:I

    .line 662
    .line 663
    iget-object v8, v0, Lyyds/ᲇᛴᲇᛸ;->ᲇᲈᛵᛷ:[B

    .line 664
    .line 665
    iget-object v0, v0, Lyyds/ᲇᛴᲇᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Boolean;

    .line 666
    .line 667
    move-object/from16 v18, v0

    .line 668
    .line 669
    move/from16 v16, v5

    .line 670
    .line 671
    move-object/from16 v17, v8

    .line 672
    .line 673
    invoke-direct/range {v11 .. v18}, Lyyds/ᛲᛷᲁᛷ;-><init>(ILjava/util/ArrayList;III[BLjava/lang/Boolean;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_7

    .line 674
    .line 675
    .line 676
    :try_start_23
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_9

    .line 677
    .line 678
    .line 679
    move-object v3, v11

    .line 680
    goto :goto_f

    .line 681
    :goto_e
    :try_start_24
    throw v5
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_8

    .line 682
    :catchall_8
    move-exception v0

    .line 683
    :try_start_25
    invoke-static {v1, v5}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 684
    .line 685
    .line 686
    throw v0
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_9

    .line 687
    :catchall_9
    :cond_22
    :goto_f
    if-nez v3, :cond_23

    .line 688
    .line 689
    new-instance v0, Lyyds/ᛸᲀᛲ;

    .line 690
    .line 691
    invoke-direct {v0, v4, v7, v6}, Lyyds/ᛸᲀᛲ;-><init>(Landroid/graphics/Bitmap;ZZ)V

    .line 692
    .line 693
    .line 694
    return-object v0

    .line 695
    :cond_23
    iget v0, v3, Lyyds/ᛲᛷᲁᛷ;->ᲀᛲᛳᲀ:I

    .line 696
    .line 697
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    if-ne v0, v1, :cond_28

    .line 702
    .line 703
    iget v0, v3, Lyyds/ᛲᛷᲁᛷ;->ᲇᲈᛵᛷ:I

    .line 704
    .line 705
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 706
    .line 707
    .line 708
    move-result v1

    .line 709
    if-eq v0, v1, :cond_24

    .line 710
    .line 711
    goto/16 :goto_13

    .line 712
    .line 713
    :cond_24
    :try_start_26
    sget-object v0, Lyyds/ᛴᲇᛶᲀ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛶᲀ;

    .line 714
    .line 715
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 716
    .line 717
    .line 718
    move-result v1

    .line 719
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 720
    .line 721
    .line 722
    move-result v5

    .line 723
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    invoke-static {v2, v3, v1, v5}, Lyyds/ᛴᲇᛶᲀ;->ᛵᛸᛸᛷ(Ljava/io/File;Lyyds/ᛲᛷᲁᛷ;II)Lyyds/ᛲᲇᛵᛵ;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    if-nez v0, :cond_25

    .line 731
    .line 732
    new-instance v0, Lyyds/ᛸᲀᛲ;

    .line 733
    .line 734
    invoke-direct {v0, v4, v7, v6}, Lyyds/ᛸᲀᛲ;-><init>(Landroid/graphics/Bitmap;ZZ)V

    .line 735
    .line 736
    .line 737
    return-object v0

    .line 738
    :catchall_a
    move-exception v0

    .line 739
    goto :goto_11

    .line 740
    :cond_25
    iget v1, v0, Lyyds/ᛲᲇᛵᛵ;->ᛲᲈᲁ:I

    .line 741
    .line 742
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    if-ne v1, v2, :cond_27

    .line 747
    .line 748
    iget v1, v0, Lyyds/ᛲᲇᛵᛵ;->ᛵᛸᛸᛷ:I

    .line 749
    .line 750
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    if-eq v1, v2, :cond_26

    .line 755
    .line 756
    goto :goto_10

    .line 757
    :cond_26
    invoke-static {v4, v0}, Lyyds/ᛳᛶᛷᛳ;->ᛲᲈᲁ(Landroid/graphics/Bitmap;Lyyds/ᛲᲇᛵᛵ;)V

    .line 758
    .line 759
    .line 760
    new-instance v0, Lyyds/ᛸᲀᛲ;

    .line 761
    .line 762
    invoke-direct {v0, v4, v7, v7}, Lyyds/ᛸᲀᛲ;-><init>(Landroid/graphics/Bitmap;ZZ)V

    .line 763
    .line 764
    .line 765
    goto :goto_12

    .line 766
    :cond_27
    :goto_10
    const-wide v1, -0x629bae68a836eL

    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    new-instance v2, Ljava/lang/StringBuilder;

    .line 776
    .line 777
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 778
    .line 779
    .line 780
    const-wide v8, -0x629cbe68a836eL

    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v3

    .line 789
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    const/16 v3, 0x78

    .line 800
    .line 801
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 805
    .line 806
    .line 807
    move-result v5

    .line 808
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    const-wide v8, -0x629e1e68a836eL

    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v5

    .line 820
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    .line 823
    iget v5, v0, Lyyds/ᛲᲇᛵᛵ;->ᛲᲈᲁ:I

    .line 824
    .line 825
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    iget v0, v0, Lyyds/ᛲᲇᛵᛵ;->ᛵᛸᛸᛷ:I

    .line 832
    .line 833
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 841
    .line 842
    .line 843
    new-instance v0, Lyyds/ᛸᲀᛲ;

    .line 844
    .line 845
    invoke-direct {v0, v4, v7, v6}, Lyyds/ᛸᲀᛲ;-><init>(Landroid/graphics/Bitmap;ZZ)V
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_a

    .line 846
    .line 847
    .line 848
    return-object v0

    .line 849
    :goto_11
    const-wide v1, -0x629eae68a836eL

    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    const-wide v2, -0x629fbe68a836eL

    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v2

    .line 867
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 868
    .line 869
    .line 870
    new-instance v0, Lyyds/ᛸᲀᛲ;

    .line 871
    .line 872
    invoke-direct {v0, v4, v7, v6}, Lyyds/ᛸᲀᛲ;-><init>(Landroid/graphics/Bitmap;ZZ)V

    .line 873
    .line 874
    .line 875
    :goto_12
    return-object v0

    .line 876
    :cond_28
    :goto_13
    new-instance v0, Lyyds/ᛸᲀᛲ;

    .line 877
    .line 878
    invoke-direct {v0, v4, v7, v6}, Lyyds/ᛸᲀᛲ;-><init>(Landroid/graphics/Bitmap;ZZ)V

    .line 879
    .line 880
    .line 881
    return-object v0

    .line 882
    :cond_29
    :goto_14
    new-instance v0, Lyyds/ᛸᲀᛲ;

    .line 883
    .line 884
    invoke-direct {v0, v4, v7, v6}, Lyyds/ᛸᲀᛲ;-><init>(Landroid/graphics/Bitmap;ZZ)V

    .line 885
    .line 886
    .line 887
    return-object v0
.end method
