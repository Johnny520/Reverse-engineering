.class public final Lbsh/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static 飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lbsh/Modifiers;[Ljava/lang/Class;Ljava/lang/Class;Lbsh/BSHBlock;Lbsh/ClassGenerator$Type;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 36

    move-object/from16 v0, p4

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    .line 1
    invoke-virtual {v12}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    move-result-object v14

    .line 2
    invoke-virtual {v14}, Lbsh/NameSpace;->getPackage()Ljava/lang/String;

    move-result-object v15

    .line 3
    iget-boolean v1, v14, Lbsh/NameSpace;->isClass:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "$"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    move-object v1, v2

    :goto_0
    if-nez v15, :cond_1

    move-object v2, v1

    goto :goto_1

    .line 4
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 5
    :goto_1
    invoke-virtual {v13}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    move-result-object v3

    .line 6
    new-instance v4, Lbsh/NameSpace;

    invoke-direct {v4, v14, v1}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    const/4 v5, 0x1

    .line 7
    iput-boolean v5, v4, Lbsh/NameSpace;->isClass:Z

    .line 8
    invoke-virtual {v12, v4}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 9
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v7, Lbsh/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:Lbsh/飘花落叶言子楪哲兰世苏;

    invoke-virtual {v0, v12, v13, v6, v7}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 10
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x0

    .line 11
    :goto_2
    invoke-virtual {v0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    move-result v9

    const/4 v10, 0x0

    if-ge v8, v9, :cond_4

    .line 12
    invoke-virtual {v0, v8}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    move-result-object v9

    .line 13
    instance-of v11, v9, Lbsh/BSHEnumConstant;

    if-eqz v11, :cond_3

    .line 14
    check-cast v9, Lbsh/BSHEnumConstant;

    .line 15
    :try_start_0
    new-instance v11, Lbsh/Variable;

    invoke-virtual {v9}, Lbsh/BSHEnumConstant;->getName()Ljava/lang/String;

    move-result-object v5

    .line 16
    invoke-virtual {v9}, Lbsh/BSHEnumConstant;->getType()Ljava/lang/Class;

    move-result-object v7

    iget-object v9, v9, Lbsh/BSHEnumConstant;->mods:Lbsh/Modifiers;

    invoke-direct {v11, v5, v7, v10, v9}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 17
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    goto :goto_6

    .line 18
    :cond_3
    instance-of v5, v9, Lbsh/BSHTypedVariableDeclaration;

    if-eqz v5, :cond_2

    .line 19
    check-cast v9, Lbsh/BSHTypedVariableDeclaration;

    .line 20
    iget-object v5, v9, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 21
    invoke-virtual {v9}, Lbsh/BSHTypedVariableDeclaration;->getDeclarators()[Lbsh/BSHVariableDeclarator;

    move-result-object v7

    .line 22
    array-length v11, v7

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v11, :cond_2

    move-object/from16 v17, v1

    aget-object v1, v7, v10

    .line 23
    iget-object v1, v1, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    move-object/from16 v18, v2

    .line 24
    :try_start_1
    invoke-virtual {v9, v12, v13}, Lbsh/BSHTypedVariableDeclaration;->evalType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    move-result-object v2
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v19, v3

    .line 25
    :try_start_2
    new-instance v3, Lbsh/Variable;
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v20, v4

    const/4 v4, 0x0

    :try_start_3
    invoke-direct {v3, v1, v2, v4, v5}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 26
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lbsh/EvalError; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_5

    :catch_1
    :goto_4
    move-object/from16 v20, v4

    const/4 v4, 0x0

    goto :goto_5

    :catch_2
    move-object/from16 v19, v3

    goto :goto_4

    :catch_3
    :goto_5
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    goto :goto_3

    :goto_6
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object v4, v10

    .line 27
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Lbsh/Variable;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, [Lbsh/Variable;

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-virtual {v12}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    move-result-object v2

    invoke-virtual {v2}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "$anon"

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-le v2, v3, :cond_5

    .line 30
    invoke-virtual {v12}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    move-result-object v2

    invoke-virtual {v2}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 31
    sget-object v5, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    move-object/from16 v6, p3

    invoke-virtual {v5, v6}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 32
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lbsh/This;->CONTEXT_ARGS:Ljava/lang/ThreadLocal;

    .line 33
    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    invoke-interface {v8, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/Object;

    .line 34
    invoke-static {v8}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/飘花落叶言子世哲苏楪兰;

    move-result-object v5

    .line 35
    new-instance v7, Lbsh/DelayedEvalBshMethod;

    invoke-virtual {v12}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    move-result-object v8

    invoke-direct {v7, v2, v5, v8}, Lbsh/DelayedEvalBshMethod;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世哲苏楪兰;Lbsh/NameSpace;)V

    .line 36
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_5
    move-object/from16 v6, p3

    :goto_7
    const/4 v2, 0x0

    .line 37
    :goto_8
    invoke-virtual {v0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    move-result v5

    if-ge v2, v5, :cond_8

    .line 38
    invoke-virtual {v0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    move-result-object v5

    .line 39
    instance-of v7, v5, Lbsh/BSHMethodDeclaration;

    if-eqz v7, :cond_7

    .line 40
    check-cast v5, Lbsh/BSHMethodDeclaration;

    .line 41
    invoke-virtual {v5}, Lbsh/BSHMethodDeclaration;->insureNodesParsed()V

    .line 42
    iget-object v10, v5, Lbsh/BSHMethodDeclaration;->modifiers:Lbsh/Modifiers;

    move v7, v2

    .line 43
    iget-object v2, v5, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    move v8, v3

    .line 44
    invoke-virtual {v5, v12, v13, v15}, Lbsh/BSHMethodDeclaration;->getReturnTypeDescriptor(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v9, v4

    .line 45
    invoke-virtual {v5}, Lbsh/BSHMethodDeclaration;->getReturnTypeNode()Lbsh/BSHReturnType;

    move-result-object v4

    move v11, v7

    .line 46
    iget-object v7, v5, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 47
    invoke-virtual {v7, v12, v13, v15}, Lbsh/BSHFormalParameters;->getTypeDescriptors(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    move-object/from16 v21, v1

    .line 48
    new-instance v1, Lbsh/DelayedEvalBshMethod;

    iget-object v8, v5, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    invoke-virtual {v8}, Lbsh/BSHFormalParameters;->getParamNames()[Ljava/lang/String;

    move-result-object v8

    move-object/from16 v23, v8

    iget-object v8, v5, Lbsh/BSHMethodDeclaration;->blockNode:Lbsh/BSHBlock;

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move/from16 v25, v11

    iget-boolean v11, v5, Lbsh/BSHMethodDeclaration;->isVarArgs:Z

    move-object v0, v5

    move-object/from16 v26, v15

    move-object/from16 v28, v18

    move-object/from16 v29, v19

    move-object/from16 v15, v20

    move-object/from16 v5, v23

    const/16 p0, 0x1

    move-object/from16 v18, v14

    move-object/from16 v14, v21

    invoke-direct/range {v1 .. v13}, Lbsh/DelayedEvalBshMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Lbsh/BSHReturnType;[Ljava/lang/String;[Ljava/lang/String;Lbsh/BSHFormalParameters;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;ZLbsh/CallStack;Lbsh/Interpreter;)V

    .line 49
    iget-boolean v2, v0, Lbsh/BSHMethodDeclaration;->isExtension:Z

    iput-boolean v2, v1, Lbsh/BshMethod;->isExtension:Z

    if-eqz v2, :cond_6

    .line 50
    invoke-virtual {v0, v12, v13}, Lbsh/BSHMethodDeclaration;->evalReceiverType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, v1, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 51
    :cond_6
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_7
    move/from16 v25, v2

    move-object/from16 v26, v15

    move-object/from16 v28, v18

    move-object/from16 v29, v19

    move-object/from16 v15, v20

    const/16 p0, 0x1

    move-object/from16 v18, v14

    move-object v14, v1

    :goto_9
    add-int/lit8 v2, v25, 0x1

    move-object/from16 v6, p3

    move-object/from16 v0, p4

    move-object v1, v14

    move-object/from16 v20, v15

    move-object/from16 v14, v18

    move-object/from16 v15, v26

    move-object/from16 v18, v28

    move-object/from16 v19, v29

    const/4 v3, -0x1

    const/4 v4, 0x0

    goto/16 :goto_8

    :cond_8
    move-object/from16 v26, v15

    move-object/from16 v28, v18

    move-object/from16 v29, v19

    move-object/from16 v15, v20

    const/16 p0, 0x1

    move-object/from16 v18, v14

    move-object v14, v1

    .line 52
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lbsh/DelayedEvalBshMethod;

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, [Lbsh/DelayedEvalBshMethod;

    .line 53
    invoke-virtual {v12}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 54
    invoke-virtual {v15, v13}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 55
    new-instance v1, Lbsh/飘花落叶言子楪兰苏哲世;

    move-object/from16 v2, p1

    move-object/from16 v6, p2

    move-object/from16 v5, p3

    move-object/from16 v10, p5

    move-object v9, v15

    move-object/from16 v7, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v26

    invoke-direct/range {v1 .. v10}, Lbsh/飘花落叶言子楪兰苏哲世;-><init>(Lbsh/Modifiers;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Lbsh/Variable;[Lbsh/DelayedEvalBshMethod;Lbsh/NameSpace;Lbsh/ClassGenerator$Type;)V

    iget-object v0, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰:[Lbsh/DelayedEvalBshMethod;

    .line 56
    const-string v2, ""

    :try_start_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v5, Lbsh/This$Keys;->BSHCLASSMODIFIERS:Lbsh/This$Keys;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p1

    const/4 v6, 0x0

    invoke-virtual {v9, v4, v5, v6}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;

    .line 57
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v6, Lbsh/This$Keys;->BSHCONSTRUCTORS:Lbsh/This$Keys;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v9, v4, v0, v6}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;

    .line 58
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lbsh/This$Keys;->BSHINIT:Lbsh/This$Keys;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, p4

    const/4 v6, 0x0

    invoke-virtual {v9, v2, v4, v6}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_5

    move-object/from16 v2, v29

    .line 59
    iget-object v4, v2, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v6, v28

    .line 60
    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    const/16 v8, 0x2e

    if-nez v4, :cond_3e

    .line 61
    sget-object v4, Lbsh/This;->contextStore:Ljava/util/Map;

    iget-object v11, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbsh/NameSpace;

    .line 62
    invoke-static {v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰(Lbsh/Modifiers;)I

    move-result v5

    .line 63
    sget-object v12, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    if-ne v10, v12, :cond_a

    or-int/lit16 v5, v5, 0x601

    :cond_9
    :goto_a
    move/from16 v20, v5

    goto :goto_b

    .line 64
    :cond_a
    sget-object v12, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    if-ne v10, v12, :cond_b

    or-int/lit16 v5, v5, 0x4031

    goto :goto_a

    :cond_b
    or-int/lit8 v5, v5, 0x21

    and-int/lit16 v12, v5, 0x400

    if-lez v12, :cond_9

    add-int/lit16 v5, v5, -0x400

    goto :goto_a

    .line 65
    :goto_b
    iget-object v5, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:[Ljava/lang/Class;

    array-length v12, v5

    add-int/lit8 v12, v12, 0x1

    new-array v12, v12, [Ljava/lang/String;

    const/4 v14, 0x0

    .line 66
    :goto_c
    array-length v15, v5

    const/16 v7, 0x2f

    if-ge v14, v15, :cond_d

    .line 67
    aget-object v15, v5, v14

    .line 68
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15, v8, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    .line 69
    aput-object v7, v12, v14

    .line 70
    aget-object v7, v5, v14

    invoke-static {v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 71
    aget-object v7, v5, v14

    .line 72
    invoke-static {v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    move-result-object v7

    invoke-static {v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰苏世哲(Lbsh/NameSpace;)[Lbsh/Variable;

    move-result-object v7

    .line 73
    array-length v15, v7

    const/4 v8, 0x0

    :goto_d
    if-ge v8, v15, :cond_c

    move-object/from16 p1, v7

    aget-object v7, p1, v8

    .line 74
    invoke-virtual {v4, v7}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v7, p1

    goto :goto_d

    :cond_c
    add-int/lit8 v14, v14, 0x1

    const/16 v8, 0x2e

    goto :goto_c

    .line 75
    :cond_d
    array-length v5, v5

    const-class v8, Lbsh/GeneratedClass;

    .line 76
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    const/16 v14, 0x2e

    invoke-virtual {v8, v14, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    .line 77
    aput-object v7, v12, v5

    .line 78
    new-instance v19, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;

    invoke-direct/range {v19 .. v19}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 79
    sget-object v5, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    iget-object v7, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    if-ne v10, v5, :cond_e

    const-string v5, "Ljava/lang/Enum<"

    const-string v8, ">;"

    .line 80
    invoke-static {v5, v7, v8}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v22, v5

    goto :goto_e

    :cond_e
    const/16 v22, 0x0

    .line 81
    :goto_e
    iget-object v5, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    iget-object v8, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    move-object/from16 v21, v5

    move-object/from16 v23, v8

    move-object/from16 v24, v12

    invoke-virtual/range {v19 .. v24}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    move-object/from16 v5, v19

    .line 82
    sget-object v8, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    const-string v12, "Lbsh/This;"

    if-eq v10, v8, :cond_f

    .line 83
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v14, 0x0

    move/from16 v15, p0

    .line 84
    invoke-static {v8, v12, v15, v14, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;)V

    goto :goto_f

    :cond_f
    const/4 v14, 0x0

    .line 85
    :goto_f
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v15, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v15, 0x19

    .line 86
    invoke-static {v8, v12, v15, v14, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;)V

    .line 87
    const-string v8, "UUID"

    const-string v14, "Ljava/lang/String;"

    invoke-static {v8, v14, v15, v11, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;)V

    .line 88
    iget-object v11, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲:[Lbsh/Variable;

    array-length v15, v11

    move-object/from16 v20, v9

    const/4 v13, 0x0

    :goto_10
    const-string v9, "enum"

    move-object/from16 v19, v2

    const-string v2, "private"

    if-ge v13, v15, :cond_13

    move/from16 v17, v13

    aget-object v13, v11, v17

    .line 89
    invoke-virtual {v13, v2}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_10

    move/from16 v21, v15

    goto :goto_12

    .line 90
    :cond_10
    invoke-virtual {v13}, Lbsh/Variable;->getTypeDescriptor()Ljava/lang/String;

    move-result-object v2

    .line 91
    invoke-virtual {v13}, Lbsh/Variable;->getModifiers()Lbsh/Modifiers;

    move-result-object v21

    move-object/from16 p4, v2

    invoke-static/range {v21 .. v21}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰(Lbsh/Modifiers;)I

    move-result v2

    move/from16 v21, v15

    .line 92
    sget-object v15, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    if-ne v10, v15, :cond_11

    .line 93
    invoke-virtual {v13}, Lbsh/Variable;->setConstant()V

    .line 94
    invoke-virtual {v4, v13}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    goto :goto_12

    .line 95
    :cond_11
    sget-object v15, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    if-ne v10, v15, :cond_12

    invoke-virtual {v13, v9}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_12

    or-int/lit16 v2, v2, 0x4010

    move v9, v2

    move-object v2, v7

    goto :goto_11

    :cond_12
    move v9, v2

    move-object/from16 v2, p4

    .line 96
    :goto_11
    invoke-virtual {v13}, Lbsh/Variable;->getName()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x0

    .line 97
    invoke-static {v13, v2, v9, v15, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;)V

    :goto_12
    add-int/lit8 v13, v17, 0x1

    move-object/from16 v2, v19

    move/from16 v15, v21

    goto :goto_10

    .line 98
    :cond_13
    sget-object v4, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    const-string v15, "(Ljava/lang/String;I)V"

    const-string v13, "<init>"

    move-object/from16 v28, v6

    const-string v6, "bsh/This"

    move-object/from16 v22, v2

    iget-object v2, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    if-ne v10, v4, :cond_14

    move-object/from16 v25, v1

    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    move-object/from16 v26, v0

    const-string v0, "()["

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    move-object/from16 v27, v9

    const-string v9, "values"

    invoke-virtual {v5, v1, v9, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;

    move-result-object v0

    .line 100
    invoke-static {v2, v3, v0}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 101
    const-string v9, "enumValues"

    const-string v1, "()[Ljava/lang/Object;"

    move-object/from16 v31, v11

    const/16 v11, 0xb6

    invoke-virtual {v0, v11, v6, v9, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v9, "["

    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 103
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "(Ljava/lang/String;)"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "valueOf"

    const/16 v9, 0x9

    invoke-virtual {v5, v9, v1, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;

    move-result-object v0

    .line 105
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v11, 0x0

    invoke-static {v11, v9, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;

    move-result-object v9

    .line 106
    invoke-virtual {v0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    const/16 v9, 0x19

    .line 107
    invoke-virtual {v0, v9, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 108
    const-string v9, "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;"

    const-string v11, "java/lang/Enum"

    move-object/from16 v29, v4

    const/16 v4, 0xb8

    invoke-virtual {v0, v4, v11, v1, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-static {v7, v0}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 110
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    const/4 v0, 0x2

    .line 111
    invoke-virtual {v5, v0, v13, v15}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;

    move-result-object v1

    const/4 v4, 0x0

    const/16 v9, 0x19

    .line 112
    invoke-virtual {v1, v9, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    const/4 v4, 0x1

    .line 113
    invoke-virtual {v1, v9, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    const/16 v4, 0x15

    .line 114
    invoke-virtual {v1, v4, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    const/16 v4, 0xb7

    .line 115
    invoke-virtual {v1, v4, v11, v13, v15}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x0

    .line 116
    invoke-virtual {v1, v9, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 117
    invoke-virtual {v1, v3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 118
    new-array v4, v11, [Ljava/lang/String;

    invoke-static {v4, v11, v1}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲([Ljava/lang/String;ZL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 119
    const-string v4, "initInstance"

    const-string v9, "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V"

    const/16 v11, 0xb8

    invoke-virtual {v1, v11, v6, v4, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0xb1

    .line 120
    invoke-virtual {v1, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 121
    invoke-virtual {v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    goto :goto_13

    :cond_14
    move-object/from16 v26, v0

    move-object/from16 v25, v1

    move-object/from16 v29, v4

    move-object/from16 v27, v9

    move-object/from16 v31, v11

    const/4 v0, 0x2

    .line 122
    :goto_13
    const-string v1, "<clinit>"

    const-string v4, "()V"

    const/16 v9, 0x8

    invoke-virtual {v5, v9, v1, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;

    move-result-object v1

    const/16 v4, 0xb2

    .line 123
    invoke-virtual {v1, v4, v2, v8, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    const-string v4, "pullBshStatic"

    const-string v8, "(Ljava/lang/String;)Lbsh/This;"

    const/16 v11, 0xb8

    invoke-virtual {v1, v11, v6, v4, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0xb3

    invoke-virtual {v1, v8, v2, v4, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, v29

    if-ne v10, v4, :cond_17

    move-object/from16 v4, v31

    .line 126
    array-length v11, v4

    const/4 v0, 0x3

    const/4 v14, 0x0

    :goto_14
    if-ge v14, v11, :cond_17

    aget-object v8, v4, v14

    move-object/from16 v9, v27

    invoke-virtual {v8, v9}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    move-result v27

    if-eqz v27, :cond_16

    move-object/from16 v27, v4

    const/16 v4, 0xbb

    .line 127
    invoke-virtual {v1, v4, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    const/16 v4, 0x59

    .line 128
    invoke-virtual {v1, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 129
    invoke-virtual {v8}, Lbsh/Variable;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    const/16 v4, 0x8

    if-lt v4, v0, :cond_15

    add-int/lit8 v31, v0, 0x1

    .line 130
    invoke-virtual {v1, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    :goto_15
    move/from16 v0, v31

    const/16 v4, 0xb7

    goto :goto_16

    :cond_15
    add-int/lit8 v31, v0, 0x1

    add-int/lit8 v0, v0, -0x3

    const/16 v4, 0x10

    .line 131
    invoke-virtual {v1, v4, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(II)V

    goto :goto_15

    .line 132
    :goto_16
    invoke-virtual {v1, v4, v2, v13, v15}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    invoke-virtual {v8}, Lbsh/Variable;->getName()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0xb3

    invoke-virtual {v1, v8, v2, v4, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_17

    :cond_16
    move-object/from16 v27, v4

    const/16 v8, 0xb3

    :goto_17
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v4, v27

    move-object/from16 v27, v9

    const/16 v9, 0x8

    goto :goto_14

    .line 134
    :cond_17
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v11, 0x0

    invoke-static {v11, v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;

    move-result-object v0

    .line 135
    invoke-virtual {v1, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 136
    const-string v0, "initStatic"

    const-string v4, "(Ljava/lang/Class;)V"

    const/16 v11, 0xb8

    invoke-virtual {v1, v11, v6, v0, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0xb1

    .line 137
    invoke-virtual {v1, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 138
    invoke-virtual {v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    move-object/from16 v1, v26

    const/4 v0, 0x0

    const/4 v7, 0x0

    .line 139
    :goto_18
    array-length v4, v1

    if-ge v7, v4, :cond_1a

    .line 140
    aget-object v4, v1, v7

    move-object/from16 v8, v22

    invoke-virtual {v4, v8}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_18

    move-object/from16 v9, v25

    goto :goto_19

    .line 141
    :cond_18
    aget-object v0, v1, v7

    invoke-virtual {v0}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    move-result-object v0

    invoke-static {v0}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰(Lbsh/Modifiers;)I

    move-result v0

    .line 142
    aget-object v4, v1, v7

    invoke-virtual {v4}, Lbsh/BshMethod;->isVarArgs()Z

    move-result v4

    if-eqz v4, :cond_19

    or-int/lit16 v0, v0, 0x80

    .line 143
    :cond_19
    aget-object v4, v1, v7

    invoke-virtual {v4}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    move-result-object v4

    move-object/from16 v9, v25

    invoke-virtual {v9, v7, v4, v0, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[Ljava/lang/String;IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;)V

    const/4 v0, 0x1

    :goto_19
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v22, v8

    move-object/from16 v25, v9

    goto :goto_18

    :cond_1a
    move-object/from16 v8, v22

    move-object/from16 v9, v25

    .line 144
    sget-object v1, Lbsh/ClassGenerator$Type;->CLASS:Lbsh/ClassGenerator$Type;

    if-ne v10, v1, :cond_1b

    if-nez v0, :cond_1b

    const/4 v11, 0x0

    .line 145
    new-array v0, v11, [Ljava/lang/String;

    const/4 v1, -0x1

    const/4 v15, 0x1

    invoke-virtual {v9, v1, v0, v15, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[Ljava/lang/String;IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;)V

    .line 146
    :cond_1b
    iget-object v0, v9, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲兰世:[Lbsh/DelayedEvalBshMethod;

    array-length v1, v0

    const/4 v7, 0x0

    :goto_1a
    if-ge v7, v1, :cond_3c

    aget-object v4, v0, v7

    .line 147
    iget-boolean v11, v4, Lbsh/BshMethod;->isExtension:Z

    if-eqz v11, :cond_1c

    :goto_1b
    move-object/from16 v21, v0

    move/from16 v25, v1

    move-object/from16 v26, v2

    move-object/from16 v30, v5

    move/from16 v22, v7

    move-object/from16 v29, v8

    const/16 v4, 0x19

    const/4 v5, 0x1

    const/16 v8, 0xb7

    const/16 v17, 0xb6

    goto/16 :goto_30

    .line 148
    :cond_1c
    invoke-virtual {v4, v8}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1d

    goto :goto_1b

    .line 149
    :cond_1d
    sget-object v11, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    if-ne v10, v11, :cond_1e

    const-string v13, "static"

    .line 150
    invoke-virtual {v4, v13}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_1e

    const-string v13, "default"

    .line 151
    invoke-virtual {v4, v13}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_1e

    .line 152
    const-string v13, "abstract"

    invoke-virtual {v4, v13}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_1e

    .line 153
    invoke-virtual {v4}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    move-result-object v14

    invoke-virtual {v14, v13}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 154
    :cond_1e
    invoke-virtual {v4}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    move-result-object v13

    invoke-static {v13}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰(Lbsh/Modifiers;)I

    move-result v13

    .line 155
    invoke-virtual {v4}, Lbsh/BshMethod;->isVarArgs()Z

    move-result v14

    if-eqz v14, :cond_1f

    or-int/lit16 v13, v13, 0x80

    :cond_1f
    and-int/lit8 v14, v13, 0x8

    if-lez v14, :cond_20

    const/4 v15, 0x1

    :goto_1c
    move-object/from16 v21, v0

    goto :goto_1d

    :cond_20
    const/4 v15, 0x0

    goto :goto_1c

    .line 156
    :goto_1d
    invoke-virtual {v4}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lbsh/DelayedEvalBshMethod;->getReturnTypeDescriptor()Ljava/lang/String;

    move-result-object v22

    move/from16 v25, v1

    .line 157
    invoke-virtual {v4}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    move-result-object v1

    if-eqz v14, :cond_21

    const/4 v14, 0x1

    goto :goto_1e

    :cond_21
    const/4 v14, 0x0

    .line 158
    :goto_1e
    const-string v26, "Ljava/lang/Object;"

    move-object/from16 v27, v4

    if-nez v22, :cond_22

    move-object/from16 v4, v26

    :goto_1f
    move/from16 v22, v7

    goto :goto_20

    :cond_22
    move-object/from16 v4, v22

    goto :goto_1f

    .line 159
    :goto_20
    invoke-static {v4, v1}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 160
    invoke-virtual {v5, v13, v0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;

    move-result-object v7

    and-int/lit16 v13, v13, 0x400

    move-object/from16 v29, v8

    .line 161
    const-string v8, "D"

    move/from16 v30, v13

    const-string v13, "J"

    if-eqz v30, :cond_23

    const/16 v0, 0xb1

    const/16 v17, 0xb6

    goto/16 :goto_25

    :cond_23
    if-nez v14, :cond_25

    if-ne v10, v11, :cond_24

    goto :goto_21

    :cond_24
    const/16 v10, 0x19

    const/4 v11, 0x0

    .line 162
    invoke-virtual {v7, v10, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 163
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v11, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0xb4

    invoke-virtual {v7, v11, v2, v10, v12}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_22

    .line 164
    :cond_25
    :goto_21
    invoke-static {v2, v3, v7}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 165
    :goto_22
    invoke-virtual {v7, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 166
    invoke-static {v1, v14, v7}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲([Ljava/lang/String;ZL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    const/4 v0, 0x4

    .line 167
    invoke-virtual {v7, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 168
    const-string v0, "invokeMethod"

    const-string v1, "(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;"

    const/16 v11, 0xb6

    invoke-virtual {v7, v11, v6, v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    const-string v0, "V"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    const/16 v0, 0x57

    .line 170
    invoke-virtual {v7, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    const/16 v0, 0xb1

    .line 171
    invoke-virtual {v7, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    const/16 v17, 0xb6

    goto/16 :goto_24

    :cond_26
    const/16 v0, 0xb1

    .line 172
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v10, 0xc0

    const/4 v11, 0x1

    if-ne v1, v11, :cond_2e

    .line 173
    const-string v1, "Z"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v11, 0xac

    if-eqz v1, :cond_27

    .line 174
    const-string v1, "java/lang/Boolean"

    const-string v14, "booleanValue"

    goto :goto_23

    .line 175
    :cond_27
    const-string v1, "C"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_28

    .line 176
    const-string v1, "java/lang/Character"

    const-string v14, "charValue"

    goto :goto_23

    .line 177
    :cond_28
    const-string v1, "B"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    .line 178
    const-string v1, "java/lang/Byte"

    const-string v14, "byteValue"

    goto :goto_23

    .line 179
    :cond_29
    const-string v1, "S"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2a

    .line 180
    const-string v1, "java/lang/Short"

    const-string v14, "shortValue"

    goto :goto_23

    .line 181
    :cond_2a
    const-string v1, "F"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2b

    const/16 v11, 0xae

    .line 182
    const-string v1, "java/lang/Float"

    const-string v14, "floatValue"

    goto :goto_23

    .line 183
    :cond_2b
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    const/16 v11, 0xad

    .line 184
    const-string v1, "java/lang/Long"

    const-string v14, "longValue"

    goto :goto_23

    .line 185
    :cond_2c
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    const/16 v11, 0xaf

    .line 186
    const-string v1, "java/lang/Double"

    const-string v14, "doubleValue"

    goto :goto_23

    .line 187
    :cond_2d
    const-string v1, "java/lang/Integer"

    const-string v14, "intValue"

    .line 188
    :goto_23
    invoke-virtual {v7, v10, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    .line 189
    const-string v10, "()"

    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v10, 0xb6

    invoke-virtual {v7, v10, v1, v14, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    invoke-virtual {v7, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    move/from16 v17, v10

    goto :goto_24

    :cond_2e
    const/16 v17, 0xb6

    .line 191
    invoke-static {v4}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v10, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    const/16 v1, 0xb0

    .line 192
    invoke-virtual {v7, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 193
    :goto_24
    invoke-virtual {v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    .line 194
    :goto_25
    invoke-virtual/range {v27 .. v27}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    move-result-object v4

    .line 195
    iget-object v7, v9, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    move-object v10, v7

    :goto_26
    if-eqz v10, :cond_35

    .line 196
    invoke-virtual {v10}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v11

    array-length v14, v11

    const/4 v0, 0x0

    :goto_27
    if-ge v0, v14, :cond_34

    aget-object v30, v11, v0

    move/from16 v31, v0

    .line 197
    invoke-virtual/range {v30 .. v30}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_32

    array-length v0, v4

    move-object/from16 v32, v1

    .line 198
    invoke-virtual/range {v30 .. v30}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v1

    if-ne v0, v1, :cond_33

    .line 199
    invoke-virtual/range {v30 .. v30}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    .line 200
    array-length v1, v0

    move-object/from16 v33, v0

    new-array v0, v1, [Ljava/lang/String;

    move-object/from16 v34, v0

    const/4 v0, 0x0

    :goto_28
    if-ge v0, v1, :cond_2f

    .line 201
    aget-object v35, v33, v0

    invoke-static/range {v35 .. v35}, Lbsh/BSHType;->getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v35

    aput-object v35, v34, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_28

    :cond_2f
    const/4 v1, 0x0

    const/16 v33, 0x1

    .line 202
    :goto_29
    array-length v0, v4

    if-ge v1, v0, :cond_30

    .line 203
    aget-object v0, v4, v1

    move/from16 v35, v1

    aget-object v1, v34, v35

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-nez v33, :cond_31

    :cond_30
    move/from16 v0, v33

    goto :goto_2a

    :cond_31
    add-int/lit8 v1, v35, 0x1

    goto :goto_29

    :goto_2a
    if-eqz v0, :cond_33

    move-object/from16 v10, v30

    goto :goto_2b

    :cond_32
    move-object/from16 v32, v1

    :cond_33
    add-int/lit8 v0, v31, 0x1

    move-object/from16 v1, v32

    goto :goto_27

    :cond_34
    move-object/from16 v32, v1

    .line 204
    invoke-virtual {v10}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v10

    const/16 v0, 0xb1

    goto :goto_26

    :cond_35
    const/4 v10, 0x0

    :goto_2b
    if-eqz v10, :cond_3b

    if-nez v15, :cond_3b

    .line 205
    invoke-virtual/range {v27 .. v27}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {v27 .. v27}, Lbsh/DelayedEvalBshMethod;->getReturnTypeDescriptor()Ljava/lang/String;

    move-result-object v1

    .line 206
    invoke-virtual/range {v27 .. v27}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    move-result-object v4

    if-nez v1, :cond_36

    move-object/from16 v1, v26

    .line 207
    :cond_36
    invoke-static {v1, v4}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 208
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v14, "_bshSuper"

    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v15, 0x1

    invoke-virtual {v5, v15, v7, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;

    move-result-object v7

    const/4 v11, 0x0

    const/16 v14, 0x19

    .line 209
    invoke-virtual {v7, v14, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 210
    array-length v11, v4

    move v14, v15

    const/4 v15, 0x0

    :goto_2c
    if-ge v15, v11, :cond_3a

    move-object/from16 v26, v2

    aget-object v2, v4, v15

    move-object/from16 v27, v4

    .line 211
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    move-object/from16 v30, v5

    const/4 v5, 0x1

    if-ne v4, v5, :cond_37

    const/16 v4, 0x15

    .line 212
    invoke-virtual {v7, v4, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    const/16 v4, 0x19

    goto :goto_2d

    :cond_37
    const/16 v4, 0x19

    .line 213
    invoke-virtual {v7, v4, v14}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 214
    :goto_2d
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v31

    if-nez v31, :cond_39

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_38

    goto :goto_2e

    :cond_38
    move v2, v5

    goto :goto_2f

    :cond_39
    :goto_2e
    const/4 v2, 0x2

    :goto_2f
    add-int/2addr v14, v2

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v30

    goto :goto_2c

    :cond_3a
    move-object/from16 v26, v2

    move-object/from16 v30, v5

    const/16 v4, 0x19

    const/4 v5, 0x1

    .line 215
    iget-object v2, v9, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    const/16 v8, 0xb7

    invoke-virtual {v7, v8, v2, v0, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    invoke-static {v1, v7}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 217
    invoke-virtual {v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    goto :goto_30

    :cond_3b
    move-object/from16 v26, v2

    move-object/from16 v30, v5

    const/16 v4, 0x19

    const/4 v5, 0x1

    const/16 v8, 0xb7

    :goto_30
    add-int/lit8 v7, v22, 0x1

    move-object/from16 v10, p5

    move-object/from16 v0, v21

    move/from16 v1, v25

    move-object/from16 v2, v26

    move-object/from16 v8, v29

    move-object/from16 v5, v30

    goto/16 :goto_1a

    :cond_3c
    move-object/from16 v30, v5

    .line 218
    invoke-virtual/range {v30 .. v30}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()[B

    move-result-object v1

    .line 219
    invoke-static {}, Lbsh/Interpreter;->getSaveClasses()Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 220
    invoke-static {}, Lbsh/Interpreter;->getSaveClassesDir()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3d

    .line 221
    :try_start_5
    new-instance v2, Ljava/io/FileOutputStream;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".class"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 222
    :try_start_6
    invoke-virtual {v2, v1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 223
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_33

    :catch_4
    move-exception v0

    goto :goto_32

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 224
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_31

    :catchall_1
    move-exception v0

    :try_start_9
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_31
    throw v3
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 225
    :goto_32
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3d
    :goto_33
    move-object/from16 v2, v19

    move-object/from16 v6, v28

    .line 226
    invoke-virtual {v2, v6, v1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;[B)Ljava/lang/Class;

    move-result-object v4

    .line 227
    const-string v0, "Define "

    const-string v1, " as "

    filled-new-array {v0, v6, v1, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    goto :goto_34

    :cond_3e
    move-object/from16 v20, v9

    :goto_34
    const/16 v0, 0x24

    const/16 v14, 0x2e

    .line 228
    invoke-virtual {v6, v0, v14}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lbsh/NameSpace;->importClass(Ljava/lang/String;)V

    move-object/from16 v9, v20

    .line 229
    invoke-virtual {v9, v4}, Lbsh/NameSpace;->setClassStatic(Ljava/lang/Class;)V

    .line 230
    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 231
    invoke-virtual/range {p7 .. p7}, Lbsh/Interpreter;->getStrictJava()Z

    move-result v0

    if-eqz v0, :cond_3f

    .line 232
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 233
    new-instance v1, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    invoke-direct {v1, v0}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {v1, v4}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)V

    .line 234
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lbsh/飘花落叶言子楪世苏兰哲;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lbsh/飘花落叶言子楪世苏兰哲;-><init>(I)V

    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lbsh/飘花落叶言子楪兰世苏哲;

    invoke-direct {v2, v0, v4}, Lbsh/飘花落叶言子楪兰世苏哲;-><init>(Ljava/util/ArrayList;Ljava/lang/Class;)V

    .line 235
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V

    :cond_3f
    return-object v4

    :catch_5
    move-exception v0

    .line 236
    const-string v1, "Unable to init class static block: "

    invoke-static {v1, v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/16 v16, 0x0

    return-object v16
.end method
