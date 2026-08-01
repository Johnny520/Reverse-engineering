.class Lbsh/BSHArrayInitializer;
.super Lbsh/SimpleNode;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field expressionQueue:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lbsh/BSHPrimaryExpression;",
            ">;"
        }
    .end annotation
.end field

.field isMapInArray:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lbsh/BSHArrayInitializer;->isMapInArray:Z

    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lbsh/BSHArrayInitializer;->expressionQueue:Ljava/util/Deque;

    .line 13
    .line 14
    return-void
.end method

.method private buildArray(ILjava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-array v0, p1, [I

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    aput v1, v0, v2

    .line 9
    .line 10
    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-ge v2, v3, :cond_4

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    instance-of v4, v3, Lbsh/BSHArrayInitializer;

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    if-ge p1, v4, :cond_1

    .line 38
    .line 39
    check-cast v3, Lbsh/BSHArrayInitializer;

    .line 40
    .line 41
    invoke-direct {p0, v3}, Lbsh/BSHArrayInitializer;->isMapInArray(Lbsh/BSHArrayInitializer;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    const-class v4, Lbsh/Types$MapEntry;

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    invoke-virtual {v3, v4, v5, p3, p4}, Lbsh/BSHArrayInitializer;->eval(Ljava/lang/Class;ILbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    new-instance p1, Lbsh/EvalException;

    .line 56
    .line 57
    new-instance p4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v0, "Invalid Intializer for "

    .line 60
    .line 61
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p2, ", at position: "

    .line 68
    .line 69
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_1
    check-cast v3, Lbsh/BSHArrayInitializer;

    .line 84
    .line 85
    add-int/lit8 v4, p1, -0x1

    .line 86
    .line 87
    invoke-virtual {v3, p2, v4, p3, p4}, Lbsh/BSHArrayInitializer;->eval(Ljava/lang/Class;ILbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    invoke-interface {v3, p3, p4}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    :goto_1
    sget-object v4, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 97
    .line 98
    if-eq v3, v4, :cond_3

    .line 99
    .line 100
    :try_start_0
    invoke-direct {p0, v3, v1, p1, p3}, Lbsh/BSHArrayInitializer;->normalizeEntry(Ljava/lang/Object;Ljava/lang/Class;ILbsh/CallStack;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-static {v0, v2, v4}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catch_0
    move-exception v4

    .line 109
    const-string v5, "illegal arg"

    .line 110
    .line 111
    filled-new-array {v5, v4}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v4}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0, p2, v3, v2, p3}, Lbsh/BSHArrayInitializer;->throwTypeError(Ljava/lang/Class;Ljava/lang/Object;ILbsh/CallStack;)V

    .line 119
    .line 120
    .line 121
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    new-instance p1, Lbsh/EvalException;

    .line 125
    .line 126
    const-string p2, "Void in array initializer, position "

    .line 127
    .line 128
    invoke-static {v2, p2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_4
    return-object v0
.end method

.method private buildBean(Ljava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lbsh/NameSpace;

    .line 2
    .line 3
    invoke-virtual {p2}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, v0}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->setClassStatic(Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p3}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p2}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->setClassInstance(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    move v1, v0

    .line 49
    :goto_0
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-ge v1, v2, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lbsh/BSHAssignment;

    .line 60
    .line 61
    invoke-virtual {v2, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lbsh/BSHPrimaryExpression;

    .line 66
    .line 67
    iput-boolean v0, v3, Lbsh/BSHPrimaryExpression;->isMapExpression:Z

    .line 68
    .line 69
    iput-boolean v0, v3, Lbsh/BSHPrimaryExpression;->isArrayExpression:Z

    .line 70
    .line 71
    invoke-virtual {v2, p2, p3}, Lbsh/BSHAssignment;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    invoke-virtual {p2}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :goto_1
    :try_start_1
    new-instance p3, Lbsh/EvalException;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {p3, v0, p0, p2, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    :catchall_1
    move-exception p0

    .line 94
    invoke-virtual {p2}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 95
    .line 96
    .line 97
    throw p0
.end method

.method private clearEvalCache()V
    .locals 1

    .line 1
    iget-object p0, p0, Lbsh/BSHArrayInitializer;->expressionQueue:Ljava/util/Deque;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lbsh/BSHPrimaryExpression;

    .line 18
    .line 19
    invoke-virtual {v0}, Lbsh/BSHPrimaryExpression;->clearCache()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method private inferCommonType(Ljava/lang/Class;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u82cf\u696a\u54f2;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    if-eq v0, p1, :cond_3

    .line 4
    .line 5
    const-class v0, Lbsh/Types$MapEntry;

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    instance-of v0, p2, Lbsh/BSHAssignment;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p2, p3, p4}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p1}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p0, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    instance-of v0, p2, Lbsh/BSHArrayInitializer;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    move-object v0, p2

    .line 40
    check-cast v0, Lbsh/BSHArrayInitializer;

    .line 41
    .line 42
    invoke-direct {p0, v0}, Lbsh/BSHArrayInitializer;->isMapInArray(Lbsh/BSHArrayInitializer;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    const-class p0, Ljava/util/Map;

    .line 49
    .line 50
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-interface {p2}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChildren()[Lbsh/飘花落叶言子世兰苏楪哲;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    array-length v0, p2

    .line 60
    const/4 v1, 0x0

    .line 61
    :goto_0
    if-ge v1, v0, :cond_3

    .line 62
    .line 63
    aget-object v2, p2, v1

    .line 64
    .line 65
    invoke-direct {p0, p1, v2, p3, p4}, Lbsh/BSHArrayInitializer;->inferCommonType(Ljava/lang/Class;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    :goto_1
    return-object p1
.end method

.method private inferDimensions(IILbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Lbsh/Interpreter;)I
    .locals 3

    .line 1
    :goto_0
    invoke-interface {p3}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-le v0, p2, :cond_0

    .line 7
    .line 8
    invoke-interface {p3, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    instance-of v0, p3, Lbsh/BSHArrayInitializer;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move-object v0, p3

    .line 17
    check-cast v0, Lbsh/BSHArrayInitializer;

    .line 18
    .line 19
    invoke-direct {p0, v0}, Lbsh/BSHArrayInitializer;->isMapInArray(Lbsh/BSHArrayInitializer;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p3}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetNumChildren()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-lez v0, :cond_0

    .line 30
    .line 31
    add-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    move p2, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    instance-of v0, p3, Lbsh/BSHArrayInitializer;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-interface {p3, p4, p5}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v2, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 44
    .line 45
    if-ne v0, v2, :cond_1

    .line 46
    .line 47
    add-int/lit8 p2, p2, 0x1

    .line 48
    .line 49
    invoke-interface {p3}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetParent()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-direct/range {p0 .. p5}, Lbsh/BSHArrayInitializer;->inferDimensions(IILbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Lbsh/Interpreter;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0

    .line 58
    :cond_1
    invoke-static {v0, v1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    add-int/2addr p0, p1

    .line 67
    return p0

    .line 68
    :cond_2
    invoke-interface {p3}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetNumChildren()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    add-int/lit8 p2, p2, 0x1

    .line 75
    .line 76
    invoke-interface {p3}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetParent()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    invoke-direct/range {p0 .. p5}, Lbsh/BSHArrayInitializer;->inferDimensions(IILbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Lbsh/Interpreter;)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0

    .line 85
    :cond_3
    return p1
.end method

.method private isBeanType(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    instance-of p1, p1, Lbsh/BSHAssignment;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1, v1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    instance-of p1, p1, Lbsh/BSHPrimaryExpression;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1, v1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lbsh/BSHPrimaryExpression;

    .line 41
    .line 42
    iget-boolean p1, p1, Lbsh/BSHPrimaryExpression;->isMapExpression:Z

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p0, v1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {p0, v1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    instance-of p0, p0, Lbsh/BSHAmbiguousName;

    .line 59
    .line 60
    if-eqz p0, :cond_0

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    return p0

    .line 64
    :cond_0
    return v1
.end method

.method private isMapInArray(Lbsh/BSHArrayInitializer;)Z
    .locals 0

    .line 1
    iget-boolean p0, p1, Lbsh/BSHArrayInitializer;->isMapInArray:Z

    .line 2
    .line 3
    return p0
.end method

.method private normalizeEntry(Ljava/lang/Object;Ljava/lang/Class;ILbsh/CallStack;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;I",
            "Lbsh/CallStack;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p3, v0, :cond_1

    .line 3
    .line 4
    sget-object p3, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 5
    .line 6
    if-eq p1, p3, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_1
    :goto_0
    const/4 p3, 0x0

    .line 15
    :try_start_0
    invoke-static {p1, p2, p3}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-object p0

    .line 24
    :catch_0
    move-exception p1

    .line 25
    const-string p2, "Error in array initializer"

    .line 26
    .line 27
    invoke-virtual {p1, p2, p0, p4}, Lbsh/UtilEvalError;->toEvalException(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalException;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    throw p0
.end method

.method private throwTypeError(Ljava/lang/Class;Ljava/lang/Object;ILbsh/CallStack;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "I",
            "Lbsh/CallStack;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v0, Lbsh/EvalException;

    .line 6
    .line 7
    const-string v1, "Incompatible type: "

    .line 8
    .line 9
    const-string v2, " in initializer of array type: "

    .line 10
    .line 11
    invoke-static {v1, p2, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, " at position: "

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1, p0, p4}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method private toCollection(Ljava/lang/Object;Ljava/lang/Class;Lbsh/CallStack;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/CallStack;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const-class v0, Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-class v0, Ljava/util/Collection;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    :try_start_0
    invoke-static {p1, p2, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    return-object p0

    .line 43
    :catch_0
    move-exception p2

    .line 44
    invoke-virtual {p2, p0, p3}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 45
    .line 46
    .line 47
    :cond_1
    return-object p1
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 126
    new-instance p2, Lbsh/EvalError;

    const-string v0, "Array initializer has no base type."

    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    throw p2
.end method

.method public eval(Ljava/lang/Class;ILbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move p2, v1

    .line 9
    :cond_0
    const-class v0, Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    if-nez p2, :cond_3

    .line 14
    .line 15
    if-eq p1, v2, :cond_2

    .line 16
    .line 17
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v0, p1

    .line 25
    :cond_2
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-direct {p0, p2, p1, p3}, Lbsh/BSHArrayInitializer;->toCollection(Ljava/lang/Object;Ljava/lang/Class;Lbsh/CallStack;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_3
    const/4 v1, -0x1

    .line 35
    if-ne v1, p2, :cond_7

    .line 36
    .line 37
    invoke-virtual {p4}, Lbsh/Interpreter;->getStrictJava()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-nez p2, :cond_6

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lbsh/BSHArrayInitializer;->isBeanType(Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_4

    .line 48
    .line 49
    invoke-direct {p0, p1, p3, p4}, Lbsh/BSHArrayInitializer;->buildBean(Ljava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_4
    const/4 v4, 0x1

    .line 55
    const/4 v5, 0x0

    .line 56
    move-object v6, p0

    .line 57
    move-object v3, p0

    .line 58
    move-object v7, p3

    .line 59
    move-object v8, p4

    .line 60
    invoke-direct/range {v3 .. v8}, Lbsh/BSHArrayInitializer;->inferDimensions(IILbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Lbsh/Interpreter;)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_5

    .line 69
    .line 70
    move-object p0, v2

    .line 71
    goto :goto_2

    .line 72
    :cond_5
    :goto_1
    move-object p0, p1

    .line 73
    goto :goto_2

    .line 74
    :cond_6
    move-object v3, p0

    .line 75
    move-object v7, p3

    .line 76
    new-instance p0, Lbsh/EvalException;

    .line 77
    .line 78
    const-string p1, "No declared array type or dimensions."

    .line 79
    .line 80
    invoke-direct {p0, p1, v3, v7}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_7
    move-object v3, p0

    .line 85
    move-object v7, p3

    .line 86
    move-object v8, p4

    .line 87
    goto :goto_1

    .line 88
    :goto_2
    if-ne p0, v2, :cond_8

    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    invoke-direct {v3, p0, v3, v7, v8}, Lbsh/BSHArrayInitializer;->inferCommonType(Ljava/lang/Class;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    :cond_8
    const/4 p3, 0x2

    .line 96
    if-ge p2, p3, :cond_b

    .line 97
    .line 98
    const-class p3, Lbsh/Types$MapEntry;

    .line 99
    .line 100
    if-ne p3, p0, :cond_9

    .line 101
    .line 102
    if-eq v2, p1, :cond_a

    .line 103
    .line 104
    :cond_9
    if-ne p3, p1, :cond_b

    .line 105
    .line 106
    :cond_a
    const-class p1, Ljava/util/Map;

    .line 107
    .line 108
    :cond_b
    if-nez p0, :cond_c

    .line 109
    .line 110
    add-int/lit8 p2, p2, 0x1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_c
    move-object v0, p0

    .line 114
    :goto_3
    invoke-direct {v3, p2, v0, v7, v8}, Lbsh/BSHArrayInitializer;->buildArray(ILjava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-direct {v3}, Lbsh/BSHArrayInitializer;->clearEvalCache()V

    .line 119
    .line 120
    .line 121
    invoke-direct {v3, p0, p1, v7}, Lbsh/BSHArrayInitializer;->toCollection(Ljava/lang/Object;Ljava/lang/Class;Lbsh/CallStack;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
.end method

.method public jjtSetParent(Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lbsh/SimpleNode;->parent:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    iget-object p1, p0, Lbsh/SimpleNode;->children:[Lbsh/飘花落叶言子世兰苏楪哲;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    aget-object v3, p1, v2

    .line 13
    .line 14
    invoke-interface {v3}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetNumChildren()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-lez v4, :cond_0

    .line 19
    .line 20
    invoke-interface {v3, v1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    instance-of v4, v4, Lbsh/BSHPrimaryExpression;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    iget-object v4, p0, Lbsh/BSHArrayInitializer;->expressionQueue:Ljava/util/Deque;

    .line 29
    .line 30
    invoke-interface {v3, v1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lbsh/BSHPrimaryExpression;

    .line 35
    .line 36
    invoke-interface {v4, v3}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lbsh/BSHArrayInitializer;->expressionQueue:Ljava/util/Deque;

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lbsh/BSHPrimaryExpression;

    .line 46
    .line 47
    invoke-virtual {v3, p0}, Lbsh/BSHPrimaryExpression;->setArrayExpression(Lbsh/BSHArrayInitializer;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void
.end method

.method public setMapInArray(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/BSHArrayInitializer;->isMapInArray:Z

    .line 2
    .line 3
    return-void
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
    iget-boolean p0, p0, Lbsh/BSHArrayInitializer;->isMapInArray:Z

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

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
