.class public final Lcom/google/flatbuffers/reflection/RPCCall;
.super Lcom/google/flatbuffers/Table;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/RPCCall$Vector;
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

.method public static __lookup_by_key(Lcom/google/flatbuffers/reflection/RPCCall;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 6

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    add-int/lit8 v0, p1, -0x4

    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_3

    div-int/lit8 v2, v0, 0x2

    add-int v3, v1, v2

    const/4 v4, 0x4

    mul-int/2addr v3, v4

    add-int/2addr v3, p1

    invoke-static {v3, p3}, Lcom/google/flatbuffers/Table;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v3

    invoke-virtual {p3}, Ljava/nio/Buffer;->capacity()I

    move-result v5

    sub-int/2addr v5, v3

    invoke-static {v4, v5, p3}, Lcom/google/flatbuffers/Table;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v4

    invoke-static {v4, p2, p3}, Lcom/google/flatbuffers/Table;->compareStrings(I[BLjava/nio/ByteBuffer;)I

    move-result v4

    if-lez v4, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    if-gez v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    sub-int/2addr v0, v2

    goto :goto_0

    :cond_1
    if-nez p0, :cond_2

    new-instance p0, Lcom/google/flatbuffers/reflection/RPCCall;

    invoke-direct {p0}, Lcom/google/flatbuffers/reflection/RPCCall;-><init>()V

    :cond_2
    invoke-virtual {p0, v3, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic access$000(ILjava/nio/ByteBuffer;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/google/flatbuffers/Table;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result p0

    return p0
.end method

.method public static addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    return-void
.end method

.method public static addRequest(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addResponse(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static createAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p0

    return p0
.end method

.method public static createDocumentationVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p0

    return p0
.end method

.method public static createRPCCall(Lcom/google/flatbuffers/FlatBufferBuilder;IIIII)I
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    invoke-static {p0, p5}, Lcom/google/flatbuffers/reflection/RPCCall;->addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p4}, Lcom/google/flatbuffers/reflection/RPCCall;->addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->addResponse(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p2}, Lcom/google/flatbuffers/reflection/RPCCall;->addRequest(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/RPCCall;->addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0}, Lcom/google/flatbuffers/reflection/RPCCall;->endRPCCall(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result p0

    return p0
.end method

.method public static endRPCCall(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    const/16 v1, 0x8

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    return v0
.end method

.method public static getRootAsRPCCall(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/RPCCall;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/RPCCall;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->getRootAsRPCCall(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/RPCCall;)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object p0

    return-object p0
.end method

.method public static getRootAsRPCCall(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/RPCCall;)Lcom/google/flatbuffers/reflection/RPCCall;
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

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/RPCCall;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object p0

    return-object p0
.end method

.method public static startAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startDocumentationVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startRPCCall(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/RPCCall;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/Table;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public attributes(I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/RPCCall;->attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object p1

    return-object p1
.end method

.method public attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 1

    const/16 v0, 0xa

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, Lcom/google/flatbuffers/reflection/KeyValue;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public attributesByKey(Lcom/google/flatbuffers/reflection/KeyValue;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 2

    const/16 v0, 0xa

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, p2, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public attributesByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 3

    const/16 v0, 0xa

    .line 1
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v0, p1, v2}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public attributesLength()I
    .locals 1

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public attributesVector()Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v0

    return-object v0
.end method

.method public attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 3

    const/16 v0, 0xa

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public documentation(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__string(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public documentationLength()I
    .locals 1

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public documentationVector()Lcom/google/flatbuffers/StringVector;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/StringVector;

    invoke-direct {v0}, Lcom/google/flatbuffers/StringVector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;

    move-result-object v0

    return-object v0
.end method

.method public documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;
    .locals 3

    const/16 v0, 0xc

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/flatbuffers/StringVector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/StringVector;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x4

    invoke-static {v0, p1, p3}, Lcom/google/flatbuffers/Table;->__offset(IILjava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p2, p3}, Lcom/google/flatbuffers/Table;->__offset(IILjava/nio/ByteBuffer;)I

    move-result p2

    invoke-static {p1, p2, p3}, Lcom/google/flatbuffers/Table;->compareStrings(IILjava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public name()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public nameAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public nameInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public request()Lcom/google/flatbuffers/reflection/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Object;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->request(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v0

    return-object v0
.end method

.method public request(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;
    .locals 2

    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1}, Lcom/google/flatbuffers/reflection/Object;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public response()Lcom/google/flatbuffers/reflection/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Object;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->response(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v0

    return-object v0
.end method

.method public response(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;
    .locals 2

    const/16 v0, 0x8

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1}, Lcom/google/flatbuffers/reflection/Object;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
