.class public Lcom/esotericsoftware/kryo/io/KryoDataOutput;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/DataOutput;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field protected output:Lcom/esotericsoftware/kryo/io/Output;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/io/Output;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOutput(Lcom/esotericsoftware/kryo/io/Output;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    return-void
.end method

.method public write(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->write(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public write([B)V
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->write([B)V

    return-void
.end method

.method public write([BII)V
    .locals 0

    .line 8
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Output;->write([BII)V

    return-void
.end method

.method public writeBoolean(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeBoolean(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeByte(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeBytes(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    int-to-byte v3, v3

    .line 15
    invoke-virtual {v2, v3}, Lcom/esotericsoftware/kryo/io/Output;->write(I)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public writeChar(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    int-to-char p1, p1

    .line 4
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeChar(C)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public writeChars(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget-object v3, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 13
    .line 14
    and-int/lit16 v4, v2, 0xff

    .line 15
    .line 16
    invoke-virtual {v3, v4}, Lcom/esotericsoftware/kryo/io/Output;->write(I)V

    .line 17
    .line 18
    .line 19
    iget-object v3, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 20
    .line 21
    ushr-int/lit8 v2, v2, 0x8

    .line 22
    .line 23
    and-int/lit16 v2, v2, 0xff

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Lcom/esotericsoftware/kryo/io/Output;->write(I)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public writeDouble(D)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;->writeDouble(D)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeFloat(F)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeFloat(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeInt(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeLong(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;->writeLong(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeShort(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeShort(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeUTF(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
