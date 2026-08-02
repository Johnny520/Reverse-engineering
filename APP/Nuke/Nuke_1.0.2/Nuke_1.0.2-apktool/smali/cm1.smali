.class public abstract Lcm1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:[B

.field public static final b:[B

.field public static final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcm1;->a:[B

    .line 9
    .line 10
    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    const-string v1, "NKSIG-PTLOAD-V1\u0000"

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Lcm1;->b:[B

    .line 19
    .line 20
    const-string v1, "NKSIG-IMAGE-V2\u0000"

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lcm1;->c:[B

    .line 27
    .line 28
    return-void

    .line 29
    :array_0
    .array-data 1
        0x4et
        0x4bt
        0x53t
        0x49t
        0x47t
        0x31t
        0x0t
        0x0t
    .end array-data
.end method

.method public static a(J[B[B[B)[B
    .locals 6

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcm1;->b:[B

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    const/16 v2, 0x8

    .line 13
    .line 14
    if-ge v1, v2, :cond_0

    .line 15
    .line 16
    mul-int/lit8 v2, v1, 0x8

    .line 17
    .line 18
    ushr-long v2, p0, v2

    .line 19
    .line 20
    const-wide/16 v4, 0xff

    .line 21
    .line 22
    and-long/2addr v2, v4

    .line 23
    long-to-int v2, v2

    .line 24
    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V

    .line 31
    .line 32
    .line 33
    array-length p0, p3

    .line 34
    invoke-static {v0, p0}, Lcm1;->l(Ljava/io/ByteArrayOutputStream;I)V

    .line 35
    .line 36
    .line 37
    array-length p0, p4

    .line 38
    invoke-static {v0, p0}, Lcm1;->l(Ljava/io/ByteArrayOutputStream;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p3}, Ljava/io/OutputStream;->write([B)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p4}, Ljava/io/OutputStream;->write([B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static b([B)V
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x40

    .line 3
    .line 4
    if-lt v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-byte v0, p0, v0

    .line 8
    .line 9
    const/16 v1, 0x7f

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aget-byte v1, p0, v0

    .line 15
    .line 16
    const/16 v2, 0x45

    .line 17
    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    aget-byte v2, p0, v1

    .line 22
    .line 23
    const/16 v3, 0x4c

    .line 24
    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    aget-byte v2, p0, v2

    .line 29
    .line 30
    const/16 v3, 0x46

    .line 31
    .line 32
    if-ne v2, v3, :cond_1

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    aget-byte v2, p0, v2

    .line 36
    .line 37
    if-ne v2, v1, :cond_0

    .line 38
    .line 39
    const/4 v1, 0x5

    .line 40
    aget-byte p0, p0, v1

    .line 41
    .line 42
    if-ne p0, v0, :cond_0

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    const-string p0, "Native SO must be little-endian ELF64"

    .line 46
    .line 47
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    const-string p0, "Native SO is not an ELF file"

    .line 52
    .line 53
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static c(JJ[B)I
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
    const-wide/32 v0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    cmp-long v0, p2, v0

    .line 15
    .line 16
    if-gtz v0, :cond_0

    .line 17
    .line 18
    array-length p4, p4

    .line 19
    int-to-long v0, p4

    .line 20
    sub-long/2addr v0, p2

    .line 21
    cmp-long p2, p0, v0

    .line 22
    .line 23
    if-gtz p2, :cond_0

    .line 24
    .line 25
    long-to-int p0, p0

    .line 26
    return p0

    .line 27
    :cond_0
    const-string p0, "Native SO metadata is out of range"

    .line 28
    .line 29
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public static d([B)Lbm1;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Lcm1;->b([B)V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x28

    .line 7
    .line 8
    invoke-static {v1, v0}, Lcm1;->i(I[B)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const/16 v3, 0x3a

    .line 13
    .line 14
    invoke-static {v3, v0}, Lcm1;->g(I[B)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x3c

    .line 19
    .line 20
    invoke-static {v4, v0}, Lcm1;->g(I[B)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/16 v6, 0x3e

    .line 25
    .line 26
    invoke-static {v6, v0}, Lcm1;->g(I[B)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    cmp-long v7, v1, v7

    .line 33
    .line 34
    if-lez v7, :cond_9

    .line 35
    .line 36
    const/16 v7, 0x40

    .line 37
    .line 38
    if-lt v3, v7, :cond_9

    .line 39
    .line 40
    if-lez v5, :cond_9

    .line 41
    .line 42
    if-ge v6, v5, :cond_9

    .line 43
    .line 44
    int-to-long v9, v6

    .line 45
    int-to-long v11, v3

    .line 46
    mul-long/2addr v9, v11

    .line 47
    add-long/2addr v9, v1

    .line 48
    invoke-static {v9, v10, v11, v12, v0}, Lcm1;->c(JJ[B)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    add-int/lit8 v6, v3, 0x18

    .line 53
    .line 54
    invoke-static {v6, v0}, Lcm1;->i(I[B)J

    .line 55
    .line 56
    .line 57
    move-result-wide v9

    .line 58
    add-int/lit8 v3, v3, 0x20

    .line 59
    .line 60
    invoke-static {v3, v0}, Lcm1;->i(I[B)J

    .line 61
    .line 62
    .line 63
    move-result-wide v13

    .line 64
    invoke-static {v9, v10, v13, v14, v0}, Lcm1;->c(JJ[B)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    long-to-int v6, v13

    .line 69
    add-int/2addr v6, v3

    .line 70
    const/4 v10, 0x0

    .line 71
    :goto_0
    if-ge v10, v5, :cond_8

    .line 72
    .line 73
    int-to-long v13, v10

    .line 74
    mul-long/2addr v13, v11

    .line 75
    add-long/2addr v13, v1

    .line 76
    invoke-static {v13, v14, v11, v12, v0}, Lcm1;->c(JJ[B)I

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    invoke-static {v13, v0}, Lcm1;->h(I[B)J

    .line 81
    .line 82
    .line 83
    move-result-wide v14

    .line 84
    long-to-int v14, v14

    .line 85
    add-int/2addr v14, v3

    .line 86
    if-ltz v14, :cond_0

    .line 87
    .line 88
    if-ge v14, v6, :cond_0

    .line 89
    .line 90
    array-length v15, v0

    .line 91
    if-le v6, v15, :cond_1

    .line 92
    .line 93
    :cond_0
    const/16 v16, 0x0

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_1
    move v15, v14

    .line 97
    :goto_1
    if-ge v15, v6, :cond_2

    .line 98
    .line 99
    aget-byte v16, v0, v15

    .line 100
    .line 101
    if-eqz v16, :cond_2

    .line 102
    .line 103
    add-int/lit8 v15, v15, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    const/16 v16, 0x0

    .line 107
    .line 108
    new-instance v8, Ljava/lang/String;

    .line 109
    .line 110
    sub-int/2addr v15, v14

    .line 111
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 112
    .line 113
    invoke-direct {v8, v0, v14, v15, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :goto_2
    const-string v8, ""

    .line 118
    .line 119
    :goto_3
    const-string v9, ".note.nksig"

    .line 120
    .line 121
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-nez v8, :cond_3

    .line 126
    .line 127
    add-int/lit8 v10, v10, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    add-int/lit8 v1, v13, 0x18

    .line 131
    .line 132
    invoke-static {v1, v0}, Lcm1;->i(I[B)J

    .line 133
    .line 134
    .line 135
    move-result-wide v1

    .line 136
    add-int/lit8 v13, v13, 0x20

    .line 137
    .line 138
    invoke-static {v13, v0}, Lcm1;->i(I[B)J

    .line 139
    .line 140
    .line 141
    move-result-wide v5

    .line 142
    invoke-static {v1, v2, v5, v6, v0}, Lcm1;->c(JJ[B)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    long-to-int v2, v5

    .line 147
    add-int/2addr v2, v1

    .line 148
    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    array-length v1, v0

    .line 153
    const/16 v2, 0x44

    .line 154
    .line 155
    if-lt v1, v2, :cond_7

    .line 156
    .line 157
    array-length v1, v0

    .line 158
    const/16 v3, 0x8

    .line 159
    .line 160
    if-lt v1, v3, :cond_7

    .line 161
    .line 162
    const/4 v9, 0x0

    .line 163
    :goto_4
    if-ge v9, v3, :cond_4

    .line 164
    .line 165
    aget-byte v1, v0, v9

    .line 166
    .line 167
    sget-object v5, Lcm1;->a:[B

    .line 168
    .line 169
    aget-byte v5, v5, v9

    .line 170
    .line 171
    if-ne v1, v5, :cond_7

    .line 172
    .line 173
    add-int/lit8 v9, v9, 0x1

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_4
    invoke-static {v3, v0}, Lcm1;->h(I[B)J

    .line 177
    .line 178
    .line 179
    move-result-wide v5

    .line 180
    long-to-int v1, v5

    .line 181
    const/4 v3, 0x1

    .line 182
    if-ne v1, v3, :cond_6

    .line 183
    .line 184
    const/16 v1, 0xc

    .line 185
    .line 186
    invoke-static {v1, v0}, Lcm1;->i(I[B)J

    .line 187
    .line 188
    .line 189
    move-result-wide v9

    .line 190
    const/16 v1, 0x14

    .line 191
    .line 192
    const/16 v3, 0x34

    .line 193
    .line 194
    invoke-static {v0, v1, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    invoke-static {v3, v0}, Lcm1;->h(I[B)J

    .line 199
    .line 200
    .line 201
    move-result-wide v5

    .line 202
    long-to-int v1, v5

    .line 203
    const/16 v3, 0x38

    .line 204
    .line 205
    invoke-static {v3, v0}, Lcm1;->h(I[B)J

    .line 206
    .line 207
    .line 208
    move-result-wide v5

    .line 209
    long-to-int v3, v5

    .line 210
    invoke-static {v4, v0}, Lcm1;->h(I[B)J

    .line 211
    .line 212
    .line 213
    move-result-wide v4

    .line 214
    long-to-int v4, v4

    .line 215
    invoke-static {v7, v0}, Lcm1;->h(I[B)J

    .line 216
    .line 217
    .line 218
    move-result-wide v5

    .line 219
    long-to-int v5, v5

    .line 220
    add-int/lit8 v6, v1, 0x44

    .line 221
    .line 222
    add-int v7, v6, v3

    .line 223
    .line 224
    add-int v8, v7, v4

    .line 225
    .line 226
    add-int v12, v8, v5

    .line 227
    .line 228
    if-lez v1, :cond_5

    .line 229
    .line 230
    if-lez v3, :cond_5

    .line 231
    .line 232
    if-lez v4, :cond_5

    .line 233
    .line 234
    if-lez v5, :cond_5

    .line 235
    .line 236
    array-length v1, v0

    .line 237
    if-ne v12, v1, :cond_5

    .line 238
    .line 239
    invoke-static {v0, v2, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    invoke-static {v0, v6, v7}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    new-instance v14, Ljava/lang/String;

    .line 248
    .line 249
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 250
    .line 251
    invoke-direct {v14, v0, v7, v4, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 252
    .line 253
    .line 254
    new-instance v15, Ljava/lang/String;

    .line 255
    .line 256
    invoke-direct {v15, v0, v8, v5, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 257
    .line 258
    .line 259
    new-instance v8, Lbm1;

    .line 260
    .line 261
    invoke-direct/range {v8 .. v15}, Lbm1;-><init>(J[B[B[BLjava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    return-object v8

    .line 265
    :cond_5
    const-string v0, "Native SO signature envelope length mismatch"

    .line 266
    .line 267
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    return-object v16

    .line 271
    :cond_6
    const-string v0, "Native SO signature version is unsupported"

    .line 272
    .line 273
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v16

    .line 277
    :cond_7
    const-string v0, "Native SO signature envelope is invalid"

    .line 278
    .line 279
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    return-object v16

    .line 283
    :cond_8
    const/16 v16, 0x0

    .line 284
    .line 285
    const-string v0, "Native SO signature section missing"

    .line 286
    .line 287
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    return-object v16

    .line 291
    :cond_9
    const/16 v16, 0x0

    .line 292
    .line 293
    const-string v0, "Native SO section table is unavailable"

    .line 294
    .line 295
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return-object v16
.end method

.method public static e([B)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    array-length v1, p0

    .line 14
    mul-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    array-length v1, p0

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_0

    .line 22
    .line 23
    aget-byte v3, p0, v2

    .line 24
    .line 25
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 26
    .line 27
    and-int/lit16 v3, v3, 0xff

    .line 28
    .line 29
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v5, "%02x"

    .line 38
    .line 39
    invoke-static {v4, v5, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static f([B)[B
    .locals 15

    .line 1
    invoke-static {p0}, Lcm1;->b([B)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    invoke-static {v0, p0}, Lcm1;->i(I[B)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const/16 v2, 0x36

    .line 11
    .line 12
    invoke-static {v2, p0}, Lcm1;->g(I[B)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/16 v3, 0x38

    .line 17
    .line 18
    invoke-static {v3, p0}, Lcm1;->g(I[B)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-string v4, "SHA-256"

    .line 23
    .line 24
    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    sget-object v5, Lcm1;->c:[B

    .line 29
    .line 30
    invoke-virtual {v4, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 31
    .line 32
    .line 33
    const/16 v5, 0x40

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-static {p0, v6, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v5}, Lcm1;->m([B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 44
    .line 45
    .line 46
    int-to-long v7, v2

    .line 47
    int-to-long v9, v3

    .line 48
    mul-long/2addr v9, v7

    .line 49
    invoke-static {v0, v1, v9, v10, p0}, Lcm1;->c(JJ[B)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    mul-int/2addr v2, v3

    .line 54
    invoke-virtual {v4, p0, v5, v2}, Ljava/security/MessageDigest;->update([BII)V

    .line 55
    .line 56
    .line 57
    move v2, v6

    .line 58
    :goto_0
    if-ge v6, v3, :cond_2

    .line 59
    .line 60
    int-to-long v9, v6

    .line 61
    mul-long/2addr v9, v7

    .line 62
    add-long/2addr v9, v0

    .line 63
    invoke-static {v9, v10, v7, v8, p0}, Lcm1;->c(JJ[B)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-static {v5, p0}, Lcm1;->h(I[B)J

    .line 68
    .line 69
    .line 70
    move-result-wide v9

    .line 71
    long-to-int v9, v9

    .line 72
    const/4 v10, 0x1

    .line 73
    if-eq v9, v10, :cond_0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_0
    add-int/lit8 v9, v5, 0x8

    .line 77
    .line 78
    invoke-static {v9, p0}, Lcm1;->i(I[B)J

    .line 79
    .line 80
    .line 81
    move-result-wide v9

    .line 82
    add-int/lit8 v5, v5, 0x20

    .line 83
    .line 84
    invoke-static {v5, p0}, Lcm1;->i(I[B)J

    .line 85
    .line 86
    .line 87
    move-result-wide v11

    .line 88
    invoke-static {v9, v10, v11, v12, p0}, Lcm1;->c(JJ[B)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    long-to-int v13, v11

    .line 93
    add-int/2addr v13, v5

    .line 94
    invoke-static {p0, v5, v13}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    const-wide/16 v13, 0x0

    .line 99
    .line 100
    cmp-long v9, v9, v13

    .line 101
    .line 102
    if-nez v9, :cond_1

    .line 103
    .line 104
    const-wide/16 v9, 0x40

    .line 105
    .line 106
    cmp-long v9, v11, v9

    .line 107
    .line 108
    if-ltz v9, :cond_1

    .line 109
    .line 110
    invoke-static {v5}, Lcm1;->m([B)V

    .line 111
    .line 112
    .line 113
    :cond_1
    invoke-virtual {v4, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    if-eqz v2, :cond_3

    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :cond_3
    const-string p0, "Native SO has no loadable segments"

    .line 129
    .line 130
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const/4 p0, 0x0

    .line 134
    return-object p0
.end method

.method public static g(I[B)I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p1, p0, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const p1, 0xffff

    .line 17
    .line 18
    .line 19
    and-int/2addr p0, p1

    .line 20
    return p0
.end method

.method public static h(I[B)J
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p1, p0, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    int-to-long p0, p0

    .line 17
    const-wide v0, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p0, v0

    .line 23
    return-wide p0
.end method

.method public static i(I[B)J
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {p1, p0, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    return-wide p0
.end method

.method public static j([BLjava/lang/String;)V
    .locals 13

    .line 1
    const-string v0, "Native SO signed size is invalid: "

    .line 2
    .line 3
    const-string v1, "Native SO certificate subject mismatch: "

    .line 4
    .line 5
    const-string v2, "Native SO signature verification failed: "

    .line 6
    .line 7
    const-string v3, "Native SO signature description mismatch: "

    .line 8
    .line 9
    const-string v4, "Native SO certificate fingerprint mismatch: "

    .line 10
    .line 11
    const-string v5, "Native SO load hash mismatch: "

    .line 12
    .line 13
    :try_start_0
    invoke-static {p0}, Lcm1;->d([B)Lbm1;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    iget-object v7, v6, Lbm1;->f:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v8, v6, Lbm1;->b:[B

    .line 20
    .line 21
    iget-wide v9, v6, Lbm1;->a:J

    .line 22
    .line 23
    const-wide/16 v11, 0x0

    .line 24
    .line 25
    cmp-long v11, v9, v11

    .line 26
    .line 27
    if-lez v11, :cond_6

    .line 28
    .line 29
    array-length v11, p0

    .line 30
    int-to-long v11, v11

    .line 31
    cmp-long v11, v9, v11

    .line 32
    .line 33
    if-gtz v11, :cond_6

    .line 34
    .line 35
    invoke-static {p0}, Lcm1;->f([B)[B

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0, v8}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_5

    .line 44
    .line 45
    const-string p0, "X.509"

    .line 46
    .line 47
    invoke-static {p0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 52
    .line 53
    iget-object v5, v6, Lbm1;->c:[B

    .line 54
    .line 55
    invoke-direct {v0, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->checkValidity()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, v0}, Ljava/security/cert/Certificate;->verify(Ljava/security/PublicKey;)V

    .line 72
    .line 73
    .line 74
    const-string v0, "341e386452ad60d52c0ff2c53e06e2c385ac6f03ccfe954043193a0acde8dbe4"

    .line 75
    .line 76
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 77
    .line 78
    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v5}, Lcm1;->e([B)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-nez v11, :cond_1

    .line 95
    .line 96
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_0

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    new-instance p0, Ljava/lang/SecurityException;

    .line 104
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :catch_0
    move-exception p0

    .line 122
    goto/16 :goto_1

    .line 123
    .line 124
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v4, "RFC2253"

    .line 129
    .line 130
    invoke-virtual {v0, v4}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-string v4, "CN=Admilk"

    .line 135
    .line 136
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_4

    .line 141
    .line 142
    const-string v4, "OU=design by Admilk"

    .line 143
    .line 144
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    const-string v0, "design by Admilk"

    .line 151
    .line 152
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_3

    .line 157
    .line 158
    const-string v0, "SHA256withRSA"

    .line 159
    .line 160
    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {v0, p0}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 169
    .line 170
    .line 171
    iget-object p0, v6, Lbm1;->e:Ljava/lang/String;

    .line 172
    .line 173
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 174
    .line 175
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {v7, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-static {v9, v10, v8, p0, v1}, Lcm1;->a(J[B[B[B)[B

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {v0, p0}, Ljava/security/Signature;->update([B)V

    .line 188
    .line 189
    .line 190
    iget-object p0, v6, Lbm1;->d:[B

    .line 191
    .line 192
    invoke-virtual {v0, p0}, Ljava/security/Signature;->verify([B)Z

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    if-eqz p0, :cond_2

    .line 197
    .line 198
    return-void

    .line 199
    :cond_2
    new-instance p0, Ljava/lang/SecurityException;

    .line 200
    .line 201
    new-instance v0, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p0

    .line 217
    :cond_3
    new-instance p0, Ljava/lang/SecurityException;

    .line 218
    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw p0

    .line 235
    :cond_4
    new-instance p0, Ljava/lang/SecurityException;

    .line 236
    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw p0

    .line 253
    :cond_5
    new-instance p0, Ljava/lang/SecurityException;

    .line 254
    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw p0

    .line 271
    :cond_6
    new-instance p0, Ljava/lang/SecurityException;

    .line 272
    .line 273
    new-instance v1, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 289
    :goto_1
    new-instance v0, Ljava/lang/SecurityException;

    .line 290
    .line 291
    const-string v1, "Native SO signature check failed: "

    .line 292
    .line 293
    invoke-static {v1, p1}, Lvi0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-direct {v0, p1, p0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    throw v0

    .line 301
    :catch_1
    move-exception p0

    .line 302
    throw p0
.end method

.method public static k(Ljava/io/File;)V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/FileInputStream;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    const/16 v2, 0x2000

    .line 12
    .line 13
    :try_start_1
    new-array v2, v2, [B

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/FileInputStream;->read([B)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, -0x1

    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-virtual {v0, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0, v1}, Lcm1;->j([BLjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catch_0
    move-exception v0

    .line 45
    goto :goto_2

    .line 46
    :goto_1
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 47
    .line 48
    .line 49
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 50
    :goto_2
    new-instance v1, Ljava/lang/SecurityException;

    .line 51
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, "Native SO read failed: "

    .line 55
    .line 56
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {v1, p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw v1
.end method

.method public static l(Ljava/io/ByteArrayOutputStream;I)V
    .locals 1

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 4
    .line 5
    .line 6
    ushr-int/lit8 v0, p1, 0x8

    .line 7
    .line 8
    and-int/lit16 v0, v0, 0xff

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 11
    .line 12
    .line 13
    ushr-int/lit8 v0, p1, 0x10

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 18
    .line 19
    .line 20
    ushr-int/lit8 p1, p1, 0x18

    .line 21
    .line 22
    and-int/lit16 p1, p1, 0xff

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static m([B)V
    .locals 3

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 7
    .line 8
    .line 9
    const/16 v0, 0x3a

    .line 10
    .line 11
    aput-byte v2, p0, v0

    .line 12
    .line 13
    const/16 v0, 0x3b

    .line 14
    .line 15
    aput-byte v2, p0, v0

    .line 16
    .line 17
    const/16 v0, 0x3c

    .line 18
    .line 19
    aput-byte v2, p0, v0

    .line 20
    .line 21
    const/16 v0, 0x3d

    .line 22
    .line 23
    aput-byte v2, p0, v0

    .line 24
    .line 25
    const/16 v0, 0x3e

    .line 26
    .line 27
    aput-byte v2, p0, v0

    .line 28
    .line 29
    const/16 v0, 0x3f

    .line 30
    .line 31
    aput-byte v2, p0, v0

    .line 32
    .line 33
    return-void
.end method
