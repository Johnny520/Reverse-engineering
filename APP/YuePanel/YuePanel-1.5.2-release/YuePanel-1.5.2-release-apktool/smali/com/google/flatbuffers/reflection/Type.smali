.class public final Lcom/google/flatbuffers/reflection/Type;
.super Lcom/google/flatbuffers/Table;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/Type$Vector;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static ValidateVersion()V
    .locals 0

    invoke-static {}, Lcom/google/flatbuffers/Constants;->FLATBUFFERS_23_5_26()V

    return-void
.end method

.method public static synthetic access$000(ILjava/nio/ByteBuffer;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/google/flatbuffers/Table;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result p0

    return p0
.end method

.method public static addBaseSize(Lcom/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 1

    const/4 v0, 0x4

    long-to-int p1, p1

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addInt(III)V

    return-void
.end method

.method public static addBaseType(Lcom/google/flatbuffers/FlatBufferBuilder;B)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(IBI)V

    return-void
.end method

.method public static addElement(Lcom/google/flatbuffers/FlatBufferBuilder;B)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(IBI)V

    return-void
.end method

.method public static addElementSize(Lcom/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 1

    long-to-int p1, p1

    const/4 p2, 0x0

    const/4 v0, 0x5

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->addInt(III)V

    return-void
.end method

.method public static addFixedLength(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    int-to-short p1, p1

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-virtual {p0, v1, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addShort(ISI)V

    return-void
.end method

.method public static addIndex(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, -0x1

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addInt(III)V

    return-void
.end method

.method public static createType(Lcom/google/flatbuffers/FlatBufferBuilder;BBIIJJ)I
    .locals 1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    invoke-static {p0, p7, p8}, Lcom/google/flatbuffers/reflection/Type;->addElementSize(Lcom/google/flatbuffers/FlatBufferBuilder;J)V

    invoke-static {p0, p5, p6}, Lcom/google/flatbuffers/reflection/Type;->addBaseSize(Lcom/google/flatbuffers/FlatBufferBuilder;J)V

    invoke-static {p0, p3}, Lcom/google/flatbuffers/reflection/Type;->addIndex(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p4}, Lcom/google/flatbuffers/reflection/Type;->addFixedLength(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p2}, Lcom/google/flatbuffers/reflection/Type;->addElement(Lcom/google/flatbuffers/FlatBufferBuilder;B)V

    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/Type;->addBaseType(Lcom/google/flatbuffers/FlatBufferBuilder;B)V

    invoke-static {p0}, Lcom/google/flatbuffers/reflection/Type;->endType(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result p0

    return p0
.end method

.method public static endType(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 0

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result p0

    return p0
.end method

.method public static getRootAsType(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Type;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Type;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Type;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/Type;->getRootAsType(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Type;)Lcom/google/flatbuffers/reflection/Type;

    move-result-object p0

    return-object p0
.end method

.method public static getRootAsType(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Type;)Lcom/google/flatbuffers/reflection/Type;
    .locals 2

    .line 2
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/Type;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Type;

    move-result-object p0

    return-object p0
.end method

.method public static startType(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Type;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Type;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/Table;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public baseSize()J
    .locals 4

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x4

    :goto_0
    return-wide v0
.end method

.method public baseType()B
    .locals 3

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public element()B
    .locals 3

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public elementSize()J
    .locals 4

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public fixedLength()I
    .locals 3

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public index()I
    .locals 3

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method
