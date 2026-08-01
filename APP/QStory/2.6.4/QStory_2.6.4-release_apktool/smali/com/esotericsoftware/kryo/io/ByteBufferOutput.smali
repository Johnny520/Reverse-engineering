.class public Lcom/esotericsoftware/kryo/io/ByteBufferOutput;
.super Lcom/esotericsoftware/kryo/io/Output;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final nativeOrder:Ljava/nio/ByteOrder;


# instance fields
.field protected byteBuffer:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->nativeOrder:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Output;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Output;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    if-lt p2, v0, :cond_1

    .line 6
    .line 7
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 8
    .line 9
    if-ne p2, v0, :cond_0

    .line 10
    .line 11
    const p2, 0x7ffffff7

    .line 12
    .line 13
    .line 14
    :cond_0
    iput p2, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 15
    .line 16
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const-string p0, "maxBufferSize cannot be < -1: "

    .line 24
    .line 25
    invoke-static {p2, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    const/16 v0, 0x1000

    .line 40
    invoke-direct {p0, v0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;-><init>(II)V

    if-eqz p1, :cond_0

    .line 41
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    return-void

    .line 42
    :cond_0
    const-string p0, "outputStream cannot be null."

    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    .line 43
    invoke-direct {p0, p2, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;-><init>(II)V

    if-eqz p1, :cond_0

    .line 44
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    return-void

    .line 45
    :cond_0
    const-string p0, "outputStream cannot be null."

    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Output;-><init>()V

    .line 37
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBuffer(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Output;-><init>()V

    .line 39
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBuffer(Ljava/nio/ByteBuffer;I)V

    return-void
.end method

.method private getBufferPosition(Ljava/nio/Buffer;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private setBufferLimit(Ljava/nio/Buffer;I)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
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

.method private writeAscii_slow(Ljava/lang/String;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 6
    .line 7
    sub-int/2addr v1, v2

    .line 8
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v3, p2, :cond_1

    .line 15
    .line 16
    new-array v4, p2, [B

    .line 17
    .line 18
    add-int v5, v3, v1

    .line 19
    .line 20
    invoke-virtual {p1, v3, v5, v4, v2}, Ljava/lang/String;->getBytes(II[BI)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v4, v2, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 27
    .line 28
    add-int/2addr v3, v1

    .line 29
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 30
    .line 31
    sub-int v1, p2, v5

    .line 32
    .line 33
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 34
    .line 35
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    :cond_0
    move v3, v5

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return-void
.end method

.method private writeUtf8_slow(Ljava/lang/String;II)V
    .locals 4

    .line 1
    :goto_0
    if-ge p3, p2, :cond_4

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    sub-int v0, p2, p3

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    add-int/2addr v0, v1

    .line 22
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 23
    .line 24
    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/16 v2, 0x7f

    .line 29
    .line 30
    if-gt v0, v2, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    int-to-byte v0, v0

    .line 35
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    const/16 v3, 0x7ff

    .line 42
    .line 43
    if-le v0, v3, :cond_2

    .line 44
    .line 45
    shr-int/lit8 v1, v0, 0xc

    .line 46
    .line 47
    and-int/lit8 v1, v1, 0xf

    .line 48
    .line 49
    or-int/lit16 v1, v1, 0xe0

    .line 50
    .line 51
    int-to-byte v1, v1

    .line 52
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x2

    .line 56
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 57
    .line 58
    .line 59
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 60
    .line 61
    add-int/2addr v2, v1

    .line 62
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 63
    .line 64
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    shr-int/lit8 v2, v0, 0x6

    .line 67
    .line 68
    and-int/lit8 v2, v2, 0x3f

    .line 69
    .line 70
    or-int/lit16 v2, v2, 0x80

    .line 71
    .line 72
    int-to-byte v2, v2

    .line 73
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    and-int/lit8 v0, v0, 0x3f

    .line 79
    .line 80
    or-int/lit16 v0, v0, 0x80

    .line 81
    .line 82
    int-to-byte v0, v0

    .line 83
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    shr-int/lit8 v3, v0, 0x6

    .line 88
    .line 89
    and-int/lit8 v3, v3, 0x1f

    .line 90
    .line 91
    or-int/lit16 v3, v3, 0xc0

    .line 92
    .line 93
    int-to-byte v3, v3

    .line 94
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    .line 97
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 98
    .line 99
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 100
    .line 101
    if-ne v2, v3, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 104
    .line 105
    .line 106
    :cond_3
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 107
    .line 108
    add-int/2addr v2, v1

    .line 109
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 110
    .line 111
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    and-int/lit8 v0, v0, 0x3f

    .line 114
    .line 115
    or-int/lit16 v0, v0, 0x80

    .line 116
    .line 117
    int-to-byte v0, v0

    .line 118
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    .line 121
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_4
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->flush()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :catch_0
    :cond_0
    return-void
.end method

.method public flush()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 7
    .line 8
    new-array v0, v0, [B

    .line 9
    .line 10
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {p0, v1, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-direct {p0, v1, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 27
    .line 28
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    iget-wide v0, p0, Lcom/esotericsoftware/kryo/io/Output;->total:J

    .line 34
    .line 35
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 36
    .line 37
    int-to-long v3, v3

    .line 38
    add-long/2addr v0, v3

    .line 39
    iput-wide v0, p0, Lcom/esotericsoftware/kryo/io/Output;->total:J

    .line 40
    .line 41
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 42
    .line 43
    return-void

    .line 44
    :catch_0
    move-exception p0

    .line 45
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 46
    .line 47
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public getBuffer()[B
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This buffer does not used a byte[], see #getByteBuffer()."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public getByteBuffer()Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 2
    .line 3
    return-object p0
.end method

.method public require(I)Z
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-lt v0, p1, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->flush()V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 14
    .line 15
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 16
    .line 17
    sub-int v3, v0, v2

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-lt v3, p1, :cond_1

    .line 21
    .line 22
    return v4

    .line 23
    :cond_1
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 24
    .line 25
    sub-int v2, v3, v2

    .line 26
    .line 27
    if-le p1, v2, :cond_3

    .line 28
    .line 29
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 30
    .line 31
    const-string v1, ", required: "

    .line 32
    .line 33
    if-le p1, v3, :cond_2

    .line 34
    .line 35
    new-instance p0, Lcom/esotericsoftware/kryo/io/KryoBufferOverflowException;

    .line 36
    .line 37
    const-string v2, "Buffer overflow. Max capacity: "

    .line 38
    .line 39
    invoke-static {v0, p1, v2, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/KryoBufferOverflowException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2
    new-instance v2, Lcom/esotericsoftware/kryo/io/KryoBufferOverflowException;

    .line 48
    .line 49
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 50
    .line 51
    sub-int/2addr v0, p0

    .line 52
    new-instance p0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, "Buffer overflow. Available: "

    .line 55
    .line 56
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v2, p0}, Lcom/esotericsoftware/kryo/io/KryoBufferOverflowException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v2

    .line 76
    :cond_3
    if-nez v0, :cond_4

    .line 77
    .line 78
    const/16 v0, 0x10

    .line 79
    .line 80
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 81
    .line 82
    :cond_4
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 83
    .line 84
    mul-int/lit8 v0, v0, 0x2

    .line 85
    .line 86
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 87
    .line 88
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 93
    .line 94
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 95
    .line 96
    sub-int/2addr v0, v2

    .line 97
    if-lt v0, p1, :cond_4

    .line 98
    .line 99
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 106
    .line 107
    if-nez p1, :cond_5

    .line 108
    .line 109
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    goto :goto_0

    .line 114
    :cond_5
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :goto_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 124
    .line 125
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 126
    .line 127
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBufferLimit(Ljava/nio/Buffer;I)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 142
    .line 143
    .line 144
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 145
    .line 146
    return v4
.end method

.method public reset()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/esotericsoftware/kryo/io/Output;->reset()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setBuffer(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 57
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBuffer(Ljava/nio/ByteBuffer;I)V

    return-void
.end method

.method public setBuffer(Ljava/nio/ByteBuffer;I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-lt p2, v0, :cond_1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    if-ne p2, v0, :cond_0

    .line 9
    .line 10
    const p2, 0x7ffffff7

    .line 11
    .line 12
    .line 13
    :cond_0
    iput p2, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iput p2, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 26
    .line 27
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    iput-wide p1, p0, Lcom/esotericsoftware/kryo/io/Output;->total:J

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const-string p0, "maxBufferSize cannot be < -1: "

    .line 36
    .line 37
    invoke-static {p2, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    const-string p0, "buffer cannot be null."

    .line 46
    .line 47
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public setBuffer([B)V
    .locals 0

    .line 58
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "This buffer does not used a byte[], see #setByteBuffer(ByteBuffer)."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setBuffer([BI)V
    .locals 0

    .line 51
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "This buffer does not used a byte[], see #setByteBuffer(ByteBuffer)."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setBuffer([BII)V
    .locals 1

    .line 52
    array-length v0, p1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 53
    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    const/4 p2, 0x0

    .line 54
    invoke-direct {p0, v0, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 55
    array-length p1, p1

    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBufferLimit(Ljava/nio/Buffer;I)V

    .line 56
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBuffer(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public setPosition(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public toBytes()[B
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p0, v1, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 14
    .line 15
    invoke-virtual {v1, v0, v2, p0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public write(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    int-to-byte p1, p1

    .line 14
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/2addr p1, v2

    .line 20
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 21
    .line 22
    return-void
.end method

.method public write([B)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 23
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeBytes([BII)V

    return-void

    .line 24
    :cond_0
    const-string p0, "bytes cannot be null."

    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    return-void
.end method

.method public write([BII)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeBytes([BII)V

    return-void
.end method

.method public writeAscii(Ljava/lang/String;)V
    .locals 7

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeByte(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eq v1, v3, :cond_3

    .line 18
    .line 19
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 20
    .line 21
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 22
    .line 23
    sub-int/2addr v4, v5

    .line 24
    if-ge v4, v1, :cond_1

    .line 25
    .line 26
    invoke-direct {p0, p1, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeAscii_slow(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v4, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    :goto_0
    if-ge v2, v5, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    int-to-byte v6, v6

    .line 43
    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 50
    .line 51
    add-int/2addr p1, v1

    .line 52
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 53
    .line 54
    :goto_1
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 57
    .line 58
    add-int/lit8 v1, p0, -0x1

    .line 59
    .line 60
    sub-int/2addr p0, v3

    .line 61
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    or-int/2addr p0, v0

    .line 66
    int-to-byte p0, p0

    .line 67
    invoke-virtual {p1, v1, p0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    const/4 v0, 0x2

    .line 72
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    const/16 v3, -0x7e

    .line 78
    .line 79
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    int-to-byte p1, p1

    .line 89
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    .line 92
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 93
    .line 94
    add-int/2addr p1, v0

    .line 95
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    const/16 p1, 0x81

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeByte(I)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public writeBoolean(Z)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    int-to-byte p1, p1

    .line 14
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/2addr p1, v2

    .line 20
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 21
    .line 22
    return-void
.end method

.method public writeBooleans([ZII)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    if-lt v0, p3, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 6
    .line 7
    .line 8
    add-int/2addr p3, p2

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    if-ge p2, p3, :cond_0

    .line 12
    .line 13
    aget-boolean v1, p1, p2

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    add-int/lit8 p2, p2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    add-int/2addr p3, p2

    .line 29
    :goto_1
    if-ge p2, p3, :cond_2

    .line 30
    .line 31
    aget-boolean v0, p1, p2

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeBoolean(Z)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 p2, p2, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    return-void
.end method

.method public writeByte(B)V
    .locals 3

    .line 23
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 25
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    add-int/2addr p1, v2

    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    return-void
.end method

.method public writeByte(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    int-to-byte p1, p1

    .line 14
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/2addr p1, v2

    .line 20
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 21
    .line 22
    return-void
.end method

.method public writeBytes([B)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 43
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeBytes([BII)V

    return-void

    .line 44
    :cond_0
    const-string p0, "bytes cannot be null."

    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    return-void
.end method

.method public writeBytes([BII)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p2, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    add-int/2addr v1, v0

    .line 20
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 21
    .line 22
    sub-int/2addr p3, v0

    .line 23
    if-nez p3, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    add-int/2addr p2, v0

    .line 27
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 28
    .line 29
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string p0, "bytes cannot be null."

    .line 38
    .line 39
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public writeChar(C)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 3
    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 6
    .line 7
    add-int/2addr v1, v0

    .line 8
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    int-to-byte v1, p1

    .line 13
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    ushr-int/lit8 p1, p1, 0x8

    .line 19
    .line 20
    int-to-byte p1, p1

    .line 21
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public writeChars([CII)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x1

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 8
    .line 9
    .line 10
    add-int/2addr p3, p2

    .line 11
    :goto_0
    if-ge p2, p3, :cond_0

    .line 12
    .line 13
    aget-char v0, p1, p2

    .line 14
    .line 15
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    int-to-byte v2, v0

    .line 18
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    ushr-int/lit8 v0, v0, 0x8

    .line 24
    .line 25
    int-to-byte v0, v0

    .line 26
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    add-int/2addr p3, p2

    .line 42
    :goto_1
    if-ge p2, p3, :cond_2

    .line 43
    .line 44
    aget-char v0, p1, p2

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeChar(C)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 p2, p2, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    return-void
.end method

.method public writeDouble(D)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 7
    .line 8
    add-int/2addr v1, v0

    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    long-to-int v1, p1

    .line 18
    int-to-byte v1, v1

    .line 19
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    ushr-long v0, p1, v0

    .line 23
    .line 24
    long-to-int v0, v0

    .line 25
    int-to-byte v0, v0

    .line 26
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    const/16 v0, 0x10

    .line 30
    .line 31
    ushr-long v0, p1, v0

    .line 32
    .line 33
    long-to-int v0, v0

    .line 34
    int-to-byte v0, v0

    .line 35
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    const/16 v0, 0x18

    .line 39
    .line 40
    ushr-long v0, p1, v0

    .line 41
    .line 42
    long-to-int v0, v0

    .line 43
    int-to-byte v0, v0

    .line 44
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x20

    .line 48
    .line 49
    ushr-long v0, p1, v0

    .line 50
    .line 51
    long-to-int v0, v0

    .line 52
    int-to-byte v0, v0

    .line 53
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    const/16 v0, 0x28

    .line 57
    .line 58
    ushr-long v0, p1, v0

    .line 59
    .line 60
    long-to-int v0, v0

    .line 61
    int-to-byte v0, v0

    .line 62
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    .line 65
    const/16 v0, 0x30

    .line 66
    .line 67
    ushr-long v0, p1, v0

    .line 68
    .line 69
    long-to-int v0, v0

    .line 70
    int-to-byte v0, v0

    .line 71
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 72
    .line 73
    .line 74
    const/16 v0, 0x38

    .line 75
    .line 76
    ushr-long/2addr p1, v0

    .line 77
    long-to-int p1, p1

    .line 78
    int-to-byte p1, p1

    .line 79
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public writeDoubles([DII)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x3

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    add-int/2addr p3, p2

    .line 13
    :goto_0
    if-ge p2, p3, :cond_0

    .line 14
    .line 15
    aget-wide v1, p1, p2

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    long-to-int v3, v1

    .line 22
    int-to-byte v3, v3

    .line 23
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    const/16 v3, 0x8

    .line 27
    .line 28
    ushr-long v3, v1, v3

    .line 29
    .line 30
    long-to-int v3, v3

    .line 31
    int-to-byte v3, v3

    .line 32
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    const/16 v3, 0x10

    .line 36
    .line 37
    ushr-long v3, v1, v3

    .line 38
    .line 39
    long-to-int v3, v3

    .line 40
    int-to-byte v3, v3

    .line 41
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    .line 44
    const/16 v3, 0x18

    .line 45
    .line 46
    ushr-long v3, v1, v3

    .line 47
    .line 48
    long-to-int v3, v3

    .line 49
    int-to-byte v3, v3

    .line 50
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    ushr-long v3, v1, v3

    .line 56
    .line 57
    long-to-int v3, v3

    .line 58
    int-to-byte v3, v3

    .line 59
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    .line 62
    const/16 v3, 0x28

    .line 63
    .line 64
    ushr-long v3, v1, v3

    .line 65
    .line 66
    long-to-int v3, v3

    .line 67
    int-to-byte v3, v3

    .line 68
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    const/16 v3, 0x30

    .line 72
    .line 73
    ushr-long v3, v1, v3

    .line 74
    .line 75
    long-to-int v3, v3

    .line 76
    int-to-byte v3, v3

    .line 77
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    const/16 v3, 0x38

    .line 81
    .line 82
    ushr-long/2addr v1, v3

    .line 83
    long-to-int v1, v1

    .line 84
    int-to-byte v1, v1

    .line 85
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    .line 88
    add-int/lit8 p2, p2, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    add-int/2addr p3, p2

    .line 99
    :goto_1
    if-ge p2, p3, :cond_2

    .line 100
    .line 101
    aget-wide v0, p1, p2

    .line 102
    .line 103
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeDouble(D)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 p2, p2, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    return-void
.end method

.method public writeFloat(F)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 8
    .line 9
    add-int/2addr v2, v0

    .line 10
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    int-to-byte p1, p0

    .line 17
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    shr-int/lit8 p1, p0, 0x8

    .line 21
    .line 22
    int-to-byte p1, p1

    .line 23
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    shr-int/lit8 p1, p0, 0x10

    .line 27
    .line 28
    int-to-byte p1, p1

    .line 29
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    shr-int/lit8 p0, p0, 0x18

    .line 33
    .line 34
    int-to-byte p0, p0

    .line 35
    invoke-virtual {v1, p0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public writeFloats([FII)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x2

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    add-int/2addr p3, p2

    .line 13
    :goto_0
    if-ge p2, p3, :cond_0

    .line 14
    .line 15
    aget v1, p1, p2

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-byte v2, v1

    .line 22
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    shr-int/lit8 v2, v1, 0x8

    .line 26
    .line 27
    int-to-byte v2, v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    shr-int/lit8 v2, v1, 0x10

    .line 32
    .line 33
    int-to-byte v2, v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    shr-int/lit8 v1, v1, 0x18

    .line 38
    .line 39
    int-to-byte v1, v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    add-int/lit8 p2, p2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    add-int/2addr p3, p2

    .line 54
    :goto_1
    if-ge p2, p3, :cond_2

    .line 55
    .line 56
    aget v0, p1, p2

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeFloat(F)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 p2, p2, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    return-void
.end method

.method public writeInt(I)V
    .locals 2

    const/4 v0, 0x4

    .line 94
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 95
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 96
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    int-to-byte v0, p1

    .line 97
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v0, p1, 0x8

    int-to-byte v0, v0

    .line 98
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v0, p1, 0x10

    int-to-byte v0, v0

    .line 99
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    .line 100
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public writeInt(II)V
    .locals 2

    .line 1
    if-ltz p2, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-gt p2, v0, :cond_4

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 7
    .line 8
    .line 9
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    add-int/2addr v1, p2

    .line 12
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-eq p2, v1, :cond_3

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    if-eq p2, v1, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    if-eq p2, v1, :cond_1

    .line 24
    .line 25
    if-eq p2, v0, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    shr-int/lit8 p2, p1, 0x18

    .line 29
    .line 30
    int-to-byte p2, p2

    .line 31
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    shr-int/lit8 p2, p1, 0x10

    .line 35
    .line 36
    int-to-byte p2, p2

    .line 37
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    shr-int/lit8 p2, p1, 0x8

    .line 41
    .line 42
    int-to-byte p2, p2

    .line 43
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    int-to-byte p1, p1

    .line 47
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    shr-int/lit8 p2, p1, 0x10

    .line 52
    .line 53
    int-to-byte p2, p2

    .line 54
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    .line 57
    shr-int/lit8 p2, p1, 0x8

    .line 58
    .line 59
    int-to-byte p2, p2

    .line 60
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    .line 63
    int-to-byte p1, p1

    .line 64
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_2
    shr-int/lit8 p2, p1, 0x8

    .line 69
    .line 70
    int-to-byte p2, p2

    .line 71
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 72
    .line 73
    .line 74
    int-to-byte p1, p1

    .line 75
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    int-to-byte p1, p1

    .line 80
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    const-string p0, "count must be >= 0 and <= 4: "

    .line 85
    .line 86
    invoke-static {p2, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public writeInts([III)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x2

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    add-int/2addr p3, p2

    .line 13
    :goto_0
    if-ge p2, p3, :cond_0

    .line 14
    .line 15
    aget v1, p1, p2

    .line 16
    .line 17
    int-to-byte v2, v1

    .line 18
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    shr-int/lit8 v2, v1, 0x8

    .line 22
    .line 23
    int-to-byte v2, v2

    .line 24
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    shr-int/lit8 v2, v1, 0x10

    .line 28
    .line 29
    int-to-byte v2, v2

    .line 30
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    shr-int/lit8 v1, v1, 0x18

    .line 34
    .line 35
    int-to-byte v1, v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    add-int/lit8 p2, p2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    add-int/2addr p3, p2

    .line 50
    :goto_1
    if-ge p2, p3, :cond_2

    .line 51
    .line 52
    aget v0, p1, p2

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeInt(I)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 p2, p2, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    return-void
.end method

.method public writeLong(J)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 7
    .line 8
    add-int/2addr v1, v0

    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    long-to-int v1, p1

    .line 14
    int-to-byte v1, v1

    .line 15
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    ushr-long v0, p1, v0

    .line 19
    .line 20
    long-to-int v0, v0

    .line 21
    int-to-byte v0, v0

    .line 22
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x10

    .line 26
    .line 27
    ushr-long v0, p1, v0

    .line 28
    .line 29
    long-to-int v0, v0

    .line 30
    int-to-byte v0, v0

    .line 31
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x18

    .line 35
    .line 36
    ushr-long v0, p1, v0

    .line 37
    .line 38
    long-to-int v0, v0

    .line 39
    int-to-byte v0, v0

    .line 40
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    const/16 v0, 0x20

    .line 44
    .line 45
    ushr-long v0, p1, v0

    .line 46
    .line 47
    long-to-int v0, v0

    .line 48
    int-to-byte v0, v0

    .line 49
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    .line 52
    const/16 v0, 0x28

    .line 53
    .line 54
    ushr-long v0, p1, v0

    .line 55
    .line 56
    long-to-int v0, v0

    .line 57
    int-to-byte v0, v0

    .line 58
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    .line 61
    const/16 v0, 0x30

    .line 62
    .line 63
    ushr-long v0, p1, v0

    .line 64
    .line 65
    long-to-int v0, v0

    .line 66
    int-to-byte v0, v0

    .line 67
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    const/16 v0, 0x38

    .line 71
    .line 72
    ushr-long/2addr p1, v0

    .line 73
    long-to-int p1, p1

    .line 74
    int-to-byte p1, p1

    .line 75
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public writeLongs([JII)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x3

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    add-int/2addr p3, p2

    .line 13
    :goto_0
    if-ge p2, p3, :cond_0

    .line 14
    .line 15
    aget-wide v1, p1, p2

    .line 16
    .line 17
    long-to-int v3, v1

    .line 18
    int-to-byte v3, v3

    .line 19
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    const/16 v3, 0x8

    .line 23
    .line 24
    ushr-long v3, v1, v3

    .line 25
    .line 26
    long-to-int v3, v3

    .line 27
    int-to-byte v3, v3

    .line 28
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    const/16 v3, 0x10

    .line 32
    .line 33
    ushr-long v3, v1, v3

    .line 34
    .line 35
    long-to-int v3, v3

    .line 36
    int-to-byte v3, v3

    .line 37
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    const/16 v3, 0x18

    .line 41
    .line 42
    ushr-long v3, v1, v3

    .line 43
    .line 44
    long-to-int v3, v3

    .line 45
    int-to-byte v3, v3

    .line 46
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    const/16 v3, 0x20

    .line 50
    .line 51
    ushr-long v3, v1, v3

    .line 52
    .line 53
    long-to-int v3, v3

    .line 54
    int-to-byte v3, v3

    .line 55
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    const/16 v3, 0x28

    .line 59
    .line 60
    ushr-long v3, v1, v3

    .line 61
    .line 62
    long-to-int v3, v3

    .line 63
    int-to-byte v3, v3

    .line 64
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    const/16 v3, 0x30

    .line 68
    .line 69
    ushr-long v3, v1, v3

    .line 70
    .line 71
    long-to-int v3, v3

    .line 72
    int-to-byte v3, v3

    .line 73
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    .line 76
    const/16 v3, 0x38

    .line 77
    .line 78
    ushr-long/2addr v1, v3

    .line 79
    long-to-int v1, v1

    .line 80
    int-to-byte v1, v1

    .line 81
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    .line 84
    add-int/lit8 p2, p2, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 92
    .line 93
    return-void

    .line 94
    :cond_1
    add-int/2addr p3, p2

    .line 95
    :goto_1
    if-ge p2, p3, :cond_2

    .line 96
    .line 97
    aget-wide v0, p1, p2

    .line 98
    .line 99
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeLong(J)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 p2, p2, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    return-void
.end method

.method public writeShort(I)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 3
    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 6
    .line 7
    add-int/2addr v1, v0

    .line 8
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    int-to-byte v1, p1

    .line 13
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    ushr-int/lit8 p1, p1, 0x8

    .line 19
    .line 20
    int-to-byte p1, p1

    .line 21
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public writeShorts([SII)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x1

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 8
    .line 9
    .line 10
    add-int/2addr p3, p2

    .line 11
    :goto_0
    if-ge p2, p3, :cond_0

    .line 12
    .line 13
    aget-short v0, p1, p2

    .line 14
    .line 15
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    int-to-byte v2, v0

    .line 18
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    ushr-int/lit8 v0, v0, 0x8

    .line 24
    .line 25
    int-to-byte v0, v0

    .line 26
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    add-int/2addr p3, p2

    .line 42
    :goto_1
    if-ge p2, p3, :cond_2

    .line 43
    .line 44
    aget-short v0, p1, p2

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeShort(I)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 p2, p2, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    return-void
.end method

.method public writeString(Ljava/lang/String;)V
    .locals 7

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeByte(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    const/16 p1, 0x81

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeByte(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/16 v2, 0x7f

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x1

    .line 25
    if-le v1, v4, :cond_6

    .line 26
    .line 27
    const/16 v5, 0x20

    .line 28
    .line 29
    if-gt v1, v5, :cond_6

    .line 30
    .line 31
    move v5, v3

    .line 32
    :goto_0
    if-ge v5, v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-le v6, v2, :cond_2

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 45
    .line 46
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 47
    .line 48
    sub-int/2addr v2, v5

    .line 49
    if-ge v2, v1, :cond_4

    .line 50
    .line 51
    invoke-direct {p0, p1, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeAscii_slow(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    :goto_1
    if-ge v3, v2, :cond_5

    .line 60
    .line 61
    iget-object v5, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    int-to-byte v6, v6

    .line 68
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 75
    .line 76
    add-int/2addr p1, v1

    .line 77
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 78
    .line 79
    :goto_2
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 82
    .line 83
    add-int/lit8 v1, p0, -0x1

    .line 84
    .line 85
    sub-int/2addr p0, v4

    .line 86
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    or-int/2addr p0, v0

    .line 91
    int-to-byte p0, p0

    .line 92
    invoke-virtual {p1, v1, p0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_6
    :goto_3
    add-int/lit8 v0, v1, 0x1

    .line 97
    .line 98
    invoke-virtual {p0, v4, v0, v4}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeVarIntFlag(ZIZ)I

    .line 99
    .line 100
    .line 101
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 102
    .line 103
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 104
    .line 105
    sub-int/2addr v0, v4

    .line 106
    if-lt v0, v1, :cond_9

    .line 107
    .line 108
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    :cond_7
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-le v4, v2, :cond_8

    .line 115
    .line 116
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    int-to-byte v4, v4

    .line 124
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    .line 127
    add-int/lit8 v3, v3, 0x1

    .line 128
    .line 129
    if-ne v3, v1, :cond_7

    .line 130
    .line 131
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 136
    .line 137
    return-void

    .line 138
    :cond_9
    :goto_4
    if-ge v3, v1, :cond_a

    .line 139
    .line 140
    invoke-direct {p0, p1, v1, v3}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->writeUtf8_slow(Ljava/lang/String;II)V

    .line 141
    .line 142
    .line 143
    :cond_a
    return-void
.end method

.method public writeVarInt(IZ)I
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    shl-int/lit8 p2, p1, 0x1

    .line 4
    .line 5
    shr-int/lit8 p1, p1, 0x1f

    .line 6
    .line 7
    xor-int/2addr p1, p2

    .line 8
    :cond_0
    ushr-int/lit8 p2, p1, 0x7

    .line 9
    .line 10
    if-nez p2, :cond_2

    .line 11
    .line 12
    iget p2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 20
    .line 21
    .line 22
    :cond_1
    iget p2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 23
    .line 24
    add-int/2addr p2, v1

    .line 25
    iput p2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 26
    .line 27
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    int-to-byte p1, p1

    .line 30
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    return v1

    .line 34
    :cond_2
    ushr-int/lit8 v0, p1, 0xe

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 40
    .line 41
    .line 42
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 43
    .line 44
    add-int/2addr v1, v0

    .line 45
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 46
    .line 47
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    and-int/lit8 p1, p1, 0x7f

    .line 50
    .line 51
    or-int/lit16 p1, p1, 0x80

    .line 52
    .line 53
    int-to-byte p1, p1

    .line 54
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    int-to-byte p1, p2

    .line 60
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    .line 63
    return v0

    .line 64
    :cond_3
    ushr-int/lit8 v1, p1, 0x15

    .line 65
    .line 66
    if-nez v1, :cond_4

    .line 67
    .line 68
    const/4 v1, 0x3

    .line 69
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 70
    .line 71
    .line 72
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 73
    .line 74
    add-int/2addr v2, v1

    .line 75
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 76
    .line 77
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    and-int/lit8 p1, p1, 0x7f

    .line 80
    .line 81
    or-int/lit16 p1, p1, 0x80

    .line 82
    .line 83
    int-to-byte p1, p1

    .line 84
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    .line 87
    or-int/lit16 p1, p2, 0x80

    .line 88
    .line 89
    int-to-byte p1, p1

    .line 90
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    .line 93
    int-to-byte p1, v0

    .line 94
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    .line 97
    return v1

    .line 98
    :cond_4
    ushr-int/lit8 v2, p1, 0x1c

    .line 99
    .line 100
    if-nez v2, :cond_5

    .line 101
    .line 102
    const/4 v2, 0x4

    .line 103
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 104
    .line 105
    .line 106
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 107
    .line 108
    add-int/2addr v3, v2

    .line 109
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 110
    .line 111
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    and-int/lit8 p1, p1, 0x7f

    .line 114
    .line 115
    or-int/lit16 p1, p1, 0x80

    .line 116
    .line 117
    int-to-byte p1, p1

    .line 118
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    .line 121
    or-int/lit16 p1, p2, 0x80

    .line 122
    .line 123
    int-to-byte p1, p1

    .line 124
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    .line 127
    or-int/lit16 p1, v0, 0x80

    .line 128
    .line 129
    int-to-byte p1, p1

    .line 130
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    .line 133
    int-to-byte p1, v1

    .line 134
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 135
    .line 136
    .line 137
    return v2

    .line 138
    :cond_5
    const/4 v3, 0x5

    .line 139
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 140
    .line 141
    .line 142
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 143
    .line 144
    add-int/2addr v4, v3

    .line 145
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 146
    .line 147
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 148
    .line 149
    and-int/lit8 p1, p1, 0x7f

    .line 150
    .line 151
    or-int/lit16 p1, p1, 0x80

    .line 152
    .line 153
    int-to-byte p1, p1

    .line 154
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 155
    .line 156
    .line 157
    or-int/lit16 p1, p2, 0x80

    .line 158
    .line 159
    int-to-byte p1, p1

    .line 160
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 161
    .line 162
    .line 163
    or-int/lit16 p1, v0, 0x80

    .line 164
    .line 165
    int-to-byte p1, p1

    .line 166
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    .line 169
    or-int/lit16 p1, v1, 0x80

    .line 170
    .line 171
    int-to-byte p1, p1

    .line 172
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 173
    .line 174
    .line 175
    int-to-byte p1, v2

    .line 176
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 177
    .line 178
    .line 179
    return v3
.end method

.method public writeVarIntFlag(ZIZ)I
    .locals 5

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    shl-int/lit8 p3, p2, 0x1

    .line 4
    .line 5
    shr-int/lit8 p2, p2, 0x1f

    .line 6
    .line 7
    xor-int/2addr p2, p3

    .line 8
    :cond_0
    and-int/lit8 p3, p2, 0x3f

    .line 9
    .line 10
    const/16 v0, 0x80

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    move p1, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    :goto_0
    or-int/2addr p1, p3

    .line 18
    ushr-int/lit8 p3, p2, 0x6

    .line 19
    .line 20
    if-nez p3, :cond_3

    .line 21
    .line 22
    iget p2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 23
    .line 24
    iget p3, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    if-ne p2, p3, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-object p2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    int-to-byte p1, p1

    .line 35
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 39
    .line 40
    add-int/2addr p1, v0

    .line 41
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 42
    .line 43
    return v0

    .line 44
    :cond_3
    ushr-int/lit8 v1, p2, 0xd

    .line 45
    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    const/4 p2, 0x2

    .line 49
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 50
    .line 51
    .line 52
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 53
    .line 54
    add-int/2addr v0, p2

    .line 55
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 56
    .line 57
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    or-int/lit8 p1, p1, 0x40

    .line 60
    .line 61
    int-to-byte p1, p1

    .line 62
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    int-to-byte p1, p3

    .line 68
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    return p2

    .line 72
    :cond_4
    ushr-int/lit8 v2, p2, 0x14

    .line 73
    .line 74
    if-nez v2, :cond_5

    .line 75
    .line 76
    const/4 p2, 0x3

    .line 77
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 78
    .line 79
    .line 80
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 81
    .line 82
    add-int/2addr v2, p2

    .line 83
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 84
    .line 85
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    or-int/lit8 p1, p1, 0x40

    .line 88
    .line 89
    int-to-byte p1, p1

    .line 90
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    .line 93
    or-int/lit16 p1, p3, 0x80

    .line 94
    .line 95
    int-to-byte p1, p1

    .line 96
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    .line 99
    int-to-byte p1, v1

    .line 100
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    .line 103
    return p2

    .line 104
    :cond_5
    ushr-int/lit8 p2, p2, 0x1b

    .line 105
    .line 106
    if-nez p2, :cond_6

    .line 107
    .line 108
    const/4 p2, 0x4

    .line 109
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 110
    .line 111
    .line 112
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 113
    .line 114
    add-int/2addr v3, p2

    .line 115
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 116
    .line 117
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    or-int/lit8 p1, p1, 0x40

    .line 120
    .line 121
    int-to-byte p1, p1

    .line 122
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    or-int/lit16 p1, p3, 0x80

    .line 126
    .line 127
    int-to-byte p1, p1

    .line 128
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 129
    .line 130
    .line 131
    or-int/lit16 p1, v1, 0x80

    .line 132
    .line 133
    int-to-byte p1, p1

    .line 134
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 135
    .line 136
    .line 137
    int-to-byte p1, v2

    .line 138
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    .line 141
    return p2

    .line 142
    :cond_6
    const/4 v3, 0x5

    .line 143
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 144
    .line 145
    .line 146
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 147
    .line 148
    add-int/2addr v4, v3

    .line 149
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 150
    .line 151
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    or-int/lit8 p1, p1, 0x40

    .line 154
    .line 155
    int-to-byte p1, p1

    .line 156
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 157
    .line 158
    .line 159
    or-int/lit16 p1, p3, 0x80

    .line 160
    .line 161
    int-to-byte p1, p1

    .line 162
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 163
    .line 164
    .line 165
    or-int/lit16 p1, v1, 0x80

    .line 166
    .line 167
    int-to-byte p1, p1

    .line 168
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 169
    .line 170
    .line 171
    or-int/lit16 p1, v2, 0x80

    .line 172
    .line 173
    int-to-byte p1, p1

    .line 174
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 175
    .line 176
    .line 177
    int-to-byte p1, p2

    .line 178
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 179
    .line 180
    .line 181
    return v3
.end method

.method public writeVarLong(JZ)I
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    shl-long v2, p1, v1

    .line 7
    .line 8
    const/16 v4, 0x3f

    .line 9
    .line 10
    shr-long v4, p1, v4

    .line 11
    .line 12
    xor-long/2addr v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide/from16 v2, p1

    .line 15
    .line 16
    :goto_0
    const/4 v4, 0x7

    .line 17
    ushr-long v5, v2, v4

    .line 18
    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    cmp-long v9, v5, v7

    .line 22
    .line 23
    if-nez v9, :cond_2

    .line 24
    .line 25
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 26
    .line 27
    iget v5, v0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 28
    .line 29
    if-ne v4, v5, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 35
    .line 36
    add-int/2addr v4, v1

    .line 37
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 38
    .line 39
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    long-to-int v2, v2

    .line 42
    int-to-byte v2, v2

    .line 43
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    return v1

    .line 47
    :cond_2
    const/16 v1, 0xe

    .line 48
    .line 49
    ushr-long v9, v2, v1

    .line 50
    .line 51
    cmp-long v1, v9, v7

    .line 52
    .line 53
    const-wide/16 v11, 0x7f

    .line 54
    .line 55
    const-wide/16 v13, 0x80

    .line 56
    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 61
    .line 62
    .line 63
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 64
    .line 65
    add-int/2addr v4, v1

    .line 66
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 67
    .line 68
    iget-object v4, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    and-long/2addr v2, v11

    .line 71
    or-long/2addr v2, v13

    .line 72
    long-to-int v2, v2

    .line 73
    int-to-byte v2, v2

    .line 74
    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    long-to-int v2, v5

    .line 80
    int-to-byte v2, v2

    .line 81
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    .line 84
    return v1

    .line 85
    :cond_3
    const/16 v1, 0x15

    .line 86
    .line 87
    move-wide/from16 p1, v7

    .line 88
    .line 89
    ushr-long v7, v2, v1

    .line 90
    .line 91
    cmp-long v1, v7, p1

    .line 92
    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    const/4 v1, 0x3

    .line 96
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 97
    .line 98
    .line 99
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 100
    .line 101
    add-int/2addr v4, v1

    .line 102
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 103
    .line 104
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    and-long/2addr v2, v11

    .line 107
    or-long/2addr v2, v13

    .line 108
    long-to-int v2, v2

    .line 109
    int-to-byte v2, v2

    .line 110
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    .line 113
    or-long v2, v5, v13

    .line 114
    .line 115
    long-to-int v2, v2

    .line 116
    int-to-byte v2, v2

    .line 117
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    .line 120
    long-to-int v2, v9

    .line 121
    int-to-byte v2, v2

    .line 122
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    return v1

    .line 126
    :cond_4
    const/16 v1, 0x1c

    .line 127
    .line 128
    move-wide v15, v11

    .line 129
    ushr-long v11, v2, v1

    .line 130
    .line 131
    cmp-long v1, v11, p1

    .line 132
    .line 133
    if-nez v1, :cond_5

    .line 134
    .line 135
    const/4 v1, 0x4

    .line 136
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 137
    .line 138
    .line 139
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 140
    .line 141
    add-int/2addr v4, v1

    .line 142
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 143
    .line 144
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 145
    .line 146
    and-long/2addr v2, v15

    .line 147
    or-long/2addr v2, v13

    .line 148
    long-to-int v2, v2

    .line 149
    int-to-byte v2, v2

    .line 150
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    .line 153
    or-long v2, v5, v13

    .line 154
    .line 155
    long-to-int v2, v2

    .line 156
    int-to-byte v2, v2

    .line 157
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 158
    .line 159
    .line 160
    or-long v2, v9, v13

    .line 161
    .line 162
    long-to-int v2, v2

    .line 163
    int-to-byte v2, v2

    .line 164
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 165
    .line 166
    .line 167
    long-to-int v2, v7

    .line 168
    int-to-byte v2, v2

    .line 169
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 170
    .line 171
    .line 172
    return v1

    .line 173
    :cond_5
    const/16 v1, 0x23

    .line 174
    .line 175
    move-wide/from16 v17, v13

    .line 176
    .line 177
    ushr-long v13, v2, v1

    .line 178
    .line 179
    cmp-long v1, v13, p1

    .line 180
    .line 181
    if-nez v1, :cond_6

    .line 182
    .line 183
    const/4 v1, 0x5

    .line 184
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 185
    .line 186
    .line 187
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 188
    .line 189
    add-int/2addr v4, v1

    .line 190
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 191
    .line 192
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    and-long/2addr v2, v15

    .line 195
    or-long v2, v2, v17

    .line 196
    .line 197
    long-to-int v2, v2

    .line 198
    int-to-byte v2, v2

    .line 199
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 200
    .line 201
    .line 202
    or-long v2, v5, v17

    .line 203
    .line 204
    long-to-int v2, v2

    .line 205
    int-to-byte v2, v2

    .line 206
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 207
    .line 208
    .line 209
    or-long v2, v9, v17

    .line 210
    .line 211
    long-to-int v2, v2

    .line 212
    int-to-byte v2, v2

    .line 213
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 214
    .line 215
    .line 216
    or-long v2, v7, v17

    .line 217
    .line 218
    long-to-int v2, v2

    .line 219
    int-to-byte v2, v2

    .line 220
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 221
    .line 222
    .line 223
    long-to-int v2, v11

    .line 224
    int-to-byte v2, v2

    .line 225
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 226
    .line 227
    .line 228
    return v1

    .line 229
    :cond_6
    const/16 v1, 0x2a

    .line 230
    .line 231
    move-wide/from16 v19, v5

    .line 232
    .line 233
    ushr-long v4, v2, v1

    .line 234
    .line 235
    cmp-long v1, v4, p1

    .line 236
    .line 237
    if-nez v1, :cond_7

    .line 238
    .line 239
    const/4 v1, 0x6

    .line 240
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 241
    .line 242
    .line 243
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 244
    .line 245
    add-int/2addr v4, v1

    .line 246
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 247
    .line 248
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 249
    .line 250
    and-long/2addr v2, v15

    .line 251
    or-long v2, v2, v17

    .line 252
    .line 253
    long-to-int v2, v2

    .line 254
    int-to-byte v2, v2

    .line 255
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 256
    .line 257
    .line 258
    or-long v2, v19, v17

    .line 259
    .line 260
    long-to-int v2, v2

    .line 261
    int-to-byte v2, v2

    .line 262
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 263
    .line 264
    .line 265
    or-long v2, v9, v17

    .line 266
    .line 267
    long-to-int v2, v2

    .line 268
    int-to-byte v2, v2

    .line 269
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 270
    .line 271
    .line 272
    or-long v2, v7, v17

    .line 273
    .line 274
    long-to-int v2, v2

    .line 275
    int-to-byte v2, v2

    .line 276
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 277
    .line 278
    .line 279
    or-long v2, v11, v17

    .line 280
    .line 281
    long-to-int v2, v2

    .line 282
    int-to-byte v2, v2

    .line 283
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 284
    .line 285
    .line 286
    long-to-int v2, v13

    .line 287
    int-to-byte v2, v2

    .line 288
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 289
    .line 290
    .line 291
    return v1

    .line 292
    :cond_7
    const/16 v1, 0x31

    .line 293
    .line 294
    move-wide/from16 v21, v2

    .line 295
    .line 296
    ushr-long v1, v21, v1

    .line 297
    .line 298
    cmp-long v3, v1, p1

    .line 299
    .line 300
    if-nez v3, :cond_8

    .line 301
    .line 302
    const/4 v3, 0x7

    .line 303
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 304
    .line 305
    .line 306
    iget v1, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 307
    .line 308
    add-int/2addr v1, v3

    .line 309
    iput v1, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 310
    .line 311
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 312
    .line 313
    and-long v1, v21, v15

    .line 314
    .line 315
    or-long v1, v1, v17

    .line 316
    .line 317
    long-to-int v1, v1

    .line 318
    int-to-byte v1, v1

    .line 319
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 320
    .line 321
    .line 322
    or-long v1, v19, v17

    .line 323
    .line 324
    long-to-int v1, v1

    .line 325
    int-to-byte v1, v1

    .line 326
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 327
    .line 328
    .line 329
    or-long v1, v9, v17

    .line 330
    .line 331
    long-to-int v1, v1

    .line 332
    int-to-byte v1, v1

    .line 333
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 334
    .line 335
    .line 336
    or-long v1, v7, v17

    .line 337
    .line 338
    long-to-int v1, v1

    .line 339
    int-to-byte v1, v1

    .line 340
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 341
    .line 342
    .line 343
    or-long v1, v11, v17

    .line 344
    .line 345
    long-to-int v1, v1

    .line 346
    int-to-byte v1, v1

    .line 347
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 348
    .line 349
    .line 350
    or-long v1, v13, v17

    .line 351
    .line 352
    long-to-int v1, v1

    .line 353
    int-to-byte v1, v1

    .line 354
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 355
    .line 356
    .line 357
    long-to-int v1, v4

    .line 358
    int-to-byte v1, v1

    .line 359
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 360
    .line 361
    .line 362
    const/4 v3, 0x7

    .line 363
    return v3

    .line 364
    :cond_8
    const/16 v3, 0x38

    .line 365
    .line 366
    move-wide/from16 v23, v4

    .line 367
    .line 368
    ushr-long v3, v21, v3

    .line 369
    .line 370
    cmp-long v5, v3, p1

    .line 371
    .line 372
    if-nez v5, :cond_9

    .line 373
    .line 374
    const/16 v3, 0x8

    .line 375
    .line 376
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 377
    .line 378
    .line 379
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 380
    .line 381
    add-int/2addr v4, v3

    .line 382
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 383
    .line 384
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 385
    .line 386
    and-long v4, v21, v15

    .line 387
    .line 388
    or-long v4, v4, v17

    .line 389
    .line 390
    long-to-int v4, v4

    .line 391
    int-to-byte v4, v4

    .line 392
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 393
    .line 394
    .line 395
    or-long v4, v19, v17

    .line 396
    .line 397
    long-to-int v4, v4

    .line 398
    int-to-byte v4, v4

    .line 399
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 400
    .line 401
    .line 402
    or-long v4, v9, v17

    .line 403
    .line 404
    long-to-int v4, v4

    .line 405
    int-to-byte v4, v4

    .line 406
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 407
    .line 408
    .line 409
    or-long v4, v7, v17

    .line 410
    .line 411
    long-to-int v4, v4

    .line 412
    int-to-byte v4, v4

    .line 413
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 414
    .line 415
    .line 416
    or-long v4, v11, v17

    .line 417
    .line 418
    long-to-int v4, v4

    .line 419
    int-to-byte v4, v4

    .line 420
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 421
    .line 422
    .line 423
    or-long v4, v13, v17

    .line 424
    .line 425
    long-to-int v4, v4

    .line 426
    int-to-byte v4, v4

    .line 427
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 428
    .line 429
    .line 430
    or-long v4, v23, v17

    .line 431
    .line 432
    long-to-int v4, v4

    .line 433
    int-to-byte v4, v4

    .line 434
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 435
    .line 436
    .line 437
    long-to-int v1, v1

    .line 438
    int-to-byte v1, v1

    .line 439
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 440
    .line 441
    .line 442
    return v3

    .line 443
    :cond_9
    const/16 v5, 0x9

    .line 444
    .line 445
    invoke-virtual {v0, v5}, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->require(I)Z

    .line 446
    .line 447
    .line 448
    iget v6, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 449
    .line 450
    add-int/2addr v6, v5

    .line 451
    iput v6, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 452
    .line 453
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/ByteBufferOutput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 454
    .line 455
    and-long v15, v21, v15

    .line 456
    .line 457
    move/from16 p1, v5

    .line 458
    .line 459
    or-long v5, v15, v17

    .line 460
    .line 461
    long-to-int v5, v5

    .line 462
    int-to-byte v5, v5

    .line 463
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 464
    .line 465
    .line 466
    or-long v5, v19, v17

    .line 467
    .line 468
    long-to-int v5, v5

    .line 469
    int-to-byte v5, v5

    .line 470
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 471
    .line 472
    .line 473
    or-long v5, v9, v17

    .line 474
    .line 475
    long-to-int v5, v5

    .line 476
    int-to-byte v5, v5

    .line 477
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 478
    .line 479
    .line 480
    or-long v5, v7, v17

    .line 481
    .line 482
    long-to-int v5, v5

    .line 483
    int-to-byte v5, v5

    .line 484
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 485
    .line 486
    .line 487
    or-long v5, v11, v17

    .line 488
    .line 489
    long-to-int v5, v5

    .line 490
    int-to-byte v5, v5

    .line 491
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 492
    .line 493
    .line 494
    or-long v5, v13, v17

    .line 495
    .line 496
    long-to-int v5, v5

    .line 497
    int-to-byte v5, v5

    .line 498
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 499
    .line 500
    .line 501
    or-long v5, v23, v17

    .line 502
    .line 503
    long-to-int v5, v5

    .line 504
    int-to-byte v5, v5

    .line 505
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 506
    .line 507
    .line 508
    or-long v1, v1, v17

    .line 509
    .line 510
    long-to-int v1, v1

    .line 511
    int-to-byte v1, v1

    .line 512
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 513
    .line 514
    .line 515
    long-to-int v1, v3

    .line 516
    int-to-byte v1, v1

    .line 517
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 518
    .line 519
    .line 520
    return p1
.end method
