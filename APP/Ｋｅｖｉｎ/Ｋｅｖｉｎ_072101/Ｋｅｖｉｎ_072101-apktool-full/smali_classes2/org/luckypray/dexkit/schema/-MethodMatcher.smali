.class public final Lorg/luckypray/dexkit/schema/-MethodMatcher;
.super Lcom/google/flatbuffers/Table;
.source "MethodMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 L2\u00020\u0001:\u0001LB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020&J\u0016\u0010:\u001a\u00020;2\u0006\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020&J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010<\u001a\u00020\u0008J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010<\u001a\u00020\u000cJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010<\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010<\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010<\u001a\u00020\u0016J \u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020A\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008B\u0010CJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010<\u001a\u00020\u001aJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010<\u001a\u00020\u001eJ\u000e\u0010D\u001a\u00020&2\u0006\u00109\u001a\u00020&J\u0010\u0010)\u001a\u0004\u0018\u00010\u000c2\u0006\u0010<\u001a\u00020\u000cJ\u0010\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010?\u001a\u00020,J\u0018\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010<\u001a\u00020F2\u0006\u0010?\u001a\u00020,J\u0018\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010<\u001a\u00020\u00012\u0006\u0010?\u001a\u00020,J\u001b\u0010@\u001a\u00020A2\u0006\u0010?\u001a\u00020,\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008H\u0010IJ\u000e\u0010J\u001a\u00020&2\u0006\u00109\u001a\u00020&J\u0010\u0010K\u001a\u0004\u0018\u00010\u00162\u0006\u0010?\u001a\u00020,J\u0018\u0010K\u001a\u0004\u0018\u00010\u00162\u0006\u0010<\u001a\u00020\u00162\u0006\u0010?\u001a\u00020,R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u000eR\u0011\u0010+\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.R\u0011\u0010/\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\u00080\u0010.R\u0011\u00101\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\u00082\u0010(R\u0011\u00103\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\u00084\u0010.R\u0011\u00105\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\u00086\u0010.\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006M"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-MethodMatcher;",
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
        "invokingMethods",
        "Lorg/luckypray/dexkit/schema/-MethodsMatcher;",
        "getInvokingMethods",
        "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;",
        "methodCallers",
        "getMethodCallers",
        "methodName",
        "Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "getMethodName",
        "()Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "opCodes",
        "Lorg/luckypray/dexkit/schema/-OpCodesMatcher;",
        "getOpCodes",
        "()Lorg/luckypray/dexkit/schema/-OpCodesMatcher;",
        "parameters",
        "Lorg/luckypray/dexkit/schema/-ParametersMatcher;",
        "getParameters",
        "()Lorg/luckypray/dexkit/schema/-ParametersMatcher;",
        "protoShorty",
        "",
        "getProtoShorty",
        "()Ljava/lang/String;",
        "protoShortyAsByteBuffer",
        "Ljava/nio/ByteBuffer;",
        "getProtoShortyAsByteBuffer",
        "()Ljava/nio/ByteBuffer;",
        "returnType",
        "getReturnType",
        "usingFieldsLength",
        "",
        "getUsingFieldsLength",
        "()I",
        "usingNumbersLength",
        "getUsingNumbersLength",
        "usingNumbersTypeAsByteBuffer",
        "getUsingNumbersTypeAsByteBuffer",
        "usingNumbersTypeLength",
        "getUsingNumbersTypeLength",
        "usingStringsLength",
        "getUsingStringsLength",
        "__assign",
        "_i",
        "_bb",
        "__init",
        "",
        "obj",
        "mutateUsingNumbersType",
        "",
        "j",
        "usingNumbersType",
        "Lkotlin/UByte;",
        "mutateUsingNumbersType-EK-6454",
        "(IB)Z",
        "protoShortyInByteBuffer",
        "usingFields",
        "Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;",
        "usingNumbers",
        "usingNumbersType-Wa3L5BU",
        "(I)B",
        "usingNumbersTypeInByteBuffer",
        "usingStrings",
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
.field public static final Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__init(ILjava/nio/ByteBuffer;)V

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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__reset(ILjava/nio/ByteBuffer;)V

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

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 43
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 44
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

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

    .line 78
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 79
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 80
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    move-result-object v1

    goto :goto_0

    .line 82
    :cond_0
    const/4 v1, 0x0

    .line 79
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

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 52
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 53
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

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

.method public final getAccessFlags()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;
    .locals 1

    .line 40
    new-instance v0, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->accessFlags(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getAnnotations()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;
    .locals 1

    .line 76
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->annotations(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getDeclaringClass()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1

    .line 49
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->declaringClass(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getInvokingMethods()Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 1

    .line 155
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->invokingMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getMethodCallers()Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 1

    .line 164
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->methodCallers(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getMethodName()Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 1

    .line 31
    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->methodName(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getOpCodes()Lorg/luckypray/dexkit/schema/-OpCodesMatcher;
    .locals 1

    .line 85
    new-instance v0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->opCodes(Lorg/luckypray/dexkit/schema/-OpCodesMatcher;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getParameters()Lorg/luckypray/dexkit/schema/-ParametersMatcher;
    .locals 1

    .line 67
    new-instance v0, Lorg/luckypray/dexkit/schema/-ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ParametersMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->parameters(Lorg/luckypray/dexkit/schema/-ParametersMatcher;)Lorg/luckypray/dexkit/schema/-ParametersMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getProtoShorty()Ljava/lang/String;
    .locals 2

    .line 175
    const/16 v0, 0x1e

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 176
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 177
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__string(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 179
    :cond_0
    const/4 v1, 0x0

    .line 176
    :goto_0
    return-object v1
.end method

.method public final getProtoShortyAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 182
    const/16 v0, 0x1e

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(30, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getReturnType()Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 1

    .line 58
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMatcher;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->returnType(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getUsingFieldsLength()I
    .locals 2

    .line 118
    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getUsingNumbersLength()I
    .locals 2

    .line 153
    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getUsingNumbersTypeAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 132
    const/16 v0, 0x16

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_as_bytebuffer(22, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getUsingNumbersTypeLength()I
    .locals 2

    .line 130
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getUsingStringsLength()I
    .locals 2

    .line 105
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .local v0, "o":I
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector_len(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final invokingMethods(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    const/16 v0, 0x1a

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 158
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 159
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v1

    goto :goto_0

    .line 161
    :cond_0
    const/4 v1, 0x0

    .line 158
    :goto_0
    return-object v1
.end method

.method public final methodCallers(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    const/16 v0, 0x1c

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 167
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 168
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;

    move-result-object v1

    goto :goto_0

    .line 170
    :cond_0
    const/4 v1, 0x0

    .line 167
    :goto_0
    return-object v1
.end method

.method public final methodName(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-StringMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 35
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

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

.method public final mutateUsingNumbersType-EK-6454(IB)Z
    .locals 4
    .param p1, "j"    # I
    .param p2, "usingNumbersType"    # B

    .line 135
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 136
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 137
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v1, v2, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 138
    const/4 v1, 0x1

    goto :goto_0

    .line 140
    :cond_0
    const/4 v1, 0x0

    .line 136
    :goto_0
    return v1
.end method

.method public final opCodes(Lorg/luckypray/dexkit/schema/-OpCodesMatcher;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-OpCodesMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 88
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 89
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;

    move-result-object v1

    goto :goto_0

    .line 91
    :cond_0
    const/4 v1, 0x0

    .line 88
    :goto_0
    return-object v1
.end method

.method public final parameters(Lorg/luckypray/dexkit/schema/-ParametersMatcher;)Lorg/luckypray/dexkit/schema/-ParametersMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-ParametersMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 70
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 71
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-ParametersMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParametersMatcher;

    move-result-object v1

    goto :goto_0

    .line 73
    :cond_0
    const/4 v1, 0x0

    .line 70
    :goto_0
    return-object v1
.end method

.method public final protoShortyInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    const/16 v0, 0x1e

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 30, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final returnType(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-ClassMatcher;

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 61
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 62
    iget v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb_pos:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

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

.method public final usingFields(I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;
    .locals 1
    .param p1, "j"    # I

    .line 107
    new-instance v0, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->usingFields(Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final usingFields(Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;
    .param p2, "j"    # I

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 110
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 111
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;

    move-result-object v1

    goto :goto_0

    .line 113
    :cond_0
    const/4 v1, 0x0

    .line 110
    :goto_0
    return-object v1
.end method

.method public final usingNumbers(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;
    .locals 3
    .param p1, "obj"    # Lcom/google/flatbuffers/Table;
    .param p2, "j"    # I

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 145
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, p1, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__union(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;

    move-result-object v1

    goto :goto_0

    .line 148
    :cond_0
    const/4 v1, 0x0

    .line 145
    :goto_0
    return-object v1
.end method

.method public final usingNumbersType-Wa3L5BU(I)B
    .locals 4
    .param p1, "j"    # I

    .line 121
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 122
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 123
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector(I)I

    move-result v2

    mul-int/lit8 v3, p1, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {v1}, Lkotlin/UByte;->constructor-impl(B)B

    move-result v1

    goto :goto_0

    .line 125
    :cond_0
    const/4 v1, 0x0

    .line 122
    :goto_0
    return v1
.end method

.method public final usingNumbersTypeInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    const/16 v0, 0x16

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "__vector_in_bytebuffer(_bb, 22, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final usingStrings(I)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 1
    .param p1, "j"    # I

    .line 94
    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->usingStrings(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 4
    .param p1, "obj"    # Lorg/luckypray/dexkit/schema/-StringMatcher;
    .param p2, "j"    # I

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__offset(I)I

    move-result v0

    .line 97
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__vector(I)I

    move-result v1

    mul-int/lit8 v2, p2, 0x4

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__indirect(I)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/schema/-MethodMatcher;->bb:Ljava/nio/ByteBuffer;

    const-string v3, "bb"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/schema/-StringMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object v1

    goto :goto_0

    .line 100
    :cond_0
    const/4 v1, 0x0

    .line 97
    :goto_0
    return-object v1
.end method
