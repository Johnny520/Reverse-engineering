.class public Lcom/google/flatbuffers/ArrayReadWriteBuf;
.super Ljava/lang/Object;
.source "ArrayReadWriteBuf.java"

# interfaces
.implements Lcom/google/flatbuffers/ReadWriteBuf;


# instance fields
.field private buffer:[B

.field private writePos:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/google/flatbuffers/ArrayReadWriteBuf;-><init>(I)V

    .line 21
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .param p1, "initialCapacity"    # I

    .line 24
    new-array v0, p1, [B

    invoke-direct {p0, v0}, Lcom/google/flatbuffers/ArrayReadWriteBuf;-><init>([B)V

    .line 25
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1
    .param p1, "buffer"    # [B

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 30
    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0
    .param p1, "buffer"    # [B
    .param p2, "startPos"    # I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    .line 34
    iput p2, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 35
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 40
    return-void
.end method

.method public data()[B
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    return-object v0
.end method

.method public get(I)B
    .locals 1
    .param p1, "index"    # I

    .line 49
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    aget-byte v0, v0, p1

    return v0
.end method

.method public getBoolean(I)Z
    .locals 1
    .param p1, "index"    # I

    .line 44
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    aget-byte v0, v0, p1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getDouble(I)D
    .locals 2
    .param p1, "index"    # I

    .line 84
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public getFloat(I)F
    .locals 1
    .param p1, "index"    # I

    .line 79
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public getInt(I)I
    .locals 3
    .param p1, "index"    # I

    .line 59
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, p1, 0x3

    aget-byte v0, v0, v1

    shl-int/lit8 v0, v0, 0x18

    iget-object v1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, p1, 0x2

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, p1, 0x1

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    aget-byte v1, v1, p1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method public getLong(I)J
    .locals 8
    .param p1, "index"    # I

    .line 67
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, p1, 0x1

    .end local p1    # "index":I
    .local v1, "index":I
    aget-byte p1, v0, p1

    int-to-long v2, p1

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v0, v1, 0x1

    .end local v1    # "index":I
    .local v0, "index":I
    aget-byte p1, p1, v1

    int-to-long v6, p1

    and-long/2addr v6, v4

    const/16 p1, 0x8

    shl-long/2addr v6, p1

    or-long v1, v2, v6

    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v3, v0, 0x1

    .end local v0    # "index":I
    .local v3, "index":I
    aget-byte p1, p1, v0

    int-to-long v6, p1

    and-long/2addr v6, v4

    const/16 p1, 0x10

    shl-long/2addr v6, p1

    or-long v0, v1, v6

    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, v3, 0x1

    .end local v3    # "index":I
    .local v2, "index":I
    aget-byte p1, p1, v3

    int-to-long v6, p1

    and-long/2addr v6, v4

    const/16 p1, 0x18

    shl-long/2addr v6, p1

    or-long/2addr v0, v6

    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v3, v2, 0x1

    .end local v2    # "index":I
    .restart local v3    # "index":I
    aget-byte p1, p1, v2

    int-to-long v6, p1

    and-long/2addr v6, v4

    const/16 p1, 0x20

    shl-long/2addr v6, p1

    or-long/2addr v0, v6

    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, v3, 0x1

    .end local v3    # "index":I
    .restart local v2    # "index":I
    aget-byte p1, p1, v3

    int-to-long v6, p1

    and-long/2addr v6, v4

    const/16 p1, 0x28

    shl-long/2addr v6, p1

    or-long/2addr v0, v6

    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v3, v2, 0x1

    .end local v2    # "index":I
    .restart local v3    # "index":I
    aget-byte p1, p1, v2

    int-to-long v6, p1

    and-long/2addr v4, v6

    const/16 p1, 0x30

    shl-long/2addr v4, p1

    or-long/2addr v0, v4

    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    aget-byte p1, p1, v3

    int-to-long v4, p1

    const/16 p1, 0x38

    shl-long/2addr v4, p1

    or-long/2addr v0, v4

    return-wide v0
.end method

.method public getShort(I)S
    .locals 2
    .param p1, "index"    # I

    .line 54
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, p1, 0x1

    aget-byte v0, v0, v1

    shl-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    aget-byte v1, v1, p1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method public getString(II)Ljava/lang/String;
    .locals 1
    .param p1, "start"    # I
    .param p2, "size"    # I

    .line 89
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    invoke-static {v0, p1, p2}, Lcom/google/flatbuffers/Utf8Safe;->decodeUtf8Array([BII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public limit()I
    .locals 1

    .line 227
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    return v0
.end method

.method public put(B)V
    .locals 1
    .param p1, "value"    # B

    .line 112
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->set(IB)V

    .line 113
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 114
    return-void
.end method

.method public put([BII)V
    .locals 1
    .param p1, "value"    # [B
    .param p2, "start"    # I
    .param p3, "length"    # I

    .line 106
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->set(I[BII)V

    .line 107
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 108
    return-void
.end method

.method public putBoolean(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 100
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->setBoolean(IZ)V

    .line 101
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 102
    return-void
.end method

.method public putDouble(D)V
    .locals 1
    .param p1, "value"    # D

    .line 142
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->setDouble(ID)V

    .line 143
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    add-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 144
    return-void
.end method

.method public putFloat(F)V
    .locals 1
    .param p1, "value"    # F

    .line 136
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->setFloat(IF)V

    .line 137
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 138
    return-void
.end method

.method public putInt(I)V
    .locals 1
    .param p1, "value"    # I

    .line 124
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->setInt(II)V

    .line 125
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 126
    return-void
.end method

.method public putLong(J)V
    .locals 1
    .param p1, "value"    # J

    .line 130
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->setLong(IJ)V

    .line 131
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    add-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 132
    return-void
.end method

.method public putShort(S)V
    .locals 1
    .param p1, "value"    # S

    .line 118
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->setShort(IS)V

    .line 119
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    .line 120
    return-void
.end method

.method public requestCapacity(I)Z
    .locals 4
    .param p1, "capacity"    # I

    .line 237
    if-ltz p1, :cond_2

    .line 240
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    array-length v0, v0

    const/4 v1, 0x1

    if-lt v0, p1, :cond_0

    .line 241
    return v1

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    array-length v0, v0

    .line 245
    .local v0, "oldCapacity":I
    shr-int/lit8 v2, v0, 0x1

    add-int/2addr v2, v0

    .line 246
    .local v2, "newCapacity":I
    if-ge v2, p1, :cond_1

    .line 247
    move v2, p1

    .line 249
    :cond_1
    iget-object v3, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    iput-object v3, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    .line 250
    return v1

    .line 238
    .end local v0    # "oldCapacity":I
    .end local v2    # "newCapacity":I
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Capacity may not be negative (likely a previous int overflow)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public set(IB)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "value"    # B

    .line 153
    add-int/lit8 v0, p1, 0x1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->requestCapacity(I)Z

    .line 154
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    aput-byte p2, v0, p1

    .line 155
    return-void
.end method

.method public set(I[BII)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "toCopy"    # [B
    .param p3, "start"    # I
    .param p4, "length"    # I

    .line 159
    sub-int v0, p4, p3

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->requestCapacity(I)Z

    .line 160
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    invoke-static {p2, p3, v0, p1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 161
    return-void
.end method

.method public setBoolean(IZ)V
    .locals 0
    .param p1, "index"    # I
    .param p2, "value"    # Z

    .line 148
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->set(IB)V

    .line 149
    return-void
.end method

.method public setDouble(ID)V
    .locals 6
    .param p1, "index"    # I
    .param p2, "value"    # D

    .line 210
    add-int/lit8 v0, p1, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->requestCapacity(I)Z

    .line 212
    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    .line 213
    .local v0, "lValue":J
    long-to-int v2, v0

    .line 214
    .local v2, "i":I
    iget-object v3, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v4, p1, 0x1

    .end local p1    # "index":I
    .local v4, "index":I
    and-int/lit16 v5, v2, 0xff

    int-to-byte v5, v5

    aput-byte v5, v3, p1

    .line 215
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v3, v4, 0x1

    .end local v4    # "index":I
    .local v3, "index":I
    shr-int/lit8 v5, v2, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, p1, v4

    .line 216
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v4, v3, 0x1

    .end local v3    # "index":I
    .restart local v4    # "index":I
    shr-int/lit8 v5, v2, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, p1, v3

    .line 217
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v3, v4, 0x1

    .end local v4    # "index":I
    .restart local v3    # "index":I
    shr-int/lit8 v5, v2, 0x18

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, p1, v4

    .line 218
    const/16 p1, 0x20

    shr-long v4, v0, p1

    long-to-int p1, v4

    .line 219
    .end local v2    # "i":I
    .local p1, "i":I
    iget-object v2, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v4, v3, 0x1

    .end local v3    # "index":I
    .restart local v4    # "index":I
    and-int/lit16 v5, p1, 0xff

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    .line 220
    iget-object v2, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v3, v4, 0x1

    .end local v4    # "index":I
    .restart local v3    # "index":I
    shr-int/lit8 v5, p1, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    .line 221
    iget-object v2, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v4, v3, 0x1

    .end local v3    # "index":I
    .restart local v4    # "index":I
    shr-int/lit8 v5, p1, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    .line 222
    iget-object v2, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    shr-int/lit8 v3, p1, 0x18

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v2, v4

    .line 223
    return-void
.end method

.method public setFloat(IF)V
    .locals 4
    .param p1, "index"    # I
    .param p2, "value"    # F

    .line 199
    add-int/lit8 v0, p1, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->requestCapacity(I)Z

    .line 201
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    .line 202
    .local v0, "iValue":I
    iget-object v1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, p1, 0x1

    .end local p1    # "index":I
    .local v2, "index":I
    and-int/lit16 v3, v0, 0xff

    int-to-byte v3, v3

    aput-byte v3, v1, p1

    .line 203
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, v2, 0x1

    .end local v2    # "index":I
    .local v1, "index":I
    shr-int/lit8 v3, v0, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p1, v2

    .line 204
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, v1, 0x1

    .end local v1    # "index":I
    .restart local v2    # "index":I
    shr-int/lit8 v3, v0, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p1, v1

    .line 205
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    shr-int/lit8 v1, v0, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p1, v2

    .line 206
    return-void
.end method

.method public setInt(II)V
    .locals 3
    .param p1, "index"    # I
    .param p2, "value"    # I

    .line 173
    add-int/lit8 v0, p1, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->requestCapacity(I)Z

    .line 175
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, p1, 0x1

    .end local p1    # "index":I
    .local v1, "index":I
    and-int/lit16 v2, p2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, p1

    .line 176
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v0, v1, 0x1

    .end local v1    # "index":I
    .local v0, "index":I
    shr-int/lit8 v2, p2, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, p1, v1

    .line 177
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, v0, 0x1

    .end local v0    # "index":I
    .restart local v1    # "index":I
    shr-int/lit8 v2, p2, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, p1, v0

    .line 178
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    shr-int/lit8 v0, p2, 0x18

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, p1, v1

    .line 179
    return-void
.end method

.method public setLong(IJ)V
    .locals 4
    .param p1, "index"    # I
    .param p2, "value"    # J

    .line 183
    add-int/lit8 v0, p1, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->requestCapacity(I)Z

    .line 185
    long-to-int v0, p2

    .line 186
    .local v0, "i":I
    iget-object v1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, p1, 0x1

    .end local p1    # "index":I
    .local v2, "index":I
    and-int/lit16 v3, v0, 0xff

    int-to-byte v3, v3

    aput-byte v3, v1, p1

    .line 187
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, v2, 0x1

    .end local v2    # "index":I
    .local v1, "index":I
    shr-int/lit8 v3, v0, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p1, v2

    .line 188
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, v1, 0x1

    .end local v1    # "index":I
    .restart local v2    # "index":I
    shr-int/lit8 v3, v0, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p1, v1

    .line 189
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, v2, 0x1

    .end local v2    # "index":I
    .restart local v1    # "index":I
    shr-int/lit8 v3, v0, 0x18

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p1, v2

    .line 190
    const/16 p1, 0x20

    shr-long v2, p2, p1

    long-to-int p1, v2

    .line 191
    .end local v0    # "i":I
    .local p1, "i":I
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, v1, 0x1

    .end local v1    # "index":I
    .restart local v2    # "index":I
    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    .line 192
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, v2, 0x1

    .end local v2    # "index":I
    .restart local v1    # "index":I
    shr-int/lit8 v3, p1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    .line 193
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v2, v1, 0x1

    .end local v1    # "index":I
    .restart local v2    # "index":I
    shr-int/lit8 v3, p1, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    .line 194
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    shr-int/lit8 v1, p1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    .line 195
    return-void
.end method

.method public setShort(IS)V
    .locals 3
    .param p1, "index"    # I
    .param p2, "value"    # S

    .line 165
    add-int/lit8 v0, p1, 0x2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ArrayReadWriteBuf;->requestCapacity(I)Z

    .line 167
    iget-object v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    add-int/lit8 v1, p1, 0x1

    .end local p1    # "index":I
    .local v1, "index":I
    and-int/lit16 v2, p2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, p1

    .line 168
    iget-object p1, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->buffer:[B

    shr-int/lit8 v0, p2, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, p1, v1

    .line 169
    return-void
.end method

.method public writePosition()I
    .locals 1

    .line 232
    iget v0, p0, Lcom/google/flatbuffers/ArrayReadWriteBuf;->writePos:I

    return v0
.end method
