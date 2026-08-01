.class public final Lcom/google/flatbuffers/reflection/Field;
.super Lcom/google/flatbuffers/Table;
.source "Field.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/Field$Vector;
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

.method public static __lookup_by_key(Lcom/google/flatbuffers/reflection/Field;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Field;
    .locals 7
    .param p0, "obj"    # Lcom/google/flatbuffers/reflection/Field;
    .param p1, "vectorLocation"    # I
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "bb"    # Ljava/nio/ByteBuffer;

    .line 126
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 127
    .local v0, "byteKey":[B
    add-int/lit8 v1, p1, -0x4

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    .line 128
    .local v1, "span":I
    const/4 v2, 0x0

    .line 129
    .local v2, "start":I
    :goto_0
    if-eqz v1, :cond_3

    .line 130
    div-int/lit8 v3, v1, 0x2

    .line 131
    .local v3, "middle":I
    add-int v4, v2, v3

    const/4 v5, 0x4

    mul-int/2addr v4, v5

    add-int/2addr v4, p1

    invoke-static {v4, p3}, Lcom/google/flatbuffers/reflection/Field;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v4

    .line 132
    .local v4, "tableOffset":I
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v6

    sub-int/2addr v6, v4

    invoke-static {v5, v6, p3}, Lcom/google/flatbuffers/reflection/Field;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v5

    invoke-static {v5, v0, p3}, Lcom/google/flatbuffers/reflection/Field;->compareStrings(I[BLjava/nio/ByteBuffer;)I

    move-result v5

    .line 133
    .local v5, "comp":I
    if-lez v5, :cond_0

    .line 134
    move v1, v3

    goto :goto_1

    .line 135
    :cond_0
    if-gez v5, :cond_1

    .line 136
    add-int/lit8 v3, v3, 0x1

    .line 137
    add-int/2addr v2, v3

    .line 138
    sub-int/2addr v1, v3

    .line 142
    .end local v3    # "middle":I
    .end local v4    # "tableOffset":I
    .end local v5    # "comp":I
    :goto_1
    goto :goto_0

    .line 140
    .restart local v3    # "middle":I
    .restart local v4    # "tableOffset":I
    .restart local v5    # "comp":I
    :cond_1
    if-nez p0, :cond_2

    new-instance v6, Lcom/google/flatbuffers/reflection/Field;

    invoke-direct {v6}, Lcom/google/flatbuffers/reflection/Field;-><init>()V

    goto :goto_2

    :cond_2
    move-object v6, p0

    :goto_2
    invoke-virtual {v6, v4, p3}, Lcom/google/flatbuffers/reflection/Field;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Field;

    move-result-object v6

    return-object v6

    .line 143
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
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/Field;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public static addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "attributesOffset"    # I

    .line 106
    const/16 v0, 0x9

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addDefaultInteger(Lcom/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "defaultInteger"    # J

    .line 101
    const/4 v1, 0x4

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addDefaultReal(Lcom/google/flatbuffers/FlatBufferBuilder;D)V
    .locals 6
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "defaultReal"    # D

    .line 102
    const/4 v1, 0x5

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/flatbuffers/FlatBufferBuilder;->addDouble(IDD)V

    return-void
.end method

.method public static addDeprecated(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "deprecated"    # Z

    .line 103
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addBoolean(IZZ)V

    return-void
.end method

.method public static addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "documentationOffset"    # I

    .line 109
    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addId(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 3
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "id"    # I

    .line 99
    int-to-short v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addShort(ISI)V

    return-void
.end method

.method public static addKey(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "key"    # Z

    .line 105
    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addBoolean(IZZ)V

    return-void
.end method

.method public static addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I

    .line 97
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    return-void
.end method

.method public static addOffset(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 3
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "offset"    # I

    .line 100
    int-to-short v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addShort(ISI)V

    return-void
.end method

.method public static addOffset64(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "offset64"    # Z

    .line 114
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addBoolean(IZZ)V

    return-void
.end method

.method public static addOptional(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "optional"    # Z

    .line 112
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addBoolean(IZZ)V

    return-void
.end method

.method public static addPadding(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 3
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "padding"    # I

    .line 113
    int-to-short v0, p1

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addShort(ISI)V

    return-void
.end method

.method public static addRequired(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "required"    # Z

    .line 104
    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addBoolean(IZZ)V

    return-void
.end method

.method public static addType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "typeOffset"    # I

    .line 98
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static createAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 107
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

    .line 110
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

.method public static createField(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIJDZZZIIZIZ)I
    .locals 17
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "nameOffset"    # I
    .param p2, "typeOffset"    # I
    .param p3, "id"    # I
    .param p4, "offset"    # I
    .param p5, "defaultInteger"    # J
    .param p7, "defaultReal"    # D
    .param p9, "deprecated"    # Z
    .param p10, "required"    # Z
    .param p11, "key"    # Z
    .param p12, "attributesOffset"    # I
    .param p13, "documentationOffset"    # I
    .param p14, "optional"    # Z
    .param p15, "padding"    # I
    .param p16, "offset64"    # Z

    .line 78
    move-object/from16 v0, p0

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 79
    move-wide/from16 v1, p7

    invoke-static {v0, v1, v2}, Lcom/google/flatbuffers/reflection/Field;->addDefaultReal(Lcom/google/flatbuffers/FlatBufferBuilder;D)V

    .line 80
    move-wide/from16 v3, p5

    invoke-static {v0, v3, v4}, Lcom/google/flatbuffers/reflection/Field;->addDefaultInteger(Lcom/google/flatbuffers/FlatBufferBuilder;J)V

    .line 81
    move/from16 v5, p13

    invoke-static {v0, v5}, Lcom/google/flatbuffers/reflection/Field;->addDocumentation(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 82
    move/from16 v6, p12

    invoke-static {v0, v6}, Lcom/google/flatbuffers/reflection/Field;->addAttributes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 83
    move/from16 v7, p2

    invoke-static {v0, v7}, Lcom/google/flatbuffers/reflection/Field;->addType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 84
    invoke-static/range {p0 .. p1}, Lcom/google/flatbuffers/reflection/Field;->addName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 85
    move/from16 v8, p15

    invoke-static {v0, v8}, Lcom/google/flatbuffers/reflection/Field;->addPadding(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 86
    move/from16 v9, p4

    invoke-static {v0, v9}, Lcom/google/flatbuffers/reflection/Field;->addOffset(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 87
    move/from16 v10, p3

    invoke-static {v0, v10}, Lcom/google/flatbuffers/reflection/Field;->addId(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 88
    move/from16 v11, p16

    invoke-static {v0, v11}, Lcom/google/flatbuffers/reflection/Field;->addOffset64(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V

    .line 89
    move/from16 v12, p14

    invoke-static {v0, v12}, Lcom/google/flatbuffers/reflection/Field;->addOptional(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V

    .line 90
    move/from16 v13, p11

    invoke-static {v0, v13}, Lcom/google/flatbuffers/reflection/Field;->addKey(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V

    .line 91
    move/from16 v14, p10

    invoke-static {v0, v14}, Lcom/google/flatbuffers/reflection/Field;->addRequired(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V

    .line 92
    move/from16 v15, p9

    invoke-static {v0, v15}, Lcom/google/flatbuffers/reflection/Field;->addDeprecated(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V

    .line 93
    invoke-static/range {p0 .. p0}, Lcom/google/flatbuffers/reflection/Field;->endField(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v16

    return v16
.end method

.method public static endField(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 116
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 117
    .local v0, "o":I
    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 118
    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 119
    return v0
.end method

.method public static getRootAsField(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Field;
    .locals 1
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;

    .line 25
    new-instance v0, Lcom/google/flatbuffers/reflection/Field;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Field;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->getRootAsField(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Field;)Lcom/google/flatbuffers/reflection/Field;

    move-result-object v0

    return-object v0
.end method

.method public static getRootAsField(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Field;)Lcom/google/flatbuffers/reflection/Field;
    .locals 2
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Field;

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

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/Field;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Field;

    move-result-object v0

    return-object v0
.end method

.method public static startAttributesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 108
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startDocumentationVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 111
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startField(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 96
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Field;
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Field;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Field;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public attributes(I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 1
    .param p1, "j"    # I

    .line 42
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Field;->attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public attributes(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;
    .param p2, "j"    # I

    .line 43
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Field;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

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

    .line 46
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

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

    .line 45
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public attributesLength()I
    .locals 2

    .line 44
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public attributesVector()Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 1

    .line 47
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v0

    return-object v0
.end method

.method public attributesVector(Lcom/google/flatbuffers/reflection/KeyValue$Vector;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    .line 48
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public defaultInteger()J
    .locals 3

    .line 37
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method

.method public defaultReal()D
    .locals 3

    .line 38
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getDouble(I)D

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method

.method public deprecated()Z
    .locals 4

    .line 39
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public documentation(I)Ljava/lang/String;
    .locals 3
    .param p1, "j"    # I

    .line 49
    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p1, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Field;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public documentationLength()I
    .locals 2

    .line 50
    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public documentationVector()Lcom/google/flatbuffers/StringVector;
    .locals 1

    .line 51
    new-instance v0, Lcom/google/flatbuffers/StringVector;

    invoke-direct {v0}, Lcom/google/flatbuffers/StringVector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;

    move-result-object v0

    return-object v0
.end method

.method public documentationVector(Lcom/google/flatbuffers/StringVector;)Lcom/google/flatbuffers/StringVector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/StringVector;

    .line 52
    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/StringVector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/StringVector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public id()I
    .locals 3

    .line 35
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public key()Z
    .locals 4

    .line 41
    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

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

    .line 123
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {v1, v0, p3}, Lcom/google/flatbuffers/reflection/Field;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2, p3}, Lcom/google/flatbuffers/reflection/Field;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v1

    invoke-static {v0, v1, p3}, Lcom/google/flatbuffers/reflection/Field;->compareStrings(IILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public name()Ljava/lang/String;
    .locals 2

    .line 30
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Field;->__string(I)Ljava/lang/String;

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

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/Field;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public nameInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 32
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/Field;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public offset()I
    .locals 3

    .line 36
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public offset64()Z
    .locals 4

    .line 61
    const/16 v0, 0x1e

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public optional()Z
    .locals 4

    .line 53
    const/16 v0, 0x1a

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public padding()I
    .locals 3

    .line 57
    const/16 v0, 0x1c

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public required()Z
    .locals 4

    .line 40
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public type()Lcom/google/flatbuffers/reflection/Type;
    .locals 1

    .line 33
    new-instance v0, Lcom/google/flatbuffers/reflection/Type;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Type;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->type(Lcom/google/flatbuffers/reflection/Type;)Lcom/google/flatbuffers/reflection/Type;

    move-result-object v0

    return-object v0
.end method

.method public type(Lcom/google/flatbuffers/reflection/Type;)Lcom/google/flatbuffers/reflection/Type;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Type;

    .line 34
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Field;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Field;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Field;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Field;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/Type;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Type;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method
