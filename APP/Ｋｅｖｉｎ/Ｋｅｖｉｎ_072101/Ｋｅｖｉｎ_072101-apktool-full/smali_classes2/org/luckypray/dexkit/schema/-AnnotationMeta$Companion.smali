.class public final Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;
.super Ljava/lang/Object;
.source "AnnotationMeta.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-AnnotationMeta;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u0005\n\u0002\u0008\u0007\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\rJ \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\nJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J@\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\r\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\rJ\u0006\u0010\'\u001a\u00020\u0004\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006("
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;",
        "",
        "()V",
        "addDexId",
        "",
        "builder",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "dexId",
        "Lkotlin/UInt;",
        "addDexId-Qn1smSk",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V",
        "addElements",
        "elements",
        "",
        "addTypeDescriptor",
        "typeDescriptor",
        "addTypeId",
        "typeId",
        "addTypeId-Qn1smSk",
        "addVisibility",
        "visibility",
        "",
        "createAnnotationMeta",
        "typeDescriptorOffset",
        "elementsOffset",
        "createAnnotationMeta-d0p9NHs",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIBI)I",
        "createElementsVector",
        "data",
        "",
        "endAnnotationMeta",
        "getRootAsAnnotationMeta",
        "Lorg/luckypray/dexkit/schema/-AnnotationMeta;",
        "_bb",
        "Ljava/nio/ByteBuffer;",
        "obj",
        "startAnnotationMeta",
        "startElementsVector",
        "numElems",
        "validateVersion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addDexId-Qn1smSk(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "dexId"    # I

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addInt(III)V

    return-void
.end method

.method public final addElements(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "elements"    # I

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addTypeDescriptor(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "typeDescriptor"    # I

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addTypeId-Qn1smSk(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "typeId"    # I

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addInt(III)V

    return-void
.end method

.method public final addVisibility(Lcom/google/flatbuffers/FlatBufferBuilder;B)V
    .locals 2
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "visibility"    # B

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(IBI)V

    return-void
.end method

.method public final createAnnotationMeta-d0p9NHs(Lcom/google/flatbuffers/FlatBufferBuilder;IIIBI)I
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "dexId"    # I
    .param p3, "typeId"    # I
    .param p4, "typeDescriptorOffset"    # I
    .param p5, "visibility"    # B
    .param p6, "elementsOffset"    # I

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 106
    invoke-virtual {p0, p1, p6}, Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;->addElements(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 107
    invoke-virtual {p0, p1, p4}, Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;->addTypeDescriptor(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 108
    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;->addTypeId-Qn1smSk(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 109
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;->addDexId-Qn1smSk(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 110
    invoke-virtual {p0, p1, p5}, Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;->addVisibility(Lcom/google/flatbuffers/FlatBufferBuilder;B)V

    .line 111
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;->endAnnotationMeta(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method public final createElementsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "data"    # [I

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    const/4 v0, 0x4

    array-length v1, p2

    invoke-virtual {p1, v0, v1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 121
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    .local v0, "i":I
    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    .line 122
    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    .line 121
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 124
    .end local v0    # "i":I
    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result v0

    return v0
.end method

.method public final endAnnotationMeta(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 129
    .local v0, "o":I
    return v0
.end method

.method public final getRootAsAnnotationMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMeta;
    .locals 1
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;->getRootAsAnnotationMeta(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v0

    return-object v0
.end method

.method public final getRootAsAnnotationMeta(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/schema/-AnnotationMeta;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;
    .param p2, "obj"    # Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "obj"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 102
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v0

    return-object v0
.end method

.method public final startAnnotationMeta(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method

.method public final startElementsVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "numElems"    # I

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public final validateVersion()V
    .locals 0

    .line 98
    invoke-static {}, Lcom/google/flatbuffers/Constants;->FLATBUFFERS_23_5_26()V

    return-void
.end method
