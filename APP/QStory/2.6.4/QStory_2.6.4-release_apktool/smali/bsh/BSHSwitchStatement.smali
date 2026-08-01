.class Lbsh/BSHSwitchStatement;
.super Lbsh/SimpleNode;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lbsh/飘花落叶言子世兰哲苏楪;


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

.method private primitiveEquals(Ljava/lang/Object;Ljava/lang/Object;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Z
    .locals 1

    .line 1
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    instance-of v0, p1, Lbsh/Primitive;

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    instance-of v0, p2, Lbsh/Primitive;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_2
    :goto_0
    const/16 v0, 0x5c

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1, v0, p2}, Lbsh/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    return p0

    .line 38
    :catch_0
    move-exception p1

    .line 39
    new-instance p2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, "Switch value: "

    .line 42
    .line 43
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p4}, Lbsh/飘花落叶言子世兰苏楪哲;->getText()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p4, ": "

    .line 54
    .line 55
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p1, p2, p0, p3}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    throw p0
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Ljava/lang/Class;->isEnum()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v3, v4}, Lbsh/NameSpace;->importStatic(Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    const/4 v3, 0x1

    .line 42
    if-ge v3, v0, :cond_9

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lbsh/BSHSwitchLabel;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x2

    .line 52
    :cond_1
    :goto_0
    if-ge v5, v0, :cond_7

    .line 53
    .line 54
    if-nez v4, :cond_7

    .line 55
    .line 56
    iget-boolean v6, v3, Lbsh/BSHSwitchLabel;->isDefault:Z

    .line 57
    .line 58
    if-nez v6, :cond_4

    .line 59
    .line 60
    invoke-virtual {v3, p1, p2}, Lbsh/BSHSwitchLabel;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-direct {p0, v2, v6, p1, v1}, Lbsh/BSHSwitchStatement;->primitiveEquals(Ljava/lang/Object;Ljava/lang/Object;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_2
    :goto_1
    if-ge v5, v0, :cond_1

    .line 72
    .line 73
    add-int/lit8 v6, v5, 0x1

    .line 74
    .line 75
    invoke-virtual {p0, v5}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    instance-of v7, v5, Lbsh/BSHSwitchLabel;

    .line 80
    .line 81
    if-eqz v7, :cond_3

    .line 82
    .line 83
    move-object v3, v5

    .line 84
    check-cast v3, Lbsh/BSHSwitchLabel;

    .line 85
    .line 86
    :goto_2
    move v5, v6

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    move v5, v6

    .line 89
    goto :goto_1

    .line 90
    :cond_4
    :goto_3
    if-ge v5, v0, :cond_1

    .line 91
    .line 92
    add-int/lit8 v6, v5, 0x1

    .line 93
    .line 94
    invoke-virtual {p0, v5}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    instance-of v7, v5, Lbsh/BSHSwitchLabel;

    .line 99
    .line 100
    if-eqz v7, :cond_5

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    invoke-interface {v5, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    instance-of v7, v5, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 108
    .line 109
    if-eqz v7, :cond_6

    .line 110
    .line 111
    move-object v4, v5

    .line 112
    check-cast v4, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    :goto_4
    move v5, v6

    .line 116
    goto :goto_3

    .line 117
    :cond_7
    if-eqz v4, :cond_8

    .line 118
    .line 119
    iget p0, v4, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 120
    .line 121
    const/16 p1, 0x2f

    .line 122
    .line 123
    if-ne p0, p1, :cond_8

    .line 124
    .line 125
    return-object v4

    .line 126
    :cond_8
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_9
    new-instance p2, Lbsh/EvalException;

    .line 130
    .line 131
    const-string v0, "Empty switch statement."

    .line 132
    .line 133
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 134
    .line 135
    .line 136
    throw p2
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
    move-result-object p0

    .line 10
    const-string v1, ": switch"

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
