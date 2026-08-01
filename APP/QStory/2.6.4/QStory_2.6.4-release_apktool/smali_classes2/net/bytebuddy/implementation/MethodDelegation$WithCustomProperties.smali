.class public Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodDelegation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithCustomProperties"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

.field private final bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

.field private final matcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final parameterBinders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
            "*>;>;)V"
        }
    .end annotation

    .line 13
    sget-object v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$Default;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$Default;

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-direct {p0, p1, p2, v0, v1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;-><init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-void
.end method

.method private constructor <init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/matcher/ElementMatcher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
            "*>;>;",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    return v0
.end method

.method public filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 8
    .line 9
    new-instance v4, Lnet/bytebuddy/matcher/ElementMatcher$Junction$Conjunction;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    new-array v5, v5, [Lnet/bytebuddy/matcher/ElementMatcher;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    aput-object p0, v5, v6

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    aput-object p1, v5, p0

    .line 21
    .line 22
    invoke-direct {v4, v5}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$Conjunction;-><init>([Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, v4}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;-><init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v2

    .line 41
    return p0
.end method

.method public to(Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/MethodDelegation;"
        }
    .end annotation

    .line 76
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 77
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 79
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2, p3}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 81
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/reflect/Type;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 85
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 0

    .line 86
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Ljava/lang/reflect/Type;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 2

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "delegate$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    invoke-static {p1}, Lnet/bytebuddy/utility/RandomString;->hashOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 84
    invoke-virtual {p0, p1, p2, v0, p3}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 87
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 91
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 8

    .line 92
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0, p1}, Lnet/bytebuddy/description/type/TypeDescription;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation;

    new-instance v1, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForField$WithInstance;

    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 94
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v7

    move-object v6, p1

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForField$WithInstance;-><init>(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Ljava/util/List;Lnet/bytebuddy/matcher/ElementMatcher;Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    iget-object p1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    iget-object p2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    invoke-direct {v0, v1, p1, p2, p0}, Lnet/bytebuddy/implementation/MethodDelegation;-><init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)V

    return-object v0

    :cond_0
    move-object v6, p1

    .line 95
    const-string p0, " is not an instance of "

    invoke-static {v6, p0, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 2

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "delegate$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    invoke-static {p1}, Lnet/bytebuddy/utility/RandomString;->hashOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-virtual {p0, p1, p2, v0, p3}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Object;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/reflect/Type;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public to(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 3

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation;

    .line 15
    .line 16
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 25
    .line 26
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {p1, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lnet/bytebuddy/description/method/MethodList;

    .line 35
    .line 36
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v1}, Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder;->of(Ljava/util/List;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {p1, v1}, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForStaticMethod;->of(Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder;)Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 47
    .line 48
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 49
    .line 50
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 51
    .line 52
    invoke-direct {v0, p1, v1, v2, p0}, Lnet/bytebuddy/implementation/MethodDelegation;-><init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_0
    const-string p0, "Cannot delegate to primitive "

    .line 57
    .line 58
    invoke-static {p0, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_1
    const-string p0, "Cannot delegate to array "

    .line 67
    .line 68
    invoke-static {p0, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v1
.end method

.method public toConstructor(Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/MethodDelegation;"
        }
    .end annotation

    .line 43
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toConstructor(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public toConstructor(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation;

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 12
    .line 13
    invoke-interface {v2, v3}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 22
    .line 23
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v2}, Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder;->of(Ljava/util/List;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {p1, v1, v2}, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForConstruction;->of(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder;)Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 34
    .line 35
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 36
    .line 37
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 38
    .line 39
    invoke-direct {v0, p1, v1, v2, p0}, Lnet/bytebuddy/implementation/MethodDelegation;-><init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public toField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 27
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 25
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForField$WithLookup;

    .line 4
    .line 5
    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 6
    .line 7
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    move-object v6, p2

    .line 11
    move-object v3, p3

    .line 12
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForField$WithLookup;-><init>(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Ljava/util/List;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 16
    .line 17
    iget-object p2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 18
    .line 19
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 20
    .line 21
    invoke-direct {v0, v1, p1, p2, p0}, Lnet/bytebuddy/implementation/MethodDelegation;-><init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 26
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;

    invoke-virtual {p0, p1, v0, p2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public toMethodReturnOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 22
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toMethodReturnOf(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public toMethodReturnOf(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForMethodReturn;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 8
    .line 9
    invoke-direct {v1, p1, p2, v2, v3}, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForMethodReturn;-><init>(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Ljava/util/List;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 13
    .line 14
    iget-object p2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 15
    .line 16
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 17
    .line 18
    invoke-direct {v0, v1, p1, p2, p0}, Lnet/bytebuddy/implementation/MethodDelegation;-><init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public withBinders(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
            "*>;>;)",
            "Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {v2, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 14
    .line 15
    invoke-direct {v0, v1, p1, v2, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;-><init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public varargs withBinders([Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder;)Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
            "*>;)",
            "Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;"
        }
    .end annotation

    .line 19
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->withBinders(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object p0

    return-object p0
.end method

.method public withBindingResolver(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;-><init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public withResolvers(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;",
            ">;)",
            "Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Compound;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 6
    .line 7
    invoke-static {v2, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v1, p1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Compound;-><init>(Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->parameterBinders:Ljava/util/List;

    .line 15
    .line 16
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 17
    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 19
    .line 20
    invoke-direct {v0, v1, p1, v2, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;-><init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public varargs withResolvers([Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;)Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;
    .locals 0

    .line 24
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->withResolvers(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object p0

    return-object p0
.end method
