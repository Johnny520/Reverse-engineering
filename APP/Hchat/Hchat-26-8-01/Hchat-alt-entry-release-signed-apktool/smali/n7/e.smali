.class public final Ln7/e;
.super Ljava/nio/charset/CharsetDecoder;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ln7/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ln7/e;

    .line 2
    .line 3
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v2}, Ljava/nio/charset/CharsetDecoder;-><init>(Ljava/nio/charset/Charset;FF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ln7/e;->a:Ln7/e;

    .line 11
    .line 12
    return-void
.end method

.method public static a(III)Z
    .locals 2

    .line 1
    const/16 v0, -0x20

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    and-int/lit16 p0, p1, 0xe0

    .line 8
    .line 9
    if-eq p0, v1, :cond_2

    .line 10
    .line 11
    :cond_0
    and-int/lit16 p0, p1, 0xc0

    .line 12
    .line 13
    if-ne p0, v1, :cond_2

    .line 14
    .line 15
    and-int/lit16 p0, p2, 0xc0

    .line 16
    .line 17
    if-eq p0, v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public static b(I)Z
    .locals 1

    .line 1
    and-int/lit16 p0, p0, 0xc0

    .line 2
    .line 3
    const/16 v0, 0x80

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static c(ILjava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_8

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v1, :cond_8

    .line 6
    .line 7
    const/16 v2, 0x80

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    if-eq p0, v3, :cond_5

    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    if-eq p0, v4, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    and-int/lit16 p0, p0, 0xff

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    and-int/lit16 v5, v4, 0xff

    .line 28
    .line 29
    const/16 v6, 0xf4

    .line 30
    .line 31
    if-gt p0, v6, :cond_4

    .line 32
    .line 33
    const/16 v7, 0xf0

    .line 34
    .line 35
    if-ne p0, v7, :cond_1

    .line 36
    .line 37
    const/16 v8, 0x90

    .line 38
    .line 39
    if-lt v5, v8, :cond_4

    .line 40
    .line 41
    const/16 v8, 0xbf

    .line 42
    .line 43
    if-gt v5, v8, :cond_4

    .line 44
    .line 45
    :cond_1
    if-ne p0, v6, :cond_2

    .line 46
    .line 47
    and-int/lit16 p0, v4, 0xf0

    .line 48
    .line 49
    if-ne p0, v2, :cond_4

    .line 50
    .line 51
    :cond_2
    invoke-static {v5}, Ln7/e;->b(I)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_4

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-static {p0}, Ln7/e;->b(I)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    invoke-static {v1}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_3
    invoke-static {v3}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_4
    invoke-static {v0}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_5
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    const/16 v3, -0x20

    .line 91
    .line 92
    if-ne p0, v3, :cond_6

    .line 93
    .line 94
    and-int/lit16 p0, p1, 0xe0

    .line 95
    .line 96
    if-eq p0, v2, :cond_7

    .line 97
    .line 98
    :cond_6
    invoke-static {p1}, Ln7/e;->b(I)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-nez p0, :cond_7

    .line 103
    .line 104
    move v0, v1

    .line 105
    :cond_7
    invoke-static {v0}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_8
    invoke-static {v0}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0
.end method

.method public static d(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->arrayOffset()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p1, v0

    .line 6
    invoke-virtual {p0, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/nio/Buffer;->arrayOffset()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    sub-int/2addr p3, p0

    .line 14
    invoke-virtual {p2, p3}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static e(Ljava/nio/ByteBuffer;II)Ljava/nio/charset/CoderResult;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-lt p0, p2, :cond_0

    .line 11
    .line 12
    sget-object p0, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object p0, Ljava/nio/charset/CoderResult;->UNDERFLOW:Ljava/nio/charset/CoderResult;

    .line 16
    .line 17
    return-object p0
.end method

.method public static f(Ljava/nio/ByteBuffer;IILjava/nio/CharBuffer;II)Ljava/nio/charset/CoderResult;
    .locals 0

    .line 1
    invoke-static {p0, p1, p3, p4}, Ln7/e;->d(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 2
    .line 3
    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    sub-int/2addr p2, p1

    .line 7
    if-lt p2, p5, :cond_0

    .line 8
    .line 9
    sget-object p0, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ljava/nio/charset/CoderResult;->UNDERFLOW:Ljava/nio/charset/CoderResult;

    .line 13
    .line 14
    return-object p0
.end method


# virtual methods
.method public final decodeLoop(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, -0x20

    .line 10
    .line 11
    const/16 v4, 0x80

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x3

    .line 16
    const/4 v9, -0x2

    .line 17
    if-eqz v1, :cond_10

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/nio/CharBuffer;->hasArray()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_10

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    add-int/2addr v11, v10

    .line 38
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 43
    .line 44
    .line 45
    move-result v12

    .line 46
    add-int/2addr v12, v10

    .line 47
    invoke-virtual {v3}, Ljava/nio/CharBuffer;->array()[C

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    invoke-virtual {v3}, Ljava/nio/CharBuffer;->arrayOffset()I

    .line 52
    .line 53
    .line 54
    move-result v13

    .line 55
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    add-int/2addr v14, v13

    .line 60
    invoke-virtual {v3}, Ljava/nio/CharBuffer;->arrayOffset()I

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    add-int/2addr v15, v13

    .line 69
    sub-int v13, v12, v11

    .line 70
    .line 71
    const v16, -0x1e080

    .line 72
    .line 73
    .line 74
    sub-int v5, v15, v14

    .line 75
    .line 76
    if-ge v5, v13, :cond_0

    .line 77
    .line 78
    move v13, v5

    .line 79
    :cond_0
    add-int/2addr v13, v14

    .line 80
    :goto_0
    if-ge v14, v13, :cond_1

    .line 81
    .line 82
    aget-byte v5, v1, v11

    .line 83
    .line 84
    if-ltz v5, :cond_1

    .line 85
    .line 86
    add-int/lit8 v17, v14, 0x1

    .line 87
    .line 88
    add-int/lit8 v11, v11, 0x1

    .line 89
    .line 90
    int-to-char v5, v5

    .line 91
    aput-char v5, v10, v14

    .line 92
    .line 93
    move/from16 v14, v17

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    :goto_1
    if-ge v11, v12, :cond_f

    .line 97
    .line 98
    aget-byte v5, v1, v11

    .line 99
    .line 100
    if-gez v5, :cond_d

    .line 101
    .line 102
    shr-int/lit8 v13, v5, 0x5

    .line 103
    .line 104
    if-ne v13, v9, :cond_5

    .line 105
    .line 106
    and-int/lit8 v13, v5, 0x1e

    .line 107
    .line 108
    if-eqz v13, :cond_5

    .line 109
    .line 110
    sub-int v13, v12, v11

    .line 111
    .line 112
    if-lt v13, v7, :cond_4

    .line 113
    .line 114
    if-lt v14, v15, :cond_2

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_2
    add-int/lit8 v13, v11, 0x1

    .line 118
    .line 119
    aget-byte v13, v1, v13

    .line 120
    .line 121
    invoke-static {v13}, Ln7/e;->b(I)Z

    .line 122
    .line 123
    .line 124
    move-result v17

    .line 125
    if-eqz v17, :cond_3

    .line 126
    .line 127
    invoke-static {v0, v11, v3, v14}, Ln7/e;->d(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 128
    .line 129
    .line 130
    invoke-static {v6}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :cond_3
    add-int/lit8 v17, v14, 0x1

    .line 136
    .line 137
    shl-int/lit8 v5, v5, 0x6

    .line 138
    .line 139
    xor-int/2addr v5, v13

    .line 140
    xor-int/lit16 v5, v5, 0xf80

    .line 141
    .line 142
    int-to-char v5, v5

    .line 143
    aput-char v5, v10, v14

    .line 144
    .line 145
    add-int/lit8 v11, v11, 0x2

    .line 146
    .line 147
    move v14, v11

    .line 148
    move-object v11, v1

    .line 149
    move v1, v14

    .line 150
    :goto_2
    move/from16 v14, v17

    .line 151
    .line 152
    goto/16 :goto_5

    .line 153
    .line 154
    :cond_4
    :goto_3
    const/4 v5, 0x2

    .line 155
    move v1, v11

    .line 156
    move v2, v12

    .line 157
    move v4, v14

    .line 158
    invoke-static/range {v0 .. v5}, Ln7/e;->f(Ljava/nio/ByteBuffer;IILjava/nio/CharBuffer;II)Ljava/nio/charset/CoderResult;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :cond_5
    move/from16 v18, v11

    .line 164
    .line 165
    move-object v11, v1

    .line 166
    move/from16 v1, v18

    .line 167
    .line 168
    shr-int/lit8 v13, v5, 0x4

    .line 169
    .line 170
    if-eq v13, v9, :cond_6

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    sub-int v11, v1, v2

    .line 177
    .line 178
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 179
    .line 180
    .line 181
    invoke-static {v6, v0}, Ln7/e;->c(ILjava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-static {v0, v1, v3, v14}, Ln7/e;->d(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 186
    .line 187
    .line 188
    return-object v2

    .line 189
    :cond_6
    sub-int v13, v12, v1

    .line 190
    .line 191
    if-lt v13, v8, :cond_9

    .line 192
    .line 193
    if-lt v14, v15, :cond_7

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_7
    add-int/lit8 v13, v1, 0x1

    .line 197
    .line 198
    aget-byte v13, v11, v13

    .line 199
    .line 200
    add-int/lit8 v17, v1, 0x2

    .line 201
    .line 202
    aget-byte v7, v11, v17

    .line 203
    .line 204
    invoke-static {v5, v13, v7}, Ln7/e;->a(III)Z

    .line 205
    .line 206
    .line 207
    move-result v17

    .line 208
    if-eqz v17, :cond_8

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    sub-int v11, v1, v2

    .line 215
    .line 216
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 217
    .line 218
    .line 219
    invoke-static {v8, v0}, Ln7/e;->c(ILjava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-static {v0, v1, v3, v14}, Ln7/e;->d(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 224
    .line 225
    .line 226
    return-object v2

    .line 227
    :cond_8
    add-int/lit8 v17, v14, 0x1

    .line 228
    .line 229
    shl-int/lit8 v5, v5, 0xc

    .line 230
    .line 231
    shl-int/lit8 v13, v13, 0x6

    .line 232
    .line 233
    xor-int/2addr v5, v13

    .line 234
    xor-int/2addr v5, v7

    .line 235
    xor-int v5, v5, v16

    .line 236
    .line 237
    int-to-char v5, v5

    .line 238
    aput-char v5, v10, v14

    .line 239
    .line 240
    add-int/lit8 v1, v1, 0x3

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_9
    :goto_4
    if-le v13, v6, :cond_c

    .line 244
    .line 245
    add-int/lit8 v7, v1, 0x1

    .line 246
    .line 247
    aget-byte v7, v11, v7

    .line 248
    .line 249
    if-ne v5, v2, :cond_a

    .line 250
    .line 251
    and-int/lit16 v2, v7, 0xe0

    .line 252
    .line 253
    if-eq v2, v4, :cond_b

    .line 254
    .line 255
    :cond_a
    and-int/lit16 v2, v7, 0xc0

    .line 256
    .line 257
    if-eq v2, v4, :cond_c

    .line 258
    .line 259
    :cond_b
    invoke-static {v0, v1, v3, v14}, Ln7/e;->d(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 260
    .line 261
    .line 262
    invoke-static {v6}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    return-object v0

    .line 267
    :cond_c
    const/4 v5, 0x3

    .line 268
    move v2, v12

    .line 269
    move v4, v14

    .line 270
    invoke-static/range {v0 .. v5}, Ln7/e;->f(Ljava/nio/ByteBuffer;IILjava/nio/CharBuffer;II)Ljava/nio/charset/CoderResult;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    return-object v0

    .line 275
    :cond_d
    move/from16 v18, v11

    .line 276
    .line 277
    move-object v11, v1

    .line 278
    move/from16 v1, v18

    .line 279
    .line 280
    if-lt v14, v15, :cond_e

    .line 281
    .line 282
    const/4 v5, 0x1

    .line 283
    move-object/from16 v0, p1

    .line 284
    .line 285
    move-object/from16 v3, p2

    .line 286
    .line 287
    move v2, v12

    .line 288
    move v4, v14

    .line 289
    invoke-static/range {v0 .. v5}, Ln7/e;->f(Ljava/nio/ByteBuffer;IILjava/nio/CharBuffer;II)Ljava/nio/charset/CoderResult;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    :cond_e
    add-int/lit8 v0, v14, 0x1

    .line 295
    .line 296
    int-to-char v3, v5

    .line 297
    aput-char v3, v10, v14

    .line 298
    .line 299
    add-int/lit8 v1, v1, 0x1

    .line 300
    .line 301
    move v14, v0

    .line 302
    :goto_5
    move-object v0, v11

    .line 303
    move v11, v1

    .line 304
    move-object v1, v0

    .line 305
    move-object/from16 v0, p1

    .line 306
    .line 307
    move-object/from16 v3, p2

    .line 308
    .line 309
    const/4 v7, 0x2

    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_f
    move v1, v11

    .line 313
    const/4 v5, 0x0

    .line 314
    move-object/from16 v0, p1

    .line 315
    .line 316
    move-object/from16 v3, p2

    .line 317
    .line 318
    move v2, v12

    .line 319
    move v4, v14

    .line 320
    invoke-static/range {v0 .. v5}, Ln7/e;->f(Ljava/nio/ByteBuffer;IILjava/nio/CharBuffer;II)Ljava/nio/charset/CoderResult;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    return-object v0

    .line 325
    :cond_10
    const v16, -0x1e080

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    :goto_6
    if-ge v1, v5, :cond_1e

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    if-gez v7, :cond_1c

    .line 343
    .line 344
    shr-int/lit8 v10, v7, 0x5

    .line 345
    .line 346
    if-ne v10, v9, :cond_14

    .line 347
    .line 348
    and-int/lit8 v10, v7, 0x1e

    .line 349
    .line 350
    if-eqz v10, :cond_14

    .line 351
    .line 352
    sub-int v10, v5, v1

    .line 353
    .line 354
    const/4 v11, 0x2

    .line 355
    if-lt v10, v11, :cond_13

    .line 356
    .line 357
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    if-ge v10, v6, :cond_11

    .line 362
    .line 363
    const/4 v11, 0x2

    .line 364
    goto :goto_7

    .line 365
    :cond_11
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 366
    .line 367
    .line 368
    move-result v10

    .line 369
    invoke-static {v10}, Ln7/e;->b(I)Z

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    if-eqz v11, :cond_12

    .line 374
    .line 375
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 376
    .line 377
    .line 378
    invoke-static {v6}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    return-object v0

    .line 383
    :cond_12
    shl-int/lit8 v7, v7, 0x6

    .line 384
    .line 385
    xor-int/2addr v7, v10

    .line 386
    xor-int/lit16 v7, v7, 0xf80

    .line 387
    .line 388
    int-to-char v7, v7

    .line 389
    invoke-virtual {v3, v7}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    .line 390
    .line 391
    .line 392
    add-int/lit8 v1, v1, 0x2

    .line 393
    .line 394
    const/4 v11, 0x2

    .line 395
    goto :goto_6

    .line 396
    :cond_13
    :goto_7
    invoke-static {v0, v1, v11}, Ln7/e;->e(Ljava/nio/ByteBuffer;II)Ljava/nio/charset/CoderResult;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    return-object v0

    .line 401
    :cond_14
    const/4 v11, 0x2

    .line 402
    shr-int/lit8 v10, v7, 0x4

    .line 403
    .line 404
    if-eq v10, v9, :cond_15

    .line 405
    .line 406
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 407
    .line 408
    .line 409
    invoke-static {v6}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 414
    .line 415
    .line 416
    return-object v2

    .line 417
    :cond_15
    sub-int v10, v5, v1

    .line 418
    .line 419
    if-lt v10, v8, :cond_18

    .line 420
    .line 421
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 422
    .line 423
    .line 424
    move-result v12

    .line 425
    if-ge v12, v6, :cond_16

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_16
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 433
    .line 434
    .line 435
    move-result v12

    .line 436
    invoke-static {v7, v10, v12}, Ln7/e;->a(III)Z

    .line 437
    .line 438
    .line 439
    move-result v13

    .line 440
    if-eqz v13, :cond_17

    .line 441
    .line 442
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 443
    .line 444
    .line 445
    invoke-static {v8, v0}, Ln7/e;->c(ILjava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 450
    .line 451
    .line 452
    return-object v2

    .line 453
    :cond_17
    shl-int/lit8 v7, v7, 0xc

    .line 454
    .line 455
    shl-int/lit8 v10, v10, 0x6

    .line 456
    .line 457
    xor-int/2addr v7, v10

    .line 458
    xor-int/2addr v7, v12

    .line 459
    xor-int v7, v7, v16

    .line 460
    .line 461
    int-to-char v7, v7

    .line 462
    invoke-virtual {v3, v7}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    .line 463
    .line 464
    .line 465
    add-int/lit8 v1, v1, 0x3

    .line 466
    .line 467
    goto/16 :goto_6

    .line 468
    .line 469
    :cond_18
    :goto_8
    if-le v10, v6, :cond_1b

    .line 470
    .line 471
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    if-ne v7, v2, :cond_19

    .line 476
    .line 477
    and-int/lit16 v2, v3, 0xe0

    .line 478
    .line 479
    if-eq v2, v4, :cond_1a

    .line 480
    .line 481
    :cond_19
    and-int/lit16 v2, v3, 0xc0

    .line 482
    .line 483
    if-eq v2, v4, :cond_1b

    .line 484
    .line 485
    :cond_1a
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 486
    .line 487
    .line 488
    invoke-static {v6}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    return-object v0

    .line 493
    :cond_1b
    invoke-static {v0, v1, v8}, Ln7/e;->e(Ljava/nio/ByteBuffer;II)Ljava/nio/charset/CoderResult;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    return-object v0

    .line 498
    :cond_1c
    const/4 v11, 0x2

    .line 499
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 500
    .line 501
    .line 502
    move-result v10

    .line 503
    if-ge v10, v6, :cond_1d

    .line 504
    .line 505
    invoke-static {v0, v1, v6}, Ln7/e;->e(Ljava/nio/ByteBuffer;II)Ljava/nio/charset/CoderResult;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    return-object v0

    .line 510
    :cond_1d
    int-to-char v7, v7

    .line 511
    invoke-virtual {v3, v7}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    .line 512
    .line 513
    .line 514
    add-int/lit8 v1, v1, 0x1

    .line 515
    .line 516
    goto/16 :goto_6

    .line 517
    .line 518
    :cond_1e
    const/4 v2, 0x0

    .line 519
    invoke-static {v0, v1, v2}, Ln7/e;->e(Ljava/nio/ByteBuffer;II)Ljava/nio/charset/CoderResult;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    return-object v0
.end method
