.class Lbsh/BSHTypedVariableDeclaration;
.super Lbsh/SimpleNode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lbsh/BSHType;

    .line 7
    .line 8
    return-object p0
.end method

.method private isValType(Lbsh/BSHType;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lbsh/BSHType;->getTypeNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Lbsh/BSHAmbiguousName;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Lbsh/BSHAmbiguousName;

    .line 10
    .line 11
    iget-object p0, p0, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 12
    .line 13
    const-string p1, "val"

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
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
    :cond_0
    invoke-virtual {v1}, Lbsh/BSHTypedVariableDeclaration;->getDeclarators()[Lbsh/BSHVariableDeclarator;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/4 v9, 0x0

    .line 47
    :goto_0
    array-length v10, v3

    .line 48
    if-ge v9, v10, :cond_7

    .line 49
    .line 50
    aget-object v4, v3, v9

    .line 51
    .line 52
    iget-object v10, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 53
    .line 54
    invoke-virtual {v4, v6, v10, v2, v0}, Lbsh/BSHVariableDeclarator;->eval(Lbsh/BSHType;Lbsh/Modifiers;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v10
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_3

    .line 58
    :try_start_1
    iget-boolean v11, v5, Lbsh/NameSpace;->isClass:Z

    .line 59
    .line 60
    if-eqz v11, :cond_2

    .line 61
    .line 62
    iget-object v11, v5, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_3

    .line 63
    .line 64
    const-string v13, "static"

    .line 65
    .line 66
    if-eqz v11, :cond_1

    .line 67
    .line 68
    :try_start_2
    new-instance v14, Lbsh/LHS;

    .line 69
    .line 70
    iget-object v15, v5, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 71
    .line 72
    iget-object v12, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v8, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 75
    .line 76
    invoke-virtual {v8, v13}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v8
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_3

    .line 80
    :try_start_3
    invoke-static {v15, v12, v8}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 81
    .line 82
    .line 83
    move-result-object v12
    :try_end_3
    .catch Lbsh/ReflectError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lbsh/EvalError; {:try_start_3 .. :try_end_3} :catch_3

    .line 84
    goto :goto_1

    .line 85
    :catch_0
    move-exception v0

    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :catch_1
    const/4 v12, 0x0

    .line 89
    :goto_1
    :try_start_4
    invoke-direct {v14, v11, v12}, Lbsh/LHS;-><init>(Ljava/lang/Object;Lbsh/飘花落叶言子世哲苏楪兰;)V

    .line 90
    .line 91
    .line 92
    move-object v12, v14

    .line 93
    goto :goto_3

    .line 94
    :cond_1
    new-instance v8, Lbsh/LHS;

    .line 95
    .line 96
    iget-object v11, v5, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 97
    .line 98
    iget-object v12, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v14, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 101
    .line 102
    invoke-virtual {v14, v13}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v13
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lbsh/EvalError; {:try_start_4 .. :try_end_4} :catch_3

    .line 106
    :try_start_5
    invoke-static {v11, v12, v13}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 107
    .line 108
    .line 109
    move-result-object v12
    :try_end_5
    .catch Lbsh/ReflectError; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lbsh/UtilEvalError; {:try_start_5 .. :try_end_5} :catch_0
    .catch Lbsh/EvalError; {:try_start_5 .. :try_end_5} :catch_3

    .line 110
    goto :goto_2

    .line 111
    :catch_2
    const/4 v12, 0x0

    .line 112
    :goto_2
    :try_start_6
    invoke-direct {v8, v11, v12}, Lbsh/LHS;-><init>(Ljava/lang/Object;Lbsh/飘花落叶言子世哲苏楪兰;)V

    .line 113
    .line 114
    .line 115
    move-object v12, v8

    .line 116
    goto :goto_3

    .line 117
    :cond_2
    const/4 v12, 0x0

    .line 118
    :goto_3
    if-eqz v12, :cond_4

    .line 119
    .line 120
    iget-object v8, v12, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 121
    .line 122
    if-eqz v8, :cond_4

    .line 123
    .line 124
    new-instance v8, Lbsh/Variable;

    .line 125
    .line 126
    iget-object v11, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 127
    .line 128
    invoke-direct {v8, v11, v7, v12}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V

    .line 129
    .line 130
    .line 131
    iget-object v11, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 132
    .line 133
    iput-object v11, v8, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 134
    .line 135
    const/4 v11, 0x1

    .line 136
    invoke-virtual {v8, v10, v11}, Lbsh/Variable;->setValue(Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v8}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    .line 140
    .line 141
    .line 142
    :cond_3
    const/4 v12, 0x0

    .line 143
    goto :goto_4

    .line 144
    :cond_4
    invoke-virtual {v0}, Lbsh/Interpreter;->getStrictJava()Z

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    if-eqz v8, :cond_5

    .line 149
    .line 150
    instance-of v8, v10, Lbsh/Primitive;

    .line 151
    .line 152
    if-eqz v8, :cond_5

    .line 153
    .line 154
    move-object v8, v10

    .line 155
    check-cast v8, Lbsh/Primitive;

    .line 156
    .line 157
    invoke-virtual {v8}, Lbsh/Primitive;->isNumber()Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-eqz v8, :cond_5

    .line 162
    .line 163
    check-cast v10, Lbsh/Primitive;

    .line 164
    .line 165
    invoke-virtual {v10}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    invoke-static {v7, v8}, Lbsh/Primitive;->castNumberStrictJava(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    :cond_5
    iget-object v8, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v11, v1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 176
    .line 177
    invoke-virtual {v5, v8, v7, v10, v11}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 178
    .line 179
    .line 180
    iget-boolean v8, v5, Lbsh/NameSpace;->isMethod:Z

    .line 181
    .line 182
    if-nez v8, :cond_3

    .line 183
    .line 184
    invoke-virtual {v0}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    iget-object v11, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 189
    .line 190
    const/4 v12, 0x0

    .line 191
    invoke-virtual {v5, v11, v12}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v8, v11}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子楪苏世哲兰;)V

    .line 196
    .line 197
    .line 198
    :goto_4
    iget-boolean v8, v5, Lbsh/NameSpace;->isClass:Z

    .line 199
    .line 200
    if-nez v8, :cond_6

    .line 201
    .line 202
    iget-object v4, v4, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v5, v4}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v4
    :try_end_6
    .catch Lbsh/UtilEvalError; {:try_start_6 .. :try_end_6} :catch_0
    .catch Lbsh/EvalError; {:try_start_6 .. :try_end_6} :catch_3

    .line 208
    goto :goto_5

    .line 209
    :cond_6
    move-object v4, v10

    .line 210
    :goto_5
    add-int/lit8 v9, v9, 0x1

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :goto_6
    :try_start_7
    invoke-virtual {v0, v1, v2}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    throw v0
    :try_end_7
    .catch Lbsh/EvalError; {:try_start_7 .. :try_end_7} :catch_3

    .line 219
    :cond_7
    return-object v4

    .line 220
    :catch_3
    move-exception v0

    .line 221
    const-string v1, "Typed variable declaration"

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    throw v0
.end method

.method public evalType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
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
    invoke-direct {p0}, Lbsh/BSHTypedVariableDeclaration;->getTypeNode()Lbsh/BSHType;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, Lbsh/BSHType;->getType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

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
    iget-object p0, p0, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
