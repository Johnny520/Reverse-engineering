.class public Lbsh/BSHLabeledStatement;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/ParserConstants;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
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
.method public bridge synthetic add(Lbsh/Node;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->add(Lbsh/Node;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic dump(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->dump(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbsh/BSHLabeledStatement;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_6

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lbsh/BSHLabeledStatement;->jjtGetChild(I)Lbsh/Node;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v1, v1, Lbsh/BSHForStatement;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbsh/BSHLabeledStatement;->jjtGetChild(I)Lbsh/Node;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lbsh/BSHForStatement;

    .line 21
    .line 22
    iget-object v2, p0, Lbsh/BSHLabeledStatement;->label:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v2, v1, Lbsh/BSHForStatement;->label:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0, v0}, Lbsh/BSHLabeledStatement;->jjtGetChild(I)Lbsh/Node;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    instance-of v1, v1, Lbsh/BSHEnhancedForStatement;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lbsh/BSHLabeledStatement;->jjtGetChild(I)Lbsh/Node;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lbsh/BSHEnhancedForStatement;

    .line 40
    .line 41
    iget-object v2, p0, Lbsh/BSHLabeledStatement;->label:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v2, v1, Lbsh/BSHEnhancedForStatement;->label:Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p0, v0}, Lbsh/BSHLabeledStatement;->jjtGetChild(I)Lbsh/Node;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    instance-of v1, v1, Lbsh/BSHWhileStatement;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lbsh/BSHLabeledStatement;->jjtGetChild(I)Lbsh/Node;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lbsh/BSHWhileStatement;

    .line 59
    .line 60
    iget-object v2, p0, Lbsh/BSHLabeledStatement;->label:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v2, v1, Lbsh/BSHWhileStatement;->label:Ljava/lang/String;

    .line 63
    .line 64
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lbsh/BSHLabeledStatement;->jjtGetChild(I)Lbsh/Node;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    instance-of v0, p2, Lbsh/ReturnControl;

    .line 73
    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    move-object v0, p2

    .line 77
    check-cast v0, Lbsh/ReturnControl;

    .line 78
    .line 79
    iget v1, v0, Lbsh/ReturnControl;->kind:I

    .line 80
    .line 81
    const/16 v2, 0xd

    .line 82
    .line 83
    if-eq v1, v2, :cond_5

    .line 84
    .line 85
    const/16 v2, 0x14

    .line 86
    .line 87
    if-eq v1, v2, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    iget-object v1, p0, Lbsh/BSHLabeledStatement;->label:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v0, v0, Lbsh/ReturnControl;->label:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_4

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    new-instance p2, Lbsh/EvalError;

    .line 102
    .line 103
    const-string v0, "Continue cannot be used outside of a loop"

    .line 104
    .line 105
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 106
    .line 107
    .line 108
    throw p2

    .line 109
    :cond_5
    iget-object p1, p0, Lbsh/BSHLabeledStatement;->label:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v0, v0, Lbsh/ReturnControl;->label:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-nez p1, :cond_6

    .line 118
    .line 119
    :goto_1
    return-object p2

    .line 120
    :cond_6
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 121
    .line 122
    return-object p1
.end method

.method public bridge synthetic getId()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getLineNumber()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getLineNumber()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getSourceFile()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getSourceFile()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getText()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getText()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic hasNext()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic hasPrevious()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->hasPrevious()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic jjtAddChild(Lbsh/Node;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lbsh/SimpleNode;->jjtAddChild(Lbsh/Node;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic jjtClose()V
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtClose()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic jjtGetChild(I)Lbsh/Node;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic jjtGetChildren()[Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetChildren()[Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic jjtGetNumChildren()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic jjtGetParent()Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetParent()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic jjtOpen()V
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtOpen()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic jjtSetParent(Lbsh/Node;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->jjtSetParent(Lbsh/Node;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic next()Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->next()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic nextIndex()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->nextIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic previous()Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->previous()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic previousIndex()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->previousIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic remove()V
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->remove()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic set(Lbsh/Node;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->set(Lbsh/Node;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setSourceFile(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->setSourceFile(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
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
    iget-object v1, p0, Lbsh/BSHLabeledStatement;->label:Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, ":"

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public bridge synthetic toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 27
    invoke-super {p0, p1}, Lbsh/SimpleNode;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
