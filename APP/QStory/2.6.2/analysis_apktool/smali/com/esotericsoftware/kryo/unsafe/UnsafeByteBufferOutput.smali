.class public Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;
.super Lcom/esotericsoftware/kryo/io/ByteBufferOutput;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private bufferAddress:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;-><init>(I)V

    .line 13
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->updateBufferAddress()V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;-><init>(II)V

    .line 15
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->updateBufferAddress()V

    return-void
.end method

.method public constructor <init>(JI)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->newDirectBuffer(JI)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;-><init>(Ljava/nio/ByteBuffer;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->updateBufferAddress()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;-><init>(Ljava/io/OutputStream;)V

    .line 17
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->updateBufferAddress()V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;-><init>(Ljava/io/OutputStream;I)V

    .line 19
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->updateBufferAddress()V

    return-void
.end method

.method private setBufferPosition(Ljava/nio/Buffer;I)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private updateBufferAddress()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    check-cast v0, Lsun/nio/ch/DirectBuffer;

    .line 4
    .line 5
    invoke-interface {v0}, Lsun/nio/ch/DirectBuffer;->address()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iput-wide v0, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->dispose(Ljava/nio/ByteBuffer;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 12
    .line 13
    return-void
.end method

.method public require(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    if-eq v1, v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->dispose(Ljava/nio/ByteBuffer;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->updateBufferAddress()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return p1
.end method

.method public setBuffer(Ljava/nio/ByteBuffer;I)V
    .locals 0

    .line 1
    const-string p0, "buffer must be direct."

    .line 2
    .line 3
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public write(I)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-wide v1, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 16
    .line 17
    add-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    add-long/2addr v1, v3

    .line 23
    int-to-byte p1, p1

    .line 24
    invoke-virtual {v0, v1, v2, p1}, Lsun/misc/Unsafe;->putByte(JB)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 30
    .line 31
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public writeBoolean(Z)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-wide v1, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 16
    .line 17
    add-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    add-long/2addr v1, v3

    .line 23
    invoke-virtual {v0, v1, v2, p1}, Lsun/misc/Unsafe;->putByte(JB)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 29
    .line 30
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public writeBooleans([ZII)V
    .locals 1

    .line 1
    sget-wide p2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->booleanArrayBaseOffset:J

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public writeByte(B)V
    .locals 5

    .line 35
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 36
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    iget-wide v1, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2, p1}, Lsun/misc/Unsafe;->putByte(JB)V

    .line 37
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    return-void
.end method

.method public writeByte(I)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-wide v1, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 16
    .line 17
    add-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    add-long/2addr v1, v3

    .line 23
    int-to-byte p1, p1

    .line 24
    invoke-virtual {v0, v1, v2, p1}, Lsun/misc/Unsafe;->putByte(JB)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 30
    .line 31
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public writeBytes(Ljava/lang/Object;JI)V
    .locals 10

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    invoke-static {v0, p4}, Ljava/lang/Math;->min(II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    move-wide v3, p2

    .line 11
    :goto_0
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-wide p2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 14
    .line 15
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 16
    .line 17
    int-to-long v5, v2

    .line 18
    add-long v6, p2, v5

    .line 19
    .line 20
    int-to-long v8, v0

    .line 21
    const/4 v5, 0x0

    .line 22
    move-object v2, p1

    .line 23
    invoke-virtual/range {v1 .. v9}, Lsun/misc/Unsafe;->copyMemory(Ljava/lang/Object;JLjava/lang/Object;JJ)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 27
    .line 28
    add-int/2addr p1, v0

    .line 29
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 30
    .line 31
    sub-int/2addr p4, v0

    .line 32
    if-nez p4, :cond_0

    .line 33
    .line 34
    iget-object p2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    invoke-direct {p0, p2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    add-long/2addr v3, v8

    .line 41
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 42
    .line 43
    invoke-static {p1, p4}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 48
    .line 49
    .line 50
    move-object p1, v2

    .line 51
    goto :goto_0
.end method

.method public writeBytes([BII)V
    .locals 4

    .line 52
    sget-wide v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->writeBytes(Ljava/lang/Object;JI)V

    return-void
.end method

.method public writeChar(C)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 8
    .line 9
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    add-long/2addr v2, v4

    .line 13
    invoke-virtual {v1, v2, v3, p1}, Lsun/misc/Unsafe;->putChar(JC)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 17
    .line 18
    add-int/2addr p1, v0

    .line 19
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 20
    .line 21
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public writeChars([CII)V
    .locals 1

    .line 1
    sget-wide p2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->charArrayBaseOffset:J

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    shl-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeDouble(D)V
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 9
    .line 10
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 11
    .line 12
    int-to-long v4, v4

    .line 13
    add-long/2addr v2, v4

    .line 14
    invoke-virtual {v1, v2, v3, p1, p2}, Lsun/misc/Unsafe;->putDouble(JD)V

    .line 15
    .line 16
    .line 17
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/2addr p1, v0

    .line 20
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 21
    .line 22
    iget-object p2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-direct {p0, p2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public writeDoubles([DII)V
    .locals 1

    .line 1
    sget-wide p2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->doubleArrayBaseOffset:J

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    shl-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeFloat(F)V
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 8
    .line 9
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    add-long/2addr v2, v4

    .line 13
    invoke-virtual {v1, v2, v3, p1}, Lsun/misc/Unsafe;->putFloat(JF)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 17
    .line 18
    add-int/2addr p1, v0

    .line 19
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 20
    .line 21
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public writeFloats([FII)V
    .locals 1

    .line 1
    sget-wide p2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->floatArrayBaseOffset:J

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    shl-int/lit8 v0, v0, 0x2

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeInt(I)V
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 8
    .line 9
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    add-long/2addr v2, v4

    .line 13
    invoke-virtual {v1, v2, v3, p1}, Lsun/misc/Unsafe;->putInt(JI)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 17
    .line 18
    add-int/2addr p1, v0

    .line 19
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 20
    .line 21
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public writeInts([III)V
    .locals 1

    .line 1
    sget-wide p2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->intArrayBaseOffset:J

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    shl-int/lit8 v0, v0, 0x2

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeLong(J)V
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 9
    .line 10
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 11
    .line 12
    int-to-long v4, v4

    .line 13
    add-long/2addr v2, v4

    .line 14
    invoke-virtual {v1, v2, v3, p1, p2}, Lsun/misc/Unsafe;->putLong(JJ)V

    .line 15
    .line 16
    .line 17
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/2addr p1, v0

    .line 20
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 21
    .line 22
    iget-object p2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-direct {p0, p2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public writeLongs([JII)V
    .locals 1

    .line 1
    sget-wide p2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->longArrayBaseOffset:J

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    shl-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeShort(I)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->require(I)Z

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->bufferAddress:J

    .line 8
    .line 9
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    add-long/2addr v2, v4

    .line 13
    int-to-short p1, p1

    .line 14
    invoke-virtual {v1, v2, v3, p1}, Lsun/misc/Unsafe;->putShort(JS)V

    .line 15
    .line 16
    .line 17
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/2addr p1, v0

    .line 20
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public writeShorts([SII)V
    .locals 1

    .line 1
    sget-wide p2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->shortArrayBaseOffset:J

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    shl-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
