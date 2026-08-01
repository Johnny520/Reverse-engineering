.class Lbsh/BSHImportDeclaration;
.super Lbsh/SimpleNode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public importPackage:Z

.field public staticImport:Z

.field public superImport:Z


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
    .locals 5

    .line 1
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, Lbsh/BSHImportDeclaration;->superImport:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0}, Lbsh/NameSpace;->doSuperImport()V
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :catch_0
    move-exception p2

    .line 15
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    throw p0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lbsh/BSHAmbiguousName;

    .line 26
    .line 27
    iget-boolean v2, p0, Lbsh/BSHImportDeclaration;->staticImport:Z

    .line 28
    .line 29
    if-eqz v2, :cond_7

    .line 30
    .line 31
    iget-boolean v2, p0, Lbsh/BSHImportDeclaration;->importPackage:Z

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, p1, p2}, Lbsh/BSHAmbiguousName;->toClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Lbsh/NameSpace;->importStatic(Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :cond_1
    iget-object v2, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    invoke-static {v2, v3}, Lbsh/Name;->suffix(Ljava/lang/String;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const/4 v3, 0x0

    .line 52
    :try_start_1
    iget-object v4, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v4}, Lbsh/Name;->prefix(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v0, v4}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 62
    :try_start_2
    invoke-static {v4, v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏哲楪兰(Ljava/lang/Class;Ljava/lang/String;)Lbsh/BshMethod;

    .line 63
    .line 64
    .line 65
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 66
    goto :goto_0

    .line 67
    :catch_1
    move-object v4, v3

    .line 68
    :catch_2
    :goto_0
    if-eqz v4, :cond_2

    .line 69
    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    :try_start_3
    invoke-static {v4, v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Lbsh/LHS;

    .line 73
    .line 74
    .line 75
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 76
    :catch_3
    :cond_2
    if-nez v3, :cond_3

    .line 77
    .line 78
    :try_start_4
    invoke-virtual {v1, p1, p2}, Lbsh/BSHAmbiguousName;->toObject(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 82
    move-object v3, v2

    .line 83
    :catch_4
    :cond_3
    nop

    .line 84
    instance-of v2, v3, Lbsh/BshMethod;

    .line 85
    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    check-cast v3, Lbsh/BshMethod;

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_4
    instance-of v2, v3, Lbsh/LHS;

    .line 97
    .line 98
    if-nez v2, :cond_5

    .line 99
    .line 100
    invoke-virtual {v1, p1, p2}, Lbsh/BSHAmbiguousName;->toLHS(Lbsh/CallStack;Lbsh/Interpreter;)Lbsh/LHS;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    :cond_5
    instance-of p2, v3, Lbsh/LHS;

    .line 105
    .line 106
    if-eqz p2, :cond_6

    .line 107
    .line 108
    check-cast v3, Lbsh/LHS;

    .line 109
    .line 110
    invoke-virtual {v3}, Lbsh/LHS;->isStatic()Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_6

    .line 115
    .line 116
    invoke-virtual {v3}, Lbsh/LHS;->getVariable()Lbsh/Variable;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {v0, p0}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    .line 121
    .line 122
    .line 123
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 124
    .line 125
    return-object p0

    .line 126
    :cond_6
    new-instance p2, Lbsh/EvalException;

    .line 127
    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object v1, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 134
    .line 135
    const-string v2, " is not a static member of a class"

    .line 136
    .line 137
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 142
    .line 143
    .line 144
    throw p2

    .line 145
    :cond_7
    iget-object p1, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 146
    .line 147
    iget-boolean p0, p0, Lbsh/BSHImportDeclaration;->importPackage:Z

    .line 148
    .line 149
    if-eqz p0, :cond_8

    .line 150
    .line 151
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_8
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->importClass(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :goto_1
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 159
    .line 160
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
    const-string v1, ": static="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lbsh/BSHImportDeclaration;->staticImport:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", *="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, Lbsh/BSHImportDeclaration;->importPackage:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", super import="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean p0, p0, Lbsh/BSHImportDeclaration;->superImport:Z

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
