.class Lbsh/BSHMethodDeclaration;
.super Lbsh/SimpleNode;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field blockNode:Lbsh/BSHBlock;

.field firstThrowsClause:I

.field isExtension:Z

.field private isScriptedObject:Z

.field isVarArgs:Z

.field public modifiers:Lbsh/Modifiers;

.field public name:Ljava/lang/String;

.field numThrows:I

.field paramsNode:Lbsh/BSHFormalParameters;

.field receiverText:Ljava/lang/String;

.field receiverType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field returnType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field returnTypeNode:Lbsh/BSHReturnType;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lbsh/Modifiers;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p1, v0}, Lbsh/Modifiers;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lbsh/BSHMethodDeclaration;->modifiers:Lbsh/Modifiers;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lbsh/BSHMethodDeclaration;->numThrows:I

    .line 14
    .line 15
    return-void
.end method

.method private evalNodes(Lbsh/CallStack;Lbsh/Interpreter;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbsh/BSHMethodDeclaration;->insureNodesParsed()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lbsh/BSHMethodDeclaration;->firstThrowsClause:I

    .line 5
    .line 6
    :goto_0
    iget v1, p0, Lbsh/BSHMethodDeclaration;->numThrows:I

    .line 7
    .line 8
    iget v2, p0, Lbsh/BSHMethodDeclaration;->firstThrowsClause:I

    .line 9
    .line 10
    add-int/2addr v1, v2

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lbsh/BSHAmbiguousName;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p2}, Lbsh/BSHAmbiguousName;->toClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lbsh/BSHFormalParameters;->eval(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_4

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    :goto_1
    iget-object p2, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 38
    .line 39
    iget-object p2, p2, Lbsh/BSHFormalParameters;->paramTypes:[Ljava/lang/Class;

    .line 40
    .line 41
    array-length v0, p2

    .line 42
    const/4 v1, 0x0

    .line 43
    if-ge p1, v0, :cond_2

    .line 44
    .line 45
    aget-object p2, p2, p1

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    add-int/lit8 p1, p1, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance p2, Lbsh/EvalException;

    .line 53
    .line 54
    iget-object v0, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 55
    .line 56
    invoke-virtual {v0}, Lbsh/BSHFormalParameters;->getParamNames()[Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    aget-object p1, v0, p1

    .line 61
    .line 62
    iget-object v0, p0, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    .line 63
    .line 64
    new-instance v2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v3, "(Strict Java Mode) Undeclared argument type, parameter: "

    .line 67
    .line 68
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p1, " in method: "

    .line 75
    .line 76
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-direct {p2, p1, p0, v1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 87
    .line 88
    .line 89
    throw p2

    .line 90
    :cond_2
    iget-object p1, p0, Lbsh/BSHMethodDeclaration;->returnType:Ljava/lang/Class;

    .line 91
    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    new-instance p1, Lbsh/EvalException;

    .line 96
    .line 97
    iget-object p2, p0, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    .line 98
    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v2, "(Strict Java Mode) Undeclared return type for method: "

    .line 102
    .line 103
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-direct {p1, p2, p0, v1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lbsh/BSHMethodDeclaration;->evalReturnType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lbsh/BSHMethodDeclaration;->returnType:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lbsh/BSHMethodDeclaration;->evalReceiverType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lbsh/BSHMethodDeclaration;->receiverType:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lbsh/BSHMethodDeclaration;->evalNodes(Lbsh/CallStack;Lbsh/Interpreter;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, Lbsh/BshMethod;

    .line 21
    .line 22
    iget-object v1, p0, Lbsh/BSHMethodDeclaration;->modifiers:Lbsh/Modifiers;

    .line 23
    .line 24
    iget-boolean v2, p0, Lbsh/BSHMethodDeclaration;->isScriptedObject:Z

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, v1, v2}, Lbsh/BshMethod;-><init>(Lbsh/BSHMethodDeclaration;Lbsh/NameSpace;Lbsh/Modifiers;Z)V

    .line 27
    .line 28
    .line 29
    iget-boolean v1, p1, Lbsh/NameSpace;->isMethod:Z

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    iget-boolean v2, p1, Lbsh/NameSpace;->isClass:Z

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {p2}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子楪苏世哲兰;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    if-eqz v1, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 48
    .line 49
    invoke-virtual {v1}, Lbsh/BSHFormalParameters;->isListener()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p2}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget-object v1, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 60
    .line 61
    invoke-virtual {p2, v1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子楪苏世哲兰;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 65
    .line 66
    const/4 p2, 0x1

    .line 67
    invoke-virtual {p0, p2}, Lbsh/BSHFormalParameters;->setListener(Z)V

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 74
    .line 75
    return-object p0
.end method

.method public evalReceiverType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbsh/BSHMethodDeclaration;->insureNodesParsed()V

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Lbsh/BSHMethodDeclaration;->isExtension:Z

    .line 5
    .line 6
    if-eqz p2, :cond_4

    .line 7
    .line 8
    iget-object p2, p0, Lbsh/BSHMethodDeclaration;->receiverText:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz p2, :cond_4

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    :goto_0
    :try_start_0
    const-string v2, "[]"

    .line 15
    .line 16
    invoke-virtual {p2, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/lit8 v2, v2, -0x2

    .line 29
    .line 30
    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception p2

    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sparse-switch v0, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :sswitch_0
    const-string v0, "short"

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :sswitch_1
    const-string v0, "float"

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :sswitch_2
    const-string v0, "boolean"

    .line 69
    .line 70
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :sswitch_3
    const-string v0, "long"

    .line 80
    .line 81
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :sswitch_4
    const-string v0, "char"

    .line 91
    .line 92
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_1

    .line 97
    .line 98
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :sswitch_5
    const-string v0, "byte"

    .line 102
    .line 103
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :sswitch_6
    const-string v0, "int"

    .line 113
    .line 114
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_1

    .line 119
    .line 120
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :sswitch_7
    const-string v0, "double"

    .line 124
    .line 125
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_1

    .line 130
    .line 131
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_1
    :goto_1
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0, p2}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-eqz v0, :cond_3

    .line 143
    .line 144
    move-object p2, v0

    .line 145
    :goto_2
    if-nez v1, :cond_2

    .line 146
    .line 147
    return-object p2

    .line 148
    :cond_2
    new-array v0, v1, [I

    .line 149
    .line 150
    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :cond_3
    new-instance v0, Lbsh/UtilEvalError;

    .line 160
    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v2, "Extension receiver type not found: "

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-direct {v0, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    :goto_3
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    throw p0

    .line 187
    :cond_4
    const/4 p0, 0x0

    .line 188
    return-object p0

    .line 189
    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_7
        0x197ef -> :sswitch_6
        0x2e6108 -> :sswitch_5
        0x2e9356 -> :sswitch_4
        0x32c67c -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public evalReturnType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbsh/BSHMethodDeclaration;->insureNodesParsed()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lbsh/BSHMethodDeclaration;->returnTypeNode:Lbsh/BSHReturnType;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lbsh/BSHReturnType;->evalReturnType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public getReturnTypeDescriptor(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/BSHMethodDeclaration;->insureNodesParsed()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lbsh/BSHMethodDeclaration;->returnTypeNode:Lbsh/BSHReturnType;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lbsh/BSHReturnType;->getTypeDescriptor(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public getReturnTypeNode()Lbsh/BSHReturnType;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/BSHMethodDeclaration;->insureNodesParsed()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lbsh/BSHMethodDeclaration;->returnTypeNode:Lbsh/BSHReturnType;

    .line 5
    .line 6
    return-object p0
.end method

.method public declared-synchronized insureNodesParsed()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :try_start_1
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    instance-of v2, v1, Lbsh/BSHReturnType;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    check-cast v1, Lbsh/BSHReturnType;

    .line 19
    .line 20
    iput-object v1, p0, Lbsh/BSHMethodDeclaration;->returnTypeNode:Lbsh/BSHReturnType;

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move v2, v3

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_1
    move v2, v0

    .line 32
    :goto_0
    instance-of v4, v1, Lbsh/BSHAmbiguousName;

    .line 33
    .line 34
    if-eqz v4, :cond_3

    .line 35
    .line 36
    check-cast v1, Lbsh/BSHAmbiguousName;

    .line 37
    .line 38
    iget-object v1, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 39
    .line 40
    const/16 v4, 0x2e

    .line 41
    .line 42
    invoke-virtual {v1, v4}, Ljava/lang/String;->lastIndexOf(I)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-ltz v4, :cond_2

    .line 47
    .line 48
    iput-boolean v3, p0, Lbsh/BSHMethodDeclaration;->isExtension:Z

    .line 49
    .line 50
    invoke-virtual {v1, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lbsh/BSHMethodDeclaration;->receiverText:Ljava/lang/String;

    .line 55
    .line 56
    add-int/2addr v4, v3

    .line 57
    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    iput-boolean v0, p0, Lbsh/BSHMethodDeclaration;->isExtension:Z

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    iput-object v0, p0, Lbsh/BSHMethodDeclaration;->receiverText:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v1, p0, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    .line 70
    .line 71
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    :cond_3
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lbsh/BSHFormalParameters;

    .line 78
    .line 79
    iput-object v0, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 80
    .line 81
    add-int/2addr v2, v3

    .line 82
    iput v2, p0, Lbsh/BSHMethodDeclaration;->firstThrowsClause:I

    .line 83
    .line 84
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Lbsh/BSHMethodDeclaration;->numThrows:I

    .line 89
    .line 90
    add-int v4, v2, v1

    .line 91
    .line 92
    if-le v0, v4, :cond_4

    .line 93
    .line 94
    add-int/2addr v2, v1

    .line 95
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lbsh/BSHBlock;

    .line 100
    .line 101
    iput-object v0, p0, Lbsh/BSHMethodDeclaration;->blockNode:Lbsh/BSHBlock;

    .line 102
    .line 103
    :cond_4
    iget-object v0, p0, Lbsh/BSHMethodDeclaration;->blockNode:Lbsh/BSHBlock;

    .line 104
    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    invoke-virtual {v0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-lez v0, :cond_6

    .line 112
    .line 113
    iget-object v0, p0, Lbsh/BSHMethodDeclaration;->blockNode:Lbsh/BSHBlock;

    .line 114
    .line 115
    invoke-virtual {v0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    sub-int/2addr v1, v3

    .line 120
    invoke-virtual {v0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    instance-of v1, v0, Lbsh/BSHReturnStatement;

    .line 125
    .line 126
    if-eqz v1, :cond_6

    .line 127
    .line 128
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_6

    .line 133
    .line 134
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Lbsh/飘花落叶言子世兰苏楪哲;

    .line 139
    .line 140
    instance-of v1, v0, Lbsh/BSHAmbiguousName;

    .line 141
    .line 142
    if-eqz v1, :cond_5

    .line 143
    .line 144
    move-object v1, v0

    .line 145
    check-cast v1, Lbsh/BSHAmbiguousName;

    .line 146
    .line 147
    iget-object v1, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 148
    .line 149
    const-string v2, "this"

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    iput-boolean v1, p0, Lbsh/BSHMethodDeclaration;->isScriptedObject:Z

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_6
    iget-object v0, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 159
    .line 160
    invoke-virtual {v0}, Lbsh/BSHFormalParameters;->insureParsed()V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 164
    .line 165
    iget-boolean v0, v0, Lbsh/BSHFormalParameters;->isVarArgs:Z

    .line 166
    .line 167
    iput-boolean v0, p0, Lbsh/BSHMethodDeclaration;->isVarArgs:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    .line 169
    monitor-exit p0

    .line 170
    return-void

    .line 171
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 172
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
