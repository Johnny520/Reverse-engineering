.class public abstract Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "WithoutSpecification"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;,
        Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;,
        Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedByteCodeElement;,
        Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field protected final failIfNoMatch:Z

.field protected final methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

.field protected final replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

.field protected final strict:Z

.field protected final typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 7
    .line 8
    iput-boolean p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 13
    .line 14
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 48
    .line 49
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 59
    .line 60
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_7

    .line 67
    .line 68
    return v1

    .line 69
    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 2

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
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    .line 30
    .line 31
    add-int/2addr v0, v1

    .line 32
    mul-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    .line 35
    .line 36
    add-int/2addr v0, v1

    .line 37
    mul-int/lit8 v0, v0, 0x1f

    .line 38
    .line 39
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    add-int/2addr p0, v0

    .line 46
    return p0
.end method

.method public replaceWith(Ljava/lang/reflect/Field;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1

    .line 26
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/asm/MemberSubstitution;

    move-result-object p0

    return-object p0
.end method

.method public replaceWith(Ljava/lang/reflect/Method;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1

    .line 28
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution;

    move-result-object p0

    return-object p0
.end method

.method public abstract replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory<",
            "-TT;>;)",
            "Lnet/bytebuddy/asm/MemberSubstitution;"
        }
    .end annotation
.end method

.method public replaceWith(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1

    .line 27
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForFieldAccess$OfGivenField;

    invoke-direct {v0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForFieldAccess$OfGivenField;-><init>(Lnet/bytebuddy/description/field/FieldDescription;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;

    move-result-object p0

    return-object p0
.end method

.method public replaceWith(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForMethodInvocation$OfGivenMethod;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForMethodInvocation$OfGivenMethod;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "Cannot use "

    .line 18
    .line 19
    const-string v0, " as a replacement"

    .line 20
    .line 21
    invoke-static {p1, p0, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public replaceWithChain(Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory<",
            "-TT;>;>;)",
            "Lnet/bytebuddy/asm/MemberSubstitution;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain;->withDefaultAssigner()Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->executing(Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final varargs replaceWithChain([Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory<",
            "-TT;>;)",
            "Lnet/bytebuddy/asm/MemberSubstitution;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/SafeVarargsPlugin$Enhance;
    .end annotation

    .line 14
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWithChain(Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution;

    move-result-object p0

    return-object p0
.end method

.method public replaceWithConstant(Ljava/lang/Object;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 2

    .line 1
    invoke-static {p1}, Lnet/bytebuddy/utility/ConstantValue$Simple;->wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForValue;

    .line 6
    .line 7
    invoke-interface {p1}, Lnet/bytebuddy/utility/ConstantValue;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {p1}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {v0, v1, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForValue;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public replaceWithField(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForFieldAccess$OfMatchedField;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForFieldAccess$OfMatchedField;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public replaceWithInstrumentedMethod()Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public replaceWithMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWithMethod(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution;

    move-result-object p0

    return-object p0
.end method

.method public replaceWithMethod(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForMethodInvocation$OfMatchedMethod;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$ForMethodInvocation$OfMatchedMethod;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public stub()Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Stubbing;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Stubbing;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
