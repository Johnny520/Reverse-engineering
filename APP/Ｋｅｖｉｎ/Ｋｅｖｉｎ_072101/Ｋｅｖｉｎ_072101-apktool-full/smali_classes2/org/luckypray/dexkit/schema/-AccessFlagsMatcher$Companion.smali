.class public final Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;
.super Ljava/lang/Object;
.source "AccessFlagsMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\rJ(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\r\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0004\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001a"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;",
        "",
        "()V",
        "addFlags",
        "",
        "builder",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "flags",
        "Lkotlin/UInt;",
        "addFlags-Qn1smSk",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V",
        "addMatchType",
        "matchType",
        "",
        "createAccessFlagsMatcher",
        "",
        "createAccessFlagsMatcher-OsBMiQA",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I",
        "endAccessFlagsMatcher",
        "getRootAsAccessFlagsMatcher",
        "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;",
        "_bb",
        "Ljava/nio/ByteBuffer;",
        "obj",
        "startAccessFlagsMatcher",
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

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addFlags-Qn1smSk(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "flags"    # I

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addInt(III)V

    return-void
.end method

.method public final addMatchType(Lcom/google/flatbuffers/FlatBufferBuilder;B)V
    .locals 2
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "matchType"    # B

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(IBI)V

    return-void
.end method

.method public final createAccessFlagsMatcher-OsBMiQA(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .param p2, "flags"    # I
    .param p3, "matchType"    # B

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    .line 68
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;->addFlags-Qn1smSk(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 69
    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;->addMatchType(Lcom/google/flatbuffers/FlatBufferBuilder;B)V

    .line 70
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;->endAccessFlagsMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method public final endAccessFlagsMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result v0

    .line 77
    .local v0, "o":I
    return v0
.end method

.method public final getRootAsAccessFlagsMatcher(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
    .locals 1
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    new-instance v0, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;->getRootAsAccessFlagsMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getRootAsAccessFlagsMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;
    .param p2, "obj"    # Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "obj"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 64
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final startAccessFlagsMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p1, "builder"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method

.method public final validateVersion()V
    .locals 0

    .line 60
    invoke-static {}, Lcom/google/flatbuffers/Constants;->FLATBUFFERS_23_5_26()V

    return-void
.end method
