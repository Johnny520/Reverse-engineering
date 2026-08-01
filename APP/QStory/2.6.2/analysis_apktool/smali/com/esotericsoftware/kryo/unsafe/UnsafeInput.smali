.class public Lcom/esotericsoftware/kryo/unsafe/UnsafeInput;
.super Lcom/esotericsoftware/kryo/io/Input;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Input;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;-><init>(Ljava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Input;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;-><init>([B)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Input;-><init>([BII)V

    return-void
.end method


# virtual methods
.method public read()I
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 13
    .line 14
    sget-wide v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 15
    .line 16
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 17
    .line 18
    add-int/lit8 v5, v4, 0x1

    .line 19
    .line 20
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    int-to-long v4, v4

    .line 23
    add-long/2addr v2, v4

    .line 24
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getByte(Ljava/lang/Object;J)B

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    and-int/lit16 p0, p0, 0xff

    .line 29
    .line 30
    return p0
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
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 14
    .line 15
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 16
    .line 17
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/lit8 v6, v5, 0x1

    .line 20
    .line 21
    iput v6, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 22
    .line 23
    int-to-long v5, v5

    .line 24
    add-long/2addr v3, v5

    .line 25
    invoke-virtual {v0, v1, v3, v4}, Lsun/misc/Unsafe;->getByte(Ljava/lang/Object;J)B

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
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
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeInput;->readBytes(Ljava/lang/Object;JI)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public readByte()B
    .locals 6

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
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 14
    .line 15
    sget-wide v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 16
    .line 17
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/lit8 v5, v4, 0x1

    .line 20
    .line 21
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 22
    .line 23
    int-to-long v4, v4

    .line 24
    add-long/2addr v2, v4

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getByte(Ljava/lang/Object;J)B

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public readByteUnsigned()I
    .locals 6

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
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 14
    .line 15
    sget-wide v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 16
    .line 17
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/lit8 v5, v4, 0x1

    .line 20
    .line 21
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 22
    .line 23
    int-to-long v4, v4

    .line 24
    add-long/2addr v2, v4

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getByte(Ljava/lang/Object;J)B

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    and-int/lit16 p0, p0, 0xff

    .line 30
    .line 31
    return p0
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
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 14
    .line 15
    sget-wide p2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 16
    .line 17
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    add-long/2addr v3, p2

    .line 21
    int-to-long v8, v0

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
    return-void

    .line 35
    :cond_0
    add-long/2addr v6, v8

    .line 36
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 37
    .line 38
    invoke-static {p4, p1}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 43
    .line 44
    .line 45
    move-object p1, v5

    .line 46
    goto :goto_0
.end method

.method public readBytes([BII)V
    .locals 4

    .line 47
    sget-wide v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/esotericsoftware/kryo/unsafe/UnsafeInput;->readBytes(Ljava/lang/Object;JI)V

    return-void
.end method

.method public readChar()C
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 8
    .line 9
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 10
    .line 11
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 12
    .line 13
    int-to-long v5, v5

    .line 14
    add-long/2addr v3, v5

    .line 15
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getChar(Ljava/lang/Object;J)C

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    add-int/2addr v2, v0

    .line 22
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 23
    .line 24
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
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readDouble()D
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 9
    .line 10
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 11
    .line 12
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 13
    .line 14
    int-to-long v5, v5

    .line 15
    add-long/2addr v3, v5

    .line 16
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getDouble(Ljava/lang/Object;J)D

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    add-int/2addr v3, v0

    .line 23
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 24
    .line 25
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
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readFloat()F
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 8
    .line 9
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 10
    .line 11
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 12
    .line 13
    int-to-long v5, v5

    .line 14
    add-long/2addr v3, v5

    .line 15
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getFloat(Ljava/lang/Object;J)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    add-int/2addr v2, v0

    .line 22
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 23
    .line 24
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
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readInt()I
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 8
    .line 9
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 10
    .line 11
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 12
    .line 13
    int-to-long v5, v5

    .line 14
    add-long/2addr v3, v5

    .line 15
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    add-int/2addr v2, v0

    .line 22
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 23
    .line 24
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
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readLong()J
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 9
    .line 10
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 11
    .line 12
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 13
    .line 14
    int-to-long v5, v5

    .line 15
    add-long/2addr v3, v5

    .line 16
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    add-int/2addr v3, v0

    .line 23
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 24
    .line 25
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
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public readShort()S
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 8
    .line 9
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 10
    .line 11
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 12
    .line 13
    int-to-long v5, v5

    .line 14
    add-long/2addr v3, v5

    .line 15
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    add-int/2addr v2, v0

    .line 22
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 23
    .line 24
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
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeInput;->readBytes(Ljava/lang/Object;JI)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
