.class public final Lcom/google/flatbuffers/reflection/RPCCall;
.super Lcom/google/flatbuffers/Table;
.source "RPCCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/RPCCall$Vector;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static ValidateVersion()V
    .locals 0

    .line 24
    invoke-static {}, Lcom/google/flatbuffers/Constants;->FLATBUFFERS_23_5_26()V

    return-void
.end method

.method public static __lookup_by_key(Lcom/google/flatbuffers/reflection/RPCCall;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 7
    .param p0, "obj"    # Lcom/google/flatbuffers/reflection/RPCCall;
    .param p1, "vectorLocation"    # I
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "bb"    # Ljava/nio/ByteBuffer;

    .line 86
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 87
    .local v0, "byteKey":[B
    add-int/lit8 v1, p1, -0x4

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    .line 88
    .local v1, "span":I
    const/4 v2, 0x0

    .line 89
    .local v2, "start":I
    :goto_0
    if-eqz v1, :cond_3

    .line 90
    div-int/lit8 v3, v1, 0x2

    .line 91
    .local v3, "middle":I
    add-int v4, v2, v3

    const/4 v5, 0x4

    mul-int/2addr v4, v5

    add-int/2addr v4, p1

    invoke-static {v4, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v4

    .line 92
    .local v4, "tableOffset":I
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v6

    sub-int/2addr v6, v4

    invoke-static {v5, v6, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v5

    invoke-static {v5, v0, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->compareStrings(I[BLjava/nio/ByteBuffer;)I

    move-result v5

    .line 93
    .local v5, "comp":I
    if-lez v5, :cond_0

    .line 94
    move v1, v3

    goto :goto_1

    .line 95
    :cond_0
    if-gez v5, :cond_1

    .line 96
    add-int/lit8 v3, v3, 0x1

    .line 97
    add-int/2addr v2, v3

    .line 98
    sub-int/2addr v1, v3

    .line 102
    .end local v3    # "middle":I
    .end local v4    # "tableOffset":I
    .end local v5    # "comp":I
    :goto_1
    goto :goto_0

    .line 100
    .restart local v3    # "middle":I
    .restart local v4    # "tableOffset":I
    .restart local v5    # "comp":I
    :cond_1
    if-nez p0, :cond_2

    new-instance v6, Lcom/google/flatbuffers/reflection/RPCCall;

    invoke-direct {v6}, Lcom/google/flatbuffers/reflection/RPCCall;-><init>()V

    goto :goto_2

    :cond_2
    move-object v6, p0

    :goto_2
    invoke-virtual {v6, v4, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object v6

    return-object v6

    .line 103
    .end local v3    # "middle":I
    .end local v4    # "tableOffset":I
    .end local v5    # "comp":I
    :cond_3
    const/4 v3, 0x0

    return-object v3
.end method

.method static synthetic access$000(ILjava/nio/ByteBuffer;)I
    .locals 1
    .param p0, "x0"    # I
    .param p1, "x1"    # Ljava/nio/ByteBuffer;

    .line 23
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/RPCCall;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public static addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "attributesOffset"    # I

    .line 68
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "documentationOffset"    # I

    .line 71
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I

    .line 65
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    return-void
.end method

.method public static addRequest(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "requestOffset"    # I

    .line 66
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addResponse(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "responseOffset"    # I

    .line 67
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static createAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 69
    const/4 v0, 0x4

    array-length v1, p1

    invoke-virtual {p0, v0, v1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .end local v0    # "i":I
    :cond_0
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result v0

    return v0
.end method

.method public static createDocumentationVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 72
    const/4 v0, 0x4

    array-length v1, p1

    invoke-virtual {p0, v0, v1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .end local v0    # "i":I
    :cond_0
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result v0

    return v0
.end method

.method public static createRPCCall(Lcom/google/flatbuffers/FlatBufferBuilder;IIIII)I
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I
    .param p2, "requestOffset"    # I
    .param p3, "responseOffset"    # I
    .param p4, "attributesOffset"    # I
    .param p5, "documentationOffset"    # I

    .line 55
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 56
    invoke-static {p0, p5}, Lcom/google/flatbuffers/reflection/RPCCall;->addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 57
    invoke-static {p0, p4}, Lcom/google/flatbuffers/reflection/RPCCall;->addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 58
    invoke-static {p0, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->addResponse(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 59
    invoke-static {p0, p2}, Lcom/google/flatbuffers/reflection/RPCCall;->addRequest(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 60
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/RPCCall;->addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 61
    invoke-static {p0}, Lcom/google/flatbuffers/reflection/RPCCall;->endRPCCall(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method public static endRPCCall(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 75
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 76
    .local v0, "o":I
    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 77
    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 78
    const/16 v1, 0x8

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 79
    return v0
.end method

.method public static getRootAsRPCCall(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 1
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;

    .line 25
    new-instance v0, Lcom/google/flatbuffers/reflection/RPCCall;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/RPCCall;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->getRootAsRPCCall(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/RPCCall;)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object v0

    return-object v0
.end method

.method public static getRootAsRPCCall(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/RPCCall;)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 2
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/RPCCall;

    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/RPCCall;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object v0

    return-object v0
.end method

.method public static startAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 70
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startDocumentationVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 73
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startRPCCall(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 64
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/RPCCall;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/RPCCall;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public attributes(I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 1
    .param p1, "j"    # I

    .line 37
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/RPCCall;->attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;
    .param p2, "j"    # I

    .line 38
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/RPCCall;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/KeyValue;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public attributesByKey(Lcom/google/flatbuffers/reflection/KeyValue;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;
    .param p2, "key"    # Ljava/lang/String;

    .line 41
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v1, p2, v2}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public attributesByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .line 40
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public attributesLength()I
    .locals 2

    .line 39
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public attributesVector()Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 1

    .line 42
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v0

    return-object v0
.end method

.method public attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    .line 43
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public documentation(I)Ljava/lang/String;
    .locals 3
    .param p1, "j"    # I

    .line 44
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p1, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/RPCCall;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public documentationLength()I
    .locals 2

    .line 45
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public documentationVector()Lcom/google/flatbuffers/StringVector;
    .locals 1

    .line 46
    new-instance v0, Lcom/google/flatbuffers/StringVector;

    invoke-direct {v0}, Lcom/google/flatbuffers/StringVector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;

    move-result-object v0

    return-object v0
.end method

.method public documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/StringVector;

    .line 47
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/StringVector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/StringVector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method protected keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I
    .locals 3
    .param p1, "o1"    # Ljava/lang/Integer;
    .param p2, "o2"    # Ljava/lang/Integer;
    .param p3, "_bb"    # Ljava/nio/ByteBuffer;

    .line 83
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {v1, v0, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v1

    invoke-static {v0, v1, p3}, Lcom/google/flatbuffers/reflection/RPCCall;->compareStrings(IILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public name()Ljava/lang/String;
    .locals 2

    .line 30
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/RPCCall;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public nameAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 31
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public nameInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 32
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/RPCCall;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public request()Lcom/google/flatbuffers/reflection/Object;
    .locals 1

    .line 33
    new-instance v0, Lcom/google/flatbuffers/reflection/Object;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->request(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v0

    return-object v0
.end method

.method public request(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Object;

    .line 34
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/RPCCall;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/Object;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public response()Lcom/google/flatbuffers/reflection/Object;
    .locals 1

    .line 35
    new-instance v0, Lcom/google/flatbuffers/reflection/Object;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->response(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v0

    return-object v0
.end method

.method public response(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Object;

    .line 36
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/RPCCall;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/RPCCall;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/RPCCall;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/Object;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method
