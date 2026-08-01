.class public Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;
.super Lnet/bytebuddy/implementation/MethodCall;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithoutSpecifiedTarget"
.end annotation


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;)V
    .locals 8

    .line 1
    sget-object v2, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory;

    .line 2
    .line 3
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    sget-object v4, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForContextualInvocation$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForContextualInvocation$Factory;

    .line 6
    .line 7
    sget-object v5, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->RETURNING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 8
    .line 9
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 10
    .line 11
    sget-object v7, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public on(Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->on(Ljava/lang/Object;Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public on(Ljava/lang/Object;Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Lnet/bytebuddy/implementation/MethodCall;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForValue$Factory;

    .line 6
    .line 7
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-direct {v2, p1, v3}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForValue$Factory;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 15
    .line 16
    new-instance v4, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$Factory;

    .line 17
    .line 18
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {v4, p1}, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$Factory;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 23
    .line 24
    .line 25
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 26
    .line 27
    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 28
    .line 29
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 30
    .line 31
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public on(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/Class;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/implementation/MethodCall;"
        }
    .end annotation

    .line 36
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->on(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public on(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 8

    .line 37
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    new-instance v2, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Simple;

    invoke-direct {v2, p2, p1}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Simple;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    new-instance v4, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$Factory;

    invoke-direct {v4, p2}, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$Factory;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object v0
.end method

.method public onArgument(I)Lnet/bytebuddy/implementation/MethodCall;
    .locals 8

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    .line 4
    .line 5
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 6
    .line 7
    new-instance v2, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodParameter;

    .line 8
    .line 9
    invoke-direct {v2, p1}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodParameter;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 13
    .line 14
    sget-object v4, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType;

    .line 15
    .line 16
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 17
    .line 18
    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 19
    .line 20
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 21
    .line 22
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "An argument index cannot be negative: "

    .line 27
    .line 28
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public onDefault()Lnet/bytebuddy/implementation/MethodCall;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 8
    .line 9
    sget-object v4, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 1

    .line 29
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public onField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Factory;

    .line 6
    .line 7
    new-instance v3, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Location$ForImplicitField;

    .line 8
    .line 9
    invoke-direct {v3, p1, p2}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Location$ForImplicitField;-><init>(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v2, v3}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Factory;-><init>(Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Location;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 16
    .line 17
    sget-object v4, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType;

    .line 18
    .line 19
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 20
    .line 21
    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 22
    .line 23
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public onField(Ljava/lang/reflect/Field;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 1

    .line 30
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p0

    return-object p0
.end method

.method public onField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 8

    .line 31
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    new-instance v2, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Factory;

    new-instance v3, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Location$ForExplicitField;

    invoke-direct {v3, p1}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Location$ForExplicitField;-><init>(Lnet/bytebuddy/description/field/FieldDescription;)V

    invoke-direct {v2, v3}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Factory;-><init>(Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForField$Location;)V

    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    sget-object v4, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType;

    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object v0
.end method

.method public onMethodCall(Lnet/bytebuddy/implementation/MethodCall;)Lnet/bytebuddy/implementation/MethodCall;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;

    .line 6
    .line 7
    invoke-direct {v2, p1}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;-><init>(Lnet/bytebuddy/implementation/MethodCall;)V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 11
    .line 12
    sget-object v4, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType;

    .line 13
    .line 14
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 15
    .line 16
    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 17
    .line 18
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 19
    .line 20
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public onSuper()Lnet/bytebuddy/implementation/MethodCall;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 8
    .line 9
    sget-object v4, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/MethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;Ljava/util/List;Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
