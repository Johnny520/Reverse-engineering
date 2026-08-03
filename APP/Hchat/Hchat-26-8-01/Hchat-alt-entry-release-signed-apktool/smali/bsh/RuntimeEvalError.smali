.class public Lbsh/RuntimeEvalError;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private error:Lbsh/EvalError;


# direct methods
.method public constructor <init>(Lbsh/EvalError;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 15
    iput-object p1, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 13
    new-instance v0, Lbsh/EvalError;

    invoke-direct {v0, p1, p2, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    iput-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p4, Lbsh/EvalError;

    .line 5
    .line 6
    invoke-direct {p4, p1, p2, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 7
    .line 8
    .line 9
    iput-object p4, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getErrorLineNumber()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/EvalError;->getErrorLineNumber()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getErrorSourceFile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/EvalError;->getErrorSourceFile()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getErrorText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/EvalError;->getErrorText()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/EvalError;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getNode()Lbsh/Node;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/EvalError;->getNode()Lbsh/Node;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getRawMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/EvalError;->getRawMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getScriptStackTrace()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/EvalError;->getScriptStackTrace()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public reThrow(Ljava/lang/String;)Lbsh/EvalError;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public setNode(Lbsh/Node;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/EvalError;->setNode(Lbsh/Node;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
