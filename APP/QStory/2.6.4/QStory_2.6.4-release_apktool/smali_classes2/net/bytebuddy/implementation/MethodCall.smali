.class public Lnet/bytebuddy/implementation/MethodCall;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Composable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/MethodCall$Appender;,
        Lnet/bytebuddy/implementation/MethodCall$FieldSetting;,
        Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;,
        Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;,
        Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;,
        Lnet/bytebuddy/implementation/MethodCall$TargetHandler;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader;,
        Lnet/bytebuddy/implementation/MethodCall$MethodLocator;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field protected final argumentLoaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;",
            ">;"
        }
    .end annotation
.end field

.field protected final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field protected final methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

.field protected final methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

.field protected final targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

.field protected final terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

.field protected final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;",
            "Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;",
            ">;",
            "Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;",
            "Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 17
    .line 18
    return-void
.end method

.method public static call(Ljava/util/concurrent/Callable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "*>;)",
            "Lnet/bytebuddy/implementation/Implementation$Composable;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/util/concurrent/Callable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "call"

    .line 5
    .line 6
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-static {v2}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, p0, v0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->on(Ljava/lang/Object;Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodCall;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 19
    .line 20
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 21
    .line 22
    invoke-virtual {p0, v0, v2}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    const-string v0, "Could not locate Callable::call method"

    .line 29
    .line 30
    invoke-static {v0, p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method public static construct(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lnet/bytebuddy/implementation/MethodCall;"
        }
    .end annotation

    .line 41
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->construct(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public static construct(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 9

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Lnet/bytebuddy/implementation/MethodCall;

    .line 8
    .line 9
    new-instance v2, Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForExplicitMethod;

    .line 10
    .line 11
    invoke-direct {v2, p0}, Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForExplicitMethod;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 12
    .line 13
    .line 14
    sget-object v3, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForConstructingInvocation$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForConstructingInvocation$Factory;

    .line 15
    .line 16
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 17
    .line 18
    sget-object v5, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForContextualInvocation$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForContextualInvocation$Factory;

    .line 19
    .line 20
    sget-object v6, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->RETURNING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 21
    .line 22
    sget-object v7, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 23
    .line 24
    sget-object v8, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 25
    .line 26
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    const-string v0, "Not a constructor: "

    .line 31
    .line 32
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static invoke(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;"
        }
    .end annotation

    .line 11
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object p0

    return-object p0
.end method

.method public static invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;
    .locals 1

    .line 12
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForExplicitMethod;

    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForExplicitMethod;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object p0

    return-object p0
.end method

.method public static invoke(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;
    .locals 1

    .line 15
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;)V

    return-object v0
.end method

.method public static invoke(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;"
        }
    .end annotation

    .line 13
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object p0

    return-object p0
.end method

.method public static invoke(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;
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
            "Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;"
        }
    .end annotation

    .line 14
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForElementMatcher$Factory;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForElementMatcher$Factory;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)V

    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object p0

    return-object p0
.end method

.method public static invokeSelf()Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForInstrumentedMethod;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForInstrumentedMethod;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static invokeSuper()Lnet/bytebuddy/implementation/MethodCall;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/implementation/MethodCall;->invokeSelf()Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onSuper()Lnet/bytebuddy/implementation/MethodCall;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static run(Ljava/lang/Runnable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Runnable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "run"

    .line 5
    .line 6
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-static {v2}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, p0, v0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->on(Ljava/lang/Object;Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodCall;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 19
    .line 20
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 21
    .line 22
    invoke-virtual {p0, v0, v2}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    const-string v0, "Could not locate Runnable::run method"

    .line 29
    .line 30
    invoke-static {v0, p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method


# virtual methods
.method public andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 9

    .line 35
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    new-instance v1, Lnet/bytebuddy/implementation/MethodCall;

    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    sget-object v6, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->DROPPING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v8, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    invoke-direct {v0, v1, p1}, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;-><init>(Lnet/bytebuddy/implementation/Implementation;Lnet/bytebuddy/implementation/Implementation$Composable;)V

    return-object v0
.end method

.method public andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/MethodCall;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    .line 12
    .line 13
    sget-object v6, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->DROPPING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 16
    .line 17
    iget-object v8, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 18
    .line 19
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x2

    .line 23
    new-array p0, p0, [Lnet/bytebuddy/implementation/Implementation;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aput-object v1, p0, v2

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    aput-object p1, p0, v1

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/Implementation$Compound;-><init>([Lnet/bytebuddy/implementation/Implementation;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$Appender;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 4
    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v1, v2}, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lnet/bytebuddy/implementation/MethodCall$Appender;-><init>(Lnet/bytebuddy/implementation/MethodCall;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;)V

    .line 14
    .line 15
    .line 16
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/MethodCall;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 78
    .line 79
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 89
    .line 90
    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_9

    .line 97
    .line 98
    return v1

    .line 99
    :cond_9
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

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
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v0

    .line 63
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public setsField(Ljava/lang/reflect/Field;)Lnet/bytebuddy/implementation/MethodCall$FieldSetting;
    .locals 1

    .line 29
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->setsField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/MethodCall$FieldSetting;

    move-result-object p0

    return-object p0
.end method

.method public setsField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/MethodCall$FieldSetting;
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/MethodCall;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    .line 12
    .line 13
    new-instance v6, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$FieldSetting$Explicit;

    .line 14
    .line 15
    invoke-direct {v6, p1}, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$FieldSetting$Explicit;-><init>(Lnet/bytebuddy/description/field/FieldDescription;)V

    .line 16
    .line 17
    .line 18
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 19
    .line 20
    iget-object v8, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 21
    .line 22
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;-><init>(Lnet/bytebuddy/implementation/MethodCall;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public setsField(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/MethodCall$FieldSetting;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;)",
            "Lnet/bytebuddy/implementation/MethodCall$FieldSetting;"
        }
    .end annotation

    .line 30
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;

    new-instance v1, Lnet/bytebuddy/implementation/MethodCall;

    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    new-instance v6, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$FieldSetting$Implicit;

    invoke-direct {v6, p1}, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$FieldSetting$Implicit;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v8, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;-><init>(Lnet/bytebuddy/implementation/MethodCall;)V

    return-object v0
.end method

.method public with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;",
            ">;)",
            "Lnet/bytebuddy/implementation/MethodCall;"
        }
    .end annotation

    .line 53
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 54
    invoke-static {v3, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 0

    .line 50
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/implementation/MethodCall;->with(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 1

    .line 51
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDefinition;)V

    const/4 p1, 0x1

    new-array p1, p1, [Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    const/4 p2, 0x0

    aput-object v0, p1, p2

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->with([Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public varargs with([Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 4

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 43
    invoke-static {v3}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->of(Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public varargs with([Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;

    .line 14
    .line 15
    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forEnumeration(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-interface {v3}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getEnumerationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v4, v5, v3}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public varargs with([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 6

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 39
    new-instance v4, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;

    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v3

    const-class v5, Ljava/lang/Class;

    invoke-direct {v4, v3, v5}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public varargs with([Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 0

    .line 52
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public varargs with([Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 6

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 47
    new-instance v4, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;

    invoke-interface {v3}, Lnet/bytebuddy/utility/ConstantValue;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v5

    invoke-interface {v3}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDefinition;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public varargs with([Lnet/bytebuddy/utility/JavaConstant;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 0

    .line 49
    check-cast p1, [Lnet/bytebuddy/utility/ConstantValue;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->with([Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public withAllArguments()Lnet/bytebuddy/implementation/MethodCall;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 3
    .line 4
    sget-object v1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with([Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;)Lnet/bytebuddy/implementation/MethodCall;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public varargs withArgument([I)Lnet/bytebuddy/implementation/MethodCall;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget v3, p1, v2

    .line 12
    .line 13
    if-ltz v3, :cond_0

    .line 14
    .line 15
    new-instance v4, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;

    .line 16
    .line 17
    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "Negative index: "

    .line 27
    .line 28
    invoke-static {v3, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public withArgumentArray()Lnet/bytebuddy/implementation/MethodCall;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 3
    .line 4
    sget-object v1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with([Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;)Lnet/bytebuddy/implementation/MethodCall;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public withArgumentArrayElements(I)Lnet/bytebuddy/implementation/MethodCall;
    .locals 2

    if-ltz p1, :cond_0

    .line 68
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfInvokedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfInvokedMethod;-><init>(I)V

    const/4 p1, 0x1

    new-array p1, p1, [Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->with([Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0

    .line 69
    :cond_0
    const-string p0, "A parameter index cannot be negative: "

    .line 70
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 71
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public withArgumentArrayElements(II)Lnet/bytebuddy/implementation/MethodCall;
    .locals 1

    const/4 v0, 0x0

    .line 67
    invoke-virtual {p0, p1, v0, p2}, Lnet/bytebuddy/implementation/MethodCall;->withArgumentArrayElements(III)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public withArgumentArrayElements(III)Lnet/bytebuddy/implementation/MethodCall;
    .locals 4

    .line 1
    if-ltz p1, :cond_4

    .line 2
    .line 3
    if-ltz p2, :cond_3

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-ltz p3, :cond_2

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, p3, :cond_1

    .line 17
    .line 18
    new-instance v2, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfParameter;

    .line 19
    .line 20
    add-int v3, p2, v1

    .line 21
    .line 22
    invoke-direct {v2, p1, v3}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfParameter;-><init>(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_2
    const-string p0, "Size cannot be negative: "

    .line 37
    .line 38
    invoke-static {p3, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_3
    const-string p0, "An array index cannot be negative: "

    .line 48
    .line 49
    invoke-static {p2, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    const-string p0, "A parameter index cannot be negative: "

    .line 58
    .line 59
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1
.end method

.method public withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    move-object v7, p2

    .line 15
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public varargs withField(Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;[Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p2

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p2

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p2, v2

    .line 12
    .line 13
    new-instance v4, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForField$Factory;

    .line 14
    .line 15
    invoke-direct {v4, v3, p1}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForField$Factory;-><init>(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public varargs withField([Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 1

    .line 29
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;

    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/implementation/MethodCall;->withField(Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;[Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public withMethodCall(Lnet/bytebuddy/implementation/MethodCall;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall$Factory;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall$Factory;-><init>(Lnet/bytebuddy/implementation/MethodCall;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    new-array p1, p1, [Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aput-object v0, p1, v1

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->with([Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;)Lnet/bytebuddy/implementation/MethodCall;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public withOwnType()Lnet/bytebuddy/implementation/MethodCall;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 3
    .line 4
    sget-object v1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForInstrumentedType$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForInstrumentedType$Factory;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with([Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;)Lnet/bytebuddy/implementation/MethodCall;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public varargs withReference([Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    sget-object v3, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForNullConstant;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForNullConstant;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    new-instance v4, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForInstance$Factory;

    .line 19
    .line 20
    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForInstance$Factory;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object v3, v4

    .line 24
    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public withThis()Lnet/bytebuddy/implementation/MethodCall;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 3
    .line 4
    sget-object v1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForThisReference$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForThisReference$Factory;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall;->with([Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;)Lnet/bytebuddy/implementation/MethodCall;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
