.class public final Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;
.super Lcom/google/flatbuffers/Table;
.source "AnnotationElementMeta.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-AnnotationElementMeta$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0008J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0008J\u000e\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0008J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0016\u001a\u00020\u000cR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0018"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "name",
        "",
        "getName",
        "()Ljava/lang/String;",
        "nameAsByteBuffer",
        "Ljava/nio/ByteBuffer;",
        "getNameAsByteBuffer",
        "()Ljava/nio/ByteBuffer;",
        "value",
        "Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;",
        "getValue",
        "()Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;",
        "__assign",
        "_i",
        "",
        "_bb",
        "__init",
        "",
        "nameInByteBuffer",
        "obj",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-AnnotationElementMeta$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationElementMeta$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 35
    iget v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    return-object v1
.end method

.method public final getNameAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 40
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(4, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getValue()Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;
    .locals 1

    .line 42
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->value(Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    move-result-object v0

    return-object v0
.end method

.method public final nameInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 4, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final value(Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->__offset(I)I

    move-result v0

    .line 45
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 46
    iget v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    move-result-object v1

    goto :goto_0

    .line 48
    :cond_0
    const/4 v1, 0x0

    .line 45
    :goto_0
    return-object v1
.end method
