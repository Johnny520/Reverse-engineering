.class Lbsh/BSHTypedVariableDeclaration;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private bvda:[Lbsh/BSHVariableDeclarator;

.field public modifiers:Lbsh/Modifiers;


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
    const/4 v0, 0x3

    .line 7
    invoke-direct {p1, v0}, Lbsh/Modifiers;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 11
    .line 12
    return-void
.end method

.method private getTypeNode()Lbsh/BSHType;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lbsh/BSHType;

    .line 7
    .line 8
    return-object v0
.end method

.method private isValType(Lbsh/BSHType;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lbsh/BSHType;->getTypeNode()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Lbsh/BSHAmbiguousName;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lbsh/BSHAmbiguousName;

    .line 10
    .line 11
    iget-object p1, p1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "val"

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    const-string v3, "final"

    .line 8
    .line 9
    sget-object v4, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v2}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-direct {v1}, Lbsh/BSHTypedVariableDeclaration;->getTypeNode()Lbsh/BSHType;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-virtual {v6, v2, v0}, Lbsh/BSHType;->getType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-direct {v1, v6}, Lbsh/BSHTypedVariableDeclaration;->isValType(Lbsh/BSHType;)Z

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    iget-object v8, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 30
    .line 31
    invoke-virtual {v8, v3}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-nez v8, :cond_0

    .line 36
    .line 37
    iget-object v8, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 38
    .line 39
    invoke-virtual {v8, v3}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lbsh/BSHTypedVariableDeclaration;->getDeclarators()[Lbsh/BSHVariableDeclarator;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const/4 v9, 0x0

    .line 51
    :goto_1
    array-length v10, v3

    .line 52
    if-ge v9, v10, :cond_7

    .line 53
    .line 54
    aget-object v4, v3, v9

    .line 55
    .line 56
    iget-object v10, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 57
    .line 58
    invoke-virtual {v4, v6, v10, v2, v0}, Lbsh/BSHVariableDeclarator;->eval(Lbsh/BSHType;Lbsh/Modifiers;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v10
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    :try_start_1
    iget-boolean v11, v5, Lbsh/NameSpace;->isClass:Z

    .line 63
    .line 64
    if-eqz v11, :cond_2

    .line 65
    .line 66
    iget-object v11, v5, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    .line 68
    const-string v12, "static"

    .line 69
    .line 70
    if-eqz v11, :cond_1

    .line 71
    .line 72
    :try_start_2
    new-instance v13, Lbsh/LHS;

    .line 73
    .line 74
    iget-object v14, v5, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 75
    .line 76
    iget-object v15, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v8, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 79
    .line 80
    invoke-virtual {v8, v12}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    invoke-static {v14, v15, v8}, Lbsh/Reflect;->resolveJavaField(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/Invocable;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-direct {v13, v11, v8}, Lbsh/LHS;-><init>(Ljava/lang/Object;Lbsh/Invocable;)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :catch_1
    move-exception v0

    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_1
    new-instance v13, Lbsh/LHS;

    .line 96
    .line 97
    iget-object v8, v5, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 98
    .line 99
    iget-object v11, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v14, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 102
    .line 103
    invoke-virtual {v14, v12}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    invoke-static {v8, v11, v12}, Lbsh/Reflect;->resolveJavaField(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/Invocable;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-direct {v13, v8, v11}, Lbsh/LHS;-><init>(Ljava/lang/Object;Lbsh/Invocable;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    const/4 v13, 0x0

    .line 116
    :goto_2
    if-eqz v13, :cond_4

    .line 117
    .line 118
    iget-object v8, v13, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 119
    .line 120
    if-eqz v8, :cond_4

    .line 121
    .line 122
    new-instance v8, Lbsh/Variable;

    .line 123
    .line 124
    iget-object v11, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 125
    .line 126
    invoke-direct {v8, v11, v7, v13}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V

    .line 127
    .line 128
    .line 129
    iget-object v11, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 130
    .line 131
    iput-object v11, v8, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 132
    .line 133
    const/4 v11, 0x1

    .line 134
    invoke-virtual {v8, v10, v11}, Lbsh/Variable;->setValue(Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v8}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    .line 138
    .line 139
    .line 140
    :cond_3
    const/4 v12, 0x0

    .line 141
    goto :goto_3

    .line 142
    :cond_4
    invoke-virtual {v0}, Lbsh/Interpreter;->getStrictJava()Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_5

    .line 147
    .line 148
    instance-of v8, v10, Lbsh/Primitive;

    .line 149
    .line 150
    if-eqz v8, :cond_5

    .line 151
    .line 152
    move-object v8, v10

    .line 153
    check-cast v8, Lbsh/Primitive;

    .line 154
    .line 155
    invoke-virtual {v8}, Lbsh/Primitive;->isNumber()Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-eqz v8, :cond_5

    .line 160
    .line 161
    check-cast v10, Lbsh/Primitive;

    .line 162
    .line 163
    invoke-virtual {v10}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-static {v7, v8}, Lbsh/Primitive;->castNumberStrictJava(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    :cond_5
    iget-object v8, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 172
    .line 173
    iget-object v11, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 174
    .line 175
    invoke-virtual {v5, v8, v7, v10, v11}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 176
    .line 177
    .line 178
    iget-boolean v8, v5, Lbsh/NameSpace;->isMethod:Z

    .line 179
    .line 180
    if-nez v8, :cond_3

    .line 181
    .line 182
    invoke-virtual {v0}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    iget-object v11, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 187
    .line 188
    const/4 v12, 0x0

    .line 189
    invoke-virtual {v5, v11, v12}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-virtual {v8, v11}, Lbsh/BshClassManager;->addListener(Lbsh/BshClassManager$Listener;)V

    .line 194
    .line 195
    .line 196
    :goto_3
    iget-boolean v8, v5, Lbsh/NameSpace;->isClass:Z

    .line 197
    .line 198
    if-nez v8, :cond_6

    .line 199
    .line 200
    iget-object v4, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v5, v4}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 206
    goto :goto_4

    .line 207
    :cond_6
    move-object v4, v10

    .line 208
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :goto_5
    :try_start_3
    invoke-virtual {v0, v1, v2}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    throw v0
    :try_end_3
    .catch Lbsh/EvalError; {:try_start_3 .. :try_end_3} :catch_0

    .line 217
    :cond_7
    return-object v4

    .line 218
    :goto_6
    const-string v2, "Typed variable declaration"

    .line 219
    .line 220
    invoke-virtual {v0, v2}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    throw v0
.end method

.method public evalType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 1
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
    invoke-direct {p0}, Lbsh/BSHTypedVariableDeclaration;->getTypeNode()Lbsh/BSHType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/BSHType;->getType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getDeclarators()[Lbsh/BSHVariableDeclarator;
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/BSHTypedVariableDeclaration;->bvda:[Lbsh/BSHVariableDeclarator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/lit8 v1, v0, -0x1

    .line 11
    .line 12
    new-array v1, v1, [Lbsh/BSHVariableDeclarator;

    .line 13
    .line 14
    iput-object v1, p0, Lbsh/BSHTypedVariableDeclaration;->bvda:[Lbsh/BSHVariableDeclarator;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :goto_0
    iget-object v2, p0, Lbsh/BSHTypedVariableDeclaration;->bvda:[Lbsh/BSHVariableDeclarator;

    .line 18
    .line 19
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    add-int/lit8 v3, v1, -0x1

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lbsh/BSHVariableDeclarator;

    .line 28
    .line 29
    aput-object v4, v2, v3

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-object v2
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
    iget-object v1, p0, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
