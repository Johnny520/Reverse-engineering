.class public Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Delegator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Delegator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForDynamicInvocation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private final resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

.field private final signatureToken:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->signatureToken:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

    .line 9
    .line 10
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/asm/Advice$Delegator$Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/asm/Advice$Delegator$Factory;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isInvokeBootstrap()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation$Factory;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation$Factory;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const-string p1, "Not a suitable bootstrap target: "

    .line 14
    .line 15
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 8
    .line 9
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeList$Explicit;->of(Ljava/util/List;)Lnet/bytebuddy/description/type/TypeList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/method/MethodDescription;->isInvokeBootstrap(Ljava/util/List;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->signatureToken:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 26
    .line 27
    invoke-virtual {v0}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->signatureToken:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 32
    .line 33
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->signatureToken:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 38
    .line 39
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getParameterTypes()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {p2, v0, v1, p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->dynamic(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_0
    const-string p0, "Cannot invoke "

    .line 49
    .line 50
    const-string p2, " with arguments: "

    .line 51
    .line 52
    invoke-static {p0, v0, p2, p1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public assertVisibility(Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 11
    .line 12
    const-string v0, " is not visible to "

    .line 13
    .line 14
    invoke-static {p0, v0, p1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->signatureToken:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->signatureToken:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

    .line 45
    .line 46
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

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

.method public getTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->signatureToken:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->asTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->signatureToken:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 19
    .line 20
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v2

    .line 33
    return p0
.end method
