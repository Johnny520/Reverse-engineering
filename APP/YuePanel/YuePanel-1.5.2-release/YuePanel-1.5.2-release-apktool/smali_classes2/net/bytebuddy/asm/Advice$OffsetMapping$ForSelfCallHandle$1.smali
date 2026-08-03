.class final enum Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$1;
.super Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;-><init>(Ljava/lang/String;ILnet/bytebuddy/asm/Advice$1;)V

    return-void
.end method


# virtual methods
.method public decorate(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 12

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    add-int/2addr v4, v2

    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    mul-int/2addr v6, v0

    add-int/2addr v4, v6

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result p2

    const-class v4, Ljava/lang/Object;

    if-nez p2, :cond_1

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p2

    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p2, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    sget-object v6, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    new-instance v8, Lnet/bytebuddy/description/method/MethodDescription$Token;

    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v6

    new-instance v9, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v10

    new-array v11, v2, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v10, v11, v5

    invoke-direct {v9, v11}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    const-string v10, "bindTo"

    invoke-direct {v8, v10, v2, v6, v9}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    invoke-direct {p2, v7, v8}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    invoke-static {p2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object p2

    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {p2, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/method/ParameterDescription;

    invoke-interface {v6}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v7, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->load(Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v8

    sget-object v9, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-interface {v6}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v10

    invoke-interface {v6}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDescription;->asBoxed()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v6

    sget-object v11, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v9, v10, v6, v11}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v6

    new-array v9, v1, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v8, v9, v5

    aput-object v6, v9, v2

    invoke-direct {v7, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    goto :goto_2

    :cond_2
    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->load(Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v7

    :goto_2
    invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p1

    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    move-result-object p1

    invoke-virtual {p1, p2}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    sget-object p2, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {p2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    new-instance v4, Lnet/bytebuddy/description/method/MethodDescription$Token;

    sget-object v6, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v7

    new-instance v8, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v9

    const-class v10, [Ljava/lang/Object;

    invoke-static {v10}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v10

    new-array v0, v0, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v6, v0, v5

    aput-object v9, v0, v2

    aput-object v10, v0, v1

    invoke-direct {v8, v0}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    const-string v0, "insertArguments"

    const/16 v1, 0x9

    invoke-direct {v4, v0, v1, v7, v8}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    invoke-direct {p1, p2, v4}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object p1

    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {p1, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    return-object p1
.end method
