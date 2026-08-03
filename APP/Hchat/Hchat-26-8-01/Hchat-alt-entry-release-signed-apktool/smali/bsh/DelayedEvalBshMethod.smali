.class public Lbsh/DelayedEvalBshMethod;
.super Lbsh/BshMethod;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private argsNode:Lbsh/BSHArguments;

.field transient callstack:Lbsh/CallStack;

.field private constructor:Lbsh/Invocable;

.field private constructorArgs:[Ljava/lang/Object;

.field transient interpreter:Lbsh/Interpreter;

.field paramTypeDescriptors:[Ljava/lang/String;

.field paramTypesNode:Lbsh/BSHFormalParameters;

.field returnTypeDescriptor:Ljava/lang/String;

.field returnTypeNode:Lbsh/BSHReturnType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbsh/Invocable;Lbsh/NameSpace;)V
    .locals 13

    .line 1
    invoke-virtual {p2}, Lbsh/Invocable;->getReturnTypeDescriptor()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-virtual {p2}, Lbsh/Invocable;->getParameterCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v4, v0, [Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lbsh/Invocable;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    new-instance v7, Lbsh/BSHBlock;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v7, v0}, Lbsh/BSHBlock;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lbsh/Invocable;->isVarArgs()Z

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v9, 0x0

    .line 30
    move-object v0, p0

    .line 31
    move-object v1, p1

    .line 32
    move-object/from16 v8, p3

    .line 33
    .line 34
    invoke-direct/range {v0 .. v12}, Lbsh/DelayedEvalBshMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Lbsh/BSHReturnType;[Ljava/lang/String;[Ljava/lang/String;Lbsh/BSHFormalParameters;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;ZLbsh/CallStack;Lbsh/Interpreter;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lbsh/DelayedEvalBshMethod;->constructor:Lbsh/Invocable;

    .line 38
    .line 39
    new-instance p2, Lbsh/Modifiers;

    .line 40
    .line 41
    const/4 v2, 0x5

    .line 42
    invoke-direct {p2, v2}, Lbsh/Modifiers;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 46
    .line 47
    invoke-virtual {p0}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const-string v2, "public"

    .line 52
    .line 53
    invoke-virtual {p2, v2}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterModifiers()[Lbsh/Modifiers;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 60
    .line 61
    .line 62
    sget-object p2, Lbsh/This;->CONTEXT_ARGS:Ljava/lang/ThreadLocal;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Ljava/util/Map;

    .line 69
    .line 70
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, [Ljava/lang/Object;

    .line 75
    .line 76
    iput-object p1, p0, Lbsh/DelayedEvalBshMethod;->constructorArgs:[Ljava/lang/Object;

    .line 77
    .line 78
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lbsh/BSHReturnType;[Ljava/lang/String;[Ljava/lang/String;Lbsh/BSHFormalParameters;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;ZLbsh/CallStack;Lbsh/Interpreter;)V
    .locals 10

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p4

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move/from16 v9, p10

    .line 79
    invoke-direct/range {v0 .. v9}, Lbsh/BshMethod;-><init>(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;[Lbsh/Modifiers;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;Z)V

    const/4 p1, 0x0

    .line 80
    iput-object p1, p0, Lbsh/DelayedEvalBshMethod;->argsNode:Lbsh/BSHArguments;

    .line 81
    iput-object p1, p0, Lbsh/DelayedEvalBshMethod;->constructor:Lbsh/Invocable;

    .line 82
    iput-object p1, p0, Lbsh/DelayedEvalBshMethod;->constructorArgs:[Ljava/lang/Object;

    .line 83
    iput-object p2, p0, Lbsh/DelayedEvalBshMethod;->returnTypeDescriptor:Ljava/lang/String;

    .line 84
    iput-object p3, p0, Lbsh/DelayedEvalBshMethod;->returnTypeNode:Lbsh/BSHReturnType;

    .line 85
    iput-object p5, p0, Lbsh/DelayedEvalBshMethod;->paramTypeDescriptors:[Ljava/lang/String;

    move-object/from16 p1, p6

    .line 86
    iput-object p1, p0, Lbsh/DelayedEvalBshMethod;->paramTypesNode:Lbsh/BSHFormalParameters;

    move-object/from16 p1, p11

    .line 87
    iput-object p1, p0, Lbsh/DelayedEvalBshMethod;->callstack:Lbsh/CallStack;

    move-object/from16 p1, p12

    .line 88
    iput-object p1, p0, Lbsh/DelayedEvalBshMethod;->interpreter:Lbsh/Interpreter;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p1, p0, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    check-cast p1, Lbsh/DelayedEvalBshMethod;

    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {p1}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_9

    .line 35
    .line 36
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterCount()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p1}, Lbsh/BshMethod;->getParameterCount()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eq v2, v3, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-boolean v2, p0, Lbsh/BshMethod;->isExtension:Z

    .line 48
    .line 49
    iget-boolean v3, p1, Lbsh/BshMethod;->isExtension:Z

    .line 50
    .line 51
    if-eq v2, v3, :cond_4

    .line 52
    .line 53
    return v0

    .line 54
    :cond_4
    if-eqz v2, :cond_5

    .line 55
    .line 56
    iget-object v2, p0, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 57
    .line 58
    iget-object v3, p1, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-static {v2, v3}, Lbsh/BshMethod;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_5

    .line 65
    .line 66
    return v0

    .line 67
    :cond_5
    iget-boolean v2, p0, Lbsh/BshMethod;->isVarArgs:Z

    .line 68
    .line 69
    iget-boolean v3, p1, Lbsh/BshMethod;->isVarArgs:Z

    .line 70
    .line 71
    if-eq v2, v3, :cond_6

    .line 72
    .line 73
    return v0

    .line 74
    :cond_6
    move v2, v0

    .line 75
    :goto_0
    invoke-virtual {p0}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    array-length v3, v3

    .line 80
    if-ge v2, v3, :cond_8

    .line 81
    .line 82
    invoke-virtual {p0}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    aget-object v3, v3, v2

    .line 87
    .line 88
    invoke-virtual {p1}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    aget-object v4, v4, v2

    .line 93
    .line 94
    invoke-static {v3, v4}, Lbsh/BshMethod;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-nez v3, :cond_7

    .line 99
    .line 100
    return v0

    .line 101
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_8
    return v1

    .line 105
    :cond_9
    :goto_1
    return v0
.end method

.method public getAltConstructor()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/DelayedEvalBshMethod;->constructor:Lbsh/Invocable;

    .line 2
    .line 3
    const-string v1, "super"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    iget-object v0, p0, Lbsh/BshMethod;->methodBody:Lbsh/BSHBlock;

    .line 9
    .line 10
    invoke-virtual {v0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_1
    iget-object v0, p0, Lbsh/BshMethod;->methodBody:Lbsh/BSHBlock;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v0, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    instance-of v4, v0, Lbsh/BSHMethodInvocation;

    .line 26
    .line 27
    if-nez v4, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Lbsh/Node;->jjtGetNumChildren()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-lez v5, :cond_2

    .line 34
    .line 35
    invoke-interface {v0, v3}, Lbsh/Node;->jjtGetChild(I)Lbsh/Node;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    if-eqz v4, :cond_4

    .line 41
    .line 42
    check-cast v0, Lbsh/BSHMethodInvocation;

    .line 43
    .line 44
    invoke-virtual {v0}, Lbsh/BSHMethodInvocation;->getNameNode()Lbsh/BSHAmbiguousName;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v3, v3, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    const-string v1, "this"

    .line 57
    .line 58
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    :cond_3
    invoke-virtual {v0}, Lbsh/BSHMethodInvocation;->getArgsNode()Lbsh/BSHArguments;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lbsh/DelayedEvalBshMethod;->argsNode:Lbsh/BSHArguments;

    .line 69
    .line 70
    return-object v3

    .line 71
    :cond_4
    return-object v2
.end method

.method public getArgsNode()Lbsh/BSHArguments;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/DelayedEvalBshMethod;->argsNode:Lbsh/BSHArguments;

    .line 2
    .line 3
    return-object v0
.end method

.method public getConstructorArgs()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/DelayedEvalBshMethod;->constructorArgs:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParamTypeDescriptors()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/DelayedEvalBshMethod;->paramTypeDescriptors:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParameterTypes()[Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/DelayedEvalBshMethod;->constructor:Lbsh/Invocable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/Invocable;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Lbsh/DelayedEvalBshMethod;->paramTypesNode:Lbsh/BSHFormalParameters;

    .line 11
    .line 12
    iget-object v1, p0, Lbsh/DelayedEvalBshMethod;->callstack:Lbsh/CallStack;

    .line 13
    .line 14
    iget-object v2, p0, Lbsh/DelayedEvalBshMethod;->interpreter:Lbsh/Interpreter;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lbsh/BSHFormalParameters;->eval(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-object v0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    const-string v1, "can\'t eval param types: "

    .line 23
    .line 24
    invoke-static {v1, v0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    return-object v0
.end method

.method public getReturnType()Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/DelayedEvalBshMethod;->returnTypeNode:Lbsh/BSHReturnType;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    :try_start_0
    iget-object v1, p0, Lbsh/DelayedEvalBshMethod;->callstack:Lbsh/CallStack;

    .line 8
    .line 9
    iget-object v2, p0, Lbsh/DelayedEvalBshMethod;->interpreter:Lbsh/Interpreter;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lbsh/BSHReturnType;->evalReturnType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object v0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    const-string v1, "can\'t eval return type: "

    .line 18
    .line 19
    invoke-static {v1, v0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public getReturnTypeDescriptor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/DelayedEvalBshMethod;->returnTypeDescriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    const/16 v0, 0x1f

    .line 19
    .line 20
    mul-int/2addr v1, v0

    .line 21
    iget-boolean v2, p0, Lbsh/BshMethod;->isExtension:Z

    .line 22
    .line 23
    invoke-static {v1, v0, v2}, Leh/a;->h(IIZ)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v2, p0, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    move v2, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :goto_0
    add-int/2addr v1, v2

    .line 39
    mul-int/2addr v1, v0

    .line 40
    iget-boolean v0, p0, Lbsh/BshMethod;->isVarArgs:Z

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/2addr v0, v1

    .line 47
    invoke-virtual {p0}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    array-length v2, v1

    .line 52
    move v4, v3

    .line 53
    :goto_1
    if-ge v4, v2, :cond_2

    .line 54
    .line 55
    aget-object v5, v1, v4

    .line 56
    .line 57
    if-nez v5, :cond_1

    .line 58
    .line 59
    move v5, v3

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    :goto_2
    add-int/lit8 v5, v5, 0x3

    .line 66
    .line 67
    add-int/2addr v0, v5

    .line 68
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterCount()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    add-int/2addr v1, v0

    .line 76
    return v1
.end method
