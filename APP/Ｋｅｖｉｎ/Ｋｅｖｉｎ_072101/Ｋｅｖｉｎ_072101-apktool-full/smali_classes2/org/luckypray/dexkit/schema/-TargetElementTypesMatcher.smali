.class public final Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;
.super Lcom/google/flatbuffers/Table;
.source "TargetElementTypesMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0008J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0008J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000cJ\u000e\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0008R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "matchType",
        "",
        "getMatchType",
        "()B",
        "typesAsByteBuffer",
        "Ljava/nio/ByteBuffer;",
        "getTypesAsByteBuffer",
        "()Ljava/nio/ByteBuffer;",
        "typesLength",
        "",
        "getTypesLength",
        "()I",
        "__assign",
        "_i",
        "_bb",
        "__init",
        "",
        "mutateMatchType",
        "",
        "mutateTypes",
        "j",
        "types",
        "typesInByteBuffer",
        "Companion",
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


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->Companion:Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__init(ILjava/nio/ByteBuffer;)V

    .line 29
    return-object p0
.end method

.method public final __init(ILjava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final getMatchType()B
    .locals 3

    .line 56
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__offset(I)I

    move-result v0

    .line 57
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getTypesAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 43
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(4, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getTypesLength()I
    .locals 2

    .line 41
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final mutateMatchType(B)Z
    .locals 3
    .param p1, "matchType"    # B

    .line 60
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__offset(I)I

    move-result v0

    .line 61
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 62
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 63
    const/4 v1, 0x1

    goto :goto_0

    .line 65
    :cond_0
    const/4 v1, 0x0

    .line 61
    :goto_0
    return v1
.end method

.method public final mutateTypes(IB)Z
    .locals 4
    .param p1, "j"    # I
    .param p2, "types"    # B

    .line 46
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__offset(I)I

    move-result v0

    .line 47
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 48
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v1, v2, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 49
    const/4 v1, 0x1

    goto :goto_0

    .line 51
    :cond_0
    const/4 v1, 0x0

    .line 47
    :goto_0
    return v1
.end method

.method public final types(I)B
    .locals 4
    .param p1, "j"    # I

    .line 32
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__offset(I)I

    move-result v0

    .line 33
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 34
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 33
    :goto_0
    return v1
.end method

.method public final typesInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 4, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
