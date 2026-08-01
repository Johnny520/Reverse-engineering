.class public final Lorg/luckypray/dexkit/schema/-ClassMeta;
.super Lcom/google/flatbuffers/Table;
.source "ClassMeta.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0015\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000 A2\u00020\u0001:\u0001AB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010&\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u000cJ\u0016\u0010)\u001a\u00020*2\u0006\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u000cJ\u000e\u0010+\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\u000cJ\u000e\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0014J\u000e\u0010.\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\u000cJ\u000e\u0010/\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0014J\u000e\u00100\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\u000cJ\u000e\u00101\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0014J\u000e\u00102\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\u000cJ\u0018\u00103\u001a\u0002042\u0006\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u00085\u00106J\u0018\u00107\u001a\u0002042\u0006\u0010\u000f\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u00088\u00106J\u0016\u00109\u001a\u0002042\u0006\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0014J\u0018\u0010:\u001a\u0002042\u0006\u0010\u0016\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008;\u00106J\u0016\u0010<\u001a\u0002042\u0006\u0010-\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0014J\u0016\u0010=\u001a\u0002042\u0006\u0010-\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0014J\u0018\u0010>\u001a\u0002042\u0006\u0010$\u001a\u00020\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008?\u00106J\u000e\u0010@\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\u000cR\u0017\u0010\u0003\u001a\u00020\u00048F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00048F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00048F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0006R\u0011\u0010\u0018\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0006R\u0011\u0010\u001c\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u000eR\u0011\u0010\u001e\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0006R\u0013\u0010 \u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\nR\u0011\u0010\"\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u000eR\u0017\u0010$\u001a\u00020\u00048F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006B"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-ClassMeta;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "accessFlags",
        "Lkotlin/UInt;",
        "getAccessFlags-pVg5ArA",
        "()I",
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
        "fieldsAsByteBuffer",
        "getFieldsAsByteBuffer",
        "fieldsLength",
        "",
        "getFieldsLength",
        "id",
        "getId-pVg5ArA",
        "interfacesAsByteBuffer",
        "getInterfacesAsByteBuffer",
        "interfacesLength",
        "getInterfacesLength",
        "methodsAsByteBuffer",
        "getMethodsAsByteBuffer",
        "methodsLength",
        "getMethodsLength",
        "sourceFile",
        "getSourceFile",
        "sourceFileAsByteBuffer",
        "getSourceFileAsByteBuffer",
        "superClass",
        "getSuperClass-pVg5ArA",
        "__assign",
        "_i",
        "_bb",
        "__init",
        "",
        "dexDescriptorInByteBuffer",
        "fields",
        "j",
        "fieldsInByteBuffer",
        "interfaces",
        "interfacesInByteBuffer",
        "methods",
        "methodsInByteBuffer",
        "mutateAccessFlags",
        "",
        "mutateAccessFlags-WZ4Q5Ns",
        "(I)Z",
        "mutateDexId",
        "mutateDexId-WZ4Q5Ns",
        "mutateFields",
        "mutateId",
        "mutateId-WZ4Q5Ns",
        "mutateInterfaces",
        "mutateMethods",
        "mutateSuperClass",
        "mutateSuperClass-WZ4Q5Ns",
        "sourceFileInByteBuffer",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-ClassMeta;->Companion:Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMeta;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final dexDescriptorInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    const/16 v0, 0xc

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 12, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final fields(I)I
    .locals 4
    .param p1, "j"    # I

    .line 156
    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 157
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 158
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x4

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    goto :goto_0

    .line 160
    :cond_0
    const/4 v1, 0x0

    .line 157
    :goto_0
    return v1
.end method

.method public final fieldsInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    const/16 v0, 0x14

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 20, 4)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getAccessFlags-pVg5ArA()I
    .locals 3

    .line 72
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 73
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

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

    .line 86
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 87
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 88
    iget v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 90
    :cond_0
    const/4 v1, 0x0

    .line 87
    :goto_0
    return-object v1
.end method

.method public final getDexDescriptorAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 93
    const/16 v0, 0xc

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(12, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getDexId-pVg5ArA()I
    .locals 3

    .line 47
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 48
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

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

.method public final getFieldsAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 167
    const/16 v0, 0x14

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(20, 4)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getFieldsLength()I
    .locals 2

    .line 165
    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_len(I)I

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

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

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

.method public final getInterfacesAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 121
    const/16 v0, 0x10

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(16, 4)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getInterfacesLength()I
    .locals 2

    .line 119
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getMethodsAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 144
    const/16 v0, 0x12

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(18, 4)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMethodsLength()I
    .locals 2

    .line 142
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getSourceFile()Ljava/lang/String;
    .locals 2

    .line 61
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 62
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 63
    iget v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 65
    :cond_0
    const/4 v1, 0x0

    .line 62
    :goto_0
    return-object v1
.end method

.method public final getSourceFileAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 68
    const/16 v0, 0x8

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(8, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getSuperClass-pVg5ArA()I
    .locals 3

    .line 97
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 98
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

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

.method public final interfaces(I)I
    .locals 4
    .param p1, "j"    # I

    .line 110
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 111
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 112
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x4

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    goto :goto_0

    .line 114
    :cond_0
    const/4 v1, 0x0

    .line 111
    :goto_0
    return v1
.end method

.method public final interfacesInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    const/16 v0, 0x10

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 16, 4)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final methods(I)I
    .locals 4
    .param p1, "j"    # I

    .line 133
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 134
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 135
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x4

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    goto :goto_0

    .line 137
    :cond_0
    const/4 v1, 0x0

    .line 134
    :goto_0
    return v1
.end method

.method public final methodsInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    const/16 v0, 0x12

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 18, 4)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final mutateAccessFlags-WZ4Q5Ns(I)Z
    .locals 3
    .param p1, "accessFlags"    # I

    .line 76
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 77
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 78
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 79
    const/4 v1, 0x1

    goto :goto_0

    .line 81
    :cond_0
    const/4 v1, 0x0

    .line 77
    :goto_0
    return v1
.end method

.method public final mutateDexId-WZ4Q5Ns(I)Z
    .locals 3
    .param p1, "dexId"    # I

    .line 51
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 52
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 53
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

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

.method public final mutateFields(II)Z
    .locals 4
    .param p1, "j"    # I
    .param p2, "fields"    # I

    .line 170
    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 171
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 172
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x4

    add-int/2addr v2, v3

    invoke-virtual {v1, v2, p2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 173
    const/4 v1, 0x1

    goto :goto_0

    .line 175
    :cond_0
    const/4 v1, 0x0

    .line 171
    :goto_0
    return v1
.end method

.method public final mutateId-WZ4Q5Ns(I)Z
    .locals 3
    .param p1, "id"    # I

    .line 37
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 38
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 39
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

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

.method public final mutateInterfaces(II)Z
    .locals 4
    .param p1, "j"    # I
    .param p2, "interfaces"    # I

    .line 124
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 125
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 126
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x4

    add-int/2addr v2, v3

    invoke-virtual {v1, v2, p2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 127
    const/4 v1, 0x1

    goto :goto_0

    .line 129
    :cond_0
    const/4 v1, 0x0

    .line 125
    :goto_0
    return v1
.end method

.method public final mutateMethods(II)Z
    .locals 4
    .param p1, "j"    # I
    .param p2, "methods"    # I

    .line 147
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 148
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 149
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x4

    add-int/2addr v2, v3

    invoke-virtual {v1, v2, p2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 150
    const/4 v1, 0x1

    goto :goto_0

    .line 152
    :cond_0
    const/4 v1, 0x0

    .line 148
    :goto_0
    return v1
.end method

.method public final mutateSuperClass-WZ4Q5Ns(I)Z
    .locals 3
    .param p1, "superClass"    # I

    .line 101
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__offset(I)I

    move-result v0

    .line 102
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 103
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-ClassMeta;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 104
    const/4 v1, 0x1

    goto :goto_0

    .line 106
    :cond_0
    const/4 v1, 0x0

    .line 102
    :goto_0
    return v1
.end method

.method public final sourceFileInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    const/16 v0, 0x8

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 8, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
