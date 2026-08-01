.class public Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;
.super Lcom/esotericsoftware/kryo/io/Output;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Output;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p1}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;-><init>(II)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;-><init>(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;-><init>([BI)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;-><init>([BI)V

    return-void
.end method


# virtual methods
.method public write(I)V
    .locals 6

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
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 14
    .line 15
    sget-wide v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 16
    .line 17
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/lit8 v5, v4, 0x1

    .line 20
    .line 21
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 22
    .line 23
    int-to-long v4, v4

    .line 24
    add-long/2addr v2, v4

    .line 25
    int-to-byte p0, p1

    .line 26
    invoke-virtual {v0, v1, v2, v3, p0}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public writeBoolean(Z)V
    .locals 6

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
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 14
    .line 15
    sget-wide v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 16
    .line 17
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/lit8 v5, v4, 0x1

    .line 20
    .line 21
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 22
    .line 23
    int-to-long v4, v4

    .line 24
    add-long/2addr v2, v4

    .line 25
    invoke-virtual {v0, v1, v2, v3, p1}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 26
    .line 27
    .line 28
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
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public writeByte(B)V
    .locals 6

    .line 30
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 31
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    sget-wide v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3, p1}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    return-void
.end method

.method public writeByte(I)V
    .locals 6

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
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 14
    .line 15
    sget-wide v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 16
    .line 17
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/lit8 v5, v4, 0x1

    .line 20
    .line 21
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 22
    .line 23
    int-to-long v4, v4

    .line 24
    add-long/2addr v2, v4

    .line 25
    int-to-byte p0, p1

    .line 26
    invoke-virtual {v0, v1, v2, v3, p0}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 27
    .line 28
    .line 29
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
    iget-object v5, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 14
    .line 15
    sget-wide p2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 16
    .line 17
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    int-to-long v6, v2

    .line 20
    add-long/2addr v6, p2

    .line 21
    int-to-long v8, v0

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
    return-void

    .line 35
    :cond_0
    add-long/2addr v3, v8

    .line 36
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 37
    .line 38
    invoke-static {p1, p4}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 43
    .line 44
    .line 45
    move-object p1, v2

    .line 46
    goto :goto_0
.end method

.method public writeBytes([BII)V
    .locals 4

    .line 47
    sget-wide v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;->writeBytes(Ljava/lang/Object;JI)V

    return-void
.end method

.method public writeChar(C)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 8
    .line 9
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 10
    .line 11
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 12
    .line 13
    int-to-long v5, v5

    .line 14
    add-long/2addr v3, v5

    .line 15
    invoke-virtual {v1, v2, v3, v4, p1}, Lsun/misc/Unsafe;->putChar(Ljava/lang/Object;JC)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 22
    .line 23
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
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeDouble(D)V
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 9
    .line 10
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 11
    .line 12
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    int-to-long v5, v5

    .line 15
    add-long/2addr v3, v5

    .line 16
    move-wide v5, p1

    .line 17
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putDouble(Ljava/lang/Object;JD)V

    .line 18
    .line 19
    .line 20
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 21
    .line 22
    add-int/2addr p1, v0

    .line 23
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 24
    .line 25
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
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeFloat(F)V
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 8
    .line 9
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 10
    .line 11
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 12
    .line 13
    int-to-long v5, v5

    .line 14
    add-long/2addr v3, v5

    .line 15
    invoke-virtual {v1, v2, v3, v4, p1}, Lsun/misc/Unsafe;->putFloat(Ljava/lang/Object;JF)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 22
    .line 23
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
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeInt(I)V
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 8
    .line 9
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 10
    .line 11
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 12
    .line 13
    int-to-long v5, v5

    .line 14
    add-long/2addr v3, v5

    .line 15
    invoke-virtual {v1, v2, v3, v4, p1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 22
    .line 23
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
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeLong(J)V
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 9
    .line 10
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 11
    .line 12
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    int-to-long v5, v5

    .line 15
    add-long/2addr v3, v5

    .line 16
    move-wide v5, p1

    .line 17
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 21
    .line 22
    add-int/2addr p1, v0

    .line 23
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 24
    .line 25
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
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeShort(I)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 8
    .line 9
    sget-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 10
    .line 11
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 12
    .line 13
    int-to-long v5, v5

    .line 14
    add-long/2addr v3, v5

    .line 15
    int-to-short p1, p1

    .line 16
    invoke-virtual {v1, v2, v3, v4, p1}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 20
    .line 21
    add-int/2addr p1, v0

    .line 22
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 23
    .line 24
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
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/esotericsoftware/kryo/unsafe/UnsafeOutput;->writeBytes(Ljava/lang/Object;JI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
