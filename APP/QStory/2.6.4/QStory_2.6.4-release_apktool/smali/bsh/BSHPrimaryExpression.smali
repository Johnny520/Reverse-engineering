.class Lbsh/BSHPrimaryExpression;
.super Lbsh/SimpleNode;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private cached:Ljava/lang/Object;

.field isArrayExpression:Z

.field isMapExpression:Z


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
    iput-object p1, p0, Lbsh/BSHPrimaryExpression;->cached:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lbsh/BSHPrimaryExpression;->isArrayExpression:Z

    .line 9
    .line 10
    iput-boolean p1, p0, Lbsh/BSHPrimaryExpression;->isMapExpression:Z

    .line 11
    .line 12
    return-void
.end method

.method private eval(ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lbsh/BSHPrimaryExpression;->isArrayExpression:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/BSHPrimaryExpression;->cached:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetChildren()[Lbsh/飘花落叶言子世兰苏楪哲;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    aget-object v1, v0, v1

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    move v3, v2

    .line 19
    :goto_0
    array-length v4, v0

    .line 20
    if-ge v3, v4, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lbsh/BSHPrimarySuffix;

    .line 27
    .line 28
    iget v5, v4, Lbsh/BSHPrimarySuffix;->operation:I

    .line 29
    .line 30
    const/4 v6, 0x5

    .line 31
    if-ne v5, v6, :cond_2

    .line 32
    .line 33
    array-length v5, v0

    .line 34
    sub-int/2addr v5, v2

    .line 35
    if-ne v3, v5, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    new-instance p0, Lbsh/EvalError;

    .line 39
    .line 40
    const-string p1, "Method Reference must be the last suffix!"

    .line 41
    .line 42
    invoke-direct {p0, p1, v4, p2}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :cond_2
    :goto_1
    invoke-virtual {v4, v1, p1, p2, p3}, Lbsh/BSHPrimarySuffix;->doSuffix(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    instance-of v0, v1, Lbsh/飘花落叶言子世兰苏楪哲;

    .line 54
    .line 55
    if-eqz v0, :cond_7

    .line 56
    .line 57
    instance-of v0, v1, Lbsh/BSHAmbiguousName;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    check-cast v1, Lbsh/BSHAmbiguousName;

    .line 64
    .line 65
    invoke-virtual {v1, p2, p3}, Lbsh/BSHAmbiguousName;->toLHS(Lbsh/CallStack;Lbsh/Interpreter;)Lbsh/LHS;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    check-cast v1, Lbsh/BSHAmbiguousName;

    .line 71
    .line 72
    invoke-virtual {v1, p2, p3}, Lbsh/BSHAmbiguousName;->toObject(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    if-nez p1, :cond_6

    .line 78
    .line 79
    check-cast v1, Lbsh/飘花落叶言子世兰苏楪哲;

    .line 80
    .line 81
    invoke-interface {v1, p2, p3}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_2

    .line 86
    :cond_6
    new-instance p1, Lbsh/EvalException;

    .line 87
    .line 88
    const-string p3, "Can\'t assign to prefix."

    .line 89
    .line 90
    invoke-direct {p1, p3, p0, p2}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_7
    :goto_2
    iget-boolean p1, p0, Lbsh/BSHPrimaryExpression;->isMapExpression:Z

    .line 95
    .line 96
    if-eqz p1, :cond_9

    .line 97
    .line 98
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 99
    .line 100
    if-eq v1, p1, :cond_8

    .line 101
    .line 102
    new-instance p1, Lbsh/LHS;

    .line 103
    .line 104
    invoke-direct {p1, v1}, Lbsh/LHS;-><init>(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-object v1, p1

    .line 108
    goto :goto_3

    .line 109
    :cond_8
    new-instance p1, Lbsh/EvalException;

    .line 110
    .line 111
    const-string p3, "illegal use of undefined variable or \'void\' literal"

    .line 112
    .line 113
    invoke-direct {p1, p3, p0, p2}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :cond_9
    :goto_3
    iget-boolean p1, p0, Lbsh/BSHPrimaryExpression;->isArrayExpression:Z

    .line 118
    .line 119
    if-eqz p1, :cond_a

    .line 120
    .line 121
    iput-object v1, p0, Lbsh/BSHPrimaryExpression;->cached:Ljava/lang/Object;

    .line 122
    .line 123
    :cond_a
    return-object v1
.end method


# virtual methods
.method public clearCache()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lbsh/BSHPrimaryExpression;->cached:Ljava/lang/Object;

    .line 3
    .line 4
    return-void
.end method

.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 124
    invoke-direct {p0, v0, p1, p2}, Lbsh/BSHPrimaryExpression;->eval(ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public setArrayExpression(Lbsh/BSHArrayInitializer;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbsh/BSHPrimaryExpression;->isArrayExpression:Z

    .line 3
    .line 4
    iget-object v1, p0, Lbsh/SimpleNode;->parent:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 5
    .line 6
    instance-of v2, v1, Lbsh/BSHAssignment;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lbsh/BSHAssignment;

    .line 12
    .line 13
    iget-object v2, v2, Lbsh/BSHAssignment;->operator:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    check-cast v1, Lbsh/BSHAssignment;

    .line 18
    .line 19
    iget-object v1, v1, Lbsh/BSHAssignment;->operator:Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x55

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    move v1, v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    iput-boolean v1, p0, Lbsh/BSHPrimaryExpression;->isMapExpression:Z

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Lbsh/SimpleNode;->jjtGetParent()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    instance-of p0, p0, Lbsh/BSHArrayInitializer;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lbsh/BSHArrayInitializer;->setMapInArray(Z)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public toLHS(Lbsh/CallStack;Lbsh/Interpreter;)Lbsh/LHS;
    .locals 1

    .line 1
    invoke-virtual {p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lbsh/BSHPrimaryExpression;->isMapExpression:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    invoke-direct {p0, v0, p1, p2}, Lbsh/BSHPrimaryExpression;->eval(ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lbsh/LHS;

    .line 20
    .line 21
    return-object p0
.end method
