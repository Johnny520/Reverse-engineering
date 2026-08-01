.class public final Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;
.super Lcom/google/flatbuffers/Table;
.source "AnnotationElementMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00088F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0019"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "name",
        "Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "getName",
        "()Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "valueType",
        "Lkotlin/UByte;",
        "getValueType-w2LRezQ",
        "()B",
        "__assign",
        "_i",
        "",
        "_bb",
        "Ljava/nio/ByteBuffer;",
        "__init",
        "",
        "mutateValueType",
        "",
        "mutateValueType-7apg3OU",
        "(B)Z",
        "obj",
        "value",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final getName()Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 1

    .line 31
    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->name(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getValueType-w2LRezQ()B
    .locals 3

    .line 42
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->__offset(I)I

    move-result v0

    .line 43
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {v1}, Lkotlin/UByte;->constructor-impl(B)B

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final mutateValueType-7apg3OU(B)Z
    .locals 3
    .param p1, "valueType"    # B

    .line 46
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->__offset(I)I

    move-result v0

    .line 47
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 48
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

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

.method public final name(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-StringMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 35
    iget v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-StringMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object v1

    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    return-object v1
.end method

.method public final value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;
    .locals 2
    .param p1, "obj"    # Lcom/google/flatbuffers/Table;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    iget v1, p0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, p1, v1}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->__union(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method
