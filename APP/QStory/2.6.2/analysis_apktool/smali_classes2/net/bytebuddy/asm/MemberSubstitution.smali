.class public Lnet/bytebuddy/asm/MemberSubstitution;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$LambdaMetaFactoryMatcher;,
        Lnet/bytebuddy/asm/MemberSubstitution$Source;,
        Lnet/bytebuddy/asm/MemberSubstitution$Current;,
        Lnet/bytebuddy/asm/MemberSubstitution$StubValue;,
        Lnet/bytebuddy/asm/MemberSubstitution$Unused;,
        Lnet/bytebuddy/asm/MemberSubstitution$Origin;,
        Lnet/bytebuddy/asm/MemberSubstitution$FieldSetterHandle;,
        Lnet/bytebuddy/asm/MemberSubstitution$FieldGetterHandle;,
        Lnet/bytebuddy/asm/MemberSubstitution$FieldValue;,
        Lnet/bytebuddy/asm/MemberSubstitution$DynamicConstant;,
        Lnet/bytebuddy/asm/MemberSubstitution$Handle;,
        Lnet/bytebuddy/asm/MemberSubstitution$SelfCallHandle;,
        Lnet/bytebuddy/asm/MemberSubstitution$AllArguments;,
        Lnet/bytebuddy/asm/MemberSubstitution$Argument;,
        Lnet/bytebuddy/asm/MemberSubstitution$This;,
        Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution;,
        Lnet/bytebuddy/asm/MemberSubstitution$Target;,
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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 7
    .line 8
    iput-boolean p4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 9
    .line 10
    iput-boolean p3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 6

    .line 15
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

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static strict()Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Z)V

    .line 5
    .line 6
    .line 7
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
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution;->invokable(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public dynamic(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 12
    .line 13
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    move-object v6, p1

    .line 26
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public element(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedByteCodeElement;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedByteCodeElement;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 48
    .line 49
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 59
    .line 60
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

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

.method public failIfNoMatch(Z)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 8
    .line 9
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 10
    .line 11
    move v4, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public field(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;
    .locals 7
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

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

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
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

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
    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 30
    .line 31
    add-int/2addr v0, v1

    .line 32
    mul-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 35
    .line 36
    add-int/2addr v0, v1

    .line 37
    mul-int/lit8 v0, v0, 0x1f

    .line 38
    .line 39
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

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

.method public invokable(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public lambdaExpression()Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$LambdaMetaFactoryMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/asm/MemberSubstitution$LambdaMetaFactoryMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution;->dynamic(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;
    .locals 7
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

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedMethod;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object p0, v1, v2

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;->invokable(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public with(Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 6

    .line 16
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution;

    .line 2
    .line 3
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 4
    .line 5
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 6
    .line 7
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 8
    .line 9
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;II)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 11

    .line 1
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 2
    .line 3
    move-object/from16 v4, p5

    .line 4
    .line 5
    invoke-interface {v1, p1, p2, v4}, Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/pool/TypePool;

    .line 6
    .line 7
    .line 8
    move-result-object v9

    .line 9
    new-instance v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;

    .line 10
    .line 11
    iget-object v4, p0, Lnet/bytebuddy/asm/MemberSubstitution;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 12
    .line 13
    iget-boolean v5, p0, Lnet/bytebuddy/asm/MemberSubstitution;->strict:Z

    .line 14
    .line 15
    iget-boolean v6, p0, Lnet/bytebuddy/asm/MemberSubstitution;->failIfNoMatch:Z

    .line 16
    .line 17
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2, v9}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-interface {p4}, Lnet/bytebuddy/implementation/Implementation$Context;->getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v8, Lnet/bytebuddy/ClassFileVersion;->JAVA_V11:Lnet/bytebuddy/ClassFileVersion;

    .line 28
    .line 29
    invoke-virtual {v0, v8}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    move-object v2, p1

    .line 34
    move-object v3, p2

    .line 35
    move-object v8, p4

    .line 36
    move-object v0, v1

    .line 37
    move-object v1, p3

    .line 38
    invoke-direct/range {v0 .. v10}, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Z)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method
