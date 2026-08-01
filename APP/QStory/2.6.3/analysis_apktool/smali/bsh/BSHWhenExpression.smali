.class Lbsh/BSHWhenExpression;
.super Lbsh/SimpleNode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    .locals 3

    .line 1
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq p1, v0, :cond_7

    .line 5
    .line 6
    if-ne p2, v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    move-object p1, v2

    .line 15
    :cond_1
    if-ne p2, v0, :cond_2

    .line 16
    .line 17
    move-object p2, v2

    .line 18
    :cond_2
    if-eqz p1, :cond_6

    .line 19
    .line 20
    if-nez p2, :cond_3

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_3
    instance-of v0, p1, Lbsh/Primitive;

    .line 24
    .line 25
    if-nez v0, :cond_5

    .line 26
    .line 27
    instance-of v0, p2, Lbsh/Primitive;

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_5
    :goto_0
    const/16 v0, 0x5c

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1, v0, p2}, Lbsh/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    return p0

    .line 54
    :catch_0
    move-exception p1

    .line 55
    new-instance p2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, "When value: "

    .line 58
    .line 59
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p4}, Lbsh/飘花落叶言子世兰苏楪哲;->getText()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p4, ": "

    .line 70
    .line 71
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {p1, p2, p0, p3}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    throw p0

    .line 83
    :cond_6
    :goto_1
    if-ne p1, p2, :cond_7

    .line 84
    .line 85
    const/4 p0, 0x1

    .line 86
    return p0

    .line 87
    :cond_7
    :goto_2
    return v1
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
    const/4 v1, 0x2

    .line 6
    if-lt v0, v1, :cond_7

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v2, v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lbsh/BSHWhenEntry;

    .line 17
    .line 18
    iget-boolean v3, v3, Lbsh/BSHWhenEntry;->isElse:Z

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    add-int/lit8 v3, v0, -0x1

    .line 24
    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    .line 27
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance p2, Lbsh/EvalException;

    .line 31
    .line 32
    const-string v0, "Else branch must be the last one in when expression."

    .line 33
    .line 34
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 35
    .line 36
    .line 37
    throw p2

    .line 38
    :cond_2
    const/4 v2, 0x0

    .line 39
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v3, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :goto_2
    if-ge v1, v0, :cond_6

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Lbsh/BSHWhenEntry;

    .line 54
    .line 55
    iget-boolean v6, v5, Lbsh/BSHWhenEntry;->isElse:Z

    .line 56
    .line 57
    if-eqz v6, :cond_3

    .line 58
    .line 59
    invoke-virtual {v5, p1, p2}, Lbsh/BSHWhenEntry;->evalResult(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_3
    move v6, v2

    .line 65
    :goto_3
    iget v7, v5, Lbsh/BSHWhenEntry;->numConditions:I

    .line 66
    .line 67
    if-ge v6, v7, :cond_5

    .line 68
    .line 69
    invoke-virtual {v5, v6}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-interface {v7, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-direct {p0, v4, v7, p1, v3}, Lbsh/BSHWhenExpression;->primitiveEquals(Ljava/lang/Object;Ljava/lang/Object;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_4

    .line 82
    .line 83
    invoke-virtual {v5, p1, p2}, Lbsh/BSHWhenEntry;->evalResult(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_6
    new-instance p2, Lbsh/EvalException;

    .line 95
    .line 96
    const-string v0, "No matching when branch."

    .line 97
    .line 98
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 99
    .line 100
    .line 101
    throw p2

    .line 102
    :cond_7
    new-instance p2, Lbsh/EvalException;

    .line 103
    .line 104
    const-string v0, "Empty when expression."

    .line 105
    .line 106
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 107
    .line 108
    .line 109
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
    const-string v1, ": when"

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
