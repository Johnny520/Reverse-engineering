.class public Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/AccessControllerPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AccessControlWrapper"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;->name:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;->name:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;->name:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;II)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 7

    .line 1
    invoke-static {}, Lnet/bytebuddy/build/AccessControllerPlugin;->access$000()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p5

    .line 5
    invoke-interface {p2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 6
    .line 7
    .line 8
    move-result-object p6

    .line 9
    check-cast p6, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 10
    .line 11
    invoke-interface {p6}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 12
    .line 13
    .line 14
    move-result-object p6

    .line 15
    invoke-interface {p5, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p5

    .line 19
    move-object v3, p5

    .line 20
    check-cast v3, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 21
    .line 22
    const/4 p5, 0x0

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPublic()Z

    .line 26
    .line 27
    .line 28
    move-result p6

    .line 29
    if-nez p6, :cond_0

    .line 30
    .line 31
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isProtected()Z

    .line 32
    .line 33
    .line 34
    move-result p6

    .line 35
    if-nez p6, :cond_0

    .line 36
    .line 37
    new-instance v0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;

    .line 38
    .line 39
    iget-object v4, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;->name:Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    xor-int/lit8 v5, p0, 0x1

    .line 46
    .line 47
    invoke-interface {p4}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    move-object v2, p1

    .line 52
    move-object v1, p3

    .line 53
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;Ljava/lang/String;ILnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_0
    const-string p0, " is either public or protected what is not permitted to avoid context leaks"

    .line 58
    .line 59
    invoke-static {p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object p5

    .line 63
    :cond_1
    const-string p0, " does not have a method with a matching signature in java.security.AccessController"

    .line 64
    .line 65
    invoke-static {p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object p5
.end method
