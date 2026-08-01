.class public final Lorg/luckypray/dexkit/schema/-ParameterMatcher;
.super Lcom/google/flatbuffers/Table;
.source "ParameterMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0012\u001a\u00020\u0008R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-ParameterMatcher;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "annotations",
        "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;",
        "getAnnotations",
        "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;",
        "parameterType",
        "Lorg/luckypray/dexkit/schema/-ClassMatcher;",
        "getParameterType",
        "()Lorg/luckypray/dexkit/schema/-ClassMatcher;",
        "__assign",
        "_i",
        "",
        "_bb",
        "Ljava/nio/ByteBuffer;",
        "__init",
        "",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->Companion:Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParameterMatcher;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 35
    iget v1, p0, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    move-result-object v1

    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    return-object v1
.end method

.method public final getAnnotations()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
    .locals 1

    .line 31
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getParameterType()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1

    .line 40
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->parameterType(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final parameterType(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-ClassMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->__offset(I)I

    move-result v0

    .line 43
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 44
    iget v1, p0, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-ClassMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v1

    goto :goto_0

    .line 46
    :cond_0
    const/4 v1, 0x0

    .line 43
    :goto_0
    return-object v1
.end method
