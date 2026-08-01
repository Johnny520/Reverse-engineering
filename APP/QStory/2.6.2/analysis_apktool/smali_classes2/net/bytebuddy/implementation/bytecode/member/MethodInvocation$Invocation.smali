.class public Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Invocation"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field final synthetic this$0:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V
    .locals 1

    .line 11
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->this$0:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    iput-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->this$0:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->access$000(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->this$0:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 8
    .line 9
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->access$100(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V11:Lnet/bytebuddy/ClassFileVersion;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->this$0:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 29
    .line 30
    invoke-static {p2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->access$100(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    :goto_0
    move v1, p2

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_1
    iget-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->this$0:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 37
    .line 38
    invoke-static {p2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->access$000(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    goto :goto_0

    .line 43
    :goto_2
    iget-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 44
    .line 45
    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 56
    .line 57
    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 62
    .line 63
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    move-object v0, p1

    .line 68
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 72
    .line 73
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 78
    .line 79
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 92
    .line 93
    sub-int/2addr p0, p1

    .line 94
    const/4 p1, 0x0

    .line 95
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-direct {p2, p0, p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;-><init>(II)V

    .line 100
    .line 101
    .line 102
    return-object p2
.end method

.method public dynamic(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;)",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-static {p4}, Lnet/bytebuddy/description/type/TypeList$Explicit;->of(Ljava/util/List;)Lnet/bytebuddy/description/type/TypeList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/method/MethodDescription;->isInvokeBootstrap(Ljava/util/List;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;

    .line 14
    .line 15
    invoke-static {p2, p3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->of(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 20
    .line 21
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, p1, p2, p0, p4}, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/utility/JavaConstant$MethodType;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 30
    .line 31
    return-object p0
.end method

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->this$0:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->this$0:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 45
    .line 46
    iget-object p1, p1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->this$0:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v0

    .line 31
    return p0
.end method

.method public onHandle(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$HandleType;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$HandleInvocation;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$HandleInvocation;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$HandleType;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public special(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription;->isSpecializableFor(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;

    .line 10
    .line 11
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->SPECIAL:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 17
    .line 18
    invoke-direct {v0, v1, p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 23
    .line 24
    return-object p0
.end method

.method public virtual(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 10
    .line 11
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 19
    .line 20
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPrivate()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 27
    .line 28
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 49
    .line 50
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-class v1, Ljava/lang/Object;

    .line 55
    .line 56
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    :goto_0
    return-object p0

    .line 63
    :cond_3
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;

    .line 64
    .line 65
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->INTERFACE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 71
    .line 72
    invoke-direct {v0, v1, p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_4
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;

    .line 77
    .line 78
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->VIRTUAL:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 84
    .line 85
    invoke-direct {v0, v1, p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_5
    :goto_1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 90
    .line 91
    return-object p0
.end method
