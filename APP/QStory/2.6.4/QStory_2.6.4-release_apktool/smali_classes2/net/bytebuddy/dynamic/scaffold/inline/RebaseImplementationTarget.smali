.class public Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;
.super Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget$Factory;,
        Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget$RebasedMethodInvocation;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final rebaseableMethods:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;",
            "Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase$DefaultMethodInvocation;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;",
            "Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase$DefaultMethodInvocation;",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;",
            "Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase$DefaultMethodInvocation;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;->rebaseableMethods:Ljava/util/Map;

    .line 5
    .line 6
    return-void
.end method

.method private invokeSuper(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;->getSort()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->isResolved()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;->getRepresentative()Lnet/bytebuddy/description/method/MethodDescription;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p1, p0}, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->of(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Illegal;

    .line 33
    .line 34
    return-object p0
.end method

.method private invokeSuper(Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;
    .locals 1

    .line 39
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;->isRebased()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;->getResolvedMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    move-result-object v0

    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {p1}, Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;->getAppendedParameters()Lnet/bytebuddy/description/type/TypeList;

    move-result-object p1

    invoke-static {v0, p0, p1}, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget$RebasedMethodInvocation;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    move-result-object p0

    return-object p0

    .line 41
    :cond_0
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;->getResolvedMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    move-result-object p1

    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-static {p1, p0}, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->of(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver;)Lnet/bytebuddy/implementation/Implementation$Target;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;

    .line 2
    .line 3
    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase$DefaultMethodInvocation;->of(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase$DefaultMethodInvocation;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p3}, Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver;->asTokenMap()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-direct {v0, p0, p1, p2, p3}, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase$DefaultMethodInvocation;Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;->rebaseableMethods:Ljava/util/Map;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;->rebaseableMethods:Ljava/util/Map;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public bridge synthetic getOriginType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;->getOriginType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getOriginType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    return-object p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;->rebaseableMethods:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public invokeSuper(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;
    .locals 1

    .line 35
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;->rebaseableMethods:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;

    if-nez v0, :cond_0

    .line 36
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 37
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;->getSuperClassGraph()Lnet/bytebuddy/dynamic/scaffold/MethodGraph;

    move-result-object v0

    invoke-interface {v0, p1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph;->locate(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;->invokeSuper(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    move-result-object p0

    return-object p0

    .line 38
    :cond_0
    invoke-direct {p0, v0}, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseImplementationTarget;->invokeSuper(Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    move-result-object p0

    return-object p0
.end method
