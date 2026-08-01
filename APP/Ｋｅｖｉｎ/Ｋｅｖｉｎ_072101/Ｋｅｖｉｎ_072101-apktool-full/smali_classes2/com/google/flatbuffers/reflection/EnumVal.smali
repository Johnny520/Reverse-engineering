.class public final Lcom/google/flatbuffers/reflection/EnumVal;
.super Lcom/google/flatbuffers/Table;
.source "EnumVal.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/EnumVal$Vector;
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

.method public static __lookup_by_key(Lcom/google/flatbuffers/reflection/EnumVal;IJLjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/EnumVal;
    .locals 8
    .param p0, "obj"    # Lcom/google/flatbuffers/reflection/EnumVal;
    .param p1, "vectorLocation"    # I
    .param p2, "key"    # J
    .param p4, "bb"    # Ljava/nio/ByteBuffer;

    .line 87
    add-int/lit8 v0, p1, -0x4

    invoke-virtual {p4, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    .line 88
    .local v0, "span":I
    const/4 v1, 0x0

    .line 89
    .local v1, "start":I
    :goto_0
    if-eqz v0, :cond_5

    .line 90
    div-int/lit8 v2, v0, 0x2

    .line 91
    .local v2, "middle":I
    add-int v3, v1, v2

    mul-int/lit8 v3, v3, 0x4

    add-int/2addr v3, p1

    invoke-static {v3, p4}, Lcom/google/flatbuffers/reflection/EnumVal;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v3

    .line 92
    .local v3, "tableOffset":I
    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v4

    sub-int/2addr v4, v3

    const/4 v5, 0x6

    invoke-static {v5, v4, p4}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v4

    invoke-virtual {p4, v4}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v4

    .line 93
    .local v4, "val":J
    cmp-long v6, v4, p2

    if-lez v6, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    cmp-long v6, v4, p2

    if-gez v6, :cond_1

    const/4 v6, -0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 94
    .local v6, "comp":I
    :goto_1
    if-lez v6, :cond_2

    .line 95
    move v0, v2

    goto :goto_2

    .line 96
    :cond_2
    if-gez v6, :cond_3

    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    add-int/2addr v1, v2

    .line 99
    sub-int/2addr v0, v2

    .line 103
    .end local v2    # "middle":I
    .end local v3    # "tableOffset":I
    .end local v4    # "val":J
    .end local v6    # "comp":I
    :goto_2
    goto :goto_0

    .line 101
    .restart local v2    # "middle":I
    .restart local v3    # "tableOffset":I
    .restart local v4    # "val":J
    .restart local v6    # "comp":I
    :cond_3
    if-nez p0, :cond_4

    new-instance v7, Lcom/google/flatbuffers/reflection/EnumVal;

    invoke-direct {v7}, Lcom/google/flatbuffers/reflection/EnumVal;-><init>()V

    goto :goto_3

    :cond_4
    move-object v7, p0

    :goto_3
    invoke-virtual {v7, v3, p4}, Lcom/google/flatbuffers/reflection/EnumVal;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/EnumVal;

    move-result-object v7

    return-object v7

    .line 104
    .end local v2    # "middle":I
    .end local v3    # "tableOffset":I
    .end local v4    # "val":J
    .end local v6    # "comp":I
    :cond_5
    const/4 v2, 0x0

    return-object v2
.end method

.method static synthetic access$000(ILjava/nio/ByteBuffer;)I
    .locals 1
    .param p0, "x0"    # I
    .param p1, "x1"    # Ljava/nio/ByteBuffer;

    .line 23
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/EnumVal;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public static addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "attributesOffset"    # I

    .line 70
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "documentationOffset"    # I

    .line 67
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I

    .line 64
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addUnionType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "unionTypeOffset"    # I

    .line 66
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addValue(Lcom/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "value"    # J

    .line 65
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->addLong(J)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    return-void
.end method

.method public static createAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 71
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

    .line 68
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

.method public static createEnumVal(Lcom/google/flatbuffers/FlatBufferBuilder;IJIII)I
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I
    .param p2, "value"    # J
    .param p4, "unionTypeOffset"    # I
    .param p5, "documentationOffset"    # I
    .param p6, "attributesOffset"    # I

    .line 54
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 55
    invoke-static {p0, p2, p3}, Lcom/google/flatbuffers/reflection/EnumVal;->addValue(Lcom/google/flatbuffers/FlatBufferBuilder;J)V

    .line 56
    invoke-static {p0, p6}, Lcom/google/flatbuffers/reflection/EnumVal;->addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 57
    invoke-static {p0, p5}, Lcom/google/flatbuffers/reflection/EnumVal;->addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 58
    invoke-static {p0, p4}, Lcom/google/flatbuffers/reflection/EnumVal;->addUnionType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 59
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/EnumVal;->addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 60
    invoke-static {p0}, Lcom/google/flatbuffers/reflection/EnumVal;->endEnumVal(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method public static endEnumVal(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 74
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 75
    .local v0, "o":I
    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 76
    return v0
.end method

.method public static getRootAsEnumVal(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/EnumVal;
    .locals 1
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;

    .line 25
    new-instance v0, Lcom/google/flatbuffers/reflection/EnumVal;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/EnumVal;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->getRootAsEnumVal(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/EnumVal;)Lcom/google/flatbuffers/reflection/EnumVal;

    move-result-object v0

    return-object v0
.end method

.method public static getRootAsEnumVal(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/EnumVal;)Lcom/google/flatbuffers/reflection/EnumVal;
    .locals 2
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/EnumVal;

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

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/EnumVal;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/EnumVal;

    move-result-object v0

    return-object v0
.end method

.method public static startAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 72
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startDocumentationVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 69
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startEnumVal(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 63
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/EnumVal;
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/EnumVal;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/EnumVal;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public attributes(I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 1
    .param p1, "j"    # I

    .line 40
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/EnumVal;->attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;
    .param p2, "j"    # I

    .line 41
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/EnumVal;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb:Ljava/nio/ByteBuffer;

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
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb:Ljava/nio/ByteBuffer;

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
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public attributesLength()I
    .locals 2

    .line 42
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector_len(I)I

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

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v0

    return-object v0
.end method

.method public attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    .line 46
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb:Ljava/nio/ByteBuffer;

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

    .line 36
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p1, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/EnumVal;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public documentationLength()I
    .locals 2

    .line 37
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public documentationVector()Lcom/google/flatbuffers/StringVector;
    .locals 1

    .line 38
    new-instance v0, Lcom/google/flatbuffers/StringVector;

    invoke-direct {v0}, Lcom/google/flatbuffers/StringVector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;

    move-result-object v0

    return-object v0
.end method

.method public documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/StringVector;

    .line 39
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/StringVector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/StringVector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method protected keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I
    .locals 5
    .param p1, "o1"    # Ljava/lang/Integer;
    .param p2, "o2"    # Ljava/lang/Integer;
    .param p3, "_bb"    # Ljava/nio/ByteBuffer;

    .line 81
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v1, v0, p3}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v2

    .line 82
    .local v2, "val_1":J
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0, p3}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    .line 83
    .local v0, "val_2":J
    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    cmp-long v4, v2, v0

    if-gez v4, :cond_1

    const/4 v4, -0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    return v4
.end method

.method public name()Ljava/lang/String;
    .locals 2

    .line 30
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/EnumVal;->__string(I)Ljava/lang/String;

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

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public nameInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 32
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/EnumVal;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public unionType()Lcom/google/flatbuffers/reflection/Type;
    .locals 1

    .line 34
    new-instance v0, Lcom/google/flatbuffers/reflection/Type;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Type;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->unionType(Lcom/google/flatbuffers/reflection/Type;)Lcom/google/flatbuffers/reflection/Type;

    move-result-object v0

    return-object v0
.end method

.method public unionType(Lcom/google/flatbuffers/reflection/Type;)Lcom/google/flatbuffers/reflection/Type;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Type;

    .line 35
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/EnumVal;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/Type;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Type;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public value()J
    .locals 3

    .line 33
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/EnumVal;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/reflection/EnumVal;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method
