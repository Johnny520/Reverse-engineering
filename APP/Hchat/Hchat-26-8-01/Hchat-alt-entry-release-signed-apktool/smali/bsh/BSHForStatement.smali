.class Lbsh/BSHForStatement;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/ParserConstants;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field final blockId:I

.field public hasExpression:Z

.field public hasForInit:Z

.field public hasForUpdate:Z

.field label:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lbsh/BlockNameSpace;->blockCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lbsh/BSHForStatement;->blockId:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lbsh/BSHForStatement;->hasForInit:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    iget-boolean v3, p0, Lbsh/BSHForStatement;->hasExpression:Z

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    add-int/lit8 v3, v2, 0x1

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v3, v2

    .line 26
    move-object v2, v1

    .line 27
    :goto_1
    iget-boolean v4, p0, Lbsh/BSHForStatement;->hasForUpdate:Z

    .line 28
    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    add-int/lit8 v4, v3, 0x1

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move v4, v3

    .line 39
    move-object v3, v1

    .line 40
    :goto_2
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-ge v4, v5, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v4}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move-object v4, v1

    .line 52
    :goto_3
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Lbsh/BlockNameSpace;

    .line 57
    .line 58
    iget v7, p0, Lbsh/BSHForStatement;->blockId:I

    .line 59
    .line 60
    invoke-direct {v6, v5, v7}, Lbsh/BlockNameSpace;-><init>(Lbsh/NameSpace;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v6}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 64
    .line 65
    .line 66
    :try_start_0
    iget-boolean v6, p0, Lbsh/BSHForStatement;->hasForInit:Z

    .line 67
    .line 68
    if-eqz v6, :cond_4

    .line 69
    .line 70
    invoke-interface {v0, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_4

    .line 74
    :catchall_0
    move-exception p2

    .line 75
    goto :goto_7

    .line 76
    :cond_4
    :goto_4
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_b

    .line 81
    .line 82
    iget-boolean v0, p0, Lbsh/BSHForStatement;->hasExpression:Z

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    invoke-static {v2, p1, p2}, Lbsh/BSHIfStatement;->evaluateCondition(Lbsh/Node;Lbsh/CallStack;Lbsh/Interpreter;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    goto :goto_6

    .line 93
    :cond_5
    if-eqz v4, :cond_a

    .line 94
    .line 95
    instance-of v0, v4, Lbsh/BSHBlock;

    .line 96
    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    move-object v0, v4

    .line 100
    check-cast v0, Lbsh/BSHBlock;

    .line 101
    .line 102
    invoke-virtual {v0, p1, p2, v1}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    goto :goto_5

    .line 107
    :cond_6
    invoke-interface {v4, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    :goto_5
    instance-of v6, v0, Lbsh/ReturnControl;

    .line 112
    .line 113
    if-eqz v6, :cond_a

    .line 114
    .line 115
    move-object v6, v0

    .line 116
    check-cast v6, Lbsh/ReturnControl;

    .line 117
    .line 118
    iget-object v7, v6, Lbsh/ReturnControl;->label:Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v7, :cond_8

    .line 121
    .line 122
    iget-object v8, p0, Lbsh/BSHForStatement;->label:Ljava/lang/String;

    .line 123
    .line 124
    if-eqz v8, :cond_7

    .line 125
    .line 126
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    if-nez v7, :cond_8

    .line 131
    .line 132
    :cond_7
    invoke-virtual {p1, v5}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_8
    :try_start_1
    iget v6, v6, Lbsh/ReturnControl;->kind:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    .line 138
    const/16 v7, 0x2f

    .line 139
    .line 140
    if-ne v6, v7, :cond_9

    .line 141
    .line 142
    invoke-virtual {p1, v5}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 143
    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_9
    const/16 v0, 0xd

    .line 147
    .line 148
    if-ne v6, v0, :cond_a

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_a
    :try_start_2
    iget-boolean v0, p0, Lbsh/BSHForStatement;->hasForUpdate:Z

    .line 152
    .line 153
    if-eqz v0, :cond_4

    .line 154
    .line 155
    invoke-interface {v3, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_b
    :goto_6
    sget-object p2, Lbsh/Primitive;->VOID:Lbsh/Primitive;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 160
    .line 161
    invoke-virtual {p1, v5}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 162
    .line 163
    .line 164
    return-object p2

    .line 165
    :goto_7
    invoke-virtual {p1, v5}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 166
    .line 167
    .line 168
    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

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
    iget-object v2, p0, Lbsh/BSHForStatement;->label:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-boolean v1, p0, Lbsh/BSHForStatement;->hasForInit:Z

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, " ; "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-boolean v2, p0, Lbsh/BSHForStatement;->hasExpression:Z

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-boolean v1, p0, Lbsh/BSHForStatement;->hasForUpdate:Z

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method
