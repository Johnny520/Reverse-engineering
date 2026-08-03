.class public final Lokio/GzipSource;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lokio/Source;


# instance fields
.field private final crc:Ljava/util/zip/CRC32;

.field private final inflater:Ljava/util/zip/Inflater;

.field private final inflaterSource:Lokio/InflaterSource;

.field private section:B

.field private final source:Lokio/RealBufferedSource;


# direct methods
.method public constructor <init>(Lokio/Source;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lokio/RealBufferedSource;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lokio/RealBufferedSource;-><init>(Lokio/Source;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 13
    .line 14
    new-instance p1, Ljava/util/zip/Inflater;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lokio/GzipSource;->inflater:Ljava/util/zip/Inflater;

    .line 21
    .line 22
    new-instance v1, Lokio/InflaterSource;

    .line 23
    .line 24
    invoke-direct {v1, v0, p1}, Lokio/InflaterSource;-><init>(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lokio/GzipSource;->inflaterSource:Lokio/InflaterSource;

    .line 28
    .line 29
    new-instance p1, Ljava/util/zip/CRC32;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 35
    .line 36
    return-void
.end method

.method private final checkEqual(Ljava/lang/String;II)V
    .locals 1

    .line 1
    if-ne p3, p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 5
    .line 6
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    filled-new-array {p1, p3, p2}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 p2, 0x3

    .line 19
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string p2, "%s: actual 0x%08x != expected 0x%08x"

    .line 24
    .line 25
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method private final consumeHeader()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 4
    .line 5
    const-wide/16 v2, 0xa

    .line 6
    .line 7
    invoke-virtual {v1, v2, v3}, Lokio/RealBufferedSource;->require(J)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 11
    .line 12
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 13
    .line 14
    const-wide/16 v2, 0x3

    .line 15
    .line 16
    invoke-virtual {v1, v2, v3}, Lokio/Buffer;->getByte(J)B

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    shr-int/lit8 v1, v6, 0x1

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    and-int/2addr v1, v7

    .line 24
    const/4 v8, 0x0

    .line 25
    if-ne v1, v7, :cond_0

    .line 26
    .line 27
    move v9, v7

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v9, v8

    .line 30
    :goto_0
    if-eqz v9, :cond_1

    .line 31
    .line 32
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 33
    .line 34
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 35
    .line 36
    const-wide/16 v2, 0x0

    .line 37
    .line 38
    const-wide/16 v4, 0xa

    .line 39
    .line 40
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 44
    .line 45
    invoke-virtual {v1}, Lokio/RealBufferedSource;->readShort()S

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const-string v2, "ID1ID2"

    .line 50
    .line 51
    const/16 v3, 0x1f8b

    .line 52
    .line 53
    invoke-direct {v0, v2, v3, v1}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 57
    .line 58
    const-wide/16 v2, 0x8

    .line 59
    .line 60
    invoke-virtual {v1, v2, v3}, Lokio/RealBufferedSource;->skip(J)V

    .line 61
    .line 62
    .line 63
    shr-int/lit8 v1, v6, 0x2

    .line 64
    .line 65
    and-int/2addr v1, v7

    .line 66
    if-ne v1, v7, :cond_4

    .line 67
    .line 68
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 69
    .line 70
    const-wide/16 v2, 0x2

    .line 71
    .line 72
    invoke-virtual {v1, v2, v3}, Lokio/RealBufferedSource;->require(J)V

    .line 73
    .line 74
    .line 75
    if-eqz v9, :cond_2

    .line 76
    .line 77
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 78
    .line 79
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 80
    .line 81
    const-wide/16 v2, 0x0

    .line 82
    .line 83
    const-wide/16 v4, 0x2

    .line 84
    .line 85
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 86
    .line 87
    .line 88
    :cond_2
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 89
    .line 90
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 91
    .line 92
    invoke-virtual {v1}, Lokio/Buffer;->readShortLe()S

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    const v2, 0xffff

    .line 97
    .line 98
    .line 99
    and-int/2addr v1, v2

    .line 100
    int-to-long v4, v1

    .line 101
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 102
    .line 103
    invoke-virtual {v1, v4, v5}, Lokio/RealBufferedSource;->require(J)V

    .line 104
    .line 105
    .line 106
    if-eqz v9, :cond_3

    .line 107
    .line 108
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 109
    .line 110
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 111
    .line 112
    const-wide/16 v2, 0x0

    .line 113
    .line 114
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 115
    .line 116
    .line 117
    :cond_3
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 118
    .line 119
    invoke-virtual {v1, v4, v5}, Lokio/RealBufferedSource;->skip(J)V

    .line 120
    .line 121
    .line 122
    :cond_4
    shr-int/lit8 v1, v6, 0x3

    .line 123
    .line 124
    and-int/2addr v1, v7

    .line 125
    const-wide/16 v10, -0x1

    .line 126
    .line 127
    const-wide/16 v12, 0x1

    .line 128
    .line 129
    if-ne v1, v7, :cond_7

    .line 130
    .line 131
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 132
    .line 133
    invoke-virtual {v1, v8}, Lokio/RealBufferedSource;->indexOf(B)J

    .line 134
    .line 135
    .line 136
    move-result-wide v14

    .line 137
    cmp-long v1, v14, v10

    .line 138
    .line 139
    if-eqz v1, :cond_6

    .line 140
    .line 141
    if-eqz v9, :cond_5

    .line 142
    .line 143
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 144
    .line 145
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 146
    .line 147
    const-wide/16 v2, 0x0

    .line 148
    .line 149
    add-long v4, v14, v12

    .line 150
    .line 151
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 152
    .line 153
    .line 154
    :cond_5
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 155
    .line 156
    add-long/2addr v14, v12

    .line 157
    invoke-virtual {v1, v14, v15}, Lokio/RealBufferedSource;->skip(J)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_6
    invoke-static {}, Lj8/o;->a()V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_7
    :goto_1
    shr-int/lit8 v1, v6, 0x4

    .line 166
    .line 167
    and-int/2addr v1, v7

    .line 168
    if-ne v1, v7, :cond_a

    .line 169
    .line 170
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 171
    .line 172
    invoke-virtual {v1, v8}, Lokio/RealBufferedSource;->indexOf(B)J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    cmp-long v1, v6, v10

    .line 177
    .line 178
    if-eqz v1, :cond_9

    .line 179
    .line 180
    if-eqz v9, :cond_8

    .line 181
    .line 182
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 183
    .line 184
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 185
    .line 186
    const-wide/16 v2, 0x0

    .line 187
    .line 188
    add-long v4, v6, v12

    .line 189
    .line 190
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 191
    .line 192
    .line 193
    :cond_8
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 194
    .line 195
    add-long/2addr v6, v12

    .line 196
    invoke-virtual {v1, v6, v7}, Lokio/RealBufferedSource;->skip(J)V

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_9
    invoke-static {}, Lj8/o;->a()V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_a
    :goto_2
    if-eqz v9, :cond_b

    .line 205
    .line 206
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 207
    .line 208
    invoke-virtual {v1}, Lokio/RealBufferedSource;->readShortLe()S

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    iget-object v2, v0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    .line 215
    .line 216
    .line 217
    move-result-wide v2

    .line 218
    long-to-int v2, v2

    .line 219
    int-to-short v2, v2

    .line 220
    const-string v3, "FHCRC"

    .line 221
    .line 222
    invoke-direct {v0, v3, v1, v2}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 223
    .line 224
    .line 225
    iget-object v1, v0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->reset()V

    .line 228
    .line 229
    .line 230
    :cond_b
    return-void
.end method

.method private final consumeTrailer()V
    .locals 3

    .line 1
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokio/RealBufferedSource;->readIntLe()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    long-to-int v1, v1

    .line 14
    const-string v2, "CRC"

    .line 15
    .line 16
    invoke-direct {p0, v2, v0, v1}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 20
    .line 21
    invoke-virtual {v0}, Lokio/RealBufferedSource;->readIntLe()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v1, p0, Lokio/GzipSource;->inflater:Ljava/util/zip/Inflater;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    long-to-int v1, v1

    .line 32
    const-string v2, "ISIZE"

    .line 33
    .line 34
    invoke-direct {p0, v2, v0, v1}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private final updateCrc(Lokio/Buffer;JJ)V
    .locals 4

    .line 1
    iget-object p1, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :goto_0
    iget v0, p1, Lokio/Segment;->limit:I

    .line 7
    .line 8
    iget v1, p1, Lokio/Segment;->pos:I

    .line 9
    .line 10
    sub-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    cmp-long v2, p2, v2

    .line 14
    .line 15
    if-ltz v2, :cond_0

    .line 16
    .line 17
    sub-int/2addr v0, v1

    .line 18
    int-to-long v0, v0

    .line 19
    sub-long/2addr p2, v0

    .line 20
    iget-object p1, p1, Lokio/Segment;->next:Lokio/Segment;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    cmp-long v2, p4, v0

    .line 29
    .line 30
    if-lez v2, :cond_1

    .line 31
    .line 32
    iget v2, p1, Lokio/Segment;->pos:I

    .line 33
    .line 34
    int-to-long v2, v2

    .line 35
    add-long/2addr v2, p2

    .line 36
    long-to-int p2, v2

    .line 37
    iget p3, p1, Lokio/Segment;->limit:I

    .line 38
    .line 39
    sub-int/2addr p3, p2

    .line 40
    int-to-long v2, p3

    .line 41
    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    long-to-int p3, v2

    .line 46
    iget-object v2, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 47
    .line 48
    iget-object v3, p1, Lokio/Segment;->data:[B

    .line 49
    .line 50
    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 51
    .line 52
    .line 53
    int-to-long p2, p3

    .line 54
    sub-long/2addr p4, p2

    .line 55
    iget-object p1, p1, Lokio/Segment;->next:Lokio/Segment;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-wide p2, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/GzipSource;->inflaterSource:Lokio/InflaterSource;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokio/InflaterSource;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p2, v0

    .line 7
    .line 8
    if-ltz v2, :cond_6

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_0
    iget-byte v0, p0, Lokio/GzipSource;->section:B

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, Lokio/GzipSource;->consumeHeader()V

    .line 19
    .line 20
    .line 21
    iput-byte v1, p0, Lokio/GzipSource;->section:B

    .line 22
    .line 23
    :cond_1
    iget-byte v0, p0, Lokio/GzipSource;->section:B

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    const-wide/16 v3, -0x1

    .line 27
    .line 28
    if-ne v0, v1, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 31
    .line 32
    .line 33
    move-result-wide v7

    .line 34
    iget-object v0, p0, Lokio/GzipSource;->inflaterSource:Lokio/InflaterSource;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2, p3}, Lokio/InflaterSource;->read(Lokio/Buffer;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    cmp-long p2, v9, v3

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    move-object v5, p0

    .line 45
    move-object v6, p1

    .line 46
    invoke-direct/range {v5 .. v10}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 47
    .line 48
    .line 49
    return-wide v9

    .line 50
    :cond_2
    move-object v5, p0

    .line 51
    iput-byte v2, v5, Lokio/GzipSource;->section:B

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    move-object v5, p0

    .line 55
    :goto_0
    iget-byte p1, v5, Lokio/GzipSource;->section:B

    .line 56
    .line 57
    if-ne p1, v2, :cond_5

    .line 58
    .line 59
    invoke-direct {p0}, Lokio/GzipSource;->consumeTrailer()V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x3

    .line 63
    iput-byte p1, v5, Lokio/GzipSource;->section:B

    .line 64
    .line 65
    iget-object p1, v5, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 66
    .line 67
    invoke-virtual {p1}, Lokio/RealBufferedSource;->exhausted()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    const-string p1, "gzip finished without exhausting source"

    .line 75
    .line 76
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    const-wide/16 p1, 0x0

    .line 80
    .line 81
    return-wide p1

    .line 82
    :cond_5
    :goto_2
    return-wide v3

    .line 83
    :cond_6
    move-object v5, p0

    .line 84
    const-string p1, "byteCount < 0: "

    .line 85
    .line 86
    invoke-static {p2, p3, p1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokio/RealBufferedSource;->timeout()Lokio/Timeout;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
