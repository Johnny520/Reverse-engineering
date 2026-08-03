.class public final Lbsh/ClassGenerator;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/ClassGenerator$Type;,
        Lbsh/ClassGenerator$ClassNodeFilter;
    }
.end annotation


# static fields
.field private static cg:Lbsh/ClassGenerator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static generateClassImpl(Ljava/lang/String;Lbsh/Modifiers;[Ljava/lang/Class;Ljava/lang/Class;Lbsh/BSHBlock;Lbsh/ClassGenerator$Type;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lbsh/Modifiers;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/BSHBlock;",
            "Lbsh/ClassGenerator$Type;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    move-object/from16 v2, p7

    .line 6
    .line 7
    invoke-virtual {v1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Lbsh/NameSpace;->getPackage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    iget-boolean v4, v3, Lbsh/NameSpace;->isClass:Z

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v5, "$"

    .line 32
    .line 33
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-object/from16 v5, p0

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    move-object v6, v4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object/from16 v5, p0

    .line 48
    .line 49
    move-object v6, v5

    .line 50
    :goto_0
    if-nez v7, :cond_1

    .line 51
    .line 52
    move-object v14, v6

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-string v4, "."

    .line 55
    .line 56
    invoke-static {v7, v4, v6}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    move-object v14, v4

    .line 61
    :goto_1
    invoke-virtual {v2}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

    .line 62
    .line 63
    .line 64
    move-result-object v15

    .line 65
    new-instance v12, Lbsh/NameSpace;

    .line 66
    .line 67
    invoke-direct {v12, v3, v6}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 v4, 0x1

    .line 71
    iput-boolean v4, v12, Lbsh/NameSpace;->isClass:Z

    .line 72
    .line 73
    invoke-virtual {v1, v12}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 74
    .line 75
    .line 76
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 77
    .line 78
    sget-object v5, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSCLASSES:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2, v4, v5}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/BSHBlock$NodeFilter;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1, v2, v7}, Lbsh/ClassGenerator;->getDeclaredVariables(Lbsh/BSHBlock;Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)[Lbsh/Variable;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    move-object/from16 v8, p3

    .line 88
    .line 89
    invoke-static {v0, v1, v2, v7, v8}, Lbsh/ClassGenerator;->getDeclaredMethods(Lbsh/BSHBlock;Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;Ljava/lang/Class;)[Lbsh/DelayedEvalBshMethod;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    invoke-virtual {v1}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v2}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 97
    .line 98
    .line 99
    new-instance v4, Lbsh/ClassGeneratorUtil;

    .line 100
    .line 101
    move-object/from16 v5, p1

    .line 102
    .line 103
    move-object/from16 v9, p2

    .line 104
    .line 105
    move-object/from16 v13, p5

    .line 106
    .line 107
    invoke-direct/range {v4 .. v13}, Lbsh/ClassGeneratorUtil;-><init>(Lbsh/Modifiers;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Lbsh/Variable;[Lbsh/DelayedEvalBshMethod;Lbsh/NameSpace;Lbsh/ClassGenerator$Type;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v12, v0}, Lbsh/ClassGeneratorUtil;->initStaticNameSpace(Lbsh/NameSpace;Lbsh/BSHBlock;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v15, v14}, Lbsh/BshClassManager;->getAssociatedClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-nez v0, :cond_3

    .line 118
    .line 119
    invoke-virtual {v4}, Lbsh/ClassGeneratorUtil;->generateClass()[B

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {}, Lbsh/Interpreter;->getSaveClasses()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_2

    .line 128
    .line 129
    invoke-static {v6, v0}, Lbsh/ClassGenerator;->saveClasses(Ljava/lang/String;[B)V

    .line 130
    .line 131
    .line 132
    :cond_2
    invoke-virtual {v15, v14, v0}, Lbsh/BshClassManager;->defineClass(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const-string v1, "Define "

    .line 137
    .line 138
    const-string v4, " as "

    .line 139
    .line 140
    filled-new-array {v1, v14, v4, v0}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_3
    const/16 v1, 0x24

    .line 148
    .line 149
    const/16 v4, 0x2e

    .line 150
    .line 151
    invoke-virtual {v14, v1, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v3, v1}, Lbsh/NameSpace;->importClass(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0}, Lbsh/NameSpace;->setClassStatic(Ljava/lang/Class;)V

    .line 159
    .line 160
    .line 161
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_4

    .line 173
    .line 174
    invoke-static {v0}, Lbsh/ClassGeneratorUtil;->checkAbstractMethodImplementation(Ljava/lang/Class;)V

    .line 175
    .line 176
    .line 177
    :cond_4
    return-object v0
.end method

.method public static getClassGenerator()Lbsh/ClassGenerator;
    .locals 1

    .line 1
    sget-object v0, Lbsh/ClassGenerator;->cg:Lbsh/ClassGenerator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbsh/ClassGenerator;

    .line 6
    .line 7
    invoke-direct {v0}, Lbsh/ClassGenerator;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lbsh/ClassGenerator;->cg:Lbsh/ClassGenerator;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lbsh/ClassGenerator;->cg:Lbsh/ClassGenerator;

    .line 13
    .line 14
    return-object v0
.end method

.method public static getDeclaredMethods(Lbsh/BSHBlock;Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;Ljava/lang/Class;)[Lbsh/DelayedEvalBshMethod;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/BSHBlock;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)[",
            "Lbsh/DelayedEvalBshMethod;"
        }
    .end annotation

    .line 1
    move-object/from16 v11, p1

    .line 2
    .line 3
    move-object/from16 v12, p2

    .line 4
    .line 5
    move-object/from16 v13, p3

    .line 6
    .line 7
    new-instance v14, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v11}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "$anon"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, -0x1

    .line 27
    if-le v0, v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v11}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lbsh/Types;->getBaseName(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 42
    .line 43
    move-object/from16 v2, p4

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lbsh/util/ValueReferenceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lbsh/BshClassManager$MemberCache;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, Lbsh/This;->CONTEXT_ARGS:Ljava/lang/ThreadLocal;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/util/Map;

    .line 62
    .line 63
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v1, v2, v3}, Lbsh/BshClassManager$MemberCache;->findMethod(Ljava/lang/String;[Ljava/lang/Object;)Lbsh/Invocable;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v2, Lbsh/DelayedEvalBshMethod;

    .line 74
    .line 75
    invoke-virtual {v11}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-direct {v2, v0, v1, v3}, Lbsh/DelayedEvalBshMethod;-><init>(Ljava/lang/String;Lbsh/Invocable;Lbsh/NameSpace;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :cond_0
    const/4 v0, 0x0

    .line 86
    move v15, v0

    .line 87
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-ge v15, v0, :cond_3

    .line 92
    .line 93
    move-object/from16 v0, p0

    .line 94
    .line 95
    invoke-virtual {v0, v15}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    instance-of v2, v1, Lbsh/BSHMethodDeclaration;

    .line 100
    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    check-cast v1, Lbsh/BSHMethodDeclaration;

    .line 104
    .line 105
    invoke-virtual {v1}, Lbsh/BSHMethodDeclaration;->insureNodesParsed()V

    .line 106
    .line 107
    .line 108
    iget-object v9, v1, Lbsh/BSHMethodDeclaration;->modifiers:Lbsh/Modifiers;

    .line 109
    .line 110
    iget-object v2, v1, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    .line 111
    .line 112
    move-object v3, v2

    .line 113
    invoke-virtual {v1, v11, v12, v13}, Lbsh/BSHMethodDeclaration;->getReturnTypeDescriptor(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v4, v3

    .line 118
    invoke-virtual {v1}, Lbsh/BSHMethodDeclaration;->getReturnTypeNode()Lbsh/BSHReturnType;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iget-object v6, v1, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 123
    .line 124
    invoke-virtual {v6, v11, v12, v13}, Lbsh/BSHFormalParameters;->getTypeDescriptors(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)[Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    new-instance v0, Lbsh/DelayedEvalBshMethod;

    .line 129
    .line 130
    iget-object v7, v1, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 131
    .line 132
    invoke-virtual {v7}, Lbsh/BSHFormalParameters;->getParamNames()[Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    move-object v8, v4

    .line 137
    move-object v4, v7

    .line 138
    iget-object v7, v1, Lbsh/BSHMethodDeclaration;->blockNode:Lbsh/BSHBlock;

    .line 139
    .line 140
    move-object v10, v8

    .line 141
    const/4 v8, 0x0

    .line 142
    move-object/from16 v16, v10

    .line 143
    .line 144
    iget-boolean v10, v1, Lbsh/BSHMethodDeclaration;->isVarArgs:Z

    .line 145
    .line 146
    move-object v13, v1

    .line 147
    move-object/from16 v1, v16

    .line 148
    .line 149
    invoke-direct/range {v0 .. v12}, Lbsh/DelayedEvalBshMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Lbsh/BSHReturnType;[Ljava/lang/String;[Ljava/lang/String;Lbsh/BSHFormalParameters;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;ZLbsh/CallStack;Lbsh/Interpreter;)V

    .line 150
    .line 151
    .line 152
    iget-boolean v1, v13, Lbsh/BSHMethodDeclaration;->isExtension:Z

    .line 153
    .line 154
    iput-boolean v1, v0, Lbsh/BshMethod;->isExtension:Z

    .line 155
    .line 156
    if-eqz v1, :cond_1

    .line 157
    .line 158
    invoke-virtual {v13, v11, v12}, Lbsh/BSHMethodDeclaration;->evalReceiverType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iput-object v1, v0, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 163
    .line 164
    :cond_1
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    :cond_2
    add-int/lit8 v15, v15, 0x1

    .line 168
    .line 169
    move-object/from16 v13, p3

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_3
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    new-array v0, v0, [Lbsh/DelayedEvalBshMethod;

    .line 177
    .line 178
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, [Lbsh/DelayedEvalBshMethod;

    .line 183
    .line 184
    return-object v0
.end method

.method public static getDeclaredVariables(Lbsh/BSHBlock;Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)[Lbsh/Variable;
    .locals 11

    .line 1
    new-instance p3, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    instance-of v3, v2, Lbsh/BSHEnumConstant;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    check-cast v2, Lbsh/BSHEnumConstant;

    .line 24
    .line 25
    :try_start_0
    new-instance v3, Lbsh/Variable;

    .line 26
    .line 27
    invoke-virtual {v2}, Lbsh/BSHEnumConstant;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v2}, Lbsh/BSHEnumConstant;->getType()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v2, v2, Lbsh/BSHEnumConstant;->mods:Lbsh/Modifiers;

    .line 36
    .line 37
    invoke-direct {v3, v5, v6, v4, v2}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_1

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_0
    instance-of v3, v2, Lbsh/BSHTypedVariableDeclaration;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    check-cast v2, Lbsh/BSHTypedVariableDeclaration;

    .line 49
    .line 50
    iget-object v3, v2, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 51
    .line 52
    invoke-virtual {v2}, Lbsh/BSHTypedVariableDeclaration;->getDeclarators()[Lbsh/BSHVariableDeclarator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    array-length v6, v5

    .line 57
    move v7, v0

    .line 58
    :goto_1
    if-ge v7, v6, :cond_1

    .line 59
    .line 60
    aget-object v8, v5, v7

    .line 61
    .line 62
    iget-object v8, v8, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 63
    .line 64
    :try_start_1
    invoke-virtual {v2, p1, p2}, Lbsh/BSHTypedVariableDeclaration;->evalType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    new-instance v10, Lbsh/Variable;

    .line 69
    .line 70
    invoke-direct {v10, v8, v9, v4, v3}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    .line 75
    .line 76
    :catch_0
    add-int/lit8 v7, v7, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catch_1
    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    new-array p0, p0, [Lbsh/Variable;

    .line 87
    .line 88
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, [Lbsh/Variable;

    .line 93
    .line 94
    return-object p0
.end method

.method public static invokeSuperclassMethodImpl(Lbsh/BshClassManager;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/BshClassManager;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v2, Lbsh/This$Keys;->BSHSUPER:Lbsh/This$Keys;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p4}, Lbsh/Types;->getTypes([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {p2, v0, v2, v3}, Lbsh/Reflect;->resolveJavaMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/Invocable;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    invoke-virtual {p2, p1, p4}, Lbsh/Invocable;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_0
    const/4 v5, 0x0

    .line 50
    move-object v0, p0

    .line 51
    move-object v2, p1

    .line 52
    move-object v3, p3

    .line 53
    move-object v4, p4

    .line 54
    invoke-static/range {v0 .. v5}, Lbsh/Reflect;->resolveExpectedJavaMethod(Lbsh/BshClassManager;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Z)Lbsh/Invocable;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0, v2, v4}, Lbsh/Invocable;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method private static saveClasses(Ljava/lang/String;[B)V
    .locals 3

    .line 1
    invoke-static {}, Lbsh/Interpreter;->getSaveClassesDir()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    .line 8
    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, "/"

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, ".class"

    .line 26
    .line 27
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 54
    :catch_0
    move-exception p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
.end method


# virtual methods
.method public generateClass(Ljava/lang/String;Lbsh/Modifiers;[Ljava/lang/Class;Ljava/lang/Class;Lbsh/BSHBlock;Lbsh/ClassGenerator$Type;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lbsh/Modifiers;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/BSHBlock;",
            "Lbsh/ClassGenerator$Type;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-static/range {p1 .. p8}, Lbsh/ClassGenerator;->generateClassImpl(Ljava/lang/String;Lbsh/Modifiers;[Ljava/lang/Class;Ljava/lang/Class;Lbsh/BSHBlock;Lbsh/ClassGenerator$Type;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public invokeSuperclassMethod(Lbsh/BshClassManager;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/BshClassManager;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2, p3, p4, p5}, Lbsh/ClassGenerator;->invokeSuperclassMethodImpl(Lbsh/BshClassManager;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
