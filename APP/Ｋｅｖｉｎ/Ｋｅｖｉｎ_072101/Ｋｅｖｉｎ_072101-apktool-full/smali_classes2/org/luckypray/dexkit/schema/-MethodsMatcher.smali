.class public final Lorg/luckypray/dexkit/schema/-MethodsMatcher;
.super Lcom/google/flatbuffers/Table;
.source "MethodsMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-MethodsMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u0008J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000cJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000cJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001c"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-MethodsMatcher;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "matchType",
        "",
        "getMatchType",
        "()B",
        "methodCount",
        "Lorg/luckypray/dexkit/schema/-IntRange;",
        "getMethodCount",
        "()Lorg/luckypray/dexkit/schema/-IntRange;",
        "methodsLength",
        "",
        "getMethodsLength",
        "()I",
        "__assign",
        "_i",
        "_bb",
        "Ljava/nio/ByteBuffer;",
        "__init",
        "",
        "obj",
        "methods",
        "Lorg/luckypray/dexkit/schema/-MethodMatcher;",
        "j",
        "mutateMatchType",
        "",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-MethodsMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-MethodsMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodsMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final getMatchType()B
    .locals 3

    .line 46
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__offset(I)I

    move-result v0

    .line 47
    .local v0, "o":I
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getMethodCount()Lorg/luckypray/dexkit/schema/-IntRange;
    .locals 1

    .line 58
    new-instance v0, Lorg/luckypray/dexkit/schema/-IntRange;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-IntRange;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->methodCount(Lorg/luckypray/dexkit/schema/-IntRange;)Lorg/luckypray/dexkit/schema/-IntRange;

    move-result-object v0

    return-object v0
.end method

.method public final getMethodsLength()I
    .locals 2

    .line 42
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final methodCount(Lorg/luckypray/dexkit/schema/-IntRange;)Lorg/luckypray/dexkit/schema/-IntRange;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-IntRange;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__offset(I)I

    move-result v0

    .line 61
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 62
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-IntRange;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-IntRange;

    move-result-object v1

    goto :goto_0

    .line 64
    :cond_0
    const/4 v1, 0x0

    .line 61
    :goto_0
    return-object v1
.end method

.method public final methods(I)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 1
    .param p1, "j"    # I

    .line 31
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->methods(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final methods(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .param p2, "j"    # I

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 35
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object v1

    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    return-object v1
.end method

.method public final mutateMatchType(B)Z
    .locals 3
    .param p1, "matchType"    # B

    .line 50
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__offset(I)I

    move-result v0

    .line 51
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 52
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->bb_pos:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 53
    const/4 v1, 0x1

    goto :goto_0

    .line 55
    :cond_0
    const/4 v1, 0x0

    .line 51
    :goto_0
    return v1
.end method
