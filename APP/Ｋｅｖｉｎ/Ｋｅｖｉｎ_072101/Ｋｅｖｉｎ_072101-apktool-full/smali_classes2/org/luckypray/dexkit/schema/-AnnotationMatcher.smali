.class public final Lorg/luckypray/dexkit/schema/-AnnotationMatcher;
.super Lcom/google/flatbuffers/Table;
.source "AnnotationMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0008J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u001d\u001a\u00020\u000cJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0014J\u0018\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001d\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006$"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-AnnotationMatcher;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "elements",
        "Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;",
        "getElements",
        "()Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;",
        "policy",
        "",
        "getPolicy",
        "()B",
        "targetElementTypes",
        "Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;",
        "getTargetElementTypes",
        "()Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;",
        "type",
        "Lorg/luckypray/dexkit/schema/-ClassMatcher;",
        "getType",
        "()Lorg/luckypray/dexkit/schema/-ClassMatcher;",
        "usingStringsLength",
        "",
        "getUsingStringsLength",
        "()I",
        "__assign",
        "_i",
        "_bb",
        "Ljava/nio/ByteBuffer;",
        "__init",
        "",
        "obj",
        "mutatePolicy",
        "",
        "usingStrings",
        "Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "j",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMatcher;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final elements(Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__offset(I)I

    move-result v0

    .line 66
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 67
    iget v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;

    move-result-object v1

    goto :goto_0

    .line 69
    :cond_0
    const/4 v1, 0x0

    .line 66
    :goto_0
    return-object v1
.end method

.method public final getElements()Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;
    .locals 1

    .line 63
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->elements(Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getPolicy()B
    .locals 3

    .line 51
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__offset(I)I

    move-result v0

    .line 52
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getTargetElementTypes()Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;
    .locals 1

    .line 40
    new-instance v0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->targetElementTypes(Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;)Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1

    .line 31
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->type(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getUsingStringsLength()I
    .locals 2

    .line 83
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final mutatePolicy(B)Z
    .locals 3
    .param p1, "policy"    # B

    .line 55
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__offset(I)I

    move-result v0

    .line 56
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 57
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 58
    const/4 v1, 0x1

    goto :goto_0

    .line 60
    :cond_0
    const/4 v1, 0x0

    .line 56
    :goto_0
    return v1
.end method

.method public final targetElementTypes(Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;)Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__offset(I)I

    move-result v0

    .line 43
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 44
    iget v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;

    move-result-object v1

    goto :goto_0

    .line 46
    :cond_0
    const/4 v1, 0x0

    .line 43
    :goto_0
    return-object v1
.end method

.method public final type(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-ClassMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 35
    iget v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-ClassMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v1

    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    return-object v1
.end method

.method public final usingStrings(I)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 1
    .param p1, "j"    # I

    .line 72
    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->usingStrings(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-StringMatcher;
    .param p2, "j"    # I

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__offset(I)I

    move-result v0

    .line 75
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 76
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-StringMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object v1

    goto :goto_0

    .line 78
    :cond_0
    const/4 v1, 0x0

    .line 75
    :goto_0
    return-object v1
.end method
