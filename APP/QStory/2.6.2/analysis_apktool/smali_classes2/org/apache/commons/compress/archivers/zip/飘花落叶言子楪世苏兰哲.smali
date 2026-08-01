.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final 飘花落叶言子楪兰苏哲世:Lorg/apache/commons/compress/archivers/zip/ZipShort;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Z

.field public 飘花落叶言子楪兰世苏哲:Ljava/lang/String;

.field public 飘花落叶言子楪兰苏世哲:Ljava/util/zip/CRC32;

.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    const/16 v1, 0x756e

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    new-instance v0, Ljava/util/zip/CRC32;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/util/zip/CRC32;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public final getCentralDirectoryData()[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->getLocalFileDataData()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getCentralDirectoryLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->getLocalFileDataLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLocalFileDataData()[B
    .locals 9

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->getLocalFileDataLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v1, v0, -0x4

    .line 10
    .line 11
    new-array v2, v1, [B

    .line 12
    .line 13
    iget v3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 14
    .line 15
    invoke-static {v3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getBytes(I)[B

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x2

    .line 21
    invoke-static {v3, v4, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-virtual {v3, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    array-length v6, v3

    .line 35
    int-to-long v6, v6

    .line 36
    invoke-static {v6, v7}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes(J)[B

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const/4 v7, 0x4

    .line 41
    invoke-static {v6, v4, v2, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    iget v6, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 45
    .line 46
    invoke-static {v6}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getBytes(I)[B

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    const/4 v8, 0x6

    .line 51
    invoke-static {v6, v4, v2, v8, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    iget v6, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 55
    .line 56
    invoke-static {v6}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getBytes(I)[B

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const/16 v8, 0x8

    .line 61
    .line 62
    invoke-static {v6, v4, v2, v8, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    .line 64
    .line 65
    const/16 v5, 0xa

    .line 66
    .line 67
    array-length v6, v3

    .line 68
    invoke-static {v3, v4, v2, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 69
    .line 70
    .line 71
    iget-object v3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/util/zip/CRC32;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->reset()V

    .line 74
    .line 75
    .line 76
    iget-object v3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/util/zip/CRC32;

    .line 77
    .line 78
    invoke-virtual {v3, v2}, Ljava/util/zip/CRC32;->update([B)V

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/util/zip/CRC32;

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/util/zip/CRC32;->getValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v5

    .line 87
    new-array p0, v0, [B

    .line 88
    .line 89
    invoke-static {v5, v6}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes(J)[B

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0, v4, p0, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    .line 95
    .line 96
    invoke-static {v2, v4, p0, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    .line 98
    .line 99
    return-object p0
.end method

.method public final getLocalFileDataLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    array-length p0, p0

    .line 14
    add-int/lit8 p0, p0, 0xe

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final parseFromCentralDirectoryData([BII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->parseFromLocalFileData([BII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final parseFromLocalFileData([BII)V
    .locals 6

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    if-lt p3, v0, :cond_4

    .line 4
    .line 5
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getValue([BI)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    add-int/lit8 v3, p3, -0x4

    .line 10
    .line 11
    new-array v4, v3, [B

    .line 12
    .line 13
    add-int/lit8 p2, p2, 0x4

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-static {p1, p2, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/util/zip/CRC32;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/zip/CRC32;->reset()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/util/zip/CRC32;

    .line 25
    .line 26
    invoke-virtual {p1, v4}, Ljava/util/zip/CRC32;->update([B)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/util/zip/CRC32;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/util/zip/CRC32;->getValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    cmp-long v3, v1, p1

    .line 36
    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    invoke-static {v4, v5}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    const/4 p2, 0x2

    .line 44
    invoke-static {v4, p2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getValue([BI)J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    long-to-int p2, v1

    .line 49
    if-ltz p2, :cond_2

    .line 50
    .line 51
    sub-int/2addr p3, v0

    .line 52
    if-gt p2, p3, :cond_2

    .line 53
    .line 54
    const/4 p3, 0x6

    .line 55
    invoke-static {v4, p3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    iput p3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 60
    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    invoke-static {v4, p3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    iput p3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 68
    .line 69
    if-nez p2, :cond_0

    .line 70
    .line 71
    const-string p2, ""

    .line 72
    .line 73
    iput-object p2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-array p3, p2, [B

    .line 77
    .line 78
    const/16 v0, 0xa

    .line 79
    .line 80
    invoke-static {v4, v0, p3, v5, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    .line 82
    .line 83
    new-instance p2, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {p2, p3, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 93
    .line 94
    :goto_0
    and-int/lit16 p2, p1, 0x4000

    .line 95
    .line 96
    if-eqz p2, :cond_1

    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    :cond_1
    iput-boolean v5, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 100
    .line 101
    iget p2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 102
    .line 103
    invoke-virtual {p0, p2}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(I)I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    iput p2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iput p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 114
    .line 115
    return-void

    .line 116
    :cond_2
    new-instance p0, Ljava/util/zip/ZipException;

    .line 117
    .line 118
    const-string p1, "Bad symbolic link name length "

    .line 119
    .line 120
    const-string p3, " in ASI extra field"

    .line 121
    .line 122
    invoke-static {p2, p1, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {p0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p0

    .line 130
    :cond_3
    new-instance p0, Ljava/util/zip/ZipException;

    .line 131
    .line 132
    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    invoke-static {p1, p2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance p2, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string v0, "Bad CRC checksum, expected "

    .line 143
    .line 144
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string p3, " instead of "

    .line 151
    .line 152
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-direct {p0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p0

    .line 166
    :cond_4
    new-instance p0, Ljava/util/zip/ZipException;

    .line 167
    .line 168
    const-string p1, "The length is too short, only "

    .line 169
    .line 170
    const-string p2, " bytes, expected at least 14"

    .line 171
    .line 172
    invoke-static {p3, p1, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-direct {p0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const p0, 0xa000

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-boolean v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const/16 p0, 0x4000

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const p0, 0x8000

    .line 29
    .line 30
    .line 31
    :goto_0
    and-int/lit16 p1, p1, 0xfff

    .line 32
    .line 33
    or-int/2addr p0, p1

    .line 34
    return p0
.end method
