.class public Lcom/esotericsoftware/kryo/io/KryoDataInput;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/DataInput;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field protected input:Lcom/esotericsoftware/kryo/io/Input;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/io/Input;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public readBoolean()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readBoolean()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public readByte()B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readByte()B

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public readChar()C
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readChar()C

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public readDouble()D
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readDouble()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public readFloat()F
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readFloat()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public readFully([B)V
    .locals 2

    const/4 v0, 0x0

    .line 18
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/KryoDataInput;->readFully([BII)V

    return-void
.end method

.method public readFully([BII)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Input;->readBytes([BII)V
    :try_end_0
    .catch Lcom/esotericsoftware/kryo/KryoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    new-instance p1, Ljava/io/EOFException;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/KryoException;->getMessage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
.end method

.method public readInt()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readInt()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public readLine()Ljava/lang/String;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public readLong()J
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readLong()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public readShort()S
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readShort()S

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public readUTF()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public readUnsignedByte()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readByteUnsigned()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public readUnsignedShort()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readShortUnsigned()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public setInput(Lcom/esotericsoftware/kryo/io/Input;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    return-void
.end method

.method public skipBytes(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    int-to-long v0, p1

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/io/Input;->skip(J)J

    .line 5
    .line 6
    .line 7
    move-result-wide p0

    .line 8
    long-to-int p0, p0

    .line 9
    return p0
.end method
