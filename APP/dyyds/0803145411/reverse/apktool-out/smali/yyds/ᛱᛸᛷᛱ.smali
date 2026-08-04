.class public final Lyyds/ᛱᛸᛷᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field private static final ᛲᛴᛳᛲ:I = 0xc

.field public static final ᛲᲈᲁ:Lyyds/ᛱᛸᛷᛱ;

.field private static final ᛵᛸᛸᛷ:I = 0x1

.field private static final ᲀᛲᛳᲀ:I = 0x2

.field private static final ᲇᲈᛵᛷ:I = 0x10


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛱᛸᛷᛱ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᛸᛷᛱ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛱᛸᛷᛱ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛷᛱ;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final ᛵᛸᛸᛷ([B[B)[B
    .locals 3

    .line 1
    const-wide v0, -0x1e833e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 15
    .line 16
    const-wide v1, -0x1e83ee68a836eL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p2}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-wide p1, -0x1e849e68a836eL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    return-object p0
.end method

.method private final ᲇᲈᛵᛷ()[B
    .locals 0

    .line 1
    const/16 p0, 0x10

    .line 2
    .line 3
    new-array p0, p0, [B

    .line 4
    .line 5
    fill-array-data p0, :array_0

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :array_0
    .array-data 1
        -0x3t
        -0xet
        0x13t
        0x17t
        0x2dt
        -0x1ct
        -0x18t
        -0x54t
        0x55t
        -0x47t
        -0x71t
        -0xft
        -0x75t
        0x45t
        0x3t
        -0x3t
    .end array-data
.end method


# virtual methods
.method public final ᛲᲈᲁ(I[B[B)[B
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const-wide v4, -0x1e77de68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v4, -0x1e787e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    array-length v4, v2

    .line 26
    const/16 v5, 0x10

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    if-ne v4, v5, :cond_4

    .line 30
    .line 31
    array-length v4, v3

    .line 32
    const/16 v5, 0xc

    .line 33
    .line 34
    if-ne v4, v5, :cond_3

    .line 35
    .line 36
    const/16 v9, 0x20

    .line 37
    .line 38
    new-array v4, v9, [B

    .line 39
    .line 40
    fill-array-data v4, :array_0

    .line 41
    .line 42
    .line 43
    new-array v5, v9, [B

    .line 44
    .line 45
    fill-array-data v5, :array_1

    .line 46
    .line 47
    .line 48
    new-array v10, v9, [B

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    move v7, v11

    .line 52
    :goto_0
    if-ge v7, v9, :cond_0

    .line 53
    .line 54
    aget-byte v8, v4, v7

    .line 55
    .line 56
    aget-byte v12, v5, v7

    .line 57
    .line 58
    xor-int/2addr v8, v12

    .line 59
    int-to-byte v8, v8

    .line 60
    aput-byte v8, v10, v7

    .line 61
    .line 62
    add-int/lit8 v7, v7, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-static {v4, v11, v9, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 66
    .line 67
    .line 68
    invoke-static {v5, v11, v9, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 69
    .line 70
    .line 71
    const/4 v12, 0x1

    .line 72
    if-eq v1, v12, :cond_2

    .line 73
    .line 74
    const/4 v4, 0x2

    .line 75
    if-ne v1, v4, :cond_1

    .line 76
    .line 77
    const-wide v4, -0x1e7e8e68a836eL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-static {v10, v11, v9, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 88
    .line 89
    .line 90
    const-wide v0, -0x1e802e68a836eL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v6

    .line 103
    :cond_2
    const-wide v4, -0x1e7cfe68a836eL

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    :goto_1
    sget-object v4, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 113
    .line 114
    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    const-wide v4, -0x1e825e68a836eL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lyyds/ᛱᛸᛷᛱ;->ᲀᛲᛳᲀ()[B

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    array-length v4, v13

    .line 131
    array-length v5, v1

    .line 132
    add-int/2addr v4, v5

    .line 133
    array-length v5, v3

    .line 134
    add-int/2addr v4, v5

    .line 135
    array-length v5, v2

    .line 136
    add-int/2addr v4, v5

    .line 137
    new-array v14, v4, [B

    .line 138
    .line 139
    const/16 v17, 0x0

    .line 140
    .line 141
    const/16 v18, 0xc

    .line 142
    .line 143
    const/4 v15, 0x0

    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    invoke-static/range {v13 .. v18}, Lyyds/ᲀᲀᛷᛸ;->ᛲᛶᛱᲈ([B[BIIII)V

    .line 147
    .line 148
    .line 149
    array-length v5, v13

    .line 150
    const/16 v18, 0x0

    .line 151
    .line 152
    const/16 v19, 0xc

    .line 153
    .line 154
    move/from16 v16, v5

    .line 155
    .line 156
    move-object v15, v14

    .line 157
    move-object v14, v1

    .line 158
    invoke-static/range {v14 .. v19}, Lyyds/ᲀᲀᛷᛸ;->ᛲᛶᛱᲈ([B[BIIII)V

    .line 159
    .line 160
    .line 161
    array-length v1, v14

    .line 162
    add-int v5, v16, v1

    .line 163
    .line 164
    const/4 v7, 0x0

    .line 165
    const/16 v8, 0xc

    .line 166
    .line 167
    const/4 v6, 0x0

    .line 168
    move-object/from16 v20, v15

    .line 169
    .line 170
    move v15, v4

    .line 171
    move-object/from16 v4, v20

    .line 172
    .line 173
    invoke-static/range {v3 .. v8}, Lyyds/ᲀᲀᛷᛸ;->ᛲᛶᛱᲈ([B[BIIII)V

    .line 174
    .line 175
    .line 176
    array-length v1, v3

    .line 177
    add-int v3, v5, v1

    .line 178
    .line 179
    const/4 v5, 0x0

    .line 180
    const/16 v6, 0xc

    .line 181
    .line 182
    move-object v2, v4

    .line 183
    const/4 v4, 0x0

    .line 184
    move-object/from16 v1, p2

    .line 185
    .line 186
    invoke-static/range {v1 .. v6}, Lyyds/ᲀᲀᛷᛸ;->ᛲᛶᛱᲈ([B[BIIII)V

    .line 187
    .line 188
    .line 189
    invoke-direct {v0}, Lyyds/ᛱᛸᛷᛱ;->ᲇᲈᛵᛷ()[B

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    :try_start_0
    invoke-direct {v0, v1, v10}, Lyyds/ᛱᛸᛷᛱ;->ᛵᛸᛸᛷ([B[B)[B

    .line 194
    .line 195
    .line 196
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 197
    invoke-static {v10, v11, v9, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v11}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᛵᛸ([BB)V

    .line 201
    .line 202
    .line 203
    add-int/lit8 v4, v15, 0x1

    .line 204
    .line 205
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    aput-byte v12, v1, v15

    .line 210
    .line 211
    :try_start_1
    invoke-direct {v0, v3, v1}, Lyyds/ᛱᛸᛷᛱ;->ᛵᛸᛸᛷ([B[B)[B

    .line 212
    .line 213
    .line 214
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 215
    invoke-static {v3, v11}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᛵᛸ([BB)V

    .line 216
    .line 217
    .line 218
    array-length v3, v1

    .line 219
    invoke-static {v1, v11, v3, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 220
    .line 221
    .line 222
    invoke-static {v2, v11, v15, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 223
    .line 224
    .line 225
    array-length v1, v13

    .line 226
    invoke-static {v13, v11, v1, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 227
    .line 228
    .line 229
    array-length v1, v14

    .line 230
    invoke-static {v14, v11, v1, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 231
    .line 232
    .line 233
    return-object v0

    .line 234
    :catchall_0
    move-exception v0

    .line 235
    invoke-static {v3, v11}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᛵᛸ([BB)V

    .line 236
    .line 237
    .line 238
    array-length v3, v1

    .line 239
    invoke-static {v1, v11, v3, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 240
    .line 241
    .line 242
    invoke-static {v2, v11, v15, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 243
    .line 244
    .line 245
    array-length v1, v13

    .line 246
    invoke-static {v13, v11, v1, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 247
    .line 248
    .line 249
    array-length v1, v14

    .line 250
    invoke-static {v14, v11, v1, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 251
    .line 252
    .line 253
    throw v0

    .line 254
    :catchall_1
    move-exception v0

    .line 255
    invoke-static {v10, v11, v9, v11}, Ljava/util/Arrays;->fill([BIIB)V

    .line 256
    .line 257
    .line 258
    invoke-static {v1, v11}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᛵᛸ([BB)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_3
    const-wide v0, -0x1e7b0e68a836eL

    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-object v6

    .line 275
    :cond_4
    const-wide v0, -0x1e796e68a836eL

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    return-object v6

    .line 288
    nop

    .line 289
    :array_0
    .array-data 1
        -0x1et
        0x4et
        0x54t
        0x4ft
        0x5ft
        -0x42t
        0x24t
        -0x41t
        0x65t
        0x25t
        -0x73t
        0x51t
        0x7dt
        0xet
        0x39t
        -0x78t
        -0x1t
        -0x6bt
        0x4dt
        0x48t
        0x34t
        0x4ft
        0x76t
        -0x74t
        -0x12t
        -0x7et
        0x17t
        -0x21t
        0x69t
        -0x4ct
        0x59t
        0x61t
    .end array-data

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    :array_1
    .array-data 1
        -0x1dt
        0x52t
        -0x71t
        0x28t
        -0xdt
        0x62t
        -0x2bt
        0x73t
        -0x2t
        -0x4ct
        0x4et
        -0x3dt
        -0x76t
        -0x4ct
        -0x21t
        -0x1t
        0x2t
        -0x5et
        -0x39t
        0x29t
        0x0t
        -0x5ct
        0x6at
        0x5et
        -0x80t
        0x22t
        -0x66t
        0x4t
        0x37t
        -0x71t
        0x20t
        -0x4ft
    .end array-data
.end method

.method public final ᲀᛲᛳᲀ()[B
    .locals 2

    .line 1
    invoke-direct {p0}, Lyyds/ᛱᛸᛷᛱ;->ᲇᲈᛵᛷ()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-wide v0, -0x1e771e68a836eL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    return-object p0
.end method
