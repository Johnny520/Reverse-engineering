.class public Lbsh/BshMethod;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;
.implements Lbsh/飘花落叶言子楪苏世哲兰;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private cparamTypes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private creturnType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field declaringNameSpace:Lbsh/NameSpace;

.field protected isExtension:Z

.field protected isScriptedObject:Z

.field protected isVarArgs:Z

.field private javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

.field private javaObject:Ljava/lang/Object;

.field protected methodBody:Lbsh/BSHBlock;

.field private transient methodCallback:Lbsh/飘花落叶言子楪哲苏世兰;

.field modifiers:Lbsh/Modifiers;

.field private name:Ljava/lang/String;

.field private paramCount:I

.field private paramModifiers:[Lbsh/Modifiers;

.field private paramNames:[Ljava/lang/String;

.field protected receiverType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private reload:Z


# direct methods
.method public constructor <init>(Lbsh/BSHMethodDeclaration;Lbsh/NameSpace;Lbsh/Modifiers;Z)V
    .locals 10

    .line 46
    iget-object v1, p1, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    iget-object v2, p1, Lbsh/BSHMethodDeclaration;->returnType:Ljava/lang/Class;

    iget-object v0, p1, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    invoke-virtual {v0}, Lbsh/BSHFormalParameters;->getParamNames()[Ljava/lang/String;

    move-result-object v3

    iget-object v0, p1, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    iget-object v4, v0, Lbsh/BSHFormalParameters;->paramTypes:[Ljava/lang/Class;

    .line 47
    invoke-virtual {v0}, Lbsh/BSHFormalParameters;->getParamModifiers()[Lbsh/Modifiers;

    move-result-object v5

    iget-object v6, p1, Lbsh/BSHMethodDeclaration;->blockNode:Lbsh/BSHBlock;

    iget-boolean v9, p1, Lbsh/BSHMethodDeclaration;->isVarArgs:Z

    move-object v0, p0

    move-object v7, p2

    move-object v8, p3

    .line 48
    invoke-direct/range {v0 .. v9}, Lbsh/BshMethod;-><init>(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;[Lbsh/Modifiers;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;Z)V

    .line 49
    iput-boolean p4, v0, Lbsh/BshMethod;->isScriptedObject:Z

    .line 50
    iget-boolean p0, p1, Lbsh/BSHMethodDeclaration;->isExtension:Z

    iput-boolean p0, v0, Lbsh/BshMethod;->isExtension:Z

    .line 51
    iget-object p0, p1, Lbsh/BSHMethodDeclaration;->receiverType:Ljava/lang/Class;

    iput-object p0, v0, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lbsh/飘花落叶言子世哲苏楪兰;Ljava/lang/Object;)V
    .locals 10

    .line 52
    iget-object v1, p1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    move-result-object v2

    .line 54
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    move-result-object v4

    const/4 v8, 0x0

    .line 55
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏世兰()Z

    move-result v9

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    .line 56
    invoke-direct/range {v0 .. v9}, Lbsh/BshMethod;-><init>(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;[Lbsh/Modifiers;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;Z)V

    .line 57
    iput-object p1, v0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 58
    iput-object p2, v0, Lbsh/BshMethod;->javaObject:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;[Lbsh/Modifiers;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;[",
            "Lbsh/Modifiers;",
            "Lbsh/BSHBlock;",
            "Lbsh/NameSpace;",
            "Lbsh/Modifiers;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbsh/BshMethod;->isScriptedObject:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lbsh/BshMethod;->isExtension:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 11
    .line 12
    iput-boolean v0, p0, Lbsh/BshMethod;->reload:Z

    .line 13
    .line 14
    iput-object p1, p0, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lbsh/BshMethod;->creturnType:Ljava/lang/Class;

    .line 17
    .line 18
    iput-object p3, p0, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 19
    .line 20
    iput-object p5, p0, Lbsh/BshMethod;->paramModifiers:[Lbsh/Modifiers;

    .line 21
    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    array-length p1, p3

    .line 25
    iput p1, p0, Lbsh/BshMethod;->paramCount:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-eqz p4, :cond_1

    .line 29
    .line 30
    array-length p1, p4

    .line 31
    iput p1, p0, Lbsh/BshMethod;->paramCount:I

    .line 32
    .line 33
    :cond_1
    :goto_0
    iput-object p4, p0, Lbsh/BshMethod;->cparamTypes:[Ljava/lang/Class;

    .line 34
    .line 35
    iput-object p6, p0, Lbsh/BshMethod;->methodBody:Lbsh/BSHBlock;

    .line 36
    .line 37
    iput-object p7, p0, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 38
    .line 39
    iput-object p8, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 40
    .line 41
    iput-boolean p9, p0, Lbsh/BshMethod;->isVarArgs:Z

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Class;Lbsh/飘花落叶言子楪哲苏世兰;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u4e16\u5170;",
            ")V"
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 59
    invoke-direct/range {v0 .. v9}, Lbsh/BshMethod;-><init>(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;[Lbsh/Modifiers;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 1

    .line 44
    new-instance v0, Lbsh/飘花落叶言子世哲兰楪苏;

    invoke-direct {v0, p1}, Lbsh/飘花落叶言子世哲兰楪苏;-><init>(Ljava/lang/reflect/Method;)V

    .line 45
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Lbsh/飘花落叶言子世哲苏楪兰;Ljava/lang/Object;)V

    return-void
.end method

.method public static equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 581
    invoke-direct/range {v0 .. v6}, Lbsh/BshMethod;->invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;ZLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;ZLjava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    const-string v5, "abstract"

    .line 12
    .line 13
    invoke-virtual {v1, v5}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-nez v5, :cond_1a

    .line 18
    .line 19
    invoke-virtual {v1}, Lbsh/BshMethod;->getReturnType()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    new-instance v0, Lbsh/CallStack;

    .line 30
    .line 31
    iget-object v7, v1, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 32
    .line 33
    invoke-direct {v0, v7}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    move-object v7, v0

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    sget-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object/from16 v0, p1

    .line 43
    .line 44
    :goto_0
    invoke-virtual {v1}, Lbsh/BshMethod;->isVarArgs()Z

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    if-nez v8, :cond_3

    .line 49
    .line 50
    array-length v8, v0

    .line 51
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterCount()I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-ne v8, v9, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    new-instance v0, Lbsh/EvalError;

    .line 59
    .line 60
    iget-object v1, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 61
    .line 62
    new-instance v3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v4, "Wrong number of arguments for local method: "

    .line 65
    .line 66
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v0, v1, v2, v7}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_3
    :goto_1
    const/4 v8, 0x1

    .line 81
    if-eqz p5, :cond_4

    .line 82
    .line 83
    invoke-virtual {v7}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    new-instance v9, Lbsh/NameSpace;

    .line 89
    .line 90
    iget-object v10, v1, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 91
    .line 92
    iget-object v11, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 93
    .line 94
    invoke-direct {v9, v10, v11}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-boolean v8, v9, Lbsh/NameSpace;->isMethod:Z

    .line 98
    .line 99
    :goto_2
    iget-boolean v10, v1, Lbsh/BshMethod;->isExtension:Z

    .line 100
    .line 101
    const/4 v11, 0x0

    .line 102
    if-eqz v10, :cond_5

    .line 103
    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    invoke-static {v3}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    invoke-virtual {v9, v10}, Lbsh/NameSpace;->importObject(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :try_start_0
    new-instance v10, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    sget-object v4, Lbsh/This$Keys;->BSHEXTENSIONMETHODRECEIVER:Lbsh/This$Keys;

    .line 119
    .line 120
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v9, v4, v3, v11}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    .line 129
    .line 130
    :catch_0
    :cond_5
    invoke-virtual {v9, v2}, Lbsh/NameSpace;->setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterCount()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    sub-int/2addr v3, v8

    .line 138
    invoke-virtual {v1}, Lbsh/BshMethod;->isVarArgs()Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    aget-object v4, v6, v3

    .line 145
    .line 146
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterCount()I

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    array-length v13, v0

    .line 151
    if-ne v12, v13, :cond_7

    .line 152
    .line 153
    aget-object v12, v0, v3

    .line 154
    .line 155
    if-eqz v12, :cond_6

    .line 156
    .line 157
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    invoke-virtual {v12}, Ljava/lang/Class;->isArray()Z

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    if-eqz v12, :cond_7

    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    aget-object v12, v0, v3

    .line 172
    .line 173
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    invoke-virtual {v12}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-virtual {v4, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_7

    .line 186
    .line 187
    :cond_6
    const/4 v4, 0x0

    .line 188
    goto :goto_3

    .line 189
    :cond_7
    array-length v4, v0

    .line 190
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterCount()I

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    sub-int/2addr v12, v8

    .line 195
    if-lt v4, v12, :cond_6

    .line 196
    .line 197
    aget-object v4, v6, v3

    .line 198
    .line 199
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    array-length v12, v0

    .line 204
    sub-int/2addr v12, v3

    .line 205
    invoke-static {v4, v12}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    :goto_3
    array-length v12, v0

    .line 210
    const-string v13, "Typed method parameter assignment"

    .line 211
    .line 212
    if-ge v11, v12, :cond_d

    .line 213
    .line 214
    if-lt v11, v3, :cond_8

    .line 215
    .line 216
    move v12, v3

    .line 217
    goto :goto_4

    .line 218
    :cond_8
    move v12, v11

    .line 219
    :goto_4
    if-eqz v4, :cond_9

    .line 220
    .line 221
    if-ne v12, v3, :cond_9

    .line 222
    .line 223
    aget-object v14, v6, v12

    .line 224
    .line 225
    invoke-virtual {v14}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    goto :goto_5

    .line 230
    :cond_9
    aget-object v14, v6, v12

    .line 231
    .line 232
    :goto_5
    if-eqz v14, :cond_b

    .line 233
    .line 234
    :try_start_1
    aget-object v15, v0, v11

    .line 235
    .line 236
    invoke-static {v15, v14, v8}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v15

    .line 240
    aput-object v15, v0, v11
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_2

    .line 241
    .line 242
    if-eqz v4, :cond_a

    .line 243
    .line 244
    if-lt v11, v3, :cond_a

    .line 245
    .line 246
    sub-int v12, v11, v12

    .line 247
    .line 248
    :try_start_2
    invoke-static {v15}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    invoke-static {v4, v12, v14}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto :goto_7

    .line 256
    :catch_1
    move-exception v0

    .line 257
    goto :goto_6

    .line 258
    :cond_a
    iget-object v10, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 259
    .line 260
    aget-object v10, v10, v12

    .line 261
    .line 262
    iget-object v8, v1, Lbsh/BshMethod;->paramModifiers:[Lbsh/Modifiers;

    .line 263
    .line 264
    aget-object v8, v8, v12

    .line 265
    .line 266
    invoke-virtual {v9, v10, v14, v15, v8}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_1

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :goto_6
    invoke-virtual {v0, v13, v2, v7}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    throw v0

    .line 275
    :catch_2
    move-exception v0

    .line 276
    new-instance v3, Lbsh/EvalError;

    .line 277
    .line 278
    iget-object v4, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 279
    .line 280
    aget-object v4, v4, v12

    .line 281
    .line 282
    iget-object v1, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    new-instance v5, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    const-string v6, "Invalid argument: `"

    .line 291
    .line 292
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-string v4, "\' for method: "

    .line 299
    .line 300
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string v1, " : "

    .line 307
    .line 308
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-direct {v3, v0, v2, v7}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 319
    .line 320
    .line 321
    throw v3

    .line 322
    :cond_b
    aget-object v8, v0, v11

    .line 323
    .line 324
    sget-object v10, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 325
    .line 326
    if-eq v8, v10, :cond_c

    .line 327
    .line 328
    :try_start_3
    iget-object v10, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 329
    .line 330
    aget-object v10, v10, v12

    .line 331
    .line 332
    invoke-virtual/range {p2 .. p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    invoke-virtual {v9, v10, v8, v12}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;
    :try_end_3
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_3

    .line 337
    .line 338
    .line 339
    :goto_7
    add-int/lit8 v11, v11, 0x1

    .line 340
    .line 341
    const/4 v8, 0x1

    .line 342
    goto/16 :goto_3

    .line 343
    .line 344
    :catch_3
    move-exception v0

    .line 345
    invoke-virtual {v0, v13, v2, v7}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    throw v0

    .line 350
    :cond_c
    new-instance v0, Lbsh/EvalError;

    .line 351
    .line 352
    iget-object v3, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 353
    .line 354
    aget-object v3, v3, v12

    .line 355
    .line 356
    iget-object v1, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 357
    .line 358
    new-instance v4, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    const-string v5, "Undefined variable or class name, parameter: "

    .line 361
    .line 362
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    const-string v3, " to method: "

    .line 369
    .line 370
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-direct {v0, v1, v2, v7}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 381
    .line 382
    .line 383
    throw v0

    .line 384
    :cond_d
    if-eqz v4, :cond_e

    .line 385
    .line 386
    :try_start_4
    iget-object v0, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 387
    .line 388
    aget-object v0, v0, v3

    .line 389
    .line 390
    aget-object v6, v6, v3

    .line 391
    .line 392
    iget-object v8, v1, Lbsh/BshMethod;->paramModifiers:[Lbsh/Modifiers;

    .line 393
    .line 394
    aget-object v3, v8, v3

    .line 395
    .line 396
    invoke-virtual {v9, v0, v6, v4, v3}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_4

    .line 397
    .line 398
    .line 399
    goto :goto_8

    .line 400
    :catch_4
    move-exception v0

    .line 401
    invoke-virtual {v0, v13, v2, v7}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    throw v0

    .line 406
    :cond_e
    :goto_8
    if-nez p5, :cond_f

    .line 407
    .line 408
    invoke-virtual {v7, v9}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 409
    .line 410
    .line 411
    :cond_f
    :try_start_5
    iget-object v0, v1, Lbsh/BshMethod;->methodBody:Lbsh/BSHBlock;

    .line 412
    .line 413
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 414
    .line 415
    move-object/from16 v4, p2

    .line 416
    .line 417
    invoke-virtual {v0, v7, v4, v3}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-virtual {v7}, Lbsh/CallStack;->copy()Lbsh/CallStack;

    .line 422
    .line 423
    .line 424
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 425
    if-nez p5, :cond_10

    .line 426
    .line 427
    invoke-virtual {v7}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 428
    .line 429
    .line 430
    :cond_10
    instance-of v4, v0, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 431
    .line 432
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 433
    .line 434
    if-eqz v4, :cond_14

    .line 435
    .line 436
    move-object v10, v0

    .line 437
    check-cast v10, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 438
    .line 439
    iget-object v0, v10, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪兰世苏哲:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 440
    .line 441
    iget v4, v10, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 442
    .line 443
    const/16 v8, 0x2f

    .line 444
    .line 445
    if-ne v4, v8, :cond_13

    .line 446
    .line 447
    iget-object v4, v10, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 448
    .line 449
    if-ne v5, v6, :cond_12

    .line 450
    .line 451
    sget-object v8, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 452
    .line 453
    if-ne v4, v8, :cond_11

    .line 454
    .line 455
    goto :goto_9

    .line 456
    :cond_11
    new-instance v1, Lbsh/EvalException;

    .line 457
    .line 458
    const-string v2, "Cannot return value from void method"

    .line 459
    .line 460
    invoke-direct {v1, v2, v0, v3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 461
    .line 462
    .line 463
    throw v1

    .line 464
    :cond_12
    :goto_9
    move-object v0, v4

    .line 465
    goto :goto_a

    .line 466
    :cond_13
    new-instance v1, Lbsh/EvalException;

    .line 467
    .line 468
    const-string v2, "\'continue\' or \'break\' in method body"

    .line 469
    .line 470
    invoke-direct {v1, v2, v0, v3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 471
    .line 472
    .line 473
    throw v1

    .line 474
    :cond_14
    const/4 v10, 0x0

    .line 475
    :goto_a
    if-eqz v5, :cond_17

    .line 476
    .line 477
    if-ne v5, v6, :cond_15

    .line 478
    .line 479
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 480
    .line 481
    return-object v0

    .line 482
    :cond_15
    const/4 v3, 0x1

    .line 483
    :try_start_6
    invoke-static {v0, v5, v3}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0
    :try_end_6
    .catch Lbsh/UtilEvalError; {:try_start_6 .. :try_end_6} :catch_5

    .line 487
    goto :goto_b

    .line 488
    :catch_5
    move-exception v0

    .line 489
    if-eqz v10, :cond_16

    .line 490
    .line 491
    iget-object v2, v10, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪兰世苏哲:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 492
    .line 493
    :cond_16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 494
    .line 495
    const-string v4, "Incorrect type returned from method: "

    .line 496
    .line 497
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    iget-object v1, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 501
    .line 502
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    invoke-virtual {v0, v1, v2, v7}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    throw v0

    .line 521
    :cond_17
    :goto_b
    const-string v3, "clone"

    .line 522
    .line 523
    invoke-virtual {v1}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    if-eqz v1, :cond_18

    .line 532
    .line 533
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-static {v0, v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    if-eqz v1, :cond_18

    .line 546
    .line 547
    invoke-virtual {v1, v2, v7, v0}, Lbsh/This;->cloneMethodImpl(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    :cond_18
    return-object v0

    .line 552
    :catchall_0
    move-exception v0

    .line 553
    if-nez p5, :cond_19

    .line 554
    .line 555
    invoke-virtual {v7}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 556
    .line 557
    .line 558
    :cond_19
    throw v0

    .line 559
    :cond_1a
    new-instance v3, Lbsh/EvalError;

    .line 560
    .line 561
    iget-object v1, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 562
    .line 563
    new-instance v4, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    const-string v5, "Cannot invoke abstract method "

    .line 566
    .line 567
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-direct {v3, v1, v2, v0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 578
    .line 579
    .line 580
    throw v3
.end method

.method private invokeMethodCallback([Ljava/lang/Object;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Ljava/lang/Object;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    array-length v2, v0

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterNames()[Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    array-length v4, p1

    .line 21
    if-ge v3, v4, :cond_2

    .line 22
    .line 23
    aget-object v4, v0, v3

    .line 24
    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :try_start_0
    aget-object v5, p1, v3

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    invoke-static {v5, v4, v6}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v4}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    aput-object v4, p1, v3
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception p1

    .line 45
    new-instance v0, Lbsh/EvalError;

    .line 46
    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v4, "Invalid argument: `"

    .line 50
    .line 51
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    aget-object v2, v2, v3

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v2, "\' for method: "

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p0, " : "

    .line 70
    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v0, p0, p2, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_2
    throw v1

    .line 90
    :cond_3
    throw v1
.end method

.method private static synthetic lambda$getParameterNames$0(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-char p0, p0

    .line 6
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static synthetic lambda$getParameterNames$1(I)[Ljava/lang/String;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private reloadTypes()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lbsh/BshMethod;->reload:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    iput-boolean v0, p0, Lbsh/BshMethod;->reload:Z

    .line 7
    .line 8
    iget-object v1, p0, Lbsh/BshMethod;->creturnType:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 17
    .line 18
    iget-object v2, p0, Lbsh/BshMethod;->creturnType:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Lbsh/BshMethod;->creturnType:Ljava/lang/Class;

    .line 29
    .line 30
    :cond_0
    :goto_0
    iget-object v1, p0, Lbsh/BshMethod;->cparamTypes:[Ljava/lang/Class;

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    if-ge v0, v2, :cond_2

    .line 34
    .line 35
    aget-object v1, v1, v0

    .line 36
    .line 37
    invoke-static {v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v1, p0, Lbsh/BshMethod;->cparamTypes:[Ljava/lang/Class;

    .line 44
    .line 45
    iget-object v2, p0, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 46
    .line 47
    aget-object v3, v1, v0

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    aput-object v2, v1, v0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    :cond_2
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/BshMethod;->lambda$getParameterNames$0(Ljava/lang/Integer;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(I)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/BshMethod;->lambda$getParameterNames$1(I)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public classLoaderChanged()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->creturnType:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lbsh/BshMethod;->cparamTypes:[Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lbsh/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 35
    :goto_1
    iput-boolean v0, p0, Lbsh/BshMethod;->reload:Z

    .line 36
    .line 37
    return-void
.end method

.method public clone()Lbsh/BshMethod;
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lbsh/BshMethod;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :catch_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lbsh/BshMethod;->clone()Lbsh/BshMethod;

    move-result-object p0

    return-object p0
.end method

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
    check-cast p1, Lbsh/BshMethod;

    .line 21
    .line 22
    iget-object v2, p0, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_8

    .line 31
    .line 32
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterCount()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1}, Lbsh/BshMethod;->getParameterCount()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eq v2, v3, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    iget-boolean v2, p0, Lbsh/BshMethod;->isExtension:Z

    .line 44
    .line 45
    iget-boolean v3, p1, Lbsh/BshMethod;->isExtension:Z

    .line 46
    .line 47
    if-eq v2, v3, :cond_4

    .line 48
    .line 49
    return v0

    .line 50
    :cond_4
    if-eqz v2, :cond_5

    .line 51
    .line 52
    iget-object v2, p0, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 53
    .line 54
    iget-object v3, p1, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 55
    .line 56
    invoke-static {v2, v3}, Lbsh/BshMethod;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_5

    .line 61
    .line 62
    return v0

    .line 63
    :cond_5
    move v2, v0

    .line 64
    :goto_0
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterCount()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-ge v2, v3, :cond_7

    .line 69
    .line 70
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    aget-object v3, v3, v2

    .line 75
    .line 76
    invoke-virtual {p1}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    aget-object v4, v4, v2

    .line 81
    .line 82
    invoke-static {v3, v4}, Lbsh/BshMethod;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_6

    .line 87
    .line 88
    return v0

    .line 89
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_7
    return v1

    .line 93
    :cond_8
    :goto_1
    return v0
.end method

.method public getModifiers()Lbsh/Modifiers;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbsh/Modifiers;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, v1}, Lbsh/Modifiers;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 14
    .line 15
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object p0, v0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 9
    .line 10
    return-object p0
.end method

.method public getParameterCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lbsh/BshMethod;->paramCount:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public getParameterModifiers()[Lbsh/Modifiers;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->paramModifiers:[Lbsh/Modifiers;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [Lbsh/Modifiers;

    .line 10
    .line 11
    iput-object v0, p0, Lbsh/BshMethod;->paramModifiers:[Lbsh/Modifiers;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lbsh/BshMethod;->paramModifiers:[Lbsh/Modifiers;

    .line 14
    .line 15
    return-object p0
.end method

.method public getParameterNames()[Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x61

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    invoke-static {v1, v0}, Ljava/util/stream/IntStream;->range(II)Ljava/util/stream/IntStream;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/stream/IntStream;->boxed()Ljava/util/stream/Stream;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lbsh/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, [Ljava/lang/String;

    .line 41
    .line 42
    iput-object v0, p0, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 43
    .line 44
    :cond_0
    iget-object p0, p0, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 45
    .line 46
    return-object p0
.end method

.method public getParameterTypes()[Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lbsh/BshMethod;->reloadTypes()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lbsh/BshMethod;->cparamTypes:[Ljava/lang/Class;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public getReturnType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lbsh/BshMethod;->reloadTypes()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lbsh/BshMethod;->creturnType:Ljava/lang/Class;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public hasModifier(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, v0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏世哲:I

    .line 6
    .line 7
    sget-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-object p0, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    const/16 v0, 0x1f

    .line 17
    .line 18
    mul-int/2addr v1, v0

    .line 19
    iget-boolean v2, p0, Lbsh/BshMethod;->isExtension:Z

    .line 20
    .line 21
    invoke-static {v1, v0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(IIZ)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v1, p0, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    move v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :goto_0
    add-int/2addr v0, v1

    .line 37
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    array-length v3, v1

    .line 42
    move v4, v2

    .line 43
    :goto_1
    if-ge v4, v3, :cond_2

    .line 44
    .line 45
    aget-object v5, v1, v4

    .line 46
    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    move v5, v2

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    :goto_2
    add-int/lit8 v5, v5, 0x3

    .line 56
    .line 57
    add-int/2addr v0, v5

    .line 58
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterCount()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    add-int/2addr p0, v0

    .line 66
    return p0
.end method

.method public invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 197
    invoke-virtual/range {v0 .. v5}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 196
    invoke-virtual/range {v0 .. v5}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 198
    invoke-virtual/range {v0 .. v6}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;ZLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;ZLjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "Bsh method invoke: "

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, " overrideNameSpace: "

    .line 6
    .line 7
    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :goto_0
    array-length v1, p1

    .line 22
    if-ge v0, v1, :cond_1

    .line 23
    .line 24
    aget-object v1, p1, v0

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p0, Ljava/lang/Error;

    .line 32
    .line 33
    const-string p1, "HERE!"

    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :cond_1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    :try_start_0
    sget-object p2, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->getModifiers()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-static {p2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_2

    .line 54
    .line 55
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 56
    .line 57
    iget-object p5, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 58
    .line 59
    iget-object p6, p5, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 60
    .line 61
    iget-object p5, p5, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p2, p6, p5, p1}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catch_0
    move-exception v0

    .line 68
    move-object p0, v0

    .line 69
    goto :goto_2

    .line 70
    :catch_1
    move-exception v0

    .line 71
    move-object p0, v0

    .line 72
    goto :goto_3

    .line 73
    :catch_2
    move-exception v0

    .line 74
    move-object p0, v0

    .line 75
    move-object v3, p3

    .line 76
    move-object v4, p4

    .line 77
    goto :goto_4

    .line 78
    :cond_2
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 79
    .line 80
    iget-object p5, p0, Lbsh/BshMethod;->javaObject:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object p6, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 83
    .line 84
    iget-object p6, p6, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p2, p5, p6, p1}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :goto_1
    iget-object p2, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 90
    .line 91
    iget-object p0, p0, Lbsh/BshMethod;->javaObject:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {p2, p0, p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    return-object p0

    .line 98
    :goto_2
    invoke-virtual {p0, p4, p3}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    throw p0

    .line 103
    :goto_3
    new-instance p1, Lbsh/TargetError;

    .line 104
    .line 105
    const-string p2, "Exception invoking imported object method."

    .line 106
    .line 107
    const/4 p6, 0x1

    .line 108
    move-object p5, p3

    .line 109
    move-object p3, p0

    .line 110
    invoke-direct/range {p1 .. p6}, Lbsh/TargetError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Z)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :goto_4
    new-instance p1, Lbsh/EvalError;

    .line 115
    .line 116
    new-instance p2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string p3, "Error invoking Java method: "

    .line 119
    .line 120
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-direct {p1, p0, v4, v3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :cond_3
    move-object v3, p3

    .line 135
    move-object v4, p4

    .line 136
    iget-object p3, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 137
    .line 138
    if-eqz p3, :cond_5

    .line 139
    .line 140
    const-string p4, "synchronized"

    .line 141
    .line 142
    invoke-virtual {p3, p4}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    if-eqz p3, :cond_5

    .line 147
    .line 148
    iget-object p3, p0, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 149
    .line 150
    iget-boolean p4, p3, Lbsh/NameSpace;->isClass:Z

    .line 151
    .line 152
    if-eqz p4, :cond_4

    .line 153
    .line 154
    :try_start_1
    invoke-virtual {p3}, Lbsh/NameSpace;->getClassInstance()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p3
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_3

    .line 158
    goto :goto_5

    .line 159
    :catch_3
    const-string p0, "Can\'t get class instance for synchronized method."

    .line 160
    .line 161
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const/4 p0, 0x0

    .line 165
    return-object p0

    .line 166
    :cond_4
    invoke-virtual {p3, p2}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    :goto_5
    monitor-enter p3

    .line 171
    move-object v0, p0

    .line 172
    move-object v1, p1

    .line 173
    move-object v2, p2

    .line 174
    move v5, p5

    .line 175
    move-object v6, p6

    .line 176
    :try_start_2
    invoke-direct/range {v0 .. v6}, Lbsh/BshMethod;->invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;ZLjava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    monitor-exit p3

    .line 181
    return-object p0

    .line 182
    :catchall_0
    move-exception v0

    .line 183
    move-object p0, v0

    .line 184
    monitor-exit p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 185
    throw p0

    .line 186
    :cond_5
    move-object v0, p0

    .line 187
    move-object v1, p1

    .line 188
    move-object v2, p2

    .line 189
    move v5, p5

    .line 190
    move-object v6, p6

    .line 191
    invoke-direct/range {v0 .. v6}, Lbsh/BshMethod;->invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;ZLjava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    return-object p0
.end method

.method public isVarArgs()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lbsh/BshMethod;->isVarArgs:Z

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏世兰()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏世兰哲(Lbsh/BshMethod;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Method: "

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
