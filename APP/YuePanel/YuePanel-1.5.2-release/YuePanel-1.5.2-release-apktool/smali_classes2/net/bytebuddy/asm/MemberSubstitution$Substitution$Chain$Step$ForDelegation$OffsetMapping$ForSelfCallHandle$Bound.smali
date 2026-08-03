.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Bound"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final source:Lnet/bytebuddy/asm/MemberSubstitution$Source;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/MemberSubstitution$Source;Lnet/bytebuddy/description/method/MethodDescription;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/Map;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
        }
    .end annotation

    const/4 p1, 0x2

    const/4 p4, 0x1

    const/4 p5, 0x0

    iget-object p8, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {p8, p3, p7, p2, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Source;->self(Lnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;

    move-result-object p8

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    const/4 v1, 0x0

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    move-object v2, p3

    move-object v3, p7

    move-object v4, p2

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution$Source;->arguments(ZLnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;

    move-result-object p2

    new-instance p3, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p7

    if-nez p8, :cond_0

    move v0, p5

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    add-int/2addr p7, v0

    add-int/2addr p7, p4

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, p4

    add-int/2addr p7, v0

    invoke-direct {p3, p7}, Ljava/util/ArrayList;-><init>(I)V

    iget-object p7, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {p7, p6, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Source;->handle(Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object p6

    invoke-virtual {p6}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p6

    invoke-interface {p3, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p8, :cond_1

    invoke-virtual {p8}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p6

    invoke-static {p6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    move-result-object p6

    invoke-virtual {p8}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;->getOffset()I

    move-result p7

    invoke-virtual {p6, p7}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p6

    invoke-interface {p3, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p6, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    sget-object p7, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {p7}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p8

    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$Token;

    invoke-virtual {p7}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p7

    invoke-interface {p7}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p7

    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    const-class v2, Ljava/lang/Object;

    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    new-array v3, p4, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v2, v3, p5

    invoke-direct {v1, v3}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    const-string v2, "bindTo"

    invoke-direct {v0, v2, p4, p7, v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    invoke-direct {p6, p8, v0}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    invoke-static {p6}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object p6

    invoke-interface {p3, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p6

    if-nez p6, :cond_3

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;

    invoke-virtual {p6}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p7

    invoke-static {p7}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    move-result-object p7

    invoke-virtual {p6}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;->getOffset()I

    move-result p6

    invoke-virtual {p7, p6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p6

    invoke-interface {p3, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p2, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    sget-object p6, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {p6}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p6

    new-instance p7, Lnet/bytebuddy/description/method/MethodDescription$Token;

    sget-object p8, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {p8}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-virtual {p8}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p8

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    const-class v3, [Ljava/lang/Object;

    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object p8, v4, p5

    aput-object v2, v4, p4

    aput-object v3, v4, p1

    invoke-direct {v1, v4}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    const-string p1, "insertArguments"

    const/16 p4, 0x9

    invoke-direct {p7, p1, p4, v0, v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    invoke-direct {p2, p6, p7}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    invoke-static {p2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {p1, p3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    return-object p1
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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
