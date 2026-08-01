.class Lbsh/BSHMethodInvocation;
.super Lbsh/SimpleNode;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lbsh/BSHMethodInvocation;->getNameNode()Lbsh/BSHAmbiguousName;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "fail"

    .line 10
    .line 11
    iget-object v3, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2, p0}, Lbsh/NameSpace;->setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-boolean v2, v2, Lbsh/NameSpace;->isClass:Z

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v2, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 41
    .line 42
    const-string v3, "super"

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    iget-object v2, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 51
    .line 52
    const-string v3, "this"

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    :cond_1
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_2
    invoke-virtual {v1, v0}, Lbsh/BSHAmbiguousName;->getName(Lbsh/NameSpace;)Lbsh/Name;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0}, Lbsh/BSHMethodInvocation;->getArgsNode()Lbsh/BSHArguments;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1, p1, p2}, Lbsh/BSHArguments;->getArguments(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :try_start_0
    invoke-virtual {v0, p2, v1, p1, p0}, Lbsh/Name;->invokeMethod(Lbsh/Interpreter;[Ljava/lang/Object;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    return-object p0

    .line 80
    :catch_0
    move-exception p2

    .line 81
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    throw p0

    .line 86
    :catch_1
    move-exception p2

    .line 87
    invoke-virtual {v0}, Lbsh/Name;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {p2, v0, p1, p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏哲兰楪(Ljava/lang/reflect/InvocationTargetException;Ljava/lang/String;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Lbsh/TargetError;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    throw p0

    .line 96
    :catch_2
    move-exception p2

    .line 97
    new-instance v0, Lbsh/EvalException;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    new-instance v2, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v3, "Error in method invocation: "

    .line 106
    .line 107
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-direct {v0, v1, p0, p1, p2}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    throw v0
.end method

.method public getArgsNode()Lbsh/BSHArguments;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lbsh/BSHArguments;

    .line 7
    .line 8
    return-object p0
.end method

.method public getNameNode()Lbsh/BSHAmbiguousName;
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
    check-cast p0, Lbsh/BSHAmbiguousName;

    .line 7
    .line 8
    return-object p0
.end method
