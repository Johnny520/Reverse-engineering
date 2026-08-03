.class public Lbsh/EvalError;
.super Ljava/lang/Exception;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final callstack:Lbsh/CallStack;

.field private message:Ljava/lang/String;

.field private node:Lbsh/Node;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/EvalError;->message:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p3}, Lbsh/CallStack;->copy()Lbsh/CallStack;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    iput-object p1, p0, Lbsh/EvalError;->callstack:Lbsh/CallStack;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 20
    invoke-virtual {p0, p4}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public getErrorLineNumber()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lbsh/Node;->getLineNumber()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, -0x1

    .line 11
    return v0
.end method

.method public getErrorSourceFile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lbsh/Node;->getSourceFile()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const-string v0, "<unknown file>"

    .line 11
    .line 12
    return-object v0
.end method

.method public getErrorText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lbsh/Node;->getText()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const-string v0, "<unknown error>"

    .line 11
    .line 12
    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "\n\tat "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 13
    .line 14
    invoke-interface {v1}, Lbsh/Node;->getText()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " ("

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 27
    .line 28
    invoke-interface {v1}, Lbsh/Node;->getSourceFile()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ":"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 41
    .line 42
    invoke-interface {v1}, Lbsh/Node;->getLineNumber()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, ")"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const-string v0, ": <at unknown location>"

    .line 60
    .line 61
    :goto_0
    iget-object v1, p0, Lbsh/EvalError;->callstack:Lbsh/CallStack;

    .line 62
    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lbsh/EvalError;->getScriptStackTrace()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lbsh/EvalError;->getRawMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0
.end method

.method public getNode()Lbsh/Node;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRawMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/EvalError;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScriptStackTrace()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/EvalError;->callstack:Lbsh/CallStack;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "<Unknown>"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lbsh/CallStack;->copy()Lbsh/CallStack;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, ""

    .line 13
    .line 14
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-lez v2, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lbsh/NameSpace;->getNode()Lbsh/Node;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-boolean v4, v2, Lbsh/NameSpace;->isMethod:Z

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    const-string v4, "\nCalled from method: "

    .line 33
    .line 34
    invoke-static {v1, v4}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v2}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    const-string v2, "\n\tat "

    .line 52
    .line 53
    invoke-static {v1, v2}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v3}, Lbsh/Node;->getText()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v2, " ("

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-interface {v3}, Lbsh/Node;->getSourceFile()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v2, ":"

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-interface {v3}, Lbsh/Node;->getLineNumber()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v2, ")"

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    return-object v1
.end method

.method public prependMessage(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lbsh/EvalError;->message:Ljava/lang/String;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iput-object p1, p0, Lbsh/EvalError;->message:Ljava/lang/String;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    const-string v0, " : "

    .line 12
    .line 13
    invoke-static {p1, v0}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lbsh/EvalError;->message:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lbsh/EvalError;->message:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public reThrow(Ljava/lang/String;)Lbsh/EvalError;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbsh/EvalError;->prependMessage(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public setNode(Lbsh/Node;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/EvalError;->node:Lbsh/Node;

    .line 2
    .line 3
    return-void
.end method
