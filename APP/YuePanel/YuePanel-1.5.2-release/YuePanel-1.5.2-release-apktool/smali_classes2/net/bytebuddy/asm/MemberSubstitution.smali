.class public Lnet/bytebuddy/asm/MemberSubstitution;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Source;,
        Lnet/bytebuddy/asm/MemberSubstitution$Current;,
        Lnet/bytebuddy/asm/MemberSubstitution$StubValue;,
        Lnet/bytebuddy/asm/MemberSubstitution$Unused;,
        Lnet/bytebuddy/asm/MemberSubstitution$Origin;,
        Lnet/bytebuddy/asm/MemberSubstitution$FieldSetterHandle;,
        Lnet/bytebuddy/asm/MemberSubstitution$FieldGetterHandle;,
        Lnet/bytebuddy/asm/MemberSubstitution$FieldValue;,
        Lnet/bytebuddy/asm/MemberSubstitution$SelfCallHandle;,
        Lnet/bytebuddy/asm/MemberSubstitution$AllArguments;,
        Lnet/bytebuddy/asm/MemberSubstitution$Argument;,
        Lnet/bytebuddy/asm/MemberSubstitution$This;,
        Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution;,
        Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;,
        Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final THIS_REFERENCE:I


# instance fields
.field private final failIfNoMatch:Z

.field private final methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

.field private final replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

.field private final strict:Z

.field private final typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 5
    iput-boolean p4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 6
    iput-boolean p3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 7
    iput-object p5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 6

    .line 1
    sget-object v1, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    sget-object v2, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$OfImplicitPool;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$OfImplicitPool;

    const/4 v4, 0x0

    sget-object v5, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$NoOp;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$NoOp;

    move-object v0, p0

    move v3, p1

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    return-void
.end method

.method public static relaxed()Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 2

    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Z)V

    return-object v0
.end method

.method public static strict()Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 2

    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Z)V

    return-object v0
.end method


# virtual methods
.method public constructor(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;"
        }
    .end annotation

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-interface {v0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution;->invokable(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;

    move-result-object p1

    return-object p1
.end method

.method public element(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;"
        }
    .end annotation

    new-instance v7, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedByteCodeElement;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedByteCodeElement;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v7
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution;

    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v1

    :cond_7
    return v0
.end method

.method public failIfNoMatch(Z)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 7

    new-instance v6, Lnet/bytebuddy/asm/MemberSubstitution;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    move-object v0, v6

    move v4, p1

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    return-object v6
.end method

.method public field(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;"
        }
    .end annotation

    new-instance v7, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v7
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public invokable(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;"
        }
    .end annotation

    new-instance v7, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v7
.end method

.method public method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;"
        }
    .end annotation

    new-instance v7, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v7
.end method

.method public on(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;"
        }
    .end annotation

    new-instance v0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    invoke-direct {v0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;-><init>()V

    const/4 v1, 0x1

    new-array v1, v1, [Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;->invokable(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    move-result-object p1

    return-object p1
.end method

.method public with(Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 7

    .line 2
    new-instance v6, Lnet/bytebuddy/asm/MemberSubstitution;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    move-object v0, v6

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    return-object v6
.end method

.method public with(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 7

    .line 1
    new-instance v6, Lnet/bytebuddy/asm/MemberSubstitution;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    return-object v6
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;II)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 13

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    iget-object v1, v0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    move-object/from16 v2, p5

    invoke-interface {v1, p1, p2, v2}, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/pool/TypePool;

    move-result-object v10

    new-instance v12, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;

    iget-object v5, v0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-boolean v6, v0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    iget-boolean v7, v0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    iget-object v1, v0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    invoke-interface {v1, p1, p2, v10}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

    move-result-object v8

    invoke-interface/range {p4 .. p4}, Lnet/bytebuddy/implementation/Implementation$Context;->getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;

    move-result-object v1

    sget-object v2, Lnet/bytebuddy/ClassFileVersion;->JAVA_V11:Lnet/bytebuddy/ClassFileVersion;

    invoke-virtual {v1, v2}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    move-result v11

    move-object v1, v12

    move-object/from16 v2, p3

    move-object/from16 v9, p4

    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Z)V

    return-object v12
.end method
