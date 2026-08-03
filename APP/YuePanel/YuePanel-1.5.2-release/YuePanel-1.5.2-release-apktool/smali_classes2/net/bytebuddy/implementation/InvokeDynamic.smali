.class public Lnet/bytebuddy/implementation/InvokeDynamic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Composable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/InvokeDynamic$Appender;,
        Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;,
        Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;,
        Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;,
        Lnet/bytebuddy/implementation/InvokeDynamic$AbstractDelegator;,
        Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;,
        Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field protected final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation
.end field

.field protected final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field protected final bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field protected final invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

.field protected final terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

.field protected final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;",
            "Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iput-object p2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iput-object p3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    iput-object p4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iput-object p5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iput-object p6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    return-void
.end method

.method public static bootstrap(Ljava/lang/reflect/Constructor;Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;"
        }
    .end annotation

    .line 4
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;

    move-result-object p0

    return-object p0
.end method

.method public static varargs bootstrap(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;[",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;"
        }
    .end annotation

    .line 3
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;

    move-result-object p0

    return-object p0
.end method

.method public static bootstrap(Ljava/lang/reflect/Method;Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;"
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {v0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;

    move-result-object p0

    return-object p0
.end method

.method public static varargs bootstrap(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {v0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;

    move-result-object p0

    return-object p0
.end method

.method public static bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;"
        }
    .end annotation

    .line 6
    invoke-static {p1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->wrap(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 7
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeList$Explicit;->of(Ljava/util/List;)Lnet/bytebuddy/description/type/TypeList;

    move-result-object p1

    invoke-interface {p0, p1}, Lnet/bytebuddy/description/method/MethodDescription;->isInvokeBootstrap(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;

    new-instance v3, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;

    invoke-direct {v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;-><init>()V

    sget-object v4, Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;->RETURNING:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    sget-object v5, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    sget-object v6, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not a valid bootstrap method "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " for "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static varargs bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;
    .locals 0

    .line 5
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;

    move-result-object p0

    return-object p0
.end method

.method public static lambda(Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    invoke-static {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic;->lambda(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;

    move-result-object p0

    return-object p0
.end method

.method public static lambda(Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
    .locals 1

    .line 2
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    invoke-static {v0, p0, p2}, Lnet/bytebuddy/implementation/InvokeDynamic;->lambda(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;

    move-result-object p0

    return-object p0
.end method

.method public static lambda(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
    .locals 1

    .line 3
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler$Default;->forJavaHierarchy()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic;->lambda(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;

    move-result-object p0

    return-object p0
.end method

.method public static lambda(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
    .locals 16

    move-object/from16 v0, p1

    .line 4
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object/from16 v1, p2

    .line 5
    invoke-interface {v1, v0}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->compile(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    move-result-object v1

    .line 6
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph;->listNodes()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->asMethodList()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v1

    .line 8
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isAbstract()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v2

    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 10
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    new-instance v5, Lnet/bytebuddy/description/type/TypeDescription$Latent;

    const-class v2, Ljava/lang/Object;

    .line 11
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Lnet/bytebuddy/description/type/TypeDescription$Generic;

    const-string v6, "java.lang.invoke.LambdaMetafactory"

    invoke-direct {v5, v6, v3, v2, v4}, Lnet/bytebuddy/description/type/TypeDescription$Latent;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;[Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 12
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    sget-object v2, Lnet/bytebuddy/utility/JavaType;->CALL_SITE:Lnet/bytebuddy/utility/JavaType;

    .line 13
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v9

    new-instance v10, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    sget-object v2, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 14
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    invoke-direct {v10, v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v11, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    const-class v2, Ljava/lang/String;

    .line 15
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    invoke-direct {v11, v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v12, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    sget-object v2, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

    .line 16
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    invoke-direct {v12, v3}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v13, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 17
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    invoke-direct {v13, v3}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v14, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    sget-object v3, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 18
    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    invoke-direct {v14, v3}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v15, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 19
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    invoke-direct {v15, v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    filled-new-array/range {v10 .. v15}, [Lnet/bytebuddy/description/method/ParameterDescription$Token;

    move-result-object v2

    .line 20
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    .line 21
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    .line 22
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v12

    sget-object v13, Lnet/bytebuddy/description/annotation/AnnotationValue;->UNDEFINED:Lnet/bytebuddy/description/annotation/AnnotationValue;

    sget-object v14, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    const-string v6, "metafactory"

    const/16 v7, 0x9

    move-object v4, v0

    invoke-direct/range {v4 .. v14}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;ILjava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 23
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodList;->asDefined()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-static {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofSignature(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    move-result-object v2

    .line 24
    invoke-static/range {p0 .. p0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object v3

    .line 25
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-static {v4}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofSignature(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v2

    .line 26
    invoke-static {v0, v2}, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;

    move-result-object v0

    .line 27
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodList;->asDefined()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;->invoke(Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;

    move-result-object v0

    return-object v0

    .line 28
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not define exactly one abstract method: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 29
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is not an interface type"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 9

    .line 2
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    new-instance v8, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    sget-object v5, Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;->DROPPING:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    invoke-direct {v0, v8, p1}, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;-><init>(Lnet/bytebuddy/implementation/Implementation;Lnet/bytebuddy/implementation/Implementation$Composable;)V

    return-object v0
.end method

.method public andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound;

    new-instance v8, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    sget-object v5, Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;->DROPPING:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lnet/bytebuddy/implementation/Implementation;

    const/4 v2, 0x0

    aput-object v8, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/Implementation$Compound;-><init>([Lnet/bytebuddy/implementation/Implementation;)V

    return-object v0
.end method

.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 1

    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;

    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;-><init>(Lnet/bytebuddy/implementation/InvokeDynamic;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    check-cast p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object p1, p1, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v1

    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    move-result-object p1

    return-object p1
.end method

.method public withArgument(I)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;
    .locals 9

    if-ltz p1, :cond_0

    .line 7
    new-instance v8, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType$OfArgument;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v0, v8

    move v7, p1

    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType$OfArgument;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;I)V

    return-object v8

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Method parameter indices cannot be negative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public varargs withArgument([I)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget v3, p1, v2

    if-ltz v3, :cond_0

    .line 3
    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter;-><init>(I)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Method parameter indices cannot be negative: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 6
    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v4

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 8

    new-instance v7, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    move-object v0, v7

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object v7
.end method

.method public varargs withBooleanValue([Z)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-boolean v3, p1, v2

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForBooleanConstant;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForBooleanConstant;-><init>(Z)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withByteValue([B)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-byte v3, p1, v2

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForByteConstant;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForByteConstant;-><init>(B)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withCharacterValue([C)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-char v3, p1, v2

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForCharacterConstant;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForCharacterConstant;-><init>(C)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withDoubleValue([D)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-wide v3, p1, v2

    new-instance v5, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForDoubleConstant;

    invoke-direct {v5, v3, v4}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForDoubleConstant;-><init>(D)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withEnumeration([Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue;-><init>(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public withField(Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;
    .locals 1

    .line 7
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic;->withField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;

    move-result-object p1

    return-object p1
.end method

.method public withField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;
    .locals 10

    .line 8
    new-instance v9, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType$OfField;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v0, v9

    move-object v7, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType$OfField;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)V

    return-object v9
.end method

.method public varargs withField(Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;[Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p2, v2

    .line 4
    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForField;

    invoke-direct {v4, v3, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForField;-><init>(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object p2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 6
    invoke-interface {p2, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withField([Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;

    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withField(Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;[Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p1

    return-object p1
.end method

.method public varargs withFloatValue([F)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p1, v2

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForFloatConstant;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForFloatConstant;-><init>(F)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public withImplicitAndMethodArguments()Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 8

    new-instance v7, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v0, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    sget-object v3, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters;->INSTANCE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters;

    invoke-interface {v0, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArgument(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v3

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object v7
.end method

.method public varargs withInstance([Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 3
    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant;-><init>(Lnet/bytebuddy/utility/ConstantValue;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 5
    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withInstance([Lnet/bytebuddy/utility/JavaConstant;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 0

    .line 6
    check-cast p1, [Lnet/bytebuddy/utility/ConstantValue;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withInstance([Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p1

    return-object p1
.end method

.method public varargs withIntegerValue([I)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p1, v2

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForIntegerConstant;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForIntegerConstant;-><init>(I)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withLongValue([J)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-wide v3, p1, v2

    new-instance v5, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForLongConstant;

    invoke-direct {v5, v3, v4}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForLongConstant;-><init>(J)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public withMethodArguments()Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 8

    new-instance v7, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v0, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    sget-object v3, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters;->INSTANCE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters;

    invoke-interface {v0, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArgument(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v3

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object v7
.end method

.method public varargs withNullValue([Ljava/lang/Class;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    const/4 p1, 0x0

    new-array p1, p1, [Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withNullValue([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p1

    return-object p1
.end method

.method public varargs withNullValue([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 8

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 4
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v4

    if-nez v4, :cond_0

    .line 5
    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForNullValue;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForNullValue;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot assign null to primitive type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 8
    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v4

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public withReference(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType;
    .locals 9

    .line 1
    new-instance v8, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType$OfInstance;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitType$OfInstance;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Ljava/lang/Object;)V

    return-object v8
.end method

.method public varargs withReference([Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 4
    invoke-static {v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForInstance;->of(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 6
    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withShortValue([S)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-short v3, p1, v2

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForShortConstant;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForShortConstant;-><init>(S)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withThis([Ljava/lang/Class;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    const/4 p1, 0x0

    new-array p1, p1, [Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->withThis([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;

    move-result-object p1

    return-object p1
.end method

.method public varargs withThis([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 4
    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForThisInstance;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForThisInstance;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 6
    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withType([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant;

    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method

.method public varargs withValue([Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-static {v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->of(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic;

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    invoke-interface {v1, v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v6

    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v8, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v9, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/InvokeDynamic;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p1
.end method
