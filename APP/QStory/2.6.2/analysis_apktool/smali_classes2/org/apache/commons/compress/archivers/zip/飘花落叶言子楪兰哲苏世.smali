.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;
.super Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/ZipShort;


# instance fields
.field public 飘花落叶言子楪兰世苏哲:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 9
    .line 10
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(IILjava/lang/String;I)V
    .locals 3

    .line 1
    add-int v0, p1, p0

    .line 2
    .line 3
    if-gt v0, p3, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/util/zip/ZipException;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "Invalid X0017_StrongEncryptionHeader: "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p2, " "

    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, " doesn\'t fit into "

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, " bytes of data at position "

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v0, p0}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
.end method


# virtual methods
.method public final parseFromCentralDirectoryData([BII)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->parseFromCentralDirectoryData([BII)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xc

    .line 5
    .line 6
    invoke-virtual {p0, v0, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 10
    .line 11
    .line 12
    add-int/lit8 v0, p2, 0x2

    .line 13
    .line 14
    invoke-static {p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$EncryptionAlgorithm;->getAlgorithmByCode(I)Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$EncryptionAlgorithm;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, p2, 0x4

    .line 22
    .line 23
    invoke-static {p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 24
    .line 25
    .line 26
    add-int/lit8 v0, p2, 0x6

    .line 27
    .line 28
    invoke-static {p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, p2, 0x8

    .line 32
    .line 33
    invoke-static {p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getValue([BI)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-lez v0, :cond_0

    .line 42
    .line 43
    const/16 v0, 0x10

    .line 44
    .line 45
    invoke-virtual {p0, v0, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 p3, p2, 0xc

    .line 49
    .line 50
    invoke-static {p1, p3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    invoke-static {p3}, Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$HashAlgorithm;->getAlgorithmByCode(I)Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$HashAlgorithm;

    .line 55
    .line 56
    .line 57
    add-int/lit8 p2, p2, 0xe

    .line 58
    .line 59
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:I

    .line 64
    .line 65
    :cond_0
    return-void
.end method

.method public final parseFromLocalFileData([BII)V
    .locals 11

    .line 1
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->parseFromLocalFileData([BII)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    invoke-virtual {p0, v0, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const-string v2, "ivSize"

    .line 13
    .line 14
    invoke-static {v1, v0, v2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲(IILjava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, p2, 0x4

    .line 18
    .line 19
    invoke-virtual {p0, v2, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x10

    .line 26
    .line 27
    invoke-virtual {p0, v2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 28
    .line 29
    .line 30
    add-int/2addr p2, v1

    .line 31
    add-int/lit8 v3, p2, 0x6

    .line 32
    .line 33
    invoke-static {p1, v3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 34
    .line 35
    .line 36
    add-int/lit8 v3, p2, 0x8

    .line 37
    .line 38
    invoke-static {p1, v3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {v3}, Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$EncryptionAlgorithm;->getAlgorithmByCode(I)Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$EncryptionAlgorithm;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, p2, 0xa

    .line 46
    .line 47
    invoke-static {p1, v3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, p2, 0xc

    .line 51
    .line 52
    invoke-static {p1, v3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 53
    .line 54
    .line 55
    add-int/lit8 v3, p2, 0xe

    .line 56
    .line 57
    invoke-static {p1, v3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const-string v4, "erdSize"

    .line 62
    .line 63
    invoke-static {v3, v2, v4, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲(IILjava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v2, p2, 0x10

    .line 67
    .line 68
    invoke-virtual {p0, v2, v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 72
    .line 73
    .line 74
    add-int/lit8 v4, v1, 0x14

    .line 75
    .line 76
    add-int/2addr v4, v3

    .line 77
    invoke-virtual {p0, v4, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 78
    .line 79
    .line 80
    add-int/2addr v2, v3

    .line 81
    invoke-static {p1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getValue([BI)J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    const-wide/16 v7, 0x0

    .line 86
    .line 87
    cmp-long v2, v5, v7

    .line 88
    .line 89
    const-string v5, " is too small to hold CRC"

    .line 90
    .line 91
    const-string v6, "Invalid X0017_StrongEncryptionHeader: vSize "

    .line 92
    .line 93
    const-string v7, "vSize"

    .line 94
    .line 95
    if-nez v2, :cond_1

    .line 96
    .line 97
    add-int/lit8 v4, v4, 0x2

    .line 98
    .line 99
    invoke-virtual {p0, v4, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v2, p2, 0x14

    .line 103
    .line 104
    add-int/2addr v2, v3

    .line 105
    invoke-static {p1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    add-int/lit8 v1, v1, 0x16

    .line 110
    .line 111
    add-int/2addr v1, v3

    .line 112
    invoke-static {v2, v1, v7, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲(IILjava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    if-lt v2, v0, :cond_0

    .line 116
    .line 117
    add-int/lit8 p2, p2, 0x16

    .line 118
    .line 119
    add-int/2addr p2, v3

    .line 120
    add-int/lit8 p3, v2, -0x4

    .line 121
    .line 122
    invoke-virtual {p0, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 126
    .line 127
    .line 128
    add-int/2addr p2, v2

    .line 129
    sub-int/2addr p2, v0

    .line 130
    invoke-virtual {p0, p2, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 131
    .line 132
    .line 133
    invoke-static {p1, p2, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_0
    new-instance p0, Ljava/util/zip/ZipException;

    .line 138
    .line 139
    invoke-static {v2, v6, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {p0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p0

    .line 147
    :cond_1
    add-int/lit8 v4, v4, 0x6

    .line 148
    .line 149
    invoke-virtual {p0, v4, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v2, p2, 0x14

    .line 153
    .line 154
    add-int/2addr v2, v3

    .line 155
    invoke-static {p1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    invoke-static {v2}, Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$HashAlgorithm;->getAlgorithmByCode(I)Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$HashAlgorithm;

    .line 160
    .line 161
    .line 162
    add-int/lit8 v2, p2, 0x16

    .line 163
    .line 164
    add-int/2addr v2, v3

    .line 165
    invoke-static {p1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    iput v4, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:I

    .line 170
    .line 171
    add-int/lit8 v4, p2, 0x18

    .line 172
    .line 173
    add-int/2addr v4, v3

    .line 174
    invoke-static {p1, v4}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    iget v9, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:I

    .line 179
    .line 180
    if-lt v8, v9, :cond_3

    .line 181
    .line 182
    add-int/lit8 v9, v1, 0x18

    .line 183
    .line 184
    add-int/2addr v9, v3

    .line 185
    const-string v10, "resize"

    .line 186
    .line 187
    invoke-static {v8, v9, v10, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲(IILjava/lang/String;I)V

    .line 188
    .line 189
    .line 190
    iget v9, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:I

    .line 191
    .line 192
    invoke-static {p1, v4, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 193
    .line 194
    .line 195
    iget v9, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:I

    .line 196
    .line 197
    add-int/2addr v4, v9

    .line 198
    sub-int v9, v8, v9

    .line 199
    .line 200
    invoke-static {p1, v4, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 201
    .line 202
    .line 203
    add-int/lit8 v4, v1, 0x1a

    .line 204
    .line 205
    add-int/2addr v4, v3

    .line 206
    add-int/2addr v4, v8

    .line 207
    add-int/lit8 v4, v4, 0x2

    .line 208
    .line 209
    invoke-virtual {p0, v4, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 p2, p2, 0x1a

    .line 213
    .line 214
    add-int/2addr p2, v3

    .line 215
    add-int/2addr p2, v8

    .line 216
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-lt p0, v0, :cond_2

    .line 221
    .line 222
    add-int/lit8 v1, v1, 0x16

    .line 223
    .line 224
    add-int/2addr v1, v3

    .line 225
    add-int/2addr v1, v8

    .line 226
    invoke-static {p0, v1, v7, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲(IILjava/lang/String;I)V

    .line 227
    .line 228
    .line 229
    add-int/2addr v2, v8

    .line 230
    add-int/lit8 p2, p0, -0x4

    .line 231
    .line 232
    invoke-static {p1, v2, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 233
    .line 234
    .line 235
    add-int/2addr v2, p0

    .line 236
    sub-int/2addr v2, v0

    .line 237
    invoke-static {p1, v2, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_2
    new-instance p1, Ljava/util/zip/ZipException;

    .line 242
    .line 243
    invoke-static {p0, v6, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-direct {p1, p0}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw p1

    .line 251
    :cond_3
    new-instance p1, Ljava/util/zip/ZipException;

    .line 252
    .line 253
    const-string p2, "Invalid X0017_StrongEncryptionHeader: resize "

    .line 254
    .line 255
    const-string p3, " is too small to hold hashSize"

    .line 256
    .line 257
    invoke-static {v8, p2, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    iget p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:I

    .line 262
    .line 263
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    invoke-direct {p1, p0}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw p1
.end method
