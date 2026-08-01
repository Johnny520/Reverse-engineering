.class Lbsh/BSHAllocationExpression;
.super Lbsh/SimpleNode;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static innerClassCount:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private arrayAllocation(Lbsh/BSHArrayDimensions;Ljava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/BSHArrayDimensions;",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2, p3, p4}, Lbsh/BSHArrayDimensions;->eval(Ljava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-direct {p0, p2, p1, p3, p4}, Lbsh/BSHAllocationExpression;->arrayNewInstance(Ljava/lang/Class;Lbsh/BSHArrayDimensions;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private arrayNewInstance(Ljava/lang/Class;Lbsh/BSHArrayDimensions;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/BSHArrayDimensions;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget p4, p2, Lbsh/BSHArrayDimensions;->numUndefinedDims:I

    .line 2
    .line 3
    if-lez p4, :cond_0

    .line 4
    .line 5
    new-array p4, p4, [I

    .line 6
    .line 7
    invoke-static {p1, p4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    :try_start_0
    iget-object p2, p2, Lbsh/BSHArrayDimensions;->definedDimensions:[I

    .line 16
    .line 17
    invoke-static {p1, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-object p0

    .line 22
    :catch_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :catch_1
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :goto_0
    new-instance p2, Lbsh/EvalException;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "Can\'t construct primitive array: "

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p4

    .line 46
    invoke-direct {p2, p4, p0, p3, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw p2

    .line 50
    :goto_1
    new-instance p2, Lbsh/TargetError;

    .line 51
    .line 52
    invoke-direct {p2, p1, p0, p3}, Lbsh/TargetError;-><init>(Ljava/lang/Throwable;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 53
    .line 54
    .line 55
    throw p2
.end method

.method private constructObject(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const-string v1, "Constructor error: "

    .line 2
    .line 3
    const-string v2, "The constructor threw an exception:\n\t"

    .line 4
    .line 5
    invoke-static {p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-static {p3, p4}, Lbsh/This;->registerConstructorContext(Lbsh/CallStack;Lbsh/Interpreter;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p4, 0x0

    .line 15
    :try_start_0
    invoke-static {p1, p4, p2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CompletionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-static {p4, p4}, Lbsh/This;->registerConstructorContext(Lbsh/CallStack;Lbsh/Interpreter;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string p2, "$"

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 p2, -0x1

    .line 35
    if-ne p1, p2, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {p3}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, p4}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lbsh/Name;->getClassNameSpace(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-string p3, "static"

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-static {p2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)Lbsh/Modifiers;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2, p3}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-nez p2, :cond_3

    .line 71
    .line 72
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p2, p1}, Lbsh/NameSpace;->setParent(Lbsh/NameSpace;)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)Lbsh/Modifiers;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, p3}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-static {p2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p2}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p1, p2}, Lbsh/NameSpace;->setParent(Lbsh/NameSpace;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    :goto_0
    return-object p0

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    move-object p0, v0

    .line 116
    goto :goto_3

    .line 117
    :catch_0
    move-exception v0

    .line 118
    :goto_1
    move-object p1, v0

    .line 119
    goto :goto_2

    .line 120
    :catch_1
    move-exception v0

    .line 121
    goto :goto_1

    .line 122
    :goto_2
    :try_start_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-static {p2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    new-instance v4, Lbsh/TargetError;

    .line 146
    .line 147
    const-string v5, "Object constructor"

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    const/4 v9, 0x1

    .line 154
    move-object v7, p0

    .line 155
    move-object v8, p3

    .line 156
    invoke-direct/range {v4 .. v9}, Lbsh/TargetError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Z)V

    .line 157
    .line 158
    .line 159
    throw v4

    .line 160
    :catch_2
    move-exception v0

    .line 161
    move-object v7, p0

    .line 162
    move-object v8, p3

    .line 163
    move-object p0, v0

    .line 164
    new-instance p1, Lbsh/EvalException;

    .line 165
    .line 166
    new-instance p2, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-direct {p1, p2, v7, v8, p0}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    :goto_3
    if-eqz v3, :cond_5

    .line 187
    .line 188
    invoke-static {p4, p4}, Lbsh/This;->registerConstructorContext(Lbsh/CallStack;Lbsh/Interpreter;)V

    .line 189
    .line 190
    .line 191
    :cond_5
    throw p0
.end method

.method private constructWithClassBody(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/BSHBlock;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            "Lbsh/BSHBlock;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "anon"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget v1, Lbsh/BSHAllocationExpression;->innerClassCount:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    sput v1, Lbsh/BSHAllocationExpression;->innerClassCount:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p4}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/16 v3, 0x2f

    .line 35
    .line 36
    const/16 v4, 0x5f

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, "$"

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    sget-object v1, Lbsh/This;->CONTEXT_ARGS:Ljava/lang/ThreadLocal;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/util/Map;

    .line 64
    .line 65
    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    new-instance v4, Lbsh/Modifiers;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-direct {v4, v0}, Lbsh/Modifiers;-><init>(I)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;

    .line 75
    .line 76
    if-nez v0, :cond_0

    .line 77
    .line 78
    new-instance v0, Lbsh/飘花落叶言子楪哲兰苏世;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;

    .line 84
    .line 85
    :cond_0
    sget-object v0, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;

    .line 86
    .line 87
    sget-object v8, Lbsh/ClassGenerator$Type;->CLASS:Lbsh/ClassGenerator$Type;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    move-object v6, p1

    .line 94
    move-object v7, p3

    .line 95
    move-object v9, p4

    .line 96
    move-object/from16 v10, p5

    .line 97
    .line 98
    invoke-static/range {v3 .. v10}, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lbsh/Modifiers;[Ljava/lang/Class;Ljava/lang/Class;Lbsh/BSHBlock;Lbsh/ClassGenerator$Type;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/4 p3, 0x0

    .line 103
    :try_start_0
    invoke-static {p1, p3, p2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    return-object p0

    .line 108
    :catch_0
    move-exception v0

    .line 109
    move-object p1, v0

    .line 110
    instance-of p2, p1, Ljava/lang/reflect/InvocationTargetException;

    .line 111
    .line 112
    if-eqz p2, :cond_1

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    goto :goto_0

    .line 119
    :cond_1
    move-object p2, p1

    .line 120
    :goto_0
    new-instance p3, Lbsh/EvalException;

    .line 121
    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v1, "Error constructing inner class instance: "

    .line 125
    .line 126
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-direct {p3, p1, p0, p4, p2}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    throw p3
.end method

.method private constructWithInterfaceBody(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/BSHBlock;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            "Lbsh/BSHBlock;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p4}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance p2, Lbsh/NameSpace;

    .line 6
    .line 7
    const-string v0, "AnonymousBlock"

    .line 8
    .line 9
    invoke-direct {p2, p0, v0}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p4, p2}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p3, p4, p5, p0}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p4}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1}, Lbsh/NameSpace;->importStatic(Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p5}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p1}, Lbsh/This;->getInterface(Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    invoke-virtual {p4}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method private objectAllocation(Lbsh/BSHAmbiguousName;Lbsh/BSHArguments;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p2, p3, p4}, Lbsh/BSHArguments;->getArguments(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    if-eqz v3, :cond_4

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p3, p4, p2}, Lbsh/BSHAmbiguousName;->toObject(Lbsh/CallStack;Lbsh/Interpreter;Z)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, v0, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    check-cast v0, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 17
    .line 18
    iget-object v2, v0, Lbsh/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v0, 0x2

    .line 25
    if-le p1, v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p2, 0x0

    .line 29
    :goto_0
    :try_start_0
    sget-object p1, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 30
    .line 31
    invoke-virtual {p1, v2, v3}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lbsh/security/SecurityError; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    move-object v4, p1

    .line 41
    check-cast v4, Lbsh/BSHBlock;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    move-object v1, p0

    .line 50
    move-object v5, p3

    .line 51
    move-object v6, p4

    .line 52
    invoke-direct/range {v1 .. v6}, Lbsh/BSHAllocationExpression;->constructWithInterfaceBody(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/BSHBlock;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_1
    move-object v1, p0

    .line 58
    move-object v5, p3

    .line 59
    move-object v6, p4

    .line 60
    invoke-direct/range {v1 .. v6}, Lbsh/BSHAllocationExpression;->constructWithClassBody(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/BSHBlock;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_2
    move-object v1, p0

    .line 66
    move-object v5, p3

    .line 67
    move-object v6, p4

    .line 68
    invoke-direct {v1, v2, v3, v5, v6}, Lbsh/BSHAllocationExpression;->constructObject(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :catch_0
    move-exception v0

    .line 74
    move-object v1, p0

    .line 75
    move-object v5, p3

    .line 76
    move-object p0, v0

    .line 77
    invoke-virtual {p0, v1, v5}, Lbsh/security/SecurityError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    throw p0

    .line 82
    :cond_3
    move-object v1, p0

    .line 83
    move-object v5, p3

    .line 84
    new-instance p0, Lbsh/EvalException;

    .line 85
    .line 86
    iget-object p1, p1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 87
    .line 88
    new-instance p2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string p3, "Unknown class: "

    .line 91
    .line 92
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-direct {p0, p1, v1, v5}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 103
    .line 104
    .line 105
    throw p0

    .line 106
    :cond_4
    move-object v1, p0

    .line 107
    move-object v5, p3

    .line 108
    new-instance p0, Lbsh/EvalError;

    .line 109
    .line 110
    const-string p1, "Null args in new."

    .line 111
    .line 112
    invoke-direct {p0, p1, v1, v5}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 113
    .line 114
    .line 115
    throw p0
.end method

.method private objectArrayAllocation(Lbsh/BSHAmbiguousName;Lbsh/BSHArrayDimensions;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1, p3, p4}, Lbsh/BSHAmbiguousName;->toClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p2, p1, p3, p4}, Lbsh/BSHAllocationExpression;->arrayAllocation(Lbsh/BSHArrayDimensions;Ljava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private primitiveArrayAllocation(Lbsh/BSHPrimitiveType;Lbsh/BSHArrayDimensions;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lbsh/BSHPrimitiveType;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p2, p1, p3, p4}, Lbsh/BSHAllocationExpression;->arrayAllocation(Lbsh/BSHArrayDimensions;Ljava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public constructFromEnclosingInstance(Ljava/lang/Object;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    instance-of v1, v1, Lbsh/BSHAmbiguousName;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lbsh/BSHAmbiguousName;

    .line 15
    .line 16
    iget-object v1, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, ""

    .line 20
    .line 21
    :goto_0
    const/4 v2, 0x1

    .line 22
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    instance-of v3, v3, Lbsh/BSHArguments;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lbsh/BSHArguments;

    .line 36
    .line 37
    invoke-virtual {v2, p2, p3}, Lbsh/BSHArguments;->getArguments(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object p3, v4

    .line 43
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    array-length v3, v2

    .line 52
    :goto_2
    if-ge v0, v3, :cond_3

    .line 53
    .line 54
    aget-object v5, v2, v0

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-static {v6}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    move-object v4, v5

    .line 71
    goto :goto_3

    .line 72
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    :goto_3
    :try_start_0
    invoke-static {v4, p1, p3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    return-object p0

    .line 80
    :catch_0
    move-exception v0

    .line 81
    move-object p1, v0

    .line 82
    new-instance v0, Lbsh/TargetError;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const/4 v5, 0x1

    .line 89
    const-string v1, "Object constructor"

    .line 90
    .line 91
    move-object v3, p0

    .line 92
    move-object v4, p2

    .line 93
    invoke-direct/range {v0 .. v5}, Lbsh/TargetError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Z)V

    .line 94
    .line 95
    .line 96
    throw v0
.end method

.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Lbsh/BSHArrayDimensions;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lbsh/BSHArrayDimensions;

    .line 22
    .line 23
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-direct {p0, v0, v1, p1, p2}, Lbsh/BSHAllocationExpression;->arrayAllocation(Lbsh/BSHArrayDimensions;Ljava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    instance-of v2, v0, Lbsh/BSHAmbiguousName;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    check-cast v0, Lbsh/BSHAmbiguousName;

    .line 43
    .line 44
    instance-of v2, v1, Lbsh/BSHArguments;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    check-cast v1, Lbsh/BSHArguments;

    .line 49
    .line 50
    invoke-direct {p0, v0, v1, p1, p2}, Lbsh/BSHAllocationExpression;->objectAllocation(Lbsh/BSHAmbiguousName;Lbsh/BSHArguments;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_1
    check-cast v1, Lbsh/BSHArrayDimensions;

    .line 56
    .line 57
    invoke-direct {p0, v0, v1, p1, p2}, Lbsh/BSHAllocationExpression;->objectArrayAllocation(Lbsh/BSHAmbiguousName;Lbsh/BSHArrayDimensions;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_2
    check-cast v0, Lbsh/BSHPrimitiveType;

    .line 63
    .line 64
    check-cast v1, Lbsh/BSHArrayDimensions;

    .line 65
    .line 66
    invoke-direct {p0, v0, v1, p1, p2}, Lbsh/BSHAllocationExpression;->primitiveArrayAllocation(Lbsh/BSHPrimitiveType;Lbsh/BSHArrayDimensions;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method
