.class public final Lorg/luckypray/dexkit/schema/-OpCodesMatcher;
.super Lcom/google/flatbuffers/Table;
.source "OpCodesMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\n\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000cJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000cJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u001e\u001a\u00020\u0008J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0010J\u000e\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u000cR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006!"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-OpCodesMatcher;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "matchType",
        "",
        "getMatchType",
        "()B",
        "opCodeCount",
        "Lorg/luckypray/dexkit/schema/-IntRange;",
        "getOpCodeCount",
        "()Lorg/luckypray/dexkit/schema/-IntRange;",
        "opCodesAsByteBuffer",
        "Ljava/nio/ByteBuffer;",
        "getOpCodesAsByteBuffer",
        "()Ljava/nio/ByteBuffer;",
        "opCodesLength",
        "",
        "getOpCodesLength",
        "()I",
        "__assign",
        "_i",
        "_bb",
        "__init",
        "",
        "mutateMatchType",
        "",
        "mutateOpCodes",
        "j",
        "opCodes",
        "",
        "obj",
        "opCodesInByteBuffer",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final getMatchType()B
    .locals 3

    .line 56
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__offset(I)I

    move-result v0

    .line 57
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getOpCodeCount()Lorg/luckypray/dexkit/schema/-IntRange;
    .locals 1

    .line 68
    new-instance v0, Lorg/luckypray/dexkit/schema/-IntRange;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-IntRange;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->opCodeCount(Lorg/luckypray/dexkit/schema/-IntRange;)Lorg/luckypray/dexkit/schema/-IntRange;

    move-result-object v0

    return-object v0
.end method

.method public final getOpCodesAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 43
    const/4 v0, 0x4

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(4, 2)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getOpCodesLength()I
    .locals 2

    .line 41
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__vector_len(I)I

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

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__offset(I)I

    move-result v0

    .line 61
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 62
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->bb_pos:I

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

.method public final mutateOpCodes(IS)Z
    .locals 4
    .param p1, "j"    # I
    .param p2, "opCodes"    # S

    .line 46
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__offset(I)I

    move-result v0

    .line 47
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 48
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x2

    add-int/2addr v2, v3

    invoke-virtual {v1, v2, p2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

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

.method public final opCodeCount(Lorg/luckypray/dexkit/schema/-IntRange;)Lorg/luckypray/dexkit/schema/-IntRange;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-IntRange;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__offset(I)I

    move-result v0

    .line 71
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 72
    iget v1, p0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-IntRange;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-IntRange;

    move-result-object v1

    goto :goto_0

    .line 74
    :cond_0
    const/4 v1, 0x0

    .line 71
    :goto_0
    return-object v1
.end method

.method public final opCodes(I)S
    .locals 4
    .param p1, "j"    # I

    .line 32
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__offset(I)I

    move-result v0

    .line 33
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 34
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x2

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 33
    :goto_0
    return v1
.end method

.method public final opCodesInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x4

    const/4 v1, 0x2

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 4, 2)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
