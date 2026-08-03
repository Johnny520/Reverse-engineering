.class public final Lcom/google/flatbuffers/reflection/Schema;
.super Lcom/google/flatbuffers/Table;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/Schema$Vector;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method

.method public static SchemaBufferHasIdentifier(Ljava/nio/ByteBuffer;)Z
    .locals 1

    const-string v0, "BFBS"

    invoke-static {p0, v0}, Lcom/google/flatbuffers/Table;->__has_identifier(Ljava/nio/ByteBuffer;Ljava/lang/String;)Z

    move-result p0

    return p0
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

.method public static addAdvancedFeatures(Lcom/google/flatbuffers/FlatBufferBuilder;J)V
    .locals 6

    const/4 v1, 0x6

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/flatbuffers/FlatBufferBuilder;->addLong(IJJ)V

    return-void
.end method

.method public static addEnums(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addFbsFiles(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addFileExt(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addFileIdent(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addObjects(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addRootTable(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static addServices(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static createEnumsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
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

.method public static createFbsFilesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
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

.method public static createObjectsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
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

.method public static createSchema(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIJI)I
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    invoke-static {p0, p7, p8}, Lcom/google/flatbuffers/reflection/Schema;->addAdvancedFeatures(Lcom/google/flatbuffers/FlatBufferBuilder;J)V

    invoke-static {p0, p9}, Lcom/google/flatbuffers/reflection/Schema;->addFbsFiles(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p6}, Lcom/google/flatbuffers/reflection/Schema;->addServices(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p5}, Lcom/google/flatbuffers/reflection/Schema;->addRootTable(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p4}, Lcom/google/flatbuffers/reflection/Schema;->addFileExt(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p3}, Lcom/google/flatbuffers/reflection/Schema;->addFileIdent(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p2}, Lcom/google/flatbuffers/reflection/Schema;->addEnums(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/Schema;->addObjects(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-static {p0}, Lcom/google/flatbuffers/reflection/Schema;->endSchema(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result p0

    return p0
.end method

.method public static createServicesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
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

.method public static endSchema(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    return v0
.end method

.method public static finishSchemaBuffer(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const-string v0, "BFBS"

    invoke-virtual {p0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(ILjava/lang/String;)V

    return-void
.end method

.method public static finishSizePrefixedSchemaBuffer(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const-string v0, "BFBS"

    invoke-virtual {p0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finishSizePrefixed(ILjava/lang/String;)V

    return-void
.end method

.method public static getRootAsSchema(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Schema;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Schema;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Schema;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->getRootAsSchema(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Schema;)Lcom/google/flatbuffers/reflection/Schema;

    move-result-object p0

    return-object p0
.end method

.method public static getRootAsSchema(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/Schema;)Lcom/google/flatbuffers/reflection/Schema;
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

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/Schema;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Schema;

    move-result-object p0

    return-object p0
.end method

.method public static startEnumsVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startFbsFilesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startObjectsVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public static startSchema(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method

.method public static startServicesVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Schema;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/Schema;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/Table;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public advancedFeatures()J
    .locals 3

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public enums(I)Lcom/google/flatbuffers/reflection/Enum;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Enum;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Enum;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Schema;->enums(Lcom/google/flatbuffers/reflection/Enum;I)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object p1

    return-object p1
.end method

.method public enums(Lcom/google/flatbuffers/reflection/Enum;I)Lcom/google/flatbuffers/reflection/Enum;
    .locals 1

    const/4 v0, 0x6

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

    invoke-virtual {p1, p2, v0}, Lcom/google/flatbuffers/reflection/Enum;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public enumsByKey(Lcom/google/flatbuffers/reflection/Enum;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Enum;
    .locals 2

    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, p2, v1}, Lcom/google/flatbuffers/reflection/Enum;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Enum;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public enumsByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Enum;
    .locals 3

    const/4 v0, 0x6

    .line 1
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v0, p1, v2}, Lcom/google/flatbuffers/reflection/Enum;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Enum;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public enumsLength()I
    .locals 1

    const/4 v0, 0x6

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

.method public enumsVector()Lcom/google/flatbuffers/reflection/Enum$Vector;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Enum$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Enum$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->enumsVector(Lcom/google/flatbuffers/reflection/Enum$Vector;)Lcom/google/flatbuffers/reflection/Enum$Vector;

    move-result-object v0

    return-object v0
.end method

.method public enumsVector(Lcom/google/flatbuffers/reflection/Enum$Vector;)Lcom/google/flatbuffers/reflection/Enum$Vector;
    .locals 3

    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/flatbuffers/reflection/Enum$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Enum$Vector;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public fbsFiles(I)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/SchemaFile;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/SchemaFile;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Schema;->fbsFiles(Lcom/google/flatbuffers/reflection/SchemaFile;I)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object p1

    return-object p1
.end method

.method public fbsFiles(Lcom/google/flatbuffers/reflection/SchemaFile;I)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 1

    const/16 v0, 0x12

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

    invoke-virtual {p1, p2, v0}, Lcom/google/flatbuffers/reflection/SchemaFile;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public fbsFilesByKey(Lcom/google/flatbuffers/reflection/SchemaFile;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 2

    const/16 v0, 0x12

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, p2, v1}, Lcom/google/flatbuffers/reflection/SchemaFile;->__lookup_by_key(Lcom/google/flatbuffers/reflection/SchemaFile;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public fbsFilesByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 3

    const/16 v0, 0x12

    .line 1
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v0, p1, v2}, Lcom/google/flatbuffers/reflection/SchemaFile;->__lookup_by_key(Lcom/google/flatbuffers/reflection/SchemaFile;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public fbsFilesLength()I
    .locals 1

    const/16 v0, 0x12

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

.method public fbsFilesVector()Lcom/google/flatbuffers/reflection/SchemaFile$Vector;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->fbsFilesVector(Lcom/google/flatbuffers/reflection/SchemaFile$Vector;)Lcom/google/flatbuffers/reflection/SchemaFile$Vector;

    move-result-object v0

    return-object v0
.end method

.method public fbsFilesVector(Lcom/google/flatbuffers/reflection/SchemaFile$Vector;)Lcom/google/flatbuffers/reflection/SchemaFile$Vector;
    .locals 3

    const/16 v0, 0x12

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile$Vector;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public fileExt()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xa

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

.method public fileExtAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0xa

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public fileExtInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0xa

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public fileIdent()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x8

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

.method public fileIdentAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public fileIdentInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public objects(I)Lcom/google/flatbuffers/reflection/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Object;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Schema;->objects(Lcom/google/flatbuffers/reflection/Object;I)Lcom/google/flatbuffers/reflection/Object;

    move-result-object p1

    return-object p1
.end method

.method public objects(Lcom/google/flatbuffers/reflection/Object;I)Lcom/google/flatbuffers/reflection/Object;
    .locals 2

    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v1

    mul-int/2addr p2, v0

    add-int/2addr v1, p2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, Lcom/google/flatbuffers/reflection/Object;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public objectsByKey(Lcom/google/flatbuffers/reflection/Object;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Object;
    .locals 2

    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, p2, v1}, Lcom/google/flatbuffers/reflection/Object;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Object;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public objectsByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Object;
    .locals 3

    const/4 v0, 0x4

    .line 1
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v0, p1, v2}, Lcom/google/flatbuffers/reflection/Object;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Object;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public objectsLength()I
    .locals 1

    const/4 v0, 0x4

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

.method public objectsVector()Lcom/google/flatbuffers/reflection/Object$Vector;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Object$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->objectsVector(Lcom/google/flatbuffers/reflection/Object$Vector;)Lcom/google/flatbuffers/reflection/Object$Vector;

    move-result-object v0

    return-object v0
.end method

.method public objectsVector(Lcom/google/flatbuffers/reflection/Object$Vector;)Lcom/google/flatbuffers/reflection/Object$Vector;
    .locals 3

    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1, v0, v2}, Lcom/google/flatbuffers/reflection/Object$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Object$Vector;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public rootTable()Lcom/google/flatbuffers/reflection/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Object;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->rootTable(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;

    move-result-object v0

    return-object v0
.end method

.method public rootTable(Lcom/google/flatbuffers/reflection/Object;)Lcom/google/flatbuffers/reflection/Object;
    .locals 2

    const/16 v0, 0xc

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

.method public services(I)Lcom/google/flatbuffers/reflection/Service;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Service;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Service;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Schema;->services(Lcom/google/flatbuffers/reflection/Service;I)Lcom/google/flatbuffers/reflection/Service;

    move-result-object p1

    return-object p1
.end method

.method public services(Lcom/google/flatbuffers/reflection/Service;I)Lcom/google/flatbuffers/reflection/Service;
    .locals 1

    const/16 v0, 0xe

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

    invoke-virtual {p1, p2, v0}, Lcom/google/flatbuffers/reflection/Service;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public servicesByKey(Lcom/google/flatbuffers/reflection/Service;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Service;
    .locals 2

    const/16 v0, 0xe

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, p2, v1}, Lcom/google/flatbuffers/reflection/Service;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Service;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public servicesByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Service;
    .locals 3

    const/16 v0, 0xe

    .line 1
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v1, v0, p1, v2}, Lcom/google/flatbuffers/reflection/Service;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Service;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public servicesLength()I
    .locals 1

    const/16 v0, 0xe

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

.method public servicesVector()Lcom/google/flatbuffers/reflection/Service$Vector;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Service$Vector;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Service$Vector;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/Schema;->servicesVector(Lcom/google/flatbuffers/reflection/Service$Vector;)Lcom/google/flatbuffers/reflection/Service$Vector;

    move-result-object v0

    return-object v0
.end method

.method public servicesVector(Lcom/google/flatbuffers/reflection/Service$Vector;)Lcom/google/flatbuffers/reflection/Service$Vector;
    .locals 3

    const/16 v0, 0xe

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/flatbuffers/reflection/Service$Vector;->__assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service$Vector;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
