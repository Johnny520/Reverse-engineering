.class public final Lokio/internal/_Utf8Kt;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final commonAsUtf8ToByteArray(Ljava/lang/String;)[B
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    mul-int/lit8 v0, v0, 0x4

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_7

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0x80

    .line 24
    .line 25
    invoke-static {v3, v4}, Lgg/l;->c(II)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-ltz v5, :cond_6

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    move v3, v2

    .line 36
    :cond_0
    :goto_1
    if-ge v2, v1, :cond_5

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-static {v5, v4}, Lgg/l;->c(II)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-gez v6, :cond_1

    .line 47
    .line 48
    int-to-byte v5, v5

    .line 49
    add-int/lit8 v6, v3, 0x1

    .line 50
    .line 51
    aput-byte v5, v0, v3

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    :goto_2
    move v3, v6

    .line 56
    if-ge v2, v1, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v5, v4}, Lgg/l;->c(II)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-gez v5, :cond_0

    .line 67
    .line 68
    add-int/lit8 v5, v2, 0x1

    .line 69
    .line 70
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    int-to-byte v2, v2

    .line 75
    add-int/lit8 v6, v3, 0x1

    .line 76
    .line 77
    aput-byte v2, v0, v3

    .line 78
    .line 79
    move v2, v5

    .line 80
    goto :goto_2

    .line 81
    :cond_1
    const/16 v6, 0x800

    .line 82
    .line 83
    invoke-static {v5, v6}, Lgg/l;->c(II)I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-gez v6, :cond_2

    .line 88
    .line 89
    shr-int/lit8 v6, v5, 0x6

    .line 90
    .line 91
    or-int/lit16 v6, v6, 0xc0

    .line 92
    .line 93
    int-to-byte v6, v6

    .line 94
    add-int/lit8 v7, v3, 0x1

    .line 95
    .line 96
    aput-byte v6, v0, v3

    .line 97
    .line 98
    and-int/lit8 v5, v5, 0x3f

    .line 99
    .line 100
    or-int/2addr v5, v4

    .line 101
    int-to-byte v5, v5

    .line 102
    add-int/lit8 v3, v3, 0x2

    .line 103
    .line 104
    aput-byte v5, v0, v7

    .line 105
    .line 106
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    const v6, 0xd800

    .line 110
    .line 111
    .line 112
    const/16 v7, 0x3f

    .line 113
    .line 114
    if-gt v6, v5, :cond_4

    .line 115
    .line 116
    const v6, 0xe000

    .line 117
    .line 118
    .line 119
    if-ge v5, v6, :cond_4

    .line 120
    .line 121
    const v8, 0xdbff

    .line 122
    .line 123
    .line 124
    invoke-static {v5, v8}, Lgg/l;->c(II)I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-gtz v8, :cond_3

    .line 129
    .line 130
    add-int/lit8 v8, v2, 0x1

    .line 131
    .line 132
    if-le v1, v8, :cond_3

    .line 133
    .line 134
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    const v10, 0xdc00

    .line 139
    .line 140
    .line 141
    if-gt v10, v9, :cond_3

    .line 142
    .line 143
    if-ge v9, v6, :cond_3

    .line 144
    .line 145
    shl-int/lit8 v5, v5, 0xa

    .line 146
    .line 147
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    add-int/2addr v6, v5

    .line 152
    const v5, -0x35fdc00

    .line 153
    .line 154
    .line 155
    add-int/2addr v6, v5

    .line 156
    shr-int/lit8 v5, v6, 0x12

    .line 157
    .line 158
    or-int/lit16 v5, v5, 0xf0

    .line 159
    .line 160
    int-to-byte v5, v5

    .line 161
    add-int/lit8 v8, v3, 0x1

    .line 162
    .line 163
    aput-byte v5, v0, v3

    .line 164
    .line 165
    shr-int/lit8 v5, v6, 0xc

    .line 166
    .line 167
    and-int/2addr v5, v7

    .line 168
    or-int/2addr v5, v4

    .line 169
    int-to-byte v5, v5

    .line 170
    add-int/lit8 v9, v3, 0x2

    .line 171
    .line 172
    aput-byte v5, v0, v8

    .line 173
    .line 174
    shr-int/lit8 v5, v6, 0x6

    .line 175
    .line 176
    and-int/2addr v5, v7

    .line 177
    or-int/2addr v5, v4

    .line 178
    int-to-byte v5, v5

    .line 179
    add-int/lit8 v8, v3, 0x3

    .line 180
    .line 181
    aput-byte v5, v0, v9

    .line 182
    .line 183
    and-int/lit8 v5, v6, 0x3f

    .line 184
    .line 185
    or-int/2addr v5, v4

    .line 186
    int-to-byte v5, v5

    .line 187
    add-int/lit8 v3, v3, 0x4

    .line 188
    .line 189
    aput-byte v5, v0, v8

    .line 190
    .line 191
    add-int/lit8 v2, v2, 0x2

    .line 192
    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :cond_3
    add-int/lit8 v5, v3, 0x1

    .line 196
    .line 197
    aput-byte v7, v0, v3

    .line 198
    .line 199
    add-int/lit8 v2, v2, 0x1

    .line 200
    .line 201
    move v3, v5

    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    :cond_4
    shr-int/lit8 v6, v5, 0xc

    .line 205
    .line 206
    or-int/lit16 v6, v6, 0xe0

    .line 207
    .line 208
    int-to-byte v6, v6

    .line 209
    add-int/lit8 v8, v3, 0x1

    .line 210
    .line 211
    aput-byte v6, v0, v3

    .line 212
    .line 213
    shr-int/lit8 v6, v5, 0x6

    .line 214
    .line 215
    and-int/2addr v6, v7

    .line 216
    or-int/2addr v6, v4

    .line 217
    int-to-byte v6, v6

    .line 218
    add-int/lit8 v7, v3, 0x2

    .line 219
    .line 220
    aput-byte v6, v0, v8

    .line 221
    .line 222
    and-int/lit8 v5, v5, 0x3f

    .line 223
    .line 224
    or-int/2addr v5, v4

    .line 225
    int-to-byte v5, v5

    .line 226
    add-int/lit8 v3, v3, 0x3

    .line 227
    .line 228
    aput-byte v5, v0, v7

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_5
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0

    .line 236
    :cond_6
    int-to-byte v3, v3

    .line 237
    aput-byte v3, v0, v2

    .line 238
    .line 239
    add-int/lit8 v2, v2, 0x1

    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    return-object p0
.end method

.method public static final commonToUtf8String([BII)Ljava/lang/String;
    .locals 16

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    if-ltz v1, :cond_19

    .line 11
    .line 12
    array-length v3, v0

    .line 13
    if-gt v2, v3, :cond_19

    .line 14
    .line 15
    if-gt v1, v2, :cond_19

    .line 16
    .line 17
    sub-int v3, v2, v1

    .line 18
    .line 19
    new-array v3, v3, [C

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :cond_0
    :goto_0
    if-ge v1, v2, :cond_18

    .line 24
    .line 25
    aget-byte v6, v0, v1

    .line 26
    .line 27
    if-ltz v6, :cond_1

    .line 28
    .line 29
    int-to-char v6, v6

    .line 30
    add-int/lit8 v7, v5, 0x1

    .line 31
    .line 32
    aput-char v6, v3, v5

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    :goto_1
    move v5, v7

    .line 37
    if-ge v1, v2, :cond_0

    .line 38
    .line 39
    aget-byte v6, v0, v1

    .line 40
    .line 41
    if-ltz v6, :cond_0

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    int-to-char v6, v6

    .line 46
    add-int/lit8 v7, v5, 0x1

    .line 47
    .line 48
    aput-char v6, v3, v5

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    shr-int/lit8 v7, v6, 0x5

    .line 52
    .line 53
    const/4 v8, -0x2

    .line 54
    const/16 v10, 0x80

    .line 55
    .line 56
    const v11, 0xfffd

    .line 57
    .line 58
    .line 59
    const/4 v12, 0x1

    .line 60
    if-ne v7, v8, :cond_6

    .line 61
    .line 62
    add-int/lit8 v7, v1, 0x1

    .line 63
    .line 64
    if-gt v2, v7, :cond_3

    .line 65
    .line 66
    int-to-char v6, v11

    .line 67
    add-int/lit8 v7, v5, 0x1

    .line 68
    .line 69
    aput-char v6, v3, v5

    .line 70
    .line 71
    :cond_2
    :goto_2
    move v5, v7

    .line 72
    :goto_3
    move v9, v12

    .line 73
    goto :goto_6

    .line 74
    :cond_3
    aget-byte v7, v0, v7

    .line 75
    .line 76
    and-int/lit16 v8, v7, 0xc0

    .line 77
    .line 78
    if-ne v8, v10, :cond_5

    .line 79
    .line 80
    xor-int/lit16 v7, v7, 0xf80

    .line 81
    .line 82
    shl-int/lit8 v6, v6, 0x6

    .line 83
    .line 84
    xor-int/2addr v6, v7

    .line 85
    if-ge v6, v10, :cond_4

    .line 86
    .line 87
    int-to-char v6, v11

    .line 88
    add-int/lit8 v7, v5, 0x1

    .line 89
    .line 90
    aput-char v6, v3, v5

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    int-to-char v6, v6

    .line 94
    add-int/lit8 v7, v5, 0x1

    .line 95
    .line 96
    aput-char v6, v3, v5

    .line 97
    .line 98
    :goto_4
    move v5, v7

    .line 99
    :goto_5
    const/4 v9, 0x2

    .line 100
    goto :goto_6

    .line 101
    :cond_5
    int-to-char v6, v11

    .line 102
    add-int/lit8 v7, v5, 0x1

    .line 103
    .line 104
    aput-char v6, v3, v5

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :goto_6
    add-int/2addr v1, v9

    .line 108
    goto :goto_0

    .line 109
    :cond_6
    shr-int/lit8 v7, v6, 0x4

    .line 110
    .line 111
    const v13, 0xe000

    .line 112
    .line 113
    .line 114
    const v14, 0xd800

    .line 115
    .line 116
    .line 117
    const/4 v15, 0x3

    .line 118
    if-ne v7, v8, :cond_c

    .line 119
    .line 120
    add-int/lit8 v7, v1, 0x2

    .line 121
    .line 122
    if-gt v2, v7, :cond_7

    .line 123
    .line 124
    int-to-char v6, v11

    .line 125
    add-int/lit8 v7, v5, 0x1

    .line 126
    .line 127
    aput-char v6, v3, v5

    .line 128
    .line 129
    add-int/lit8 v5, v1, 0x1

    .line 130
    .line 131
    if-le v2, v5, :cond_2

    .line 132
    .line 133
    aget-byte v5, v0, v5

    .line 134
    .line 135
    and-int/lit16 v5, v5, 0xc0

    .line 136
    .line 137
    if-ne v5, v10, :cond_2

    .line 138
    .line 139
    :goto_7
    goto :goto_4

    .line 140
    :cond_7
    add-int/lit8 v8, v1, 0x1

    .line 141
    .line 142
    aget-byte v8, v0, v8

    .line 143
    .line 144
    and-int/lit16 v9, v8, 0xc0

    .line 145
    .line 146
    if-ne v9, v10, :cond_b

    .line 147
    .line 148
    aget-byte v7, v0, v7

    .line 149
    .line 150
    and-int/lit16 v9, v7, 0xc0

    .line 151
    .line 152
    if-ne v9, v10, :cond_a

    .line 153
    .line 154
    const v9, -0x1e080

    .line 155
    .line 156
    .line 157
    xor-int/2addr v7, v9

    .line 158
    shl-int/lit8 v8, v8, 0x6

    .line 159
    .line 160
    xor-int/2addr v7, v8

    .line 161
    shl-int/lit8 v6, v6, 0xc

    .line 162
    .line 163
    xor-int/2addr v6, v7

    .line 164
    const/16 v7, 0x800

    .line 165
    .line 166
    if-ge v6, v7, :cond_8

    .line 167
    .line 168
    int-to-char v6, v11

    .line 169
    add-int/lit8 v7, v5, 0x1

    .line 170
    .line 171
    aput-char v6, v3, v5

    .line 172
    .line 173
    goto :goto_8

    .line 174
    :cond_8
    if-gt v14, v6, :cond_9

    .line 175
    .line 176
    if-ge v6, v13, :cond_9

    .line 177
    .line 178
    int-to-char v6, v11

    .line 179
    add-int/lit8 v7, v5, 0x1

    .line 180
    .line 181
    aput-char v6, v3, v5

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_9
    int-to-char v6, v6

    .line 185
    add-int/lit8 v7, v5, 0x1

    .line 186
    .line 187
    aput-char v6, v3, v5

    .line 188
    .line 189
    :goto_8
    move v5, v7

    .line 190
    :goto_9
    move v9, v15

    .line 191
    goto :goto_6

    .line 192
    :cond_a
    int-to-char v6, v11

    .line 193
    add-int/lit8 v7, v5, 0x1

    .line 194
    .line 195
    aput-char v6, v3, v5

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_b
    int-to-char v6, v11

    .line 199
    add-int/lit8 v7, v5, 0x1

    .line 200
    .line 201
    aput-char v6, v3, v5

    .line 202
    .line 203
    goto/16 :goto_2

    .line 204
    .line 205
    :cond_c
    shr-int/lit8 v7, v6, 0x3

    .line 206
    .line 207
    if-ne v7, v8, :cond_17

    .line 208
    .line 209
    add-int/lit8 v7, v1, 0x3

    .line 210
    .line 211
    if-gt v2, v7, :cond_f

    .line 212
    .line 213
    add-int/lit8 v6, v5, 0x1

    .line 214
    .line 215
    aput-char v11, v3, v5

    .line 216
    .line 217
    add-int/lit8 v5, v1, 0x1

    .line 218
    .line 219
    if-le v2, v5, :cond_e

    .line 220
    .line 221
    aget-byte v5, v0, v5

    .line 222
    .line 223
    and-int/lit16 v5, v5, 0xc0

    .line 224
    .line 225
    if-ne v5, v10, :cond_e

    .line 226
    .line 227
    add-int/lit8 v5, v1, 0x2

    .line 228
    .line 229
    if-le v2, v5, :cond_d

    .line 230
    .line 231
    aget-byte v5, v0, v5

    .line 232
    .line 233
    and-int/lit16 v5, v5, 0xc0

    .line 234
    .line 235
    if-ne v5, v10, :cond_d

    .line 236
    .line 237
    :goto_a
    move v5, v6

    .line 238
    goto :goto_9

    .line 239
    :cond_d
    :goto_b
    move v5, v6

    .line 240
    goto/16 :goto_5

    .line 241
    .line 242
    :cond_e
    :goto_c
    move v5, v6

    .line 243
    goto/16 :goto_3

    .line 244
    .line 245
    :cond_f
    add-int/lit8 v8, v1, 0x1

    .line 246
    .line 247
    aget-byte v8, v0, v8

    .line 248
    .line 249
    and-int/lit16 v9, v8, 0xc0

    .line 250
    .line 251
    if-ne v9, v10, :cond_16

    .line 252
    .line 253
    add-int/lit8 v9, v1, 0x2

    .line 254
    .line 255
    aget-byte v9, v0, v9

    .line 256
    .line 257
    and-int/lit16 v12, v9, 0xc0

    .line 258
    .line 259
    if-ne v12, v10, :cond_15

    .line 260
    .line 261
    aget-byte v7, v0, v7

    .line 262
    .line 263
    and-int/lit16 v12, v7, 0xc0

    .line 264
    .line 265
    if-ne v12, v10, :cond_14

    .line 266
    .line 267
    const v10, 0x381f80

    .line 268
    .line 269
    .line 270
    xor-int/2addr v7, v10

    .line 271
    shl-int/lit8 v9, v9, 0x6

    .line 272
    .line 273
    xor-int/2addr v7, v9

    .line 274
    shl-int/lit8 v8, v8, 0xc

    .line 275
    .line 276
    xor-int/2addr v7, v8

    .line 277
    shl-int/lit8 v6, v6, 0x12

    .line 278
    .line 279
    xor-int/2addr v6, v7

    .line 280
    const v7, 0x10ffff

    .line 281
    .line 282
    .line 283
    if-le v6, v7, :cond_10

    .line 284
    .line 285
    add-int/lit8 v6, v5, 0x1

    .line 286
    .line 287
    aput-char v11, v3, v5

    .line 288
    .line 289
    goto :goto_d

    .line 290
    :cond_10
    if-gt v14, v6, :cond_11

    .line 291
    .line 292
    if-ge v6, v13, :cond_11

    .line 293
    .line 294
    add-int/lit8 v6, v5, 0x1

    .line 295
    .line 296
    aput-char v11, v3, v5

    .line 297
    .line 298
    goto :goto_d

    .line 299
    :cond_11
    const/high16 v7, 0x10000

    .line 300
    .line 301
    if-ge v6, v7, :cond_12

    .line 302
    .line 303
    add-int/lit8 v6, v5, 0x1

    .line 304
    .line 305
    aput-char v11, v3, v5

    .line 306
    .line 307
    goto :goto_d

    .line 308
    :cond_12
    if-eq v6, v11, :cond_13

    .line 309
    .line 310
    ushr-int/lit8 v7, v6, 0xa

    .line 311
    .line 312
    const v8, 0xd7c0

    .line 313
    .line 314
    .line 315
    add-int/2addr v7, v8

    .line 316
    int-to-char v7, v7

    .line 317
    add-int/lit8 v8, v5, 0x1

    .line 318
    .line 319
    aput-char v7, v3, v5

    .line 320
    .line 321
    and-int/lit16 v6, v6, 0x3ff

    .line 322
    .line 323
    const v7, 0xdc00

    .line 324
    .line 325
    .line 326
    add-int/2addr v6, v7

    .line 327
    int-to-char v6, v6

    .line 328
    add-int/lit8 v5, v5, 0x2

    .line 329
    .line 330
    aput-char v6, v3, v8

    .line 331
    .line 332
    move v6, v5

    .line 333
    goto :goto_d

    .line 334
    :cond_13
    add-int/lit8 v6, v5, 0x1

    .line 335
    .line 336
    aput-char v11, v3, v5

    .line 337
    .line 338
    :goto_d
    const/4 v9, 0x4

    .line 339
    move v5, v6

    .line 340
    goto/16 :goto_6

    .line 341
    .line 342
    :cond_14
    add-int/lit8 v6, v5, 0x1

    .line 343
    .line 344
    aput-char v11, v3, v5

    .line 345
    .line 346
    goto :goto_a

    .line 347
    :cond_15
    add-int/lit8 v6, v5, 0x1

    .line 348
    .line 349
    aput-char v11, v3, v5

    .line 350
    .line 351
    goto :goto_b

    .line 352
    :cond_16
    add-int/lit8 v6, v5, 0x1

    .line 353
    .line 354
    aput-char v11, v3, v5

    .line 355
    .line 356
    goto :goto_c

    .line 357
    :cond_17
    add-int/lit8 v6, v5, 0x1

    .line 358
    .line 359
    aput-char v11, v3, v5

    .line 360
    .line 361
    add-int/lit8 v1, v1, 0x1

    .line 362
    .line 363
    move v5, v6

    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :cond_18
    invoke-static {v3, v4, v5}, Log/t;->V([CII)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    return-object v0

    .line 371
    :cond_19
    new-instance v3, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 372
    .line 373
    new-instance v4, Ljava/lang/StringBuilder;

    .line 374
    .line 375
    const-string v5, "size="

    .line 376
    .line 377
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    array-length v0, v0

    .line 381
    const-string v5, " beginIndex="

    .line 382
    .line 383
    const-string v6, " endIndex="

    .line 384
    .line 385
    invoke-static {v4, v0, v5, v1, v6}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-direct {v3, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v3
.end method

.method public static synthetic commonToUtf8String$default([BIIILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    array-length p2, p0

    .line 11
    :cond_1
    invoke-static {p0, p1, p2}, Lokio/internal/_Utf8Kt;->commonToUtf8String([BII)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
