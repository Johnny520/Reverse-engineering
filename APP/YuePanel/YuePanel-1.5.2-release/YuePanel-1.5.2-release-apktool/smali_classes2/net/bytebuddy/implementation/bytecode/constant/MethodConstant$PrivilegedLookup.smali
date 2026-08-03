.class public Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.implements Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CanCache;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PrivilegedLookup"
.end annotation


# instance fields
.field private final methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private final methodName:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iput-object p2, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodName:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 10

    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;->DO_PRIVILEGED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v1}, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->of(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;

    move-result-object v1

    invoke-interface {p2, v1}, Lnet/bytebuddy/implementation/Implementation$Context;->register(Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v3

    iget-object v4, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v4}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-static {v4}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v4

    iget-object v5, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodName:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const-class v6, Ljava/lang/Class;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v6

    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v7}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    move-result-object v7

    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;->typeConstantsFor(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6, v7}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v6

    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v1

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v7

    invoke-interface {v1, v7}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v1

    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v0

    iget-object v7, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v7}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v7

    if-eqz v7, :cond_0

    const-class v7, Ljava/lang/reflect/Constructor;

    goto :goto_0

    :cond_0
    const-class v7, Ljava/lang/reflect/Method;

    :goto_0
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/assign/TypeCasting;->to(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v7

    const/16 v8, 0x8

    new-array v8, v8, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v9, 0x0

    aput-object v3, v8, v9

    sget-object v3, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    const/4 v9, 0x1

    aput-object v3, v8, v9

    const/4 v3, 0x2

    aput-object v4, v8, v3

    const/4 v3, 0x3

    aput-object v5, v8, v3

    const/4 v3, 0x4

    aput-object v6, v8, v3

    const/4 v3, 0x5

    aput-object v1, v8, v3

    const/4 v1, 0x6

    aput-object v0, v8, v1

    const/4 v0, 0x7

    aput-object v7, v8, v0

    invoke-direct {v2, v8}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    invoke-virtual {v2, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Privileged method invocation is not supported on the current VM"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public cached()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CachedConstructor;

    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CachedConstructor;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CachedMethod;

    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CachedMethod;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;

    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object p1, p1, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isValid()Z
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$PrivilegedLookup;->methodName:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    move-result v0

    return v0
.end method
