.class public Lcom/esotericsoftware/kryo/io/ByteBufferOutputStream;
.super Ljava/io/OutputStream;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private byteBuffer:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

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
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferOutputStream;-><init>(Ljava/nio/ByteBuffer;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public getByteBuffer()Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object p0
.end method

.method public setByteBuffer(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-void
.end method

.method public write(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    int-to-byte p1, p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public write([BII)V
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-ge v0, p3, :cond_0

    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V

    .line 20
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferOutputStream;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    return-void
.end method
