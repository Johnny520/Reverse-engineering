.class public final Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;
.super Ljava/lang/Object;
.source "EncodeValueShort.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-EncodeValueShort;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0004\u00a8\u0006\u0013"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;",
        "",
        "()V",
        "addValue",
        "",
        "builder",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "value",
        "",
        "createEncodeValueShort",
        "",
        "endEncodeValueShort",
        "getRootAsEncodeValueShort",
        "Lorg/luckypray/dexkit/schema/-EncodeValueShort;",
        "_bb",
        "Ljava/nio/ByteBuffer;",
        "obj",
        "startEncodeValueShort",
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

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addValue(Lcom/google/flatbuffers/FlatBufferBuilder;S)V
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "value"    # S

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addShort(ISI)V

    return-void
.end method

.method public final createEncodeValueShort(Lcom/google/flatbuffers/FlatBufferBuilder;S)I
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "value"    # S

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 54
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;->addValue(Lcom/google/flatbuffers/FlatBufferBuilder;S)V

    .line 55
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;->endEncodeValueShort(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method public final endEncodeValueShort(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 61
    .local v0, "o":I
    return v0
.end method

.method public final getRootAsEncodeValueShort(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueShort;
    .locals 1
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;->getRootAsEncodeValueShort(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueShort;)Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    move-result-object v0

    return-object v0
.end method

.method public final getRootAsEncodeValueShort(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueShort;)Lorg/luckypray/dexkit/schema/-EncodeValueShort;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;
    .param p2, "obj"    # Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "obj"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 50
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    move-result-object v0

    return-object v0
.end method

.method public final startEncodeValueShort(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method

.method public final validateVersion()V
    .locals 0

    .line 46
    invoke-static {}, Lcom/google/flatbuffers/Constants;->FLATBUFFERS_23_5_26()V

    return-void
.end method
