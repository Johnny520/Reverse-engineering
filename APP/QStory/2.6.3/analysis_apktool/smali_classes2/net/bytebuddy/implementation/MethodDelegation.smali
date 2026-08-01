.class public Lnet/bytebuddy/implementation/MethodDelegation;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Composable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;,
        Lnet/bytebuddy/implementation/MethodDelegation$Appender;,
        Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

.field private final implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

.field private final parameterBinders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
            "*>;>;",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;",
            ")V"
        }
    .end annotation

    .line 17
    sget-object v4, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler$Default;->RETURNING:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler$Default;

    sget-object v6, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/MethodDelegation;-><init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    return-void
.end method

.method private constructor <init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
            "*>;>;",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodDelegation;->implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->parameterBinders:Ljava/util/List;

    .line 7
    .line 8
    iput-object p4, p0, Lnet/bytebuddy/implementation/MethodDelegation;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 9
    .line 10
    iput-object p3, p0, Lnet/bytebuddy/implementation/MethodDelegation;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/implementation/MethodDelegation;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/implementation/MethodDelegation;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 15
    .line 16
    return-void
.end method

.method public static to(Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/MethodDelegation;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodDelegation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static to(Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 11
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 13
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 14
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 15
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 17
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 18
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Ljava/lang/reflect/Type;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 16
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Ljava/lang/reflect/Type;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 19
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 21
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 22
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 20
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Object;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 12
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Ljava/lang/Object;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static to(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 10
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->to(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static toConstructor(Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/MethodDelegation;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toConstructor(Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodDelegation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static toConstructor(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 10
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toConstructor(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static toField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 10
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 12
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 11
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static toMethodReturnOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toMethodReturnOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodDelegation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static toMethodReturnOf(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;
    .locals 1

    .line 10
    invoke-static {}, Lnet/bytebuddy/implementation/MethodDelegation;->withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;->toMethodReturnOf(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodDelegation;

    move-result-object p0

    return-object p0
.end method

.method public static withDefaultConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;->DEFAULT:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder;->DEFAULTS:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;-><init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static withEmptyConfiguration()Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$NoOp;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$NoOp;

    .line 4
    .line 5
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/MethodDelegation$WithCustomProperties;-><init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 8

    .line 33
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    new-instance v1, Lnet/bytebuddy/implementation/MethodDelegation;

    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodDelegation;->parameterBinders:Ljava/util/List;

    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodDelegation;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    sget-object v5, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler$Default;->DROPPING:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler$Default;

    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodDelegation;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodDelegation;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/MethodDelegation;-><init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    invoke-direct {v0, v1, p1}, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;-><init>(Lnet/bytebuddy/implementation/Implementation;Lnet/bytebuddy/implementation/Implementation$Composable;)V

    return-object v0
.end method

.method public andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/MethodDelegation;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodDelegation;->parameterBinders:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodDelegation;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 10
    .line 11
    sget-object v5, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler$Default;->DROPPING:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler$Default;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodDelegation;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodDelegation;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 16
    .line 17
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/MethodDelegation;-><init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x2

    .line 21
    new-array p0, p0, [Lnet/bytebuddy/implementation/Implementation;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object v1, p0, v2

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    aput-object p1, p0, v1

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/Implementation$Compound;-><init>([Lnet/bytebuddy/implementation/Implementation;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodDelegation;->implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;->compile(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    new-instance v2, Lnet/bytebuddy/implementation/MethodDelegation$Appender;

    .line 12
    .line 13
    new-instance v4, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;

    .line 14
    .line 15
    invoke-interface {v7}, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;->getRecords()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodDelegation;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 20
    .line 21
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodDelegation;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 22
    .line 23
    invoke-direct {v4, v0, v1, v3}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;-><init>(Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)V

    .line 24
    .line 25
    .line 26
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodDelegation;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 27
    .line 28
    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodDelegation;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 29
    .line 30
    move-object v3, p1

    .line 31
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/implementation/MethodDelegation$Appender;-><init>(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;)V

    .line 32
    .line 33
    .line 34
    return-object v2
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/MethodDelegation;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation;->implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->parameterBinders:Ljava/util/List;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation;->parameterBinders:Ljava/util/List;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 78
    .line 79
    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodDelegation;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    return v0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

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
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodDelegation;->parameterBinders:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

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
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodDelegation;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr p0, v2

    .line 57
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation;->implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodDelegation;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodDelegation;->implementationDelegate:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation;->parameterBinders:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodDelegation;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodDelegation;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodDelegation;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/MethodDelegation;-><init>(Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
