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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LQ0/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addAccessFlags(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addAnnotations(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addDeclaringClass(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addInvokingMethods(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xb

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addMethodCallers(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xc

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addMethodName(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addOpCodes(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addParameters(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addProtoShorty(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xd

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addReturnType(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addUsingFields(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addUsingNumbers(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addUsingNumbersType(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addUsingStrings(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final createMethodMatcher(Lcom/google/flatbuffers/b;IIIIIIIIIIIIII)I
    .locals 3

    move-object v0, p0

    move-object v1, p1

    const-string v2, "builder"

    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0xe

    invoke-virtual {p1, v2}, Lcom/google/flatbuffers/b;->s(I)V

    move/from16 v2, p15

    invoke-virtual {p0, p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addProtoShorty(Lcom/google/flatbuffers/b;I)V

    move/from16 v2, p14

    invoke-virtual {p0, p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addMethodCallers(Lcom/google/flatbuffers/b;I)V

    move/from16 v2, p13

    invoke-virtual {p0, p1, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addInvokingMethods(Lcom/google/flatbuffers/b;I)V

    move v2, p12

    invoke-virtual {p0, p1, p12}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addUsingNumbers(Lcom/google/flatbuffers/b;I)V

    move v2, p11

    invoke-virtual {p0, p1, p11}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addUsingNumbersType(Lcom/google/flatbuffers/b;I)V

    move v2, p10

    invoke-virtual {p0, p1, p10}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addUsingFields(Lcom/google/flatbuffers/b;I)V

    move v2, p9

    invoke-virtual {p0, p1, p9}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addUsingStrings(Lcom/google/flatbuffers/b;I)V

    move v2, p8

    invoke-virtual {p0, p1, p8}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addOpCodes(Lcom/google/flatbuffers/b;I)V

    move v2, p7

    invoke-virtual {p0, p1, p7}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addAnnotations(Lcom/google/flatbuffers/b;I)V

    move v2, p6

    invoke-virtual {p0, p1, p6}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addParameters(Lcom/google/flatbuffers/b;I)V

    move v2, p5

    invoke-virtual {p0, p1, p5}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addReturnType(Lcom/google/flatbuffers/b;I)V

    move v2, p4

    invoke-virtual {p0, p1, p4}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addDeclaringClass(Lcom/google/flatbuffers/b;I)V

    move v2, p3

    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addAccessFlags(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->addMethodName(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->endMethodMatcher(Lcom/google/flatbuffers/b;)I

    move-result v1

    return v1
.end method

.method public final createUsingFieldsVector(Lcom/google/flatbuffers/b;[I)I
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    array-length v1, p2

    invoke-virtual {p1, v0, v1, v0}, Lcom/google/flatbuffers/b;->t(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/b;->g(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->m()I

    move-result p1

    return p1
.end method

.method public final createUsingNumbersTypeVector-VU-fvBY(Lcom/google/flatbuffers/b;[B)I
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0, v1}, Lcom/google/flatbuffers/b;->t(III)V

    array-length v0, p2

    sub-int/2addr v0, v1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget-byte v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/b;->b(B)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->m()I

    move-result p1

    return p1
.end method

.method public final createUsingNumbersVector(Lcom/google/flatbuffers/b;[I)I
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    array-length v1, p2

    invoke-virtual {p1, v0, v1, v0}, Lcom/google/flatbuffers/b;->t(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/b;->g(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->m()I

    move-result p1

    return p1
.end method

.method public final createUsingStringsVector(Lcom/google/flatbuffers/b;[I)I
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    array-length v1, p2

    invoke-virtual {p1, v0, v1, v0}, Lcom/google/flatbuffers/b;->t(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/b;->g(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->m()I

    move-result p1

    return p1
.end method

.method public final endMethodMatcher(Lcom/google/flatbuffers/b;)I
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->l()I

    move-result p1

    return p1
.end method

.method public final getRootAsMethodMatcher(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 1

    const-string v0, "_bb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->getRootAsMethodMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMatcher;)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final getRootAsMethodMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMatcher;)Lorg/luckypray/dexkit/schema/-MethodMatcher;
    .locals 2

    const-string v0, "_bb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "obj"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 3
    invoke-static {p1, v0}, LS/d;->b(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    move-result v0

    .line 4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p2, v1, p1}, Lorg/luckypray/dexkit/schema/-MethodMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final startMethodMatcher(Lcom/google/flatbuffers/b;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xe

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->s(I)V

    return-void
.end method

.method public final startUsingFieldsVector(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/b;->t(III)V

    return-void
.end method

.method public final startUsingNumbersTypeVector(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/b;->t(III)V

    return-void
.end method

.method public final startUsingNumbersVector(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/b;->t(III)V

    return-void
.end method

.method public final startUsingStringsVector(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/b;->t(III)V

    return-void
.end method

.method public final validateVersion()V
    .locals 0

    return-void
.end method
