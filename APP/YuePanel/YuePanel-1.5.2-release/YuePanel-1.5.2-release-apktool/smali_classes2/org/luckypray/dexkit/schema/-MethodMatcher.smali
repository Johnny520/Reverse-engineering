.class public final Lorg/luckypray/dexkit/schema/-MethodMatcher;
.super Lcom/google/flatbuffers/Table;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0000\u0018\u0000 g2\u00020\u0001:\u0001gB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000e\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000e\u001a\u00020\u001e\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\"\u0010#J\u001f\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\"\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008&\u0010(J\u001b\u0010,\u001a\u00020)2\u0006\u0010!\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008-\u0010.J \u00102\u001a\u00020/2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010,\u001a\u00020)\u00f8\u0001\u0001\u00a2\u0006\u0004\u00080\u00101J\u001f\u00103\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u00083\u00104J\u0017\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u000e\u001a\u000205\u00a2\u0006\u0004\u00086\u00107J\u0017\u00108\u001a\u0004\u0018\u0001052\u0006\u0010\u000e\u001a\u000205\u00a2\u0006\u0004\u00088\u00107J\u0015\u00109\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u00089\u0010.J\u0017\u0010:\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008:\u0010;J\u001f\u0010:\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008:\u0010<J\u0017\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008=\u0010;J\u001f\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008=\u0010<J\u0017\u0010>\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008>\u0010;J\u001f\u0010>\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004\u00a2\u0006\u0004\u0008>\u0010<R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010@R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010BR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010DR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010DR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010GR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010IR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010KR\u0011\u0010N\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010MR\u0011\u0010P\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010MR\u0011\u0010R\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010MR\u0011\u0010U\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010TR\u0011\u0010W\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008V\u0010MR\u0013\u00106\u001a\u0004\u0018\u0001058F\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010YR\u0013\u00108\u001a\u0004\u0018\u0001058F\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010YR\u0013\u0010^\u001a\u0004\u0018\u00010[8F\u00a2\u0006\u0006\u001a\u0004\u0008\\\u0010]R\u0011\u0010`\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008_\u0010TR\u0011\u0010b\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008a\u0010MR\u0011\u0010d\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008c\u0010MR\u0011\u0010f\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008e\u0010M\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006h"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-MethodMatcher;",
        "Lcom/google/flatbuffers/Table;",
        "<init>",
        "()V",
        "",
        "_i",
        "Ljava/nio/ByteBuffer;",
        "_bb",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "__init",
        "(ILjava/nio/ByteBuffer;)V",
        "__assign",
        "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;",
        "Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "obj",
        "methodName",
        "(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;",
        "accessFlags",
        "(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;",
        "Lorg/luckypray/dexkit/schema/-ClassMatcher;",
        "declaringClass",
        "(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;",
        "returnType",
        "Lorg/luckypray/dexkit/schema/-ParametersMatcher;",
        "parameters",
        "(Lorg/luckypray/dexkit/schema/-ParametersMatcher;)Lorg/luckypray/dexkit/schema/-ParametersMatcher;",
        "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;",
        "annotations",
        "(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;",
        "Lorg/luckypray/dexkit/schema/-OpCodesMatcher;",
        "opCodes",
        "(Lorg/luckypray/dexkit/schema/-OpCodesMatcher;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;",
        "j",
        "usingStrings",
        "(I)Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;",
        "usingFields",
        "(I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;",
        "(Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;",
        "LYue/\u06e5\u06e2\u06e2\u06e5\u06e5;",
        "usingNumbersType-Wa3L5BU",
        "(I)B",
        "usingNumbersType",
        "usingNumbersTypeInByteBuffer",
        "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;",
        "",
        "mutateUsingNumbersType-EK-6454",
        "(IB)Z",
        "mutateUsingNumbersType",
        "usingNumbers",
        "(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;",
        "Lorg/luckypray/dexkit/schema/-MethodsMatcher;",
        "invokingMethods",
        "(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;",
        "methodCallers",
        "protoShortyInByteBuffer",
        "allOf",
        "(I)Lorg/luckypray/dexkit/schema/-MethodMatcher;",
        "(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;",
        "anyOf",
        "noneOf",
        "getMethodName",
        "()Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "getAccessFlags",
        "()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;",
        "getDeclaringClass",
        "()Lorg/luckypray/dexkit/schema/-ClassMatcher;",
        "getReturnType",
        "getParameters",
        "()Lorg/luckypray/dexkit/schema/-ParametersMatcher;",
        "getAnnotations",
        "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;",
        "getOpCodes",
        "()Lorg/luckypray/dexkit/schema/-OpCodesMatcher;",
        "getUsingStringsLength",
        "()I",
        "usingStringsLength",
        "getUsingFieldsLength",
        "usingFieldsLength",
        "getUsingNumbersTypeLength",
        "usingNumbersTypeLength",
        "getUsingNumbersTypeAsByteBuffer",
        "()Ljava/nio/ByteBuffer;",
        "usingNumbersTypeAsByteBuffer",
        "getUsingNumbersLength",
        "usingNumbersLength",
        "getInvokingMethods",
        "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;",
        "getMethodCallers",
        "",
        "getProtoShorty",
        "()Ljava/lang/String;",
        "protoShorty",
        "getProtoShortyAsByteBuffer",
        "protoShortyAsByteBuffer",
        "getAllOfLength",
        "allOfLength",
        "getAnyOfLength",
        "anyOfLength",
        "getNoneOfLength",
        "noneOfLength",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 1
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "_bb"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public final __init(ILjava/nio/ByteBuffer;)V
    .locals 1
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "_bb"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/Table;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public final accessFlags(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final allOf(I)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->allOf(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final allOf(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 2
    .param p1    # Lorg/luckypray/dexkit/schema/-MethodMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x20

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v1, "bb"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final anyOf(I)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->anyOf(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final anyOf(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 2
    .param p1    # Lorg/luckypray/dexkit/schema/-MethodMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x22

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v1, "bb"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final declaringClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/schema/-ClassMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getAccessFlags()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->accessFlags(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getAllOfLength()I
    .locals 1

    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getAnnotations()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getAnyOfLength()I
    .locals 1

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getDeclaringClass()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->declaringClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getInvokingMethods()Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->invokingMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getMethodCallers()Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->methodCallers(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getMethodName()Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->methodName(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getNoneOfLength()I
    .locals 1

    const/16 v0, 0x24

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getOpCodes()Lorg/luckypray/dexkit/schema/-OpCodesMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->opCodes(Lorg/luckypray/dexkit/schema/-OpCodesMatcher;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getParameters()Lorg/luckypray/dexkit/schema/-ParametersMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/schema/-ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ParametersMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->parameters(Lorg/luckypray/dexkit/schema/-ParametersMatcher;)Lorg/luckypray/dexkit/schema/-ParametersMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getProtoShorty()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/16 v0, 0x1e

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__string(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getProtoShortyAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/16 v0, 0x1e

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(30, 1)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getReturnType()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->returnType(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getUsingFieldsLength()I
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getUsingNumbersLength()I
    .locals 1

    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getUsingNumbersTypeAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/16 v0, 0x16

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(22, 1)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getUsingNumbersTypeLength()I
    .locals 1

    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getUsingStringsLength()I
    .locals 1

    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final invokingMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/schema/-MethodsMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1a

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final methodCallers(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/schema/-MethodsMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1c

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final methodName(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/schema/-StringMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/luckypray/dexkit/schema/-StringMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final mutateUsingNumbersType-EK-6454(IB)Z
    .locals 2

    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {v1, v0, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final noneOf(I)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->noneOf(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final noneOf(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 2
    .param p1    # Lorg/luckypray/dexkit/schema/-MethodMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x24

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v1, "bb"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final opCodes(Lorg/luckypray/dexkit/schema/-OpCodesMatcher;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/schema/-OpCodesMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final parameters(Lorg/luckypray/dexkit/schema/-ParametersMatcher;)Lorg/luckypray/dexkit/schema/-ParametersMatcher;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/schema/-ParametersMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/luckypray/dexkit/schema/-ParametersMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParametersMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final protoShortyInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "_bb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1e

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "__vector_in_bytebuffer(_bb, 30, 1)"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final returnType(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/schema/-ClassMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final usingFields(I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->usingFields(Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final usingFields(Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;
    .locals 2
    .param p1    # Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x14

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v1, "bb"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final usingNumbers(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;
    .locals 1
    .param p1    # Lcom/google/flatbuffers/Table;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, p1, v0}, Lcom/google/flatbuffers/Table;->__union(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final usingNumbersType-Wa3L5BU(I)B
    .locals 2

    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, LYue/ۥۢۢۥۥ;->ۥ۟۟۟ۥ(B)B

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final usingNumbersTypeInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "_bb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x16

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/Table;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "__vector_in_bytebuffer(_bb, 22, 1)"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final usingStrings(I)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->usingStrings(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final usingStrings(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 2
    .param p1    # Lorg/luckypray/dexkit/schema/-StringMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x12

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v1, "bb"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
