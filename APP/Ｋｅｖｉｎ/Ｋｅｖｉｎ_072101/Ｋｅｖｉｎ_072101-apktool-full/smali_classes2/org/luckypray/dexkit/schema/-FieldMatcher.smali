.class public final Lorg/luckypray/dexkit/schema/-FieldMatcher;
.super Lcom/google/flatbuffers/Table;
.source "FieldMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\"\u001a\u00020\u0008J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\"\u001a\u00020\u000cJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\u0014J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\"\u001a\u00020\u000cR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u000e\u00a8\u0006$"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-FieldMatcher;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "accessFlags",
        "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;",
        "getAccessFlags",
        "()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;",
        "annotations",
        "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;",
        "getAnnotations",
        "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;",
        "declaringClass",
        "Lorg/luckypray/dexkit/schema/-ClassMatcher;",
        "getDeclaringClass",
        "()Lorg/luckypray/dexkit/schema/-ClassMatcher;",
        "fieldName",
        "Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "getFieldName",
        "()Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "getMethods",
        "Lorg/luckypray/dexkit/schema/-MethodsMatcher;",
        "getGetMethods",
        "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;",
        "putMethods",
        "getPutMethods",
        "typeClass",
        "getTypeClass",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->Companion:Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final accessFlags(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__offset(I)I

    move-result v0

    .line 43
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 44
    iget v1, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    move-result-object v1

    goto :goto_0

    .line 46
    :cond_0
    const/4 v1, 0x0

    .line 43
    :goto_0
    return-object v1
.end method

.method public final annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__offset(I)I

    move-result v0

    .line 70
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 71
    iget v1, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    move-result-object v1

    goto :goto_0

    .line 73
    :cond_0
    const/4 v1, 0x0

    .line 70
    :goto_0
    return-object v1
.end method

.method public final declaringClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-ClassMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__offset(I)I

    move-result v0

    .line 52
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 53
    iget v1, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-ClassMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v1

    goto :goto_0

    .line 55
    :cond_0
    const/4 v1, 0x0

    .line 52
    :goto_0
    return-object v1
.end method

.method public final fieldName(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-StringMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 35
    iget v1, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb:Ljava/nio/ByteBuffer;

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

.method public final getAccessFlags()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
    .locals 1

    .line 40
    new-instance v0, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->accessFlags(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getAnnotations()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
    .locals 1

    .line 67
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getDeclaringClass()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1

    .line 49
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->declaringClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getFieldName()Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 1

    .line 31
    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->fieldName(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getGetMethods()Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 1

    .line 76
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->getMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__offset(I)I

    move-result v0

    .line 79
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 80
    iget v1, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v1

    goto :goto_0

    .line 82
    :cond_0
    const/4 v1, 0x0

    .line 79
    :goto_0
    return-object v1
.end method

.method public final getPutMethods()Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 1

    .line 85
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->putMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getTypeClass()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1

    .line 58
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->typeClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final putMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__offset(I)I

    move-result v0

    .line 88
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 89
    iget v1, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v1

    goto :goto_0

    .line 91
    :cond_0
    const/4 v1, 0x0

    .line 88
    :goto_0
    return-object v1
.end method

.method public final typeClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-ClassMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__offset(I)I

    move-result v0

    .line 61
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 62
    iget v1, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-ClassMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v1

    goto :goto_0

    .line 64
    :cond_0
    const/4 v1, 0x0

    .line 61
    :goto_0
    return-object v1
.end method
