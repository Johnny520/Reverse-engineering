.class public Lyyds/ᛲᲀᛴᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:I

.field public ᛲᛳᛶᲁ:[I

.field public ᛲᛴᛳᛲ:[I

.field public ᛲᲈᲁ:Lyyds/ᛳᲀᛷᛸ;

.field public ᛵᛸᛸᛷ:[I

.field public ᛶᛷᛲᲁ:S

.field public ᲀᛲᛳᲀ:[I

.field public ᲇᲇᲇᛱ:S

.field public ᲇᲈᛵᛷ:[I


# direct methods
.method public constructor <init>(Lyyds/ᛳᲀᛷᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᲈᲁ:Lyyds/ᛳᲀᛷᛸ;

    .line 5
    .line 6
    return-void
.end method

.method public static ᛱᲈᲁ(Lyyds/ᛶᲇᛸᛱ;I[II)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    aget v2, p2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v2, v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_9

    .line 11
    .line 12
    :cond_0
    const v4, 0x3ffffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v4, v1

    .line 16
    const v5, 0x400005

    .line 17
    .line 18
    .line 19
    if-ne v4, v5, :cond_2

    .line 20
    .line 21
    if-ne v2, v5, :cond_1

    .line 22
    .line 23
    goto/16 :goto_9

    .line 24
    .line 25
    :cond_1
    move v1, v5

    .line 26
    :cond_2
    const/4 v4, 0x1

    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    aput v1, p2, p3

    .line 30
    .line 31
    return v4

    .line 32
    :cond_3
    const/high16 v6, -0x4000000

    .line 33
    .line 34
    and-int v7, v2, v6

    .line 35
    .line 36
    const/high16 v8, 0x400000

    .line 37
    .line 38
    const/high16 v9, 0x3c00000

    .line 39
    .line 40
    const/high16 v10, 0x800000

    .line 41
    .line 42
    if-nez v7, :cond_7

    .line 43
    .line 44
    and-int v11, v2, v9

    .line 45
    .line 46
    if-ne v11, v10, :cond_4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    if-ne v2, v5, :cond_15

    .line 50
    .line 51
    and-int v0, v1, v6

    .line 52
    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    and-int v0, v1, v9

    .line 56
    .line 57
    if-ne v0, v10, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    move v1, v8

    .line 61
    :cond_6
    :goto_0
    move v8, v1

    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_7
    :goto_1
    if-ne v1, v5, :cond_8

    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_8
    const/high16 v5, -0x400000

    .line 69
    .line 70
    and-int v11, v1, v5

    .line 71
    .line 72
    and-int/2addr v5, v2

    .line 73
    const-string v12, "java/lang/Object"

    .line 74
    .line 75
    if-ne v11, v5, :cond_11

    .line 76
    .line 77
    and-int v5, v2, v9

    .line 78
    .line 79
    if-ne v5, v10, :cond_10

    .line 80
    .line 81
    and-int v5, v1, v6

    .line 82
    .line 83
    or-int/2addr v5, v10

    .line 84
    const v6, 0xfffff

    .line 85
    .line 86
    .line 87
    and-int/2addr v1, v6

    .line 88
    and-int/2addr v6, v2

    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const/16 v7, 0x20

    .line 93
    .line 94
    if-ge v1, v6, :cond_9

    .line 95
    .line 96
    int-to-long v8, v1

    .line 97
    int-to-long v10, v6

    .line 98
    :goto_2
    shl-long/2addr v10, v7

    .line 99
    or-long v7, v8, v10

    .line 100
    .line 101
    move-wide/from16 v16, v7

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_9
    int-to-long v8, v6

    .line 105
    int-to-long v10, v1

    .line 106
    goto :goto_2

    .line 107
    :goto_3
    add-int v7, v1, v6

    .line 108
    .line 109
    const v8, 0x7fffffff

    .line 110
    .line 111
    .line 112
    const/16 v9, 0x83

    .line 113
    .line 114
    add-int/2addr v7, v9

    .line 115
    and-int/2addr v7, v8

    .line 116
    invoke-virtual {v0, v7}, Lyyds/ᛶᲇᛸᛱ;->ᛱᛳᲇ(I)Lyyds/ᲇᛱ;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    :goto_4
    if-eqz v8, :cond_b

    .line 121
    .line 122
    iget v10, v8, Lyyds/ᲇᛱ;->ᛵᛸᛸᛷ:I

    .line 123
    .line 124
    if-ne v10, v9, :cond_a

    .line 125
    .line 126
    iget v10, v8, Lyyds/ᲇᛱ;->ᛱᲈᲁ:I

    .line 127
    .line 128
    if-ne v10, v7, :cond_a

    .line 129
    .line 130
    iget-wide v10, v8, Lyyds/ᲇᛱ;->ᲇᲇᲇᛱ:J

    .line 131
    .line 132
    cmp-long v10, v10, v16

    .line 133
    .line 134
    if-nez v10, :cond_a

    .line 135
    .line 136
    iget v0, v8, Lyyds/ᲇᛱ;->ᛶᛷᛲᲁ:I

    .line 137
    .line 138
    goto/16 :goto_6

    .line 139
    .line 140
    :cond_a
    iget-object v8, v8, Lyyds/ᲇᛱ;->ᛲᛳᛶᲁ:Lyyds/ᲇᛱ;

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_b
    iget-object v8, v0, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ:[Lyyds/ᲇᛱ;

    .line 144
    .line 145
    aget-object v1, v8, v1

    .line 146
    .line 147
    iget-object v1, v1, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 148
    .line 149
    aget-object v6, v8, v6

    .line 150
    .line 151
    iget-object v6, v6, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 152
    .line 153
    const-class v8, Lyyds/ᛵᛴᛵᲇ;

    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    const/16 v9, 0x2e

    .line 160
    .line 161
    const/16 v10, 0x2f

    .line 162
    .line 163
    :try_start_0
    invoke-virtual {v1, v10, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    invoke-static {v11, v3, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v11
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 171
    :try_start_1
    invoke-virtual {v6, v10, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    invoke-static {v13, v3, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 179
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 180
    .line 181
    .line 182
    move-result v13

    .line 183
    if-eqz v13, :cond_c

    .line 184
    .line 185
    move-object v12, v1

    .line 186
    goto :goto_5

    .line 187
    :cond_c
    invoke-virtual {v8, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_d

    .line 192
    .line 193
    move-object v12, v6

    .line 194
    goto :goto_5

    .line 195
    :cond_d
    invoke-virtual {v11}, Ljava/lang/Class;->isInterface()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-nez v1, :cond_f

    .line 200
    .line 201
    invoke-virtual {v8}, Ljava/lang/Class;->isInterface()Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-eqz v1, :cond_e

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_e
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_e

    .line 217
    .line 218
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1, v9, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    :cond_f
    :goto_5
    invoke-virtual {v0, v12}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    new-instance v13, Lyyds/ᲇᛱ;

    .line 231
    .line 232
    iget v14, v0, Lyyds/ᛶᲇᛸᛱ;->ᛷᲈᲈᲁ:I

    .line 233
    .line 234
    const/16 v15, 0x83

    .line 235
    .line 236
    move/from16 v18, v7

    .line 237
    .line 238
    invoke-direct/range {v13 .. v18}, Lyyds/ᲇᛱ;-><init>(IIJI)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v13}, Lyyds/ᛶᲇᛸᛱ;->ᛳᲁᲁᲇ(Lyyds/ᲇᛱ;)V

    .line 242
    .line 243
    .line 244
    iput v1, v13, Lyyds/ᲇᛱ;->ᛶᛷᛲᲁ:I

    .line 245
    .line 246
    move v0, v1

    .line 247
    :goto_6
    or-int v8, v5, v0

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :catch_0
    move-exception v0

    .line 251
    new-instance v1, Ljava/lang/TypeNotPresentException;

    .line 252
    .line 253
    invoke-direct {v1, v6, v0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    throw v1

    .line 257
    :catch_1
    move-exception v0

    .line 258
    new-instance v2, Ljava/lang/TypeNotPresentException;

    .line 259
    .line 260
    invoke-direct {v2, v1, v0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    throw v2

    .line 264
    :cond_10
    and-int/2addr v1, v6

    .line 265
    add-int/2addr v1, v6

    .line 266
    or-int/2addr v1, v10

    .line 267
    invoke-virtual {v0, v12}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    :goto_7
    or-int v8, v1, v0

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_11
    and-int v5, v1, v6

    .line 275
    .line 276
    if-nez v5, :cond_12

    .line 277
    .line 278
    and-int v11, v1, v9

    .line 279
    .line 280
    if-ne v11, v10, :cond_15

    .line 281
    .line 282
    :cond_12
    if-eqz v5, :cond_13

    .line 283
    .line 284
    and-int/2addr v1, v9

    .line 285
    if-eq v1, v10, :cond_13

    .line 286
    .line 287
    add-int/2addr v5, v6

    .line 288
    :cond_13
    if-eqz v7, :cond_14

    .line 289
    .line 290
    and-int v1, v2, v9

    .line 291
    .line 292
    if-eq v1, v10, :cond_14

    .line 293
    .line 294
    add-int/2addr v7, v6

    .line 295
    :cond_14
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    or-int/2addr v1, v10

    .line 300
    invoke-virtual {v0, v12}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    goto :goto_7

    .line 305
    :cond_15
    :goto_8
    if-eq v8, v2, :cond_16

    .line 306
    .line 307
    aput v8, p2, p3

    .line 308
    .line 309
    return v4

    .line 310
    :cond_16
    :goto_9
    return v3
.end method

.method public static ᲀᛲᛳᲀ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/Object;)I
    .locals 10

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/high16 p1, 0x400000

    .line 12
    .line 13
    :goto_0
    or-int/2addr p0, p1

    .line 14
    return p0

    .line 15
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    check-cast p1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/16 v3, 0x5b

    .line 28
    .line 29
    const/16 v4, 0xc

    .line 30
    .line 31
    if-ne v0, v3, :cond_1

    .line 32
    .line 33
    const/16 v0, 0x9

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v4

    .line 37
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/16 v5, 0xa

    .line 42
    .line 43
    if-ne v0, v5, :cond_2

    .line 44
    .line 45
    rsub-int/lit8 v0, v1, 0x0

    .line 46
    .line 47
    add-int/2addr v3, v1

    .line 48
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    if-ne v0, v4, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "L"

    .line 60
    .line 61
    const-string v1, ";"

    .line 62
    .line 63
    invoke-static {v0, p1, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_2
    invoke-static {p0, p1, v2}, Lyyds/ᛲᲀᛴᛳ;->ᲇᲈᛵᛷ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;I)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    return p0

    .line 77
    :cond_4
    check-cast p1, Lyyds/ᛳᲀᛷᛸ;

    .line 78
    .line 79
    iget-short v0, p1, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    .line 80
    .line 81
    and-int/lit8 v0, v0, 0x4

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    const-string v0, ""

    .line 86
    .line 87
    iget p1, p1, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ:I

    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛲᲈᲈ(ILjava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    const/high16 p1, 0xc00000

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    iget-object v0, p0, Lyyds/ᛶᲇᛸᛱ;->ᛱᛳᲇ:[Lyyds/ᛷᛸᛱᲈ;

    .line 97
    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    const/16 v0, 0x10

    .line 101
    .line 102
    new-array v3, v0, [Lyyds/ᛷᛸᛱᲈ;

    .line 103
    .line 104
    iput-object v3, p0, Lyyds/ᛶᲇᛸᛱ;->ᛱᛳᲇ:[Lyyds/ᛷᛸᛱᲈ;

    .line 105
    .line 106
    new-array v0, v0, [Lyyds/ᛷᛸᛱᲈ;

    .line 107
    .line 108
    iput-object v0, p0, Lyyds/ᛶᲇᛸᛱ;->ᛲᛲᲈᲈ:[Lyyds/ᛷᛸᛱᲈ;

    .line 109
    .line 110
    :cond_6
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-object v3, p0, Lyyds/ᛶᲇᛸᛱ;->ᛱᛳᲇ:[Lyyds/ᛷᛸᛱᲈ;

    .line 115
    .line 116
    array-length v4, v3

    .line 117
    rem-int v4, v0, v4

    .line 118
    .line 119
    aget-object v3, v3, v4

    .line 120
    .line 121
    :goto_3
    if-eqz v3, :cond_7

    .line 122
    .line 123
    iget-object v4, v3, Lyyds/ᛷᛸᛱᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Lyyds/ᛳᲀᛷᛸ;

    .line 126
    .line 127
    if-eq v4, p1, :cond_7

    .line 128
    .line 129
    iget-object v3, v3, Lyyds/ᛷᛸᛱᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v3, Lyyds/ᛷᛸᛱᲈ;

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    if-eqz v3, :cond_8

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_8
    iget v3, p0, Lyyds/ᛶᲇᛸᛱ;->ᛷᛵᲇᲀ:I

    .line 138
    .line 139
    iget-object v4, p0, Lyyds/ᛶᲇᛸᛱ;->ᛱᛳᲇ:[Lyyds/ᛷᛸᛱᲈ;

    .line 140
    .line 141
    array-length v5, v4

    .line 142
    mul-int/lit8 v5, v5, 0x3

    .line 143
    .line 144
    div-int/lit8 v5, v5, 0x4

    .line 145
    .line 146
    if-le v3, v5, :cond_b

    .line 147
    .line 148
    array-length v3, v4

    .line 149
    mul-int/lit8 v4, v3, 0x2

    .line 150
    .line 151
    add-int/2addr v4, v1

    .line 152
    new-array v5, v4, [Lyyds/ᛷᛸᛱᲈ;

    .line 153
    .line 154
    sub-int/2addr v3, v1

    .line 155
    :goto_4
    if-ltz v3, :cond_a

    .line 156
    .line 157
    iget-object v1, p0, Lyyds/ᛶᲇᛸᛱ;->ᛱᛳᲇ:[Lyyds/ᛷᛸᛱᲈ;

    .line 158
    .line 159
    aget-object v1, v1, v3

    .line 160
    .line 161
    :goto_5
    if-eqz v1, :cond_9

    .line 162
    .line 163
    iget-object v6, v1, Lyyds/ᛷᛸᛱᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v6, Lyyds/ᛳᲀᛷᛸ;

    .line 166
    .line 167
    invoke-static {v6}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    rem-int/2addr v6, v4

    .line 172
    iget-object v7, v1, Lyyds/ᛷᛸᛱᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v7, Lyyds/ᛷᛸᛱᲈ;

    .line 175
    .line 176
    aget-object v8, v5, v6

    .line 177
    .line 178
    iput-object v8, v1, Lyyds/ᛷᛸᛱᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 179
    .line 180
    aput-object v1, v5, v6

    .line 181
    .line 182
    move-object v1, v7

    .line 183
    goto :goto_5

    .line 184
    :cond_9
    add-int/lit8 v3, v3, -0x1

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_a
    iput-object v5, p0, Lyyds/ᛶᲇᛸᛱ;->ᛱᛳᲇ:[Lyyds/ᛷᛸᛱᲈ;

    .line 188
    .line 189
    :cond_b
    iget v1, p0, Lyyds/ᛶᲇᛸᛱ;->ᛷᛵᲇᲀ:I

    .line 190
    .line 191
    iget-object v3, p0, Lyyds/ᛶᲇᛸᛱ;->ᛲᛲᲈᲈ:[Lyyds/ᛷᛸᛱᲈ;

    .line 192
    .line 193
    array-length v4, v3

    .line 194
    if-ne v1, v4, :cond_c

    .line 195
    .line 196
    array-length v1, v3

    .line 197
    mul-int/lit8 v1, v1, 0x2

    .line 198
    .line 199
    new-array v1, v1, [Lyyds/ᛷᛸᛱᲈ;

    .line 200
    .line 201
    array-length v4, v3

    .line 202
    invoke-static {v3, v2, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 203
    .line 204
    .line 205
    iput-object v1, p0, Lyyds/ᛶᲇᛸᛱ;->ᛲᛲᲈᲈ:[Lyyds/ᛷᛸᛱᲈ;

    .line 206
    .line 207
    move-object v3, v1

    .line 208
    :cond_c
    new-instance v1, Lyyds/ᛷᛸᛱᲈ;

    .line 209
    .line 210
    iget v2, p0, Lyyds/ᛶᲇᛸᛱ;->ᛷᛵᲇᲀ:I

    .line 211
    .line 212
    invoke-direct {v1, v2, p1}, Lyyds/ᛷᛸᛱᲈ;-><init>(ILyyds/ᛳᲀᛷᛸ;)V

    .line 213
    .line 214
    .line 215
    iget-object p1, p0, Lyyds/ᛶᲇᛸᛱ;->ᛱᛳᲇ:[Lyyds/ᛷᛸᛱᲈ;

    .line 216
    .line 217
    array-length v4, p1

    .line 218
    rem-int/2addr v0, v4

    .line 219
    aget-object v4, p1, v0

    .line 220
    .line 221
    iput-object v4, v1, Lyyds/ᛷᛸᛱᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 222
    .line 223
    aput-object v1, p1, v0

    .line 224
    .line 225
    add-int/lit8 p1, v2, 0x1

    .line 226
    .line 227
    iput p1, p0, Lyyds/ᛶᲇᛸᛱ;->ᛷᛵᲇᲀ:I

    .line 228
    .line 229
    aput-object v1, v3, v2

    .line 230
    .line 231
    move-object v3, v1

    .line 232
    :goto_6
    iget p1, v3, Lyyds/ᛷᛸᛱᲈ;->ᛵᛸᛸᛷ:I

    .line 233
    .line 234
    const v0, 0x7fffffff

    .line 235
    .line 236
    .line 237
    const/16 v1, 0x82

    .line 238
    .line 239
    add-int v2, v1, p1

    .line 240
    .line 241
    and-int v9, v2, v0

    .line 242
    .line 243
    invoke-virtual {p0, v9}, Lyyds/ᛶᲇᛸᛱ;->ᛱᛳᲇ(I)Lyyds/ᲇᛱ;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    :goto_7
    const-string v6, ""

    .line 248
    .line 249
    if-eqz v0, :cond_e

    .line 250
    .line 251
    iget v2, v0, Lyyds/ᲇᛱ;->ᛵᛸᛸᛷ:I

    .line 252
    .line 253
    if-ne v2, v1, :cond_d

    .line 254
    .line 255
    iget v2, v0, Lyyds/ᲇᛱ;->ᛱᲈᲁ:I

    .line 256
    .line 257
    if-ne v2, v9, :cond_d

    .line 258
    .line 259
    iget-wide v2, v0, Lyyds/ᲇᛱ;->ᲇᲇᲇᛱ:J

    .line 260
    .line 261
    int-to-long v4, p1

    .line 262
    cmp-long v2, v2, v4

    .line 263
    .line 264
    if-nez v2, :cond_d

    .line 265
    .line 266
    iget-object v2, v0, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_d

    .line 273
    .line 274
    iget p0, v0, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_d
    iget-object v0, v0, Lyyds/ᲇᛱ;->ᛲᛳᛶᲁ:Lyyds/ᲇᛱ;

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_e
    new-instance v3, Lyyds/ᲇᛱ;

    .line 281
    .line 282
    iget v4, p0, Lyyds/ᛶᲇᛸᛱ;->ᛷᲈᲈᲁ:I

    .line 283
    .line 284
    const/16 v5, 0x82

    .line 285
    .line 286
    int-to-long v7, p1

    .line 287
    invoke-direct/range {v3 .. v9}, Lyyds/ᲇᛱ;-><init>(IILjava/lang/String;JI)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, v3}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛵᲇᲀ(Lyyds/ᲇᛱ;)I

    .line 291
    .line 292
    .line 293
    move-result p0

    .line 294
    :goto_8
    const/high16 p1, 0x1000000

    .line 295
    .line 296
    goto/16 :goto_0
.end method

.method public static ᲇᲈᛵᛷ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;I)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p2}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v4, 0x46

    .line 10
    .line 11
    if-eq v2, v4, :cond_c

    .line 12
    .line 13
    const/high16 v5, 0x800000

    .line 14
    .line 15
    const/16 v6, 0x4c

    .line 16
    .line 17
    if-eq v2, v6, :cond_b

    .line 18
    .line 19
    const v7, 0x400001

    .line 20
    .line 21
    .line 22
    const/16 v8, 0x53

    .line 23
    .line 24
    if-eq v2, v8, :cond_a

    .line 25
    .line 26
    const/16 v9, 0x56

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    if-eq v2, v9, :cond_9

    .line 30
    .line 31
    const/16 v9, 0x49

    .line 32
    .line 33
    if-eq v2, v9, :cond_a

    .line 34
    .line 35
    const v11, 0x400004

    .line 36
    .line 37
    .line 38
    const/16 v12, 0x4a

    .line 39
    .line 40
    if-eq v2, v12, :cond_8

    .line 41
    .line 42
    const/16 v13, 0x5a

    .line 43
    .line 44
    if-eq v2, v13, :cond_a

    .line 45
    .line 46
    const v14, 0x400003

    .line 47
    .line 48
    .line 49
    const/16 v15, 0x5b

    .line 50
    .line 51
    if-eq v2, v15, :cond_0

    .line 52
    .line 53
    packed-switch v2, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {p1 .. p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "Invalid descriptor: "

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return v10

    .line 70
    :pswitch_0
    return v14

    .line 71
    :cond_0
    add-int/lit8 v2, p2, 0x1

    .line 72
    .line 73
    const v16, 0x400002

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-ne v3, v15, :cond_1

    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eq v3, v4, :cond_7

    .line 90
    .line 91
    if-eq v3, v6, :cond_6

    .line 92
    .line 93
    if-eq v3, v8, :cond_5

    .line 94
    .line 95
    if-eq v3, v13, :cond_4

    .line 96
    .line 97
    if-eq v3, v9, :cond_3

    .line 98
    .line 99
    if-eq v3, v12, :cond_2

    .line 100
    .line 101
    packed-switch v3, :pswitch_data_1

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "Invalid descriptor fragment: "

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return v10

    .line 118
    :pswitch_1
    move v3, v14

    .line 119
    goto :goto_1

    .line 120
    :pswitch_2
    const v3, 0x40000b

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_3
    const v3, 0x40000a

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    move v3, v11

    .line 129
    goto :goto_1

    .line 130
    :cond_3
    move v3, v7

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const v3, 0x400009

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_5
    const v3, 0x40000c

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    add-int/lit8 v3, v2, 0x1

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    add-int/lit8 v4, v4, -0x1

    .line 147
    .line 148
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v0, v1}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    or-int v3, v0, v5

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_7
    move/from16 v3, v16

    .line 160
    .line 161
    :goto_1
    sub-int v2, v2, p2

    .line 162
    .line 163
    shl-int/lit8 v0, v2, 0x1a

    .line 164
    .line 165
    or-int/2addr v0, v3

    .line 166
    return v0

    .line 167
    :cond_8
    return v11

    .line 168
    :cond_9
    return v10

    .line 169
    :cond_a
    :pswitch_4
    return v7

    .line 170
    :cond_b
    add-int/lit8 v2, p2, 0x1

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    add-int/lit8 v3, v3, -0x1

    .line 177
    .line 178
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0, v1}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    or-int/2addr v0, v5

    .line 187
    return v0

    .line 188
    :cond_c
    const v16, 0x400002

    .line 189
    .line 190
    .line 191
    return v16

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final ᛱᛳᲇ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/16 v2, 0x28

    .line 7
    .line 8
    if-ne v1, v2, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    move v1, v0

    .line 12
    :goto_0
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/16 v3, 0x29

    .line 17
    .line 18
    if-eq v2, v3, :cond_2

    .line 19
    .line 20
    :goto_1
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v3, 0x5b

    .line 25
    .line 26
    if-ne v2, v3, :cond_0

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 32
    .line 33
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v3, 0x4c

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    const/16 v1, 0x3b

    .line 42
    .line 43
    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->indexOf(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v1, v0

    .line 48
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v1, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    add-int/2addr v0, v1

    .line 56
    :cond_3
    invoke-static {p1, p2, v0}, Lyyds/ᛲᲀᛴᛳ;->ᲇᲈᛵᛷ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 63
    .line 64
    .line 65
    const p2, 0x400004

    .line 66
    .line 67
    .line 68
    if-eq p1, p2, :cond_4

    .line 69
    .line 70
    const p2, 0x400003

    .line 71
    .line 72
    .line 73
    if-ne p1, p2, :cond_5

    .line 74
    .line 75
    :cond_4
    const/high16 p1, 0x400000

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 78
    .line 79
    .line 80
    :cond_5
    return-void
.end method

.method public final ᛲᛲᲈᲈ(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛴᛳᛲ:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛴᛳᛲ:[I

    .line 10
    .line 11
    :cond_0
    array-length v1, v0

    .line 12
    iget-short v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 13
    .line 14
    if-lt v2, v1, :cond_1

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    mul-int/lit8 v0, v1, 0x2

    .line 19
    .line 20
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    new-array v0, v0, [I

    .line 25
    .line 26
    iget-object v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛴᛳᛲ:[I

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {v2, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛴᛳᛲ:[I

    .line 33
    .line 34
    :cond_1
    iget-short v1, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 35
    .line 36
    add-int/lit8 v2, v1, 0x1

    .line 37
    .line 38
    int-to-short v2, v2

    .line 39
    iput-short v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 40
    .line 41
    aput p1, v0, v1

    .line 42
    .line 43
    iget-short p1, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲇᲇᛱ:S

    .line 44
    .line 45
    add-int/2addr p1, v2

    .line 46
    int-to-short p1, p1

    .line 47
    iget-object p0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᲈᲁ:Lyyds/ᛳᲀᛷᛸ;

    .line 48
    .line 49
    iget-short v0, p0, Lyyds/ᛳᲀᛷᛸ;->ᛱᲈᲁ:S

    .line 50
    .line 51
    if-le p1, v0, :cond_2

    .line 52
    .line 53
    iput-short p1, p0, Lyyds/ᛳᲀᛷᛸ;->ᛱᲈᲁ:S

    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᛶᲇᛸᛱ;Lyyds/ᛲᲀᛴᛳ;I)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget-object v1, p0, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 5
    .line 6
    array-length v1, v1

    .line 7
    iget-object v2, p2, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-array v2, v0, [I

    .line 14
    .line 15
    iput-object v2, p2, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 16
    .line 17
    move v2, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v4

    .line 20
    :goto_0
    move v5, v4

    .line 21
    :goto_1
    if-ge v5, v0, :cond_4

    .line 22
    .line 23
    iget-object v6, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 24
    .line 25
    if-eqz v6, :cond_2

    .line 26
    .line 27
    array-length v7, v6

    .line 28
    if-ge v5, v7, :cond_2

    .line 29
    .line 30
    aget v6, v6, v5

    .line 31
    .line 32
    if-nez v6, :cond_1

    .line 33
    .line 34
    iget-object v6, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 35
    .line 36
    aget v6, v6, v5

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-virtual {p0, v6, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛴᛳᛲ(II)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    iget-object v6, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 45
    .line 46
    aget v6, v6, v5

    .line 47
    .line 48
    :goto_2
    iget-object v7, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛳᛶᲁ:[I

    .line 49
    .line 50
    if-eqz v7, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, p1, v6}, Lyyds/ᛲᲀᛴᛳ;->ᲇᲇᲇᛱ(Lyyds/ᛶᲇᛸᛱ;I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    :cond_3
    iget-object v7, p2, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 57
    .line 58
    invoke-static {p1, v6, v7, v5}, Lyyds/ᛲᲀᛴᛳ;->ᛱᲈᲁ(Lyyds/ᛶᲇᛸᛱ;I[II)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    or-int/2addr v2, v6

    .line 63
    add-int/lit8 v5, v5, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    if-lez p3, :cond_7

    .line 67
    .line 68
    move v1, v4

    .line 69
    :goto_3
    if-ge v1, v0, :cond_5

    .line 70
    .line 71
    iget-object v5, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 72
    .line 73
    aget v5, v5, v1

    .line 74
    .line 75
    iget-object v6, p2, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 76
    .line 77
    invoke-static {p1, v5, v6, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛱᲈᲁ(Lyyds/ᛶᲇᛸᛱ;I[II)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    or-int/2addr v2, v5

    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    iget-object p0, p2, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 86
    .line 87
    if-nez p0, :cond_6

    .line 88
    .line 89
    new-array p0, v3, [I

    .line 90
    .line 91
    iput-object p0, p2, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    move v3, v2

    .line 95
    :goto_4
    invoke-static {p1, p3, p0, v4}, Lyyds/ᛲᲀᛴᛳ;->ᛱᲈᲁ(Lyyds/ᛶᲇᛸᛱ;I[II)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    or-int/2addr p0, v3

    .line 100
    return p0

    .line 101
    :cond_7
    iget-object p3, p0, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 102
    .line 103
    array-length p3, p3

    .line 104
    iget-short v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲇᲇᛱ:S

    .line 105
    .line 106
    add-int/2addr p3, v0

    .line 107
    iget-object v0, p2, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 108
    .line 109
    if-nez v0, :cond_8

    .line 110
    .line 111
    iget-short v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 112
    .line 113
    add-int/2addr v0, p3

    .line 114
    new-array v0, v0, [I

    .line 115
    .line 116
    iput-object v0, p2, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_8
    move v3, v2

    .line 120
    :goto_5
    move v0, v4

    .line 121
    :goto_6
    if-ge v0, p3, :cond_a

    .line 122
    .line 123
    iget-object v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 124
    .line 125
    aget v2, v2, v0

    .line 126
    .line 127
    iget-object v5, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛳᛶᲁ:[I

    .line 128
    .line 129
    if-eqz v5, :cond_9

    .line 130
    .line 131
    invoke-virtual {p0, p1, v2}, Lyyds/ᛲᲀᛴᛳ;->ᲇᲇᲇᛱ(Lyyds/ᛶᲇᛸᛱ;I)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    :cond_9
    iget-object v5, p2, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 136
    .line 137
    invoke-static {p1, v2, v5, v0}, Lyyds/ᛲᲀᛴᛳ;->ᛱᲈᲁ(Lyyds/ᛶᲇᛸᛱ;I[II)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    or-int/2addr v3, v2

    .line 142
    add-int/lit8 v0, v0, 0x1

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_a
    :goto_7
    iget-short v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 146
    .line 147
    if-ge v4, v0, :cond_c

    .line 148
    .line 149
    iget-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛴᛳᛲ:[I

    .line 150
    .line 151
    aget v0, v0, v4

    .line 152
    .line 153
    invoke-virtual {p0, v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛴᛳᛲ(II)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    iget-object v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛳᛶᲁ:[I

    .line 158
    .line 159
    if-eqz v2, :cond_b

    .line 160
    .line 161
    invoke-virtual {p0, p1, v0}, Lyyds/ᛲᲀᛴᛳ;->ᲇᲇᲇᛱ(Lyyds/ᛶᲇᛸᛱ;I)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    :cond_b
    iget-object v2, p2, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 166
    .line 167
    add-int v5, p3, v4

    .line 168
    .line 169
    invoke-static {p1, v0, v2, v5}, Lyyds/ᛲᲀᛴᛳ;->ᛱᲈᲁ(Lyyds/ᛶᲇᛸᛱ;I[II)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    or-int/2addr v3, v0

    .line 174
    add-int/lit8 v4, v4, 0x1

    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_c
    return v3
.end method

.method public final ᛲᛴᛳᛲ(II)I
    .locals 8

    .line 1
    const/high16 v0, -0x4000000

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    const/high16 v1, 0x3c00000

    .line 5
    .line 6
    and-int/2addr v1, p1

    .line 7
    const/high16 v2, 0x1400000

    .line 8
    .line 9
    const/high16 v3, 0x400000

    .line 10
    .line 11
    const v4, 0x400003

    .line 12
    .line 13
    .line 14
    const v5, 0x400004

    .line 15
    .line 16
    .line 17
    const/high16 v6, 0x100000

    .line 18
    .line 19
    const v7, 0xfffff

    .line 20
    .line 21
    .line 22
    if-ne v1, v2, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 25
    .line 26
    and-int p2, p1, v7

    .line 27
    .line 28
    aget p0, p0, p2

    .line 29
    .line 30
    add-int/2addr v0, p0

    .line 31
    and-int p0, p1, v6

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    if-eq v0, v5, :cond_0

    .line 36
    .line 37
    if-ne v0, v4, :cond_1

    .line 38
    .line 39
    :cond_0
    return v3

    .line 40
    :cond_1
    return v0

    .line 41
    :cond_2
    const/high16 v2, 0x1800000

    .line 42
    .line 43
    if-ne v1, v2, :cond_5

    .line 44
    .line 45
    iget-object p0, p0, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 46
    .line 47
    and-int v1, p1, v7

    .line 48
    .line 49
    sub-int/2addr p2, v1

    .line 50
    aget p0, p0, p2

    .line 51
    .line 52
    add-int/2addr v0, p0

    .line 53
    and-int p0, p1, v6

    .line 54
    .line 55
    if-eqz p0, :cond_4

    .line 56
    .line 57
    if-eq v0, v5, :cond_3

    .line 58
    .line 59
    if-ne v0, v4, :cond_4

    .line 60
    .line 61
    :cond_3
    return v3

    .line 62
    :cond_4
    return v0

    .line 63
    :cond_5
    return p1
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛶᲀᛱᛵ;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    :goto_0
    array-length v5, v0

    .line 8
    const/4 v6, 0x2

    .line 9
    const v7, 0x400003

    .line 10
    .line 11
    .line 12
    const v8, 0x400004

    .line 13
    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    if-ge v2, v5, :cond_3

    .line 17
    .line 18
    aget v5, v0, v2

    .line 19
    .line 20
    if-eq v5, v8, :cond_1

    .line 21
    .line 22
    if-ne v5, v7, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v6, v9

    .line 26
    :cond_1
    :goto_1
    add-int/2addr v2, v6

    .line 27
    const/high16 v6, 0x400000

    .line 28
    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    add-int/2addr v3, v4

    .line 37
    move v4, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    iget-object v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 40
    .line 41
    move v4, v1

    .line 42
    move v5, v4

    .line 43
    :goto_2
    array-length v10, v2

    .line 44
    if-ge v4, v10, :cond_6

    .line 45
    .line 46
    aget v10, v2, v4

    .line 47
    .line 48
    if-eq v10, v8, :cond_5

    .line 49
    .line 50
    if-ne v10, v7, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    move v10, v9

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    :goto_3
    move v10, v6

    .line 56
    :goto_4
    add-int/2addr v4, v10

    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_6
    iget-object p0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᲈᲁ:Lyyds/ᛳᲀᛷᛸ;

    .line 61
    .line 62
    iget p0, p0, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ:I

    .line 63
    .line 64
    invoke-virtual {p1, p0, v3, v5}, Lyyds/ᛶᲀᛱᛵ;->ᛱᲈᲁ(III)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x3

    .line 68
    move v4, v1

    .line 69
    :goto_5
    add-int/lit8 v10, v3, -0x1

    .line 70
    .line 71
    if-lez v3, :cond_9

    .line 72
    .line 73
    aget v3, v0, v4

    .line 74
    .line 75
    if-eq v3, v8, :cond_8

    .line 76
    .line 77
    if-ne v3, v7, :cond_7

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_7
    move v11, v9

    .line 81
    goto :goto_7

    .line 82
    :cond_8
    :goto_6
    move v11, v6

    .line 83
    :goto_7
    add-int/2addr v4, v11

    .line 84
    add-int/lit8 v11, p0, 0x1

    .line 85
    .line 86
    iget-object v12, p1, Lyyds/ᛶᲀᛱᛵ;->ᛳᛷᛶᛲ:[I

    .line 87
    .line 88
    aput v3, v12, p0

    .line 89
    .line 90
    move v3, v10

    .line 91
    move p0, v11

    .line 92
    goto :goto_5

    .line 93
    :cond_9
    :goto_8
    add-int/lit8 v0, v5, -0x1

    .line 94
    .line 95
    if-lez v5, :cond_c

    .line 96
    .line 97
    aget v3, v2, v1

    .line 98
    .line 99
    if-eq v3, v8, :cond_b

    .line 100
    .line 101
    if-ne v3, v7, :cond_a

    .line 102
    .line 103
    goto :goto_9

    .line 104
    :cond_a
    move v4, v9

    .line 105
    goto :goto_a

    .line 106
    :cond_b
    :goto_9
    move v4, v6

    .line 107
    :goto_a
    add-int/2addr v1, v4

    .line 108
    add-int/lit8 v4, p0, 0x1

    .line 109
    .line 110
    iget-object v5, p1, Lyyds/ᛶᲀᛱᛵ;->ᛳᛷᛶᛲ:[I

    .line 111
    .line 112
    aput v3, v5, p0

    .line 113
    .line 114
    move v5, v0

    .line 115
    move p0, v4

    .line 116
    goto :goto_8

    .line 117
    :cond_c
    invoke-virtual {p1}, Lyyds/ᛶᲀᛱᛵ;->ᛶᛷᛲᲁ()V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public final ᛳᲁᲁᲇ(Lyyds/ᛶᲇᛸᛱ;ILjava/lang/String;I)V
    .locals 9

    .line 1
    new-array v0, p4, [I

    .line 2
    .line 3
    iput-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [I

    .line 7
    .line 8
    iput-object v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 9
    .line 10
    and-int/lit8 v2, p2, 0x8

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    const/high16 v2, 0x40000

    .line 16
    .line 17
    and-int/2addr p2, v2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    iget-object p2, p1, Lyyds/ᛶᲇᛸᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const/high16 v2, 0x800000

    .line 27
    .line 28
    or-int/2addr p2, v2

    .line 29
    aput p2, v0, v1

    .line 30
    .line 31
    :goto_0
    move p2, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const p2, 0x400006

    .line 34
    .line 35
    .line 36
    aput p2, v0, v1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move p2, v1

    .line 40
    :goto_1
    invoke-static {p3}, Lyyds/ᛶᛳᲇᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    new-array v2, v0, [Lyyds/ᛶᛳᲇᛳ;

    .line 45
    .line 46
    move v5, v1

    .line 47
    move v4, v3

    .line 48
    :goto_2
    invoke-virtual {p3, v4}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const/16 v7, 0x29

    .line 53
    .line 54
    if-eq v6, v7, :cond_4

    .line 55
    .line 56
    move v6, v4

    .line 57
    :goto_3
    invoke-virtual {p3, v6}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    const/16 v8, 0x5b

    .line 62
    .line 63
    if-ne v7, v8, :cond_2

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    add-int/lit8 v7, v6, 0x1

    .line 69
    .line 70
    invoke-virtual {p3, v6}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const/16 v8, 0x4c

    .line 75
    .line 76
    if-ne v6, v8, :cond_3

    .line 77
    .line 78
    const/16 v6, 0x3b

    .line 79
    .line 80
    invoke-virtual {p3, v6, v7}, Ljava/lang/String;->indexOf(II)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    add-int/2addr v6, v3

    .line 85
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    :cond_3
    add-int/lit8 v6, v5, 0x1

    .line 90
    .line 91
    invoke-static {p3, v4, v7}, Lyyds/ᛶᛳᲇᛳ;->ᛱᲈᲁ(Ljava/lang/String;II)Lyyds/ᛶᛳᲇᛳ;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    aput-object v4, v2, v5

    .line 96
    .line 97
    move v5, v6

    .line 98
    move v4, v7

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    move p3, v1

    .line 101
    :goto_4
    const/high16 v3, 0x400000

    .line 102
    .line 103
    if-ge p3, v0, :cond_7

    .line 104
    .line 105
    aget-object v4, v2, p3

    .line 106
    .line 107
    invoke-virtual {v4}, Lyyds/ᛶᛳᲇᛳ;->ᲇᲈᛵᛷ()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-static {p1, v4, v1}, Lyyds/ᛲᲀᛴᛳ;->ᲇᲈᛵᛷ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;I)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    iget-object v5, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 116
    .line 117
    add-int/lit8 v6, p2, 0x1

    .line 118
    .line 119
    aput v4, v5, p2

    .line 120
    .line 121
    const v7, 0x400004

    .line 122
    .line 123
    .line 124
    if-eq v4, v7, :cond_6

    .line 125
    .line 126
    const v7, 0x400003

    .line 127
    .line 128
    .line 129
    if-ne v4, v7, :cond_5

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_5
    move p2, v6

    .line 133
    goto :goto_6

    .line 134
    :cond_6
    :goto_5
    add-int/lit8 p2, p2, 0x2

    .line 135
    .line 136
    aput v3, v5, v6

    .line 137
    .line 138
    :goto_6
    add-int/lit8 p3, p3, 0x1

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_7
    :goto_7
    if-ge p2, p4, :cond_8

    .line 142
    .line 143
    iget-object p1, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 144
    .line 145
    add-int/lit8 p3, p2, 0x1

    .line 146
    .line 147
    aput v3, p1, p2

    .line 148
    .line 149
    move p2, p3

    .line 150
    goto :goto_7

    .line 151
    :cond_8
    return-void
.end method

.method public ᛵᛸᛸᛷ(IILyyds/ᲇᛱ;Lyyds/ᛶᲇᛸᛱ;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    const v5, 0x400005

    .line 12
    .line 13
    .line 14
    const v6, 0x400002

    .line 15
    .line 16
    .line 17
    const v8, 0x400001

    .line 18
    .line 19
    .line 20
    const v9, 0x400003

    .line 21
    .line 22
    .line 23
    const v10, 0x400004

    .line 24
    .line 25
    .line 26
    const/high16 v11, 0x400000

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    packed-switch v1, :pswitch_data_1

    .line 32
    .line 33
    .line 34
    const/high16 v13, 0x1800000

    .line 35
    .line 36
    const/high16 v14, 0x1400000

    .line 37
    .line 38
    const/high16 v15, 0x3c00000

    .line 39
    .line 40
    const/high16 v16, 0x800000

    .line 41
    .line 42
    const/4 v7, 0x2

    .line 43
    const/high16 v17, 0x100000

    .line 44
    .line 45
    const/4 v12, 0x1

    .line 46
    packed-switch v1, :pswitch_data_2

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x3

    .line 50
    const/16 v13, 0x5b

    .line 51
    .line 52
    const/4 v14, 0x4

    .line 53
    const/4 v15, 0x0

    .line 54
    packed-switch v1, :pswitch_data_3

    .line 55
    .line 56
    .line 57
    packed-switch v1, :pswitch_data_4

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_0
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 65
    .line 66
    .line 67
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v4, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛱᛳᲇ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_1
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ne v2, v13, :cond_0

    .line 83
    .line 84
    invoke-virtual {v0, v4, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛱᛳᲇ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_0
    invoke-virtual {v4, v1}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    or-int v1, v1, v16

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_2
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-ne v2, v13, :cond_1

    .line 108
    .line 109
    const-string v2, "["

    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0, v4, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛱᛳᲇ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_1
    const/high16 v2, 0x4800000

    .line 120
    .line 121
    invoke-virtual {v4, v1}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    or-int/2addr v1, v2

    .line 126
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_3
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 131
    .line 132
    .line 133
    packed-switch v2, :pswitch_data_5

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :pswitch_4
    const v1, 0x4400004

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_5
    const v1, 0x4400001

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_6
    const v1, 0x440000c

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_7
    const v1, 0x440000a

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_8
    const v1, 0x4400003

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_9
    const v1, 0x4400002

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_a
    const v1, 0x440000b

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_b
    const v1, 0x4400009

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_c
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v4, v2, v1}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛲᲈᲈ(ILjava/lang/String;)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    const/high16 v2, 0xc00000

    .line 203
    .line 204
    or-int/2addr v1, v2

    .line 205
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :pswitch_d
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {v0, v4, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛱᛳᲇ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_e
    iget-object v2, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const/16 v2, 0xb8

    .line 226
    .line 227
    if-eq v1, v2, :cond_4

    .line 228
    .line 229
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    const/16 v5, 0xb7

    .line 234
    .line 235
    if-ne v1, v5, :cond_4

    .line 236
    .line 237
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    const/16 v5, 0x3c

    .line 244
    .line 245
    if-ne v1, v5, :cond_4

    .line 246
    .line 247
    iget-object v1, v0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛳᛶᲁ:[I

    .line 248
    .line 249
    if-nez v1, :cond_2

    .line 250
    .line 251
    new-array v1, v7, [I

    .line 252
    .line 253
    iput-object v1, v0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛳᛶᲁ:[I

    .line 254
    .line 255
    :cond_2
    array-length v5, v1

    .line 256
    iget v6, v0, Lyyds/ᛲᲀᛴᛳ;->ᛱᲈᲁ:I

    .line 257
    .line 258
    if-lt v6, v5, :cond_3

    .line 259
    .line 260
    add-int/2addr v6, v12

    .line 261
    mul-int/lit8 v1, v5, 0x2

    .line 262
    .line 263
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    new-array v1, v1, [I

    .line 268
    .line 269
    iget-object v6, v0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛳᛶᲁ:[I

    .line 270
    .line 271
    invoke-static {v6, v15, v1, v15, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 272
    .line 273
    .line 274
    iput-object v1, v0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛳᛶᲁ:[I

    .line 275
    .line 276
    :cond_3
    iget v5, v0, Lyyds/ᛲᲀᛴᛳ;->ᛱᲈᲁ:I

    .line 277
    .line 278
    add-int/lit8 v6, v5, 0x1

    .line 279
    .line 280
    iput v6, v0, Lyyds/ᛲᲀᛴᛳ;->ᛱᲈᲁ:I

    .line 281
    .line 282
    aput v2, v1, v5

    .line 283
    .line 284
    :cond_4
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v0, v4, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛱᛳᲇ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :pswitch_f
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_10
    invoke-virtual {v0, v12}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 300
    .line 301
    .line 302
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v0, v4, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛱᛳᲇ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :pswitch_11
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :pswitch_12
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {v0, v4, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛱᛳᲇ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :pswitch_13
    const-string v0, "JSR/RET are not supported with computeFrames option"

    .line 321
    .line 322
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :pswitch_14
    invoke-virtual {v0, v14}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v8}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_15
    invoke-virtual {v0, v12}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v8}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :pswitch_16
    invoke-virtual {v0, v12}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v9}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :pswitch_17
    invoke-virtual {v0, v12}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v6}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :pswitch_18
    invoke-virtual {v0, v12}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v10}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :pswitch_19
    invoke-virtual {v0, v2, v8}, Lyyds/ᛲᲀᛴᛳ;->ᲇᛱᛲ(II)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :pswitch_1a
    invoke-virtual {v0, v5}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v10}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :pswitch_1b
    invoke-virtual {v0, v14}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v9}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 388
    .line 389
    .line 390
    return-void

    .line 391
    :pswitch_1c
    invoke-virtual {v0, v14}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v10}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :pswitch_1d
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 413
    .line 414
    .line 415
    return-void

    .line 416
    :pswitch_1e
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v4}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v3}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 448
    .line 449
    .line 450
    return-void

    .line 451
    :pswitch_1f
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0, v3}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 476
    .line 477
    .line 478
    return-void

    .line 479
    :pswitch_20
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :pswitch_21
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0, v3}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :pswitch_22
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 530
    .line 531
    .line 532
    move-result v2

    .line 533
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 540
    .line 541
    .line 542
    return-void

    .line 543
    :pswitch_23
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 551
    .line 552
    .line 553
    return-void

    .line 554
    :pswitch_24
    invoke-virtual {v0, v7}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 555
    .line 556
    .line 557
    return-void

    .line 558
    :pswitch_25
    invoke-virtual {v0, v12}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 559
    .line 560
    .line 561
    return-void

    .line 562
    :pswitch_26
    invoke-virtual {v0, v14}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 563
    .line 564
    .line 565
    return-void

    .line 566
    :pswitch_27
    invoke-virtual {v0, v5}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 567
    .line 568
    .line 569
    return-void

    .line 570
    :pswitch_28
    invoke-virtual {v0, v12}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    invoke-virtual {v0, v2, v1}, Lyyds/ᛲᲀᛴᛳ;->ᲇᛱᛲ(II)V

    .line 578
    .line 579
    .line 580
    add-int/lit8 v1, v2, 0x1

    .line 581
    .line 582
    invoke-virtual {v0, v1, v11}, Lyyds/ᛲᲀᛴᛳ;->ᲇᛱᛲ(II)V

    .line 583
    .line 584
    .line 585
    if-lez v2, :cond_c

    .line 586
    .line 587
    add-int/lit8 v1, v2, -0x1

    .line 588
    .line 589
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ(I)I

    .line 590
    .line 591
    .line 592
    move-result v2

    .line 593
    if-eq v2, v10, :cond_7

    .line 594
    .line 595
    if-ne v2, v9, :cond_5

    .line 596
    .line 597
    goto :goto_0

    .line 598
    :cond_5
    and-int v3, v2, v15

    .line 599
    .line 600
    if-eq v3, v14, :cond_6

    .line 601
    .line 602
    if-ne v3, v13, :cond_c

    .line 603
    .line 604
    :cond_6
    or-int v2, v2, v17

    .line 605
    .line 606
    invoke-virtual {v0, v1, v2}, Lyyds/ᛲᲀᛴᛳ;->ᲇᛱᛲ(II)V

    .line 607
    .line 608
    .line 609
    return-void

    .line 610
    :cond_7
    :goto_0
    invoke-virtual {v0, v1, v11}, Lyyds/ᛲᲀᛴᛳ;->ᲇᛱᛲ(II)V

    .line 611
    .line 612
    .line 613
    return-void

    .line 614
    :pswitch_29
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    invoke-virtual {v0, v2, v1}, Lyyds/ᛲᲀᛴᛳ;->ᲇᛱᛲ(II)V

    .line 619
    .line 620
    .line 621
    if-lez v2, :cond_c

    .line 622
    .line 623
    add-int/lit8 v1, v2, -0x1

    .line 624
    .line 625
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ(I)I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    if-eq v2, v10, :cond_a

    .line 630
    .line 631
    if-ne v2, v9, :cond_8

    .line 632
    .line 633
    goto :goto_1

    .line 634
    :cond_8
    and-int v3, v2, v15

    .line 635
    .line 636
    if-eq v3, v14, :cond_9

    .line 637
    .line 638
    if-ne v3, v13, :cond_c

    .line 639
    .line 640
    :cond_9
    or-int v2, v2, v17

    .line 641
    .line 642
    invoke-virtual {v0, v1, v2}, Lyyds/ᛲᲀᛴᛳ;->ᲇᛱᛲ(II)V

    .line 643
    .line 644
    .line 645
    return-void

    .line 646
    :cond_a
    :goto_1
    invoke-virtual {v0, v1, v11}, Lyyds/ᛲᲀᛴᛳ;->ᲇᛱᛲ(II)V

    .line 647
    .line 648
    .line 649
    return-void

    .line 650
    :pswitch_2a
    invoke-virtual {v0, v12}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v0}, Lyyds/ᛲᲀᛴᛳ;->ᛷᲈᲈᲁ()I

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    if-ne v1, v5, :cond_b

    .line 658
    .line 659
    goto :goto_2

    .line 660
    :cond_b
    const/high16 v2, -0x4000000

    .line 661
    .line 662
    add-int/2addr v1, v2

    .line 663
    :goto_2
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 664
    .line 665
    .line 666
    return-void

    .line 667
    :pswitch_2b
    invoke-virtual {v0, v7}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0, v9}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :pswitch_2c
    invoke-virtual {v0, v7}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0, v6}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 681
    .line 682
    .line 683
    return-void

    .line 684
    :pswitch_2d
    invoke-virtual {v0, v7}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0, v10}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 691
    .line 692
    .line 693
    return-void

    .line 694
    :pswitch_2e
    invoke-virtual {v0, v7}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v0, v8}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 698
    .line 699
    .line 700
    return-void

    .line 701
    :pswitch_2f
    invoke-virtual {v0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ(I)I

    .line 702
    .line 703
    .line 704
    move-result v1

    .line 705
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :pswitch_30
    const/high16 v16, 0x800000

    .line 710
    .line 711
    iget v1, v3, Lyyds/ᲇᛱ;->ᛵᛸᛸᛷ:I

    .line 712
    .line 713
    packed-switch v1, :pswitch_data_6

    .line 714
    .line 715
    .line 716
    packed-switch v1, :pswitch_data_7

    .line 717
    .line 718
    .line 719
    new-instance v0, Ljava/lang/AssertionError;

    .line 720
    .line 721
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 722
    .line 723
    .line 724
    throw v0

    .line 725
    :pswitch_31
    iget-object v1, v3, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 726
    .line 727
    invoke-virtual {v0, v4, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛱᛳᲇ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    return-void

    .line 731
    :pswitch_32
    const-string v1, "java/lang/invoke/MethodType"

    .line 732
    .line 733
    invoke-virtual {v4, v1}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 734
    .line 735
    .line 736
    move-result v1

    .line 737
    or-int v1, v1, v16

    .line 738
    .line 739
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 740
    .line 741
    .line 742
    return-void

    .line 743
    :pswitch_33
    const-string v1, "java/lang/invoke/MethodHandle"

    .line 744
    .line 745
    invoke-virtual {v4, v1}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 746
    .line 747
    .line 748
    move-result v1

    .line 749
    or-int v1, v1, v16

    .line 750
    .line 751
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 752
    .line 753
    .line 754
    return-void

    .line 755
    :pswitch_34
    const-string v1, "java/lang/String"

    .line 756
    .line 757
    invoke-virtual {v4, v1}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    or-int v1, v1, v16

    .line 762
    .line 763
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 764
    .line 765
    .line 766
    return-void

    .line 767
    :pswitch_35
    const-string v1, "java/lang/Class"

    .line 768
    .line 769
    invoke-virtual {v4, v1}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 770
    .line 771
    .line 772
    move-result v1

    .line 773
    or-int v1, v1, v16

    .line 774
    .line 775
    invoke-virtual {v0, v1}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 776
    .line 777
    .line 778
    return-void

    .line 779
    :pswitch_36
    invoke-virtual {v0, v9}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 783
    .line 784
    .line 785
    return-void

    .line 786
    :pswitch_37
    invoke-virtual {v0, v10}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 790
    .line 791
    .line 792
    return-void

    .line 793
    :pswitch_38
    invoke-virtual {v0, v6}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 794
    .line 795
    .line 796
    return-void

    .line 797
    :pswitch_39
    invoke-virtual {v0, v8}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 798
    .line 799
    .line 800
    return-void

    .line 801
    :pswitch_3a
    invoke-virtual {v0, v9}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 805
    .line 806
    .line 807
    return-void

    .line 808
    :pswitch_3b
    invoke-virtual {v0, v6}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 809
    .line 810
    .line 811
    return-void

    .line 812
    :pswitch_3c
    invoke-virtual {v0, v10}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v0, v11}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 816
    .line 817
    .line 818
    return-void

    .line 819
    :pswitch_3d
    invoke-virtual {v0, v8}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 820
    .line 821
    .line 822
    return-void

    .line 823
    :pswitch_3e
    invoke-virtual {v0, v5}, Lyyds/ᛲᲀᛴᛳ;->ᛲᛲᲈᲈ(I)V

    .line 824
    .line 825
    .line 826
    :cond_c
    :pswitch_3f
    return-void

    .line 827
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3b
        :pswitch_3b
        :pswitch_3a
        :pswitch_3a
        :pswitch_3d
        :pswitch_3d
        :pswitch_30
    .end packed-switch

    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_2f
    .end packed-switch

    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    :pswitch_data_2
    .packed-switch 0x2e
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2e
        :pswitch_2e
        :pswitch_2e
        :pswitch_29
        :pswitch_28
        :pswitch_29
        :pswitch_28
        :pswitch_29
    .end packed-switch

    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    :pswitch_data_3
    .packed-switch 0x4f
        :pswitch_27
        :pswitch_26
        :pswitch_27
        :pswitch_26
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1c
        :pswitch_2e
        :pswitch_1c
        :pswitch_2e
        :pswitch_1c
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_2e
        :pswitch_2c
        :pswitch_2b
        :pswitch_15
        :pswitch_18
        :pswitch_16
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_14
        :pswitch_2e
        :pswitch_2e
        :pswitch_14
        :pswitch_14
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_3f
        :pswitch_13
        :pswitch_13
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_25
        :pswitch_24
        :pswitch_25
        :pswitch_3f
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_15
        :pswitch_25
        :pswitch_1
        :pswitch_15
        :pswitch_25
        :pswitch_25
    .end packed-switch

    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    :pswitch_data_4
    .packed-switch 0xc5
        :pswitch_0
        :pswitch_25
        :pswitch_25
    .end packed-switch

    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    :pswitch_data_5
    .packed-switch 0x4
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    :pswitch_data_6
    .packed-switch 0x3
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch

    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    :pswitch_data_7
    .packed-switch 0xf
        :pswitch_33
        :pswitch_32
        :pswitch_31
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 2
    .line 3
    const/high16 v0, 0x1400000

    .line 4
    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    array-length v1, p0

    .line 8
    if-lt p1, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    aget v1, p0, p1

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    or-int/2addr v0, p1

    .line 16
    aput v0, p0, p1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    return v1

    .line 20
    :cond_2
    :goto_0
    or-int p0, p1, v0

    .line 21
    .line 22
    return p0
.end method

.method public final ᛷᛲᲈᛱ(I)V
    .locals 2

    .line 1
    iget-short v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 2
    .line 3
    if-lt v0, p1, :cond_0

    .line 4
    .line 5
    sub-int/2addr v0, p1

    .line 6
    int-to-short p1, v0

    .line 7
    iput-short p1, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-short v1, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲇᲇᛱ:S

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    sub-int/2addr v1, p1

    .line 14
    int-to-short p1, v1

    .line 15
    iput-short p1, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲇᲇᛱ:S

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-short p1, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 19
    .line 20
    return-void
.end method

.method public final ᛷᛵᲇᲀ(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x28

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x2

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lyyds/ᛶᛳᲇᛳ;->ᲀᛲᛳᲀ(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    shr-int/2addr p1, v3

    .line 17
    sub-int/2addr p1, v2

    .line 18
    invoke-virtual {p0, p1}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/16 p1, 0x4a

    .line 23
    .line 24
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    const/16 p1, 0x44

    .line 27
    .line 28
    if-ne v0, p1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0, v2}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    :goto_0
    invoke-virtual {p0, v3}, Lyyds/ᛲᲀᛴᛳ;->ᛷᛲᲈᛱ(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final ᛷᲈᲈᲁ()I
    .locals 2

    .line 1
    iget-short v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛴᛳᛲ:[I

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    int-to-short v0, v0

    .line 10
    iput-short v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᛶᛷᛲᲁ:S

    .line 11
    .line 12
    aget p0, v1, v0

    .line 13
    .line 14
    return p0

    .line 15
    :cond_0
    iget-short v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲇᲇᛱ:S

    .line 16
    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    int-to-short v0, v0

    .line 20
    iput-short v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲇᲇᛱ:S

    .line 21
    .line 22
    neg-int p0, v0

    .line 23
    const/high16 v0, 0x1800000

    .line 24
    .line 25
    or-int/2addr p0, v0

    .line 26
    return p0
.end method

.method public final ᲇᛱᛲ(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 10
    .line 11
    :cond_0
    array-length v1, v0

    .line 12
    if-lt p1, v1, :cond_1

    .line 13
    .line 14
    add-int/lit8 v0, p1, 0x1

    .line 15
    .line 16
    mul-int/lit8 v2, v1, 0x2

    .line 17
    .line 18
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    new-array v0, v0, [I

    .line 23
    .line 24
    iget-object v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {v2, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lyyds/ᛲᲀᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 31
    .line 32
    :cond_1
    aput p2, v0, p1

    .line 33
    .line 34
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Lyyds/ᛶᲇᛸᛱ;I)I
    .locals 8

    .line 1
    const v0, 0x400006

    .line 2
    .line 3
    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    const/high16 v1, -0x400000

    .line 7
    .line 8
    and-int/2addr v1, p2

    .line 9
    const/high16 v2, 0xc00000

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    const/high16 v2, 0x1000000

    .line 14
    .line 15
    if-ne v1, v2, :cond_5

    .line 16
    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᛱᲈᲁ:I

    .line 19
    .line 20
    if-ge v1, v2, :cond_5

    .line 21
    .line 22
    iget-object v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᛲᛳᛶᲁ:[I

    .line 23
    .line 24
    aget v2, v2, v1

    .line 25
    .line 26
    const/high16 v3, -0x4000000

    .line 27
    .line 28
    and-int/2addr v3, v2

    .line 29
    const/high16 v4, 0x3c00000

    .line 30
    .line 31
    and-int/2addr v4, v2

    .line 32
    const v5, 0xfffff

    .line 33
    .line 34
    .line 35
    and-int v6, v2, v5

    .line 36
    .line 37
    const/high16 v7, 0x1400000

    .line 38
    .line 39
    if-ne v4, v7, :cond_1

    .line 40
    .line 41
    iget-object v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ:[I

    .line 42
    .line 43
    aget v2, v2, v6

    .line 44
    .line 45
    :goto_1
    add-int/2addr v2, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const/high16 v7, 0x1800000

    .line 48
    .line 49
    if-ne v4, v7, :cond_2

    .line 50
    .line 51
    iget-object v2, p0, Lyyds/ᛲᲀᛴᛳ;->ᲀᛲᛳᲀ:[I

    .line 52
    .line 53
    array-length v4, v2

    .line 54
    sub-int/2addr v4, v6

    .line 55
    aget v2, v2, v4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_2
    if-ne p2, v2, :cond_4

    .line 59
    .line 60
    const/high16 p0, 0x800000

    .line 61
    .line 62
    if-ne p2, v0, :cond_3

    .line 63
    .line 64
    iget-object p2, p1, Lyyds/ᛶᲇᛸᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    :goto_3
    or-int/2addr p0, p1

    .line 71
    return p0

    .line 72
    :cond_3
    and-int/2addr p2, v5

    .line 73
    iget-object v0, p1, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ:[Lyyds/ᲇᛱ;

    .line 74
    .line 75
    aget-object p2, v0, p2

    .line 76
    .line 77
    iget-object p2, p2, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Lyyds/ᛶᲇᛸᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    return p2
.end method
