.class public Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;
.super Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForMatchedDynamicInvocation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;",
        ">;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;>;"
        }
    .end annotation
.end field

.field private final handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            ">;"
        }
    .end annotation
.end field

.field private final nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            "Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;",
            "ZZ",
            "Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    .line 2
    .line 3
    .line 4
    iput-object p6, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 5
    .line 6
    iput-object p7, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 7
    .line 8
    iput-object p8, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 9
    .line 10
    iput-object p9, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 11
    .line 12
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
    invoke-super {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 63
    .line 64
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    mul-int/2addr v0, v1

    .line 8
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Lnet/bytebuddy/matcher/ElementMatcher;II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/2addr v2, v0

    .line 21
    mul-int/2addr v2, v1

    .line 22
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, v2

    .line 29
    mul-int/2addr v0, v1

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory<",
            "-",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    .line 10
    .line 11
    new-instance v5, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory$Compound;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 14
    .line 15
    new-instance v7, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation$Factory;

    .line 16
    .line 17
    iget-object v8, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 18
    .line 19
    iget-object v9, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    iget-object v10, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    iget-object v11, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 24
    .line 25
    move-object v12, p1

    .line 26
    invoke-direct/range {v7 .. v12}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation$Factory;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x2

    .line 30
    new-array p0, p0, [Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    aput-object v6, p0, p1

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    aput-object v7, p0, p1

    .line 37
    .line 38
    invoke-direct {v5, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory$Compound;-><init>([Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public withArguments(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;>;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    iget-object v8, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    invoke-interface {p0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public withName(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    invoke-interface {v7, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    iget-object v8, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    iget-object v9, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public withType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    iget-object v8, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    invoke-interface {v8, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    iget-object v9, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedDynamicInvocation;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
