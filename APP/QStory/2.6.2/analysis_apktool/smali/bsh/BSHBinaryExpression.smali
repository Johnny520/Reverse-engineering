.class Lbsh/BSHBinaryExpression;
.super Lbsh/SimpleNode;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lbsh/飘花落叶言子世兰哲苏楪;


# instance fields
.field public kind:I


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

.method private checkNullValues(Ljava/lang/Object;Ljava/lang/Object;ILbsh/CallStack;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "bad operand types for binary operator "

    .line 2
    .line 3
    const-string v1, "null value with binary operator "

    .line 4
    .line 5
    sget-object v2, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 6
    .line 7
    if-eq v2, p1, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    sget-object v3, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 11
    .line 12
    if-ne v3, p2, :cond_1

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_1
    :try_start_0
    instance-of v3, p2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    const-class v4, Ljava/lang/String;

    .line 18
    .line 19
    if-ne v2, p2, :cond_4

    .line 20
    .line 21
    xor-int/lit8 p2, p3, 0x1

    .line 22
    .line 23
    :try_start_1
    invoke-direct {p0, p2, p4}, Lbsh/BSHBinaryExpression;->getVariableAtNode(ILbsh/CallStack;)Lbsh/Variable;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-eqz p2, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-ne v2, v4, :cond_2

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    :goto_0
    move v3, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 v2, 0x0

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    invoke-virtual {p2}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    goto :goto_2

    .line 45
    :catch_0
    move-exception p2

    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :catch_1
    move-exception p1

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_3
    const/4 p2, 0x0

    .line 52
    goto :goto_2

    .line 53
    :cond_4
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    :goto_2
    invoke-direct {p0, p3, p4}, Lbsh/BSHBinaryExpression;->getVariableAtNode(ILbsh/CallStack;)Lbsh/Variable;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    if-nez p3, :cond_5

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_5
    iget v2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 69
    .line 70
    const/16 v5, 0x5c

    .line 71
    .line 72
    if-eq v2, v5, :cond_6

    .line 73
    .line 74
    const/16 v5, 0x61

    .line 75
    .line 76
    if-ne v2, v5, :cond_7

    .line 77
    .line 78
    :cond_6
    invoke-virtual {p3}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-direct {p0, v2, p2, p4}, Lbsh/BSHBinaryExpression;->isComparableTypes(Ljava/lang/Class;Ljava/lang/Class;Lbsh/CallStack;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_7

    .line 87
    .line 88
    :goto_3
    return-object p1

    .line 89
    :cond_7
    iget p2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 90
    .line 91
    const/16 v2, 0x68

    .line 92
    .line 93
    if-ne p2, v2, :cond_9

    .line 94
    .line 95
    if-nez v3, :cond_8

    .line 96
    .line 97
    invoke-virtual {p3}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    if-ne p2, v4, :cond_9

    .line 102
    .line 103
    :cond_8
    const-string p0, "null"

    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_9
    invoke-virtual {p3}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-direct {p0, p2}, Lbsh/BSHBinaryExpression;->isWrapper(Ljava/lang/Class;)Z

    .line 111
    .line 112
    .line 113
    move-result p2
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 114
    sget-object p3, Lbsh/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 115
    .line 116
    if-eqz p2, :cond_a

    .line 117
    .line 118
    :try_start_2
    new-instance p2, Ljava/lang/NullPointerException;

    .line 119
    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget v1, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 126
    .line 127
    aget-object p3, p3, v1

    .line 128
    .line 129
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    invoke-direct {p2, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p2

    .line 140
    :cond_a
    new-instance p2, Lbsh/EvalException;

    .line 141
    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget v0, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 148
    .line 149
    aget-object p3, p3, v0

    .line 150
    .line 151
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-direct {p2, p3, p0, p4}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 159
    .line 160
    .line 161
    throw p2
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 162
    :goto_4
    invoke-virtual {p2, p0, p4}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 163
    .line 164
    .line 165
    return-object p1

    .line 166
    :goto_5
    new-instance p2, Lbsh/TargetError;

    .line 167
    .line 168
    invoke-direct {p2, p1, p0, p4}, Lbsh/TargetError;-><init>(Ljava/lang/Throwable;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 169
    .line 170
    .line 171
    throw p2
.end method

.method private getVariableAtNode(ILbsh/CallStack;)Lbsh/Variable;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetNumChildren()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-interface {p0, p1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of p1, p0, Lbsh/BSHAmbiguousName;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p2}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p0, Lbsh/BSHAmbiguousName;

    .line 29
    .line 30
    iget-object p0, p0, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-virtual {p1, p0, p2}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method private isComparableTypes(Ljava/lang/Class;Ljava/lang/Class;Lbsh/CallStack;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/CallStack;",
            ")Z"
        }
    .end annotation

    .line 1
    if-eq p2, p1, :cond_1

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lbsh/BSHBinaryExpression;->isSimilarTypes(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lbsh/EvalException;

    .line 11
    .line 12
    invoke-static {p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p2}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "incomparable types: "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, " and "

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1, p0, p3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 47
    return p0
.end method

.method private isPrimitiveValue(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lbsh/Primitive;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 6
    .line 7
    if-eq p1, p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 10
    .line 11
    if-eq p1, p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method private isSimilarTypes(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method private isWrapper(Ljava/lang/Class;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-class v1, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v1, :cond_4

    .line 13
    .line 14
    const-class v1, Ljava/lang/Character;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-class v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget p0, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 32
    .line 33
    const/16 p1, 0x5c

    .line 34
    .line 35
    if-eq p0, p1, :cond_2

    .line 36
    .line 37
    packed-switch p0, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    packed-switch p0, :pswitch_data_1

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :pswitch_0
    return v2

    .line 45
    :cond_3
    :goto_0
    return v0

    .line 46
    :cond_4
    :goto_1
    iget p0, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 47
    .line 48
    packed-switch p0, :pswitch_data_2

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :pswitch_1
    return v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    :pswitch_data_1
    .packed-switch 0x6c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 68
    .line 69
    .line 70
    :pswitch_data_2
    .packed-switch 0x62
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private isWrapper(Ljava/lang/Object;)Z
    .locals 0

    .line 53
    instance-of p0, p1, Ljava/lang/Number;

    if-nez p0, :cond_1

    instance-of p0, p1, Ljava/lang/Boolean;

    if-nez p0, :cond_1

    instance-of p0, p1, Ljava/lang/Character;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-interface {v1, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget v2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 11
    .line 12
    const/16 v3, 0x24

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    if-ne v2, v3, :cond_4

    .line 16
    .line 17
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 18
    .line 19
    if-ne v1, v0, :cond_0

    .line 20
    .line 21
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-virtual {p0, v4}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lbsh/BSHType;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, Lbsh/BSHType;->getType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    instance-of p1, v1, Lbsh/Primitive;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    const-class p1, Lbsh/Primitive;

    .line 39
    .line 40
    if-ne p0, p1, :cond_1

    .line 41
    .line 42
    sget-object p0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    invoke-static {v1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    sget-object p0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_3
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_4
    const/16 v3, 0x64

    .line 66
    .line 67
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-eq v2, v3, :cond_5

    .line 70
    .line 71
    const/16 v3, 0x65

    .line 72
    .line 73
    if-ne v2, v3, :cond_7

    .line 74
    .line 75
    :cond_5
    invoke-virtual {p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_6

    .line 80
    .line 81
    sget-object v2, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Lbsh/Primitive;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_7

    .line 88
    .line 89
    return-object v2

    .line 90
    :cond_6
    sget-object v2, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 91
    .line 92
    invoke-static {v5, v1}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v2, v3}, Lbsh/Primitive;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_7

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_7
    iget v2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 104
    .line 105
    const/16 v3, 0x62

    .line 106
    .line 107
    const/16 v6, 0x94

    .line 108
    .line 109
    if-eq v2, v3, :cond_8

    .line 110
    .line 111
    const/16 v3, 0x63

    .line 112
    .line 113
    if-eq v2, v3, :cond_8

    .line 114
    .line 115
    if-ne v2, v6, :cond_a

    .line 116
    .line 117
    :cond_8
    invoke-virtual {p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_9

    .line 122
    .line 123
    sget-object v2, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 124
    .line 125
    invoke-virtual {v2, v1}, Lbsh/Primitive;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_a

    .line 130
    .line 131
    return-object v2

    .line 132
    :cond_9
    sget-object v2, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 133
    .line 134
    invoke-static {v5, v1}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v2, v3}, Lbsh/Primitive;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_a

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_a
    iget v2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 146
    .line 147
    const/16 v3, 0x93

    .line 148
    .line 149
    if-ne v2, v3, :cond_b

    .line 150
    .line 151
    sget-object v2, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 152
    .line 153
    if-eq v2, v1, :cond_b

    .line 154
    .line 155
    :goto_0
    return-object v1

    .line 156
    :cond_b
    invoke-virtual {p0, v4}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-interface {v2, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iget v7, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 165
    .line 166
    if-eq v7, v3, :cond_16

    .line 167
    .line 168
    if-ne v7, v6, :cond_c

    .line 169
    .line 170
    goto/16 :goto_4

    .line 171
    .line 172
    :cond_c
    invoke-virtual {p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_d

    .line 177
    .line 178
    iget v3, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 179
    .line 180
    packed-switch v3, :pswitch_data_0

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :pswitch_0
    invoke-static {v5, v2}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    instance-of v3, v3, Ljava/lang/Boolean;

    .line 189
    .line 190
    if-eqz v3, :cond_d

    .line 191
    .line 192
    goto/16 :goto_4

    .line 193
    .line 194
    :cond_d
    :goto_1
    invoke-direct {p0, v1, v2, v0, p1}, Lbsh/BSHBinaryExpression;->checkNullValues(Ljava/lang/Object;Ljava/lang/Object;ILbsh/CallStack;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-direct {p0, v2, v0, v4, p1}, Lbsh/BSHBinaryExpression;->checkNullValues(Ljava/lang/Object;Ljava/lang/Object;ILbsh/CallStack;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget v2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 203
    .line 204
    const/16 v3, 0x5c

    .line 205
    .line 206
    sget-object v4, Lbsh/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 207
    .line 208
    if-eq v2, v3, :cond_e

    .line 209
    .line 210
    const/16 v3, 0x61

    .line 211
    .line 212
    if-ne v2, v3, :cond_f

    .line 213
    .line 214
    :cond_e
    invoke-direct {p0, v0}, Lbsh/BSHBinaryExpression;->isWrapper(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_f

    .line 219
    .line 220
    invoke-direct {p0, v1}, Lbsh/BSHBinaryExpression;->isWrapper(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-nez v2, :cond_11

    .line 225
    .line 226
    :cond_f
    invoke-direct {p0, v0}, Lbsh/BSHBinaryExpression;->isWrapper(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-nez v2, :cond_10

    .line 231
    .line 232
    invoke-direct {p0, v0}, Lbsh/BSHBinaryExpression;->isPrimitiveValue(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-eqz v2, :cond_11

    .line 237
    .line 238
    :cond_10
    invoke-direct {p0, v1}, Lbsh/BSHBinaryExpression;->isWrapper(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-nez v2, :cond_15

    .line 243
    .line 244
    invoke-direct {p0, v1}, Lbsh/BSHBinaryExpression;->isPrimitiveValue(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_11

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_11
    invoke-virtual {p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    if-eqz p2, :cond_14

    .line 256
    .line 257
    iget p2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 258
    .line 259
    const/16 v2, 0x68

    .line 260
    .line 261
    if-eq p2, v2, :cond_12

    .line 262
    .line 263
    const/16 v2, 0x6a

    .line 264
    .line 265
    if-ne p2, v2, :cond_14

    .line 266
    .line 267
    :cond_12
    instance-of p2, v0, Ljava/lang/String;

    .line 268
    .line 269
    if-nez p2, :cond_14

    .line 270
    .line 271
    instance-of p2, v1, Ljava/lang/String;

    .line 272
    .line 273
    if-eqz p2, :cond_13

    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_13
    new-instance p2, Lbsh/EvalException;

    .line 277
    .line 278
    iget v2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 279
    .line 280
    aget-object v2, v4, v2

    .line 281
    .line 282
    invoke-static {v0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    new-instance v3, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    const-string v4, "Bad operand types for binary operator "

    .line 293
    .line 294
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string v2, " first type: "

    .line 301
    .line 302
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const-string v0, " second type: "

    .line 309
    .line 310
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 321
    .line 322
    .line 323
    throw p2

    .line 324
    :cond_14
    :goto_2
    :try_start_0
    iget p2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 325
    .line 326
    invoke-static {v0, p2, v1}, Lbsh/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 330
    return-object p0

    .line 331
    :catch_0
    move-exception p2

    .line 332
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    throw p0

    .line 337
    :cond_15
    :goto_3
    :try_start_1
    iget p2, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 338
    .line 339
    invoke-static {v0, p2, v1}, Lbsh/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p0
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_1

    .line 343
    return-object p0

    .line 344
    :catch_1
    move-exception p2

    .line 345
    new-instance v2, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    const-string v3, "Failed operation: "

    .line 348
    .line 349
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    const-string v0, " "

    .line 356
    .line 357
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    iget v3, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 361
    .line 362
    aget-object v3, v4, v3

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {p2, v0, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    throw p0

    .line 382
    :cond_16
    :goto_4
    return-object v2

    .line 383
    :pswitch_data_0
    .packed-switch 0x62
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
    sget-object v1, Lbsh/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 19
    .line 20
    iget p0, p0, Lbsh/BSHBinaryExpression;->kind:I

    .line 21
    .line 22
    aget-object p0, v1, p0

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method
