.class public final Lcom/google/flatbuffers/reflection/Schema;
.super Lcom/google/flatbuffers/Table;
.source "Schema.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/Schema$Vector;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static SchemaBufferHasIdentifier(Ljava/nio/ByteBuffer;)Z
    .locals 1
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;

    .line 27
    const-string v0, "BFBS"

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__has_identifier(Ljava/nio/ByteBuffer;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static ValidateVersion()V
    .locals 0

    .line 24
    invoke-static {}, Lcom/google/flatbuffers/Constants;->FLATBUFFERS_23_5_26()V

    return-void
.end method

.method static synthetic access$000(ILjava/nio/ByteBuffer;)I
    .locals 1
    .param p0, "x0"    # I
    .param p1, "x1"    # Ljava/nio/ByteBuffer;

    .line 23
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/Schema;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public static addAdvancedFeatures(Lcom/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "advancedFeatures"    # J

    .line 107
    const/4 v1, 0x6

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addEnums(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "enumsOffset"    # I

    .line 98
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addFbsFiles(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "fbsFilesOffset"    # I

    .line 108
    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addFileExt(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "fileExtOffset"    # I

    .line 102
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addFileIdent(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "fileIdentOffset"    # I

    .line 101
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addObjects(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "objectsOffset"    # I

    .line 95
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addRootTable(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "rootTableOffset"    # I

    .line 103
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addServices(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "servicesOffset"    # I

    .line 104
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static createEnumsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 99
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

.method public static createFbsFilesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 109
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

.method public static createObjectsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 96
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

.method public static createSchema(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIJI)I
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "objectsOffset"    # I
    .param p2, "enumsOffset"    # I
    .param p3, "fileIdentOffset"    # I
    .param p4, "fileExtOffset"    # I
    .param p5, "rootTableOffset"    # I
    .param p6, "servicesOffset"    # I
    .param p7, "advancedFeatures"    # J
    .param p9, "fbsFilesOffset"    # I

    .line 82
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 83
    invoke-static {p0, p7, p8}, Lcom/google/flatbuffers/reflection/Schema;->addAdvancedFeatures(Lcom/google/flatbuffers/FlatBufferBuilder;J)V

    .line 84
    invoke-static {p0, p9}, Lcom/google/flatbuffers/reflection/Schema;->addFbsFiles(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 85
    invoke-static {p0, p6}, Lcom/google/flatbuffers/reflection/Schema;->addServices(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 86
    invoke-static {p0, p5}, Lcom/google/flatbuffers/reflection/Schema;->addRootTable(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 87
    invoke-static {p0, p4}, Lcom/google/flatbuffers/reflection/Schema;->addFileExt(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 88
    invoke-static {p0, p3}, Lcom/google/flatbuffers/reflection/Schema;->addFileIdent(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 89
    invoke-static {p0, p2}, Lcom/google/flatbuffers/reflection/Schema;->addEnums(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 90
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/Schema;->addObjects(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 91
    invoke-static {p0}, Lcom/google/flatbuffers/reflection/Schema;->endSchema(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method public static createServicesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "data"    # [I

    .line 105
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

.method public static endSchema(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 112
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 113
    .local v0, "o":I
    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 114
    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 115
    return v0
.end method

.method public static finishSchemaBuffer(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "offset"    # I

    .line 117
    const-string v0, "BFBS"

    invoke-virtual {p0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(ILjava/lang/String;)V

    return-void
.end method

.method public static finishSizePrefixedSchemaBuffer(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "offset"    # I

    .line 118
    const-string v0, "BFBS"

    invoke-virtual {p0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finishSizePrefixed(ILjava/lang/String;)V

    return-void
.end method

.method public static getRootAsSchema(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Schema;
    .locals 1
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;

    .line 25
    new-instance v0, Lcom/google/flatbuffers/reflection/Schema;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Schema;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->getRootAsSchema(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Schema;)Lcom/google/flatbuffers/reflection/Schema;

    move-result-object v0

    return-object v0
.end method

.method public static getRootAsSchema(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Schema;)Lcom/google/flatbuffers/reflection/Schema;
    .locals 2
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Schema;

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

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/Schema;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Schema;

    move-result-object v0

    return-object v0
.end method

.method public static startEnumsVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 100
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startFbsFilesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 110
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startObjectsVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 97
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startSchema(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 94
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method

.method public static startServicesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "numElems"    # I

    .line 106
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Schema;
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 29
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Schema;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Schema;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public advancedFeatures()J
    .locals 3

    .line 60
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method

.method public enums(I)Lcom/google/flatbuffers/reflection/Enum;
    .locals 1
    .param p1, "j"    # I

    .line 38
    new-instance v0, Lcom/google/flatbuffers/reflection/Enum;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Enum;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Schema;->enums(Lcom/google/flatbuffers/reflection/Enum;I)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object v0

    return-object v0
.end method

.method public enums(Lcom/google/flatbuffers/reflection/Enum;I)Lcom/google/flatbuffers/reflection/Enum;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Enum;
    .param p2, "j"    # I

    .line 39
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/Enum;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public enumsByKey(Lcom/google/flatbuffers/reflection/Enum;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Enum;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Enum;
    .param p2, "key"    # Ljava/lang/String;

    .line 42
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v1, p2, v2}, Lcom/google/flatbuffers/reflection/Enum;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Enum;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public enumsByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Enum;
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .line 41
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/Enum;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Enum;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public enumsLength()I
    .locals 2

    .line 40
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public enumsVector()Lcom/google/flatbuffers/reflection/Enum$Vector;
    .locals 1

    .line 43
    new-instance v0, Lcom/google/flatbuffers/reflection/Enum$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Enum$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->enumsVector(Lcom/google/flatbuffers/reflection/Enum$Vector;)Lcom/google/flatbuffers/reflection/Enum$Vector;

    move-result-object v0

    return-object v0
.end method

.method public enumsVector(Lcom/google/flatbuffers/reflection/Enum$Vector;)Lcom/google/flatbuffers/reflection/Enum$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Enum$Vector;

    .line 44
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/reflection/Enum$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum$Vector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public fbsFiles(I)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 1
    .param p1, "j"    # I

    .line 65
    new-instance v0, Lcom/google/flatbuffers/reflection/SchemaFile;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/SchemaFile;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Schema;->fbsFiles(Lcom/google/flatbuffers/reflection/SchemaFile;I)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object v0

    return-object v0
.end method

.method public fbsFiles(Lcom/google/flatbuffers/reflection/SchemaFile;I)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/SchemaFile;
    .param p2, "j"    # I

    .line 66
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/SchemaFile;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public fbsFilesByKey(Lcom/google/flatbuffers/reflection/SchemaFile;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/SchemaFile;
    .param p2, "key"    # Ljava/lang/String;

    .line 69
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v1, p2, v2}, Lcom/google/flatbuffers/reflection/SchemaFile;->__lookup_by_key(Lcom/google/flatbuffers/reflection/SchemaFile;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public fbsFilesByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .line 68
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/SchemaFile;->__lookup_by_key(Lcom/google/flatbuffers/reflection/SchemaFile;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public fbsFilesLength()I
    .locals 2

    .line 67
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public fbsFilesVector()Lcom/google/flatbuffers/reflection/SchemaFile$Vector;
    .locals 1

    .line 70
    new-instance v0, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->fbsFilesVector(Lcom/google/flatbuffers/reflection/SchemaFile$Vector;)Lcom/google/flatbuffers/reflection/SchemaFile$Vector;

    move-result-object v0

    return-object v0
.end method

.method public fbsFilesVector(Lcom/google/flatbuffers/reflection/SchemaFile$Vector;)Lcom/google/flatbuffers/reflection/SchemaFile$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/SchemaFile$Vector;

    .line 71
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile$Vector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public fileExt()Ljava/lang/String;
    .locals 2

    .line 48
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Schema;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public fileExtAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 49
    const/16 v0, 0xa

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public fileExtInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 50
    const/16 v0, 0xa

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public fileIdent()Ljava/lang/String;
    .locals 2

    .line 45
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Schema;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public fileIdentAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 46
    const/16 v0, 0x8

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public fileIdentInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 47
    const/16 v0, 0x8

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public objects(I)Lcom/google/flatbuffers/reflection/Object;
    .locals 1
    .param p1, "j"    # I

    .line 31
    new-instance v0, Lcom/google/flatbuffers/reflection/Object;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Schema;->objects(Lcom/google/flatbuffers/reflection/Object;I)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v0

    return-object v0
.end method

.method public objects(Lcom/google/flatbuffers/reflection/Object;I)Lcom/google/flatbuffers/reflection/Object;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Object;
    .param p2, "j"    # I

    .line 32
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/Object;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public objectsByKey(Lcom/google/flatbuffers/reflection/Object;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Object;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Object;
    .param p2, "key"    # Ljava/lang/String;

    .line 35
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v1, p2, v2}, Lcom/google/flatbuffers/reflection/Object;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Object;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public objectsByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Object;
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .line 34
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/Object;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Object;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public objectsLength()I
    .locals 2

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public objectsVector()Lcom/google/flatbuffers/reflection/Object$Vector;
    .locals 1

    .line 36
    new-instance v0, Lcom/google/flatbuffers/reflection/Object$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->objectsVector(Lcom/google/flatbuffers/reflection/Object$Vector;)Lcom/google/flatbuffers/reflection/Object$Vector;

    move-result-object v0

    return-object v0
.end method

.method public objectsVector(Lcom/google/flatbuffers/reflection/Object$Vector;)Lcom/google/flatbuffers/reflection/Object$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Object$Vector;

    .line 37
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v1

    .local v1, "o":I
    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v2, v0, v3}, Lcom/google/flatbuffers/reflection/Object$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object$Vector;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public rootTable()Lcom/google/flatbuffers/reflection/Object;
    .locals 1

    .line 51
    new-instance v0, Lcom/google/flatbuffers/reflection/Object;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->rootTable(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v0

    return-object v0
.end method

.method public rootTable(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Object;

    .line 52
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/Schema;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/Object;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public services(I)Lcom/google/flatbuffers/reflection/Service;
    .locals 1
    .param p1, "j"    # I

    .line 53
    new-instance v0, Lcom/google/flatbuffers/reflection/Service;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Service;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Schema;->services(Lcom/google/flatbuffers/reflection/Service;I)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v0

    return-object v0
.end method

.method public services(Lcom/google/flatbuffers/reflection/Service;I)Lcom/google/flatbuffers/reflection/Service;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Service;
    .param p2, "j"    # I

    .line 54
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/reflection/Service;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public servicesByKey(Lcom/google/flatbuffers/reflection/Service;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Service;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Service;
    .param p2, "key"    # Ljava/lang/String;

    .line 57
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v1, p2, v2}, Lcom/google/flatbuffers/reflection/Service;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Service;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public servicesByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Service;
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .line 56
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p1, v3}, Lcom/google/flatbuffers/reflection/Service;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Service;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public servicesLength()I
    .locals 2

    .line 55
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public servicesVector()Lcom/google/flatbuffers/reflection/Service$Vector;
    .locals 1

    .line 58
    new-instance v0, Lcom/google/flatbuffers/reflection/Service$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Service$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->servicesVector(Lcom/google/flatbuffers/reflection/Service$Vector;)Lcom/google/flatbuffers/reflection/Service$Vector;

    move-result-object v0

    return-object v0
.end method

.method public servicesVector(Lcom/google/flatbuffers/reflection/Service$Vector;)Lcom/google/flatbuffers/reflection/Service$Vector;
    .locals 4
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Service$Vector;

    .line 59
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->__vector(I)I

    move-result v1

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/flatbuffers/reflection/Schema;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/flatbuffers/reflection/Service$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service$Vector;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method
