.class Lbsh/BSHEnhancedForStatement;
.super Lbsh/SimpleNode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lbsh/飘花落叶言子世兰哲苏楪;


# instance fields
.field final blockId:I

.field isFinal:Z

.field label:Ljava/lang/String;

.field varName:Ljava/lang/String;


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
    iput-boolean p1, p0, Lbsh/BSHEnhancedForStatement;->isFinal:Z

    .line 6
    .line 7
    sget-object p1, Lbsh/BlockNameSpace;->blockCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Lbsh/BSHEnhancedForStatement;->blockId:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 12

    .line 1
    new-instance v0, Lbsh/Modifiers;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lbsh/Modifiers;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-boolean v1, p0, Lbsh/BSHEnhancedForStatement;->isFinal:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "final"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    instance-of v4, v2, Lbsh/BSHType;

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    const/4 v6, 0x0

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    check-cast v2, Lbsh/BSHType;

    .line 36
    .line 37
    invoke-virtual {v2, p1, p2}, Lbsh/BSHType;->getType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p0, v5}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/4 v5, 0x2

    .line 46
    if-le v3, v5, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, v5}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v3, v6

    .line 54
    :goto_0
    move-object v11, v3

    .line 55
    move-object v3, v2

    .line 56
    move-object v2, v4

    .line 57
    move-object v4, v11

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    if-le v3, v5, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, v5}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    move-object v3, v6

    .line 67
    :goto_1
    move-object v4, v3

    .line 68
    move-object v3, v6

    .line 69
    :goto_2
    invoke-interface {v2, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-class v5, Lbsh/飘花落叶言子世楪哲苏兰;

    .line 74
    .line 75
    monitor-enter v5

    .line 76
    monitor-exit v5

    .line 77
    invoke-static {v2}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    :try_start_0
    iget v5, p0, Lbsh/BSHEnhancedForStatement;->blockId:I

    .line 82
    .line 83
    invoke-static {v1, v5}, Lbsh/BlockNameSpace;->getInstance(Lbsh/NameSpace;I)Lbsh/NameSpace;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {p1, v5}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 88
    .line 89
    .line 90
    :cond_4
    :goto_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-nez v7, :cond_b

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    if-eqz v7, :cond_b

    .line 101
    .line 102
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    if-nez v7, :cond_5

    .line 107
    .line 108
    sget-object v7, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    goto :goto_8

    .line 113
    :catch_0
    move-exception p2

    .line 114
    goto :goto_6

    .line 115
    :cond_5
    :goto_4
    invoke-virtual {v5}, Lbsh/NameSpace;->clear()V

    .line 116
    .line 117
    .line 118
    iget-object v8, p0, Lbsh/BSHEnhancedForStatement;->varName:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v5, v8, v3, v7, v0}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    .line 123
    if-nez v4, :cond_6

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    :try_start_2
    instance-of v7, v4, Lbsh/BSHBlock;

    .line 127
    .line 128
    if-eqz v7, :cond_7

    .line 129
    .line 130
    move-object v7, v4

    .line 131
    check-cast v7, Lbsh/BSHBlock;

    .line 132
    .line 133
    invoke-virtual {v7, p1, p2, v6}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    goto :goto_5

    .line 138
    :cond_7
    invoke-interface {v4, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    :goto_5
    instance-of v8, v7, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 143
    .line 144
    if-eqz v8, :cond_4

    .line 145
    .line 146
    move-object v8, v7

    .line 147
    check-cast v8, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 148
    .line 149
    iget-object v9, v8, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 150
    .line 151
    if-eqz v9, :cond_9

    .line 152
    .line 153
    iget-object v10, p0, Lbsh/BSHEnhancedForStatement;->label:Ljava/lang/String;

    .line 154
    .line 155
    if-eqz v10, :cond_8

    .line 156
    .line 157
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 161
    if-nez v9, :cond_9

    .line 162
    .line 163
    :cond_8
    invoke-virtual {p1, v1}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 164
    .line 165
    .line 166
    return-object v7

    .line 167
    :cond_9
    :try_start_3
    iget v8, v8, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 168
    .line 169
    const/16 v9, 0x2f

    .line 170
    .line 171
    if-ne v8, v9, :cond_a

    .line 172
    .line 173
    invoke-virtual {p1, v1}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 174
    .line 175
    .line 176
    return-object v7

    .line 177
    :cond_a
    const/16 v7, 0xd

    .line 178
    .line 179
    if-ne v8, v7, :cond_4

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :goto_6
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v2, "for loop iterator variable:"

    .line 188
    .line 189
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    iget-object v2, p0, Lbsh/BSHEnhancedForStatement;->varName:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {p2, v0, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    throw p0

    .line 206
    :cond_b
    :goto_7
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 207
    .line 208
    invoke-virtual {p1, v1}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 209
    .line 210
    .line 211
    return-object p0

    .line 212
    :goto_8
    invoke-virtual {p1, v1}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 213
    .line 214
    .line 215
    throw p0
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
    iget-object v2, p0, Lbsh/BSHEnhancedForStatement;->label:Ljava/lang/String;

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
    iget-object v1, p0, Lbsh/BSHEnhancedForStatement;->varName:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", final="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-boolean p0, p0, Lbsh/BSHEnhancedForStatement;->isFinal:Z

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method
