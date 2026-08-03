.class public Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;
.super Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForMatchedField"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final matchRead:Z

.field private final matchWrite:Z

.field private final matcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            "Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;",
            "ZZ",
            "Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;)V"
        }
    .end annotation

    const/4 v7, 0x1

    const/4 v8, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 1
    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;ZZ)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;ZZ)V
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
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;ZZ)V"
        }
    .end annotation

    .line 2
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    .line 3
    iput-object p6, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 4
    iput-boolean p7, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchRead:Z

    .line 5
    iput-boolean p8, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchWrite:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchRead:Z

    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;

    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchRead:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchWrite:Z

    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchWrite:Z

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v1

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchRead:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchWrite:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public onRead()Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
    .locals 10

    new-instance v9, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    iget-object v6, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;ZZ)V

    return-object v9
.end method

.method public onWrite()Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;
    .locals 10

    new-instance v9, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    iget-object v5, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    iget-object v6, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;Lnet/bytebuddy/matcher/ElementMatcher;ZZ)V

    return-object v9
.end method

.method public replaceWith(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution;
    .locals 10

    new-instance v6, Lnet/bytebuddy/asm/MemberSubstitution;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->typePoolResolver:Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;

    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->strict:Z

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->failIfNoMatch:Z

    new-instance v5, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory$Compound;

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification;->replacementFactory:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    iget-object v7, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    iget-boolean v8, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchRead:Z

    iget-boolean v9, p0, Lnet/bytebuddy/asm/MemberSubstitution$WithoutSpecification$ForMatchedField;->matchWrite:Z

    invoke-static {v7, v8, v9, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->ofField(Lnet/bytebuddy/matcher/ElementMatcher;ZZLnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    move-result-object p1

    const/4 v7, 0x2

    new-array v7, v7, [Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    aput-object p1, v7, v0

    invoke-direct {v5, v7}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory$Compound;-><init>([Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberSubstitution;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;)V

    return-object v6
.end method
