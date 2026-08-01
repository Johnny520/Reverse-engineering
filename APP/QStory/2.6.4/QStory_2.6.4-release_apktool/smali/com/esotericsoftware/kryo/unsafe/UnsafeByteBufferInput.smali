.class public Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;
.super Lcom/esotericsoftware/kryo/io/ByteBufferInput;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private bufferAddress:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>(I)V

    .line 13
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->updateBufferAddress()V

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
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>(Ljava/nio/ByteBuffer;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->updateBufferAddress()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>(Ljava/io/InputStream;)V

    .line 22
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->updateBufferAddress()V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>(Ljava/io/InputStream;I)V

    .line 24
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->updateBufferAddress()V

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>(Ljava/nio/ByteBuffer;)V

    .line 19
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->updateBufferAddress()V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>([B)V

    .line 15
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->updateBufferAddress()V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>([BII)V

    .line 17
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->updateBufferAddress()V

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
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

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
    iput-wide v0, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public read()I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    const/4 p0, -0x1

    .line 9
    return p0

    .line 10
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 11
    .line 12
    iget-wide v1, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 13
    .line 14
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    add-int/lit8 v4, v3, 0x1

    .line 17
    .line 18
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 19
    .line 20
    int-to-long v3, v3

    .line 21
    add-long/2addr v1, v3

    .line 22
    invoke-virtual {v0, v1, v2}, Lsun/misc/Unsafe;->getByte(J)B

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    and-int/lit16 v0, v0, 0xff

    .line 27
    .line 28
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 31
    .line 32
    invoke-direct {p0, v1, v2}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 33
    .line 34
    .line 35
    return v0
.end method

.method public readBoolean()Z
    .locals 7

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-wide v3, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 14
    .line 15
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 16
    .line 17
    add-int/lit8 v5, v1, 0x1

    .line 18
    .line 19
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    int-to-long v5, v1

    .line 22
    add-long/2addr v3, v5

    .line 23
    invoke-virtual {v0, v3, v4}, Lsun/misc/Unsafe;->getByte(J)B

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    :goto_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 34
    .line 35
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 36
    .line 37
    .line 38
    return v2
.end method

.method public readBooleans(I)[Z
    .locals 3

    .line 1
    new-array v0, p1, [Z

    .line 2
    .line 3
    sget-wide v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->booleanArrayBaseOffset:J

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->readBytes(Ljava/lang/Object;JI)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public readByte()B
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-wide v1, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 16
    .line 17
    add-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    add-long/2addr v1, v3

    .line 23
    invoke-virtual {v0, v1, v2}, Lsun/misc/Unsafe;->getByte(J)B

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 30
    .line 31
    invoke-direct {p0, v1, v2}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 32
    .line 33
    .line 34
    return v0
.end method

.method public readByteUnsigned()I
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-wide v1, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 16
    .line 17
    add-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    add-long/2addr v1, v3

    .line 23
    invoke-virtual {v0, v1, v2}, Lsun/misc/Unsafe;->getByte(J)B

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    and-int/lit16 v0, v0, 0xff

    .line 28
    .line 29
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 32
    .line 33
    invoke-direct {p0, v1, v2}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 34
    .line 35
    .line 36
    return v0
.end method

.method public readBytes(Ljava/lang/Object;JI)V
    .locals 10

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

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
    move-wide v6, p2

    .line 11
    :goto_0
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-wide p2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 14
    .line 15
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 16
    .line 17
    int-to-long v2, v2

    .line 18
    add-long v3, p2, v2

    .line 19
    .line 20
    int-to-long v8, v0

    .line 21
    const/4 v2, 0x0

    .line 22
    move-object v5, p1

    .line 23
    invoke-virtual/range {v1 .. v9}, Lsun/misc/Unsafe;->copyMemory(Ljava/lang/Object;JLjava/lang/Object;JJ)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 27
    .line 28
    add-int/2addr p1, v0

    .line 29
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 30
    .line 31
    sub-int/2addr p4, v0

    .line 32
    if-nez p4, :cond_0

    .line 33
    .line 34
    iget-object p2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    invoke-direct {p0, p2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    add-long/2addr v6, v8

    .line 41
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 42
    .line 43
    invoke-static {p4, p1}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 48
    .line 49
    .line 50
    move-object p1, v5

    .line 51
    goto :goto_0
.end method

.method public readBytes([BII)V
    .locals 4

    .line 52
    sget-wide v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->readBytes(Ljava/lang/Object;JI)V

    return-void
.end method

.method public readChar()C
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 8
    .line 9
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    add-long/2addr v2, v4

    .line 13
    invoke-virtual {v1, v2, v3}, Lsun/misc/Unsafe;->getChar(J)C

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/2addr v2, v0

    .line 20
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-direct {p0, v0, v2}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 25
    .line 26
    .line 27
    return v1
.end method

.method public readChars(I)[C
    .locals 3

    .line 1
    new-array v0, p1, [C

    .line 2
    .line 3
    sget-wide v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->charArrayBaseOffset:J

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readDouble()D
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 9
    .line 10
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 11
    .line 12
    int-to-long v4, v4

    .line 13
    add-long/2addr v2, v4

    .line 14
    invoke-virtual {v1, v2, v3}, Lsun/misc/Unsafe;->getDouble(J)D

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 19
    .line 20
    add-int/2addr v3, v0

    .line 21
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 22
    .line 23
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-direct {p0, v0, v3}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 26
    .line 27
    .line 28
    return-wide v1
.end method

.method public readDoubles(I)[D
    .locals 3

    .line 1
    new-array v0, p1, [D

    .line 2
    .line 3
    sget-wide v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->doubleArrayBaseOffset:J

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x3

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readFloat()F
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 8
    .line 9
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    add-long/2addr v2, v4

    .line 13
    invoke-virtual {v1, v2, v3}, Lsun/misc/Unsafe;->getFloat(J)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/2addr v2, v0

    .line 20
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-direct {p0, v0, v2}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 25
    .line 26
    .line 27
    return v1
.end method

.method public readFloats(I)[F
    .locals 3

    .line 1
    new-array v0, p1, [F

    .line 2
    .line 3
    sget-wide v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->floatArrayBaseOffset:J

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readInt()I
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 8
    .line 9
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    add-long/2addr v2, v4

    .line 13
    invoke-virtual {v1, v2, v3}, Lsun/misc/Unsafe;->getInt(J)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/2addr v2, v0

    .line 20
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-direct {p0, v0, v2}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 25
    .line 26
    .line 27
    return v1
.end method

.method public readInts(I)[I
    .locals 3

    .line 1
    new-array v0, p1, [I

    .line 2
    .line 3
    sget-wide v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->intArrayBaseOffset:J

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readLong()J
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 9
    .line 10
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 11
    .line 12
    int-to-long v4, v4

    .line 13
    add-long/2addr v2, v4

    .line 14
    invoke-virtual {v1, v2, v3}, Lsun/misc/Unsafe;->getLong(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 19
    .line 20
    add-int/2addr v3, v0

    .line 21
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 22
    .line 23
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-direct {p0, v0, v3}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 26
    .line 27
    .line 28
    return-wide v1
.end method

.method public readLongs(I)[J
    .locals 3

    .line 1
    new-array v0, p1, [J

    .line 2
    .line 3
    sget-wide v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->longArrayBaseOffset:J

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x3

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readShort()S
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->bufferAddress:J

    .line 8
    .line 9
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    add-long/2addr v2, v4

    .line 13
    invoke-virtual {v1, v2, v3}, Lsun/misc/Unsafe;->getShort(J)S

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/2addr v2, v0

    .line 20
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-direct {p0, v0, v2}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 25
    .line 26
    .line 27
    return v1
.end method

.method public readShorts(I)[S
    .locals 3

    .line 1
    new-array v0, p1, [S

    .line 2
    .line 3
    sget-wide v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->shortArrayBaseOffset:J

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeByteBufferInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public setBuffer(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    const-string p0, "buffer must be direct."

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
