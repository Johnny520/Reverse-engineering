.class public final Lcom/google/flatbuffers/reflection/Enum;
.super Lcom/google/flatbuffers/Table;
.source "Enum.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/Enum$Vector;
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

.method public static __lookup_by_key(Lcom/google/flatbuffers/reflection/Enum;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;
    .locals 7
    .param p0, "obj"    # Lcom/google/flatbuffers/reflection/Enum;
    .param p1, "vectorLocation"    # I
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "bb"    # Ljava/nio/ByteBuffer;

    .line 106
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 107
    .local v0, "byteKey":[B
    add-int/lit8 v1, p1, -0x4

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    .line 108
    .local v1, "span":I
    const/4 v2, 0x0

    .line 109
    .local v2, "start":I
    :goto_0
    if-eqz v1, :cond_3

    .line 110
    div-int/lit8 v3, v1, 0x2

    .line 111
    .local v3, "middle":I
    add-int v4, v2, v3

    const/4 v5, 0x4

    mul-int/2addr v4, v5

    add-int/2addr v4, p1

    invoke-static {v4, p3}, Lcom/google/flatbuffers/reflection/Enum;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v4

    .line 112
    .local v4, "tableOffset":I
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v6

    sub-int/2addr v6, v4

    invoke-static {v5, v6, p3}, Lcom/google/flatbuffers/reflection/Enum;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v5

    invoke-static {v5, v0, p3}, Lcom/google/flatbuffers/reflection/Enum;->compareStrings(I[BLjava/nio/ByteBuffer;)I

    move-result v5

    .line 113
    .local v5, "comp":I
    if-lez v5, :cond_0

    .line 114
    move v1, v3

    goto :goto_1

    .line 115
    :cond_0
    if-gez v5, :cond_1

    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    add-int/2addr v2, v3

    .line 118
    sub-int/2addr v1, v3

    .line 122
    .end local v3    # "middle":I
    .end local v4    # "tableOffset":I
    .end local v5    # "comp":I
    :goto_1
    goto :goto_0

    .line 120
    .restart local v3    # "middle":I
    .restart local v4    # "tableOffset":I
    .restart local v5    # "comp":I
    :cond_1
    if-nez p0, :cond_2

    new-instance v6, Lcom/google/flatbuffers/reflection/Enum;

    invoke-direct {v6}, Lcom/google/flatbuffers/reflection/Enum;-><init>()V

    goto :goto_2

    :cond_2
    move-object v6, p0

    :goto_2
    invoke-virtual {v6, v4, p3}, Lcom/google/flatbuffers/reflection/Enum;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object v6

    return-object v6

    .line 123
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
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/Enum;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public static addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "attributesOffset"    # I

    .line 87
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addDeclarationFile(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "declarationFileOffset"    # I

    .line 93
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "documentationOffset"    # I

    .line 90
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addIsUnion(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "isUnion"    # Z

    .line 85
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addBoolean(IZZ)V

    return-void
.end method

.method public static addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I

    .line 81
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    return-void
.end method

.method public static addUnderlyingType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "underlyingTypeOffset"    # I

    .line 86
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addValues(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "valuesOffset"    # I

    .line 82
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static createAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 88
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

    .line 91
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

.method public static createEnum(Lcom/google/flatbuffers/FlatBufferBuilder;IIZIIII)I
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I
    .param p2, "valuesOffset"    # I
    .param p3, "isUnion"    # Z
    .param p4, "underlyingTypeOffset"    # I
    .param p5, "attributesOffset"    # I
    .param p6, "documentationOffset"    # I
    .param p7, "declarationFileOffset"    # I

    .line 69
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 70
    invoke-static {p0, p7}, Lcom/google/flatbuffers/reflection/Enum;->addDeclarationFile(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 71
    invoke-static {p0, p6}, Lcom/google/flatbuffers/reflection/Enum;->addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 72
    invoke-static {p0, p5}, Lcom/google/flatbuffers/reflection/Enum;->addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 73
    invoke-static {p0, p4}, Lcom/google/flatbuffers/reflection/Enum;->addUnderlyingType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 74
    invoke-static {p0, p2}, Lcom/google/flatbuffers/reflection/Enum;->addValues(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 75
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/Enum;->addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 76
    invoke-static {p0, p3}, Lcom/google/flatbuffers/reflection/Enum;->addIsUnion(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V

    .line 77
    invoke-static {p0}, Lcom/google/flatbuffers/reflection/Enum;->endEnum(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method public static createValuesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 83
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

.method public static endEnum(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 95
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 96
    .local v0, "o":I
    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 97
    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 98
    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 99
    return v0
.end method

.method public static getRootAsEnum(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;
    .locals 1
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;

    .line 25
    new-instance v0, Lcom/google/flatbuffers/reflection/Enum;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Enum;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->getRootAsEnum(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Enum;)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object v0

    return-object v0
.end method

.method public static getRootAsEnum(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Enum;)Lcom/google/flatbuffers/reflection/Enum;
    .locals 2
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Enum;

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

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/Enum;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object v0

    return-object v0
.end method

.method public static startAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 89
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startDocumentationVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 92
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startEnum(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 80
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method

.method public static startValuesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 84
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Enum;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Enum;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public attributes(I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 1
    .param p1, "j"    # I

    .line 43
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Enum;->attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;
    .param p2, "j"    # I

    .line 44
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

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

    .line 47
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

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

    .line 46
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public attributesLength()I
    .locals 2

    .line 45
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public attributesVector()Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 1

    .line 48
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v0

    return-object v0
.end method

.method public attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    .line 49
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public declarationFile()Ljava/lang/String;
    .locals 2

    .line 57
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Enum;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public declarationFileAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 58
    const/16 v0, 0x10

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public declarationFileInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 59
    const/16 v0, 0x10

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public documentation(I)Ljava/lang/String;
    .locals 3
    .param p1, "j"    # I

    .line 50
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p1, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public documentationLength()I
    .locals 2

    .line 51
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public documentationVector()Lcom/google/flatbuffers/StringVector;
    .locals 1

    .line 52
    new-instance v0, Lcom/google/flatbuffers/StringVector;

    invoke-direct {v0}, Lcom/google/flatbuffers/StringVector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;

    move-result-object v0

    return-object v0
.end method

.method public documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/StringVector;

    .line 53
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/StringVector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/StringVector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public isUnion()Z
    .locals 4

    .line 40
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/google/flatbuffers/reflection/Enum;->bb_pos:I

    add-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method protected keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I
    .locals 3
    .param p1, "o1"    # Ljava/lang/Integer;
    .param p2, "o2"    # Ljava/lang/Integer;
    .param p3, "_bb"    # Ljava/nio/ByteBuffer;

    .line 103
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {v1, v0, p3}, Lcom/google/flatbuffers/reflection/Enum;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2, p3}, Lcom/google/flatbuffers/reflection/Enum;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v1

    invoke-static {v0, v1, p3}, Lcom/google/flatbuffers/reflection/Enum;->compareStrings(IILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public name()Ljava/lang/String;
    .locals 2

    .line 30
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Enum;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__string(I)Ljava/lang/String;

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

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public nameInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 32
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public underlyingType()Lcom/google/flatbuffers/reflection/Type;
    .locals 1

    .line 41
    new-instance v0, Lcom/google/flatbuffers/reflection/Type;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Type;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->underlyingType(Lcom/google/flatbuffers/reflection/Type;)Lcom/google/flatbuffers/reflection/Type;

    move-result-object v0

    return-object v0
.end method

.method public underlyingType(Lcom/google/flatbuffers/reflection/Type;)Lcom/google/flatbuffers/reflection/Type;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Type;

    .line 42
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Enum;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/Type;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Type;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public values(I)Lcom/google/flatbuffers/reflection/EnumVal;
    .locals 1
    .param p1, "j"    # I

    .line 33
    new-instance v0, Lcom/google/flatbuffers/reflection/EnumVal;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/EnumVal;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Enum;->values(Lcom/google/flatbuffers/reflection/EnumVal;I)Lcom/google/flatbuffers/reflection/EnumVal;

    move-result-object v0

    return-object v0
.end method

.method public values(Lcom/google/flatbuffers/reflection/EnumVal;I)Lcom/google/flatbuffers/reflection/EnumVal;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/EnumVal;
    .param p2, "j"    # I

    .line 34
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Enum;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/EnumVal;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/EnumVal;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public valuesByKey(J)Lcom/google/flatbuffers/reflection/EnumVal;
    .locals 4
    .param p1, "key"    # J

    .line 36
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, p2, v3}, Lcom/google/flatbuffers/reflection/EnumVal;->__lookup_by_key(Lcom/google/flatbuffers/reflection/EnumVal;IJLjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/EnumVal;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public valuesByKey(Lcom/google/flatbuffers/reflection/EnumVal;J)Lcom/google/flatbuffers/reflection/EnumVal;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/EnumVal;
    .param p2, "key"    # J

    .line 37
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v1, p2, p3, v2}, Lcom/google/flatbuffers/reflection/EnumVal;->__lookup_by_key(Lcom/google/flatbuffers/reflection/EnumVal;IJLjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/EnumVal;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public valuesLength()I
    .locals 2

    .line 35
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public valuesVector()Lcom/google/flatbuffers/reflection/EnumVal$Vector;
    .locals 1

    .line 38
    new-instance v0, Lcom/google/flatbuffers/reflection/EnumVal$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/EnumVal$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->valuesVector(Lcom/google/flatbuffers/reflection/EnumVal$Vector;)Lcom/google/flatbuffers/reflection/EnumVal$Vector;

    move-result-object v0

    return-object v0
.end method

.method public valuesVector(Lcom/google/flatbuffers/reflection/EnumVal$Vector;)Lcom/google/flatbuffers/reflection/EnumVal$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/EnumVal$Vector;

    .line 39
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Enum;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Enum;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/reflection/EnumVal$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/EnumVal$Vector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method
