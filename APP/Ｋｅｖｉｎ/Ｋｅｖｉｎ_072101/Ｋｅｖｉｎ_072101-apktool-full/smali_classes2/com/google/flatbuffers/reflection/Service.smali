.class public final Lcom/google/flatbuffers/reflection/Service;
.super Lcom/google/flatbuffers/Table;
.source "Service.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/Service$Vector;
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

.method public static __lookup_by_key(Lcom/google/flatbuffers/reflection/Service;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;
    .locals 7
    .param p0, "obj"    # Lcom/google/flatbuffers/reflection/Service;
    .param p1, "vectorLocation"    # I
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "bb"    # Ljava/nio/ByteBuffer;

    .line 95
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 96
    .local v0, "byteKey":[B
    add-int/lit8 v1, p1, -0x4

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    .line 97
    .local v1, "span":I
    const/4 v2, 0x0

    .line 98
    .local v2, "start":I
    :goto_0
    if-eqz v1, :cond_3

    .line 99
    div-int/lit8 v3, v1, 0x2

    .line 100
    .local v3, "middle":I
    add-int v4, v2, v3

    const/4 v5, 0x4

    mul-int/2addr v4, v5

    add-int/2addr v4, p1

    invoke-static {v4, p3}, Lcom/google/flatbuffers/reflection/Service;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v4

    .line 101
    .local v4, "tableOffset":I
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v6

    sub-int/2addr v6, v4

    invoke-static {v5, v6, p3}, Lcom/google/flatbuffers/reflection/Service;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v5

    invoke-static {v5, v0, p3}, Lcom/google/flatbuffers/reflection/Service;->compareStrings(I[BLjava/nio/ByteBuffer;)I

    move-result v5

    .line 102
    .local v5, "comp":I
    if-lez v5, :cond_0

    .line 103
    move v1, v3

    goto :goto_1

    .line 104
    :cond_0
    if-gez v5, :cond_1

    .line 105
    add-int/lit8 v3, v3, 0x1

    .line 106
    add-int/2addr v2, v3

    .line 107
    sub-int/2addr v1, v3

    .line 111
    .end local v3    # "middle":I
    .end local v4    # "tableOffset":I
    .end local v5    # "comp":I
    :goto_1
    goto :goto_0

    .line 109
    .restart local v3    # "middle":I
    .restart local v4    # "tableOffset":I
    .restart local v5    # "comp":I
    :cond_1
    if-nez p0, :cond_2

    new-instance v6, Lcom/google/flatbuffers/reflection/Service;

    invoke-direct {v6}, Lcom/google/flatbuffers/reflection/Service;-><init>()V

    goto :goto_2

    :cond_2
    move-object v6, p0

    :goto_2
    invoke-virtual {v6, v4, p3}, Lcom/google/flatbuffers/reflection/Service;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v6

    return-object v6

    .line 112
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
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/Service;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public static addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "attributesOffset"    # I

    .line 78
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addCalls(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "callsOffset"    # I

    .line 75
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addDeclarationFile(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "declarationFileOffset"    # I

    .line 84
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "documentationOffset"    # I

    .line 81
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I

    .line 74
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    return-void
.end method

.method public static createAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 79
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

.method public static createCallsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 76
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

    .line 82
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

.method public static createService(Lcom/google/flatbuffers/FlatBufferBuilder;IIIII)I
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I
    .param p2, "callsOffset"    # I
    .param p3, "attributesOffset"    # I
    .param p4, "documentationOffset"    # I
    .param p5, "declarationFileOffset"    # I

    .line 64
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 65
    invoke-static {p0, p5}, Lcom/google/flatbuffers/reflection/Service;->addDeclarationFile(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 66
    invoke-static {p0, p4}, Lcom/google/flatbuffers/reflection/Service;->addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 67
    invoke-static {p0, p3}, Lcom/google/flatbuffers/reflection/Service;->addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 68
    invoke-static {p0, p2}, Lcom/google/flatbuffers/reflection/Service;->addCalls(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 69
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/Service;->addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 70
    invoke-static {p0}, Lcom/google/flatbuffers/reflection/Service;->endService(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method public static endService(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 86
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 87
    .local v0, "o":I
    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 88
    return v0
.end method

.method public static getRootAsService(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;
    .locals 1
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;

    .line 25
    new-instance v0, Lcom/google/flatbuffers/reflection/Service;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Service;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->getRootAsService(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Service;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v0

    return-object v0
.end method

.method public static getRootAsService(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Service;)Lcom/google/flatbuffers/reflection/Service;
    .locals 2
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Service;

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

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/Service;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v0

    return-object v0
.end method

.method public static startAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 80
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startCallsVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 77
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startDocumentationVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 83
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startService(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 73
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Service;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Service;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public attributes(I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 1
    .param p1, "j"    # I

    .line 40
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Service;->attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;
    .param p2, "j"    # I

    .line 41
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Service;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Service;->bb:Ljava/nio/ByteBuffer;

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

    .line 44
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Service;->bb:Ljava/nio/ByteBuffer;

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

    .line 43
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Service;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public attributesLength()I
    .locals 2

    .line 42
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public attributesVector()Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 1

    .line 45
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v0

    return-object v0
.end method

.method public attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    .line 46
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Service;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public calls(I)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 1
    .param p1, "j"    # I

    .line 33
    new-instance v0, Lcom/google/flatbuffers/reflection/RPCCall;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/RPCCall;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Service;->calls(Lcom/google/flatbuffers/reflection/RPCCall;I)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object v0

    return-object v0
.end method

.method public calls(Lcom/google/flatbuffers/reflection/RPCCall;I)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/RPCCall;
    .param p2, "j"    # I

    .line 34
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Service;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Service;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/RPCCall;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public callsByKey(Lcom/google/flatbuffers/reflection/RPCCall;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/RPCCall;
    .param p2, "key"    # Ljava/lang/String;

    .line 37
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Service;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v1, p2, v2}, Lcom/google/flatbuffers/reflection/RPCCall;->__lookup_by_key(Lcom/google/flatbuffers/reflection/RPCCall;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public callsByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/RPCCall;
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .line 36
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Service;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/RPCCall;->__lookup_by_key(Lcom/google/flatbuffers/reflection/RPCCall;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public callsLength()I
    .locals 2

    .line 35
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public callsVector()Lcom/google/flatbuffers/reflection/RPCCall$Vector;
    .locals 1

    .line 38
    new-instance v0, Lcom/google/flatbuffers/reflection/RPCCall$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/RPCCall$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->callsVector(Lcom/google/flatbuffers/reflection/RPCCall$Vector;)Lcom/google/flatbuffers/reflection/RPCCall$Vector;

    move-result-object v0

    return-object v0
.end method

.method public callsVector(Lcom/google/flatbuffers/reflection/RPCCall$Vector;)Lcom/google/flatbuffers/reflection/RPCCall$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/RPCCall$Vector;

    .line 39
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Service;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/reflection/RPCCall$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/RPCCall$Vector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public declarationFile()Ljava/lang/String;
    .locals 2

    .line 54
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Service;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Service;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public declarationFileAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 55
    const/16 v0, 0xc

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/Service;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public declarationFileInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 56
    const/16 v0, 0xc

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/Service;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public documentation(I)Ljava/lang/String;
    .locals 3
    .param p1, "j"    # I

    .line 47
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p1, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Service;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public documentationLength()I
    .locals 2

    .line 48
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public documentationVector()Lcom/google/flatbuffers/StringVector;
    .locals 1

    .line 49
    new-instance v0, Lcom/google/flatbuffers/StringVector;

    invoke-direct {v0}, Lcom/google/flatbuffers/StringVector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;

    move-result-object v0

    return-object v0
.end method

.method public documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/StringVector;

    .line 50
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Service;->bb:Ljava/nio/ByteBuffer;

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

    .line 92
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {v1, v0, p3}, Lcom/google/flatbuffers/reflection/Service;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2, p3}, Lcom/google/flatbuffers/reflection/Service;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v1

    invoke-static {v0, v1, p3}, Lcom/google/flatbuffers/reflection/Service;->compareStrings(IILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public name()Ljava/lang/String;
    .locals 2

    .line 30
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Service;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Service;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Service;->__string(I)Ljava/lang/String;

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

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/Service;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public nameInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 32
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/Service;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method
