.class public Lbsh/BshMethod;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;
.implements Lbsh/BshClassManager$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/BshMethod$MethodCallback;
    }
.end annotation


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

.field private javaMethod:Lbsh/Invocable;

.field private javaObject:Ljava/lang/Object;

.field protected methodBody:Lbsh/BSHBlock;

.field private transient methodCallback:Lbsh/BshMethod$MethodCallback;

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

    .line 44
    iget-object v1, p1, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    iget-object v2, p1, Lbsh/BSHMethodDeclaration;->returnType:Ljava/lang/Class;

    iget-object v0, p1, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    invoke-virtual {v0}, Lbsh/BSHFormalParameters;->getParamNames()[Ljava/lang/String;

    move-result-object v3

    iget-object v0, p1, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    iget-object v4, v0, Lbsh/BSHFormalParameters;->paramTypes:[Ljava/lang/Class;

    .line 45
    invoke-virtual {v0}, Lbsh/BSHFormalParameters;->getParamModifiers()[Lbsh/Modifiers;

    move-result-object v5

    iget-object v6, p1, Lbsh/BSHMethodDeclaration;->blockNode:Lbsh/BSHBlock;

    iget-boolean v9, p1, Lbsh/BSHMethodDeclaration;->isVarArgs:Z

    move-object v0, p0

    move-object v7, p2

    move-object v8, p3

    .line 46
    invoke-direct/range {v0 .. v9}, Lbsh/BshMethod;-><init>(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;[Lbsh/Modifiers;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;Z)V

    .line 47
    iput-boolean p4, v0, Lbsh/BshMethod;->isScriptedObject:Z

    .line 48
    iget-boolean p2, p1, Lbsh/BSHMethodDeclaration;->isExtension:Z

    iput-boolean p2, v0, Lbsh/BshMethod;->isExtension:Z

    .line 49
    iget-object p1, p1, Lbsh/BSHMethodDeclaration;->receiverType:Ljava/lang/Class;

    iput-object p1, v0, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lbsh/Invocable;Ljava/lang/Object;)V
    .locals 10

    .line 50
    invoke-virtual {p1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    .line 51
    invoke-virtual {p1}, Lbsh/Invocable;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    const/4 v8, 0x0

    .line 52
    invoke-virtual {p1}, Lbsh/Invocable;->isVarArgs()Z

    move-result v9

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    .line 53
    invoke-direct/range {v0 .. v9}, Lbsh/BshMethod;-><init>(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;[Lbsh/Modifiers;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;Z)V

    .line 54
    iput-object p1, v0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 55
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

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Class;Lbsh/BshMethod$MethodCallback;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/BshMethod$MethodCallback;",
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

    .line 57
    invoke-direct/range {v0 .. v9}, Lbsh/BshMethod;-><init>(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;[Lbsh/Modifiers;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;Z)V

    .line 58
    iput-object p3, v0, Lbsh/BshMethod;->methodCallback:Lbsh/BshMethod$MethodCallback;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 0

    .line 56
    invoke-static {p1}, Lbsh/Invocable;->get(Ljava/lang/reflect/Method;)Lbsh/Invocable;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lbsh/BshMethod;-><init>(Lbsh/Invocable;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(I)[Ljava/lang/String;
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

.method public static synthetic b(Ljava/lang/Integer;)Ljava/lang/String;
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

.method private invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 607
    invoke-direct/range {v0 .. v6}, Lbsh/BshMethod;->invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;ZLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;ZLjava/lang/Object;)Ljava/lang/Object;
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
    if-nez v5, :cond_1b

    .line 18
    .line 19
    iget-object v5, v1, Lbsh/BshMethod;->methodBody:Lbsh/BSHBlock;

    .line 20
    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    const-string v3, "native"

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget-object v4, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const-string v3, "Cannot invoke top-level native method "

    .line 34
    .line 35
    const-string v5, ". Declare the JNI method in a class and load the SO with that class loader."

    .line 36
    .line 37
    invoke-static {v3, v4, v5}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string v3, "Cannot invoke method without a body: "

    .line 43
    .line 44
    invoke-static {v3, v4}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :goto_0
    new-instance v4, Lbsh/EvalError;

    .line 49
    .line 50
    invoke-direct {v4, v3, v2, v0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 51
    .line 52
    .line 53
    throw v4

    .line 54
    :cond_1
    invoke-virtual {v1}, Lbsh/BshMethod;->getReturnType()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    new-instance v0, Lbsh/CallStack;

    .line 65
    .line 66
    iget-object v7, v1, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 67
    .line 68
    invoke-direct {v0, v7}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    move-object v7, v0

    .line 72
    if-nez p1, :cond_3

    .line 73
    .line 74
    sget-object v0, Lbsh/Reflect;->ZERO_ARGS:[Ljava/lang/Object;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object/from16 v0, p1

    .line 78
    .line 79
    :goto_1
    invoke-virtual {v1}, Lbsh/BshMethod;->isVarArgs()Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-nez v8, :cond_5

    .line 84
    .line 85
    array-length v8, v0

    .line 86
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterCount()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-ne v8, v9, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    new-instance v0, Lbsh/EvalError;

    .line 94
    .line 95
    iget-object v3, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 96
    .line 97
    new-instance v4, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v5, "Wrong number of arguments for local method: "

    .line 100
    .line 101
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-direct {v0, v3, v2, v7}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_5
    :goto_2
    const/4 v8, 0x1

    .line 116
    if-eqz p5, :cond_6

    .line 117
    .line 118
    invoke-virtual {v7}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    goto :goto_3

    .line 123
    :cond_6
    new-instance v9, Lbsh/NameSpace;

    .line 124
    .line 125
    iget-object v10, v1, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 126
    .line 127
    iget-object v11, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {v9, v10, v11}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iput-boolean v8, v9, Lbsh/NameSpace;->isMethod:Z

    .line 133
    .line 134
    :goto_3
    iget-boolean v10, v1, Lbsh/BshMethod;->isExtension:Z

    .line 135
    .line 136
    const/4 v11, 0x0

    .line 137
    if-eqz v10, :cond_7

    .line 138
    .line 139
    if-eqz v3, :cond_7

    .line 140
    .line 141
    invoke-static {v3}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    invoke-virtual {v9, v10}, Lbsh/NameSpace;->importObject(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :try_start_0
    new-instance v10, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    sget-object v4, Lbsh/This$Keys;->BSHEXTENSIONMETHODRECEIVER:Lbsh/This$Keys;

    .line 154
    .line 155
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v9, v4, v3, v11}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    .line 164
    .line 165
    :catch_0
    :cond_7
    invoke-virtual {v9, v2}, Lbsh/NameSpace;->setNode(Lbsh/Node;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterCount()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    sub-int/2addr v3, v8

    .line 173
    invoke-virtual {v1}, Lbsh/BshMethod;->isVarArgs()Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_8

    .line 178
    .line 179
    aget-object v4, v6, v3

    .line 180
    .line 181
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterCount()I

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    array-length v13, v0

    .line 186
    if-ne v12, v13, :cond_9

    .line 187
    .line 188
    aget-object v12, v0, v3

    .line 189
    .line 190
    if-eqz v12, :cond_8

    .line 191
    .line 192
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    invoke-virtual {v12}, Ljava/lang/Class;->isArray()Z

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    if-eqz v12, :cond_9

    .line 201
    .line 202
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    aget-object v12, v0, v3

    .line 207
    .line 208
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    invoke-virtual {v12}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    invoke-virtual {v4, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_9

    .line 221
    .line 222
    :cond_8
    const/4 v4, 0x0

    .line 223
    goto :goto_4

    .line 224
    :cond_9
    array-length v4, v0

    .line 225
    invoke-virtual {v1}, Lbsh/BshMethod;->getParameterCount()I

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    sub-int/2addr v12, v8

    .line 230
    if-lt v4, v12, :cond_8

    .line 231
    .line 232
    aget-object v4, v6, v3

    .line 233
    .line 234
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    array-length v12, v0

    .line 239
    sub-int/2addr v12, v3

    .line 240
    invoke-static {v4, v12}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    :goto_4
    array-length v12, v0

    .line 245
    const-string v13, "Typed method parameter assignment"

    .line 246
    .line 247
    if-ge v11, v12, :cond_f

    .line 248
    .line 249
    if-lt v11, v3, :cond_a

    .line 250
    .line 251
    move v12, v3

    .line 252
    goto :goto_5

    .line 253
    :cond_a
    move v12, v11

    .line 254
    :goto_5
    if-eqz v4, :cond_b

    .line 255
    .line 256
    if-ne v12, v3, :cond_b

    .line 257
    .line 258
    aget-object v14, v6, v12

    .line 259
    .line 260
    invoke-virtual {v14}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    goto :goto_6

    .line 265
    :cond_b
    aget-object v14, v6, v12

    .line 266
    .line 267
    :goto_6
    if-eqz v14, :cond_d

    .line 268
    .line 269
    :try_start_1
    aget-object v15, v0, v11

    .line 270
    .line 271
    invoke-static {v15, v14, v8}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v15

    .line 275
    aput-object v15, v0, v11
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_2

    .line 276
    .line 277
    if-eqz v4, :cond_c

    .line 278
    .line 279
    if-lt v11, v3, :cond_c

    .line 280
    .line 281
    sub-int v12, v11, v12

    .line 282
    .line 283
    :try_start_2
    invoke-static {v15}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v14

    .line 287
    invoke-static {v4, v12, v14}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    goto :goto_8

    .line 291
    :catch_1
    move-exception v0

    .line 292
    goto :goto_7

    .line 293
    :cond_c
    iget-object v10, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 294
    .line 295
    aget-object v10, v10, v12

    .line 296
    .line 297
    iget-object v8, v1, Lbsh/BshMethod;->paramModifiers:[Lbsh/Modifiers;

    .line 298
    .line 299
    aget-object v8, v8, v12

    .line 300
    .line 301
    invoke-virtual {v9, v10, v14, v15, v8}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_1

    .line 302
    .line 303
    .line 304
    goto :goto_8

    .line 305
    :goto_7
    invoke-virtual {v0, v13, v2, v7}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    throw v0

    .line 310
    :catch_2
    move-exception v0

    .line 311
    new-instance v3, Lbsh/EvalError;

    .line 312
    .line 313
    iget-object v4, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 314
    .line 315
    aget-object v4, v4, v12

    .line 316
    .line 317
    iget-object v5, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    new-instance v6, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    const-string v8, "Invalid argument: `"

    .line 326
    .line 327
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v4, "\' for method: "

    .line 334
    .line 335
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v4, " : "

    .line 342
    .line 343
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-direct {v3, v0, v2, v7}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 354
    .line 355
    .line 356
    throw v3

    .line 357
    :cond_d
    aget-object v8, v0, v11

    .line 358
    .line 359
    sget-object v10, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 360
    .line 361
    if-eq v8, v10, :cond_e

    .line 362
    .line 363
    :try_start_3
    iget-object v10, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 364
    .line 365
    aget-object v10, v10, v12

    .line 366
    .line 367
    invoke-virtual/range {p2 .. p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    invoke-virtual {v9, v10, v8, v12}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;
    :try_end_3
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_3

    .line 372
    .line 373
    .line 374
    :goto_8
    add-int/lit8 v11, v11, 0x1

    .line 375
    .line 376
    const/4 v8, 0x1

    .line 377
    goto/16 :goto_4

    .line 378
    .line 379
    :catch_3
    move-exception v0

    .line 380
    invoke-virtual {v0, v13, v2, v7}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    throw v0

    .line 385
    :cond_e
    new-instance v0, Lbsh/EvalError;

    .line 386
    .line 387
    iget-object v3, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 388
    .line 389
    aget-object v3, v3, v12

    .line 390
    .line 391
    iget-object v4, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 392
    .line 393
    new-instance v5, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    const-string v6, "Undefined variable or class name, parameter: "

    .line 396
    .line 397
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    const-string v3, " to method: "

    .line 404
    .line 405
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-direct {v0, v3, v2, v7}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 416
    .line 417
    .line 418
    throw v0

    .line 419
    :cond_f
    if-eqz v4, :cond_10

    .line 420
    .line 421
    :try_start_4
    iget-object v0, v1, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 422
    .line 423
    aget-object v0, v0, v3

    .line 424
    .line 425
    aget-object v6, v6, v3

    .line 426
    .line 427
    iget-object v8, v1, Lbsh/BshMethod;->paramModifiers:[Lbsh/Modifiers;

    .line 428
    .line 429
    aget-object v3, v8, v3

    .line 430
    .line 431
    invoke-virtual {v9, v0, v6, v4, v3}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_4

    .line 432
    .line 433
    .line 434
    goto :goto_9

    .line 435
    :catch_4
    move-exception v0

    .line 436
    invoke-virtual {v0, v13, v2, v7}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    throw v0

    .line 441
    :cond_10
    :goto_9
    if-nez p5, :cond_11

    .line 442
    .line 443
    invoke-virtual {v7, v9}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 444
    .line 445
    .line 446
    :cond_11
    :try_start_5
    iget-object v0, v1, Lbsh/BshMethod;->methodBody:Lbsh/BSHBlock;

    .line 447
    .line 448
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 449
    .line 450
    move-object/from16 v4, p2

    .line 451
    .line 452
    invoke-virtual {v0, v7, v4, v3}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-virtual {v7}, Lbsh/CallStack;->copy()Lbsh/CallStack;

    .line 457
    .line 458
    .line 459
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 460
    if-nez p5, :cond_12

    .line 461
    .line 462
    invoke-virtual {v7}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 463
    .line 464
    .line 465
    :cond_12
    instance-of v4, v0, Lbsh/ReturnControl;

    .line 466
    .line 467
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 468
    .line 469
    if-eqz v4, :cond_14

    .line 470
    .line 471
    move-object v10, v0

    .line 472
    check-cast v10, Lbsh/ReturnControl;

    .line 473
    .line 474
    iget v0, v10, Lbsh/ReturnControl;->kind:I

    .line 475
    .line 476
    const/16 v4, 0x2f

    .line 477
    .line 478
    if-ne v0, v4, :cond_13

    .line 479
    .line 480
    iget-object v0, v10, Lbsh/ReturnControl;->value:Ljava/lang/Object;

    .line 481
    .line 482
    if-ne v5, v6, :cond_15

    .line 483
    .line 484
    sget-object v3, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 485
    .line 486
    if-eq v0, v3, :cond_15

    .line 487
    .line 488
    move-object v0, v3

    .line 489
    goto :goto_a

    .line 490
    :cond_13
    new-instance v0, Lbsh/EvalException;

    .line 491
    .line 492
    const-string v2, "\'continue\' or \'break\' in method body"

    .line 493
    .line 494
    iget-object v4, v10, Lbsh/ReturnControl;->returnPoint:Lbsh/Node;

    .line 495
    .line 496
    invoke-direct {v0, v2, v4, v3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 497
    .line 498
    .line 499
    throw v0

    .line 500
    :cond_14
    const/4 v10, 0x0

    .line 501
    :cond_15
    :goto_a
    if-eqz v5, :cond_18

    .line 502
    .line 503
    if-ne v5, v6, :cond_16

    .line 504
    .line 505
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 506
    .line 507
    return-object v0

    .line 508
    :cond_16
    const/4 v3, 0x1

    .line 509
    :try_start_6
    invoke-static {v0, v5, v3}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v0
    :try_end_6
    .catch Lbsh/UtilEvalError; {:try_start_6 .. :try_end_6} :catch_5

    .line 513
    goto :goto_b

    .line 514
    :catch_5
    move-exception v0

    .line 515
    if-eqz v10, :cond_17

    .line 516
    .line 517
    iget-object v2, v10, Lbsh/ReturnControl;->returnPoint:Lbsh/Node;

    .line 518
    .line 519
    :cond_17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 520
    .line 521
    const-string v4, "Incorrect type returned from method: "

    .line 522
    .line 523
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    iget-object v4, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 527
    .line 528
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    invoke-virtual {v0, v3, v2, v7}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    throw v0

    .line 547
    :cond_18
    :goto_b
    const-string v3, "clone"

    .line 548
    .line 549
    invoke-virtual {v1}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-eqz v3, :cond_19

    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    invoke-static {v0, v3}, Lbsh/Reflect;->getClassInstanceThis(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    if-eqz v3, :cond_19

    .line 572
    .line 573
    invoke-virtual {v3, v2, v7, v0}, Lbsh/This;->cloneMethodImpl(Lbsh/Node;Lbsh/CallStack;Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    :cond_19
    return-object v0

    .line 578
    :catchall_0
    move-exception v0

    .line 579
    if-nez p5, :cond_1a

    .line 580
    .line 581
    invoke-virtual {v7}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 582
    .line 583
    .line 584
    :cond_1a
    throw v0

    .line 585
    :cond_1b
    new-instance v3, Lbsh/EvalError;

    .line 586
    .line 587
    iget-object v4, v1, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 588
    .line 589
    new-instance v5, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    const-string v6, "Cannot invoke abstract method "

    .line 592
    .line 593
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    invoke-direct {v3, v4, v2, v0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 604
    .line 605
    .line 606
    throw v3
.end method

.method private invokeMethodCallback([Ljava/lang/Object;Lbsh/Node;Lbsh/CallStack;)Ljava/lang/Object;
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lbsh/Reflect;->ZERO_ARGS:[Ljava/lang/Object;

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    invoke-virtual {p0}, Lbsh/BshMethod;->getParameterNames()[Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    array-length v3, p1

    .line 21
    if-ge v2, v3, :cond_3

    .line 22
    .line 23
    aget-object v3, v0, v2

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    :try_start_0
    aget-object v4, p1, v2

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    invoke-static {v4, v3, v5}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    aput-object v3, p1, v2
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    :goto_1
    add-int/lit8 v2, v2, 0x1

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
    aget-object v1, v1, v2

    .line 48
    .line 49
    iget-object v2, p0, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v4, "Invalid argument: `"

    .line 58
    .line 59
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, "\' for method: "

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, " : "

    .line 74
    .line 75
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {v0, p1, p2, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_3
    iget-object p2, p0, Lbsh/BshMethod;->methodCallback:Lbsh/BshMethod$MethodCallback;

    .line 90
    .line 91
    invoke-interface {p2, p1}, Lbsh/BshMethod$MethodCallback;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :cond_4
    :goto_2
    iget-object p2, p0, Lbsh/BshMethod;->methodCallback:Lbsh/BshMethod$MethodCallback;

    .line 97
    .line 98
    invoke-interface {p2, p1}, Lbsh/BshMethod$MethodCallback;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1
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
    invoke-static {v1}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

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
    invoke-static {v1}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

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


# virtual methods
.method public classLoaderChanged()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->creturnType:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {v0}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

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
    new-instance v1, Lbsh/a;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-direct {v1, v2}, Lbsh/a;-><init>(I)V

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
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lbsh/BshMethod;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lbsh/BshMethod;->clone()Lbsh/BshMethod;

    move-result-object v0

    return-object v0
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
    iget-object v0, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 14
    .line 15
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/BshMethod;->name:Ljava/lang/String;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public getParameterCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lbsh/BshMethod;->paramCount:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lbsh/Invocable;->getParameterCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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
    iget-object v0, p0, Lbsh/BshMethod;->paramModifiers:[Lbsh/Modifiers;

    .line 14
    .line 15
    return-object v0
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
    new-instance v1, Lbsh/b;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v1, v2}, Lbsh/b;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lbsh/e;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, v2}, Lbsh/e;-><init>(I)V

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
    iget-object v0, p0, Lbsh/BshMethod;->paramNames:[Ljava/lang/String;

    .line 45
    .line 46
    return-object v0
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
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lbsh/BshMethod;->reloadTypes()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lbsh/BshMethod;->cparamTypes:[Ljava/lang/Class;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Lbsh/Invocable;->getParameterTypes()[Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
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
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lbsh/BshMethod;->reloadTypes()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lbsh/BshMethod;->creturnType:Ljava/lang/Class;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public hasModifier(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/Invocable;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p1, v0}, Lbsh/Reflect;->hasModifier(Ljava/lang/String;I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    iget-object v0, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return p1
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
    invoke-static {v1, v0, v2}, Leh/a;->h(IIZ)I

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
    move-result v1

    .line 65
    add-int/2addr v1, v0

    .line 66
    return v1
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
    invoke-virtual/range {v0 .. v5}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 196
    invoke-virtual/range {v0 .. v5}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 198
    invoke-virtual/range {v0 .. v6}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;ZLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;ZLjava/lang/Object;)Ljava/lang/Object;
    .locals 6

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
    new-instance p1, Ljava/lang/Error;

    .line 32
    .line 33
    const-string p2, "HERE!"

    .line 34
    .line 35
    invoke-direct {p1, p2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object v0, p0, Lbsh/BshMethod;->methodCallback:Lbsh/BshMethod$MethodCallback;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-direct {p0, p1, p4, p3}, Lbsh/BshMethod;->invokeMethodCallback([Ljava/lang/Object;Lbsh/Node;Lbsh/CallStack;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_2
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    :try_start_0
    invoke-static {v0}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 59
    .line 60
    iget-object p5, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 61
    .line 62
    invoke-virtual {p5}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object p5

    .line 66
    iget-object p6, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 67
    .line 68
    invoke-virtual {p6}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p6

    .line 72
    invoke-virtual {p2, p5, p6, p1}, Lbsh/security/MainSecurityGuard;->canInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catch_0
    move-exception v0

    .line 77
    move-object p1, v0

    .line 78
    goto :goto_2

    .line 79
    :catch_1
    move-exception v0

    .line 80
    move-object p1, v0

    .line 81
    move-object v2, p1

    .line 82
    goto :goto_3

    .line 83
    :catch_2
    move-exception v0

    .line 84
    move-object p1, v0

    .line 85
    goto :goto_4

    .line 86
    :cond_3
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 87
    .line 88
    iget-object p5, p0, Lbsh/BshMethod;->javaObject:Ljava/lang/Object;

    .line 89
    .line 90
    iget-object p6, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 91
    .line 92
    invoke-virtual {p6}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p6

    .line 96
    invoke-virtual {p2, p5, p6, p1}, Lbsh/security/MainSecurityGuard;->canInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    iget-object p2, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 100
    .line 101
    iget-object p5, p0, Lbsh/BshMethod;->javaObject:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-virtual {p2, p5, p1}, Lbsh/Invocable;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    return-object p1

    .line 108
    :goto_2
    invoke-virtual {p1, p4, p3}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    throw p1

    .line 113
    :goto_3
    new-instance v0, Lbsh/TargetError;

    .line 114
    .line 115
    const-string v1, "Exception invoking imported object method."

    .line 116
    .line 117
    const/4 v5, 0x1

    .line 118
    move-object v4, p3

    .line 119
    move-object v3, p4

    .line 120
    invoke-direct/range {v0 .. v5}, Lbsh/TargetError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbsh/Node;Lbsh/CallStack;Z)V

    .line 121
    .line 122
    .line 123
    throw v0

    .line 124
    :goto_4
    new-instance p2, Lbsh/EvalError;

    .line 125
    .line 126
    new-instance p5, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string p6, "Error invoking Java method: "

    .line 129
    .line 130
    invoke-direct {p5, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-direct {p2, p1, p4, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 141
    .line 142
    .line 143
    throw p2

    .line 144
    :cond_4
    iget-object v0, p0, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 145
    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    const-string v1, "synchronized"

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_6

    .line 155
    .line 156
    iget-object v0, p0, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 157
    .line 158
    iget-boolean v1, v0, Lbsh/NameSpace;->isClass:Z

    .line 159
    .line 160
    if-eqz v1, :cond_5

    .line 161
    .line 162
    :try_start_1
    invoke-virtual {v0}, Lbsh/NameSpace;->getClassInstance()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_3

    .line 166
    :goto_5
    move-object v1, v0

    .line 167
    goto :goto_6

    .line 168
    :catch_3
    const-string p1, "Can\'t get class instance for synchronized method."

    .line 169
    .line 170
    invoke-static {p1}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    const/4 p1, 0x0

    .line 174
    return-object p1

    .line 175
    :cond_5
    invoke-virtual {v0, p2}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    goto :goto_5

    .line 180
    :goto_6
    monitor-enter v1

    .line 181
    :try_start_2
    invoke-direct/range {p0 .. p6}, Lbsh/BshMethod;->invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;ZLjava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    monitor-exit v1

    .line 186
    return-object p1

    .line 187
    :catchall_0
    move-exception v0

    .line 188
    move-object p1, v0

    .line 189
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 190
    throw p1

    .line 191
    :cond_6
    invoke-direct/range {p0 .. p6}, Lbsh/BshMethod;->invokeImpl([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;ZLjava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    return-object p1
.end method

.method public isVarArgs()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshMethod;->javaMethod:Lbsh/Invocable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lbsh/BshMethod;->isVarArgs:Z

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lbsh/Invocable;->isVarArgs()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Method: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lbsh/StringUtil;->methodString(Lbsh/BshMethod;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
