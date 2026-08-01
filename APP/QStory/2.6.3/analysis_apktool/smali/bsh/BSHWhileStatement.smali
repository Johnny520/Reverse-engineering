.class Lbsh/BSHWhileStatement;
.super Lbsh/SimpleNode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lbsh/飘花落叶言子世兰哲苏楪;


# instance fields
.field isDoStatement:Z

.field label:Ljava/lang/String;


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
    .locals 9

    .line 1
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lbsh/BSHWhileStatement;->isDoStatement:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v4}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-le v0, v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v0, v2

    .line 33
    :goto_0
    move-object v8, v1

    .line 34
    move-object v1, v0

    .line 35
    move-object v0, v8

    .line 36
    :goto_1
    iget-boolean v4, p0, Lbsh/BSHWhileStatement;->isDoStatement:Z

    .line 37
    .line 38
    :goto_2
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_9

    .line 43
    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    invoke-static {v0, p1, p2}, Lbsh/BSHIfStatement;->evaluateCondition(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Lbsh/Interpreter;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_9

    .line 51
    .line 52
    :cond_2
    if-nez v1, :cond_3

    .line 53
    .line 54
    goto :goto_5

    .line 55
    :cond_3
    instance-of v4, v1, Lbsh/BSHBlock;

    .line 56
    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    move-object v4, v1

    .line 60
    check-cast v4, Lbsh/BSHBlock;

    .line 61
    .line 62
    invoke-virtual {v4, p1, p2, v2}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    invoke-interface {v1, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    :goto_3
    instance-of v5, v4, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 72
    .line 73
    if-eqz v5, :cond_8

    .line 74
    .line 75
    move-object v5, v4

    .line 76
    check-cast v5, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 77
    .line 78
    iget-object v6, v5, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    iget-object v7, p0, Lbsh/BSHWhileStatement;->label:Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v7, :cond_6

    .line 85
    .line 86
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_5

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    iget v5, v5, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 94
    .line 95
    const/16 v6, 0x2f

    .line 96
    .line 97
    if-ne v5, v6, :cond_7

    .line 98
    .line 99
    :cond_6
    :goto_4
    return-object v4

    .line 100
    :cond_7
    const/16 v4, 0xd

    .line 101
    .line 102
    if-ne v5, v4, :cond_8

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_8
    :goto_5
    move v4, v3

    .line 106
    goto :goto_2

    .line 107
    :cond_9
    :goto_6
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 108
    .line 109
    return-object p0
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
    iget-object v1, p0, Lbsh/BSHWhileStatement;->label:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ": do="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean p0, p0, Lbsh/BSHWhileStatement;->isDoStatement:Z

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
