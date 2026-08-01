.class public Lcom/google/flatbuffers/ByteBufferReadWriteBuf;
.super Ljava/lang/Object;
.source "ByteBufferReadWriteBuf.java"

# interfaces
.implements Lcom/google/flatbuffers/ReadWriteBuf;


# instance fields
.field private final buffer:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2
    .param p1, "bb"    # Ljava/nio/ByteBuffer;

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    .line 12
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 13
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 18
    return-void
.end method

.method public data()[B
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public get(I)B
    .locals 1
    .param p1, "index"    # I

    .line 27
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    return v0
.end method

.method public getBoolean(I)Z
    .locals 1
    .param p1, "index"    # I

    .line 22
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->get(I)B

    move-result v0

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

    .line 52
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getDouble(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public getFloat(I)F
    .locals 1
    .param p1, "index"    # I

    .line 47
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getFloat(I)F

    move-result v0

    return v0
.end method

.method public getInt(I)I
    .locals 1
    .param p1, "index"    # I

    .line 37
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    return v0
.end method

.method public getLong(I)J
    .locals 2
    .param p1, "index"    # I

    .line 42
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public getShort(I)S
    .locals 1
    .param p1, "index"    # I

    .line 32
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    return v0
.end method

.method public getString(II)Ljava/lang/String;
    .locals 1
    .param p1, "start"    # I
    .param p2, "size"    # I

    .line 57
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-static {v0, p1, p2}, Lcom/google/flatbuffers/Utf8Safe;->decodeUtf8Buffer(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public limit()I
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    return v0
.end method

.method public put(B)V
    .locals 1
    .param p1, "value"    # B

    .line 77
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 78
    return-void
.end method

.method public put([BII)V
    .locals 1
    .param p1, "value"    # [B
    .param p2, "start"    # I
    .param p3, "length"    # I

    .line 72
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 73
    return-void
.end method

.method public putBoolean(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 67
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 68
    return-void
.end method

.method public putDouble(D)V
    .locals 1
    .param p1, "value"    # D

    .line 102
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 103
    return-void
.end method

.method public putFloat(F)V
    .locals 1
    .param p1, "value"    # F

    .line 97
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 98
    return-void
.end method

.method public putInt(I)V
    .locals 1
    .param p1, "value"    # I

    .line 87
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 88
    return-void
.end method

.method public putLong(J)V
    .locals 1
    .param p1, "value"    # J

    .line 92
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 93
    return-void
.end method

.method public putShort(S)V
    .locals 1
    .param p1, "value"    # S

    .line 82
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 83
    return-void
.end method

.method public requestCapacity(I)Z
    .locals 1
    .param p1, "capacity"    # I

    .line 167
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public set(IB)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "value"    # B

    .line 112
    add-int/lit8 v0, p1, 0x1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->requestCapacity(I)Z

    .line 113
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 114
    return-void
.end method

.method public set(I[BII)V
    .locals 2
    .param p1, "index"    # I
    .param p2, "value"    # [B
    .param p3, "start"    # I
    .param p4, "length"    # I

    .line 118
    sub-int v0, p4, p3

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->requestCapacity(I)Z

    .line 119
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    .line 120
    .local v0, "curPos":I
    iget-object v1, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 121
    iget-object v1, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p2, p3, p4}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 122
    iget-object v1, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 123
    return-void
.end method

.method public setBoolean(IZ)V
    .locals 0
    .param p1, "index"    # I
    .param p2, "value"    # Z

    .line 107
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->set(IB)V

    .line 108
    return-void
.end method

.method public setDouble(ID)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "value"    # D

    .line 151
    add-int/lit8 v0, p1, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->requestCapacity(I)Z

    .line 152
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->putDouble(ID)Ljava/nio/ByteBuffer;

    .line 153
    return-void
.end method

.method public setFloat(IF)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "value"    # F

    .line 145
    add-int/lit8 v0, p1, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->requestCapacity(I)Z

    .line 146
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->putFloat(IF)Ljava/nio/ByteBuffer;

    .line 147
    return-void
.end method

.method public setInt(II)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "value"    # I

    .line 133
    add-int/lit8 v0, p1, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->requestCapacity(I)Z

    .line 134
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 135
    return-void
.end method

.method public setLong(IJ)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "value"    # J

    .line 139
    add-int/lit8 v0, p1, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->requestCapacity(I)Z

    .line 140
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 141
    return-void
.end method

.method public setShort(IS)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "value"    # S

    .line 127
    add-int/lit8 v0, p1, 0x2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->requestCapacity(I)Z

    .line 128
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 129
    return-void
.end method

.method public writePosition()I
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/google/flatbuffers/ByteBufferReadWriteBuf;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    return v0
.end method
