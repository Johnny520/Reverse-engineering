.class public final Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-MethodMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008&\n\u0002\u0010\u0015\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\u000cJ\u009d\u0001\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008#\u0010$J\u001d\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000f\u00a2\u0006\u0004\u0008&\u0010\'J\u001d\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u000f\u00a2\u0006\u0004\u0008)\u0010\'J\u001d\u0010+\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u000f\u00a2\u0006\u0004\u0008+\u0010\'J\u001d\u0010-\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u000f\u00a2\u0006\u0004\u0008-\u0010\'J\u001d\u0010/\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u000f\u00a2\u0006\u0004\u0008/\u0010\'J\u001d\u00101\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020\u000f\u00a2\u0006\u0004\u00081\u0010\'J\u001d\u00103\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00102\u001a\u00020\u000f\u00a2\u0006\u0004\u00083\u0010\'J\u001d\u00105\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u00020\u000f\u00a2\u0006\u0004\u00085\u0010\'J\u001d\u00108\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u00088\u00109J\u001d\u0010;\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f\u00a2\u0006\u0004\u0008;\u0010\'J\u001d\u0010=\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u000f\u00a2\u0006\u0004\u0008=\u0010\'J\u001d\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008>\u00109J\u001d\u0010?\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f\u00a2\u0006\u0004\u0008?\u0010\'J\u001d\u0010A\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u000f\u00a2\u0006\u0004\u0008A\u0010\'J\"\u0010E\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u00020BH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008C\u0010DJ\u001d\u0010F\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f\u00a2\u0006\u0004\u0008F\u0010\'J\u001d\u0010H\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u000f\u00a2\u0006\u0004\u0008H\u0010\'J\u001d\u0010I\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008I\u00109J\u001d\u0010J\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f\u00a2\u0006\u0004\u0008J\u0010\'J\u001d\u0010L\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010K\u001a\u00020\u000f\u00a2\u0006\u0004\u0008L\u0010\'J\u001d\u0010N\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u000f\u00a2\u0006\u0004\u0008N\u0010\'J\u001d\u0010P\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010O\u001a\u00020\u000f\u00a2\u0006\u0004\u0008P\u0010\'J\u001d\u0010R\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u000f\u00a2\u0006\u0004\u0008R\u0010\'J\u001d\u0010S\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008S\u00109J\u001d\u0010T\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f\u00a2\u0006\u0004\u0008T\u0010\'J\u001d\u0010V\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u000f\u00a2\u0006\u0004\u0008V\u0010\'J\u001d\u0010W\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008W\u00109J\u001d\u0010X\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f\u00a2\u0006\u0004\u0008X\u0010\'J\u001d\u0010Z\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\u000f\u00a2\u0006\u0004\u0008Z\u0010\'J\u001d\u0010[\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008[\u00109J\u001d\u0010\\\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\\\u0010\'J\u0015\u0010]\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008]\u0010^\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006_"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;",
        "",
        "<init>",
        "()V",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "validateVersion",
        "Ljava/nio/ByteBuffer;",
        "_bb",
        "Lorg/luckypray/dexkit/schema/-MethodMatcher;",
        "getRootAsMethodMatcher",
        "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;",
        "obj",
        "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMatcher;)Lorg/luckypray/dexkit/schema/-MethodMatcher;",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "builder",
        "",
        "methodNameOffset",
        "accessFlagsOffset",
        "declaringClassOffset",
        "returnTypeOffset",
        "parametersOffset",
        "annotationsOffset",
        "opCodesOffset",
        "usingStringsOffset",
        "usingFieldsOffset",
        "usingNumbersTypeOffset",
        "usingNumbersOffset",
        "invokingMethodsOffset",
        "methodCallersOffset",
        "protoShortyOffset",
        "allOfOffset",
        "anyOfOffset",
        "noneOfOffset",
        "createMethodMatcher",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIIIIIIIIIII)I",
        "startMethodMatcher",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;)V",
        "methodName",
        "addMethodName",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V",
        "accessFlags",
        "addAccessFlags",
        "declaringClass",
        "addDeclaringClass",
        "returnType",
        "addReturnType",
        "parameters",
        "addParameters",
        "annotations",
        "addAnnotations",
        "opCodes",
        "addOpCodes",
        "usingStrings",
        "addUsingStrings",
        "",
        "data",
        "createUsingStringsVector",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I",
        "numElems",
        "startUsingStringsVector",
        "usingFields",
        "addUsingFields",
        "createUsingFieldsVector",
        "startUsingFieldsVector",
        "usingNumbersType",
        "addUsingNumbersType",
        "LYue/\u06e5\u06e2\u06e2\u06e5\u06e6;",
        "createUsingNumbersTypeVector-VU-fvBY",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I",
        "createUsingNumbersTypeVector",
        "startUsingNumbersTypeVector",
        "usingNumbers",
        "addUsingNumbers",
        "createUsingNumbersVector",
        "startUsingNumbersVector",
        "invokingMethods",
        "addInvokingMethods",
        "methodCallers",
        "addMethodCallers",
        "protoShorty",
        "addProtoShorty",
        "allOf",
        "addAllOf",
        "createAllOfVector",
        "startAllOfVector",
        "anyOf",
        "addAnyOf",
        "createAnyOfVector",
        "startAnyOfVector",
        "noneOf",
        "addNoneOf",
        "createNoneOfVector",
        "startNoneOfVector",
        "endMethodMatcher",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;)I",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addAccessFlags(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addAllOf(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addAnnotations(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addAnyOf(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xf

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addDeclaringClass(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addInvokingMethods(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addMethodCallers(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addMethodName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addNoneOf(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x10

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addOpCodes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addParameters(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addProtoShorty(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addReturnType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addUsingFields(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addUsingNumbers(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addUsingNumbersType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x9

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final addUsingStrings(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final createAllOfVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public final createAnyOfVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public final createMethodMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIIIIIIIIIII)I
    .locals 3
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    move-object v0, p0

    move-object v1, p1

    const-string v2, "builder"

    invoke-static {p1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x11

    invoke-virtual {p1, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    move/from16 v2, p18

    invoke-virtual {p0, p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addNoneOf(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move/from16 v2, p17

    invoke-virtual {p0, p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addAnyOf(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move/from16 v2, p16

    invoke-virtual {p0, p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addAllOf(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move/from16 v2, p15

    invoke-virtual {p0, p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addProtoShorty(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move/from16 v2, p14

    invoke-virtual {p0, p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addMethodCallers(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move/from16 v2, p13

    invoke-virtual {p0, p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addInvokingMethods(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p12

    invoke-virtual {p0, p1, p12}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addUsingNumbers(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p11

    invoke-virtual {p0, p1, p11}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addUsingNumbersType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p10

    invoke-virtual {p0, p1, p10}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addUsingFields(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p9

    invoke-virtual {p0, p1, p9}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addUsingStrings(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p8

    invoke-virtual {p0, p1, p8}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addOpCodes(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p7

    invoke-virtual {p0, p1, p7}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addAnnotations(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p6

    invoke-virtual {p0, p1, p6}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addParameters(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p5

    invoke-virtual {p0, p1, p5}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addReturnType(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p4

    invoke-virtual {p0, p1, p4}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addDeclaringClass(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    move v2, p3

    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addAccessFlags(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addMethodName(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->endMethodMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v1

    return v1
.end method

.method public final createNoneOfVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public final createUsingFieldsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public final createUsingNumbersTypeVector-VU-fvBY(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۧ([B)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    invoke-static {p2}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۧ([B)I

    move-result v0

    sub-int/2addr v0, v1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    invoke-static {p2, v0}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۥ([BI)B

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(B)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public final createUsingNumbersVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public final createUsingStringsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result p1

    return p1
.end method

.method public final endMethodMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result p1

    return p1
.end method

.method public final getRootAsMethodMatcher(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 1
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "_bb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->getRootAsMethodMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMatcher;)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final getRootAsMethodMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMatcher;)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 2
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/schema/-MethodMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "_bb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "obj"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final startAllOfVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public final startAnyOfVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public final startMethodMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method

.method public final startNoneOfVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public final startUsingFieldsVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public final startUsingNumbersTypeVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public final startUsingNumbersVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public final startUsingStringsVector(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    return-void
.end method

.method public final validateVersion()V
    .locals 0

    invoke-static {}, Lcom/google/flatbuffers/Constants;->FLATBUFFERS_23_5_26()V

    return-void
.end method
