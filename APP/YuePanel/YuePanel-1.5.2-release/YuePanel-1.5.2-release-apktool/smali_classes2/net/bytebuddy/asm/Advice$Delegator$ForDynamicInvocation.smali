.class public Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;
.super Ljava/lang/Object;
.source "SourceFile"

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
.field private final adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private final bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private final resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

    return-void
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/Advice$Delegator$Factory;
    .locals 2

    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isInvokeBootstrap()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation$Factory;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation$Factory;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not a suitable bootstrap target: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 3

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

    invoke-interface {v0, p1, p2}, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeList$Explicit;->of(Ljava/util/List;)Lnet/bytebuddy/description/type/TypeList;

    move-result-object v0

    invoke-interface {p2, v0}, Lnet/bytebuddy/description/method/MethodDescription;->isInvokeBootstrap(Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {p2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object p2

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    move-result-object v2

    invoke-interface {p2, v0, v1, v2, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->dynamic(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot invoke "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " with arguments: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    check-cast p1, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;

    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->bootstrapMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->resolver:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
