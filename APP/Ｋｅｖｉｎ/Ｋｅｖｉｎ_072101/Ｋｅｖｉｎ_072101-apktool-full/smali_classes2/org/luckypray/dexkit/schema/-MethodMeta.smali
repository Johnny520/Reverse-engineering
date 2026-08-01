.class public final Lorg/luckypray/dexkit/schema/-MethodMeta;
.super Lcom/google/flatbuffers/Table;
.source "MethodMeta.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0000\u0018\u0000 22\u00020\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000eJ\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eJ\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008$\u0010%J\u0018\u0010&\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010%J\u0018\u0010(\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010%J\u0018\u0010*\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010%J\u0016\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u0018J\u0018\u0010/\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u0010%J\u000e\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0018J\u000e\u00101\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\u00020\u00048F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00048F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00048F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0006R\u0017\u0010\u001a\u001a\u00020\u00048F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00063"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-MethodMeta;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "accessFlags",
        "Lkotlin/UInt;",
        "getAccessFlags-pVg5ArA",
        "()I",
        "classId",
        "getClassId-pVg5ArA",
        "dexDescriptor",
        "",
        "getDexDescriptor",
        "()Ljava/lang/String;",
        "dexDescriptorAsByteBuffer",
        "Ljava/nio/ByteBuffer;",
        "getDexDescriptorAsByteBuffer",
        "()Ljava/nio/ByteBuffer;",
        "dexId",
        "getDexId-pVg5ArA",
        "id",
        "getId-pVg5ArA",
        "parameterTypesAsByteBuffer",
        "getParameterTypesAsByteBuffer",
        "parameterTypesLength",
        "",
        "getParameterTypesLength",
        "returnType",
        "getReturnType-pVg5ArA",
        "__assign",
        "_i",
        "_bb",
        "__init",
        "",
        "dexDescriptorInByteBuffer",
        "mutateAccessFlags",
        "",
        "mutateAccessFlags-WZ4Q5Ns",
        "(I)Z",
        "mutateClassId",
        "mutateClassId-WZ4Q5Ns",
        "mutateDexId",
        "mutateDexId-WZ4Q5Ns",
        "mutateId",
        "mutateId-WZ4Q5Ns",
        "mutateParameterTypes",
        "j",
        "parameterTypes",
        "mutateReturnType",
        "mutateReturnType-WZ4Q5Ns",
        "parameterTypesInByteBuffer",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-MethodMeta;->Companion:Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMeta;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final dexDescriptorInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    const/16 v0, 0xc

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 12, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getAccessFlags-pVg5ArA()I
    .locals 3

    .line 75
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 76
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getClassId-pVg5ArA()I
    .locals 3

    .line 61
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 62
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getDexDescriptor()Ljava/lang/String;
    .locals 2

    .line 89
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 90
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 91
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 93
    :cond_0
    const/4 v1, 0x0

    .line 90
    :goto_0
    return-object v1
.end method

.method public final getDexDescriptorAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 96
    const/16 v0, 0xc

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(12, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getDexId-pVg5ArA()I
    .locals 3

    .line 47
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 48
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getId-pVg5ArA()I
    .locals 3

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getParameterTypesAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 124
    const/16 v0, 0x10

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(16, 4)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getParameterTypesLength()I
    .locals 2

    .line 122
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getReturnType-pVg5ArA()I
    .locals 3

    .line 100
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 101
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final mutateAccessFlags-WZ4Q5Ns(I)Z
    .locals 3
    .param p1, "accessFlags"    # I

    .line 79
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 80
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 81
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 82
    const/4 v1, 0x1

    goto :goto_0

    .line 84
    :cond_0
    const/4 v1, 0x0

    .line 80
    :goto_0
    return v1
.end method

.method public final mutateClassId-WZ4Q5Ns(I)Z
    .locals 3
    .param p1, "classId"    # I

    .line 65
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 66
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 67
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 68
    const/4 v1, 0x1

    goto :goto_0

    .line 70
    :cond_0
    const/4 v1, 0x0

    .line 66
    :goto_0
    return v1
.end method

.method public final mutateDexId-WZ4Q5Ns(I)Z
    .locals 3
    .param p1, "dexId"    # I

    .line 51
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 52
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 53
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 54
    const/4 v1, 0x1

    goto :goto_0

    .line 56
    :cond_0
    const/4 v1, 0x0

    .line 52
    :goto_0
    return v1
.end method

.method public final mutateId-WZ4Q5Ns(I)Z
    .locals 3
    .param p1, "id"    # I

    .line 37
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 38
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 39
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 40
    const/4 v1, 0x1

    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 38
    :goto_0
    return v1
.end method

.method public final mutateParameterTypes(II)Z
    .locals 4
    .param p1, "j"    # I
    .param p2, "parameterTypes"    # I

    .line 127
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 128
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 129
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x4

    add-int/2addr v2, v3

    invoke-virtual {v1, v2, p2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 130
    const/4 v1, 0x1

    goto :goto_0

    .line 132
    :cond_0
    const/4 v1, 0x0

    .line 128
    :goto_0
    return v1
.end method

.method public final mutateReturnType-WZ4Q5Ns(I)Z
    .locals 3
    .param p1, "returnType"    # I

    .line 104
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 105
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 106
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 107
    const/4 v1, 0x1

    goto :goto_0

    .line 109
    :cond_0
    const/4 v1, 0x0

    .line 105
    :goto_0
    return v1
.end method

.method public final parameterTypes(I)I
    .locals 4
    .param p1, "j"    # I

    .line 113
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__offset(I)I

    move-result v0

    .line 114
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 115
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMeta;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x4

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    goto :goto_0

    .line 117
    :cond_0
    const/4 v1, 0x0

    .line 114
    :goto_0
    return v1
.end method

.method public final parameterTypesInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    const/16 v0, 0x10

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 16, 4)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
