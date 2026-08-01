.class public Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;
.super Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/InvokeDynamic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithImplicitTarget"
.end annotation


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

    .line 1
    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Class;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;"
        }
    .end annotation

    .line 42
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;->invoke(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;

    move-result-object p0

    return-object p0
.end method

.method public invoke(Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
    .locals 7

    .line 39
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider$ForExplicitName;

    invoke-direct {v4, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider$ForExplicitName;-><init>(Ljava/lang/String;)V

    .line 40
    invoke-interface {v3, v4}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->withNameProvider(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v3

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object v0
.end method

.method public invoke(Ljava/lang/String;Ljava/lang/Class;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;"
        }
    .end annotation

    .line 41
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitTarget;->invoke(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;

    move-result-object p0

    return-object p0
.end method

.method public invoke(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 8
    .line 9
    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider$ForExplicitName;

    .line 10
    .line 11
    invoke-direct {v4, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider$ForExplicitName;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v3, v4}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->withNameProvider(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v3, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForExplicitType;

    .line 19
    .line 20
    invoke-direct {v3, p2}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForExplicitType;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->withReturnTypeProvider(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    .line 28
    .line 29
    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 30
    .line 31
    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 32
    .line 33
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public invoke(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;
    .locals 7

    .line 37
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;

    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    new-instance v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForExplicitType;

    invoke-direct {v4, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForExplicitType;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 38
    invoke-interface {v3, v4}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->withReturnTypeProvider(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    move-result-object v3

    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v6, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvokeDynamic$WithImplicitArguments;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object v0
.end method
