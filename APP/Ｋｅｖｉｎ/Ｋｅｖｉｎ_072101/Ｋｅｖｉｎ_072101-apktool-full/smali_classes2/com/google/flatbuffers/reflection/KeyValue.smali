.class public final Lcom/google/flatbuffers/reflection/KeyValue;
.super Lcom/google/flatbuffers/Table;
.source "KeyValue.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/reflection/KeyValue$Vector;
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

.method public static __lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 7
    .param p0, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;
    .param p1, "vectorLocation"    # I
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "bb"    # Ljava/nio/ByteBuffer;

    .line 59
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 60
    .local v0, "byteKey":[B
    add-int/lit8 v1, p1, -0x4

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    .line 61
    .local v1, "span":I
    const/4 v2, 0x0

    .line 62
    .local v2, "start":I
    :goto_0
    if-eqz v1, :cond_3

    .line 63
    div-int/lit8 v3, v1, 0x2

    .line 64
    .local v3, "middle":I
    add-int v4, v2, v3

    const/4 v5, 0x4

    mul-int/2addr v4, v5

    add-int/2addr v4, p1

    invoke-static {v4, p3}, Lcom/google/flatbuffers/reflection/KeyValue;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v4

    .line 65
    .local v4, "tableOffset":I
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v6

    sub-int/2addr v6, v4

    invoke-static {v5, v6, p3}, Lcom/google/flatbuffers/reflection/KeyValue;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v5

    invoke-static {v5, v0, p3}, Lcom/google/flatbuffers/reflection/KeyValue;->compareStrings(I[BLjava/nio/ByteBuffer;)I

    move-result v5

    .line 66
    .local v5, "comp":I
    if-lez v5, :cond_0

    .line 67
    move v1, v3

    goto :goto_1

    .line 68
    :cond_0
    if-gez v5, :cond_1

    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    add-int/2addr v2, v3

    .line 71
    sub-int/2addr v1, v3

    .line 75
    .end local v3    # "middle":I
    .end local v4    # "tableOffset":I
    .end local v5    # "comp":I
    :goto_1
    goto :goto_0

    .line 73
    .restart local v3    # "middle":I
    .restart local v4    # "tableOffset":I
    .restart local v5    # "comp":I
    :cond_1
    if-nez p0, :cond_2

    new-instance v6, Lcom/google/flatbuffers/reflection/KeyValue;

    invoke-direct {v6}, Lcom/google/flatbuffers/reflection/KeyValue;-><init>()V

    goto :goto_2

    :cond_2
    move-object v6, p0

    :goto_2
    invoke-virtual {v6, v4, p3}, Lcom/google/flatbuffers/reflection/KeyValue;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v6

    return-object v6

    .line 76
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
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/KeyValue;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public static addKey(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "keyOffset"    # I

    .line 47
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    return-void
.end method

.method public static addValue(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "valueOffset"    # I

    .line 48
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public static createKeyValue(Lcom/google/flatbuffers/FlatBufferBuilder;II)I
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p1, "keyOffset"    # I
    .param p2, "valueOffset"    # I

    .line 40
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 41
    invoke-static {p0, p2}, Lcom/google/flatbuffers/reflection/KeyValue;->addValue(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 42
    invoke-static {p0, p1}, Lcom/google/flatbuffers/reflection/KeyValue;->addKey(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 43
    invoke-static {p0}, Lcom/google/flatbuffers/reflection/KeyValue;->endKeyValue(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method public static endKeyValue(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 50
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 51
    .local v0, "o":I
    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->required(II)V

    .line 52
    return v0
.end method

.method public static getRootAsKeyValue(Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 1
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;

    .line 25
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue;-><init>()V

    invoke-static {p0, v0}, Lcom/google/flatbuffers/reflection/KeyValue;->getRootAsKeyValue(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/KeyValue;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public static getRootAsKeyValue(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/reflection/KeyValue;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 2
    .param p0, "_bb"    # Ljava/nio/ByteBuffer;
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;

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

    invoke-virtual {p1, v0, p0}, Lcom/google/flatbuffers/reflection/KeyValue;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public static startKeyValue(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p0, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 46
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method


# virtual methods
.method public __assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/KeyValue;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public __init(ILjava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/reflection/KeyValue;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public key()Ljava/lang/String;
    .locals 2

    .line 30
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/KeyValue;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/KeyValue;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public keyAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 31
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public keyInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 32
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method protected keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I
    .locals 3
    .param p1, "o1"    # Ljava/lang/Integer;
    .param p2, "o2"    # Ljava/lang/Integer;
    .param p3, "_bb"    # Ljava/nio/ByteBuffer;

    .line 56
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {v1, v0, p3}, Lcom/google/flatbuffers/reflection/KeyValue;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2, p3}, Lcom/google/flatbuffers/reflection/KeyValue;->__offset(IILjava/nio/ByteBuffer;)I

    move-result v1

    invoke-static {v0, v1, p3}, Lcom/google/flatbuffers/reflection/KeyValue;->compareStrings(IILjava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public value()Ljava/lang/String;
    .locals 2

    .line 33
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/reflection/KeyValue;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/reflection/KeyValue;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public valueAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 34
    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public valueInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    .line 35
    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method
