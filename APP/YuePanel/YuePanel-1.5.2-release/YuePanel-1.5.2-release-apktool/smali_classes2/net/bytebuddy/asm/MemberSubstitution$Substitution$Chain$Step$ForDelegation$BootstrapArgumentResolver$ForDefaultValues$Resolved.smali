.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Resolved;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Resolved"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final delegate:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->delegate:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iput-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    return-void
.end method


# virtual methods
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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->delegate:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->delegate:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

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

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->delegate:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x6

    iget-object v7, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v7}, Lnet/bytebuddy/description/method/MethodDescription;->isTypeInitializer()Z

    move-result v7

    if-eqz v7, :cond_0

    iget-object v7, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->delegate:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v7}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v7

    invoke-static {p1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p1

    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p2

    iget-object v8, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-static {v8}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v8

    iget-object v9, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v9}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v9

    new-array v6, v6, [Lnet/bytebuddy/utility/JavaConstant;

    aput-object v7, v6, v5

    aput-object p1, v6, v4

    aput-object p2, v6, v3

    aput-object p3, v6, v2

    aput-object v8, v6, v1

    aput-object v9, v6, v0

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v7, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->delegate:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v7}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v7

    invoke-static {p1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p1

    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p2

    iget-object v8, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-static {v8}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v8

    iget-object v9, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v9}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v9

    iget-object v10, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v10}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object v10

    check-cast v10, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v10}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object v10

    const/4 v11, 0x7

    new-array v11, v11, [Lnet/bytebuddy/utility/JavaConstant;

    aput-object v7, v11, v5

    aput-object p1, v11, v4

    aput-object p2, v11, v3

    aput-object p3, v11, v2

    aput-object v8, v11, v1

    aput-object v9, v11, v0

    aput-object v10, v11, v6

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
