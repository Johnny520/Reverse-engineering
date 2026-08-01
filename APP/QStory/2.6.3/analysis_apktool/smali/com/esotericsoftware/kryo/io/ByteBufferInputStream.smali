.class public Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;
.super Ljava/io/InputStream;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private byteBuffer:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->flipBuffer(Ljava/nio/Buffer;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private flipBuffer(Ljava/nio/Buffer;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->flip()Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public available()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getByteBuffer()Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object p0
.end method

.method public read()I
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 26
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public read([BII)I
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    if-nez p3, :cond_1

    .line 16
    .line 17
    const/4 p0, -0x1

    .line 18
    return p0

    .line 19
    :cond_1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    return p3
.end method

.method public setByteBuffer(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-void
.end method
